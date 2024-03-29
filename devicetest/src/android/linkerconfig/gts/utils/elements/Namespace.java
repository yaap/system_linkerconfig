/*
 * Copyright (C) 2020 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.linkerconfig.gts.utils.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Namespace {
    public String name;
    public boolean isVisible;
    public boolean isIsolated;

    public List<String> searchPaths = new ArrayList<>();
    public List<String> permittedPaths = new ArrayList<>();
    public Map<String, Link> links = new HashMap<>();
}

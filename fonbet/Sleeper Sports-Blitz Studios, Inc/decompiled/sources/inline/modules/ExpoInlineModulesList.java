package inline.modules;

import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.services.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ExpoInlineModulesList implements ModulesProvider {
    @Override // expo.modules.kotlin.ModulesProvider
    public Map<Class<? extends Module>, String> getModulesMap() {
        return Collections.EMPTY_MAP;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Service>> getServices() {
        return new ArrayList();
    }
}

package nc;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec;
import com.reactnativecommunity.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class h extends TurboReactPackage {
    public static /* synthetic */ Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNCNetInfoSpec.NAME, new ReactModuleInfo(NativeRNCNetInfoSpec.NAME, NativeRNCNetInfoSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNCNetInfoSpec.NAME)) {
            return new NetInfoModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: nc.g
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return h.a();
            }
        };
    }
}

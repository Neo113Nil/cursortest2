package yc;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.seonreactnativemobilewrapper.SeonReactNativeMobileWrapperModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6875c extends TurboReactPackage {

    /* renamed from: yc.c$a */
    public class a implements ReactModuleInfoProvider {
        public a() {
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map getReactModuleInfos() {
            HashMap hashMap = new HashMap();
            hashMap.put("SeonReactNativeMobileWrapperSpec", new ReactModuleInfo("SeonReactNativeMobileWrapperSpec", "SeonReactNativeMobileWrapperSpec", false, false, false, true));
            return hashMap;
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("SeonReactNativeMobileWrapperSpec")) {
            return new SeonReactNativeMobileWrapperModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new a();
    }
}

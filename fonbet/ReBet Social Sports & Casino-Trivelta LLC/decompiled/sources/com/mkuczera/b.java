package com.mkuczera;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b extends TurboReactPackage {

    public class a implements ReactModuleInfoProvider {
        public a() {
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map getReactModuleInfos() {
            HashMap hashMap = new HashMap();
            hashMap.put(NativeHapticFeedbackSpec.NAME, new ReactModuleInfo(NativeHapticFeedbackSpec.NAME, NativeHapticFeedbackSpec.NAME, false, false, true, false, true));
            return hashMap;
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeHapticFeedbackSpec.NAME)) {
            return new RNReactNativeHapticFeedbackModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new a();
    }
}

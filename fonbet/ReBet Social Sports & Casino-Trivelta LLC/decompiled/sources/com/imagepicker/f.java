package com.imagepicker;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class f extends TurboReactPackage {
    public static /* synthetic */ Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeImagePickerSpec.NAME, new ReactModuleInfo(NativeImagePickerSpec.NAME, NativeImagePickerSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeImagePickerSpec.NAME)) {
            return new ImagePickerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.imagepicker.e
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return f.a();
            }
        };
    }
}

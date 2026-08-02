package com.swmansion.worklets;

import androidx.annotation.NonNull;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class WorkletsPackage extends BaseReactPackage implements ReactPackage {
    public static /* synthetic */ Map a(Map map) {
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(@NonNull String str, @NonNull ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeWorkletsModuleSpec.NAME)) {
            return new WorkletsModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NonNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final HashMap hashMap = new HashMap();
        Class cls = new Class[]{WorkletsModule.class}[0];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        Objects.requireNonNull(reactModule);
        ReactModule reactModule2 = reactModule;
        hashMap.put(reactModule2.name(), new ReactModuleInfo(reactModule2.name(), cls.getName(), reactModule2.canOverrideExistingModule(), reactModule2.needsEagerInit(), reactModule2.isCxxModule(), true));
        return new ReactModuleInfoProvider() { // from class: com.swmansion.worklets.c
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return WorkletsPackage.a(hashMap);
            }
        };
    }
}

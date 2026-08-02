package io.sentry.react;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class x extends TurboReactPackage {
    public static /* synthetic */ Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNSentrySpec.NAME, new ReactModuleInfo(NativeRNSentrySpec.NAME, NativeRNSentrySpec.NAME, false, false, true, false, true));
        hashMap.put("RNSentryReplayMask", new ReactModuleInfo("RNSentryReplayMask", "RNSentryReplayMask", false, false, false, false, true));
        hashMap.put("RNSentryReplayUnmask", new ReactModuleInfo("RNSentryReplayUnmask", "RNSentryReplayUnmask", false, false, false, false, true));
        return hashMap;
    }

    public final NativeModule b(String str) {
        if ("RNSentryReplayMask".equals(str)) {
            return new RNSentryReplayMaskManager();
        }
        if ("RNSentryReplayUnmask".equals(str)) {
            return new RNSentryReplayUnmaskManager();
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        List a10;
        a10 = v0.g.a(new Object[]{new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()});
        return a10;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return NativeRNSentrySpec.NAME.equals(str) ? new RNSentryModule(reactApplicationContext) : b(str);
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: io.sentry.react.w
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return x.a();
            }
        };
    }
}

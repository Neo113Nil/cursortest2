package ig;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQMobilistenCore;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ig.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4547c extends TurboReactPackage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNZohoSalesIQMobilistenCore", new ReactModuleInfo("RNZohoSalesIQMobilistenCore", "RNZohoSalesIQMobilistenCore", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "RNZohoSalesIQMobilistenCore")) {
            return new RNZohoSalesIQMobilistenCore(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: ig.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map reactModuleInfoProvider$lambda$0;
                reactModuleInfoProvider$lambda$0 = C4547c.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$0;
            }
        };
    }
}

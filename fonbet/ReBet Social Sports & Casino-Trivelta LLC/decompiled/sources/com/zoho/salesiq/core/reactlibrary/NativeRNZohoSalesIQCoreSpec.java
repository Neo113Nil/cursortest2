package com.zoho.salesiq.core.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes4.dex */
public abstract class NativeRNZohoSalesIQCoreSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNZohoSalesIQMobilistenCore";

    public NativeRNZohoSalesIQCoreSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNZohoSalesIQMobilistenCore";
    }
}

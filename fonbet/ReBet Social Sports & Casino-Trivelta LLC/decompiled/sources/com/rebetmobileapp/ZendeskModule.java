package com.rebetmobileapp;

import Dj.q;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;

/* loaded from: classes4.dex */
public class ZendeskModule extends ReactContextBaseJavaModule {
    public ZendeskModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void createIdentity(String str, String str2) {
        try {
            new AnonymousIdentity.Builder().withEmailIdentifier(str2).withNameIdentifier(str).build();
            Zendesk.INSTANCE.setIdentity(new AnonymousIdentity());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ZendeskModule";
    }

    @ReactMethod
    public void initializeSDK(String str, String str2, String str3) {
        Zendesk.INSTANCE.init(getReactApplicationContext(), str3, str, str2);
    }

    @ReactMethod
    public void startChat() {
        Log.e("START", "STart");
        try {
            q.e(Zendesk.INSTANCE).c(getCurrentActivity(), "VIP SDK Support Phone", null);
        } catch (Exception e10) {
            Log.e("START", e10.getMessage());
            e10.printStackTrace();
        }
    }
}

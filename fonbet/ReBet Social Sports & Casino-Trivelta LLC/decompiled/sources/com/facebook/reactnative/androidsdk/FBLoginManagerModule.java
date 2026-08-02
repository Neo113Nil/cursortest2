package com.facebook.reactnative.androidsdk;

import android.app.Activity;
import com.facebook.AccessToken;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import d8.EnumC4028d;
import d8.n;
import d8.w;
import d8.x;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import t8.AbstractC6450d;
import t8.AbstractC6451e;
import t8.C6447a;

@ReactModule(name = FBLoginManagerModule.NAME)
/* loaded from: classes2.dex */
public class FBLoginManagerModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBLoginManager";

    public class a extends AbstractC6450d {
        public a(Promise promise) {
            super(promise);
        }

        @Override // g6.InterfaceC4354n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(x xVar) {
            if (this.f65775a != null) {
                AccessToken.U(xVar.a());
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("isCancelled", false);
                createMap.putArray("grantedPermissions", FBLoginManagerModule.this.setToWritableArray(xVar.c()));
                createMap.putArray("declinedPermissions", FBLoginManagerModule.this.setToWritableArray(xVar.b()));
                this.f65775a.resolve(createMap);
                this.f65775a = null;
            }
        }
    }

    public FBLoginManagerModule(ReactApplicationContext reactApplicationContext, C6447a c6447a) {
        super(reactApplicationContext, c6447a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableArray setToWritableArray(Set<String> set) {
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        return createArray;
    }

    @ReactMethod
    public void getDefaultAudience(Promise promise) {
        promise.resolve(w.o().m().name().toLowerCase(Locale.ROOT));
    }

    @ReactMethod
    public void getLoginBehavior(Promise promise) {
        promise.resolve(w.o().p().name().toLowerCase(Locale.ROOT));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void logInWithPermissions(ReadableArray readableArray, Promise promise) {
        w o10 = w.o();
        o10.C(getCallbackManager(), new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            o10.t(currentActivity, AbstractC6451e.p(readableArray));
        }
    }

    @ReactMethod
    public void logOut() {
        w.o().x();
    }

    @ReactMethod
    public void reauthorizeDataAccess(Promise promise) {
        w o10 = w.o();
        o10.C(getCallbackManager(), new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            o10.B(currentActivity);
        }
    }

    @ReactMethod
    public void setDefaultAudience(String str) {
        w.o().G(EnumC4028d.valueOf(str.toUpperCase(Locale.ROOT)));
    }

    @ReactMethod
    public void setLoginBehavior(String str) {
        w.o().J(n.valueOf(str.toUpperCase(Locale.ROOT)));
    }
}

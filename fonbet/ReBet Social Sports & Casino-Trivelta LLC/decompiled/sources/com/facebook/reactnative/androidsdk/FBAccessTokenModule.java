package com.facebook.reactnative.androidsdk;

import com.facebook.AccessToken;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import g6.AbstractC4348h;
import g6.C4357q;
import t8.AbstractC6451e;

@ReactModule(name = FBAccessTokenModule.NAME)
/* loaded from: classes2.dex */
public class FBAccessTokenModule extends ReactContextBaseJavaModule {
    public static final String CHANGE_EVENT_NAME = "fbsdk.accessTokenDidChange";
    public static final String NAME = "FBAccessToken";
    private AbstractC4348h accessTokenTracker;
    private final ReactApplicationContext mReactContext;

    public class a extends AbstractC4348h {
        public a() {
        }

        @Override // g6.AbstractC4348h
        public void d(AccessToken accessToken, AccessToken accessToken2) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) FBAccessTokenModule.this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(FBAccessTokenModule.CHANGE_EVENT_NAME, accessToken2 == null ? null : AbstractC6451e.a(accessToken2));
            } catch (RuntimeException unused) {
            }
        }
    }

    public class b implements AccessToken.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f31435a;

        public b(Promise promise) {
            this.f31435a = promise;
        }

        @Override // com.facebook.AccessToken.a
        public void a(C4357q c4357q) {
            this.f31435a.reject(c4357q);
        }

        @Override // com.facebook.AccessToken.a
        public void b(AccessToken accessToken) {
            this.f31435a.resolve(AbstractC6451e.a(accessToken));
        }
    }

    public FBAccessTokenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getCurrentAccessToken(Callback callback) {
        callback.invoke(AccessToken.d() == null ? null : AbstractC6451e.a(AccessToken.d()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.accessTokenTracker = new a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        AbstractC4348h abstractC4348h = this.accessTokenTracker;
        if (abstractC4348h != null) {
            abstractC4348h.f();
        }
    }

    @ReactMethod
    public void refreshCurrentAccessTokenAsync(Promise promise) {
        AccessToken.O(new b(promise));
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setCurrentAccessToken(ReadableMap readableMap) {
        AccessToken.U(AbstractC6451e.c(readableMap));
    }
}

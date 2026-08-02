package com.facebook.reactnative.androidsdk;

import T7.Y;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import u6.C6526a;

@ReactModule(name = FBAppLinkModule.NAME)
/* loaded from: classes2.dex */
public class FBAppLinkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBAppLink";
    private final ReactApplicationContext mReactContext;

    public class a implements C6526a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f31437a;

        public a(Promise promise) {
            this.f31437a = promise;
        }

        @Override // u6.C6526a.b
        public void a(C6526a c6526a) {
            if (c6526a == null) {
                this.f31437a.resolve(null);
            } else {
                this.f31437a.resolve(c6526a.g().toString());
            }
        }
    }

    public FBAppLinkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private C6526a.b createCompletionHandler(Promise promise) {
        return new a(promise);
    }

    @ReactMethod
    public void fetchDeferredAppLink(Promise promise) {
        try {
            C6526a.d(this.mReactContext.getApplicationContext(), createCompletionHandler(promise));
        } catch (Exception e10) {
            promise.resolve(null);
            Y.l0(getName(), "Received error while fetching deferred app link", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}

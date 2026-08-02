package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Locale;
import t8.AbstractC6450d;
import t8.AbstractC6451e;
import t8.C6447a;
import u8.C6530b;
import w8.C6725e;

@ReactModule(name = FBShareDialogModule.NAME)
/* loaded from: classes2.dex */
public class FBShareDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBShareDialog";
    private C6725e.d mShareDialogMode;
    private boolean mShouldFailOnError;

    public class a extends AbstractC6450d {
        public a(Promise promise) {
            super(promise);
        }

        @Override // g6.InterfaceC4354n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C6530b c6530b) {
            if (this.f65775a != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("postId", c6530b.a());
                this.f65775a.resolve(createMap);
                this.f65775a = null;
            }
        }
    }

    public FBShareDialogModule(ReactApplicationContext reactApplicationContext, C6447a c6447a) {
        super(reactApplicationContext, c6447a);
    }

    @ReactMethod
    public void canShow(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() == null) {
            promise.reject("No current activity.");
        } else {
            C6725e c6725e = new C6725e(getCurrentActivity());
            promise.resolve(Boolean.valueOf(this.mShareDialogMode == null ? c6725e.b(AbstractC6451e.e(readableMap)) : c6725e.q(AbstractC6451e.e(readableMap), this.mShareDialogMode)));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setMode(String str) {
        this.mShareDialogMode = C6725e.d.valueOf(str.toUpperCase(Locale.ROOT));
    }

    @ReactMethod
    public void setShouldFailOnError(boolean z10) {
        this.mShouldFailOnError = z10;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() == null) {
            promise.reject("No current activity.");
            return;
        }
        C6725e c6725e = new C6725e(getCurrentActivity());
        c6725e.j(getCallbackManager(), new a(promise));
        c6725e.t(this.mShouldFailOnError);
        if (this.mShareDialogMode != null) {
            c6725e.u(AbstractC6451e.e(readableMap), this.mShareDialogMode);
        } else {
            c6725e.m(AbstractC6451e.e(readableMap));
        }
    }
}

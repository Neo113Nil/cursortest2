package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.share.model.ShareContent;
import t8.AbstractC6450d;
import t8.AbstractC6451e;
import t8.C6447a;
import u8.C6530b;
import w8.C6721a;

@ReactModule(name = FBMessageDialogModule.NAME)
/* loaded from: classes2.dex */
public class FBMessageDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBMessageDialog";
    private boolean mShouldFailOnDataError;

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

    public FBMessageDialogModule(ReactApplicationContext reactApplicationContext, C6447a c6447a) {
        super(reactApplicationContext, c6447a);
    }

    @ReactMethod
    public void canShow(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() == null) {
            promise.reject("No current activity.");
        } else {
            promise.resolve(Boolean.valueOf(new C6721a(getCurrentActivity()).b(AbstractC6451e.e(readableMap))));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setShouldFailOnDataError(boolean z10) {
        this.mShouldFailOnDataError = z10;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() == null) {
            promise.reject("No current activity.");
            return;
        }
        ShareContent e10 = AbstractC6451e.e(readableMap);
        C6721a c6721a = new C6721a(getCurrentActivity());
        c6721a.t(this.mShouldFailOnDataError);
        c6721a.j(getCallbackManager(), new a(promise));
        c6721a.m(e10);
    }
}

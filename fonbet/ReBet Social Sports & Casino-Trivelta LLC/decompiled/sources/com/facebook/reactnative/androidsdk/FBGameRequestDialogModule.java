package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.share.model.GameRequestContent;
import r7.C6210a;
import t8.AbstractC6450d;
import t8.AbstractC6451e;
import t8.C6447a;

@ReactModule(name = FBGameRequestDialogModule.NAME)
/* loaded from: classes2.dex */
public class FBGameRequestDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBGameRequestDialog";

    public class a extends AbstractC6450d {
        public a(Promise promise) {
            super(promise);
        }

        @Override // g6.InterfaceC4354n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C6210a.f fVar) {
            if (this.f65775a != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("requestId", fVar.a());
                createMap.putArray("to", AbstractC6451e.l(fVar.b()));
                this.f65775a.resolve(createMap);
                this.f65775a = null;
            }
        }
    }

    public FBGameRequestDialogModule(ReactApplicationContext reactApplicationContext, C6447a c6447a) {
        super(reactApplicationContext, c6447a);
    }

    @ReactMethod
    public void canShow(Promise promise) {
        promise.resolve(Boolean.valueOf(C6210a.r()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() == null) {
            promise.reject("No current activity.");
            return;
        }
        C6210a c6210a = new C6210a(getCurrentActivity());
        GameRequestContent d10 = AbstractC6451e.d(readableMap);
        c6210a.j(getCallbackManager(), new a(promise));
        c6210a.m(d10);
    }
}

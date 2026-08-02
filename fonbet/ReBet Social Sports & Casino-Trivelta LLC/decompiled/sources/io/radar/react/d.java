package io.radar.react;

import Gh.D;
import android.content.Context;
import android.util.Log;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.radar.sdk.b1;

/* loaded from: classes3.dex */
public class d extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public ReactNativeHost f49595a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49596b = false;

    @Override // io.radar.sdk.b1
    public void a(Context context, D d10) {
        try {
            this.f49595a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            b("token", c.d(d10.f()));
        } catch (Exception e10) {
            Log.e("RNRadarVerifiedReceiver", "Exception", e10);
        }
    }

    public final void b(String str, Object obj) {
        ReactContext currentReactContext = this.f49595a.getReactInstanceManager().getCurrentReactContext();
        if (currentReactContext == null || !this.f49596b) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }
}

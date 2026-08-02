package io.radar.react;

import Gh.C;
import Gh.h;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.radar.sdk.C4589c;
import io.radar.sdk.K0;

/* loaded from: classes3.dex */
public class b extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public ReactNativeHost f49593a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49594b = false;

    @Override // io.radar.sdk.K0
    public void a(Context context, Location location, boolean z10, C4589c.EnumC4597i enumC4597i) {
        try {
            this.f49593a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("location", c.d(C4589c.U(location)));
            createMap.putBoolean("stopped", z10);
            createMap.putString("source", enumC4597i.toString());
            f("clientLocation", createMap);
        } catch (Exception e10) {
            Log.e("RNRadarReceiver", "Exception", e10);
        }
    }

    @Override // io.radar.sdk.K0
    public void b(Context context, C4589c.EnumC4607s enumC4607s) {
        try {
            this.f49593a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            f("error", enumC4607s.toString());
        } catch (Exception e10) {
            Log.e("RNRadarReceiver", "Exception", e10);
        }
    }

    @Override // io.radar.sdk.K0
    public void c(Context context, h[] hVarArr, C c10) {
        try {
            this.f49593a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            WritableMap createMap = Arguments.createMap();
            createMap.putArray("events", c.a(h.h(hVarArr)));
            if (c10 != null) {
                createMap.putMap("user", c.d(c10.k()));
            }
            f("events", createMap);
        } catch (Exception e10) {
            Log.e("RNRadarReceiver", "Exception", e10);
        }
    }

    @Override // io.radar.sdk.K0
    public void d(Context context, Location location, C c10) {
        try {
            this.f49593a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("location", c.d(C4589c.U(location)));
            createMap.putMap("user", c.d(c10.k()));
            f("location", createMap);
        } catch (Exception e10) {
            Log.e("RNRadarReceiver", "Exception", e10);
        }
    }

    @Override // io.radar.sdk.K0
    public void e(Context context, String str) {
        try {
            this.f49593a = ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
            f("log", str);
        } catch (Exception e10) {
            Log.e("RNRadarReceiver", "Exception", e10);
        }
    }

    public final void f(String str, Object obj) {
        ReactContext currentReactContext = this.f49593a.getReactInstanceManager().getCurrentReactContext();
        if (currentReactContext == null || !this.f49594b) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }
}

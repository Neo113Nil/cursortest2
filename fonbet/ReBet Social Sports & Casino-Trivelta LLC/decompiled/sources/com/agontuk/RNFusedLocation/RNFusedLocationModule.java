package com.agontuk.RNFusedLocation;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RNFusedLocationModule extends ReactContextBaseJavaModule implements ActivityEventListener, c {
    public static final String TAG = "RNFusedLocation";
    private g continuousLocationProvider;
    private final HashMap<g, a> pendingRequests;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Callback f28286a;

        /* renamed from: b, reason: collision with root package name */
        public final Callback f28287b;

        public a(Callback callback, Callback callback2) {
            this.f28286a = callback;
            this.f28287b = callback2;
        }
    }

    public RNFusedLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.pendingRequests = new HashMap<>();
        Log.i(TAG, "RNFusedLocation initialized");
    }

    private g createLocationProvider(boolean z10) {
        ReactApplicationContext context = getContext();
        return (z10 || !i.e(context)) ? new e(context, this) : new com.agontuk.RNFusedLocation.a(context, this);
    }

    private void emitEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private ReactApplicationContext getContext() {
        return getReactApplicationContext();
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        if (!i.d(getContext())) {
            callback2.invoke(i.a(d.PERMISSION_DENIED, null));
            return;
        }
        f a10 = f.a(readableMap);
        g createLocationProvider = createLocationProvider(a10.i());
        this.pendingRequests.put(createLocationProvider, new a(callback, callback2));
        createLocationProvider.d(a10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        g gVar = this.continuousLocationProvider;
        if (gVar == null || !gVar.c(i10, i11)) {
            Iterator<g> it = this.pendingRequests.keySet().iterator();
            while (it.hasNext() && !it.next().c(i10, i11)) {
            }
        }
    }

    @Override // com.agontuk.RNFusedLocation.c
    public void onLocationChange(g gVar, Location location) {
        WritableMap i10 = i.i(location);
        if (gVar.equals(this.continuousLocationProvider)) {
            emitEvent("geolocationDidChange", i10);
            return;
        }
        a aVar = this.pendingRequests.get(gVar);
        if (aVar != null) {
            aVar.f28286a.invoke(i10);
            this.pendingRequests.remove(gVar);
        }
    }

    @Override // com.agontuk.RNFusedLocation.c
    public void onLocationError(g gVar, d dVar, String str) {
        WritableMap a10 = i.a(dVar, str);
        if (gVar.equals(this.continuousLocationProvider)) {
            emitEvent("geolocationError", a10);
            return;
        }
        a aVar = this.pendingRequests.get(gVar);
        if (aVar != null) {
            aVar.f28287b.invoke(a10);
            this.pendingRequests.remove(gVar);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!i.d(getContext())) {
            emitEvent("geolocationError", i.a(d.PERMISSION_DENIED, null));
            return;
        }
        f a10 = f.a(readableMap);
        if (this.continuousLocationProvider == null) {
            this.continuousLocationProvider = createLocationProvider(a10.i());
        }
        this.continuousLocationProvider.a(a10);
    }

    @ReactMethod
    public void stopObserving() {
        g gVar = this.continuousLocationProvider;
        if (gVar != null) {
            gVar.b();
            this.continuousLocationProvider = null;
        }
    }
}

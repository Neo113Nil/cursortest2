package com.dylanvann.fastimage;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes2.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "FastImageView";

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f30180a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f30181b;

        public a(ReadableArray readableArray, Activity activity) {
            this.f30180a = readableArray;
            this.f30181b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f30180a.size(); i10++) {
                ReadableMap map = this.f30180a.getMap(i10);
                f c10 = g.c(this.f30181b, map);
                com.bumptech.glide.c.u(this.f30181b.getApplicationContext()).v(c10.d() ? c10.getSource() : c10.get_isResource() ? c10.getUri() : c10.a()).a(g.d(this.f30181b, c10, map)).E0();
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f30183a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f30184b;

        public b(Activity activity, Promise promise) {
            this.f30183a = activity;
            this.f30184b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bumptech.glide.c.d(this.f30183a.getApplicationContext()).c();
            this.f30184b.resolve(null);
        }
    }

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            com.bumptech.glide.c.d(currentActivity.getApplicationContext()).b();
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new b(currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(readableArray, currentActivity));
    }
}

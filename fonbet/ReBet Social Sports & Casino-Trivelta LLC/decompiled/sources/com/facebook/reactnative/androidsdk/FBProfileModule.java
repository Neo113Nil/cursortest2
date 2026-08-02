package com.facebook.reactnative.androidsdk;

import androidx.annotation.NonNull;
import com.facebook.Profile;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import g6.Q;
import java.util.Timer;
import java.util.TimerTask;
import t8.AbstractC6451e;

@ReactModule(name = FBProfileModule.NAME)
/* loaded from: classes2.dex */
public class FBProfileModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBProfile";
    private Q mProfileTracker;

    public class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Timer f31448a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f31449b;

        public a(Timer timer, Callback callback) {
            this.f31448a = timer;
            this.f31449b = callback;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f31448a.cancel();
            this.f31449b.invoke(null);
        }
    }

    public class b extends Q {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Timer f31451d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Callback f31452e;

        public b(Timer timer, Callback callback) {
            this.f31451d = timer;
            this.f31452e = callback;
        }

        @Override // g6.Q
        public void b(Profile profile, Profile profile2) {
            this.f31451d.cancel();
            FBProfileModule.this.mProfileTracker.d();
            this.f31452e.invoke(AbstractC6451e.m(profile2));
        }
    }

    public FBProfileModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getCurrentProfile(Callback callback) {
        if (Profile.b() != null) {
            callback.invoke(AbstractC6451e.m(Profile.b()));
            return;
        }
        Timer timer = new Timer();
        synchronized (timer) {
            timer.schedule(new a(timer, callback), 30000L);
            this.mProfileTracker = new b(timer, callback);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }
}

package com.socure.idplus.device;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.socure.idplus.device.callback.SigmaDeviceCallback;
import com.socure.idplus.device.internal.j;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f840a = new WeakHashMap();
    public int b;
    public boolean c;
    public boolean d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        SigmaDeviceOptions sigmaDeviceOptions;
        SigmaDeviceCallback sigmaDeviceCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityCreated " + activity);
        if (this.b <= 0) {
            SigmaDevice sigmaDevice = SigmaDevice.INSTANCE;
            if (sigmaDevice.getSocureInternal$device_risk_sdk_release() == null) {
                this.b = 0;
                this.c = false;
                this.d = false;
                str = SigmaDevice.c;
                sigmaDeviceOptions = SigmaDevice.e;
                sigmaDeviceCallback = SigmaDevice.f;
                if (sigmaDeviceCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sigmaDeviceCallback");
                    sigmaDeviceCallback = null;
                }
                sigmaDevice.setSocureInternal$device_risk_sdk_release(new j(activity, str, sigmaDeviceOptions, sigmaDeviceCallback));
            }
        }
        if (this.f840a.containsKey(activity)) {
            return;
        }
        this.f840a.put(activity, Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityDestroyed " + activity);
        if (this.f840a.containsKey(activity)) {
            this.f840a.remove(activity);
        }
        if (this.b > 0 || !this.f840a.isEmpty()) {
            return;
        }
        this.b = 0;
        this.c = false;
        this.d = false;
        SigmaDevice sigmaDevice = SigmaDevice.INSTANCE;
        com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release = sigmaDevice.getSocureInternal$device_risk_sdk_release();
        if (socureInternal$device_risk_sdk_release != null) {
            ((j) socureInternal$device_risk_sdk_release).b();
        }
        sigmaDevice.setSocureInternal$device_risk_sdk_release(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityPaused " + activity);
        com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release = SigmaDevice.INSTANCE.getSocureInternal$device_risk_sdk_release();
        if (socureInternal$device_risk_sdk_release != null) {
            ((j) socureInternal$device_risk_sdk_release).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityResumed " + activity);
        com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release = SigmaDevice.INSTANCE.getSocureInternal$device_risk_sdk_release();
        if (socureInternal$device_risk_sdk_release != null) {
            ((j) socureInternal$device_risk_sdk_release).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivitySaveInstanceState " + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityStarted " + activity);
        if (this.f840a.containsKey(activity)) {
            if (!this.d) {
                this.b++;
            }
            if (this.b == 1 && this.c) {
                com.socure.idplus.device.internal.logger.b.a("SigmaDevice", "App foregrounded");
                com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release = SigmaDevice.INSTANCE.getSocureInternal$device_risk_sdk_release();
                if (socureInternal$device_risk_sdk_release != null) {
                    ((j) socureInternal$device_risk_sdk_release).c();
                }
            }
            this.c = false;
            com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release2 = SigmaDevice.INSTANCE.getSocureInternal$device_risk_sdk_release();
            if (socureInternal$device_risk_sdk_release2 != null) {
                ((j) socureInternal$device_risk_sdk_release2).c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f840a.containsKey(activity)) {
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.d = isChangingConfigurations;
            if (!isChangingConfigurations) {
                this.b--;
            }
            SigmaDevice sigmaDevice = SigmaDevice.INSTANCE;
            com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release = sigmaDevice.getSocureInternal$device_risk_sdk_release();
            if (socureInternal$device_risk_sdk_release != null) {
                ((j) socureInternal$device_risk_sdk_release).d(activity);
            }
            if (this.b <= 0) {
                com.socure.idplus.device.internal.logger.b.a("SigmaDevice", "App backgrounded");
                com.socure.idplus.device.internal.a socureInternal$device_risk_sdk_release2 = sigmaDevice.getSocureInternal$device_risk_sdk_release();
                if (socureInternal$device_risk_sdk_release2 != null) {
                    ((j) socureInternal$device_risk_sdk_release2).a();
                }
                this.c = true;
            }
        }
        com.socure.idplus.device.internal.logger.b.a("SocureLifecycleCallbacks", "onActivityStopped " + activity);
    }
}

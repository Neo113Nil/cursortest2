package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.b701;
import xsna.cf01;
import xsna.exc0;
import xsna.ltz0;
import xsna.uir;
import xsna.vhr;
import xsna.x101;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final zzef a;
    public ltz0 b;

    public FirebaseAnalytics(zzef zzefVar) {
        exc0.i(zzefVar);
        this.a = zzefVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Nullable
    @Keep
    public static cf01 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new b701(zzg);
    }

    @NonNull
    public final Task<String> a() {
        ltz0 ltz0Var;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.b == null) {
                        this.b = new ltz0(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    ltz0Var = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return Tasks.call(ltz0Var, new x101(this));
        } catch (RuntimeException e) {
            this.a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = a.m;
            return (String) Tasks.await(((a) vhr.d().b(uir.class)).getId(), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable String str, @Nullable String str2) {
        this.a.zzH(activity, str, str2);
    }
}

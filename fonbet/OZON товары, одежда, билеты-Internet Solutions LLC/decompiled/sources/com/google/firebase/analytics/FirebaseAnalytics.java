package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.e;
import z8.InterfaceC10999b;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f59486c;

    /* renamed from: a, reason: collision with root package name */
    private final zzee f59487a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f59488b;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f59487a = zzeeVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f59486c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f59486c == null) {
                        f59486c = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f59486c;
    }

    @Keep
    public static zziq getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new c(zzg);
    }

    @NonNull
    public final Task<String> a() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.f59488b == null) {
                        this.f59488b = new a(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    executorService = this.f59488b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Tasks.call(executorService, new b(this));
        } catch (RuntimeException e11) {
            this.f59487a.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e11);
        }
    }

    public final void b(boolean z11) {
        this.f59487a.zzK(Boolean.valueOf(z11));
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            int i11 = com.google.firebase.installations.c.f59559n;
            e j11 = e.j();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((com.google.firebase.installations.c) j11.h(InterfaceC10999b.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f59487a.zzG(activity, str, str2);
    }
}

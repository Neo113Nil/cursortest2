package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b9.d;
import b9.e;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.zzdf;
import g6.v;
import h8.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.a;
import s7.f2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f6052b;

    /* renamed from: a, reason: collision with root package name */
    public final j1 f6053a;

    public FirebaseAnalytics(j1 j1Var) {
        v.h(j1Var);
        this.f6053a = j1Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f6052b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f6052b == null) {
                        f6052b = new FirebaseAnalytics(j1.e(context, null));
                    }
                } finally {
                }
            }
        }
        return f6052b;
    }

    @Keep
    public static f2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        j1 e7 = j1.e(context, bundle);
        if (e7 == null) {
            return null;
        }
        return new a(e7);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f3099m;
            return (String) d5.b(((d) g.c().b(e.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        zzdf c2 = zzdf.c(activity);
        j1 j1Var = this.f6053a;
        j1Var.getClass();
        j1Var.c(new y0(j1Var, c2, str, str2));
    }
}

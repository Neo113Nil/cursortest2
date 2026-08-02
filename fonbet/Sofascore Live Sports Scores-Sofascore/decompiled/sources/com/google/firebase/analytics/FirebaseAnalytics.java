package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Tasks;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.k48;
import defpackage.l48;
import defpackage.r38;
import defpackage.wxn;
import defpackage.yhk;
import defpackage.z3n;
import defpackage.zyn;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final zzez a;
    public z3n b;

    public FirebaseAnalytics(zzez zzezVar) {
        Preconditions.i(zzezVar);
        this.a = zzezVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(zzez.f(context, null));
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Nullable
    @Keep
    public static zzlk getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzez f = zzez.f(context, bundle);
        if (f == null) {
            return null;
        }
        return new wxn(f);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = k48.l;
            return (String) Tasks.await(((k48) r38.c().b(l48.class)).c(), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            yhk.q(e);
            return null;
        } catch (ExecutionException e2) {
            yhk.q(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable String str, @Nullable String str2) {
        zzdd Y0 = zzdd.Y0(activity);
        zzez zzezVar = this.a;
        zzezVar.getClass();
        zzezVar.c(new zyn(zzezVar, Y0, str, str2));
    }
}

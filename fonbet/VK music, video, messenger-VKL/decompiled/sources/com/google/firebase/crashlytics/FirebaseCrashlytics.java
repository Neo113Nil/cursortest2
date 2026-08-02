package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.Map;
import xsna.a5k;
import xsna.d5k;
import xsna.lnk;
import xsna.u4k;
import xsna.vhr;
import xsna.vy4;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {
    public final d5k a;

    public FirebaseCrashlytics(@NonNull d5k d5kVar) {
        this.a = d5kVar;
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) vhr.d().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        u4k u4kVar = this.a.h;
        return !u4kVar.r.compareAndSet(false, true) ? Tasks.forResult(Boolean.FALSE) : u4kVar.o.getTask();
    }

    public void deleteUnsentReports() {
        u4k u4kVar = this.a.h;
        u4kVar.p.trySetResult(Boolean.FALSE);
        u4kVar.q.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.g;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.a.b.b();
    }

    public void log(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        d5k d5kVar = this.a;
        d5kVar.p.a.a(new a5k(d5kVar, currentTimeMillis - d5kVar.d, str));
    }

    public void recordException(@NonNull Throwable th) {
        if (th == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        d5k d5kVar = this.a;
        d5kVar.p.a.a(new vy4(d5kVar, th));
    }

    public void sendUnsentReports() {
        u4k u4kVar = this.a.h;
        u4kVar.p.trySetResult(Boolean.TRUE);
        u4kVar.q.getTask();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.d(Boolean.valueOf(z));
    }

    public void setCustomKey(@NonNull String str, boolean z) {
        this.a.e(str, Boolean.toString(z));
    }

    public void setCustomKeys(@NonNull lnk lnkVar) {
        throw null;
    }

    public void setUserId(@NonNull final String str) {
        final d5k d5kVar = this.a;
        d5kVar.p.a.a(new Runnable() { // from class: xsna.x4k
            @Override // java.lang.Runnable
            public final void run() {
                d5k d5kVar2 = d5k.this;
                String str2 = str;
                alq0 alq0Var = d5kVar2.h.d;
                alq0Var.getClass();
                String a = zhy.a(1024, str2);
                synchronized (alq0Var.g) {
                    try {
                        String reference = alq0Var.g.getReference();
                        if (a == null ? reference == null : a.equals(reference)) {
                            return;
                        }
                        alq0Var.g.set(a, true);
                        alq0Var.b.b.a(new jgl0(alq0Var, 2));
                    } finally {
                    }
                }
            }
        });
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.a.d(bool);
    }

    public void setCustomKey(@NonNull String str, double d) {
        this.a.e(str, Double.toString(d));
    }

    public void recordException(@NonNull Throwable th, @NonNull lnk lnkVar) {
        if (th != null) {
            throw null;
        }
    }

    public void setCustomKey(@NonNull String str, float f) {
        this.a.e(str, Float.toString(f));
    }

    public void setCustomKey(@NonNull String str, int i) {
        this.a.e(str, Integer.toString(i));
    }

    public void setCustomKey(@NonNull String str, long j) {
        this.a.e(str, Long.toString(j));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.a.e(str, str2);
    }
}

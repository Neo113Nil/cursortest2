package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.NonNull;
import xsna.di01;
import xsna.ei01;
import xsna.fi01;
import xsna.k901;
import xsna.mb01;
import xsna.qj01;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
@TargetApi(24)
/* loaded from: classes13.dex */
public final class AppMeasurementJobService extends JobService implements ei01 {
    public fi01 b;

    @Override // xsna.ei01
    @TargetApi(24)
    public final void b(@NonNull JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final fi01 c() {
        if (this.b == null) {
            this.b = new fi01(this);
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        k901 k901Var = mb01.r(c().a, null, null).j;
        mb01.k(k901Var);
        k901Var.q.a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        k901 k901Var = mb01.r(c().a, null, null).j;
        mb01.k(k901Var);
        k901Var.q.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(@NonNull Intent intent) {
        fi01 c = c();
        if (intent == null) {
            c.a().i.a("onRebind called with null intent");
            return;
        }
        c.getClass();
        c.a().q.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull final JobParameters jobParameters) {
        final fi01 c = c();
        final k901 k901Var = mb01.r(c.a, null, null).j;
        mb01.k(k901Var);
        String string = jobParameters.getExtras().getString("action");
        k901Var.q.b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        Runnable runnable = new Runnable() { // from class: xsna.bi01
            @Override // java.lang.Runnable
            public final void run() {
                k901Var.q.a("AppMeasurementJobService processed last upload request.");
                ((ei01) fi01.this.a).b(jobParameters);
            }
        };
        qj01 O = qj01.O(c.a);
        O.d().s(new di01(O, runnable));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        fi01 c = c();
        if (intent == null) {
            c.a().i.a("onUnbind called with null intent");
            return true;
        }
        c.getClass();
        c.a().q.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // xsna.ei01
    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.ei01
    public final void a(@NonNull Intent intent) {
    }
}

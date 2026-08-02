package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import b6.i;
import com.google.android.gms.internal.measurement.j1;
import g6.v;
import io.sentry.android.core.w0;
import j$.util.Objects;
import md.o;
import r7.a;
import s7.b3;
import s7.n0;
import s7.r3;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@TargetApi(g.FORCEINGEST_FIELD_NUMBER)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements b3 {

    /* renamed from: a, reason: collision with root package name */
    public a f5777a;

    @Override // s7.b3
    public final boolean a(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // s7.b3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final a d() {
        if (this.f5777a == null) {
            this.f5777a = new a(8, this);
        }
        return this.f5777a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f22318b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f22318b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            w0.d("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a d10 = d();
        Service service = (Service) d10.f22318b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            v.h(string);
            r3 C = r3.C(service);
            n0 a7 = C.a();
            o oVar = C.f22997l.f22742c;
            a7.f22910n.b(string, "Local AppMeasurementJobService called. action");
            C.b().s(new s7.w0(d10, C, new i(d10, a7, jobParameters, 16)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        v.h(string);
        j1 e7 = j1.e(service, null);
        s7.w0 w0Var = new s7.w0(12, d10, jobParameters, false);
        e7.getClass();
        e7.c(new com.google.android.gms.internal.measurement.w0(e7, w0Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            w0.d("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // s7.b3
    public final void b(Intent intent) {
    }
}

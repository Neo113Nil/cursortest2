package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpg;
import defpackage.jgo;
import defpackage.jyo;
import defpackage.kzn;
import defpackage.vvo;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements zznp {
    public zznt a;

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final zznt d() {
        zznt zzntVar = this.a;
        if (zzntVar != null) {
            return zzntVar;
        }
        zznt zzntVar2 = new zznt(this);
        this.a = zzntVar2;
        return zzntVar2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().a.getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().a.getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        zznt d = d();
        Service service = d.a;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            Preconditions.i(string);
            zzpg C = zzpg.C(service);
            zzgu b = C.b();
            zzae zzaeVar = C.l.c;
            b.o.b(string, "Local AppMeasurementJobService called. action");
            C.d().Z(new vvo(d, C, new jgo(14, d, b, jobParameters)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            Preconditions.i(string);
            zzez f = zzez.f(service, null);
            jyo jyoVar = new jyo(d, jobParameters, false, 2);
            f.getClass();
            f.c(new kzn(f, jyoVar, 1));
        }
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
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void b(Intent intent) {
    }
}

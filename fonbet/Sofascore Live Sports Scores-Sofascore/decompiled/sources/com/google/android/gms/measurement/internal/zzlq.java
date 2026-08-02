package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzin;
import defpackage.yao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlq extends yao {
    public JobScheduler d;

    @Override // defpackage.yao
    public final boolean T() {
        return true;
    }

    public final void U(long j) {
        zzic zzicVar = (zzic) this.b;
        R();
        Q();
        JobScheduler jobScheduler = this.d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(zzicVar.a.getPackageName())).hashCode()) != null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin V = V();
        if (V != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.o.b(V.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        zzgu zzguVar3 = zzicVar.f;
        zzic.m(zzguVar3);
        zzguVar3.o.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(zzicVar.a.getPackageName())).hashCode(), new ComponentName(zzicVar.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.d;
        Preconditions.i(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        zzgu zzguVar4 = zzicVar.f;
        zzic.m(zzguVar4);
        zzguVar4.o.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final zzin V() {
        zzic zzicVar = (zzic) this.b;
        R();
        Q();
        if (this.d == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        Boolean d0 = zzicVar.d.d0("google_analytics_sgtm_upload_enabled");
        return d0 == null ? false : d0.booleanValue() ? zzicVar.q().k >= 119000 ? !zzpp.l0(zzicVar.a) ? zzin.MEASUREMENT_SERVICE_NOT_ENABLED : !zzicVar.o().X() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE : zzin.SDK_TOO_OLD : zzin.NOT_ENABLED_IN_MANIFEST;
    }
}

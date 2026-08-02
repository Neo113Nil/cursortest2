package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzin;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3236d5 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public JobScheduler f33987c;

    public C3236d5(C3298l3 c3298l3) {
        super(c3298l3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final void n() {
        this.f33987c = (JobScheduler) this.f33578a.d().getSystemService("jobscheduler");
    }

    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f33987c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f33578a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin q10 = q();
        if (q10 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            this.f33578a.a().w().b("[sgtm] Not eligible for Scion upload", q10.name());
            return;
        }
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c3298l3.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC3191o.m(this.f33987c)).schedule(new JobInfo.Builder(p(), new ComponentName(c3298l3.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int p() {
        return "measurement-client".concat(String.valueOf(this.f33578a.d().getPackageName())).hashCode();
    }

    public final zzin q() {
        j();
        h();
        if (this.f33987c == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        C3298l3 c3298l3 = this.f33578a;
        if (!c3298l3.w().P()) {
            return zzin.NOT_ENABLED_IN_MANIFEST;
        }
        C3298l3 c3298l32 = this.f33578a;
        return c3298l32.L().u() >= 119000 ? !b7.F(c3298l3.d(), "com.google.android.gms.measurement.AppMeasurementJobService") ? zzin.MEASUREMENT_SERVICE_NOT_ENABLED : !c3298l32.J().y() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE : zzin.SDK_TOO_OLD;
    }
}

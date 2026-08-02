package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcg;
import com.google.android.gms.internal.measurement.zzch;

/* renamed from: com.google.android.gms.measurement.internal.y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3404y6 extends D6 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f34404d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3381w f34405e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f34406f;

    public C3404y6(S6 s62) {
        super(s62);
        this.f34404d = (AlarmManager) this.f33578a.d().getSystemService("alarm");
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f33578a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f34406f == null) {
            this.f34406f = Integer.valueOf("measurement".concat(String.valueOf(this.f33578a.d().getPackageName())).hashCode());
        }
        return this.f34406f.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        AlarmManager alarmManager = this.f34404d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.c();
        Context d10 = c3298l3.d();
        if (!b7.j0(d10)) {
            c3298l3.a().v().a("Receiver not registered/enabled");
        }
        if (!b7.E(d10, false)) {
            c3298l3.a().v().a("Service not registered/enabled");
        }
        n();
        c3298l3.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        c3298l3.e().b();
        c3298l3.w();
        if (j10 < Math.max(0L, ((Long) AbstractC3209a2.f33824M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        c3298l3.c();
        Context d11 = c3298l3.d();
        ComponentName componentName = new ComponentName(d11, "com.google.android.gms.measurement.AppMeasurementJobService");
        int q10 = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzch.zza(d11, new JobInfo.Builder(q10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f33578a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f34404d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }

    public final AbstractC3381w o() {
        if (this.f34405e == null) {
            this.f34405e = new C3396x6(this, this.f34418b.g0());
        }
        return this.f34405e;
    }

    public final PendingIntent r() {
        Context d10 = this.f33578a.d();
        return PendingIntent.getBroadcast(d10, 0, new Intent().setClassName(d10, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza);
    }
}

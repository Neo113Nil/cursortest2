package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C3269h6;
import com.google.android.gms.measurement.internal.InterfaceC3237d6;

@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC3237d6 {

    /* renamed from: a, reason: collision with root package name */
    public C3269h6 f33258a;

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final C3269h6 c() {
        if (this.f33258a == null) {
            this.f33258a = new C3269h6(this);
        }
        return this.f33258a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c();
        C3269h6.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        c().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        C3269h6.j(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}

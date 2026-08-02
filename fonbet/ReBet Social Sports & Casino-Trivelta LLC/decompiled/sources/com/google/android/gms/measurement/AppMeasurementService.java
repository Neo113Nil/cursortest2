package com.google.android.gms.measurement;

import U0.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C3269h6;
import com.google.android.gms.measurement.internal.InterfaceC3237d6;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC3237d6 {

    /* renamed from: a, reason: collision with root package name */
    public C3269h6 f33260a;

    private final C3269h6 c() {
        if (this.f33260a == null) {
            this.f33260a = new C3269h6(this);
        }
        return this.f33260a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final void a(Intent intent) {
        a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().d(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        c().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        C3269h6.j(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3237d6
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}

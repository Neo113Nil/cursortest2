package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f33571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33572b;

    public N5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar) {
        this.f33571a = zzcuVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33572b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f33572b;
        appMeasurementDynamiteService.f33281a.C().e0(this.f33571a, appMeasurementDynamiteService.f33281a.f());
    }
}

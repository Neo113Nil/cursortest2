package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L6 f33499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33500b;

    public K4(AppMeasurementDynamiteService appMeasurementDynamiteService, L6 l62) {
        this.f33499a = l62;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33500b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33500b.f33281a.B().I(this.f33499a);
    }
}

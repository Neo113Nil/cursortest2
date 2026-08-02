package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3242e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f33995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33996b;

    public RunnableC3242e3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar) {
        this.f33995a = zzcuVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33996b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33996b.f33281a.J().r(this.f33995a);
    }
}

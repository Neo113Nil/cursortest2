package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3291k4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f34080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f34084e;

    public RunnableC3291k4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z10) {
        this.f34080a = zzcuVar;
        this.f34081b = str;
        this.f34082c = str2;
        this.f34083d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f34084e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34084e.f33281a.J().h0(this.f34080a, this.f34081b, this.f34082c, this.f34083d);
    }
}

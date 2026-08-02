package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f33477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbg f33478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33480d;

    public J3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, zzbg zzbgVar, String str) {
        this.f33477a = zzcuVar;
        this.f33478b = zzbgVar;
        this.f33479c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33480d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33480d.f33281a.J().B(this.f33477a, this.f33478b, this.f33479c);
    }
}

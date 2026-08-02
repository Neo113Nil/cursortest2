package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3316n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f34185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f34188d;

    public RunnableC3316n5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2) {
        this.f34185a = zzcuVar;
        this.f34186b = str;
        this.f34187c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f34188d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34188d.f33281a.J().f0(this.f34185a, this.f34186b, this.f34187c);
    }
}

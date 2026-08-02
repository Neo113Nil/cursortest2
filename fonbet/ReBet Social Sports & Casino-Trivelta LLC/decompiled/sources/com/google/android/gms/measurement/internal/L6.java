package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L6 implements Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final zzda f33545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33546b;

    public L6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33546b = appMeasurementDynamiteService;
        this.f33545a = zzdaVar;
    }

    @Override // com.google.android.gms.measurement.internal.Z3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f33545a.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C3298l3 c3298l3 = this.f33546b.f33281a;
            if (c3298l3 != null) {
                c3298l3.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}

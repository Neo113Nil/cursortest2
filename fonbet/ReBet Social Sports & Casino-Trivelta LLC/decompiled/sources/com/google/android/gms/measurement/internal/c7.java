package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c7 implements InterfaceC3211a4 {

    /* renamed from: a, reason: collision with root package name */
    public final zzda f33971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f33972b;

    public c7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33972b = appMeasurementDynamiteService;
        this.f33971a = zzdaVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3211a4
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f33971a.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C3298l3 c3298l3 = this.f33972b.f33281a;
            if (c3298l3 != null) {
                c3298l3.a().r().b("Event listener threw exception", e10);
            }
        }
    }
}

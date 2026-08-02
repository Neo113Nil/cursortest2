package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3273i2 extends zzbl implements InterfaceC3289k2 {
    public C3273i2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3289k2
    public final void w0(zzoq zzoqVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzoqVar);
        zzd(2, zza);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3281j2 extends zzbm implements InterfaceC3289k2 {
    public AbstractBinderC3281j2() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) zzbn.zzb(parcel, zzoq.CREATOR);
        zzbn.zzf(parcel);
        w0(zzoqVar);
        return true;
    }
}

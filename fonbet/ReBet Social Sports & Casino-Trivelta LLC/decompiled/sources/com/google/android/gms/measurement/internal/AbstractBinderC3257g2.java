package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3257g2 extends zzbm implements InterfaceC3265h2 {
    public AbstractBinderC3257g2() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        zzbn.zzf(parcel);
        zze(createTypedArrayList);
        return true;
    }
}

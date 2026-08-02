package com.google.android.gms.internal.location;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable implements l {
    private final Status zzb;
    public static final zzg zza = new zzg(Status.f32275f);
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    public zzg(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, this.zzb, i10, false);
        b.b(parcel, a10);
    }
}

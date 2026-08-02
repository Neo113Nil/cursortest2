package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zztf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztf> CREATOR = new zztg();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zztf(int i, int i2, int i3, int i4, long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.zzd;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i5);
        long j = this.zze;
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(j);
        ozg0.x(w, parcel);
    }
}

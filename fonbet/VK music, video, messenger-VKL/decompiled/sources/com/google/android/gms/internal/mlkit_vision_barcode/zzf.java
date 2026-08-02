package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzs();
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh;

    public zzf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.zzd;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.zze;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.zzf;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.zzg;
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 9, this.zzh, false);
        ozg0.x(w, parcel);
    }

    public zzf(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
    }
}

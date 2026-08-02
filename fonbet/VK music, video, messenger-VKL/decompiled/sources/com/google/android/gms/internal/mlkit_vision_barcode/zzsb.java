package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsb> CREATOR = new zzsq();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final boolean zzg;

    @Nullable
    private final String zzh;

    public zzsb(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
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
        int i6 = this.zze;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i6);
        int i7 = this.zzf;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i7);
        boolean z = this.zzg;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 8, this.zzh, false);
        ozg0.x(w, parcel);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zza;
    }

    @Nullable
    public final String zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzt();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public zzf zzf;
    public zzf zzg;

    public zzg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.zza, false);
        ozg0.q(parcel, 3, this.zzb, false);
        ozg0.q(parcel, 4, this.zzc, false);
        ozg0.q(parcel, 5, this.zzd, false);
        ozg0.q(parcel, 6, this.zze, false);
        ozg0.p(parcel, 7, this.zzf, i, false);
        ozg0.p(parcel, 8, this.zzg, i, false);
        ozg0.x(w, parcel);
    }

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzfVar, zzf zzfVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzfVar;
        this.zzg = zzfVar2;
    }
}

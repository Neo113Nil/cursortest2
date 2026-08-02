package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzv();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public String zzm;
    public String zzn;

    public zzi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.zza, false);
        ozg0.q(parcel, 3, this.zzb, false);
        ozg0.q(parcel, 4, this.zzc, false);
        ozg0.q(parcel, 5, this.zzd, false);
        ozg0.q(parcel, 6, this.zze, false);
        ozg0.q(parcel, 7, this.zzf, false);
        ozg0.q(parcel, 8, this.zzg, false);
        ozg0.q(parcel, 9, this.zzh, false);
        ozg0.q(parcel, 10, this.zzi, false);
        ozg0.q(parcel, 11, this.zzj, false);
        ozg0.q(parcel, 12, this.zzk, false);
        ozg0.q(parcel, 13, this.zzl, false);
        ozg0.q(parcel, 14, this.zzm, false);
        ozg0.q(parcel, 15, this.zzn, false);
        ozg0.x(w, parcel);
    }

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }
}

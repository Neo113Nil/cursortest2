package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzu();
    public zzl zza;
    public String zzb;
    public String zzc;
    public zzm[] zzd;
    public zzj[] zze;
    public String[] zzf;
    public zze[] zzg;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.zza, i, false);
        ozg0.q(parcel, 3, this.zzb, false);
        ozg0.q(parcel, 4, this.zzc, false);
        ozg0.t(parcel, 5, this.zzd, i);
        ozg0.t(parcel, 6, this.zze, i);
        ozg0.r(parcel, 7, this.zzf, false);
        ozg0.t(parcel, 8, this.zzg, i);
        ozg0.x(w, parcel);
    }

    public zzh(zzl zzlVar, String str, String str2, zzm[] zzmVarArr, zzj[] zzjVarArr, String[] strArr, zze[] zzeVarArr) {
        this.zza = zzlVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzmVarArr;
        this.zze = zzjVarArr;
        this.zzf = strArr;
        this.zzg = zzeVarArr;
    }
}

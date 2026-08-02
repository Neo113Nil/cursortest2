package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzj zzf;
    public zzm zzg;
    public zzn zzh;
    public zzp zzi;
    public zzo zzj;
    public zzk zzk;
    public zzg zzl;
    public zzh zzm;
    public zzi zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 3, this.zzb, false);
        ozg0.q(parcel, 4, this.zzc, false);
        int i3 = this.zzd;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i3);
        ozg0.t(parcel, 6, this.zze, i);
        ozg0.p(parcel, 7, this.zzf, i, false);
        ozg0.p(parcel, 8, this.zzg, i, false);
        ozg0.p(parcel, 9, this.zzh, i, false);
        ozg0.p(parcel, 10, this.zzi, i, false);
        ozg0.p(parcel, 11, this.zzj, i, false);
        ozg0.p(parcel, 12, this.zzk, i, false);
        ozg0.p(parcel, 13, this.zzl, i, false);
        ozg0.p(parcel, 14, this.zzm, i, false);
        ozg0.p(parcel, 15, this.zzn, i, false);
        ozg0.e(parcel, 16, this.zzo, false);
        boolean z = this.zzp;
        ozg0.v(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.zzq;
        ozg0.v(parcel, 18, 8);
        parcel.writeDouble(d);
        ozg0.x(w, parcel);
    }

    public zzq(int i, String str, String str2, int i2, Point[] pointArr, zzj zzjVar, zzm zzmVar, zzn zznVar, zzp zzpVar, zzo zzoVar, zzk zzkVar, zzg zzgVar, zzh zzhVar, zzi zziVar, byte[] bArr, boolean z, double d) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.zzf = zzjVar;
        this.zzg = zzmVar;
        this.zzh = zznVar;
        this.zzi = zzpVar;
        this.zzj = zzoVar;
        this.zzk = zzkVar;
        this.zzl = zzgVar;
        this.zzm = zzhVar;
        this.zzn = zziVar;
    }
}

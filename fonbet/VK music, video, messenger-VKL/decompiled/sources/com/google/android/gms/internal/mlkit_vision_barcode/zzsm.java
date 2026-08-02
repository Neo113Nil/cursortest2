package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new zzsn();
    private final int zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final byte[] zzd;

    @Nullable
    private final Point[] zze;
    private final int zzf;

    @Nullable
    private final zzsf zzg;

    @Nullable
    private final zzsi zzh;

    @Nullable
    private final zzsj zzi;

    @Nullable
    private final zzsl zzj;

    @Nullable
    private final zzsk zzk;

    @Nullable
    private final zzsg zzl;

    @Nullable
    private final zzsc zzm;

    @Nullable
    private final zzsd zzn;

    @Nullable
    private final zzse zzo;

    public zzsm(int i, @Nullable String str, @Nullable String str2, @Nullable byte[] bArr, @Nullable Point[] pointArr, int i2, @Nullable zzsf zzsfVar, @Nullable zzsi zzsiVar, @Nullable zzsj zzsjVar, @Nullable zzsl zzslVar, @Nullable zzsk zzskVar, @Nullable zzsg zzsgVar, @Nullable zzsc zzscVar, @Nullable zzsd zzsdVar, @Nullable zzse zzseVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzsfVar;
        this.zzh = zzsiVar;
        this.zzi = zzsjVar;
        this.zzj = zzslVar;
        this.zzk = zzskVar;
        this.zzl = zzsgVar;
        this.zzm = zzscVar;
        this.zzn = zzsdVar;
        this.zzo = zzseVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 2, this.zzb, false);
        ozg0.q(parcel, 3, this.zzc, false);
        ozg0.e(parcel, 4, this.zzd, false);
        ozg0.t(parcel, 5, this.zze, i);
        int i3 = this.zzf;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i3);
        ozg0.p(parcel, 7, this.zzg, i, false);
        ozg0.p(parcel, 8, this.zzh, i, false);
        ozg0.p(parcel, 9, this.zzi, i, false);
        ozg0.p(parcel, 10, this.zzj, i, false);
        ozg0.p(parcel, 11, this.zzk, i, false);
        ozg0.p(parcel, 12, this.zzl, i, false);
        ozg0.p(parcel, 13, this.zzm, i, false);
        ozg0.p(parcel, 14, this.zzn, i, false);
        ozg0.p(parcel, 15, this.zzo, i, false);
        ozg0.x(w, parcel);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Nullable
    public final zzsc zzc() {
        return this.zzm;
    }

    @Nullable
    public final zzsd zzd() {
        return this.zzn;
    }

    @Nullable
    public final zzse zze() {
        return this.zzo;
    }

    @Nullable
    public final zzsf zzf() {
        return this.zzg;
    }

    @Nullable
    public final zzsg zzg() {
        return this.zzl;
    }

    @Nullable
    public final zzsi zzh() {
        return this.zzh;
    }

    @Nullable
    public final zzsj zzi() {
        return this.zzi;
    }

    @Nullable
    public final zzsk zzj() {
        return this.zzk;
    }

    @Nullable
    public final zzsl zzk() {
        return this.zzj;
    }

    @Nullable
    public final String zzl() {
        return this.zzb;
    }

    @Nullable
    public final String zzm() {
        return this.zzc;
    }

    @Nullable
    public final byte[] zzn() {
        return this.zzd;
    }

    @Nullable
    public final Point[] zzo() {
        return this.zze;
    }
}

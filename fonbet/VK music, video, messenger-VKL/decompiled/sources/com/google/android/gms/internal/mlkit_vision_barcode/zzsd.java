package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsd> CREATOR = new zzss();

    @Nullable
    private final zzsh zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final zzsi[] zzd;

    @Nullable
    private final zzsf[] zze;

    @Nullable
    private final String[] zzf;

    @Nullable
    private final zzsa[] zzg;

    public zzsd(@Nullable zzsh zzshVar, @Nullable String str, @Nullable String str2, @Nullable zzsi[] zzsiVarArr, @Nullable zzsf[] zzsfVarArr, @Nullable String[] strArr, @Nullable zzsa[] zzsaVarArr) {
        this.zza = zzshVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzsiVarArr;
        this.zze = zzsfVarArr;
        this.zzf = strArr;
        this.zzg = zzsaVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.zza, i, false);
        ozg0.q(parcel, 2, this.zzb, false);
        ozg0.q(parcel, 3, this.zzc, false);
        ozg0.t(parcel, 4, this.zzd, i);
        ozg0.t(parcel, 5, this.zze, i);
        ozg0.r(parcel, 6, this.zzf, false);
        ozg0.t(parcel, 7, this.zzg, i);
        ozg0.x(w, parcel);
    }

    @Nullable
    public final zzsh zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Nullable
    public final zzsa[] zzd() {
        return this.zzg;
    }

    @Nullable
    public final zzsf[] zze() {
        return this.zze;
    }

    @Nullable
    public final zzsi[] zzf() {
        return this.zzd;
    }

    @Nullable
    public final String[] zzg() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new zzsr();

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final zzsb zzf;

    @Nullable
    private final zzsb zzg;

    public zzsc(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable zzsb zzsbVar, @Nullable zzsb zzsbVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzsbVar;
        this.zzg = zzsbVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.zza, false);
        ozg0.q(parcel, 2, this.zzb, false);
        ozg0.q(parcel, 3, this.zzc, false);
        ozg0.q(parcel, 4, this.zzd, false);
        ozg0.q(parcel, 5, this.zze, false);
        ozg0.p(parcel, 6, this.zzf, i, false);
        ozg0.p(parcel, 7, this.zzg, i, false);
        ozg0.x(w, parcel);
    }

    @Nullable
    public final zzsb zza() {
        return this.zzg;
    }

    @Nullable
    public final zzsb zzb() {
        return this.zzf;
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    @Nullable
    public final String zze() {
        return this.zzd;
    }

    @Nullable
    public final String zzf() {
        return this.zze;
    }

    @Nullable
    public final String zzg() {
        return this.zza;
    }
}

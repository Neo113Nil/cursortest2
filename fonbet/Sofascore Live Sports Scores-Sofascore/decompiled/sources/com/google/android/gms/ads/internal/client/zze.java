package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    @SafeParcelable.Field
    public final int zza;

    @SafeParcelable.Field
    public final String zzb;

    @SafeParcelable.Field
    public final String zzc;

    @Nullable
    @SafeParcelable.Field
    public zze zzd;

    @Nullable
    @SafeParcelable.Field
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param zze zzeVar, @Nullable @SafeParcelable.Param IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 2, this.zzb, false);
        SafeParcelWriter.m(parcel, 3, this.zzc, false);
        SafeParcelWriter.l(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.f(parcel, 5, this.zze);
        SafeParcelWriter.t(parcel, s);
    }

    public final AdError zza() {
        AdError adError;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.zzc;
            adError = new AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final LoadAdError zzb() {
        AdError adError;
        zze zzeVar = this.zzd;
        zzdx zzdxVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdxVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zzb(zzdxVar));
    }
}

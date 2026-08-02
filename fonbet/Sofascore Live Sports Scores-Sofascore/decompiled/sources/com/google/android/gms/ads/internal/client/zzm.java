package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();

    @SafeParcelable.Field
    public final long zzA;

    @SafeParcelable.Field
    public final int zzB;
    public final Bundle zzC = new Bundle();

    @SafeParcelable.Field
    public final int zza;

    @SafeParcelable.Field
    @Deprecated
    public final long zzb;

    @SafeParcelable.Field
    public final Bundle zzc;

    @SafeParcelable.Field
    @Deprecated
    public final int zzd;

    @SafeParcelable.Field
    public final List zze;

    @SafeParcelable.Field
    public final boolean zzf;

    @SafeParcelable.Field
    public final int zzg;

    @SafeParcelable.Field
    public final boolean zzh;

    @SafeParcelable.Field
    public final String zzi;

    @Nullable
    @SafeParcelable.Field
    @Deprecated
    public final zzft zzj;

    @SafeParcelable.Field
    public final Location zzk;

    @SafeParcelable.Field
    public final String zzl;

    @SafeParcelable.Field
    public final Bundle zzm;

    @SafeParcelable.Field
    public final Bundle zzn;

    @SafeParcelable.Field
    public final List zzo;

    @SafeParcelable.Field
    public final String zzp;

    @SafeParcelable.Field
    public final String zzq;

    @SafeParcelable.Field
    @Deprecated
    public final boolean zzr;

    @Nullable
    @SafeParcelable.Field
    public final zzc zzs;

    @SafeParcelable.Field
    public final int zzt;

    @Nullable
    @SafeParcelable.Field
    public final String zzu;

    @SafeParcelable.Field
    public final List zzv;

    @SafeParcelable.Field
    public final int zzw;

    @Nullable
    @SafeParcelable.Field
    public final String zzx;

    @SafeParcelable.Field
    public final int zzy;

    @SafeParcelable.Field
    public final long zzz;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param int i2, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param zzft zzftVar, @SafeParcelable.Param Location location, @SafeParcelable.Param String str2, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param Bundle bundle3, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z3, @Nullable @SafeParcelable.Param zzc zzcVar, @SafeParcelable.Param int i4, @Nullable @SafeParcelable.Param String str5, @SafeParcelable.Param List list3, @SafeParcelable.Param int i5, @Nullable @SafeParcelable.Param String str6, @SafeParcelable.Param int i6, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3, @SafeParcelable.Param int i7) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzftVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
        this.zzz = j2;
        this.zzA = j3;
        this.zzB = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz), Long.valueOf(this.zzA), Integer.valueOf(this.zzB)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.zzb;
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(j);
        SafeParcelWriter.b(parcel, 3, this.zzc);
        int i3 = this.zzd;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.o(parcel, 5, this.zze);
        boolean z = this.zzf;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.zzg;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i4);
        boolean z2 = this.zzh;
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m(parcel, 9, this.zzi, false);
        SafeParcelWriter.l(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.l(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.m(parcel, 12, this.zzl, false);
        SafeParcelWriter.b(parcel, 13, this.zzm);
        SafeParcelWriter.b(parcel, 14, this.zzn);
        SafeParcelWriter.o(parcel, 15, this.zzo);
        SafeParcelWriter.m(parcel, 16, this.zzp, false);
        SafeParcelWriter.m(parcel, 17, this.zzq, false);
        boolean z3 = this.zzr;
        SafeParcelWriter.r(parcel, 18, 4);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.l(parcel, 19, this.zzs, i, false);
        int i5 = this.zzt;
        SafeParcelWriter.r(parcel, 20, 4);
        parcel.writeInt(i5);
        SafeParcelWriter.m(parcel, 21, this.zzu, false);
        SafeParcelWriter.o(parcel, 22, this.zzv);
        int i6 = this.zzw;
        SafeParcelWriter.r(parcel, 23, 4);
        parcel.writeInt(i6);
        SafeParcelWriter.m(parcel, 24, this.zzx, false);
        int i7 = this.zzy;
        SafeParcelWriter.r(parcel, 25, 4);
        parcel.writeInt(i7);
        long j2 = this.zzz;
        SafeParcelWriter.r(parcel, 26, 8);
        parcel.writeLong(j2);
        long j3 = this.zzA;
        SafeParcelWriter.r(parcel, 27, 8);
        parcel.writeLong(j3);
        int i8 = this.zzB;
        SafeParcelWriter.r(parcel, 28, 4);
        parcel.writeInt(i8);
        SafeParcelWriter.t(parcel, s);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && Objects.a(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && Objects.a(this.zzi, zzmVar.zzi) && Objects.a(this.zzj, zzmVar.zzj) && Objects.a(this.zzk, zzmVar.zzk) && Objects.a(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && Objects.a(this.zzo, zzmVar.zzo) && Objects.a(this.zzp, zzmVar.zzp) && Objects.a(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && Objects.a(this.zzu, zzmVar.zzu) && Objects.a(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && Objects.a(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy && this.zzB == zzmVar.zzB;
    }

    public final boolean zzb() {
        return zzc() || zzd();
    }

    public final boolean zzc() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.zzc.getBoolean("zenith_v2", false);
    }
}

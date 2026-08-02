package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdlw;
import defpackage.gz8;
import defpackage.yhk;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    public static final AtomicLong a = new AtomicLong(0);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @SafeParcelable.Field
    public final zzc zza;

    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zza zzb;

    @SafeParcelable.Field
    public final zzr zzc;

    @SafeParcelable.Field
    public final zzclm zzd;

    @SafeParcelable.Field
    public final zzboz zze;

    @NonNull
    @SafeParcelable.Field
    public final String zzf;

    @SafeParcelable.Field
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field
    public final String zzh;

    @SafeParcelable.Field
    public final zzad zzi;

    @SafeParcelable.Field
    public final int zzj;

    @SafeParcelable.Field
    public final int zzk;

    @NonNull
    @SafeParcelable.Field
    public final String zzl;

    @NonNull
    @SafeParcelable.Field
    public final VersionInfoParcel zzm;

    @NonNull
    @SafeParcelable.Field
    public final String zzn;

    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.zzl zzo;

    @SafeParcelable.Field
    public final zzbox zzp;

    @NonNull
    @SafeParcelable.Field
    public final String zzq;

    @NonNull
    @SafeParcelable.Field
    public final String zzr;

    @NonNull
    @SafeParcelable.Field
    public final String zzs;

    @SafeParcelable.Field
    public final zzdec zzt;

    @SafeParcelable.Field
    public final zzdlw zzu;

    @SafeParcelable.Field
    public final zzbzm zzv;

    @SafeParcelable.Field
    public final boolean zzw;

    @SafeParcelable.Field
    public final long zzx;

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (!((Boolean) zzba.zzc().a(zzbjg.Le)).booleanValue()) {
            this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder));
            this.zzc = (zzr) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder2));
            this.zzd = (zzclm) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder3));
            this.zzp = (zzbox) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder6));
            this.zze = (zzboz) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder4));
            this.zzi = (zzad) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder5));
            this.zzt = (zzdec) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder7));
            this.zzu = (zzdlw) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder8));
            this.zzv = (zzbzm) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder9));
            return;
        }
        zzp zzpVar = (zzp) b.remove(Long.valueOf(j));
        if (zzpVar == null) {
            yhk.s("AdOverlayObjects is null");
            throw null;
        }
        this.zzb = zzpVar.a;
        this.zzc = zzpVar.b;
        this.zzd = zzpVar.c;
        this.zzp = zzpVar.d;
        this.zze = zzpVar.e;
        this.zzt = zzpVar.g;
        this.zzu = zzpVar.h;
        this.zzv = zzpVar.i;
        this.zzi = zzpVar.f;
        zzpVar.j.cancel(false);
    }

    public static final ObjectWrapper Y0(Object obj) {
        if (((Boolean) zzba.zzc().a(zzbjg.Le)).booleanValue()) {
            return null;
        }
        return new ObjectWrapper(obj);
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) gz8.K(bundleExtra, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", AdOverlayInfoParcel.class);
        } catch (Exception e) {
            if (!((Boolean) zzba.zzc().a(zzbjg.Le)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().d("AdOverlayInfoParcel.getFromIntent", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.zza, i, false);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        SafeParcelWriter.f(parcel, 3, Y0(zzaVar));
        zzr zzrVar = this.zzc;
        SafeParcelWriter.f(parcel, 4, Y0(zzrVar));
        zzclm zzclmVar = this.zzd;
        SafeParcelWriter.f(parcel, 5, Y0(zzclmVar));
        zzboz zzbozVar = this.zze;
        SafeParcelWriter.f(parcel, 6, Y0(zzbozVar));
        SafeParcelWriter.m(parcel, 7, this.zzf, false);
        boolean z = this.zzg;
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m(parcel, 9, this.zzh, false);
        zzad zzadVar = this.zzi;
        SafeParcelWriter.f(parcel, 10, Y0(zzadVar));
        int i2 = this.zzj;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(i2);
        int i3 = this.zzk;
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m(parcel, 13, this.zzl, false);
        SafeParcelWriter.l(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.m(parcel, 16, this.zzn, false);
        SafeParcelWriter.l(parcel, 17, this.zzo, i, false);
        zzbox zzboxVar = this.zzp;
        SafeParcelWriter.f(parcel, 18, Y0(zzboxVar));
        SafeParcelWriter.m(parcel, 19, this.zzq, false);
        SafeParcelWriter.m(parcel, 24, this.zzr, false);
        SafeParcelWriter.m(parcel, 25, this.zzs, false);
        zzdec zzdecVar = this.zzt;
        SafeParcelWriter.f(parcel, 26, Y0(zzdecVar));
        zzdlw zzdlwVar = this.zzu;
        SafeParcelWriter.f(parcel, 27, Y0(zzdlwVar));
        zzbzm zzbzmVar = this.zzv;
        SafeParcelWriter.f(parcel, 28, Y0(zzbzmVar));
        boolean z2 = this.zzw;
        SafeParcelWriter.r(parcel, 29, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j = this.zzx;
        SafeParcelWriter.r(parcel, 30, 8);
        parcel.writeLong(j);
        SafeParcelWriter.t(parcel, s);
        if (((Boolean) zzba.zzc().a(zzbjg.Le)).booleanValue()) {
            b.put(Long.valueOf(j), new zzp(zzaVar, zzrVar, zzclmVar, zzboxVar, zzbozVar, zzadVar, zzdecVar, zzdlwVar, zzbzmVar, zzcgj.d.schedule(new zzq(j), ((Integer) zzba.zzc().a(zzbjg.Ne)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbox zzboxVar, zzboz zzbozVar, zzad zzadVar, zzclm zzclmVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzdlw zzdlwVar, zzbzm zzbzmVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzp = zzboxVar;
        this.zze = zzbozVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzadVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdlwVar;
        this.zzv = zzbzmVar;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzclm zzclmVar, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzdec zzdecVar, zzbzm zzbzmVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().a(zzbjg.y1)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzdecVar;
        this.zzu = null;
        this.zzv = zzbzmVar;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzclm zzclmVar, boolean z, int i, VersionInfoParcel versionInfoParcel, zzdlw zzdlwVar, zzbzm zzbzmVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdlwVar;
        this.zzv = zzbzmVar;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbox zzboxVar, zzboz zzbozVar, zzad zzadVar, zzclm zzclmVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzdlw zzdlwVar, zzbzm zzbzmVar, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzp = zzboxVar;
        this.zze = zzbozVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdlwVar;
        this.zzv = zzbzmVar;
        this.zzw = z2;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, zzclm zzclmVar, zzdlw zzdlwVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdlwVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzclm zzclmVar, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzclmVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzclm zzclmVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbzm zzbzmVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzclmVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbzmVar;
        this.zzw = false;
        this.zzx = a.getAndIncrement();
    }
}

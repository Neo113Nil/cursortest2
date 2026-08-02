package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzccy extends zzbeu implements zzcda {
    public zzccy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zza(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        zzbew.e(J, zzcdhVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        zzbew.e(J, zzcdhVar);
        Z1(J, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) {
        Parcel J = J();
        zzbew.e(J, zzcddVar);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        Parcel J = J();
        zzbew.e(J, zzdnVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() {
        Parcel S1 = S1(J(), 9);
        Bundle bundle = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzg(zzcdo zzcdoVar) {
        Parcel J = J();
        zzbew.c(J, zzcdoVar);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() {
        zzccx zzccvVar;
        Parcel S1 = S1(J(), 11);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzccvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccvVar = queryLocalInterface instanceof zzccx ? (zzccx) queryLocalInterface : new zzccv(readStrongBinder);
        }
        S1.recycle();
        return zzccvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final com.google.android.gms.ads.internal.client.zzdx zzl() {
        Parcel S1 = S1(J(), 12);
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() {
        Parcel S1 = S1(J(), 16);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel J = J();
        zzbew.e(J, zzdqVar);
        Z1(J, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzo(boolean z) {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 15);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final long zzp() {
        Parcel S1 = S1(J(), 17);
        long readLong = S1.readLong();
        S1.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzq(long j) {
        Parcel J = J();
        J.writeLong(j);
        Z1(J, 18);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbok extends zzbeu implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final void C2(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        Parcel J = J();
        zzbew.e(J, zzdcVar);
        Z1(J, 26);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void E2(long j) {
        Parcel J = J();
        J.writeLong(j);
        Z1(J, 35);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void Q(zzboj zzbojVar) {
        Parcel J = J();
        zzbew.e(J, zzbojVar);
        Z1(J, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void V3(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Z1(J, 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final long b() {
        Parcel S1 = S1(J(), 34);
        long readLong = S1.readLong();
        S1.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void g1(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Z1(J, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void h3(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Z1(J, 17);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void j() {
        Z1(J(), 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void l1(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel J = J();
        zzbew.e(J, zzdqVar);
        Z1(J, 32);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void m1(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Parcel J = J();
        zzbew.e(J, zzdgVar);
        Z1(J, 25);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean o() {
        Parcel S1 = S1(J(), 30);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean y3(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Parcel S1 = S1(J, 16);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzA() {
        Parcel S1 = S1(J(), 24);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzD() {
        Z1(J(), 27);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzE() {
        Z1(J(), 28);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbms zzF() {
        zzbms zzbmqVar;
        Parcel S1 = S1(J(), 29);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
        }
        S1.recycle();
        return zzbmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzdx zzH() {
        Parcel S1 = S1(J(), 31);
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zze() {
        Parcel S1 = S1(J(), 2);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzf() {
        Parcel S1 = S1(J(), 3);
        ArrayList readArrayList = S1.readArrayList(zzbew.a);
        S1.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzg() {
        Parcel S1 = S1(J(), 4);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmv zzh() {
        zzbmv zzbmtVar;
        Parcel S1 = S1(J(), 5);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmtVar = queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(readStrongBinder);
        }
        S1.recycle();
        return zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzi() {
        Parcel S1 = S1(J(), 6);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzj() {
        Parcel S1 = S1(J(), 7);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final double zzk() {
        Parcel S1 = S1(J(), 8);
        double readDouble = S1.readDouble();
        S1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzl() {
        Parcel S1 = S1(J(), 9);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzm() {
        Parcel S1 = S1(J(), 10);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        Parcel S1 = S1(J(), 11);
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzp() {
        Z1(J(), 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmo zzq() {
        zzbmo zzbmmVar;
        Parcel S1 = S1(J(), 14);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmmVar = queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(readStrongBinder);
        }
        S1.recycle();
        return zzbmmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzu() {
        return x5n.i(S1(J(), 18));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzv() {
        return x5n.i(S1(J(), 19));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final Bundle zzw() {
        Parcel S1 = S1(J(), 20);
        Bundle bundle = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzz() {
        Parcel S1 = S1(J(), 23);
        ArrayList readArrayList = S1.readArrayList(zzbew.a);
        S1.recycle();
        return readArrayList;
    }
}

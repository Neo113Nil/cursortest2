package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvv extends zzbeu implements zzbvx {
    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void B(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void M3() {
        Z1(J(), 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Q0(boolean z) {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 25);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void R3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        zzbew.e(J, zzbwaVar);
        Z1(J, 32);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void U1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        zzbew.e(J, zzbwaVar);
        Z1(J, 38);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void W2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, ArrayList arrayList) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        J.writeString(str2);
        zzbew.e(J, zzbwaVar);
        zzbew.c(J, zzbmkVar);
        J.writeStringList(arrayList);
        Z1(J, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Y0(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 39);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Z2(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 30);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void a4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        J.writeString(str2);
        zzbew.e(J, zzbwaVar);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwd b() {
        zzbwd zzbwbVar;
        Parcel S1 = S1(J(), 36);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbwbVar = queryLocalInterface instanceof zzbwd ? (zzbwd) queryLocalInterface : new zzbwb(readStrongBinder);
        }
        S1.recycle();
        return zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwj e() {
        zzbwj zzbwhVar;
        Parcel S1 = S1(J(), 27);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbwhVar = queryLocalInterface instanceof zzbwj ? (zzbwj) queryLocalInterface : new zzbwh(readStrongBinder);
        }
        S1.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void e4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        zzbew.e(J, zzbwaVar);
        Z1(J, 28);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void h0(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzrVar);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        J.writeString(str2);
        zzbew.e(J, zzbwaVar);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi l() {
        Parcel S1 = S1(J(), 34);
        zzbyi zzbyiVar = (zzbyi) zzbew.b(S1, zzbyi.CREATOR);
        S1.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwf m() {
        zzbwf zzbwfVar;
        Parcel S1 = S1(J(), 15);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbwfVar = queryLocalInterface instanceof zzbwf ? (zzbwf) queryLocalInterface : new zzbwf(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        S1.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void m3(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzccsVar);
        J.writeStringList(list);
        Z1(J, 23);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void o0(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 37);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void q2(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        J.writeString(str);
        Z1(J, 11);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void s0(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, ArrayList arrayList) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbslVar);
        J.writeTypedList(arrayList);
        Z1(J, 31);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void s3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, zzccs zzccsVar, String str) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzmVar);
        J.writeString(null);
        zzbew.e(J, zzccsVar);
        J.writeString(str);
        Z1(J, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void t4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzrVar);
        zzbew.c(J, zzmVar);
        J.writeString(str);
        J.writeString(str2);
        zzbew.e(J, zzbwaVar);
        Z1(J, 35);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final com.google.android.gms.ads.internal.client.zzea zzB() {
        Parcel S1 = S1(J(), 26);
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzH() {
        Parcel S1 = S1(J(), 33);
        zzbyi zzbyiVar = (zzbyi) zzbew.b(S1, zzbyi.CREATOR);
        S1.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwg zzP() {
        zzbwg zzbwgVar;
        Parcel S1 = S1(J(), 16);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbwgVar = queryLocalInterface instanceof zzbwg ? (zzbwg) queryLocalInterface : new zzbwg(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        S1.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final IObjectWrapper zzf() {
        return x5n.i(S1(J(), 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzh() {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzi() {
        Z1(J(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzl() {
        Z1(J(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzp() {
        Z1(J(), 12);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzq() {
        Parcel S1 = S1(J(), 13);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzx() {
        Parcel S1 = S1(J(), 22);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }
}

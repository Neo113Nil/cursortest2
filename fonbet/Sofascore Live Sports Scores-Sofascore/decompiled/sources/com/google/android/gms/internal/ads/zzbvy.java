package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvy extends zzbeu implements zzbwa {
    public zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void A4(int i, String str) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        Z1(J, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void D1(zzcct zzcctVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void F1(String str, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        Z1(J, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void M(zzccx zzccxVar) {
        Parcel J = J();
        zzbew.e(J, zzccxVar);
        Z1(J, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void S(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 23);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void T3(zzbnm zzbnmVar, String str) {
        Parcel J = J();
        zzbew.e(J, zzbnmVar);
        J.writeString(str);
        Z1(J, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void f(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze() {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf() {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh() {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzi() {
        Z1(J(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzj() {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk() {
        Z1(J(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzn() {
        Z1(J(), 11);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo() {
        Z1(J(), 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzq() {
        Z1(J(), 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzt() {
        Z1(J(), 18);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzu() {
        Z1(J(), 20);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzv(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzz() {
        Z1(J(), 25);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzr extends zzbeu implements zzbzt {
    public zzbzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzG(int i, String[] strArr, int[] iArr) {
        Parcel J = J();
        J.writeInt(i);
        J.writeStringArray(strArr);
        J.writeIntArray(iArr);
        Z1(J, 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzd() {
        Z1(J(), 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zze() {
        Z1(J(), 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final boolean zzf() {
        Parcel S1 = S1(J(), 11);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzg(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzh() {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzi() {
        Z1(J(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzj() {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzk() {
        Z1(J(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzl(int i, int i2, Intent intent) {
        Parcel J = J();
        J.writeInt(i);
        J.writeInt(i2);
        zzbew.c(J, intent);
        Z1(J, 12);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzn(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Parcel S1 = S1(J, 6);
        if (S1.readInt() != 0) {
            bundle.readFromParcel(S1);
        }
        S1.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzo() {
        Z1(J(), 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzp() {
        Z1(J(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzr() {
        Z1(J(), 9);
    }
}

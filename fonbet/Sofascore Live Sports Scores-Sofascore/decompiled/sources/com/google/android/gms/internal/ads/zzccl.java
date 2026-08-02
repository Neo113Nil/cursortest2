package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzccl extends zzbeu implements zzccn {
    public zzccl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void O2(zzcce zzcceVar) {
        Parcel J = J();
        zzbew.e(J, zzcceVar);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void d(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zze() {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzf() {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzg() {
        Z1(J(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzh() {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzj() {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzl() {
        Z1(J(), 8);
    }
}

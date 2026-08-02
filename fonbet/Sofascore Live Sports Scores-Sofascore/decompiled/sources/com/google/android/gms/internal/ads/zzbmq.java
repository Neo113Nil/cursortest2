package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmq extends zzbeu implements zzbms {
    public zzbmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zze() {
        Parcel S1 = S1(J(), 2);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final IObjectWrapper zzg() {
        return x5n.i(S1(J(), 4));
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzh() {
        Parcel S1 = S1(J(), 5);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzi() {
        Parcel S1 = S1(J(), 6);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        Parcel S1 = S1(J(), 7);
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzk() {
        Parcel S1 = S1(J(), 8);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzl() {
        Parcel S1 = S1(J(), 10);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }
}

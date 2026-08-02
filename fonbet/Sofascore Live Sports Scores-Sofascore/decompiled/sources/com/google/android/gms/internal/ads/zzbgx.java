package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgx extends zzbeu implements zzbgz {
    public zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void L1(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel J = J();
        zzbew.e(J, zzdqVar);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void z0(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbhgVar);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        Parcel S1 = S1(J(), 5);
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzh(boolean z) {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzj() {
        Parcel S1 = S1(J(), 8);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final long zzk() {
        Parcel S1 = S1(J(), 9);
        long readLong = S1.readLong();
        S1.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzl(long j) {
        Parcel J = J();
        J.writeLong(j);
        Z1(J, 10);
    }
}

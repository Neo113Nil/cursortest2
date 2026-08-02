package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel J = J(obtain, 1);
        String readString = J.readString();
        J.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel J = J(obtain, 6);
        int i = zzc.a;
        boolean z = J.readInt() != 0;
        J.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = zzc.a;
        obtain.writeInt(1);
        Parcel J = J(obtain, 2);
        boolean z = J.readInt() != 0;
        J.recycle();
        return z;
    }
}

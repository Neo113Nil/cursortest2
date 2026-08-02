package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.m5o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbxm extends zzbev implements zzbxn {
    public zzbxm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbwj zzbwhVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbwhVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                zzbwhVar = queryLocalInterface instanceof zzbwj ? (zzbwj) queryLocalInterface : new zzbwh(readStrongBinder);
            }
            zzbew.f(parcel);
            ((m5o) this).s2(zzbwhVar);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((m5o) this).zzf(readString);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.f(parcel);
            ((m5o) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

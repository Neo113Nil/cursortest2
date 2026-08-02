package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzdp extends zzbev implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdq zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzt zztVar = (zzt) zzbew.b(parcel, zzt.CREATOR);
            zzbew.f(parcel);
            zze(zztVar);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean zzf = zzf();
        parcel2.writeNoException();
        ClassLoader classLoader = zzbew.a;
        parcel2.writeInt(zzf ? 1 : 0);
        return true;
    }
}

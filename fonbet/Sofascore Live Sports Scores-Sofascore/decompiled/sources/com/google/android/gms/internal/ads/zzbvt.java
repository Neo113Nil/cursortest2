package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbvt extends zzbev implements zzbvu {
    public zzbvt() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvu E4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbvu ? (zzbvu) queryLocalInterface : new zzbvs(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            zzbvx zza = ((zzbvq) this).zza(readString);
            parcel2.writeNoException();
            zzbew.e(parcel2, zza);
            return true;
        }
        if (i == 2) {
            String readString2 = parcel.readString();
            zzbew.f(parcel);
            boolean zzb = ((zzbvq) this).zzb(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzb ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String readString3 = parcel.readString();
            zzbew.f(parcel);
            zzbxt n = ((zzbvq) this).n(readString3);
            parcel2.writeNoException();
            zzbew.e(parcel2, n);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        zzbew.f(parcel);
        boolean A = ((zzbvq) this).A(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(A ? 1 : 0);
        return true;
    }
}

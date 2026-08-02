package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbmn extends zzbev implements zzbmo {
    public zzbmn() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbmo E4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbmd) this).a);
            return true;
        }
        if (i != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((zzbmd) this).c);
        return true;
    }
}

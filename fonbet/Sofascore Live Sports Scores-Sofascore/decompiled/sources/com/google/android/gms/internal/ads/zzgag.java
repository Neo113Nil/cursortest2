package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgag extends zzbev implements zzgah {
    public zzgag() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readString();
                zzbew.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbew.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbew.f(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbew.f(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbew.f(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbew.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

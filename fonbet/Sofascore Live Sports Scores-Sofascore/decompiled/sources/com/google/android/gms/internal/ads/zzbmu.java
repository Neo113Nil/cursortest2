package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbmu extends zzbev implements zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbmv E4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                IObjectWrapper zza = ((zzbmg) this).zza();
                parcel2.writeNoException();
                zzbew.e(parcel2, zza);
                return true;
            case 2:
                parcel2.writeNoException();
                zzbew.d(parcel2, ((zzbmg) this).b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(((zzbmg) this).c);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(((zzbmg) this).d);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(((zzbmg) this).e);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(((zzbmg) this).f);
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbmy extends zzbev implements zzbmz {
    public zzbmy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbmz zzdG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbmz ? (zzbmz) queryLocalInterface : new zzbmx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbms zzbmqVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zza(readString, S1);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzc(S12);
                parcel2.writeNoException();
                return true;
            case 4:
                zzd();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readInt();
                zzbew.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzdB(S13);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzdD(S14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
                }
                zzbew.f(parcel);
                zzdE(zzbmqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzdC(S15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

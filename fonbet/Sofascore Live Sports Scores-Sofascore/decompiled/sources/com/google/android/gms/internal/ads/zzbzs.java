package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbzs extends zzbev implements zzbzt {
    public zzbzs() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbzt zzH(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbzt ? (zzbzt) queryLocalInterface : new zzbzr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzg(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzh();
                parcel2.writeNoException();
                return true;
            case 3:
                zzi();
                parcel2.writeNoException();
                return true;
            case 4:
                zzj();
                parcel2.writeNoException();
                return true;
            case 5:
                zzk();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzn(bundle2);
                parcel2.writeNoException();
                zzbew.d(parcel2, bundle2);
                return true;
            case 7:
                zzo();
                parcel2.writeNoException();
                return true;
            case 8:
                zzp();
                parcel2.writeNoException();
                return true;
            case 9:
                zzr();
                parcel2.writeNoException();
                return true;
            case 10:
                zzd();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzf = zzf();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzf ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) zzbew.b(parcel, Intent.CREATOR);
                zzbew.f(parcel);
                zzl(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                zze();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzbew.f(parcel);
                zzG(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

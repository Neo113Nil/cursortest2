package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbgy extends zzbev implements zzbgz {
    public static final /* synthetic */ int a = 0;

    public zzbgy() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbhg zzbheVar;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                zzbew.e(parcel2, ((zzcvy) this).c);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbhd) {
                    }
                }
                zzbew.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbheVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbheVar = queryLocalInterface2 instanceof zzbhg ? (zzbhg) queryLocalInterface2 : new zzbhe(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                zzbew.f(parcel);
                ((zzcvy) this).z0(S1, zzbheVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzg = ((zzcvy) this).zzg();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzg);
                return true;
            case 6:
                boolean a2 = zzbew.a(parcel);
                zzbew.f(parcel);
                ((zzcvy) this).e = a2;
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zza = com.google.android.gms.ads.internal.client.zzdp.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzcvy) this).L1(zza);
                parcel2.writeNoException();
                return true;
            case 8:
                String zzj = ((zzcvy) this).zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = ((zzcvy) this).zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zzbew.f(parcel);
                ((zzcvy) this).zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

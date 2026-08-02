package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbwi extends zzbev implements zzbwj {
    public zzbwi() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 3:
                List zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(zzf);
                return true;
            case 4:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 5:
                zzbmv zzh = zzh();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzh);
                return true;
            case 6:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(zzk);
                return true;
            case 9:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzn = zzn();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzn);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                IObjectWrapper zzp = zzp();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzp);
                return true;
            case 14:
                IObjectWrapper zzq = zzq();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzq);
                return true;
            case 15:
                IObjectWrapper zzr = zzr();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzr);
                return true;
            case 16:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbew.d(parcel2, zzs);
                return true;
            case 17:
                boolean zzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            case 18:
                boolean zzu = zzu();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbew.a;
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 19:
                e2();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                B(S1);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                f0(S12, S13, S14);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                M2(S15);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(zzz);
                return true;
            case 24:
                float zzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(zzA);
                return true;
            case 25:
                float zzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(zzB);
                return true;
            case 26:
                e();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

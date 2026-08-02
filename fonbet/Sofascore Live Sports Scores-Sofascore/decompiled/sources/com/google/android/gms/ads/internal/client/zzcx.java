package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcx extends zzbev implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzdk zzdiVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzbew.f(parcel);
                zzf(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzbew.f(parcel);
                zzg(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a = zzbew.a(parcel);
                zzbew.f(parcel);
                zzh(a);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                zzi(S1, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzj(readString3, S12);
                parcel2.writeNoException();
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzbew.f(parcel);
                zzn(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvu E4 = zzbvt.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzo(E4);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbso zzb = zzbsn.zzb(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzp(zzb);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) zzbew.b(parcel, zzfr.CREATOR);
                zzbew.f(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdi(readStrongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzbew.f(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a2 = zzbew.a(parcel);
                zzbew.f(parcel);
                zzu(a2);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzbew.f(parcel);
                zzv(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

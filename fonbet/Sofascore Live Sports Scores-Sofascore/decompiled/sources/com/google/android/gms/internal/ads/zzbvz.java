package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbvz extends zzbev implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbwa E4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzccx zzccvVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzbew.f(parcel);
                f(readInt);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzbew.f(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                F1(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface instanceof zzbnm) {
                    }
                }
                parcel.readString();
                zzbew.f(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbew.f(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcct zzcctVar = (zzcct) zzbew.b(parcel, zzcct.CREATOR);
                zzbew.f(parcel);
                D1(zzcctVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzccvVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzccvVar = queryLocalInterface2 instanceof zzccx ? (zzccx) queryLocalInterface2 : new zzccv(readStrongBinder3);
                }
                zzbew.f(parcel);
                M(zzccvVar);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzbew.f(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbew.f(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzbew.f(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzbew.f(parcel);
                A4(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbew.f(parcel);
                S(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbew.f(parcel);
                j0(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

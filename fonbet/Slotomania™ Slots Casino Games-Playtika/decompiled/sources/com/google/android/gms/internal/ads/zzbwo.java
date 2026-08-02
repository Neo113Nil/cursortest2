package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbwo extends zzbdt implements zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbwp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbwp ? (zzbwp) queryLocalInterface : new zzbwn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbws zzbwsVar = null;
        zzbwa zzbwaVar = null;
        zzbwj zzbwjVar = null;
        zzbwd zzbwdVar = null;
        zzbwm zzbwkVar = null;
        zzbwj zzbwjVar2 = null;
        zzbwm zzbwkVar2 = null;
        zzbwg zzbwgVar = null;
        zzbwd zzbwdVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzbdu.zzb(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzbdu.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbwsVar = queryLocalInterface instanceof zzbws ? (zzbws) queryLocalInterface : new zzbwq(readStrongBinder);
            }
            zzbdu.zzh(parcel);
            zze(asInterface, readString, bundle, bundle2, zzrVar, zzbwsVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbxe zzf = zzf();
            parcel2.writeNoException();
            zzbdu.zzd(parcel2, zzf);
        } else if (i == 3) {
            zzbxe zzg = zzg();
            parcel2.writeNoException();
            zzbdu.zzd(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzea zzh = zzh();
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbdu.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwdVar2 = queryLocalInterface2 instanceof zzbwd ? (zzbwd) queryLocalInterface2 : new zzbwb(readStrongBinder2);
                    }
                    zzbuw zzb = zzbuv.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbdu.zzh(parcel);
                    zzi(readString2, readString3, zzmVar, asInterface2, zzbwdVar2, zzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwgVar = queryLocalInterface3 instanceof zzbwg ? (zzbwg) queryLocalInterface3 : new zzbwe(readStrongBinder3);
                    }
                    zzbuw zzb2 = zzbuv.zzb(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    zzj(readString4, readString5, zzmVar2, asInterface3, zzbwgVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    boolean zzk = zzk(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwkVar2 = queryLocalInterface4 instanceof zzbwm ? (zzbwm) queryLocalInterface4 : new zzbwk(readStrongBinder4);
                    }
                    zzbwm zzbwmVar = zzbwkVar2;
                    zzbuw zzb3 = zzbuv.zzb(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    zzl(readString6, readString7, zzmVar3, asInterface5, zzbwmVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    boolean zzm = zzm(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwjVar2 = queryLocalInterface5 instanceof zzbwj ? (zzbwj) queryLocalInterface5 : new zzbwh(readStrongBinder5);
                    }
                    zzbuw zzb4 = zzbuv.zzb(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    zzn(readString8, readString9, zzmVar4, asInterface7, zzbwjVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzbdu.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwkVar = queryLocalInterface6 instanceof zzbwm ? (zzbwm) queryLocalInterface6 : new zzbwk(readStrongBinder6);
                    }
                    zzbwm zzbwmVar2 = zzbwkVar;
                    zzbuw zzb5 = zzbuv.zzb(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    zzp(readString11, readString12, zzmVar5, asInterface8, zzbwmVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwdVar = queryLocalInterface7 instanceof zzbwd ? (zzbwd) queryLocalInterface7 : new zzbwb(readStrongBinder7);
                    }
                    zzbuw zzb6 = zzbuv.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbdu.zzh(parcel);
                    zzq(readString13, readString14, zzmVar6, asInterface9, zzbwdVar, zzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwjVar = queryLocalInterface8 instanceof zzbwj ? (zzbwj) queryLocalInterface8 : new zzbwh(readStrongBinder8);
                    }
                    zzbuw zzb7 = zzbuv.zzb(parcel.readStrongBinder());
                    zzblh zzblhVar = (zzblh) zzbdu.zzb(parcel, zzblh.CREATOR);
                    zzbdu.zzh(parcel);
                    zzr(readString15, readString16, zzmVar7, asInterface10, zzbwjVar, zzb7, zzblhVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbwaVar = queryLocalInterface9 instanceof zzbwa ? (zzbwa) queryLocalInterface9 : new zzbvy(readStrongBinder9);
                    }
                    zzbuw zzb8 = zzbuv.zzb(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    zzs(readString17, readString18, zzmVar8, asInterface11, zzbwaVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbdu.zzh(parcel);
                    boolean zzt = zzt(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbdu.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

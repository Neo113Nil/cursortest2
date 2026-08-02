package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbus extends zzbdt implements zzbut {
    public zzbus() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbuw zzbuuVar;
        zzbuw zzbuuVar2;
        zzbuw zzbuuVar3;
        zzbuw zzbuuVar4;
        zzbuw zzbuuVar5;
        zzbuw zzbuuVar6;
        zzbuw zzbuuVar7;
        zzbuw zzbuuVar8;
        zzbuw zzbuwVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbuuVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar = queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(readStrongBinder);
                }
                zzbdu.zzh(parcel);
                zze(asInterface, zzrVar, zzmVar, readString, zzbuuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzf);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbuuVar2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar2 = queryLocalInterface2 instanceof zzbuw ? (zzbuw) queryLocalInterface2 : new zzbuu(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zzg(asInterface2, zzmVar2, readString2, zzbuuVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzbuuVar3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar3 = queryLocalInterface3 instanceof zzbuw ? (zzbuw) queryLocalInterface3 : new zzbuu(readStrongBinder3);
                }
                zzbdu.zzh(parcel);
                zzj(asInterface3, zzrVar2, zzmVar3, readString3, readString4, zzbuuVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    zzbuuVar4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar4 = queryLocalInterface4 instanceof zzbuw ? (zzbuw) queryLocalInterface4 : new zzbuu(readStrongBinder4);
                }
                zzbdu.zzh(parcel);
                zzk(asInterface4, zzmVar4, readString5, readString6, zzbuuVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzcbo zzb = zzcbn.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzbdu.zzh(parcel);
                zzn(asInterface5, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                zzbdu.zzh(parcel);
                zzo(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = zzbdu.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    zzbuuVar5 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar5 = queryLocalInterface5 instanceof zzbuw ? (zzbuw) queryLocalInterface5 : new zzbuu(readStrongBinder5);
                }
                zzblh zzblhVar = (zzblh) zzbdu.zzb(parcel, zzblh.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzbdu.zzh(parcel);
                zzr(asInterface6, zzmVar7, readString10, readString11, zzbuuVar5, zzblhVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzbdu.zzh(parcel);
                zzv(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzw(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzbdu.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcbo zzb2 = zzcbn.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzbdu.zzh(parcel);
                zzy(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbmj zzz = zzz();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzz);
                return true;
            case 25:
                boolean zza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzA(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzB = zzB();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzB);
                return true;
            case 27:
                zzbvf zzC = zzC();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzC);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    zzbuuVar6 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar6 = queryLocalInterface6 instanceof zzbuw ? (zzbuw) queryLocalInterface6 : new zzbuu(readStrongBinder6);
                }
                zzbdu.zzh(parcel);
                zzD(asInterface9, zzmVar9, readString14, zzbuuVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzE(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrh zzb3 = zzbrg.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbrn.CREATOR);
                zzbdu.zzh(parcel);
                zzF(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    zzbuuVar7 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar7 = queryLocalInterface7 instanceof zzbuw ? (zzbuw) queryLocalInterface7 : new zzbuu(readStrongBinder7);
                }
                zzbdu.zzh(parcel);
                zzG(asInterface12, zzmVar10, readString15, zzbuuVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxe zzH = zzH();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzH);
                return true;
            case 34:
                zzbxe zzI = zzI();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzI);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    zzbuuVar8 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuuVar8 = queryLocalInterface8 instanceof zzbuw ? (zzbuw) queryLocalInterface8 : new zzbuu(readStrongBinder8);
                }
                zzbdu.zzh(parcel);
                zzJ(asInterface13, zzrVar3, zzmVar11, readString16, readString17, zzbuuVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbuz zzK = zzK();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzK);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzL(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbuwVar = queryLocalInterface9 instanceof zzbuw ? (zzbuw) queryLocalInterface9 : new zzbuu(readStrongBinder9);
                }
                zzbdu.zzh(parcel);
                zzM(asInterface15, zzmVar12, readString18, zzbuwVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzN(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}

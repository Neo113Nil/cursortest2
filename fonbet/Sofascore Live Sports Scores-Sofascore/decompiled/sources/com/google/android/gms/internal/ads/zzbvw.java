package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbvw extends zzbev implements zzbvx {
    public zzbvw() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzccs zzccsVar;
        zzbnn zzbnnVar;
        zzbwa zzbwaVar = null;
        zzbwa zzbwaVar2 = null;
        zzbwa zzbvyVar = null;
        zzbwa zzbwaVar3 = null;
        zzbsl zzbslVar = null;
        zzbwa zzbwaVar4 = null;
        r3 = null;
        zzbnm zzbnmVar = null;
        zzbwa zzbvyVar2 = null;
        zzccs zzccsVar2 = null;
        zzbwa zzbvyVar3 = null;
        zzbwa zzbvyVar4 = null;
        zzbwa zzbvyVar5 = null;
        switch (i) {
            case 1:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(readStrongBinder);
                }
                zzbwa zzbwaVar5 = zzbwaVar;
                zzbew.f(parcel);
                ((zzbwv) this).h0(S1, zzrVar, zzmVar, readString, null, zzbwaVar5);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzf = ((zzbwv) this).zzf();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzf);
                return true;
            case 3:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvyVar5 = queryLocalInterface2 instanceof zzbwa ? (zzbwa) queryLocalInterface2 : new zzbvy(readStrongBinder2);
                }
                zzbwa zzbwaVar6 = zzbvyVar5;
                zzbew.f(parcel);
                ((zzbwv) this).a4(S12, zzmVar2, readString2, null, zzbwaVar6);
                parcel2.writeNoException();
                return true;
            case 4:
                ((zzbwv) this).zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                ((zzbwv) this).zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvyVar4 = queryLocalInterface3 instanceof zzbwa ? (zzbwa) queryLocalInterface3 : new zzbvy(readStrongBinder3);
                }
                zzbwa zzbwaVar7 = zzbvyVar4;
                zzbew.f(parcel);
                ((zzbwv) this).h0(S13, zzrVar2, zzmVar3, readString3, readString4, zzbwaVar7);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvyVar3 = queryLocalInterface4 instanceof zzbwa ? (zzbwa) queryLocalInterface4 : new zzbvy(readStrongBinder4);
                }
                zzbwa zzbwaVar8 = zzbvyVar3;
                zzbew.f(parcel);
                ((zzbwv) this).a4(S14, zzmVar4, readString5, readString6, zzbwaVar8);
                parcel2.writeNoException();
                return true;
            case 8:
                ((zzbwv) this).zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                ((zzbwv) this).M3();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zzccsVar2 = queryLocalInterface5 instanceof zzccs ? (zzccs) queryLocalInterface5 : new zzccq(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String readString7 = parcel.readString();
                zzbew.f(parcel);
                ((zzbwv) this).s3(S15, zzmVar5, zzccsVar2, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString8 = parcel.readString();
                zzbew.f(parcel);
                ((zzbwv) this).I4(zzmVar6, readString8);
                parcel2.writeNoException();
                return true;
            case 12:
                ((zzbwv) this).zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = ((zzbwv) this).zzq();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvyVar2 = queryLocalInterface6 instanceof zzbwa ? (zzbwa) queryLocalInterface6 : new zzbvy(readStrongBinder6);
                }
                zzbwa zzbwaVar9 = zzbvyVar2;
                zzbmk zzbmkVar = (zzbmk) zzbew.b(parcel, zzbmk.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzbew.f(parcel);
                ((zzbwv) this).W2(S16, zzmVar7, readString9, readString10, zzbwaVar9, zzbmkVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbew.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                zzbew.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                zzbew.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                zzbew.d(parcel2, bundle3);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                zzbew.f(parcel);
                ((zzbwv) this).I4(zzmVar8, readString11);
                parcel2.writeNoException();
                return true;
            case 21:
                ((zzbwv) this).B(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = zzbew.a;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zzccsVar = queryLocalInterface7 instanceof zzccs ? (zzccs) queryLocalInterface7 : new zzccq(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    zzccsVar = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzbew.f(parcel);
                ((zzbwv) this).m3(S17, zzccsVar, createStringArrayList2);
                throw null;
            case 24:
                zzbwx zzbwxVar = ((zzbwv) this).b;
                if (zzbwxVar != null && (zzbnnVar = zzbwxVar.c) != null) {
                    zzbnmVar = zzbnnVar.a;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, zzbnmVar);
                return true;
            case 25:
                boolean a = zzbew.a(parcel);
                zzbew.f(parcel);
                ((zzbwv) this).Q0(a);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzB = ((zzbwv) this).zzB();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzB);
                return true;
            case 27:
                zzbwj e = ((zzbwv) this).e();
                parcel2.writeNoException();
                zzbew.e(parcel2, e);
                return true;
            case 28:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar4 = queryLocalInterface8 instanceof zzbwa ? (zzbwa) queryLocalInterface8 : new zzbvy(readStrongBinder8);
                }
                zzbew.f(parcel);
                ((zzbwv) this).e4(S18, zzmVar9, readString12, zzbwaVar4);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                ((zzbwv) this).Z2(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    zzbslVar = queryLocalInterface9 instanceof zzbsl ? (zzbsl) queryLocalInterface9 : new zzbsj(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbsr.CREATOR);
                zzbew.f(parcel);
                ((zzbwv) this).s0(S19, zzbslVar, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar3 = queryLocalInterface10 instanceof zzbwa ? (zzbwa) queryLocalInterface10 : new zzbvy(readStrongBinder10);
                }
                zzbew.f(parcel);
                ((zzbwv) this).R3(S110, zzmVar10, readString13, zzbwaVar3);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbyi zzH = ((zzbwv) this).zzH();
                parcel2.writeNoException();
                zzbew.d(parcel2, zzH);
                return true;
            case 34:
                zzbyi l = ((zzbwv) this).l();
                parcel2.writeNoException();
                zzbew.d(parcel2, l);
                return true;
            case 35:
                IObjectWrapper S111 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvyVar = queryLocalInterface11 instanceof zzbwa ? (zzbwa) queryLocalInterface11 : new zzbvy(readStrongBinder11);
                }
                zzbwa zzbwaVar10 = zzbvyVar;
                zzbew.f(parcel);
                ((zzbwv) this).t4(S111, zzrVar3, zzmVar11, readString14, readString15, zzbwaVar10);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbwd b = ((zzbwv) this).b();
                parcel2.writeNoException();
                zzbew.e(parcel2, b);
                return true;
            case 37:
                ((zzbwv) this).o0(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper S112 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar2 = queryLocalInterface12 instanceof zzbwa ? (zzbwa) queryLocalInterface12 : new zzbvy(readStrongBinder12);
                }
                zzbew.f(parcel);
                ((zzbwv) this).U1(S112, zzmVar12, readString16, zzbwaVar2);
                parcel2.writeNoException();
                return true;
            case 39:
                ((zzbwv) this).Y0(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
        }
    }
}

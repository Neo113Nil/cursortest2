package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbxs extends zzbev implements zzbxt {
    public static final /* synthetic */ int a = 0;

    public zzbxs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.zzbxk] */
    /* JADX WARN: Type inference failed for: r3v36, types: [com.google.android.gms.internal.ads.zzbxe] */
    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbxw zzbxuVar;
        zzbxi zzbxiVar;
        zzbxc zzbxcVar;
        zzbxw zzbxwVar = null;
        zzbxc zzbxcVar2 = null;
        zzbxn zzbxlVar = null;
        zzbxh zzbxfVar = null;
        zzbxq zzbxoVar = null;
        zzbxn zzbxlVar2 = null;
        zzbxq zzbxoVar2 = null;
        zzbxi zzbxiVar2 = null;
        zzbxh zzbxfVar2 = null;
        if (i == 1) {
            IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbew.b(parcel, creator);
            Bundle bundle2 = (Bundle) zzbew.b(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof zzbxw)) {
                    zzbxuVar = new zzbxu(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    zzbew.f(parcel);
                    ((zzbyg) this).r1(S1, readString, bundle, bundle2, zzrVar, zzbxuVar);
                    parcel2.writeNoException();
                    return true;
                }
                zzbxwVar = (zzbxw) queryLocalInterface;
            }
            zzbxuVar = zzbxwVar;
            zzbew.f(parcel);
            ((zzbyg) this).r1(S1, readString, bundle, bundle2, zzrVar, zzbxuVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            zzbyi zzf = ((zzbyg) this).zzf();
            parcel2.writeNoException();
            zzbew.d(parcel2, zzf);
            return true;
        }
        if (i == 3) {
            zzbyi zzg = ((zzbyg) this).zzg();
            parcel2.writeNoException();
            zzbew.d(parcel2, zzg);
            return true;
        }
        if (i == 5) {
            com.google.android.gms.ads.internal.client.zzea zzh = ((zzbyg) this).zzh();
            parcel2.writeNoException();
            zzbew.e(parcel2, zzh);
            return true;
        }
        if (i == 10) {
            IObjectWrapper.Stub.S1(parcel.readStrongBinder());
            zzbew.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            zzbew.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbxfVar2 = queryLocalInterface2 instanceof zzbxh ? (zzbxh) queryLocalInterface2 : new zzbxf(readStrongBinder2);
                }
                zzbxh zzbxhVar = zzbxfVar2;
                zzbwa E4 = zzbvz.E4(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                zzbew.f(parcel);
                ((zzbyg) this).H3(readString2, readString3, zzmVar, S12, zzbxhVar, E4, zzrVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof zzbxk)) {
                        zzbxiVar = new zzbxi(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwa E42 = zzbvz.E4(parcel.readStrongBinder());
                        zzbew.f(parcel);
                        ((zzbyg) this).q3(readString4, readString5, zzmVar2, S13, zzbxiVar, E42);
                        parcel2.writeNoException();
                        break;
                    } else {
                        zzbxiVar2 = (zzbxk) queryLocalInterface3;
                    }
                }
                zzbxiVar = zzbxiVar2;
                zzbwa E422 = zzbvz.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzbyg) this).q3(readString4, readString5, zzmVar2, S13, zzbxiVar, E422);
                parcel2.writeNoException();
            case 15:
                boolean t3 = ((zzbyg) this).t3(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(t3 ? 1 : 0);
                break;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbxoVar2 = queryLocalInterface4 instanceof zzbxq ? (zzbxq) queryLocalInterface4 : new zzbxo(readStrongBinder4);
                }
                zzbxq zzbxqVar = zzbxoVar2;
                zzbwa E43 = zzbvz.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzbyg) this).z3(readString6, readString7, zzmVar3, S14, zzbxqVar, E43);
                parcel2.writeNoException();
                break;
            case 17:
                boolean zzm = ((zzbyg) this).zzm(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                break;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbxlVar2 = queryLocalInterface5 instanceof zzbxn ? (zzbxn) queryLocalInterface5 : new zzbxl(readStrongBinder5);
                }
                zzbxn zzbxnVar = zzbxlVar2;
                zzbwa E44 = zzbvz.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzbyg) this).j2(readString8, readString9, zzmVar4, S15, zzbxnVar, E44, null);
                parcel2.writeNoException();
                break;
            case 19:
                String readString10 = parcel.readString();
                zzbew.f(parcel);
                ((zzbyg) this).f = readString10;
                parcel2.writeNoException();
                break;
            case 20:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbxoVar = queryLocalInterface6 instanceof zzbxq ? (zzbxq) queryLocalInterface6 : new zzbxo(readStrongBinder6);
                }
                zzbxq zzbxqVar2 = zzbxoVar;
                zzbwa E45 = zzbvz.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzbyg) this).r2(readString11, readString12, zzmVar5, S16, zzbxqVar2, E45);
                parcel2.writeNoException();
                break;
            case 21:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbxfVar = queryLocalInterface7 instanceof zzbxh ? (zzbxh) queryLocalInterface7 : new zzbxf(readStrongBinder7);
                }
                zzbxh zzbxhVar2 = zzbxfVar;
                zzbwa E46 = zzbvz.E4(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                zzbew.f(parcel);
                ((zzbyg) this).w1(readString13, readString14, zzmVar6, S17, zzbxhVar2, E46, zzrVar3);
                parcel2.writeNoException();
                break;
            case 22:
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbxlVar = queryLocalInterface8 instanceof zzbxn ? (zzbxn) queryLocalInterface8 : new zzbxl(readStrongBinder8);
                }
                zzbxn zzbxnVar2 = zzbxlVar;
                zzbwa E47 = zzbvz.E4(parcel.readStrongBinder());
                zzbmk zzbmkVar = (zzbmk) zzbew.b(parcel, zzbmk.CREATOR);
                zzbew.f(parcel);
                ((zzbyg) this).j2(readString15, readString16, zzmVar7, S18, zzbxnVar2, E47, zzbmkVar);
                parcel2.writeNoException();
                break;
            case 23:
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof zzbxe)) {
                        zzbxcVar = new zzbxc(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbwa E48 = zzbvz.E4(parcel.readStrongBinder());
                        zzbew.f(parcel);
                        ((zzbyg) this).G1(readString17, readString18, zzmVar8, S19, zzbxcVar, E48);
                        parcel2.writeNoException();
                        break;
                    } else {
                        zzbxcVar2 = (zzbxe) queryLocalInterface9;
                    }
                }
                zzbxcVar = zzbxcVar2;
                zzbwa E482 = zzbvz.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzbyg) this).G1(readString17, readString18, zzmVar8, S19, zzbxcVar, E482);
                parcel2.writeNoException();
            case 24:
                boolean r = ((zzbyg) this).r(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(r ? 1 : 0);
                break;
        }
        return true;
    }
}

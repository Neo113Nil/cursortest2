package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.f0o;
import defpackage.vlo;
import defpackage.xlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcbh extends zzbev implements zzcbi {
    public zzcbh() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzcbm zzcbmVar = null;
        zzcbn zzcbnVar = null;
        zzcbm zzcbmVar2 = null;
        zzcbm zzcbmVar3 = null;
        zzcbm zzcbmVar4 = null;
        switch (i) {
            case 1:
                zzbew.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzcbj) {
                    }
                }
                zzbew.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcbv zzcbvVar = (zzcbv) zzbew.b(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar = queryLocalInterface2 instanceof zzcbm ? (zzcbm) queryLocalInterface2 : new zzcbk(readStrongBinder2);
                }
                zzbew.f(parcel);
                ((zzejg) this).F0(zzcbvVar, zzcbmVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcbv zzcbvVar2 = (zzcbv) zzbew.b(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar4 = queryLocalInterface3 instanceof zzcbm ? (zzcbm) queryLocalInterface3 : new zzcbk(readStrongBinder3);
                }
                zzbew.f(parcel);
                ((zzejg) this).K3(zzcbvVar2, zzcbmVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcbv zzcbvVar3 = (zzcbv) zzbew.b(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar3 = queryLocalInterface4 instanceof zzcbm ? (zzcbm) queryLocalInterface4 : new zzcbk(readStrongBinder4);
                }
                zzbew.f(parcel);
                ((zzejg) this).o3(zzcbvVar3, zzcbmVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar2 = queryLocalInterface5 instanceof zzcbm ? (zzcbm) queryLocalInterface5 : new zzcbk(readStrongBinder5);
                }
                zzbew.f(parcel);
                ((zzejg) this).e3(readString, zzcbmVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcbe zzcbeVar = (zzcbe) zzbew.b(parcel, zzcbe.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcbnVar = queryLocalInterface6 instanceof zzcbn ? (zzcbn) queryLocalInterface6 : new zzcbn(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                }
                zzbew.f(parcel);
                zzejg zzejgVar = (zzejg) this;
                if (((Boolean) zzblw.a.c()).booleanValue()) {
                    zzejgVar.d.b();
                    String str = zzcbeVar.a;
                    xlo xloVar = xlo.b;
                    xloVar.addListener(new vlo(0, xloVar, new f0o(zzejgVar, zzcbnVar, zzcbeVar)), zzcgj.h);
                } else {
                    try {
                        Parcel J = zzcbnVar.J();
                        J.writeString("");
                        zzbew.c(J, zzcbeVar);
                        zzcbnVar.Z1(J, 1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                ((zzejg) this).zzi(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}

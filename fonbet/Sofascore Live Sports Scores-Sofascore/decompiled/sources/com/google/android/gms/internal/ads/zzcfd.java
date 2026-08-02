package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcfd extends zzbev implements zzcfe {
    public zzcfd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcfe zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcfe ? (zzcfe) queryLocalInterface : new zzcfc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzcfb zzcfbVar = null;
        switch (i) {
            case 1:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcfi zzcfiVar = (zzcfi) zzbew.b(parcel, zzcfi.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcfbVar = queryLocalInterface instanceof zzcfb ? (zzcfb) queryLocalInterface : new zzcez(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                zzbew.f(parcel);
                zze(S1, zzcfiVar, zzcfbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzf(S12);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcai E4 = zzcah.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzg(createTypedArrayList, S13, E4);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcai E42 = zzcah.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzh(createTypedArrayList2, S14, E42);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcal zzcalVar = (zzcal) zzbew.b(parcel, zzcal.CREATOR);
                zzbew.f(parcel);
                zzi(zzcalVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzj(S15);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcai E43 = zzcah.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzk(createTypedArrayList3, S16, E43);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcai E44 = zzcah.E4(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzl(createTypedArrayList4, S17, E44);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper zzm = zzm(IObjectWrapper.Stub.S1(parcel.readStrongBinder()), IObjectWrapper.Stub.S1(parcel.readStrongBinder()), parcel.readString(), x5n.j(parcel, parcel));
                parcel2.writeNoException();
                zzbew.e(parcel2, zzm);
                return true;
            default:
                return false;
        }
    }
}

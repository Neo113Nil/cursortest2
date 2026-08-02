package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgo extends com.google.android.gms.internal.wearable.zzb implements zzgp {
    public zzgo() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        zzgj zzgjVar = null;
        zzgk zzgkVar = null;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.wearable.zzc.a(parcel, DataHolder.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                K1(dataHolder);
                return true;
            case 2:
                zzhk zzhkVar = (zzhk) com.google.android.gms.internal.wearable.zzc.a(parcel, zzhk.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                s1(zzhkVar);
                return true;
            case 3:
                zzib zzibVar = (zzib) com.google.android.gms.internal.wearable.zzc.a(parcel, zzib.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                T(zzibVar);
                return true;
            case 4:
                zzib zzibVar2 = (zzib) com.google.android.gms.internal.wearable.zzc.a(parcel, zzib.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                O0(zzibVar2);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzib.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                I3(createTypedArrayList);
                return true;
            case 6:
                zzl zzlVar = (zzl) com.google.android.gms.internal.wearable.zzc.a(parcel, zzl.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                N3(zzlVar);
                return true;
            case 7:
                zzbq zzbqVar = (zzbq) com.google.android.gms.internal.wearable.zzc.a(parcel, zzbq.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                i2(zzbqVar);
                return true;
            case 8:
                zzao zzaoVar = (zzao) com.google.android.gms.internal.wearable.zzc.a(parcel, zzao.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                X3(zzaoVar);
                return true;
            case 9:
                zzj zzjVar = (zzj) com.google.android.gms.internal.wearable.zzc.a(parcel, zzj.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                u3(zzjVar);
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzhk zzhkVar2 = (zzhk) com.google.android.gms.internal.wearable.zzc.a(parcel, zzhk.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    zzgjVar = queryLocalInterface instanceof zzgj ? (zzgj) queryLocalInterface : new zzgj(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
                }
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                k2(zzhkVar2, zzgjVar);
                return true;
            case 14:
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                return true;
            case 15:
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                return true;
            case 16:
                zzia zziaVar = (zzia) com.google.android.gms.internal.wearable.zzc.a(parcel, zzia.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                c4(zziaVar);
                return true;
            case 17:
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                return true;
            case 18:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IServiceResponseCallback");
                    zzgkVar = queryLocalInterface2 instanceof zzgk ? (zzgk) queryLocalInterface2 : new zzgk(readStrongBinder2, "com.google.android.gms.wearable.internal.IServiceResponseCallback");
                }
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                boolean b3 = b3(zzgkVar);
                parcel2.writeNoException();
                parcel2.writeInt(b3 ? 1 : 0);
                return true;
        }
    }
}

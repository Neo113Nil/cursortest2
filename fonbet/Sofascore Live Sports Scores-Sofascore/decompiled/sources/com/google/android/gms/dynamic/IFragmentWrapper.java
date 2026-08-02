package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            boolean z;
            switch (i) {
                case 2:
                    ObjectWrapper zzb = zzb();
                    parcel2.writeNoException();
                    zzc.b(parcel2, zzb);
                    return true;
                case 3:
                    Bundle zzc = zzc();
                    parcel2.writeNoException();
                    int i2 = zzc.a;
                    if (zzc == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        zzc.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int zzd = zzd();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd);
                    return true;
                case 5:
                    IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    zzc.b(parcel2, zze);
                    return true;
                case 6:
                    ObjectWrapper zzf = zzf();
                    parcel2.writeNoException();
                    zzc.b(parcel2, zzf);
                    return true;
                case 7:
                    boolean zzg = zzg();
                    parcel2.writeNoException();
                    int i3 = zzc.a;
                    parcel2.writeInt(zzg ? 1 : 0);
                    return true;
                case 8:
                    String zzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(zzh);
                    return true;
                case 9:
                    IFragmentWrapper zzi = zzi();
                    parcel2.writeNoException();
                    zzc.b(parcel2, zzi);
                    return true;
                case 10:
                    int zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzj);
                    return true;
                case 11:
                    boolean zzk = zzk();
                    parcel2.writeNoException();
                    int i4 = zzc.a;
                    parcel2.writeInt(zzk ? 1 : 0);
                    return true;
                case 12:
                    ObjectWrapper zzl = zzl();
                    parcel2.writeNoException();
                    zzc.b(parcel2, zzl);
                    return true;
                case 13:
                    boolean zzm = zzm();
                    parcel2.writeNoException();
                    int i5 = zzc.a;
                    parcel2.writeInt(zzm ? 1 : 0);
                    return true;
                case 14:
                    boolean zzn = zzn();
                    parcel2.writeNoException();
                    int i6 = zzc.a;
                    parcel2.writeInt(zzn ? 1 : 0);
                    return true;
                case 15:
                    boolean zzo = zzo();
                    parcel2.writeNoException();
                    int i7 = zzc.a;
                    parcel2.writeInt(zzo ? 1 : 0);
                    return true;
                case 16:
                    boolean zzp = zzp();
                    parcel2.writeNoException();
                    int i8 = zzc.a;
                    parcel2.writeInt(zzp ? 1 : 0);
                    return true;
                case 17:
                    boolean zzq = zzq();
                    parcel2.writeNoException();
                    int i9 = zzc.a;
                    parcel2.writeInt(zzq ? 1 : 0);
                    return true;
                case 18:
                    boolean zzr = zzr();
                    parcel2.writeNoException();
                    int i10 = zzc.a;
                    parcel2.writeInt(zzr ? 1 : 0);
                    return true;
                case 19:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i11 = zzc.a;
                    parcel2.writeInt(zzs ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                    zzc.c(parcel);
                    r(S1);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    int i12 = zzc.a;
                    z = parcel.readInt() != 0;
                    zzc.c(parcel);
                    zzu(z);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    int i13 = zzc.a;
                    z = parcel.readInt() != 0;
                    zzc.c(parcel);
                    i0(z);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int i14 = zzc.a;
                    z = parcel.readInt() != 0;
                    zzc.c(parcel);
                    zzw(z);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int i15 = zzc.a;
                    z = parcel.readInt() != 0;
                    zzc.c(parcel);
                    W1(z);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.a(parcel, Intent.CREATOR);
                    zzc.c(parcel);
                    O3(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.a(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    zzc.c(parcel);
                    N0(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                    zzc.c(parcel);
                    P1(S12);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void N0(Intent intent, int i);

    void O3(Intent intent);

    void P1(IObjectWrapper iObjectWrapper);

    void W1(boolean z);

    void i0(boolean z);

    void r(IObjectWrapper iObjectWrapper);

    ObjectWrapper zzb();

    Bundle zzc();

    int zzd();

    IFragmentWrapper zze();

    ObjectWrapper zzf();

    boolean zzg();

    String zzh();

    IFragmentWrapper zzi();

    int zzj();

    boolean zzk();

    ObjectWrapper zzl();

    boolean zzm();

    boolean zzn();

    boolean zzo();

    boolean zzp();

    boolean zzq();

    boolean zzr();

    boolean zzs();

    void zzu(boolean z);

    void zzw(boolean z);
}

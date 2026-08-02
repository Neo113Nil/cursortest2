package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3233d2 extends zzbm implements InterfaceC3241e2 {
    public AbstractBinderC3233d2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC3289k2 interfaceC3289k2 = null;
        InterfaceC3265h2 interfaceC3265h2 = null;
        switch (i10) {
            case 1:
                zzbg zzbgVar = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                E(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) zzbn.zzb(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                M(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                u0(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbn.zzf(parcel);
                Y(zzbgVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                F(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                boolean zza = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List V10 = V(zzrVar5, zza);
                parcel2.writeNoException();
                parcel2.writeTypedList(V10);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
                String readString3 = parcel.readString();
                zzbn.zzf(parcel);
                byte[] J10 = J(zzbgVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(J10);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbn.zzf(parcel);
                a0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                String S10 = S(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(S10);
                return true;
            case 12:
                zzah zzahVar = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                k(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
                zzbn.zzf(parcel);
                K(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zza2 = zzbn.zza(parcel);
                zzr zzrVar8 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                List y02 = y0(readString7, readString8, zza2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(y02);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zza3 = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List j10 = j(readString9, readString10, readString11, zza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(j10);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzr zzrVar9 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                List F02 = F0(readString12, readString13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(F02);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbn.zzf(parcel);
                List x10 = x(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(x10);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                c0(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                r0(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                K0(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzao o02 = o0(zzrVar13);
                parcel2.writeNoException();
                if (o02 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    o02.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                zzr zzrVar14 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzbn.zzf(parcel);
                List D10 = D(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(D10);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                z(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                H(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                x0(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) zzbn.zzb(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    interfaceC3289k2 = queryLocalInterface instanceof InterfaceC3289k2 ? (InterfaceC3289k2) queryLocalInterface : new C3273i2(readStrongBinder);
                }
                zzbn.zzf(parcel);
                d(zzrVar18, zzooVar, interfaceC3289k2);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) zzbn.zzb(parcel, zzaf.CREATOR);
                zzbn.zzf(parcel);
                l0(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    interfaceC3265h2 = queryLocalInterface2 instanceof InterfaceC3265h2 ? (InterfaceC3265h2) queryLocalInterface2 : new C3249f2(readStrongBinder2);
                }
                zzbn.zzf(parcel);
                h0(zzrVar20, bundle3, interfaceC3265h2);
                parcel2.writeNoException();
                return true;
        }
    }
}

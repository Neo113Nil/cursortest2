package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public abstract class zzfo extends com.google.android.gms.internal.measurement.zzbx implements zzfp {
    public zzfo() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbf zzbfVar = (zzbf) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbf.CREATOR);
                zzn zznVar = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(zzbfVar, zznVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzno zznoVar = (zzno) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzno.CREATOR);
                zzn zznVar2 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(zznoVar, zznVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzn zznVar3 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzc(zznVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbf zzbfVar2 = (zzbf) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbf.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(zzbfVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzn zznVar4 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzg(zznVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzn zznVar5 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                boolean zzc = com.google.android.gms.internal.measurement.zzbw.zzc(parcel);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza = zza(zznVar5, zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 9:
                zzbf zzbfVar3 = (zzbf) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbf.CREATOR);
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                byte[] zza2 = zza(zzbfVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(zza2);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzn zznVar6 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                String zzb = zzb(zznVar6);
                parcel2.writeNoException();
                parcel2.writeString(zzb);
                break;
            case 12:
                zzac zzacVar = (zzac) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzac.CREATOR);
                zzn zznVar7 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(zzacVar, zznVar7);
                parcel2.writeNoException();
                break;
            case 13:
                zzac zzacVar2 = (zzac) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzac.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(zzacVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc2 = com.google.android.gms.internal.measurement.zzbw.zzc(parcel);
                zzn zznVar8 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza3 = zza(readString7, readString8, zzc2, zznVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza3);
                break;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzc3 = com.google.android.gms.internal.measurement.zzbw.zzc(parcel);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza4 = zza(readString9, readString10, readString11, zzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza4);
                break;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzn zznVar9 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzac> zza5 = zza(readString12, readString13, zznVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza5);
                break;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzac> zza6 = zza(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza6);
                break;
            case 18:
                zzn zznVar10 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzd(zznVar10);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.zzbw.zza(parcel, Bundle.CREATOR);
                zzn zznVar11 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(bundle, zznVar11);
                parcel2.writeNoException();
                break;
            case 20:
                zzn zznVar12 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zze(zznVar12);
                parcel2.writeNoException();
                break;
            case 21:
                zzn zznVar13 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzal zza7 = zza(zznVar13);
                parcel2.writeNoException();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel2, zza7);
                break;
            case 24:
                zzn zznVar14 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.zzbw.zza(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzmu> zza8 = zza(zznVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza8);
                break;
            case 25:
                zzn zznVar15 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzh(zznVar15);
                parcel2.writeNoException();
                break;
            case 26:
                zzn zznVar16 = (zzn) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzn.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzf(zznVar16);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}

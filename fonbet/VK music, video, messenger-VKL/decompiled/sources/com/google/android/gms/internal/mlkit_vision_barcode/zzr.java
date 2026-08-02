package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.l(parcel, readInt, Point.CREATOR);
                    break;
                case 7:
                    zzjVar = (zzj) SafeParcelReader.h(parcel, readInt, zzj.CREATOR);
                    break;
                case '\b':
                    zzmVar = (zzm) SafeParcelReader.h(parcel, readInt, zzm.CREATOR);
                    break;
                case '\t':
                    zznVar = (zzn) SafeParcelReader.h(parcel, readInt, zzn.CREATOR);
                    break;
                case '\n':
                    zzpVar = (zzp) SafeParcelReader.h(parcel, readInt, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) SafeParcelReader.h(parcel, readInt, zzo.CREATOR);
                    break;
                case '\f':
                    zzkVar = (zzk) SafeParcelReader.h(parcel, readInt, zzk.CREATOR);
                    break;
                case '\r':
                    zzgVar = (zzg) SafeParcelReader.h(parcel, readInt, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) SafeParcelReader.h(parcel, readInt, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) SafeParcelReader.h(parcel, readInt, zzi.CREATOR);
                    break;
                case 16:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 17:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 18:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzq(i, str, str2, i2, pointArr, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar, bArr, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}

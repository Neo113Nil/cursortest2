package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzsf zzsfVar = null;
        zzsi zzsiVar = null;
        zzsj zzsjVar = null;
        zzsl zzslVar = null;
        zzsk zzskVar = null;
        zzsg zzsgVar = null;
        zzsc zzscVar = null;
        zzsd zzsdVar = null;
        zzse zzseVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.l(parcel, readInt, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    zzsfVar = (zzsf) SafeParcelReader.h(parcel, readInt, zzsf.CREATOR);
                    break;
                case '\b':
                    zzsiVar = (zzsi) SafeParcelReader.h(parcel, readInt, zzsi.CREATOR);
                    break;
                case '\t':
                    zzsjVar = (zzsj) SafeParcelReader.h(parcel, readInt, zzsj.CREATOR);
                    break;
                case '\n':
                    zzslVar = (zzsl) SafeParcelReader.h(parcel, readInt, zzsl.CREATOR);
                    break;
                case 11:
                    zzskVar = (zzsk) SafeParcelReader.h(parcel, readInt, zzsk.CREATOR);
                    break;
                case '\f':
                    zzsgVar = (zzsg) SafeParcelReader.h(parcel, readInt, zzsg.CREATOR);
                    break;
                case '\r':
                    zzscVar = (zzsc) SafeParcelReader.h(parcel, readInt, zzsc.CREATOR);
                    break;
                case 14:
                    zzsdVar = (zzsd) SafeParcelReader.h(parcel, readInt, zzsd.CREATOR);
                    break;
                case 15:
                    zzseVar = (zzse) SafeParcelReader.h(parcel, readInt, zzse.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzsm(i, str, str2, bArr, pointArr, i2, zzsfVar, zzsiVar, zzsjVar, zzslVar, zzskVar, zzsgVar, zzscVar, zzsdVar, zzseVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsm[i];
    }
}

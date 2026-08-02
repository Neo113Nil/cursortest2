package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzss implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzsh zzshVar = null;
        String str = null;
        String str2 = null;
        zzsi[] zzsiVarArr = null;
        zzsf[] zzsfVarArr = null;
        String[] strArr = null;
        zzsa[] zzsaVarArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzshVar = (zzsh) SafeParcelReader.h(parcel, readInt, zzsh.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    zzsiVarArr = (zzsi[]) SafeParcelReader.l(parcel, readInt, zzsi.CREATOR);
                    break;
                case 5:
                    zzsfVarArr = (zzsf[]) SafeParcelReader.l(parcel, readInt, zzsf.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.j(parcel, readInt);
                    break;
                case 7:
                    zzsaVarArr = (zzsa[]) SafeParcelReader.l(parcel, readInt, zzsa.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzsd(zzshVar, str, str2, zzsiVarArr, zzsfVarArr, strArr, zzsaVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsd[i];
    }
}

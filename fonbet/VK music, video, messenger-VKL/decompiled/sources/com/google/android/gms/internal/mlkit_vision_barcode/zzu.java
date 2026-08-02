package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzl zzlVar = null;
        String str = null;
        String str2 = null;
        zzm[] zzmVarArr = null;
        zzj[] zzjVarArr = null;
        String[] strArr = null;
        zze[] zzeVarArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzlVar = (zzl) SafeParcelReader.h(parcel, readInt, zzl.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    zzmVarArr = (zzm[]) SafeParcelReader.l(parcel, readInt, zzm.CREATOR);
                    break;
                case 6:
                    zzjVarArr = (zzj[]) SafeParcelReader.l(parcel, readInt, zzj.CREATOR);
                    break;
                case 7:
                    strArr = SafeParcelReader.j(parcel, readInt);
                    break;
                case '\b':
                    zzeVarArr = (zze[]) SafeParcelReader.l(parcel, readInt, zze.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzh(zzlVar, str, str2, zzmVarArr, zzjVarArr, strArr, zzeVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}

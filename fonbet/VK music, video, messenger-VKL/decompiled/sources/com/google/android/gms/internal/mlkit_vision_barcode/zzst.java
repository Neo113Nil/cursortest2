package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzst implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    str13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                    str14 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzse[i];
    }
}

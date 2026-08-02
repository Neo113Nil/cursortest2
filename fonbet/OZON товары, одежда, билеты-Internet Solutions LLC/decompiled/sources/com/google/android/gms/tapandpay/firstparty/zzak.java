package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzak implements Parcelable.Creator<zzaj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaj createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
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
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        long j11 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 15:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 16:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    str15 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 18:
                    str16 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 20:
                    str17 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    str18 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 22:
                    str19 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 23:
                    str20 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 24:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j11, str14, str15, str16, str17, str18, str19, str20, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj[] newArray(int i11) {
        return new zzaj[i11];
    }
}

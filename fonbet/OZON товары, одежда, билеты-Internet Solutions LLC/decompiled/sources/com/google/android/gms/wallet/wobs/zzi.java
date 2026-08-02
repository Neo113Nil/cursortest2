package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzi implements Parcelable.Creator<LoyaltyPointsBalance> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPointsBalance createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        String str = null;
        String str2 = null;
        double d11 = 0.0d;
        long j11 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    d11 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LoyaltyPointsBalance(i11, str, d11, str2, j11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPointsBalance[] newArray(int i11) {
        return new LoyaltyPointsBalance[i11];
    }
}

package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzay implements Parcelable.Creator<TokenStatus> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenStatus createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzaw zzawVar = null;
        int i11 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                zzawVar = (zzaw) SafeParcelReader.createParcelable(parcel, readHeader, zzaw.CREATOR);
            } else if (fieldId == 3) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new TokenStatus(zzawVar, i11, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenStatus[] newArray(int i11) {
        return new TokenStatus[i11];
    }
}

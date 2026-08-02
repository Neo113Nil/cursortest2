package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzd implements Parcelable.Creator<GetGlobalActionCardsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetGlobalActionCardsResponse createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        GlobalActionCard[] globalActionCardArr = null;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                globalActionCardArr = (GlobalActionCard[]) SafeParcelReader.createTypedArray(parcel, readHeader, GlobalActionCard.CREATOR);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GetGlobalActionCardsResponse(globalActionCardArr, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetGlobalActionCardsResponse[] newArray(int i11) {
        return new GetGlobalActionCardsResponse[i11];
    }
}

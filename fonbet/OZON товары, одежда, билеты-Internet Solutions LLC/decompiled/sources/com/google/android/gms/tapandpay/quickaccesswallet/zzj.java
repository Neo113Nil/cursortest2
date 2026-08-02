package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzj implements Parcelable.Creator<SetQuickAccessWalletCardsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SetQuickAccessWalletCardsRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        Account account = null;
        QuickAccessWalletCard[] quickAccessWalletCardArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                account = (Account) SafeParcelReader.createParcelable(parcel, readHeader, Account.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                quickAccessWalletCardArr = (QuickAccessWalletCard[]) SafeParcelReader.createTypedArray(parcel, readHeader, QuickAccessWalletCard.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SetQuickAccessWalletCardsRequest(i11, account, quickAccessWalletCardArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SetQuickAccessWalletCardsRequest[] newArray(int i11) {
        return new SetQuickAccessWalletCardsRequest[i11];
    }
}

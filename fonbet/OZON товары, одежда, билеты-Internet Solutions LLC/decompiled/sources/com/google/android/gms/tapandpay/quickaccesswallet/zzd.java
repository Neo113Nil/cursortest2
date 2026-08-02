package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzd implements Parcelable.Creator<GetQuickAccessWalletConfigRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetQuickAccessWalletConfigRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        Account account = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                account = (Account) SafeParcelReader.createParcelable(parcel, readHeader, Account.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GetQuickAccessWalletConfigRequest(i11, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetQuickAccessWalletConfigRequest[] newArray(int i11) {
        return new GetQuickAccessWalletConfigRequest[i11];
    }
}

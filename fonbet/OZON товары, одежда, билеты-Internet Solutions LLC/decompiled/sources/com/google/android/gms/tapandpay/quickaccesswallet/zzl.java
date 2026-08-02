package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzl implements Parcelable.Creator<WalletCardIntent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WalletCardIntent createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        WalletCardIntentExtra[] walletCardIntentExtraArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                walletCardIntentExtraArr = (WalletCardIntentExtra[]) SafeParcelReader.createTypedArray(parcel, readHeader, WalletCardIntentExtra.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new WalletCardIntent(str, str2, walletCardIntentExtraArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WalletCardIntent[] newArray(int i11) {
        return new WalletCardIntent[i11];
    }
}

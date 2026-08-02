package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzf implements Parcelable.Creator<QuickAccessWalletCard> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QuickAccessWalletCard createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        WalletCardIntent[] walletCardIntentArr = null;
        CardIconMessage[] cardIconMessageArr = null;
        long j11 = 0;
        long j12 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    bitmap = (Bitmap) SafeParcelReader.createParcelable(parcel, readHeader, Bitmap.CREATOR);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    walletCardIntentArr = (WalletCardIntent[]) SafeParcelReader.createTypedArray(parcel, readHeader, WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (CardIconMessage[]) SafeParcelReader.createTypedArray(parcel, readHeader, CardIconMessage.CREATOR);
                    break;
                case 6:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new QuickAccessWalletCard(str, bitmap, str2, walletCardIntentArr, cardIconMessageArr, j11, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ QuickAccessWalletCard[] newArray(int i11) {
        return new QuickAccessWalletCard[i11];
    }
}

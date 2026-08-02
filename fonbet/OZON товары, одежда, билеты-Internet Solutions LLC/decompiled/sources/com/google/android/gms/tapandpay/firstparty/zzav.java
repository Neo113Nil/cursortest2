package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzav implements Parcelable.Creator<zzau> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzau createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        TokenStatus tokenStatus = null;
        String str3 = null;
        Uri uri = null;
        byte[] bArr = null;
        zzan[] zzanVarArr = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, readHeader, TokenStatus.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 7:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 8:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzan.CREATOR);
                    break;
                case 9:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzau(str, str2, i11, tokenStatus, str3, uri, bArr, zzanVarArr, i12, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau[] newArray(int i11) {
        return new zzau[i11];
    }
}

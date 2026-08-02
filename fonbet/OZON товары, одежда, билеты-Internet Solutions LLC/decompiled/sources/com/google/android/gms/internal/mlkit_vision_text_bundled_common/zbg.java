package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        zbj[] zbjVarArr = null;
        zbd zbdVar = null;
        zbd zbdVar2 = null;
        zbd zbdVar3 = null;
        String str = null;
        String str2 = null;
        float f7 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zbjVarArr = (zbj[]) SafeParcelReader.createTypedArray(parcel, readHeader, zbj.CREATOR);
                    break;
                case 3:
                    zbdVar = (zbd) SafeParcelReader.createParcelable(parcel, readHeader, zbd.CREATOR);
                    break;
                case 4:
                    zbdVar2 = (zbd) SafeParcelReader.createParcelable(parcel, readHeader, zbd.CREATOR);
                    break;
                case 5:
                    zbdVar3 = (zbd) SafeParcelReader.createParcelable(parcel, readHeader, zbd.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    f7 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zbf(zbjVarArr, zbdVar, zbdVar2, zbdVar3, str, f7, str2, i11, z11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zbf[i11];
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 1000;
        int i12 = 1;
        int i13 = 1;
        long j11 = 0;
        zzac[] zzacVarArr = null;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    zzacVarArr = (zzac[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzac.CREATOR);
                    break;
                case 6:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationAvailability(i11, i12, i13, j11, zzacVarArr, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new LocationAvailability[i11];
    }
}

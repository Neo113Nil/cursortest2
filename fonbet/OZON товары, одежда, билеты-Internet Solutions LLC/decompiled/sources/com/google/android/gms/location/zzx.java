package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes9.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        int i11 = 102;
        long j11 = 3600000;
        long j12 = 600000;
        long j13 = 0;
        long j14 = Long.MAX_VALUE;
        long j15 = Long.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        float f7 = 0.0f;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        long j16 = -1;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 5:
                    j14 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f7 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    j15 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j16 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 15:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, readHeader, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationRequest(i11, j11, j12, j13, j14, j15, i12, f7, z11, j16, i13, i14, str, z12, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new LocationRequest[i11];
    }
}

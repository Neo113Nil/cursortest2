package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = "";
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = false;
        int i11 = 0;
        boolean z14 = false;
        long j16 = -2147483648L;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j16 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 14:
                    j14 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j15 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 24:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzq(str3, str4, str5, str6, j11, j12, str7, z11, z13, j16, str8, j13, j14, i11, z12, z14, str9, bool, j15, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzq[i11];
    }
}

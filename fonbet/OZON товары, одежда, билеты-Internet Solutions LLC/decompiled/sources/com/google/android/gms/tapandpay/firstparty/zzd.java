package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes9.dex */
public final class zzd implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardInfo createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        TokenStatus tokenStatus = null;
        String str4 = null;
        Uri uri = null;
        zzaj zzajVar = null;
        String str5 = null;
        zzaz zzazVar = null;
        String str6 = null;
        byte[] bArr2 = null;
        zzah zzahVar = null;
        zzaf zzafVar = null;
        String str7 = null;
        zzan[] zzanVarArr = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        zze zzeVar = null;
        String str10 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i17 = 0;
        boolean z15 = false;
        int i18 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, readHeader, TokenStatus.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 10:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 11:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    zzajVar = (zzaj) SafeParcelReader.createParcelable(parcel, readHeader, zzaj.CREATOR);
                    break;
                case 13:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 15:
                    zzazVar = (zzaz) SafeParcelReader.createParcelable(parcel, readHeader, zzaz.CREATOR);
                    break;
                case 16:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 18:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 21:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 22:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, readHeader, zzah.CREATOR);
                    break;
                case 23:
                    zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, readHeader, zzaf.CREATOR);
                    break;
                case 24:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzan.CREATOR);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzb.CREATOR);
                    break;
                case 28:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 29:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 32:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 33:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 34:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i17 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 38:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 40:
                    i18 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CardInfo(str, bArr, str2, str3, i11, tokenStatus, str4, uri, i12, i13, zzajVar, str5, zzazVar, str6, bArr2, i14, i15, i16, zzahVar, zzafVar, str7, zzanVarArr, z11, arrayList, z12, z13, j11, j12, z14, j13, str8, str9, zzeVar, i17, z15, str10, i18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardInfo[] newArray(int i11) {
        return new CardInfo[i11];
    }
}

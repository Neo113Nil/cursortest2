package com.vk.api.generated.id.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdAuthViewTypeDto.kt */
/* loaded from: classes14.dex */
public final class IdAuthViewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdAuthViewTypeDto[] $VALUES;
    public static final Parcelable.Creator<IdAuthViewTypeDto> CREATOR;

    @pmi0(DownloadCommon.DOWNLOAD_REPORT_RETURN_FROM_CACHE)
    public static final IdAuthViewTypeDto RFC;

    @pmi0("sdk")
    public static final IdAuthViewTypeDto SDK;
    private final String value;

    /* compiled from: IdAuthViewTypeDto.kt */
    public static final class a implements Parcelable.Creator<IdAuthViewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final IdAuthViewTypeDto createFromParcel(Parcel parcel) {
            return IdAuthViewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdAuthViewTypeDto[] newArray(int i) {
            return new IdAuthViewTypeDto[i];
        }
    }

    static {
        IdAuthViewTypeDto idAuthViewTypeDto = new IdAuthViewTypeDto("RFC", 0, DownloadCommon.DOWNLOAD_REPORT_RETURN_FROM_CACHE);
        RFC = idAuthViewTypeDto;
        IdAuthViewTypeDto idAuthViewTypeDto2 = new IdAuthViewTypeDto("SDK", 1, "sdk");
        SDK = idAuthViewTypeDto2;
        IdAuthViewTypeDto[] idAuthViewTypeDtoArr = {idAuthViewTypeDto, idAuthViewTypeDto2};
        $VALUES = idAuthViewTypeDtoArr;
        $ENTRIES = new asp(idAuthViewTypeDtoArr);
        CREATOR = new a();
    }

    private IdAuthViewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static IdAuthViewTypeDto valueOf(String str) {
        return (IdAuthViewTypeDto) Enum.valueOf(IdAuthViewTypeDto.class, str);
    }

    public static IdAuthViewTypeDto[] values() {
        return (IdAuthViewTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

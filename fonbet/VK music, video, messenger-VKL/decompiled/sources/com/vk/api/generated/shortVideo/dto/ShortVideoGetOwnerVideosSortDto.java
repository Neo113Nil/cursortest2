package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetOwnerVideosSortDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetOwnerVideosSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetOwnerVideosSortDto[] $VALUES;

    @pmi0("asc")
    public static final ShortVideoGetOwnerVideosSortDto ASC;
    public static final Parcelable.Creator<ShortVideoGetOwnerVideosSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final ShortVideoGetOwnerVideosSortDto DESC;
    private final String value;

    /* compiled from: ShortVideoGetOwnerVideosSortDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetOwnerVideosSortDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosSortDto createFromParcel(Parcel parcel) {
            return ShortVideoGetOwnerVideosSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosSortDto[] newArray(int i) {
            return new ShortVideoGetOwnerVideosSortDto[i];
        }
    }

    static {
        ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto = new ShortVideoGetOwnerVideosSortDto("ASC", 0, "asc");
        ASC = shortVideoGetOwnerVideosSortDto;
        ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto2 = new ShortVideoGetOwnerVideosSortDto("DESC", 1, CampaignEx.JSON_KEY_DESC);
        DESC = shortVideoGetOwnerVideosSortDto2;
        ShortVideoGetOwnerVideosSortDto[] shortVideoGetOwnerVideosSortDtoArr = {shortVideoGetOwnerVideosSortDto, shortVideoGetOwnerVideosSortDto2};
        $VALUES = shortVideoGetOwnerVideosSortDtoArr;
        $ENTRIES = new asp(shortVideoGetOwnerVideosSortDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetOwnerVideosSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetOwnerVideosSortDto valueOf(String str) {
        return (ShortVideoGetOwnerVideosSortDto) Enum.valueOf(ShortVideoGetOwnerVideosSortDto.class, str);
    }

    public static ShortVideoGetOwnerVideosSortDto[] values() {
        return (ShortVideoGetOwnerVideosSortDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

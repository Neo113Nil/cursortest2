package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGetCommentsExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentsExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetCommentsExtendedSortDto[] $VALUES;

    @pmi0("asc")
    public static final WallGetCommentsExtendedSortDto CHRONOLOGICAL;
    public static final Parcelable.Creator<WallGetCommentsExtendedSortDto> CREATOR;

    @pmi0("smart")
    public static final WallGetCommentsExtendedSortDto MOST_INTERESTING;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final WallGetCommentsExtendedSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    /* compiled from: WallGetCommentsExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentsExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsExtendedSortDto createFromParcel(Parcel parcel) {
            return WallGetCommentsExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsExtendedSortDto[] newArray(int i) {
            return new WallGetCommentsExtendedSortDto[i];
        }
    }

    static {
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto = new WallGetCommentsExtendedSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = wallGetCommentsExtendedSortDto;
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto2 = new WallGetCommentsExtendedSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = wallGetCommentsExtendedSortDto2;
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto3 = new WallGetCommentsExtendedSortDto("MOST_INTERESTING", 2, "smart");
        MOST_INTERESTING = wallGetCommentsExtendedSortDto3;
        WallGetCommentsExtendedSortDto[] wallGetCommentsExtendedSortDtoArr = {wallGetCommentsExtendedSortDto, wallGetCommentsExtendedSortDto2, wallGetCommentsExtendedSortDto3};
        $VALUES = wallGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(wallGetCommentsExtendedSortDtoArr);
        CREATOR = new a();
    }

    private WallGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetCommentsExtendedSortDto valueOf(String str) {
        return (WallGetCommentsExtendedSortDto) Enum.valueOf(WallGetCommentsExtendedSortDto.class, str);
    }

    public static WallGetCommentsExtendedSortDto[] values() {
        return (WallGetCommentsExtendedSortDto[]) $VALUES.clone();
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

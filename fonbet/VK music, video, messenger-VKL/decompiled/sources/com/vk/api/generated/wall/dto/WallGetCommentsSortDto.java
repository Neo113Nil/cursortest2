package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGetCommentsSortDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetCommentsSortDto[] $VALUES;

    @pmi0("asc")
    public static final WallGetCommentsSortDto CHRONOLOGICAL;
    public static final Parcelable.Creator<WallGetCommentsSortDto> CREATOR;

    @pmi0("smart")
    public static final WallGetCommentsSortDto MOST_INTERESTING;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final WallGetCommentsSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    /* compiled from: WallGetCommentsSortDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsSortDto createFromParcel(Parcel parcel) {
            return WallGetCommentsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsSortDto[] newArray(int i) {
            return new WallGetCommentsSortDto[i];
        }
    }

    static {
        WallGetCommentsSortDto wallGetCommentsSortDto = new WallGetCommentsSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = wallGetCommentsSortDto;
        WallGetCommentsSortDto wallGetCommentsSortDto2 = new WallGetCommentsSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = wallGetCommentsSortDto2;
        WallGetCommentsSortDto wallGetCommentsSortDto3 = new WallGetCommentsSortDto("MOST_INTERESTING", 2, "smart");
        MOST_INTERESTING = wallGetCommentsSortDto3;
        WallGetCommentsSortDto[] wallGetCommentsSortDtoArr = {wallGetCommentsSortDto, wallGetCommentsSortDto2, wallGetCommentsSortDto3};
        $VALUES = wallGetCommentsSortDtoArr;
        $ENTRIES = new asp(wallGetCommentsSortDtoArr);
        CREATOR = new a();
    }

    private WallGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetCommentsSortDto valueOf(String str) {
        return (WallGetCommentsSortDto) Enum.valueOf(WallGetCommentsSortDto.class, str);
    }

    public static WallGetCommentsSortDto[] values() {
        return (WallGetCommentsSortDto[]) $VALUES.clone();
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

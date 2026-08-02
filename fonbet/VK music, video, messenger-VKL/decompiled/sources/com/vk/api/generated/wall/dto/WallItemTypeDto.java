package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallItemTypeDto[] $VALUES;

    @pmi0("ads_yandex")
    public static final WallItemTypeDto ADS_YANDEX;
    public static final Parcelable.Creator<WallItemTypeDto> CREATOR;

    @pmi0("donut_wall_donate_block")
    public static final WallItemTypeDto DONUT_WALL_DONATE_BLOCK;

    @pmi0("post")
    public static final WallItemTypeDto POST;
    private final String value;

    /* compiled from: WallItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallItemTypeDto createFromParcel(Parcel parcel) {
            return WallItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallItemTypeDto[] newArray(int i) {
            return new WallItemTypeDto[i];
        }
    }

    static {
        WallItemTypeDto wallItemTypeDto = new WallItemTypeDto("ADS_YANDEX", 0, "ads_yandex");
        ADS_YANDEX = wallItemTypeDto;
        WallItemTypeDto wallItemTypeDto2 = new WallItemTypeDto("DONUT_WALL_DONATE_BLOCK", 1, "donut_wall_donate_block");
        DONUT_WALL_DONATE_BLOCK = wallItemTypeDto2;
        WallItemTypeDto wallItemTypeDto3 = new WallItemTypeDto("POST", 2, "post");
        POST = wallItemTypeDto3;
        WallItemTypeDto[] wallItemTypeDtoArr = {wallItemTypeDto, wallItemTypeDto2, wallItemTypeDto3};
        $VALUES = wallItemTypeDtoArr;
        $ENTRIES = new asp(wallItemTypeDtoArr);
        CREATOR = new a();
    }

    private WallItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallItemTypeDto valueOf(String str) {
        return (WallItemTypeDto) Enum.valueOf(WallItemTypeDto.class, str);
    }

    public static WallItemTypeDto[] values() {
        return (WallItemTypeDto[]) $VALUES.clone();
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

package com.vk.api.generated.yoga.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: YogaAlignDto.kt */
/* loaded from: classes15.dex */
public final class YogaAlignDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ YogaAlignDto[] $VALUES;

    @pmi0("0")
    public static final YogaAlignDto AUTO;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final YogaAlignDto BASELINE;

    @pmi0("2")
    public static final YogaAlignDto CENTER;
    public static final Parcelable.Creator<YogaAlignDto> CREATOR;

    @pmi0("3")
    public static final YogaAlignDto FLEX_END;

    @pmi0("1")
    public static final YogaAlignDto FLEX_START;

    @pmi0(Gc.e)
    public static final YogaAlignDto SPACE_AROUND;

    @pmi0("6")
    public static final YogaAlignDto SPACE_BETWEEN;

    @pmi0("4")
    public static final YogaAlignDto STRETCH;
    private final int value;

    /* compiled from: YogaAlignDto.kt */
    public static final class a implements Parcelable.Creator<YogaAlignDto> {
        @Override // android.os.Parcelable.Creator
        public final YogaAlignDto createFromParcel(Parcel parcel) {
            return YogaAlignDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final YogaAlignDto[] newArray(int i) {
            return new YogaAlignDto[i];
        }
    }

    static {
        YogaAlignDto yogaAlignDto = new YogaAlignDto("AUTO", 0, 0);
        AUTO = yogaAlignDto;
        YogaAlignDto yogaAlignDto2 = new YogaAlignDto("FLEX_START", 1, 1);
        FLEX_START = yogaAlignDto2;
        YogaAlignDto yogaAlignDto3 = new YogaAlignDto("CENTER", 2, 2);
        CENTER = yogaAlignDto3;
        YogaAlignDto yogaAlignDto4 = new YogaAlignDto("FLEX_END", 3, 3);
        FLEX_END = yogaAlignDto4;
        YogaAlignDto yogaAlignDto5 = new YogaAlignDto("STRETCH", 4, 4);
        STRETCH = yogaAlignDto5;
        YogaAlignDto yogaAlignDto6 = new YogaAlignDto("BASELINE", 5, 5);
        BASELINE = yogaAlignDto6;
        YogaAlignDto yogaAlignDto7 = new YogaAlignDto("SPACE_BETWEEN", 6, 6);
        SPACE_BETWEEN = yogaAlignDto7;
        YogaAlignDto yogaAlignDto8 = new YogaAlignDto("SPACE_AROUND", 7, 7);
        SPACE_AROUND = yogaAlignDto8;
        YogaAlignDto[] yogaAlignDtoArr = {yogaAlignDto, yogaAlignDto2, yogaAlignDto3, yogaAlignDto4, yogaAlignDto5, yogaAlignDto6, yogaAlignDto7, yogaAlignDto8};
        $VALUES = yogaAlignDtoArr;
        $ENTRIES = new asp(yogaAlignDtoArr);
        CREATOR = new a();
    }

    private YogaAlignDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static YogaAlignDto valueOf(String str) {
        return (YogaAlignDto) Enum.valueOf(YogaAlignDto.class, str);
    }

    public static YogaAlignDto[] values() {
        return (YogaAlignDto[]) $VALUES.clone();
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

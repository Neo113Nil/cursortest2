package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiLineBreakModeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiLineBreakModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiLineBreakModeDto[] $VALUES;

    @pmi0("1")
    public static final AtumVkuiLineBreakModeDto BY_CHAR_WRAPPING;

    @pmi0("2")
    public static final AtumVkuiLineBreakModeDto BY_CLIPPING;

    @pmi0("3")
    public static final AtumVkuiLineBreakModeDto BY_TRUNCATING_HEAD;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumVkuiLineBreakModeDto BY_TRUNCATING_MIDDLE;

    @pmi0("4")
    public static final AtumVkuiLineBreakModeDto BY_TRUNCATING_TAIL;

    @pmi0("0")
    public static final AtumVkuiLineBreakModeDto BY_WORD_WRAPPING;
    public static final Parcelable.Creator<AtumVkuiLineBreakModeDto> CREATOR;
    private final int value;

    /* compiled from: AtumVkuiLineBreakModeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiLineBreakModeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiLineBreakModeDto createFromParcel(Parcel parcel) {
            return AtumVkuiLineBreakModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiLineBreakModeDto[] newArray(int i) {
            return new AtumVkuiLineBreakModeDto[i];
        }
    }

    static {
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto = new AtumVkuiLineBreakModeDto("BY_WORD_WRAPPING", 0, 0);
        BY_WORD_WRAPPING = atumVkuiLineBreakModeDto;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto2 = new AtumVkuiLineBreakModeDto("BY_CHAR_WRAPPING", 1, 1);
        BY_CHAR_WRAPPING = atumVkuiLineBreakModeDto2;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto3 = new AtumVkuiLineBreakModeDto("BY_CLIPPING", 2, 2);
        BY_CLIPPING = atumVkuiLineBreakModeDto3;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto4 = new AtumVkuiLineBreakModeDto("BY_TRUNCATING_HEAD", 3, 3);
        BY_TRUNCATING_HEAD = atumVkuiLineBreakModeDto4;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto5 = new AtumVkuiLineBreakModeDto("BY_TRUNCATING_TAIL", 4, 4);
        BY_TRUNCATING_TAIL = atumVkuiLineBreakModeDto5;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto6 = new AtumVkuiLineBreakModeDto("BY_TRUNCATING_MIDDLE", 5, 5);
        BY_TRUNCATING_MIDDLE = atumVkuiLineBreakModeDto6;
        AtumVkuiLineBreakModeDto[] atumVkuiLineBreakModeDtoArr = {atumVkuiLineBreakModeDto, atumVkuiLineBreakModeDto2, atumVkuiLineBreakModeDto3, atumVkuiLineBreakModeDto4, atumVkuiLineBreakModeDto5, atumVkuiLineBreakModeDto6};
        $VALUES = atumVkuiLineBreakModeDtoArr;
        $ENTRIES = new asp(atumVkuiLineBreakModeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiLineBreakModeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiLineBreakModeDto valueOf(String str) {
        return (AtumVkuiLineBreakModeDto) Enum.valueOf(AtumVkuiLineBreakModeDto.class, str);
    }

    public static AtumVkuiLineBreakModeDto[] values() {
        return (AtumVkuiLineBreakModeDto[]) $VALUES.clone();
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

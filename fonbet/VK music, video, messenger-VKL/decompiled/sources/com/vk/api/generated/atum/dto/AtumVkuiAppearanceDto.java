package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiAppearanceDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiAppearanceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiAppearanceDto[] $VALUES;

    @pmi0("0")
    public static final AtumVkuiAppearanceDto ACCENT;

    @pmi0("4")
    public static final AtumVkuiAppearanceDto CONTRAST;
    public static final Parcelable.Creator<AtumVkuiAppearanceDto> CREATOR;

    @pmi0("3")
    public static final AtumVkuiAppearanceDto NEGATIVE;

    @pmi0("1")
    public static final AtumVkuiAppearanceDto NEUTRAL;

    @pmi0("2")
    public static final AtumVkuiAppearanceDto POSITIVE;
    private final int value;

    /* compiled from: AtumVkuiAppearanceDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiAppearanceDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAppearanceDto createFromParcel(Parcel parcel) {
            return AtumVkuiAppearanceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAppearanceDto[] newArray(int i) {
            return new AtumVkuiAppearanceDto[i];
        }
    }

    static {
        AtumVkuiAppearanceDto atumVkuiAppearanceDto = new AtumVkuiAppearanceDto("ACCENT", 0, 0);
        ACCENT = atumVkuiAppearanceDto;
        AtumVkuiAppearanceDto atumVkuiAppearanceDto2 = new AtumVkuiAppearanceDto("NEUTRAL", 1, 1);
        NEUTRAL = atumVkuiAppearanceDto2;
        AtumVkuiAppearanceDto atumVkuiAppearanceDto3 = new AtumVkuiAppearanceDto("POSITIVE", 2, 2);
        POSITIVE = atumVkuiAppearanceDto3;
        AtumVkuiAppearanceDto atumVkuiAppearanceDto4 = new AtumVkuiAppearanceDto("NEGATIVE", 3, 3);
        NEGATIVE = atumVkuiAppearanceDto4;
        AtumVkuiAppearanceDto atumVkuiAppearanceDto5 = new AtumVkuiAppearanceDto("CONTRAST", 4, 4);
        CONTRAST = atumVkuiAppearanceDto5;
        AtumVkuiAppearanceDto[] atumVkuiAppearanceDtoArr = {atumVkuiAppearanceDto, atumVkuiAppearanceDto2, atumVkuiAppearanceDto3, atumVkuiAppearanceDto4, atumVkuiAppearanceDto5};
        $VALUES = atumVkuiAppearanceDtoArr;
        $ENTRIES = new asp(atumVkuiAppearanceDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiAppearanceDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiAppearanceDto valueOf(String str) {
        return (AtumVkuiAppearanceDto) Enum.valueOf(AtumVkuiAppearanceDto.class, str);
    }

    public static AtumVkuiAppearanceDto[] values() {
        return (AtumVkuiAppearanceDto[]) $VALUES.clone();
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

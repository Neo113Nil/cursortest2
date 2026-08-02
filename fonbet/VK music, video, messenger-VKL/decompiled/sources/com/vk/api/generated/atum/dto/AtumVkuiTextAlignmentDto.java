package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiTextAlignmentDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiTextAlignmentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiTextAlignmentDto[] $VALUES;

    @pmi0("2")
    public static final AtumVkuiTextAlignmentDto CENTER;
    public static final Parcelable.Creator<AtumVkuiTextAlignmentDto> CREATOR;

    @pmi0("0")
    public static final AtumVkuiTextAlignmentDto LEFT;

    @pmi0("3")
    public static final AtumVkuiTextAlignmentDto NATURAL;

    @pmi0("1")
    public static final AtumVkuiTextAlignmentDto RIGHT;
    private final int value;

    /* compiled from: AtumVkuiTextAlignmentDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiTextAlignmentDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiTextAlignmentDto createFromParcel(Parcel parcel) {
            return AtumVkuiTextAlignmentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiTextAlignmentDto[] newArray(int i) {
            return new AtumVkuiTextAlignmentDto[i];
        }
    }

    static {
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto = new AtumVkuiTextAlignmentDto("LEFT", 0, 0);
        LEFT = atumVkuiTextAlignmentDto;
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto2 = new AtumVkuiTextAlignmentDto("RIGHT", 1, 1);
        RIGHT = atumVkuiTextAlignmentDto2;
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto3 = new AtumVkuiTextAlignmentDto("CENTER", 2, 2);
        CENTER = atumVkuiTextAlignmentDto3;
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto4 = new AtumVkuiTextAlignmentDto("NATURAL", 3, 3);
        NATURAL = atumVkuiTextAlignmentDto4;
        AtumVkuiTextAlignmentDto[] atumVkuiTextAlignmentDtoArr = {atumVkuiTextAlignmentDto, atumVkuiTextAlignmentDto2, atumVkuiTextAlignmentDto3, atumVkuiTextAlignmentDto4};
        $VALUES = atumVkuiTextAlignmentDtoArr;
        $ENTRIES = new asp(atumVkuiTextAlignmentDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiTextAlignmentDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiTextAlignmentDto valueOf(String str) {
        return (AtumVkuiTextAlignmentDto) Enum.valueOf(AtumVkuiTextAlignmentDto.class, str);
    }

    public static AtumVkuiTextAlignmentDto[] values() {
        return (AtumVkuiTextAlignmentDto[]) $VALUES.clone();
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

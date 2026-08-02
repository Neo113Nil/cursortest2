package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumTextAlignmentDto.kt */
/* loaded from: classes14.dex */
public final class AtumTextAlignmentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumTextAlignmentDto[] $VALUES;

    @pmi0("2")
    public static final AtumTextAlignmentDto CENTER;
    public static final Parcelable.Creator<AtumTextAlignmentDto> CREATOR;

    @pmi0("0")
    public static final AtumTextAlignmentDto LEFT;

    @pmi0("3")
    public static final AtumTextAlignmentDto NATURAL;

    @pmi0("1")
    public static final AtumTextAlignmentDto RIGHT;
    private final int value;

    /* compiled from: AtumTextAlignmentDto.kt */
    public static final class a implements Parcelable.Creator<AtumTextAlignmentDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumTextAlignmentDto createFromParcel(Parcel parcel) {
            return AtumTextAlignmentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumTextAlignmentDto[] newArray(int i) {
            return new AtumTextAlignmentDto[i];
        }
    }

    static {
        AtumTextAlignmentDto atumTextAlignmentDto = new AtumTextAlignmentDto("LEFT", 0, 0);
        LEFT = atumTextAlignmentDto;
        AtumTextAlignmentDto atumTextAlignmentDto2 = new AtumTextAlignmentDto("RIGHT", 1, 1);
        RIGHT = atumTextAlignmentDto2;
        AtumTextAlignmentDto atumTextAlignmentDto3 = new AtumTextAlignmentDto("CENTER", 2, 2);
        CENTER = atumTextAlignmentDto3;
        AtumTextAlignmentDto atumTextAlignmentDto4 = new AtumTextAlignmentDto("NATURAL", 3, 3);
        NATURAL = atumTextAlignmentDto4;
        AtumTextAlignmentDto[] atumTextAlignmentDtoArr = {atumTextAlignmentDto, atumTextAlignmentDto2, atumTextAlignmentDto3, atumTextAlignmentDto4};
        $VALUES = atumTextAlignmentDtoArr;
        $ENTRIES = new asp(atumTextAlignmentDtoArr);
        CREATOR = new a();
    }

    private AtumTextAlignmentDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumTextAlignmentDto valueOf(String str) {
        return (AtumTextAlignmentDto) Enum.valueOf(AtumTextAlignmentDto.class, str);
    }

    public static AtumTextAlignmentDto[] values() {
        return (AtumTextAlignmentDto[]) $VALUES.clone();
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

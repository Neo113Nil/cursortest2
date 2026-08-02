package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiBackgroundTypeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiBackgroundTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiBackgroundTypeDto[] $VALUES;

    @pmi0("circle")
    public static final AtumVkuiBackgroundTypeDto CIRCLE;

    @pmi0("clear")
    public static final AtumVkuiBackgroundTypeDto CLEAR;
    public static final Parcelable.Creator<AtumVkuiBackgroundTypeDto> CREATOR;

    @pmi0("roundedRect")
    public static final AtumVkuiBackgroundTypeDto ROUNDEDRECT;
    private final String value;

    /* compiled from: AtumVkuiBackgroundTypeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiBackgroundTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBackgroundTypeDto createFromParcel(Parcel parcel) {
            return AtumVkuiBackgroundTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBackgroundTypeDto[] newArray(int i) {
            return new AtumVkuiBackgroundTypeDto[i];
        }
    }

    static {
        AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto = new AtumVkuiBackgroundTypeDto("CLEAR", 0, "clear");
        CLEAR = atumVkuiBackgroundTypeDto;
        AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto2 = new AtumVkuiBackgroundTypeDto("CIRCLE", 1, "circle");
        CIRCLE = atumVkuiBackgroundTypeDto2;
        AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto3 = new AtumVkuiBackgroundTypeDto("ROUNDEDRECT", 2, "roundedRect");
        ROUNDEDRECT = atumVkuiBackgroundTypeDto3;
        AtumVkuiBackgroundTypeDto[] atumVkuiBackgroundTypeDtoArr = {atumVkuiBackgroundTypeDto, atumVkuiBackgroundTypeDto2, atumVkuiBackgroundTypeDto3};
        $VALUES = atumVkuiBackgroundTypeDtoArr;
        $ENTRIES = new asp(atumVkuiBackgroundTypeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiBackgroundTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AtumVkuiBackgroundTypeDto valueOf(String str) {
        return (AtumVkuiBackgroundTypeDto) Enum.valueOf(AtumVkuiBackgroundTypeDto.class, str);
    }

    public static AtumVkuiBackgroundTypeDto[] values() {
        return (AtumVkuiBackgroundTypeDto[]) $VALUES.clone();
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

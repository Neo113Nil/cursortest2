package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiSizeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiSizeDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiSizeDto> CREATOR;

    @pmi0("large")
    public static final AtumVkuiSizeDto LARGE;

    @pmi0("medium")
    public static final AtumVkuiSizeDto MEDIUM;

    @pmi0("small")
    public static final AtumVkuiSizeDto SMALL;
    private final String value;

    /* compiled from: AtumVkuiSizeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSizeDto createFromParcel(Parcel parcel) {
            return AtumVkuiSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSizeDto[] newArray(int i) {
            return new AtumVkuiSizeDto[i];
        }
    }

    static {
        AtumVkuiSizeDto atumVkuiSizeDto = new AtumVkuiSizeDto("SMALL", 0, "small");
        SMALL = atumVkuiSizeDto;
        AtumVkuiSizeDto atumVkuiSizeDto2 = new AtumVkuiSizeDto("MEDIUM", 1, "medium");
        MEDIUM = atumVkuiSizeDto2;
        AtumVkuiSizeDto atumVkuiSizeDto3 = new AtumVkuiSizeDto("LARGE", 2, "large");
        LARGE = atumVkuiSizeDto3;
        AtumVkuiSizeDto[] atumVkuiSizeDtoArr = {atumVkuiSizeDto, atumVkuiSizeDto2, atumVkuiSizeDto3};
        $VALUES = atumVkuiSizeDtoArr;
        $ENTRIES = new asp(atumVkuiSizeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiSizeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AtumVkuiSizeDto valueOf(String str) {
        return (AtumVkuiSizeDto) Enum.valueOf(AtumVkuiSizeDto.class, str);
    }

    public static AtumVkuiSizeDto[] values() {
        return (AtumVkuiSizeDto[]) $VALUES.clone();
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

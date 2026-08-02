package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiHeaderMiddleSizeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderMiddleSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiHeaderMiddleSizeDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiHeaderMiddleSizeDto> CREATOR;

    @pmi0("0")
    public static final AtumVkuiHeaderMiddleSizeDto EXTRA_LARGE;

    @pmi0("1")
    public static final AtumVkuiHeaderMiddleSizeDto LARGE;

    @pmi0("2")
    public static final AtumVkuiHeaderMiddleSizeDto MEDIUM;

    @pmi0("3")
    public static final AtumVkuiHeaderMiddleSizeDto SMALL;
    private final int value;

    /* compiled from: AtumVkuiHeaderMiddleSizeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderMiddleSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderMiddleSizeDto createFromParcel(Parcel parcel) {
            return AtumVkuiHeaderMiddleSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderMiddleSizeDto[] newArray(int i) {
            return new AtumVkuiHeaderMiddleSizeDto[i];
        }
    }

    static {
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto = new AtumVkuiHeaderMiddleSizeDto("EXTRA_LARGE", 0, 0);
        EXTRA_LARGE = atumVkuiHeaderMiddleSizeDto;
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto2 = new AtumVkuiHeaderMiddleSizeDto("LARGE", 1, 1);
        LARGE = atumVkuiHeaderMiddleSizeDto2;
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto3 = new AtumVkuiHeaderMiddleSizeDto("MEDIUM", 2, 2);
        MEDIUM = atumVkuiHeaderMiddleSizeDto3;
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto4 = new AtumVkuiHeaderMiddleSizeDto("SMALL", 3, 3);
        SMALL = atumVkuiHeaderMiddleSizeDto4;
        AtumVkuiHeaderMiddleSizeDto[] atumVkuiHeaderMiddleSizeDtoArr = {atumVkuiHeaderMiddleSizeDto, atumVkuiHeaderMiddleSizeDto2, atumVkuiHeaderMiddleSizeDto3, atumVkuiHeaderMiddleSizeDto4};
        $VALUES = atumVkuiHeaderMiddleSizeDtoArr;
        $ENTRIES = new asp(atumVkuiHeaderMiddleSizeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiHeaderMiddleSizeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiHeaderMiddleSizeDto valueOf(String str) {
        return (AtumVkuiHeaderMiddleSizeDto) Enum.valueOf(AtumVkuiHeaderMiddleSizeDto.class, str);
    }

    public static AtumVkuiHeaderMiddleSizeDto[] values() {
        return (AtumVkuiHeaderMiddleSizeDto[]) $VALUES.clone();
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

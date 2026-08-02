package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiContentBadgeModeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiContentBadgeModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiContentBadgeModeDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiContentBadgeModeDto> CREATOR;

    @pmi0("2")
    public static final AtumVkuiContentBadgeModeDto OUTLINE;

    @pmi0("0")
    public static final AtumVkuiContentBadgeModeDto PRIMARY;

    @pmi0("1")
    public static final AtumVkuiContentBadgeModeDto SECONDARY;
    private final int value;

    /* compiled from: AtumVkuiContentBadgeModeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiContentBadgeModeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiContentBadgeModeDto createFromParcel(Parcel parcel) {
            return AtumVkuiContentBadgeModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiContentBadgeModeDto[] newArray(int i) {
            return new AtumVkuiContentBadgeModeDto[i];
        }
    }

    static {
        AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto = new AtumVkuiContentBadgeModeDto("PRIMARY", 0, 0);
        PRIMARY = atumVkuiContentBadgeModeDto;
        AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto2 = new AtumVkuiContentBadgeModeDto("SECONDARY", 1, 1);
        SECONDARY = atumVkuiContentBadgeModeDto2;
        AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto3 = new AtumVkuiContentBadgeModeDto("OUTLINE", 2, 2);
        OUTLINE = atumVkuiContentBadgeModeDto3;
        AtumVkuiContentBadgeModeDto[] atumVkuiContentBadgeModeDtoArr = {atumVkuiContentBadgeModeDto, atumVkuiContentBadgeModeDto2, atumVkuiContentBadgeModeDto3};
        $VALUES = atumVkuiContentBadgeModeDtoArr;
        $ENTRIES = new asp(atumVkuiContentBadgeModeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiContentBadgeModeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiContentBadgeModeDto valueOf(String str) {
        return (AtumVkuiContentBadgeModeDto) Enum.valueOf(AtumVkuiContentBadgeModeDto.class, str);
    }

    public static AtumVkuiContentBadgeModeDto[] values() {
        return (AtumVkuiContentBadgeModeDto[]) $VALUES.clone();
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

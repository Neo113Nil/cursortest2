package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiFontWeightDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiFontWeightDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiFontWeightDto[] $VALUES;

    @pmi0("8")
    public static final AtumVkuiFontWeightDto BLACK;

    @pmi0("6")
    public static final AtumVkuiFontWeightDto BOLD;
    public static final Parcelable.Creator<AtumVkuiFontWeightDto> CREATOR;

    @pmi0(Gc.e)
    public static final AtumVkuiFontWeightDto EXTRA_BOLD;

    @pmi0("1")
    public static final AtumVkuiFontWeightDto EXTRA_LIGHT;

    @pmi0("2")
    public static final AtumVkuiFontWeightDto LIGHT;

    @pmi0("4")
    public static final AtumVkuiFontWeightDto MEDIUM;

    @pmi0("3")
    public static final AtumVkuiFontWeightDto REGULAR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumVkuiFontWeightDto SEMIBOLD;

    @pmi0("0")
    public static final AtumVkuiFontWeightDto THIN;
    private final int value;

    /* compiled from: AtumVkuiFontWeightDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiFontWeightDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiFontWeightDto createFromParcel(Parcel parcel) {
            return AtumVkuiFontWeightDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiFontWeightDto[] newArray(int i) {
            return new AtumVkuiFontWeightDto[i];
        }
    }

    static {
        AtumVkuiFontWeightDto atumVkuiFontWeightDto = new AtumVkuiFontWeightDto("THIN", 0, 0);
        THIN = atumVkuiFontWeightDto;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto2 = new AtumVkuiFontWeightDto("EXTRA_LIGHT", 1, 1);
        EXTRA_LIGHT = atumVkuiFontWeightDto2;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto3 = new AtumVkuiFontWeightDto("LIGHT", 2, 2);
        LIGHT = atumVkuiFontWeightDto3;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto4 = new AtumVkuiFontWeightDto("REGULAR", 3, 3);
        REGULAR = atumVkuiFontWeightDto4;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto5 = new AtumVkuiFontWeightDto("MEDIUM", 4, 4);
        MEDIUM = atumVkuiFontWeightDto5;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto6 = new AtumVkuiFontWeightDto("SEMIBOLD", 5, 5);
        SEMIBOLD = atumVkuiFontWeightDto6;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto7 = new AtumVkuiFontWeightDto("BOLD", 6, 6);
        BOLD = atumVkuiFontWeightDto7;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto8 = new AtumVkuiFontWeightDto("EXTRA_BOLD", 7, 7);
        EXTRA_BOLD = atumVkuiFontWeightDto8;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto9 = new AtumVkuiFontWeightDto("BLACK", 8, 8);
        BLACK = atumVkuiFontWeightDto9;
        AtumVkuiFontWeightDto[] atumVkuiFontWeightDtoArr = {atumVkuiFontWeightDto, atumVkuiFontWeightDto2, atumVkuiFontWeightDto3, atumVkuiFontWeightDto4, atumVkuiFontWeightDto5, atumVkuiFontWeightDto6, atumVkuiFontWeightDto7, atumVkuiFontWeightDto8, atumVkuiFontWeightDto9};
        $VALUES = atumVkuiFontWeightDtoArr;
        $ENTRIES = new asp(atumVkuiFontWeightDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiFontWeightDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiFontWeightDto valueOf(String str) {
        return (AtumVkuiFontWeightDto) Enum.valueOf(AtumVkuiFontWeightDto.class, str);
    }

    public static AtumVkuiFontWeightDto[] values() {
        return (AtumVkuiFontWeightDto[]) $VALUES.clone();
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

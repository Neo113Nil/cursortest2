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
/* compiled from: AtumFontWeightDto.kt */
/* loaded from: classes14.dex */
public final class AtumFontWeightDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumFontWeightDto[] $VALUES;

    @pmi0("8")
    public static final AtumFontWeightDto BLACK;

    @pmi0("6")
    public static final AtumFontWeightDto BOLD;
    public static final Parcelable.Creator<AtumFontWeightDto> CREATOR;

    @pmi0(Gc.e)
    public static final AtumFontWeightDto EXTRA_BOLD;

    @pmi0("1")
    public static final AtumFontWeightDto EXTRA_LIGHT;

    @pmi0("2")
    public static final AtumFontWeightDto LIGHT;

    @pmi0("4")
    public static final AtumFontWeightDto MEDIUM;

    @pmi0("3")
    public static final AtumFontWeightDto REGULAR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumFontWeightDto SEMIBOLD;

    @pmi0("0")
    public static final AtumFontWeightDto THIN;
    private final int value;

    /* compiled from: AtumFontWeightDto.kt */
    public static final class a implements Parcelable.Creator<AtumFontWeightDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumFontWeightDto createFromParcel(Parcel parcel) {
            return AtumFontWeightDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumFontWeightDto[] newArray(int i) {
            return new AtumFontWeightDto[i];
        }
    }

    static {
        AtumFontWeightDto atumFontWeightDto = new AtumFontWeightDto("THIN", 0, 0);
        THIN = atumFontWeightDto;
        AtumFontWeightDto atumFontWeightDto2 = new AtumFontWeightDto("EXTRA_LIGHT", 1, 1);
        EXTRA_LIGHT = atumFontWeightDto2;
        AtumFontWeightDto atumFontWeightDto3 = new AtumFontWeightDto("LIGHT", 2, 2);
        LIGHT = atumFontWeightDto3;
        AtumFontWeightDto atumFontWeightDto4 = new AtumFontWeightDto("REGULAR", 3, 3);
        REGULAR = atumFontWeightDto4;
        AtumFontWeightDto atumFontWeightDto5 = new AtumFontWeightDto("MEDIUM", 4, 4);
        MEDIUM = atumFontWeightDto5;
        AtumFontWeightDto atumFontWeightDto6 = new AtumFontWeightDto("SEMIBOLD", 5, 5);
        SEMIBOLD = atumFontWeightDto6;
        AtumFontWeightDto atumFontWeightDto7 = new AtumFontWeightDto("BOLD", 6, 6);
        BOLD = atumFontWeightDto7;
        AtumFontWeightDto atumFontWeightDto8 = new AtumFontWeightDto("EXTRA_BOLD", 7, 7);
        EXTRA_BOLD = atumFontWeightDto8;
        AtumFontWeightDto atumFontWeightDto9 = new AtumFontWeightDto("BLACK", 8, 8);
        BLACK = atumFontWeightDto9;
        AtumFontWeightDto[] atumFontWeightDtoArr = {atumFontWeightDto, atumFontWeightDto2, atumFontWeightDto3, atumFontWeightDto4, atumFontWeightDto5, atumFontWeightDto6, atumFontWeightDto7, atumFontWeightDto8, atumFontWeightDto9};
        $VALUES = atumFontWeightDtoArr;
        $ENTRIES = new asp(atumFontWeightDtoArr);
        CREATOR = new a();
    }

    private AtumFontWeightDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumFontWeightDto valueOf(String str) {
        return (AtumFontWeightDto) Enum.valueOf(AtumFontWeightDto.class, str);
    }

    public static AtumFontWeightDto[] values() {
        return (AtumFontWeightDto[]) $VALUES.clone();
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

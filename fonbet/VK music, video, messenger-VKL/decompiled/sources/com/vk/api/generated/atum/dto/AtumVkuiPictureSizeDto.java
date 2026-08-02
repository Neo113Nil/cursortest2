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
/* compiled from: AtumVkuiPictureSizeDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiPictureSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiPictureSizeDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiPictureSizeDto> CREATOR;

    @pmi0("15")
    public static final AtumVkuiPictureSizeDto SIZE104;

    @pmi0("0")
    public static final AtumVkuiPictureSizeDto SIZE16;

    @pmi0("1")
    public static final AtumVkuiPictureSizeDto SIZE20;

    @pmi0("2")
    public static final AtumVkuiPictureSizeDto SIZE24;

    @pmi0("3")
    public static final AtumVkuiPictureSizeDto SIZE28;

    @pmi0("4")
    public static final AtumVkuiPictureSizeDto SIZE32;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumVkuiPictureSizeDto SIZE36;

    @pmi0("6")
    public static final AtumVkuiPictureSizeDto SIZE40;

    @pmi0(Gc.e)
    public static final AtumVkuiPictureSizeDto SIZE44;

    @pmi0("8")
    public static final AtumVkuiPictureSizeDto SIZE48;

    @pmi0("9")
    public static final AtumVkuiPictureSizeDto SIZE56;

    @pmi0("10")
    public static final AtumVkuiPictureSizeDto SIZE64;

    @pmi0("11")
    public static final AtumVkuiPictureSizeDto SIZE72;

    @pmi0("12")
    public static final AtumVkuiPictureSizeDto SIZE80;

    @pmi0("13")
    public static final AtumVkuiPictureSizeDto SIZE88;

    @pmi0("14")
    public static final AtumVkuiPictureSizeDto SIZE96;
    private final int value;

    /* compiled from: AtumVkuiPictureSizeDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiPictureSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiPictureSizeDto createFromParcel(Parcel parcel) {
            return AtumVkuiPictureSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiPictureSizeDto[] newArray(int i) {
            return new AtumVkuiPictureSizeDto[i];
        }
    }

    static {
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto = new AtumVkuiPictureSizeDto("SIZE16", 0, 0);
        SIZE16 = atumVkuiPictureSizeDto;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto2 = new AtumVkuiPictureSizeDto("SIZE20", 1, 1);
        SIZE20 = atumVkuiPictureSizeDto2;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto3 = new AtumVkuiPictureSizeDto("SIZE24", 2, 2);
        SIZE24 = atumVkuiPictureSizeDto3;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto4 = new AtumVkuiPictureSizeDto("SIZE28", 3, 3);
        SIZE28 = atumVkuiPictureSizeDto4;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto5 = new AtumVkuiPictureSizeDto("SIZE32", 4, 4);
        SIZE32 = atumVkuiPictureSizeDto5;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto6 = new AtumVkuiPictureSizeDto("SIZE36", 5, 5);
        SIZE36 = atumVkuiPictureSizeDto6;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto7 = new AtumVkuiPictureSizeDto("SIZE40", 6, 6);
        SIZE40 = atumVkuiPictureSizeDto7;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto8 = new AtumVkuiPictureSizeDto("SIZE44", 7, 7);
        SIZE44 = atumVkuiPictureSizeDto8;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto9 = new AtumVkuiPictureSizeDto("SIZE48", 8, 8);
        SIZE48 = atumVkuiPictureSizeDto9;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto10 = new AtumVkuiPictureSizeDto("SIZE56", 9, 9);
        SIZE56 = atumVkuiPictureSizeDto10;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto11 = new AtumVkuiPictureSizeDto("SIZE64", 10, 10);
        SIZE64 = atumVkuiPictureSizeDto11;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto12 = new AtumVkuiPictureSizeDto("SIZE72", 11, 11);
        SIZE72 = atumVkuiPictureSizeDto12;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto13 = new AtumVkuiPictureSizeDto("SIZE80", 12, 12);
        SIZE80 = atumVkuiPictureSizeDto13;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto14 = new AtumVkuiPictureSizeDto("SIZE88", 13, 13);
        SIZE88 = atumVkuiPictureSizeDto14;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto15 = new AtumVkuiPictureSizeDto("SIZE96", 14, 14);
        SIZE96 = atumVkuiPictureSizeDto15;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto16 = new AtumVkuiPictureSizeDto("SIZE104", 15, 15);
        SIZE104 = atumVkuiPictureSizeDto16;
        AtumVkuiPictureSizeDto[] atumVkuiPictureSizeDtoArr = {atumVkuiPictureSizeDto, atumVkuiPictureSizeDto2, atumVkuiPictureSizeDto3, atumVkuiPictureSizeDto4, atumVkuiPictureSizeDto5, atumVkuiPictureSizeDto6, atumVkuiPictureSizeDto7, atumVkuiPictureSizeDto8, atumVkuiPictureSizeDto9, atumVkuiPictureSizeDto10, atumVkuiPictureSizeDto11, atumVkuiPictureSizeDto12, atumVkuiPictureSizeDto13, atumVkuiPictureSizeDto14, atumVkuiPictureSizeDto15, atumVkuiPictureSizeDto16};
        $VALUES = atumVkuiPictureSizeDtoArr;
        $ENTRIES = new asp(atumVkuiPictureSizeDtoArr);
        CREATOR = new a();
    }

    private AtumVkuiPictureSizeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumVkuiPictureSizeDto valueOf(String str) {
        return (AtumVkuiPictureSizeDto) Enum.valueOf(AtumVkuiPictureSizeDto.class, str);
    }

    public static AtumVkuiPictureSizeDto[] values() {
        return (AtumVkuiPictureSizeDto[]) $VALUES.clone();
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

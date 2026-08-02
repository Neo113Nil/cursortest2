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
/* compiled from: AtumImageTintDto.kt */
/* loaded from: classes14.dex */
public final class AtumImageTintDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumImageTintDto[] $VALUES;

    @pmi0("0")
    public static final AtumImageTintDto ACCENT;

    @pmi0("1")
    public static final AtumImageTintDto ACCENT_THEMED;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumImageTintDto CONTRAST;
    public static final Parcelable.Creator<AtumImageTintDto> CREATOR;

    @pmi0("8")
    public static final AtumImageTintDto NEGATIVE;

    @pmi0("6")
    public static final AtumImageTintDto POSITIVE;

    @pmi0("2")
    public static final AtumImageTintDto PRIMARY;

    @pmi0("3")
    public static final AtumImageTintDto SECONDARY;

    @pmi0("4")
    public static final AtumImageTintDto TERTIARY;

    @pmi0(Gc.e)
    public static final AtumImageTintDto WARNING;
    private final int value;

    /* compiled from: AtumImageTintDto.kt */
    public static final class a implements Parcelable.Creator<AtumImageTintDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumImageTintDto createFromParcel(Parcel parcel) {
            return AtumImageTintDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumImageTintDto[] newArray(int i) {
            return new AtumImageTintDto[i];
        }
    }

    static {
        AtumImageTintDto atumImageTintDto = new AtumImageTintDto("ACCENT", 0, 0);
        ACCENT = atumImageTintDto;
        AtumImageTintDto atumImageTintDto2 = new AtumImageTintDto("ACCENT_THEMED", 1, 1);
        ACCENT_THEMED = atumImageTintDto2;
        AtumImageTintDto atumImageTintDto3 = new AtumImageTintDto("PRIMARY", 2, 2);
        PRIMARY = atumImageTintDto3;
        AtumImageTintDto atumImageTintDto4 = new AtumImageTintDto("SECONDARY", 3, 3);
        SECONDARY = atumImageTintDto4;
        AtumImageTintDto atumImageTintDto5 = new AtumImageTintDto("TERTIARY", 4, 4);
        TERTIARY = atumImageTintDto5;
        AtumImageTintDto atumImageTintDto6 = new AtumImageTintDto("CONTRAST", 5, 5);
        CONTRAST = atumImageTintDto6;
        AtumImageTintDto atumImageTintDto7 = new AtumImageTintDto("POSITIVE", 6, 6);
        POSITIVE = atumImageTintDto7;
        AtumImageTintDto atumImageTintDto8 = new AtumImageTintDto("WARNING", 7, 7);
        WARNING = atumImageTintDto8;
        AtumImageTintDto atumImageTintDto9 = new AtumImageTintDto("NEGATIVE", 8, 8);
        NEGATIVE = atumImageTintDto9;
        AtumImageTintDto[] atumImageTintDtoArr = {atumImageTintDto, atumImageTintDto2, atumImageTintDto3, atumImageTintDto4, atumImageTintDto5, atumImageTintDto6, atumImageTintDto7, atumImageTintDto8, atumImageTintDto9};
        $VALUES = atumImageTintDtoArr;
        $ENTRIES = new asp(atumImageTintDtoArr);
        CREATOR = new a();
    }

    private AtumImageTintDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumImageTintDto valueOf(String str) {
        return (AtumImageTintDto) Enum.valueOf(AtumImageTintDto.class, str);
    }

    public static AtumImageTintDto[] values() {
        return (AtumImageTintDto[]) $VALUES.clone();
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

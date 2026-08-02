package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumLineBreakModeDto.kt */
/* loaded from: classes14.dex */
public final class AtumLineBreakModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumLineBreakModeDto[] $VALUES;

    @pmi0("1")
    public static final AtumLineBreakModeDto BYCHARWRAPPING;

    @pmi0("2")
    public static final AtumLineBreakModeDto BYCLIPPING;

    @pmi0("3")
    public static final AtumLineBreakModeDto BYTRUNCATINGHEAD;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AtumLineBreakModeDto BYTRUNCATINGMIDDLE;

    @pmi0("4")
    public static final AtumLineBreakModeDto BYTRUNCATINGTAIL;

    @pmi0("0")
    public static final AtumLineBreakModeDto BYWORDWRAPPING;
    public static final Parcelable.Creator<AtumLineBreakModeDto> CREATOR;
    private final int value;

    /* compiled from: AtumLineBreakModeDto.kt */
    public static final class a implements Parcelable.Creator<AtumLineBreakModeDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLineBreakModeDto createFromParcel(Parcel parcel) {
            return AtumLineBreakModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLineBreakModeDto[] newArray(int i) {
            return new AtumLineBreakModeDto[i];
        }
    }

    static {
        AtumLineBreakModeDto atumLineBreakModeDto = new AtumLineBreakModeDto("BYWORDWRAPPING", 0, 0);
        BYWORDWRAPPING = atumLineBreakModeDto;
        AtumLineBreakModeDto atumLineBreakModeDto2 = new AtumLineBreakModeDto("BYCHARWRAPPING", 1, 1);
        BYCHARWRAPPING = atumLineBreakModeDto2;
        AtumLineBreakModeDto atumLineBreakModeDto3 = new AtumLineBreakModeDto("BYCLIPPING", 2, 2);
        BYCLIPPING = atumLineBreakModeDto3;
        AtumLineBreakModeDto atumLineBreakModeDto4 = new AtumLineBreakModeDto("BYTRUNCATINGHEAD", 3, 3);
        BYTRUNCATINGHEAD = atumLineBreakModeDto4;
        AtumLineBreakModeDto atumLineBreakModeDto5 = new AtumLineBreakModeDto("BYTRUNCATINGTAIL", 4, 4);
        BYTRUNCATINGTAIL = atumLineBreakModeDto5;
        AtumLineBreakModeDto atumLineBreakModeDto6 = new AtumLineBreakModeDto("BYTRUNCATINGMIDDLE", 5, 5);
        BYTRUNCATINGMIDDLE = atumLineBreakModeDto6;
        AtumLineBreakModeDto[] atumLineBreakModeDtoArr = {atumLineBreakModeDto, atumLineBreakModeDto2, atumLineBreakModeDto3, atumLineBreakModeDto4, atumLineBreakModeDto5, atumLineBreakModeDto6};
        $VALUES = atumLineBreakModeDtoArr;
        $ENTRIES = new asp(atumLineBreakModeDtoArr);
        CREATOR = new a();
    }

    private AtumLineBreakModeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AtumLineBreakModeDto valueOf(String str) {
        return (AtumLineBreakModeDto) Enum.valueOf(AtumLineBreakModeDto.class, str);
    }

    public static AtumLineBreakModeDto[] values() {
        return (AtumLineBreakModeDto[]) $VALUES.clone();
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

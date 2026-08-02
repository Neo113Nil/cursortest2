package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketReportReasonDto.kt */
/* loaded from: classes15.dex */
public final class MarketReportReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketReportReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final MarketReportReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final MarketReportReasonDto CHILD_PORNOGRAPHY;
    public static final Parcelable.Creator<MarketReportReasonDto> CREATOR;

    @pmi0("4")
    public static final MarketReportReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final MarketReportReasonDto EXTREMISM;

    @pmi0("6")
    public static final MarketReportReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final MarketReportReasonDto SPAM;

    @pmi0("3")
    public static final MarketReportReasonDto VIOLENCE;
    private final int value;

    /* compiled from: MarketReportReasonDto.kt */
    public static final class a implements Parcelable.Creator<MarketReportReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketReportReasonDto createFromParcel(Parcel parcel) {
            return MarketReportReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketReportReasonDto[] newArray(int i) {
            return new MarketReportReasonDto[i];
        }
    }

    static {
        MarketReportReasonDto marketReportReasonDto = new MarketReportReasonDto("SPAM", 0, 0);
        SPAM = marketReportReasonDto;
        MarketReportReasonDto marketReportReasonDto2 = new MarketReportReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = marketReportReasonDto2;
        MarketReportReasonDto marketReportReasonDto3 = new MarketReportReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = marketReportReasonDto3;
        MarketReportReasonDto marketReportReasonDto4 = new MarketReportReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = marketReportReasonDto4;
        MarketReportReasonDto marketReportReasonDto5 = new MarketReportReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = marketReportReasonDto5;
        MarketReportReasonDto marketReportReasonDto6 = new MarketReportReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = marketReportReasonDto6;
        MarketReportReasonDto marketReportReasonDto7 = new MarketReportReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = marketReportReasonDto7;
        MarketReportReasonDto[] marketReportReasonDtoArr = {marketReportReasonDto, marketReportReasonDto2, marketReportReasonDto3, marketReportReasonDto4, marketReportReasonDto5, marketReportReasonDto6, marketReportReasonDto7};
        $VALUES = marketReportReasonDtoArr;
        $ENTRIES = new asp(marketReportReasonDtoArr);
        CREATOR = new a();
    }

    private MarketReportReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketReportReasonDto valueOf(String str) {
        return (MarketReportReasonDto) Enum.valueOf(MarketReportReasonDto.class, str);
    }

    public static MarketReportReasonDto[] values() {
        return (MarketReportReasonDto[]) $VALUES.clone();
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

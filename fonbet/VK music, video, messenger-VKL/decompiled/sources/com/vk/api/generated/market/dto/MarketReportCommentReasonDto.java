package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketReportCommentReasonDto.kt */
/* loaded from: classes15.dex */
public final class MarketReportCommentReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketReportCommentReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final MarketReportCommentReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final MarketReportCommentReasonDto CHILD_PORNOGRAPHY;
    public static final Parcelable.Creator<MarketReportCommentReasonDto> CREATOR;

    @pmi0("4")
    public static final MarketReportCommentReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final MarketReportCommentReasonDto EXTREMISM;

    @pmi0("6")
    public static final MarketReportCommentReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final MarketReportCommentReasonDto SPAM;

    @pmi0("3")
    public static final MarketReportCommentReasonDto VIOLENCE;
    private final int value;

    /* compiled from: MarketReportCommentReasonDto.kt */
    public static final class a implements Parcelable.Creator<MarketReportCommentReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketReportCommentReasonDto createFromParcel(Parcel parcel) {
            return MarketReportCommentReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketReportCommentReasonDto[] newArray(int i) {
            return new MarketReportCommentReasonDto[i];
        }
    }

    static {
        MarketReportCommentReasonDto marketReportCommentReasonDto = new MarketReportCommentReasonDto("SPAM", 0, 0);
        SPAM = marketReportCommentReasonDto;
        MarketReportCommentReasonDto marketReportCommentReasonDto2 = new MarketReportCommentReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = marketReportCommentReasonDto2;
        MarketReportCommentReasonDto marketReportCommentReasonDto3 = new MarketReportCommentReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = marketReportCommentReasonDto3;
        MarketReportCommentReasonDto marketReportCommentReasonDto4 = new MarketReportCommentReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = marketReportCommentReasonDto4;
        MarketReportCommentReasonDto marketReportCommentReasonDto5 = new MarketReportCommentReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = marketReportCommentReasonDto5;
        MarketReportCommentReasonDto marketReportCommentReasonDto6 = new MarketReportCommentReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = marketReportCommentReasonDto6;
        MarketReportCommentReasonDto marketReportCommentReasonDto7 = new MarketReportCommentReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = marketReportCommentReasonDto7;
        MarketReportCommentReasonDto[] marketReportCommentReasonDtoArr = {marketReportCommentReasonDto, marketReportCommentReasonDto2, marketReportCommentReasonDto3, marketReportCommentReasonDto4, marketReportCommentReasonDto5, marketReportCommentReasonDto6, marketReportCommentReasonDto7};
        $VALUES = marketReportCommentReasonDtoArr;
        $ENTRIES = new asp(marketReportCommentReasonDtoArr);
        CREATOR = new a();
    }

    private MarketReportCommentReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketReportCommentReasonDto valueOf(String str) {
        return (MarketReportCommentReasonDto) Enum.valueOf(MarketReportCommentReasonDto.class, str);
    }

    public static MarketReportCommentReasonDto[] values() {
        return (MarketReportCommentReasonDto[]) $VALUES.clone();
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

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetRecommendedItemsFeatureTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRecommendedItemsFeatureTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetRecommendedItemsFeatureTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetRecommendedItemsFeatureTypeDto> CREATOR;

    @pmi0("portlet")
    public static final MarketGetRecommendedItemsFeatureTypeDto PORTLET;

    @pmi0("search")
    public static final MarketGetRecommendedItemsFeatureTypeDto SEARCH;

    @pmi0("video")
    public static final MarketGetRecommendedItemsFeatureTypeDto VIDEO;

    @pmi0("widget")
    public static final MarketGetRecommendedItemsFeatureTypeDto WIDGET;

    @pmi0("widget_ugc")
    public static final MarketGetRecommendedItemsFeatureTypeDto WIDGET_UGC;
    private final String value;

    /* compiled from: MarketGetRecommendedItemsFeatureTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRecommendedItemsFeatureTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendedItemsFeatureTypeDto createFromParcel(Parcel parcel) {
            return MarketGetRecommendedItemsFeatureTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendedItemsFeatureTypeDto[] newArray(int i) {
            return new MarketGetRecommendedItemsFeatureTypeDto[i];
        }
    }

    static {
        MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto = new MarketGetRecommendedItemsFeatureTypeDto("PORTLET", 0, "portlet");
        PORTLET = marketGetRecommendedItemsFeatureTypeDto;
        MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto2 = new MarketGetRecommendedItemsFeatureTypeDto("SEARCH", 1, "search");
        SEARCH = marketGetRecommendedItemsFeatureTypeDto2;
        MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto3 = new MarketGetRecommendedItemsFeatureTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = marketGetRecommendedItemsFeatureTypeDto3;
        MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto4 = new MarketGetRecommendedItemsFeatureTypeDto("WIDGET", 3, "widget");
        WIDGET = marketGetRecommendedItemsFeatureTypeDto4;
        MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto5 = new MarketGetRecommendedItemsFeatureTypeDto("WIDGET_UGC", 4, "widget_ugc");
        WIDGET_UGC = marketGetRecommendedItemsFeatureTypeDto5;
        MarketGetRecommendedItemsFeatureTypeDto[] marketGetRecommendedItemsFeatureTypeDtoArr = {marketGetRecommendedItemsFeatureTypeDto, marketGetRecommendedItemsFeatureTypeDto2, marketGetRecommendedItemsFeatureTypeDto3, marketGetRecommendedItemsFeatureTypeDto4, marketGetRecommendedItemsFeatureTypeDto5};
        $VALUES = marketGetRecommendedItemsFeatureTypeDtoArr;
        $ENTRIES = new asp(marketGetRecommendedItemsFeatureTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetRecommendedItemsFeatureTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetRecommendedItemsFeatureTypeDto valueOf(String str) {
        return (MarketGetRecommendedItemsFeatureTypeDto) Enum.valueOf(MarketGetRecommendedItemsFeatureTypeDto.class, str);
    }

    public static MarketGetRecommendedItemsFeatureTypeDto[] values() {
        return (MarketGetRecommendedItemsFeatureTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

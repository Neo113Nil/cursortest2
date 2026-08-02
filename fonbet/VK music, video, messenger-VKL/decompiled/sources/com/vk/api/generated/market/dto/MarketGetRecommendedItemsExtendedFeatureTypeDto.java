package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetRecommendedItemsExtendedFeatureTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRecommendedItemsExtendedFeatureTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetRecommendedItemsExtendedFeatureTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetRecommendedItemsExtendedFeatureTypeDto> CREATOR;

    @pmi0("portlet")
    public static final MarketGetRecommendedItemsExtendedFeatureTypeDto PORTLET;

    @pmi0("search")
    public static final MarketGetRecommendedItemsExtendedFeatureTypeDto SEARCH;

    @pmi0("video")
    public static final MarketGetRecommendedItemsExtendedFeatureTypeDto VIDEO;

    @pmi0("widget")
    public static final MarketGetRecommendedItemsExtendedFeatureTypeDto WIDGET;

    @pmi0("widget_ugc")
    public static final MarketGetRecommendedItemsExtendedFeatureTypeDto WIDGET_UGC;
    private final String value;

    /* compiled from: MarketGetRecommendedItemsExtendedFeatureTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRecommendedItemsExtendedFeatureTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendedItemsExtendedFeatureTypeDto createFromParcel(Parcel parcel) {
            return MarketGetRecommendedItemsExtendedFeatureTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendedItemsExtendedFeatureTypeDto[] newArray(int i) {
            return new MarketGetRecommendedItemsExtendedFeatureTypeDto[i];
        }
    }

    static {
        MarketGetRecommendedItemsExtendedFeatureTypeDto marketGetRecommendedItemsExtendedFeatureTypeDto = new MarketGetRecommendedItemsExtendedFeatureTypeDto("PORTLET", 0, "portlet");
        PORTLET = marketGetRecommendedItemsExtendedFeatureTypeDto;
        MarketGetRecommendedItemsExtendedFeatureTypeDto marketGetRecommendedItemsExtendedFeatureTypeDto2 = new MarketGetRecommendedItemsExtendedFeatureTypeDto("SEARCH", 1, "search");
        SEARCH = marketGetRecommendedItemsExtendedFeatureTypeDto2;
        MarketGetRecommendedItemsExtendedFeatureTypeDto marketGetRecommendedItemsExtendedFeatureTypeDto3 = new MarketGetRecommendedItemsExtendedFeatureTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = marketGetRecommendedItemsExtendedFeatureTypeDto3;
        MarketGetRecommendedItemsExtendedFeatureTypeDto marketGetRecommendedItemsExtendedFeatureTypeDto4 = new MarketGetRecommendedItemsExtendedFeatureTypeDto("WIDGET", 3, "widget");
        WIDGET = marketGetRecommendedItemsExtendedFeatureTypeDto4;
        MarketGetRecommendedItemsExtendedFeatureTypeDto marketGetRecommendedItemsExtendedFeatureTypeDto5 = new MarketGetRecommendedItemsExtendedFeatureTypeDto("WIDGET_UGC", 4, "widget_ugc");
        WIDGET_UGC = marketGetRecommendedItemsExtendedFeatureTypeDto5;
        MarketGetRecommendedItemsExtendedFeatureTypeDto[] marketGetRecommendedItemsExtendedFeatureTypeDtoArr = {marketGetRecommendedItemsExtendedFeatureTypeDto, marketGetRecommendedItemsExtendedFeatureTypeDto2, marketGetRecommendedItemsExtendedFeatureTypeDto3, marketGetRecommendedItemsExtendedFeatureTypeDto4, marketGetRecommendedItemsExtendedFeatureTypeDto5};
        $VALUES = marketGetRecommendedItemsExtendedFeatureTypeDtoArr;
        $ENTRIES = new asp(marketGetRecommendedItemsExtendedFeatureTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetRecommendedItemsExtendedFeatureTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetRecommendedItemsExtendedFeatureTypeDto valueOf(String str) {
        return (MarketGetRecommendedItemsExtendedFeatureTypeDto) Enum.valueOf(MarketGetRecommendedItemsExtendedFeatureTypeDto.class, str);
    }

    public static MarketGetRecommendedItemsExtendedFeatureTypeDto[] values() {
        return (MarketGetRecommendedItemsExtendedFeatureTypeDto[]) $VALUES.clone();
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

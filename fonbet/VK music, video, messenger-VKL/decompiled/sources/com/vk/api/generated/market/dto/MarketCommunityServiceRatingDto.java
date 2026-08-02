package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCommunityServiceRatingDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityServiceRatingDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityServiceRatingDto> CREATOR = new a();

    @pmi0("message")
    private final String message;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("tooltip")
    private final String tooltip;

    @pmi0("tooltip_title")
    private final String tooltipTitle;

    /* compiled from: MarketCommunityServiceRatingDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityServiceRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityServiceRatingDto createFromParcel(Parcel parcel) {
            return new MarketCommunityServiceRatingDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityServiceRatingDto[] newArray(int i) {
            return new MarketCommunityServiceRatingDto[i];
        }
    }

    public MarketCommunityServiceRatingDto(String str, Float f, String str2, String str3) {
        this.tooltip = str;
        this.rating = f;
        this.tooltipTitle = str2;
        this.message = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityServiceRatingDto)) {
            return false;
        }
        MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = (MarketCommunityServiceRatingDto) obj;
        return epx.f(this.tooltip, marketCommunityServiceRatingDto.tooltip) && epx.f(this.rating, marketCommunityServiceRatingDto.rating) && epx.f(this.tooltipTitle, marketCommunityServiceRatingDto.tooltipTitle) && epx.f(this.message, marketCommunityServiceRatingDto.message);
    }

    public final int hashCode() {
        int hashCode = this.tooltip.hashCode() * 31;
        Float f = this.rating;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.tooltipTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityServiceRatingDto(tooltip=");
        sb.append(this.tooltip);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", tooltipTitle=");
        sb.append(this.tooltipTitle);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tooltip);
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.tooltipTitle);
        parcel.writeString(this.message);
    }

    public /* synthetic */ MarketCommunityServiceRatingDto(String str, Float f, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}

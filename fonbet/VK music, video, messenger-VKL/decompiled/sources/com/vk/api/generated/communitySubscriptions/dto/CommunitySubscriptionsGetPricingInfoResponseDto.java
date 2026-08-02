package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CommunitySubscriptionsGetPricingInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsGetPricingInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsGetPricingInfoResponseDto> CREATOR = new a();

    @pmi0("action_text")
    private final String actionText;

    @pmi0("condition_text")
    private final String conditionText;

    @pmi0("description")
    private final String description;

    @pmi0("price")
    private final int price;

    @pmi0("price_id")
    private final String priceId;

    @pmi0("title")
    private final String title;

    /* compiled from: CommunitySubscriptionsGetPricingInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsGetPricingInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPricingInfoResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsGetPricingInfoResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPricingInfoResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsGetPricingInfoResponseDto[i];
        }
    }

    public CommunitySubscriptionsGetPricingInfoResponseDto(String str, String str2, String str3, String str4, String str5, int i) {
        this.title = str;
        this.description = str2;
        this.actionText = str3;
        this.conditionText = str4;
        this.priceId = str5;
        this.price = i;
    }

    public final String S1() {
        return this.actionText;
    }

    public final String d() {
        return this.conditionText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.price;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunitySubscriptionsGetPricingInfoResponseDto)) {
            return false;
        }
        CommunitySubscriptionsGetPricingInfoResponseDto communitySubscriptionsGetPricingInfoResponseDto = (CommunitySubscriptionsGetPricingInfoResponseDto) obj;
        return epx.f(this.title, communitySubscriptionsGetPricingInfoResponseDto.title) && epx.f(this.description, communitySubscriptionsGetPricingInfoResponseDto.description) && epx.f(this.actionText, communitySubscriptionsGetPricingInfoResponseDto.actionText) && epx.f(this.conditionText, communitySubscriptionsGetPricingInfoResponseDto.conditionText) && epx.f(this.priceId, communitySubscriptionsGetPricingInfoResponseDto.priceId) && this.price == communitySubscriptionsGetPricingInfoResponseDto.price;
    }

    public final String f() {
        return this.priceId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Integer.hashCode(this.price) + urd0.a(urd0.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.actionText), 31, this.conditionText), 31, this.priceId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunitySubscriptionsGetPricingInfoResponseDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", actionText=");
        sb.append(this.actionText);
        sb.append(", conditionText=");
        sb.append(this.conditionText);
        sb.append(", priceId=");
        sb.append(this.priceId);
        sb.append(", price=");
        return vu5.b(sb, this.price, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.actionText);
        parcel.writeString(this.conditionText);
        parcel.writeString(this.priceId);
        parcel.writeInt(this.price);
    }
}

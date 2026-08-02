package com.vk.api.generated.goodsOrders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GoodsOrdersGoodItemDto.kt */
/* loaded from: classes14.dex */
public final class GoodsOrdersGoodItemDto implements Parcelable {
    public static final Parcelable.Creator<GoodsOrdersGoodItemDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("price")
    private final String price;

    @pmi0("title")
    private final String title;

    @pmi0("trial_description")
    private final String trialDescription;

    /* compiled from: GoodsOrdersGoodItemDto.kt */
    public static final class a implements Parcelable.Creator<GoodsOrdersGoodItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersGoodItemDto createFromParcel(Parcel parcel) {
            return new GoodsOrdersGoodItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersGoodItemDto[] newArray(int i) {
            return new GoodsOrdersGoodItemDto[i];
        }
    }

    public GoodsOrdersGoodItemDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.price = str4;
        this.trialDescription = str5;
    }

    public final String d() {
        return this.imageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodsOrdersGoodItemDto)) {
            return false;
        }
        GoodsOrdersGoodItemDto goodsOrdersGoodItemDto = (GoodsOrdersGoodItemDto) obj;
        return epx.f(this.title, goodsOrdersGoodItemDto.title) && epx.f(this.description, goodsOrdersGoodItemDto.description) && epx.f(this.imageUrl, goodsOrdersGoodItemDto.imageUrl) && epx.f(this.price, goodsOrdersGoodItemDto.price) && epx.f(this.trialDescription, goodsOrdersGoodItemDto.trialDescription);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.imageUrl), 31, this.price);
        String str = this.trialDescription;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodsOrdersGoodItemDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", trialDescription=");
        return ho8.a(sb, this.trialDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.price);
        parcel.writeString(this.trialDescription);
    }

    public /* synthetic */ GoodsOrdersGoodItemDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }
}

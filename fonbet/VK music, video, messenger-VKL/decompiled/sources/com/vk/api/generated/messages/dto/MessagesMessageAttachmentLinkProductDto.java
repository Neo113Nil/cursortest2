package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGeoCoordinatesDto;
import com.vk.api.generated.base.dto.BaseLinkProductStatusDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesMessageAttachmentLinkProductDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentLinkProductDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentLinkProductDto> CREATOR = new a();

    @pmi0("category")
    private final String category;

    @pmi0("city")
    private final String city;

    @pmi0("distance")
    private final Integer distance;

    @pmi0("geo")
    private final BaseGeoCoordinatesDto geo;

    @pmi0("merchant")
    private final String merchant;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("status")
    private final BaseLinkProductStatusDto status;

    /* compiled from: MessagesMessageAttachmentLinkProductDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentLinkProductDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkProductDto createFromParcel(Parcel parcel) {
            return new MessagesMessageAttachmentLinkProductDto((MarketPriceDto) parcel.readParcelable(MessagesMessageAttachmentLinkProductDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (BaseGeoCoordinatesDto) parcel.readParcelable(MessagesMessageAttachmentLinkProductDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (BaseLinkProductStatusDto) parcel.readParcelable(MessagesMessageAttachmentLinkProductDto.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkProductDto[] newArray(int i) {
            return new MessagesMessageAttachmentLinkProductDto[i];
        }
    }

    public MessagesMessageAttachmentLinkProductDto(MarketPriceDto marketPriceDto, String str, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, Integer num, String str3, BaseLinkProductStatusDto baseLinkProductStatusDto, Integer num2) {
        this.price = marketPriceDto;
        this.merchant = str;
        this.category = str2;
        this.geo = baseGeoCoordinatesDto;
        this.distance = num;
        this.city = str3;
        this.status = baseLinkProductStatusDto;
        this.ordersCount = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentLinkProductDto)) {
            return false;
        }
        MessagesMessageAttachmentLinkProductDto messagesMessageAttachmentLinkProductDto = (MessagesMessageAttachmentLinkProductDto) obj;
        return epx.f(this.price, messagesMessageAttachmentLinkProductDto.price) && epx.f(this.merchant, messagesMessageAttachmentLinkProductDto.merchant) && epx.f(this.category, messagesMessageAttachmentLinkProductDto.category) && epx.f(this.geo, messagesMessageAttachmentLinkProductDto.geo) && epx.f(this.distance, messagesMessageAttachmentLinkProductDto.distance) && epx.f(this.city, messagesMessageAttachmentLinkProductDto.city) && this.status == messagesMessageAttachmentLinkProductDto.status && epx.f(this.ordersCount, messagesMessageAttachmentLinkProductDto.ordersCount);
    }

    public final int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        String str = this.merchant;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.geo;
        int hashCode4 = (hashCode3 + (baseGeoCoordinatesDto == null ? 0 : baseGeoCoordinatesDto.hashCode())) * 31;
        Integer num = this.distance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.city;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        int hashCode7 = (hashCode6 + (baseLinkProductStatusDto == null ? 0 : baseLinkProductStatusDto.hashCode())) * 31;
        Integer num2 = this.ordersCount;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageAttachmentLinkProductDto(price=");
        sb.append(this.price);
        sb.append(", merchant=");
        sb.append(this.merchant);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", ordersCount=");
        return uqi.b(sb, this.ordersCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.price, i);
        parcel.writeString(this.merchant);
        parcel.writeString(this.category);
        parcel.writeParcelable(this.geo, i);
        Integer num = this.distance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.city);
        parcel.writeParcelable(this.status, i);
        Integer num2 = this.ordersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MessagesMessageAttachmentLinkProductDto(MarketPriceDto marketPriceDto, String str, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, Integer num, String str3, BaseLinkProductStatusDto baseLinkProductStatusDto, Integer num2, int i, zcl zclVar) {
        this(marketPriceDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseGeoCoordinatesDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : baseLinkProductStatusDto, (i & 128) != 0 ? null : num2);
    }
}

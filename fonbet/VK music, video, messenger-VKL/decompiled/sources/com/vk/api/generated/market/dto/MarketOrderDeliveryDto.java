package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketOrderDeliveryDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderDeliveryDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderDeliveryDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("delivery_point")
    private final MarketDeliveryPointDto deliveryPoint;

    @pmi0("track_link")
    private final String trackLink;

    @pmi0("track_number")
    private final String trackNumber;

    @pmi0("type")
    private final String type;

    @pmi0("type_id")
    private final MarketOrderSettingsDeliveryOptionTypeDto typeId;

    /* compiled from: MarketOrderDeliveryDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderDeliveryDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderDeliveryDto createFromParcel(Parcel parcel) {
            return new MarketOrderDeliveryDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MarketOrderSettingsDeliveryOptionTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketDeliveryPointDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderDeliveryDto[] newArray(int i) {
            return new MarketOrderDeliveryDto[i];
        }
    }

    public MarketOrderDeliveryDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketDeliveryPointDto e() {
        return this.deliveryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderDeliveryDto)) {
            return false;
        }
        MarketOrderDeliveryDto marketOrderDeliveryDto = (MarketOrderDeliveryDto) obj;
        return epx.f(this.trackNumber, marketOrderDeliveryDto.trackNumber) && epx.f(this.trackLink, marketOrderDeliveryDto.trackLink) && epx.f(this.address, marketOrderDeliveryDto.address) && epx.f(this.type, marketOrderDeliveryDto.type) && this.typeId == marketOrderDeliveryDto.typeId && epx.f(this.deliveryPoint, marketOrderDeliveryDto.deliveryPoint);
    }

    public final String f() {
        return this.trackLink;
    }

    public final String g() {
        return this.trackNumber;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.trackNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto = this.typeId;
        int hashCode5 = (hashCode4 + (marketOrderSettingsDeliveryOptionTypeDto == null ? 0 : marketOrderSettingsDeliveryOptionTypeDto.hashCode())) * 31;
        MarketDeliveryPointDto marketDeliveryPointDto = this.deliveryPoint;
        return hashCode5 + (marketDeliveryPointDto != null ? marketDeliveryPointDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketOrderDeliveryDto(trackNumber=" + this.trackNumber + ", trackLink=" + this.trackLink + ", address=" + this.address + ", type=" + this.type + ", typeId=" + this.typeId + ", deliveryPoint=" + this.deliveryPoint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.trackNumber);
        parcel.writeString(this.trackLink);
        parcel.writeString(this.address);
        parcel.writeString(this.type);
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto = this.typeId;
        if (marketOrderSettingsDeliveryOptionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderSettingsDeliveryOptionTypeDto.writeToParcel(parcel, i);
        }
        MarketDeliveryPointDto marketDeliveryPointDto = this.deliveryPoint;
        if (marketDeliveryPointDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryPointDto.writeToParcel(parcel, i);
        }
    }

    public MarketOrderDeliveryDto(String str, String str2, String str3, String str4, MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto, MarketDeliveryPointDto marketDeliveryPointDto) {
        this.trackNumber = str;
        this.trackLink = str2;
        this.address = str3;
        this.type = str4;
        this.typeId = marketOrderSettingsDeliveryOptionTypeDto;
        this.deliveryPoint = marketDeliveryPointDto;
    }

    public /* synthetic */ MarketOrderDeliveryDto(String str, String str2, String str3, String str4, MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto, MarketDeliveryPointDto marketDeliveryPointDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : marketOrderSettingsDeliveryOptionTypeDto, (i & 32) != 0 ? null : marketDeliveryPointDto);
    }
}

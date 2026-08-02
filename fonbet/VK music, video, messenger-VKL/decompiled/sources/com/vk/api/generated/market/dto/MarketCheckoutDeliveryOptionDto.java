package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCheckoutDeliveryOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutDeliveryOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutDeliveryOptionDto> CREATOR = new a();

    @pmi0("default_message")
    private final String defaultMessage;

    @pmi0("info")
    private final String info;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketCheckoutDeliveryOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutDeliveryOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutDeliveryOptionDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutDeliveryOptionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutDeliveryOptionDto[] newArray(int i) {
            return new MarketCheckoutDeliveryOptionDto[i];
        }
    }

    public MarketCheckoutDeliveryOptionDto(String str, String str2, String str3, String str4) {
        this.type = str;
        this.title = str2;
        this.defaultMessage = str3;
        this.info = str4;
    }

    public final String d() {
        return this.defaultMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutDeliveryOptionDto)) {
            return false;
        }
        MarketCheckoutDeliveryOptionDto marketCheckoutDeliveryOptionDto = (MarketCheckoutDeliveryOptionDto) obj;
        return epx.f(this.type, marketCheckoutDeliveryOptionDto.type) && epx.f(this.title, marketCheckoutDeliveryOptionDto.title) && epx.f(this.defaultMessage, marketCheckoutDeliveryOptionDto.defaultMessage) && epx.f(this.info, marketCheckoutDeliveryOptionDto.info);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.defaultMessage);
        String str = this.info;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutDeliveryOptionDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", defaultMessage=");
        sb.append(this.defaultMessage);
        sb.append(", info=");
        return ho8.a(sb, this.info, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.defaultMessage);
        parcel.writeString(this.info);
    }

    public /* synthetic */ MarketCheckoutDeliveryOptionDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}

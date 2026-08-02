package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketPaymentActionDto.kt */
/* loaded from: classes15.dex */
public final class MarketPaymentActionDto implements Parcelable {
    public static final Parcelable.Creator<MarketPaymentActionDto> CREATOR = new a();

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("expire_time")
    private final Integer expireTime;

    @pmi0("url")
    private final String url;

    @pmi0("vkpay_parameters")
    private final String vkpayParameters;

    /* compiled from: MarketPaymentActionDto.kt */
    public static final class a implements Parcelable.Creator<MarketPaymentActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPaymentActionDto createFromParcel(Parcel parcel) {
            return new MarketPaymentActionDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPaymentActionDto[] newArray(int i) {
            return new MarketPaymentActionDto[i];
        }
    }

    public MarketPaymentActionDto(String str, Integer num, String str2, String str3) {
        this.buttonTitle = str;
        this.expireTime = num;
        this.vkpayParameters = str2;
        this.url = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPaymentActionDto)) {
            return false;
        }
        MarketPaymentActionDto marketPaymentActionDto = (MarketPaymentActionDto) obj;
        return epx.f(this.buttonTitle, marketPaymentActionDto.buttonTitle) && epx.f(this.expireTime, marketPaymentActionDto.expireTime) && epx.f(this.vkpayParameters, marketPaymentActionDto.vkpayParameters) && epx.f(this.url, marketPaymentActionDto.url);
    }

    public final int hashCode() {
        int hashCode = this.buttonTitle.hashCode() * 31;
        Integer num = this.expireTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.vkpayParameters;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPaymentActionDto(buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", vkpayParameters=");
        sb.append(this.vkpayParameters);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buttonTitle);
        Integer num = this.expireTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.vkpayParameters);
        parcel.writeString(this.url);
    }

    public /* synthetic */ MarketPaymentActionDto(String str, Integer num, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketPaymentParametersDto.kt */
/* loaded from: classes15.dex */
public final class MarketPaymentParametersDto implements Parcelable {
    public static final Parcelable.Creator<MarketPaymentParametersDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    @pmi0("vkpay_parameters")
    private final String vkpayParameters;

    /* compiled from: MarketPaymentParametersDto.kt */
    public static final class a implements Parcelable.Creator<MarketPaymentParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPaymentParametersDto createFromParcel(Parcel parcel) {
            return new MarketPaymentParametersDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPaymentParametersDto[] newArray(int i) {
            return new MarketPaymentParametersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketPaymentParametersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.vkpayParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPaymentParametersDto)) {
            return false;
        }
        MarketPaymentParametersDto marketPaymentParametersDto = (MarketPaymentParametersDto) obj;
        return epx.f(this.vkpayParameters, marketPaymentParametersDto.vkpayParameters) && epx.f(this.url, marketPaymentParametersDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.vkpayParameters;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPaymentParametersDto(vkpayParameters=");
        sb.append(this.vkpayParameters);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vkpayParameters);
        parcel.writeString(this.url);
    }

    public MarketPaymentParametersDto(String str, String str2) {
        this.vkpayParameters = str;
        this.url = str2;
    }

    public /* synthetic */ MarketPaymentParametersDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

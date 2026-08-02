package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MoneyGetParamsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetParamsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetParamsResponseDto> CREATOR = new a();

    @pmi0("add_card_url")
    private final String addCardUrl;

    @pmi0("available")
    private final boolean available;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("max_amount")
    private final Integer maxAmount;

    @pmi0("min_amount")
    private final Integer minAmount;

    @pmi0("requests_available")
    private final Boolean requestsAvailable;

    @pmi0("vk_pay_offer_uri")
    private final String vkPayOfferUri;

    @pmi0("vkpay_available")
    private final Boolean vkpayAvailable;

    /* compiled from: MoneyGetParamsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetParamsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetParamsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num = valueOf2;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MoneyGetParamsResponseDto(z, num, valueOf3, readString, valueOf, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetParamsResponseDto[] newArray(int i) {
            return new MoneyGetParamsResponseDto[i];
        }
    }

    public MoneyGetParamsResponseDto(boolean z, Integer num, Integer num2, String str, Boolean bool, Boolean bool2, String str2, String str3) {
        this.available = z;
        this.minAmount = num;
        this.maxAmount = num2;
        this.currency = str;
        this.requestsAvailable = bool;
        this.vkpayAvailable = bool2;
        this.addCardUrl = str2;
        this.vkPayOfferUri = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetParamsResponseDto)) {
            return false;
        }
        MoneyGetParamsResponseDto moneyGetParamsResponseDto = (MoneyGetParamsResponseDto) obj;
        return this.available == moneyGetParamsResponseDto.available && epx.f(this.minAmount, moneyGetParamsResponseDto.minAmount) && epx.f(this.maxAmount, moneyGetParamsResponseDto.maxAmount) && epx.f(this.currency, moneyGetParamsResponseDto.currency) && epx.f(this.requestsAvailable, moneyGetParamsResponseDto.requestsAvailable) && epx.f(this.vkpayAvailable, moneyGetParamsResponseDto.vkpayAvailable) && epx.f(this.addCardUrl, moneyGetParamsResponseDto.addCardUrl) && epx.f(this.vkPayOfferUri, moneyGetParamsResponseDto.vkPayOfferUri);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.available) * 31;
        Integer num = this.minAmount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxAmount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.currency;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.requestsAvailable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.vkpayAvailable;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.addCardUrl;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vkPayOfferUri;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetParamsResponseDto(available=");
        sb.append(this.available);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", requestsAvailable=");
        sb.append(this.requestsAvailable);
        sb.append(", vkpayAvailable=");
        sb.append(this.vkpayAvailable);
        sb.append(", addCardUrl=");
        sb.append(this.addCardUrl);
        sb.append(", vkPayOfferUri=");
        return ho8.a(sb, this.vkPayOfferUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.available ? 1 : 0);
        Integer num = this.minAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.maxAmount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.currency);
        Boolean bool = this.requestsAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.vkpayAvailable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.addCardUrl);
        parcel.writeString(this.vkPayOfferUri);
    }

    public /* synthetic */ MoneyGetParamsResponseDto(boolean z, Integer num, Integer num2, String str, Boolean bool, Boolean bool2, String str2, String str3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3);
    }
}

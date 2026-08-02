package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketPriceDto.kt */
/* loaded from: classes15.dex */
public final class MarketPriceDto implements Parcelable {
    public static final Parcelable.Creator<MarketPriceDto> CREATOR = new a();

    @pmi0("amount")
    private final String amount;

    @pmi0("amount_to")
    private final String amountTo;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("discount_rate")
    private final Integer discountRate;

    @pmi0("loyalty_amount")
    private final String loyaltyAmount;

    @pmi0("loyalty_amount_color")
    private final String loyaltyAmountColor;

    @pmi0("loyalty_amount_text")
    private final String loyaltyAmountText;

    @pmi0("old_amount")
    private final String oldAmount;

    @pmi0("old_amount_text")
    private final String oldAmountText;

    @pmi0("price_type")
    private final PriceTypeDto priceType;

    @pmi0("price_unit")
    private final PriceUnitDto priceUnit;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketPriceDto.kt */
    public static final class PriceTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PriceTypeDto[] $VALUES;

        @pmi0("3")
        public static final PriceTypeDto BY_AGREEMENT;
        public static final Parcelable.Creator<PriceTypeDto> CREATOR;

        @pmi0("0")
        public static final PriceTypeDto EXACT;

        @pmi0("2")
        public static final PriceTypeDto RANGE;
        private final int value;

        /* compiled from: MarketPriceDto.kt */
        public static final class a implements Parcelable.Creator<PriceTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PriceTypeDto createFromParcel(Parcel parcel) {
                return PriceTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PriceTypeDto[] newArray(int i) {
                return new PriceTypeDto[i];
            }
        }

        static {
            PriceTypeDto priceTypeDto = new PriceTypeDto("EXACT", 0, 0);
            EXACT = priceTypeDto;
            PriceTypeDto priceTypeDto2 = new PriceTypeDto("RANGE", 1, 2);
            RANGE = priceTypeDto2;
            PriceTypeDto priceTypeDto3 = new PriceTypeDto("BY_AGREEMENT", 2, 3);
            BY_AGREEMENT = priceTypeDto3;
            PriceTypeDto[] priceTypeDtoArr = {priceTypeDto, priceTypeDto2, priceTypeDto3};
            $VALUES = priceTypeDtoArr;
            $ENTRIES = new asp(priceTypeDtoArr);
            CREATOR = new a();
        }

        private PriceTypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PriceTypeDto valueOf(String str) {
            return (PriceTypeDto) Enum.valueOf(PriceTypeDto.class, str);
        }

        public static PriceTypeDto[] values() {
            return (PriceTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketPriceDto.kt */
    public static final class PriceUnitDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PriceUnitDto[] $VALUES;
        public static final Parcelable.Creator<PriceUnitDto> CREATOR;

        @pmi0("2")
        public static final PriceUnitDto HOUR;

        @pmi0("0")
        public static final PriceUnitDto ITEM;

        @pmi0("4")
        public static final PriceUnitDto M2;

        @pmi0("3")
        public static final PriceUnitDto M3;
        private final int value;

        /* compiled from: MarketPriceDto.kt */
        public static final class a implements Parcelable.Creator<PriceUnitDto> {
            @Override // android.os.Parcelable.Creator
            public final PriceUnitDto createFromParcel(Parcel parcel) {
                return PriceUnitDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PriceUnitDto[] newArray(int i) {
                return new PriceUnitDto[i];
            }
        }

        static {
            PriceUnitDto priceUnitDto = new PriceUnitDto("ITEM", 0, 0);
            ITEM = priceUnitDto;
            PriceUnitDto priceUnitDto2 = new PriceUnitDto("HOUR", 1, 2);
            HOUR = priceUnitDto2;
            PriceUnitDto priceUnitDto3 = new PriceUnitDto("M3", 2, 3);
            M3 = priceUnitDto3;
            PriceUnitDto priceUnitDto4 = new PriceUnitDto("M2", 3, 4);
            M2 = priceUnitDto4;
            PriceUnitDto[] priceUnitDtoArr = {priceUnitDto, priceUnitDto2, priceUnitDto3, priceUnitDto4};
            $VALUES = priceUnitDtoArr;
            $ENTRIES = new asp(priceUnitDtoArr);
            CREATOR = new a();
        }

        private PriceUnitDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PriceUnitDto valueOf(String str) {
            return (PriceUnitDto) Enum.valueOf(PriceUnitDto.class, str);
        }

        public static PriceUnitDto[] values() {
            return (PriceUnitDto[]) $VALUES.clone();
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

    /* compiled from: MarketPriceDto.kt */
    public static final class a implements Parcelable.Creator<MarketPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPriceDto createFromParcel(Parcel parcel) {
            return new MarketPriceDto(parcel.readString(), MarketCurrencyDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PriceTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PriceUnitDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPriceDto[] newArray(int i) {
            return new MarketPriceDto[i];
        }
    }

    public MarketPriceDto(String str, MarketCurrencyDto marketCurrencyDto, String str2, String str3, PriceTypeDto priceTypeDto, PriceUnitDto priceUnitDto, Integer num, String str4, String str5, String str6, String str7, String str8) {
        this.amount = str;
        this.currency = marketCurrencyDto;
        this.text = str2;
        this.amountTo = str3;
        this.priceType = priceTypeDto;
        this.priceUnit = priceUnitDto;
        this.discountRate = num;
        this.oldAmount = str4;
        this.oldAmountText = str5;
        this.loyaltyAmount = str6;
        this.loyaltyAmountText = str7;
        this.loyaltyAmountColor = str8;
    }

    public final String d() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCurrencyDto e() {
        return this.currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPriceDto)) {
            return false;
        }
        MarketPriceDto marketPriceDto = (MarketPriceDto) obj;
        return epx.f(this.amount, marketPriceDto.amount) && epx.f(this.currency, marketPriceDto.currency) && epx.f(this.text, marketPriceDto.text) && epx.f(this.amountTo, marketPriceDto.amountTo) && this.priceType == marketPriceDto.priceType && this.priceUnit == marketPriceDto.priceUnit && epx.f(this.discountRate, marketPriceDto.discountRate) && epx.f(this.oldAmount, marketPriceDto.oldAmount) && epx.f(this.oldAmountText, marketPriceDto.oldAmountText) && epx.f(this.loyaltyAmount, marketPriceDto.loyaltyAmount) && epx.f(this.loyaltyAmountText, marketPriceDto.loyaltyAmountText) && epx.f(this.loyaltyAmountColor, marketPriceDto.loyaltyAmountColor);
    }

    public final Integer f() {
        return this.discountRate;
    }

    public final String g() {
        return this.loyaltyAmount;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.currency.hashCode() + (this.amount.hashCode() * 31)) * 31, 31, this.text);
        String str = this.amountTo;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        PriceTypeDto priceTypeDto = this.priceType;
        int hashCode2 = (hashCode + (priceTypeDto == null ? 0 : priceTypeDto.hashCode())) * 31;
        PriceUnitDto priceUnitDto = this.priceUnit;
        int hashCode3 = (hashCode2 + (priceUnitDto == null ? 0 : priceUnitDto.hashCode())) * 31;
        Integer num = this.discountRate;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.oldAmount;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oldAmountText;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loyaltyAmount;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.loyaltyAmountText;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loyaltyAmountColor;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String i() {
        return this.loyaltyAmountColor;
    }

    public final String j() {
        return this.loyaltyAmountText;
    }

    public final String k() {
        return this.oldAmount;
    }

    public final String l() {
        return this.oldAmountText;
    }

    public final String n() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPriceDto(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", amountTo=");
        sb.append(this.amountTo);
        sb.append(", priceType=");
        sb.append(this.priceType);
        sb.append(", priceUnit=");
        sb.append(this.priceUnit);
        sb.append(", discountRate=");
        sb.append(this.discountRate);
        sb.append(", oldAmount=");
        sb.append(this.oldAmount);
        sb.append(", oldAmountText=");
        sb.append(this.oldAmountText);
        sb.append(", loyaltyAmount=");
        sb.append(this.loyaltyAmount);
        sb.append(", loyaltyAmountText=");
        sb.append(this.loyaltyAmountText);
        sb.append(", loyaltyAmountColor=");
        return ho8.a(sb, this.loyaltyAmountColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        this.currency.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.amountTo);
        PriceTypeDto priceTypeDto = this.priceType;
        if (priceTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceTypeDto.writeToParcel(parcel, i);
        }
        PriceUnitDto priceUnitDto = this.priceUnit;
        if (priceUnitDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceUnitDto.writeToParcel(parcel, i);
        }
        Integer num = this.discountRate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.oldAmount);
        parcel.writeString(this.oldAmountText);
        parcel.writeString(this.loyaltyAmount);
        parcel.writeString(this.loyaltyAmountText);
        parcel.writeString(this.loyaltyAmountColor);
    }

    public /* synthetic */ MarketPriceDto(String str, MarketCurrencyDto marketCurrencyDto, String str2, String str3, PriceTypeDto priceTypeDto, PriceUnitDto priceUnitDto, Integer num, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this(str, marketCurrencyDto, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : priceTypeDto, (i & 32) != 0 ? null : priceUnitDto, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
    }
}

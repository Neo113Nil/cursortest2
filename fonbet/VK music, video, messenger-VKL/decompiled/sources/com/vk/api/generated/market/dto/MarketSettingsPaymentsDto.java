package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketSettingsPaymentsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsPaymentsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsPaymentsDto> CREATOR = new a();

    @pmi0("has_secret_key")
    private final Boolean hasSecretKey;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("merchant_id")
    private final Integer merchantId;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("payment_type")
    private final Integer paymentType;

    /* renamed from: receivers, reason: collision with root package name */
    @pmi0("receivers")
    private final MarketPaymentsReceiversSettingsDto f75receivers;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("vk_pay_status")
    private final VkPayStatusDto vkPayStatus;

    @pmi0("vkpay_discount")
    private final Integer vkpayDiscount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketSettingsPaymentsDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("legal")
        public static final TypeDto LEGAL;

        @pmi0("natural")
        public static final TypeDto NATURAL;
        private final String value;

        /* compiled from: MarketSettingsPaymentsDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("LEGAL", 0, "legal");
            LEGAL = typeDto;
            TypeDto typeDto2 = new TypeDto("NATURAL", 1, "natural");
            NATURAL = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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
    /* compiled from: MarketSettingsPaymentsDto.kt */
    public static final class VkPayStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkPayStatusDto[] $VALUES;

        @pmi0("anonymous")
        public static final VkPayStatusDto ANONYMOUS;
        public static final Parcelable.Creator<VkPayStatusDto> CREATOR;

        @pmi0("identified")
        public static final VkPayStatusDto IDENTIFIED;

        @pmi0("simplified")
        public static final VkPayStatusDto SIMPLIFIED;
        private final String value;

        /* compiled from: MarketSettingsPaymentsDto.kt */
        public static final class a implements Parcelable.Creator<VkPayStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final VkPayStatusDto createFromParcel(Parcel parcel) {
                return VkPayStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkPayStatusDto[] newArray(int i) {
                return new VkPayStatusDto[i];
            }
        }

        static {
            VkPayStatusDto vkPayStatusDto = new VkPayStatusDto("ANONYMOUS", 0, "anonymous");
            ANONYMOUS = vkPayStatusDto;
            VkPayStatusDto vkPayStatusDto2 = new VkPayStatusDto("SIMPLIFIED", 1, "simplified");
            SIMPLIFIED = vkPayStatusDto2;
            VkPayStatusDto vkPayStatusDto3 = new VkPayStatusDto("IDENTIFIED", 2, "identified");
            IDENTIFIED = vkPayStatusDto3;
            VkPayStatusDto[] vkPayStatusDtoArr = {vkPayStatusDto, vkPayStatusDto2, vkPayStatusDto3};
            $VALUES = vkPayStatusDtoArr;
            $ENTRIES = new asp(vkPayStatusDtoArr);
            CREATOR = new a();
        }

        private VkPayStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VkPayStatusDto valueOf(String str) {
            return (VkPayStatusDto) Enum.valueOf(VkPayStatusDto.class, str);
        }

        public static VkPayStatusDto[] values() {
            return (VkPayStatusDto[]) $VALUES.clone();
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

    /* compiled from: MarketSettingsPaymentsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsPaymentsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsPaymentsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            VkPayStatusDto createFromParcel2 = parcel.readInt() == 0 ? null : VkPayStatusDto.CREATOR.createFromParcel(parcel);
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketSettingsPaymentsDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketSettingsPaymentsDto(z, createFromParcel, createFromParcel2, marketPriceDto, valueOf2, valueOf3, valueOf, parcel.readInt() == 0 ? null : MarketPaymentsReceiversSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsPaymentsDto[] newArray(int i) {
            return new MarketSettingsPaymentsDto[i];
        }
    }

    public MarketSettingsPaymentsDto(boolean z, TypeDto typeDto, VkPayStatusDto vkPayStatusDto, MarketPriceDto marketPriceDto, Integer num, Integer num2, Boolean bool, MarketPaymentsReceiversSettingsDto marketPaymentsReceiversSettingsDto, Integer num3) {
        this.isEnabled = z;
        this.type = typeDto;
        this.vkPayStatus = vkPayStatusDto;
        this.minOrderPrice = marketPriceDto;
        this.merchantId = num;
        this.vkpayDiscount = num2;
        this.hasSecretKey = bool;
        this.f75receivers = marketPaymentsReceiversSettingsDto;
        this.paymentType = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsPaymentsDto)) {
            return false;
        }
        MarketSettingsPaymentsDto marketSettingsPaymentsDto = (MarketSettingsPaymentsDto) obj;
        return this.isEnabled == marketSettingsPaymentsDto.isEnabled && this.type == marketSettingsPaymentsDto.type && this.vkPayStatus == marketSettingsPaymentsDto.vkPayStatus && epx.f(this.minOrderPrice, marketSettingsPaymentsDto.minOrderPrice) && epx.f(this.merchantId, marketSettingsPaymentsDto.merchantId) && epx.f(this.vkpayDiscount, marketSettingsPaymentsDto.vkpayDiscount) && epx.f(this.hasSecretKey, marketSettingsPaymentsDto.hasSecretKey) && epx.f(this.f75receivers, marketSettingsPaymentsDto.f75receivers) && epx.f(this.paymentType, marketSettingsPaymentsDto.paymentType);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        TypeDto typeDto = this.type;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        VkPayStatusDto vkPayStatusDto = this.vkPayStatus;
        int hashCode3 = (hashCode2 + (vkPayStatusDto == null ? 0 : vkPayStatusDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode4 = (hashCode3 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        Integer num = this.merchantId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.vkpayDiscount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasSecretKey;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketPaymentsReceiversSettingsDto marketPaymentsReceiversSettingsDto = this.f75receivers;
        int hashCode8 = (hashCode7 + (marketPaymentsReceiversSettingsDto == null ? 0 : marketPaymentsReceiversSettingsDto.hashCode())) * 31;
        Integer num3 = this.paymentType;
        return hashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSettingsPaymentsDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", vkPayStatus=");
        sb.append(this.vkPayStatus);
        sb.append(", minOrderPrice=");
        sb.append(this.minOrderPrice);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", vkpayDiscount=");
        sb.append(this.vkpayDiscount);
        sb.append(", hasSecretKey=");
        sb.append(this.hasSecretKey);
        sb.append(", receivers=");
        sb.append(this.f75receivers);
        sb.append(", paymentType=");
        return uqi.b(sb, this.paymentType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        VkPayStatusDto vkPayStatusDto = this.vkPayStatus;
        if (vkPayStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkPayStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.minOrderPrice, i);
        Integer num = this.merchantId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.vkpayDiscount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.hasSecretKey;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarketPaymentsReceiversSettingsDto marketPaymentsReceiversSettingsDto = this.f75receivers;
        if (marketPaymentsReceiversSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentsReceiversSettingsDto.writeToParcel(parcel, i);
        }
        Integer num3 = this.paymentType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ MarketSettingsPaymentsDto(boolean z, TypeDto typeDto, VkPayStatusDto vkPayStatusDto, MarketPriceDto marketPriceDto, Integer num, Integer num2, Boolean bool, MarketPaymentsReceiversSettingsDto marketPaymentsReceiversSettingsDto, Integer num3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : typeDto, (i & 4) != 0 ? null : vkPayStatusDto, (i & 8) != 0 ? null : marketPriceDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : marketPaymentsReceiversSettingsDto, (i & 256) != 0 ? null : num3);
    }
}

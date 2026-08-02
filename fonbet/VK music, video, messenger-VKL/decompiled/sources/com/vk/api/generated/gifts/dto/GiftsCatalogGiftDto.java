package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.store.dto.StoreAdditionalViewPriceDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsCatalogGiftDto.kt */
/* loaded from: classes14.dex */
public final class GiftsCatalogGiftDto implements Parcelable {
    public static final Parcelable.Creator<GiftsCatalogGiftDto> CREATOR = new a();

    @pmi0("additional_view_price_buy")
    private final StoreAdditionalViewPriceDto additionalViewPriceBuy;

    @pmi0("can_schedule")
    private final Boolean canSchedule;

    @pmi0("description")
    private final String description;

    @pmi0(C4217a2.e)
    private final BaseBoolIntDto disabled;

    @pmi0("gift")
    private final GiftsLayoutDto gift;

    @pmi0("gifts_left")
    private final Integer giftsLeft;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<GiftsCatalogGiftOptionDto> options;

    @pmi0("payment_type")
    private final PaymentTypeDto paymentType;

    @pmi0("price")
    private final Integer price;

    @pmi0("price_str")
    private final String priceStr;

    @pmi0("real_price")
    private final Integer realPrice;

    @pmi0("real_price_str")
    private final String realPriceStr;

    @pmi0("reward_hash")
    private final String rewardHash;

    @pmi0("sticker_pack")
    private final GiftsCatalogGiftStickerPackDto stickerPack;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("votes_attachments_config")
    private final GiftsGiftVotesAttachmentsConfigDto votesAttachmentsConfig;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsCatalogGiftDto.kt */
    public static final class PaymentTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PaymentTypeDto[] $VALUES;

        @pmi0("balance")
        public static final PaymentTypeDto BALANCE;
        public static final Parcelable.Creator<PaymentTypeDto> CREATOR;
        private final String value;

        /* compiled from: GiftsCatalogGiftDto.kt */
        public static final class a implements Parcelable.Creator<PaymentTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PaymentTypeDto createFromParcel(Parcel parcel) {
                return PaymentTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentTypeDto[] newArray(int i) {
                return new PaymentTypeDto[i];
            }
        }

        static {
            PaymentTypeDto paymentTypeDto = new PaymentTypeDto("BALANCE", 0, "balance");
            BALANCE = paymentTypeDto;
            PaymentTypeDto[] paymentTypeDtoArr = {paymentTypeDto};
            $VALUES = paymentTypeDtoArr;
            $ENTRIES = new asp(paymentTypeDtoArr);
            CREATOR = new a();
        }

        private PaymentTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PaymentTypeDto valueOf(String str) {
            return (PaymentTypeDto) Enum.valueOf(PaymentTypeDto.class, str);
        }

        public static PaymentTypeDto[] values() {
            return (PaymentTypeDto[]) $VALUES.clone();
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

    /* compiled from: GiftsCatalogGiftDto.kt */
    public static final class a implements Parcelable.Creator<GiftsCatalogGiftDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogGiftDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            GiftsLayoutDto giftsLayoutDto;
            Boolean valueOf;
            GiftsLayoutDto createFromParcel = GiftsLayoutDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            GiftsCatalogGiftStickerPackDto createFromParcel2 = parcel.readInt() == 0 ? null : GiftsCatalogGiftStickerPackDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(GiftsCatalogGiftDto.class.getClassLoader());
            PaymentTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : PaymentTypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            StoreAdditionalViewPriceDto createFromParcel4 = parcel.readInt() == 0 ? null : StoreAdditionalViewPriceDto.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                giftsLayoutDto = createFromParcel;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                giftsLayoutDto = createFromParcel;
                int i = 0;
                while (i != readInt) {
                    i = en.a(GiftsCatalogGiftOptionDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    readString = readString;
                }
            }
            String str = readString;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GiftsCatalogGiftDto(giftsLayoutDto, str, createFromParcel2, baseBoolIntDto, createFromParcel3, valueOf2, readString2, valueOf3, valueOf4, readString3, readString4, createFromParcel4, readString5, arrayList, valueOf, parcel.readInt() == 0 ? null : GiftsGiftVotesAttachmentsConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogGiftDto[] newArray(int i) {
            return new GiftsCatalogGiftDto[i];
        }
    }

    public GiftsCatalogGiftDto(GiftsLayoutDto giftsLayoutDto, String str, GiftsCatalogGiftStickerPackDto giftsCatalogGiftStickerPackDto, BaseBoolIntDto baseBoolIntDto, PaymentTypeDto paymentTypeDto, Integer num, String str2, Integer num2, Integer num3, String str3, String str4, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str5, List<GiftsCatalogGiftOptionDto> list, Boolean bool, GiftsGiftVotesAttachmentsConfigDto giftsGiftVotesAttachmentsConfigDto) {
        this.gift = giftsLayoutDto;
        this.description = str;
        this.stickerPack = giftsCatalogGiftStickerPackDto;
        this.disabled = baseBoolIntDto;
        this.paymentType = paymentTypeDto;
        this.price = num;
        this.priceStr = str2;
        this.giftsLeft = num2;
        this.realPrice = num3;
        this.realPriceStr = str3;
        this.rewardHash = str4;
        this.additionalViewPriceBuy = storeAdditionalViewPriceDto;
        this.trackCode = str5;
        this.options = list;
        this.canSchedule = bool;
        this.votesAttachmentsConfig = giftsGiftVotesAttachmentsConfigDto;
    }

    public final GiftsLayoutDto d() {
        return this.gift;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.giftsLeft;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsCatalogGiftDto)) {
            return false;
        }
        GiftsCatalogGiftDto giftsCatalogGiftDto = (GiftsCatalogGiftDto) obj;
        return epx.f(this.gift, giftsCatalogGiftDto.gift) && epx.f(this.description, giftsCatalogGiftDto.description) && epx.f(this.stickerPack, giftsCatalogGiftDto.stickerPack) && this.disabled == giftsCatalogGiftDto.disabled && this.paymentType == giftsCatalogGiftDto.paymentType && epx.f(this.price, giftsCatalogGiftDto.price) && epx.f(this.priceStr, giftsCatalogGiftDto.priceStr) && epx.f(this.giftsLeft, giftsCatalogGiftDto.giftsLeft) && epx.f(this.realPrice, giftsCatalogGiftDto.realPrice) && epx.f(this.realPriceStr, giftsCatalogGiftDto.realPriceStr) && epx.f(this.rewardHash, giftsCatalogGiftDto.rewardHash) && epx.f(this.additionalViewPriceBuy, giftsCatalogGiftDto.additionalViewPriceBuy) && epx.f(this.trackCode, giftsCatalogGiftDto.trackCode) && epx.f(this.options, giftsCatalogGiftDto.options) && epx.f(this.canSchedule, giftsCatalogGiftDto.canSchedule) && epx.f(this.votesAttachmentsConfig, giftsCatalogGiftDto.votesAttachmentsConfig);
    }

    public final Integer f() {
        return this.price;
    }

    public final Integer g() {
        return this.realPrice;
    }

    public final int hashCode() {
        int hashCode = this.gift.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GiftsCatalogGiftStickerPackDto giftsCatalogGiftStickerPackDto = this.stickerPack;
        int hashCode3 = (hashCode2 + (giftsCatalogGiftStickerPackDto == null ? 0 : giftsCatalogGiftStickerPackDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.disabled;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        PaymentTypeDto paymentTypeDto = this.paymentType;
        int hashCode5 = (hashCode4 + (paymentTypeDto == null ? 0 : paymentTypeDto.hashCode())) * 31;
        Integer num = this.price;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.priceStr;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.giftsLeft;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.realPrice;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.realPriceStr;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rewardHash;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        int hashCode12 = (hashCode11 + (storeAdditionalViewPriceDto == null ? 0 : storeAdditionalViewPriceDto.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<GiftsCatalogGiftOptionDto> list = this.options;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canSchedule;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        GiftsGiftVotesAttachmentsConfigDto giftsGiftVotesAttachmentsConfigDto = this.votesAttachmentsConfig;
        return hashCode15 + (giftsGiftVotesAttachmentsConfigDto != null ? giftsGiftVotesAttachmentsConfigDto.hashCode() : 0);
    }

    public final String toString() {
        return "GiftsCatalogGiftDto(gift=" + this.gift + ", description=" + this.description + ", stickerPack=" + this.stickerPack + ", disabled=" + this.disabled + ", paymentType=" + this.paymentType + ", price=" + this.price + ", priceStr=" + this.priceStr + ", giftsLeft=" + this.giftsLeft + ", realPrice=" + this.realPrice + ", realPriceStr=" + this.realPriceStr + ", rewardHash=" + this.rewardHash + ", additionalViewPriceBuy=" + this.additionalViewPriceBuy + ", trackCode=" + this.trackCode + ", options=" + this.options + ", canSchedule=" + this.canSchedule + ", votesAttachmentsConfig=" + this.votesAttachmentsConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.gift.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        GiftsCatalogGiftStickerPackDto giftsCatalogGiftStickerPackDto = this.stickerPack;
        if (giftsCatalogGiftStickerPackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsCatalogGiftStickerPackDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.disabled, i);
        PaymentTypeDto paymentTypeDto = this.paymentType;
        if (paymentTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentTypeDto.writeToParcel(parcel, i);
        }
        Integer num = this.price;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.priceStr);
        Integer num2 = this.giftsLeft;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.realPrice;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.realPriceStr);
        parcel.writeString(this.rewardHash);
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        if (storeAdditionalViewPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeAdditionalViewPriceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        List<GiftsCatalogGiftOptionDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GiftsCatalogGiftOptionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.canSchedule;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        GiftsGiftVotesAttachmentsConfigDto giftsGiftVotesAttachmentsConfigDto = this.votesAttachmentsConfig;
        if (giftsGiftVotesAttachmentsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftVotesAttachmentsConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsCatalogGiftDto(GiftsLayoutDto giftsLayoutDto, String str, GiftsCatalogGiftStickerPackDto giftsCatalogGiftStickerPackDto, BaseBoolIntDto baseBoolIntDto, PaymentTypeDto paymentTypeDto, Integer num, String str2, Integer num2, Integer num3, String str3, String str4, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str5, List list, Boolean bool, GiftsGiftVotesAttachmentsConfigDto giftsGiftVotesAttachmentsConfigDto, int i, zcl zclVar) {
        this(giftsLayoutDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : giftsCatalogGiftStickerPackDto, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : paymentTypeDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : storeAdditionalViewPriceDto, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : giftsGiftVotesAttachmentsConfigDto);
    }
}

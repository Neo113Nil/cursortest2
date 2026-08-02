package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoreProductDto.kt */
/* loaded from: classes15.dex */
public final class StoreProductDto implements Parcelable {
    public static final Parcelable.Creator<StoreProductDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final BaseBoolIntDto active;

    @pmi0("auto_renew")
    private final BaseBoolIntDto autoRenew;

    @pmi0("base_id")
    private final Integer baseId;

    @pmi0("billing_retry_period")
    private final BaseBoolIntDto billingRetryPeriod;

    @pmi0("cashback")
    private final StoreSubscriptionCashbackDto cashback;

    @pmi0("copyright")
    private final String copyright;

    @pmi0("country")
    private final String country;

    @pmi0("description_lang_key")
    private final String descriptionLangKey;

    @pmi0("expires_date")
    private final Integer expiresDate;

    @pmi0("has_animation")
    private final Boolean hasAnimation;

    @pmi0("icon")
    private final StoreProductIconDto icon;

    @pmi0("id")
    private final int id;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("is_popup")
    private final Boolean isPopup;

    @pmi0("is_trial_period")
    private final BaseBoolIntDto isTrialPeriod;

    @pmi0("is_vmoji")
    private final Boolean isVmoji;

    @pmi0("merchant")
    private final String merchant;

    @pmi0("merchant_title")
    private final String merchantTitle;

    @pmi0("payment_region")
    private final String paymentRegion;

    @pmi0("previews")
    private final List<BaseImageDto> previews;

    @pmi0("promoted")
    private final BaseBoolIntDto promoted;

    @pmi0("purchase_date")
    private final Integer purchaseDate;

    @pmi0("purchased")
    private final BaseBoolIntDto purchased;

    @pmi0("status")
    private final String status;

    @pmi0("stickers")
    private final List<BaseStickerDto> stickers;

    @pmi0("store_product_id")
    private final String storeProductId;

    @pmi0("style_ids")
    private final List<Integer> styleIds;

    @pmi0("style_sticker_ids")
    private final List<Integer> styleStickerIds;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("tariff_description")
    private final String tariffDescription;

    @pmi0("tariff_title")
    private final String tariffTitle;

    @pmi0("title")
    private final String title;

    @pmi0("title_lang_key")
    private final String titleLangKey;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("vmoji_avatar")
    private final VmojiAvatarDto vmojiAvatar;

    @pmi0("votes")
    private final Integer votes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreProductDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("stickers")
        public static final TypeDto STICKERS;

        @pmi0("subscriprions")
        public static final TypeDto SUBSCRIPRIONS;

        @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
        public static final TypeDto SUBSCRIPTIONS;

        @pmi0("votes")
        public static final TypeDto VOTES;
        private final String value;

        /* compiled from: StoreProductDto.kt */
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
            TypeDto typeDto = new TypeDto("STICKERS", 0, "stickers");
            STICKERS = typeDto;
            TypeDto typeDto2 = new TypeDto("VOTES", 1, "votes");
            VOTES = typeDto2;
            TypeDto typeDto3 = new TypeDto("SUBSCRIPRIONS", 2, "subscriprions");
            SUBSCRIPRIONS = typeDto3;
            TypeDto typeDto4 = new TypeDto("SUBSCRIPTIONS", 3, BillingClient.FeatureType.SUBSCRIPTIONS);
            SUBSCRIPTIONS = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StoreProductDto.kt */
    public static final class a implements Parcelable.Creator<StoreProductDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreProductDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i;
            ArrayList arrayList3;
            TypeDto typeDto;
            ArrayList arrayList4;
            StoreProductIconDto storeProductIconDto;
            boolean z;
            Boolean valueOf2;
            BaseBoolIntDto baseBoolIntDto;
            StoreSubscriptionCashbackDto createFromParcel;
            StoreSubscriptionCashbackDto storeSubscriptionCashbackDto;
            VmojiAvatarDto createFromParcel2;
            Boolean valueOf3;
            Boolean bool;
            int readInt = parcel.readInt();
            TypeDto createFromParcel3 = TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                i = readInt;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(StoreProductDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                typeDto = createFromParcel3;
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                typeDto = createFromParcel3;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = pm0.b(parcel, arrayList3, i4, 1);
                }
            }
            StoreProductIconDto createFromParcel4 = parcel.readInt() == 0 ? null : StoreProductIconDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                storeProductIconDto = createFromParcel4;
                z = true;
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                storeProductIconDto = createFromParcel4;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(StoreProductDto.class, parcel, arrayList4, i5, 1);
                    readInt5 = readInt5;
                }
                z = true;
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool2 = valueOf2;
            int i6 = i;
            String readString3 = parcel.readString();
            boolean z2 = z;
            TypeDto typeDto2 = typeDto;
            String readString4 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList5 = arrayList3;
            ArrayList arrayList6 = arrayList;
            Integer num = valueOf5;
            StoreProductIconDto storeProductIconDto2 = storeProductIconDto;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(StoreProductDto.class.getClassLoader());
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto7;
                createFromParcel = null;
            } else {
                baseBoolIntDto = baseBoolIntDto7;
                createFromParcel = StoreSubscriptionCashbackDto.CREATOR.createFromParcel(parcel);
            }
            StoreSubscriptionCashbackDto storeSubscriptionCashbackDto2 = createFromParcel;
            Integer num2 = valueOf6;
            Integer num3 = valueOf7;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto8 = baseBoolIntDto;
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                storeSubscriptionCashbackDto = storeSubscriptionCashbackDto2;
                createFromParcel2 = null;
            } else {
                storeSubscriptionCashbackDto = storeSubscriptionCashbackDto2;
                createFromParcel2 = VmojiAvatarDto.CREATOR.createFromParcel(parcel);
            }
            VmojiAvatarDto vmojiAvatarDto = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
                bool = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
                bool = null;
            }
            String readString12 = parcel.readString();
            boolean z3 = false;
            StoreSubscriptionCashbackDto storeSubscriptionCashbackDto3 = storeSubscriptionCashbackDto;
            String readString13 = parcel.readString();
            Boolean bool3 = valueOf3;
            String readString14 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = z2;
                }
                bool = Boolean.valueOf(z3);
            }
            return new StoreProductDto(i6, typeDto2, valueOf, readString, valueOf4, arrayList6, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, num, readString2, arrayList2, arrayList5, storeProductIconDto2, arrayList4, bool2, num2, readString3, readString4, num3, readString5, readString6, readString7, baseBoolIntDto5, baseBoolIntDto6, baseBoolIntDto8, readString8, storeSubscriptionCashbackDto3, readString9, readString10, readString11, vmojiAvatarDto, bool3, readString12, readString13, readString14, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreProductDto[] newArray(int i) {
            return new StoreProductDto[i];
        }
    }

    public StoreProductDto(int i, TypeDto typeDto, Boolean bool, String str, Integer num, List<Integer> list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num2, String str2, List<BaseStickerDto> list2, List<Integer> list3, StoreProductIconDto storeProductIconDto, List<BaseImageDto> list4, Boolean bool2, Integer num3, String str3, String str4, Integer num4, String str5, String str6, String str7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str8, StoreSubscriptionCashbackDto storeSubscriptionCashbackDto, String str9, String str10, String str11, VmojiAvatarDto vmojiAvatarDto, Boolean bool3, String str12, String str13, String str14, Boolean bool4) {
        this.id = i;
        this.type = typeDto;
        this.isNew = bool;
        this.copyright = str;
        this.baseId = num;
        this.styleIds = list;
        this.purchased = baseBoolIntDto;
        this.active = baseBoolIntDto2;
        this.promoted = baseBoolIntDto3;
        this.purchaseDate = num2;
        this.title = str2;
        this.stickers = list2;
        this.styleStickerIds = list3;
        this.icon = storeProductIconDto;
        this.previews = list4;
        this.hasAnimation = bool2;
        this.votes = num3;
        this.subtitle = str3;
        this.status = str4;
        this.expiresDate = num4;
        this.country = str5;
        this.merchant = str6;
        this.merchantTitle = str7;
        this.billingRetryPeriod = baseBoolIntDto4;
        this.isTrialPeriod = baseBoolIntDto5;
        this.autoRenew = baseBoolIntDto6;
        this.storeProductId = str8;
        this.cashback = storeSubscriptionCashbackDto;
        this.tariffTitle = str9;
        this.tariffDescription = str10;
        this.paymentRegion = str11;
        this.vmojiAvatar = vmojiAvatarDto;
        this.isVmoji = bool3;
        this.titleLangKey = str12;
        this.descriptionLangKey = str13;
        this.url = str14;
        this.isPopup = bool4;
    }

    public final TypeDto B() {
        return this.type;
    }

    public final VmojiAvatarDto C() {
        return this.vmojiAvatar;
    }

    public final Boolean D() {
        return this.isNew;
    }

    public final Boolean F() {
        return this.isPopup;
    }

    public final Boolean G() {
        return this.isVmoji;
    }

    public final BaseBoolIntDto d() {
        return this.active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.baseId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProductDto)) {
            return false;
        }
        StoreProductDto storeProductDto = (StoreProductDto) obj;
        return this.id == storeProductDto.id && this.type == storeProductDto.type && epx.f(this.isNew, storeProductDto.isNew) && epx.f(this.copyright, storeProductDto.copyright) && epx.f(this.baseId, storeProductDto.baseId) && epx.f(this.styleIds, storeProductDto.styleIds) && this.purchased == storeProductDto.purchased && this.active == storeProductDto.active && this.promoted == storeProductDto.promoted && epx.f(this.purchaseDate, storeProductDto.purchaseDate) && epx.f(this.title, storeProductDto.title) && epx.f(this.stickers, storeProductDto.stickers) && epx.f(this.styleStickerIds, storeProductDto.styleStickerIds) && epx.f(this.icon, storeProductDto.icon) && epx.f(this.previews, storeProductDto.previews) && epx.f(this.hasAnimation, storeProductDto.hasAnimation) && epx.f(this.votes, storeProductDto.votes) && epx.f(this.subtitle, storeProductDto.subtitle) && epx.f(this.status, storeProductDto.status) && epx.f(this.expiresDate, storeProductDto.expiresDate) && epx.f(this.country, storeProductDto.country) && epx.f(this.merchant, storeProductDto.merchant) && epx.f(this.merchantTitle, storeProductDto.merchantTitle) && this.billingRetryPeriod == storeProductDto.billingRetryPeriod && this.isTrialPeriod == storeProductDto.isTrialPeriod && this.autoRenew == storeProductDto.autoRenew && epx.f(this.storeProductId, storeProductDto.storeProductId) && epx.f(this.cashback, storeProductDto.cashback) && epx.f(this.tariffTitle, storeProductDto.tariffTitle) && epx.f(this.tariffDescription, storeProductDto.tariffDescription) && epx.f(this.paymentRegion, storeProductDto.paymentRegion) && epx.f(this.vmojiAvatar, storeProductDto.vmojiAvatar) && epx.f(this.isVmoji, storeProductDto.isVmoji) && epx.f(this.titleLangKey, storeProductDto.titleLangKey) && epx.f(this.descriptionLangKey, storeProductDto.descriptionLangKey) && epx.f(this.url, storeProductDto.url) && epx.f(this.isPopup, storeProductDto.isPopup);
    }

    public final String f() {
        return this.copyright;
    }

    public final Boolean g() {
        return this.hasAnimation;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Boolean bool = this.isNew;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.copyright;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.baseId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.styleIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.purchased;
        int hashCode6 = (hashCode5 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.active;
        int hashCode7 = (hashCode6 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.promoted;
        int hashCode8 = (hashCode7 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num2 = this.purchaseDate;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.title;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseStickerDto> list2 = this.stickers;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.styleStickerIds;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        StoreProductIconDto storeProductIconDto = this.icon;
        int hashCode13 = (hashCode12 + (storeProductIconDto == null ? 0 : storeProductIconDto.hashCode())) * 31;
        List<BaseImageDto> list4 = this.previews;
        int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.hasAnimation;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.votes;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.expiresDate;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.country;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchant;
        int hashCode21 = (hashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.merchantTitle;
        int hashCode22 = (hashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.billingRetryPeriod;
        int hashCode23 = (hashCode22 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.isTrialPeriod;
        int hashCode24 = (hashCode23 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.autoRenew;
        int hashCode25 = (hashCode24 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        String str8 = this.storeProductId;
        int hashCode26 = (hashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        StoreSubscriptionCashbackDto storeSubscriptionCashbackDto = this.cashback;
        int hashCode27 = (hashCode26 + (storeSubscriptionCashbackDto == null ? 0 : storeSubscriptionCashbackDto.hashCode())) * 31;
        String str9 = this.tariffTitle;
        int hashCode28 = (hashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tariffDescription;
        int hashCode29 = (hashCode28 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentRegion;
        int hashCode30 = (hashCode29 + (str11 == null ? 0 : str11.hashCode())) * 31;
        VmojiAvatarDto vmojiAvatarDto = this.vmojiAvatar;
        int hashCode31 = (hashCode30 + (vmojiAvatarDto == null ? 0 : vmojiAvatarDto.hashCode())) * 31;
        Boolean bool3 = this.isVmoji;
        int hashCode32 = (hashCode31 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.titleLangKey;
        int hashCode33 = (hashCode32 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.descriptionLangKey;
        int hashCode34 = (hashCode33 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.url;
        int hashCode35 = (hashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool4 = this.isPopup;
        return hashCode35 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final StoreProductIconDto i() {
        return this.icon;
    }

    public final List<BaseImageDto> j() {
        return this.previews;
    }

    public final BaseBoolIntDto k() {
        return this.promoted;
    }

    public final Integer l() {
        return this.purchaseDate;
    }

    public final BaseBoolIntDto n() {
        return this.purchased;
    }

    public final List<BaseStickerDto> o() {
        return this.stickers;
    }

    public final List<Integer> p() {
        return this.styleIds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreProductDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", copyright=");
        sb.append(this.copyright);
        sb.append(", baseId=");
        sb.append(this.baseId);
        sb.append(", styleIds=");
        sb.append(this.styleIds);
        sb.append(", purchased=");
        sb.append(this.purchased);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", promoted=");
        sb.append(this.promoted);
        sb.append(", purchaseDate=");
        sb.append(this.purchaseDate);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", styleStickerIds=");
        sb.append(this.styleStickerIds);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", previews=");
        sb.append(this.previews);
        sb.append(", hasAnimation=");
        sb.append(this.hasAnimation);
        sb.append(", votes=");
        sb.append(this.votes);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", expiresDate=");
        sb.append(this.expiresDate);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", merchant=");
        sb.append(this.merchant);
        sb.append(", merchantTitle=");
        sb.append(this.merchantTitle);
        sb.append(", billingRetryPeriod=");
        sb.append(this.billingRetryPeriod);
        sb.append(", isTrialPeriod=");
        sb.append(this.isTrialPeriod);
        sb.append(", autoRenew=");
        sb.append(this.autoRenew);
        sb.append(", storeProductId=");
        sb.append(this.storeProductId);
        sb.append(", cashback=");
        sb.append(this.cashback);
        sb.append(", tariffTitle=");
        sb.append(this.tariffTitle);
        sb.append(", tariffDescription=");
        sb.append(this.tariffDescription);
        sb.append(", paymentRegion=");
        sb.append(this.paymentRegion);
        sb.append(", vmojiAvatar=");
        sb.append(this.vmojiAvatar);
        sb.append(", isVmoji=");
        sb.append(this.isVmoji);
        sb.append(", titleLangKey=");
        sb.append(this.titleLangKey);
        sb.append(", descriptionLangKey=");
        sb.append(this.descriptionLangKey);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isPopup=");
        return tn.a(sb, this.isPopup, ')');
    }

    public final List<Integer> u() {
        return this.styleStickerIds;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.copyright);
        Integer num = this.baseId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list = this.styleIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeParcelable(this.purchased, i);
        parcel.writeParcelable(this.active, i);
        parcel.writeParcelable(this.promoted, i);
        Integer num2 = this.purchaseDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.title);
        List<BaseStickerDto> list2 = this.stickers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<Integer> list3 = this.styleStickerIds;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        StoreProductIconDto storeProductIconDto = this.icon;
        if (storeProductIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeProductIconDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list4 = this.previews;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        Boolean bool2 = this.hasAnimation;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num3 = this.votes;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.status);
        Integer num4 = this.expiresDate;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.country);
        parcel.writeString(this.merchant);
        parcel.writeString(this.merchantTitle);
        parcel.writeParcelable(this.billingRetryPeriod, i);
        parcel.writeParcelable(this.isTrialPeriod, i);
        parcel.writeParcelable(this.autoRenew, i);
        parcel.writeString(this.storeProductId);
        StoreSubscriptionCashbackDto storeSubscriptionCashbackDto = this.cashback;
        if (storeSubscriptionCashbackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeSubscriptionCashbackDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tariffTitle);
        parcel.writeString(this.tariffDescription);
        parcel.writeString(this.paymentRegion);
        VmojiAvatarDto vmojiAvatarDto = this.vmojiAvatar;
        if (vmojiAvatarDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiAvatarDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isVmoji;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.titleLangKey);
        parcel.writeString(this.descriptionLangKey);
        parcel.writeString(this.url);
        Boolean bool4 = this.isPopup;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ StoreProductDto(int i, TypeDto typeDto, Boolean bool, String str, Integer num, List list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num2, String str2, List list2, List list3, StoreProductIconDto storeProductIconDto, List list4, Boolean bool2, Integer num3, String str3, String str4, Integer num4, String str5, String str6, String str7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str8, StoreSubscriptionCashbackDto storeSubscriptionCashbackDto, String str9, String str10, String str11, VmojiAvatarDto vmojiAvatarDto, Boolean bool3, String str12, String str13, String str14, Boolean bool4, int i2, int i3, zcl zclVar) {
        this(i, typeDto, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : baseBoolIntDto, (i2 & 128) != 0 ? null : baseBoolIntDto2, (i2 & 256) != 0 ? null : baseBoolIntDto3, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) != 0 ? null : list3, (i2 & 8192) != 0 ? null : storeProductIconDto, (i2 & 16384) != 0 ? null : list4, (32768 & i2) != 0 ? null : bool2, (i2 & 65536) != 0 ? null : num3, (i2 & 131072) != 0 ? null : str3, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str4, (i2 & 524288) != 0 ? null : num4, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str5, (i2 & 2097152) != 0 ? null : str6, (i2 & 4194304) != 0 ? null : str7, (i2 & 8388608) != 0 ? null : baseBoolIntDto4, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto5, (i2 & 33554432) != 0 ? null : baseBoolIntDto6, (i2 & 67108864) != 0 ? null : str8, (i2 & 134217728) != 0 ? null : storeSubscriptionCashbackDto, (i2 & 268435456) != 0 ? null : str9, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str10, (i2 & 1073741824) != 0 ? null : str11, (i2 & Integer.MIN_VALUE) != 0 ? null : vmojiAvatarDto, (i3 & 1) != 0 ? null : bool3, (i3 & 2) != 0 ? null : str12, (i3 & 4) != 0 ? null : str13, (i3 & 8) != 0 ? null : str14, (i3 & 16) != 0 ? null : bool4);
    }
}

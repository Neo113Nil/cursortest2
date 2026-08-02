package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsLayoutDto.kt */
/* loaded from: classes14.dex */
public final class GiftsLayoutDto implements Parcelable {
    public static final Parcelable.Creator<GiftsLayoutDto> CREATOR = new a();

    @pmi0("animation")
    private final GiftsAnimationDto animation;

    @pmi0("backgrounds")
    private final List<GiftsBackgroundDto> backgrounds;

    @pmi0("base_url_config")
    private final GiftsGiftBaseUrlConfigDto baseUrlConfig;

    @pmi0("build_id")
    private final String buildId;

    @pmi0("gift_card")
    private final GiftsGiftCardDto giftCard;

    @pmi0("id")
    private final int id;

    @pmi0("image_status")
    private final GiftsGiftImageStatusAttachmentDto imageStatus;

    @pmi0("image_status_pack")
    private final GiftsGiftImageStatusPackAttachmentDto imageStatusPack;

    @pmi0("is_anonymous")
    private final Boolean isAnonymous;

    @pmi0("is_stickers_style")
    private final Boolean isStickersStyle;

    @pmi0("keywords")
    private final String keywords;

    @pmi0("random_sticker_pack_attempt_id")
    private final Integer randomStickerPackAttemptId;

    @pmi0("rarity")
    private final GiftsRarityDto rarity;

    @pmi0("stickers_product_id")
    private final Integer stickersProductId;

    @pmi0("thumb_256")
    private final String thumb256;

    @pmi0("thumb_48")
    private final String thumb48;

    @pmi0("thumb_512")
    private final String thumb512;

    @pmi0("thumb_96")
    private final String thumb96;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsLayoutDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("gift_card")
        public static final TypeDto GIFT_CARD;

        @pmi0("image_status")
        public static final TypeDto IMAGE_STATUS;

        @pmi0("image_status_pack")
        public static final TypeDto IMAGE_STATUS_PACK;

        @pmi0("random_stickers_pack")
        public static final TypeDto RANDOM_STICKERS_PACK;

        @pmi0("regular")
        public static final TypeDto REGULAR;

        @pmi0("stickers_pack")
        public static final TypeDto STICKERS_PACK;

        @pmi0("stickers_pack_for_choice")
        public static final TypeDto STICKERS_PACK_FOR_CHOICE;
        private final String value;

        /* compiled from: GiftsLayoutDto.kt */
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
            TypeDto typeDto = new TypeDto("IMAGE_STATUS", 0, "image_status");
            IMAGE_STATUS = typeDto;
            TypeDto typeDto2 = new TypeDto("IMAGE_STATUS_PACK", 1, "image_status_pack");
            IMAGE_STATUS_PACK = typeDto2;
            TypeDto typeDto3 = new TypeDto("REGULAR", 2, "regular");
            REGULAR = typeDto3;
            TypeDto typeDto4 = new TypeDto("STICKERS_PACK", 3, "stickers_pack");
            STICKERS_PACK = typeDto4;
            TypeDto typeDto5 = new TypeDto("RANDOM_STICKERS_PACK", 4, "random_stickers_pack");
            RANDOM_STICKERS_PACK = typeDto5;
            TypeDto typeDto6 = new TypeDto("STICKERS_PACK_FOR_CHOICE", 5, "stickers_pack_for_choice");
            STICKERS_PACK_FOR_CHOICE = typeDto6;
            TypeDto typeDto7 = new TypeDto("GIFT_CARD", 6, "gift_card");
            GIFT_CARD = typeDto7;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7};
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

    /* compiled from: GiftsLayoutDto.kt */
    public static final class a implements Parcelable.Creator<GiftsLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsLayoutDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            int i;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GiftsAnimationDto createFromParcel2 = parcel.readInt() == 0 ? null : GiftsAnimationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (true) {
                    i = readInt;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(GiftsBackgroundDto.CREATOR, parcel, arrayList, i2, 1);
                    readInt = i;
                    createFromParcel = createFromParcel;
                }
            } else {
                arrayList = null;
                i = readInt;
            }
            TypeDto typeDto = createFromParcel;
            GiftsRarityDto createFromParcel3 = parcel.readInt() == 0 ? null : GiftsRarityDto.CREATOR.createFromParcel(parcel);
            GiftsGiftImageStatusAttachmentDto createFromParcel4 = parcel.readInt() == 0 ? null : GiftsGiftImageStatusAttachmentDto.CREATOR.createFromParcel(parcel);
            GiftsGiftImageStatusPackAttachmentDto createFromParcel5 = parcel.readInt() == 0 ? null : GiftsGiftImageStatusPackAttachmentDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GiftsLayoutDto(i, typeDto, readString, readString2, readString3, readString4, valueOf3, valueOf, readString5, readString6, valueOf4, createFromParcel2, arrayList, createFromParcel3, createFromParcel4, createFromParcel5, valueOf2, parcel.readInt() == 0 ? null : GiftsGiftCardDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GiftsGiftBaseUrlConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsLayoutDto[] newArray(int i) {
            return new GiftsLayoutDto[i];
        }
    }

    public GiftsLayoutDto(int i, TypeDto typeDto, String str, String str2, String str3, String str4, Integer num, Boolean bool, String str5, String str6, Integer num2, GiftsAnimationDto giftsAnimationDto, List<GiftsBackgroundDto> list, GiftsRarityDto giftsRarityDto, GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto, GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto, Boolean bool2, GiftsGiftCardDto giftsGiftCardDto, GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto) {
        this.id = i;
        this.type = typeDto;
        this.thumb512 = str;
        this.thumb256 = str2;
        this.thumb48 = str3;
        this.thumb96 = str4;
        this.stickersProductId = num;
        this.isStickersStyle = bool;
        this.buildId = str5;
        this.keywords = str6;
        this.randomStickerPackAttemptId = num2;
        this.animation = giftsAnimationDto;
        this.backgrounds = list;
        this.rarity = giftsRarityDto;
        this.imageStatus = giftsGiftImageStatusAttachmentDto;
        this.imageStatusPack = giftsGiftImageStatusPackAttachmentDto;
        this.isAnonymous = bool2;
        this.giftCard = giftsGiftCardDto;
        this.baseUrlConfig = giftsGiftBaseUrlConfigDto;
    }

    public final TypeDto B() {
        return this.type;
    }

    public final Boolean C() {
        return this.isStickersStyle;
    }

    public final GiftsAnimationDto d() {
        return this.animation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GiftsBackgroundDto> e() {
        return this.backgrounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsLayoutDto)) {
            return false;
        }
        GiftsLayoutDto giftsLayoutDto = (GiftsLayoutDto) obj;
        return this.id == giftsLayoutDto.id && this.type == giftsLayoutDto.type && epx.f(this.thumb512, giftsLayoutDto.thumb512) && epx.f(this.thumb256, giftsLayoutDto.thumb256) && epx.f(this.thumb48, giftsLayoutDto.thumb48) && epx.f(this.thumb96, giftsLayoutDto.thumb96) && epx.f(this.stickersProductId, giftsLayoutDto.stickersProductId) && epx.f(this.isStickersStyle, giftsLayoutDto.isStickersStyle) && epx.f(this.buildId, giftsLayoutDto.buildId) && epx.f(this.keywords, giftsLayoutDto.keywords) && epx.f(this.randomStickerPackAttemptId, giftsLayoutDto.randomStickerPackAttemptId) && epx.f(this.animation, giftsLayoutDto.animation) && epx.f(this.backgrounds, giftsLayoutDto.backgrounds) && epx.f(this.rarity, giftsLayoutDto.rarity) && epx.f(this.imageStatus, giftsLayoutDto.imageStatus) && epx.f(this.imageStatusPack, giftsLayoutDto.imageStatusPack) && epx.f(this.isAnonymous, giftsLayoutDto.isAnonymous) && epx.f(this.giftCard, giftsLayoutDto.giftCard) && epx.f(this.baseUrlConfig, giftsLayoutDto.baseUrlConfig);
    }

    public final GiftsGiftBaseUrlConfigDto f() {
        return this.baseUrlConfig;
    }

    public final GiftsGiftCardDto g() {
        return this.giftCard;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        TypeDto typeDto = this.type;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str = this.thumb512;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumb256;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumb48;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb96;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.stickersProductId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isStickersStyle;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.buildId;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.keywords;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.randomStickerPackAttemptId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GiftsAnimationDto giftsAnimationDto = this.animation;
        int hashCode12 = (hashCode11 + (giftsAnimationDto == null ? 0 : giftsAnimationDto.hashCode())) * 31;
        List<GiftsBackgroundDto> list = this.backgrounds;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        GiftsRarityDto giftsRarityDto = this.rarity;
        int hashCode14 = (hashCode13 + (giftsRarityDto == null ? 0 : giftsRarityDto.hashCode())) * 31;
        GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto = this.imageStatus;
        int hashCode15 = (hashCode14 + (giftsGiftImageStatusAttachmentDto == null ? 0 : giftsGiftImageStatusAttachmentDto.hashCode())) * 31;
        GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto = this.imageStatusPack;
        int hashCode16 = (hashCode15 + (giftsGiftImageStatusPackAttachmentDto == null ? 0 : giftsGiftImageStatusPackAttachmentDto.hashCode())) * 31;
        Boolean bool2 = this.isAnonymous;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        GiftsGiftCardDto giftsGiftCardDto = this.giftCard;
        int hashCode18 = (hashCode17 + (giftsGiftCardDto == null ? 0 : giftsGiftCardDto.hashCode())) * 31;
        GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto = this.baseUrlConfig;
        return hashCode18 + (giftsGiftBaseUrlConfigDto != null ? giftsGiftBaseUrlConfigDto.hashCode() : 0);
    }

    public final GiftsGiftImageStatusAttachmentDto i() {
        return this.imageStatus;
    }

    public final GiftsGiftImageStatusPackAttachmentDto j() {
        return this.imageStatusPack;
    }

    public final String k() {
        return this.keywords;
    }

    public final GiftsRarityDto l() {
        return this.rarity;
    }

    public final Integer n() {
        return this.stickersProductId;
    }

    public final String o() {
        return this.thumb256;
    }

    public final String p() {
        return this.thumb48;
    }

    public final String toString() {
        return "GiftsLayoutDto(id=" + this.id + ", type=" + this.type + ", thumb512=" + this.thumb512 + ", thumb256=" + this.thumb256 + ", thumb48=" + this.thumb48 + ", thumb96=" + this.thumb96 + ", stickersProductId=" + this.stickersProductId + ", isStickersStyle=" + this.isStickersStyle + ", buildId=" + this.buildId + ", keywords=" + this.keywords + ", randomStickerPackAttemptId=" + this.randomStickerPackAttemptId + ", animation=" + this.animation + ", backgrounds=" + this.backgrounds + ", rarity=" + this.rarity + ", imageStatus=" + this.imageStatus + ", imageStatusPack=" + this.imageStatusPack + ", isAnonymous=" + this.isAnonymous + ", giftCard=" + this.giftCard + ", baseUrlConfig=" + this.baseUrlConfig + ')';
    }

    public final String u() {
        return this.thumb96;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.thumb512);
        parcel.writeString(this.thumb256);
        parcel.writeString(this.thumb48);
        parcel.writeString(this.thumb96);
        Integer num = this.stickersProductId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isStickersStyle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.buildId);
        parcel.writeString(this.keywords);
        Integer num2 = this.randomStickerPackAttemptId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        GiftsAnimationDto giftsAnimationDto = this.animation;
        if (giftsAnimationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsAnimationDto.writeToParcel(parcel, i);
        }
        List<GiftsBackgroundDto> list = this.backgrounds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GiftsBackgroundDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GiftsRarityDto giftsRarityDto = this.rarity;
        if (giftsRarityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsRarityDto.writeToParcel(parcel, i);
        }
        GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto = this.imageStatus;
        if (giftsGiftImageStatusAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftImageStatusAttachmentDto.writeToParcel(parcel, i);
        }
        GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto = this.imageStatusPack;
        if (giftsGiftImageStatusPackAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftImageStatusPackAttachmentDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isAnonymous;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        GiftsGiftCardDto giftsGiftCardDto = this.giftCard;
        if (giftsGiftCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftCardDto.writeToParcel(parcel, i);
        }
        GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto = this.baseUrlConfig;
        if (giftsGiftBaseUrlConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftBaseUrlConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsLayoutDto(int i, TypeDto typeDto, String str, String str2, String str3, String str4, Integer num, Boolean bool, String str5, String str6, Integer num2, GiftsAnimationDto giftsAnimationDto, List list, GiftsRarityDto giftsRarityDto, GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto, GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto, Boolean bool2, GiftsGiftCardDto giftsGiftCardDto, GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : typeDto, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : giftsAnimationDto, (i2 & 4096) != 0 ? null : list, (i2 & 8192) != 0 ? null : giftsRarityDto, (i2 & 16384) != 0 ? null : giftsGiftImageStatusAttachmentDto, (i2 & 32768) != 0 ? null : giftsGiftImageStatusPackAttachmentDto, (i2 & 65536) != 0 ? null : bool2, (i2 & 131072) != 0 ? null : giftsGiftCardDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : giftsGiftBaseUrlConfigDto);
    }
}

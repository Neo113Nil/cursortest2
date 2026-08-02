package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: GiftsMessagesGiftAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class GiftsMessagesGiftAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<GiftsMessagesGiftAttachmentDto> CREATOR = new a();

    @pmi0("animation")
    private final GiftsAnimationDto animation;

    @pmi0("backgrounds")
    private final List<GiftsBackgroundDto> backgrounds;

    @pmi0("base_url_config")
    private final GiftsGiftBaseUrlConfigDto baseUrlConfig;

    @pmi0("entry_id")
    private final String entryId;

    @pmi0("gift_card")
    private final GiftsGiftCardDto giftCard;

    @pmi0("id")
    private final int id;

    @pmi0("image_status")
    private final GiftsGiftImageStatusAttachmentDto imageStatus;

    @pmi0("image_status_pack")
    private final GiftsGiftImageStatusPackAttachmentDto imageStatusPack;

    @pmi0("is_stickers_style")
    private final Boolean isStickersStyle;

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

    @pmi0("votes_attachment")
    private final GiftsGiftVotesAttachmentDto votesAttachment;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsMessagesGiftAttachmentDto.kt */
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

        /* compiled from: GiftsMessagesGiftAttachmentDto.kt */
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

    /* compiled from: GiftsMessagesGiftAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<GiftsMessagesGiftAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsMessagesGiftAttachmentDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            int i;
            GiftsGiftBaseUrlConfigDto createFromParcel;
            GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto;
            GiftsGiftVotesAttachmentDto createFromParcel2;
            int readInt = parcel.readInt();
            TypeDto createFromParcel3 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i2 = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GiftsAnimationDto createFromParcel4 = parcel.readInt() == 0 ? null : GiftsAnimationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = en.a(GiftsBackgroundDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                arrayList = arrayList2;
            }
            GiftsRarityDto createFromParcel5 = parcel.readInt() == 0 ? null : GiftsRarityDto.CREATOR.createFromParcel(parcel);
            GiftsGiftImageStatusAttachmentDto createFromParcel6 = parcel.readInt() == 0 ? null : GiftsGiftImageStatusAttachmentDto.CREATOR.createFromParcel(parcel);
            GiftsGiftImageStatusPackAttachmentDto createFromParcel7 = parcel.readInt() == 0 ? null : GiftsGiftImageStatusPackAttachmentDto.CREATOR.createFromParcel(parcel);
            GiftsGiftCardDto createFromParcel8 = parcel.readInt() == 0 ? null : GiftsGiftCardDto.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel = null;
            } else {
                i = readInt;
                createFromParcel = GiftsGiftBaseUrlConfigDto.CREATOR.createFromParcel(parcel);
            }
            GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
                giftsGiftBaseUrlConfigDto = giftsGiftBaseUrlConfigDto2;
            } else {
                giftsGiftBaseUrlConfigDto = giftsGiftBaseUrlConfigDto2;
                createFromParcel2 = GiftsGiftVotesAttachmentDto.CREATOR.createFromParcel(parcel);
            }
            return new GiftsMessagesGiftAttachmentDto(i, createFromParcel3, readString, readString2, readString3, readString4, valueOf2, valueOf, valueOf3, createFromParcel4, arrayList, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, readString5, giftsGiftBaseUrlConfigDto, createFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsMessagesGiftAttachmentDto[] newArray(int i) {
            return new GiftsMessagesGiftAttachmentDto[i];
        }
    }

    public GiftsMessagesGiftAttachmentDto(int i, TypeDto typeDto, String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, GiftsAnimationDto giftsAnimationDto, List<GiftsBackgroundDto> list, GiftsRarityDto giftsRarityDto, GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto, GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto, GiftsGiftCardDto giftsGiftCardDto, String str5, GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto, GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto) {
        this.id = i;
        this.type = typeDto;
        this.thumb512 = str;
        this.thumb256 = str2;
        this.thumb48 = str3;
        this.thumb96 = str4;
        this.stickersProductId = num;
        this.isStickersStyle = bool;
        this.randomStickerPackAttemptId = num2;
        this.animation = giftsAnimationDto;
        this.backgrounds = list;
        this.rarity = giftsRarityDto;
        this.imageStatus = giftsGiftImageStatusAttachmentDto;
        this.imageStatusPack = giftsGiftImageStatusPackAttachmentDto;
        this.giftCard = giftsGiftCardDto;
        this.entryId = str5;
        this.baseUrlConfig = giftsGiftBaseUrlConfigDto;
        this.votesAttachment = giftsGiftVotesAttachmentDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsMessagesGiftAttachmentDto)) {
            return false;
        }
        GiftsMessagesGiftAttachmentDto giftsMessagesGiftAttachmentDto = (GiftsMessagesGiftAttachmentDto) obj;
        return this.id == giftsMessagesGiftAttachmentDto.id && this.type == giftsMessagesGiftAttachmentDto.type && epx.f(this.thumb512, giftsMessagesGiftAttachmentDto.thumb512) && epx.f(this.thumb256, giftsMessagesGiftAttachmentDto.thumb256) && epx.f(this.thumb48, giftsMessagesGiftAttachmentDto.thumb48) && epx.f(this.thumb96, giftsMessagesGiftAttachmentDto.thumb96) && epx.f(this.stickersProductId, giftsMessagesGiftAttachmentDto.stickersProductId) && epx.f(this.isStickersStyle, giftsMessagesGiftAttachmentDto.isStickersStyle) && epx.f(this.randomStickerPackAttemptId, giftsMessagesGiftAttachmentDto.randomStickerPackAttemptId) && epx.f(this.animation, giftsMessagesGiftAttachmentDto.animation) && epx.f(this.backgrounds, giftsMessagesGiftAttachmentDto.backgrounds) && epx.f(this.rarity, giftsMessagesGiftAttachmentDto.rarity) && epx.f(this.imageStatus, giftsMessagesGiftAttachmentDto.imageStatus) && epx.f(this.imageStatusPack, giftsMessagesGiftAttachmentDto.imageStatusPack) && epx.f(this.giftCard, giftsMessagesGiftAttachmentDto.giftCard) && epx.f(this.entryId, giftsMessagesGiftAttachmentDto.entryId) && epx.f(this.baseUrlConfig, giftsMessagesGiftAttachmentDto.baseUrlConfig) && epx.f(this.votesAttachment, giftsMessagesGiftAttachmentDto.votesAttachment);
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
        Integer num2 = this.randomStickerPackAttemptId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GiftsAnimationDto giftsAnimationDto = this.animation;
        int hashCode10 = (hashCode9 + (giftsAnimationDto == null ? 0 : giftsAnimationDto.hashCode())) * 31;
        List<GiftsBackgroundDto> list = this.backgrounds;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        GiftsRarityDto giftsRarityDto = this.rarity;
        int hashCode12 = (hashCode11 + (giftsRarityDto == null ? 0 : giftsRarityDto.hashCode())) * 31;
        GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto = this.imageStatus;
        int hashCode13 = (hashCode12 + (giftsGiftImageStatusAttachmentDto == null ? 0 : giftsGiftImageStatusAttachmentDto.hashCode())) * 31;
        GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto = this.imageStatusPack;
        int hashCode14 = (hashCode13 + (giftsGiftImageStatusPackAttachmentDto == null ? 0 : giftsGiftImageStatusPackAttachmentDto.hashCode())) * 31;
        GiftsGiftCardDto giftsGiftCardDto = this.giftCard;
        int hashCode15 = (hashCode14 + (giftsGiftCardDto == null ? 0 : giftsGiftCardDto.hashCode())) * 31;
        String str5 = this.entryId;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto = this.baseUrlConfig;
        int hashCode17 = (hashCode16 + (giftsGiftBaseUrlConfigDto == null ? 0 : giftsGiftBaseUrlConfigDto.hashCode())) * 31;
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.votesAttachment;
        return hashCode17 + (giftsGiftVotesAttachmentDto != null ? giftsGiftVotesAttachmentDto.hashCode() : 0);
    }

    public final String toString() {
        return "GiftsMessagesGiftAttachmentDto(id=" + this.id + ", type=" + this.type + ", thumb512=" + this.thumb512 + ", thumb256=" + this.thumb256 + ", thumb48=" + this.thumb48 + ", thumb96=" + this.thumb96 + ", stickersProductId=" + this.stickersProductId + ", isStickersStyle=" + this.isStickersStyle + ", randomStickerPackAttemptId=" + this.randomStickerPackAttemptId + ", animation=" + this.animation + ", backgrounds=" + this.backgrounds + ", rarity=" + this.rarity + ", imageStatus=" + this.imageStatus + ", imageStatusPack=" + this.imageStatusPack + ", giftCard=" + this.giftCard + ", entryId=" + this.entryId + ", baseUrlConfig=" + this.baseUrlConfig + ", votesAttachment=" + this.votesAttachment + ')';
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
        GiftsGiftCardDto giftsGiftCardDto = this.giftCard;
        if (giftsGiftCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftCardDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.entryId);
        GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto = this.baseUrlConfig;
        if (giftsGiftBaseUrlConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftBaseUrlConfigDto.writeToParcel(parcel, i);
        }
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.votesAttachment;
        if (giftsGiftVotesAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftVotesAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsMessagesGiftAttachmentDto(int i, TypeDto typeDto, String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, GiftsAnimationDto giftsAnimationDto, List list, GiftsRarityDto giftsRarityDto, GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto, GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto, GiftsGiftCardDto giftsGiftCardDto, String str5, GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto, GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : typeDto, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : giftsAnimationDto, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : giftsRarityDto, (i2 & 4096) != 0 ? null : giftsGiftImageStatusAttachmentDto, (i2 & 8192) != 0 ? null : giftsGiftImageStatusPackAttachmentDto, (i2 & 16384) != 0 ? null : giftsGiftCardDto, (i2 & 32768) != 0 ? null : str5, (i2 & 65536) != 0 ? null : giftsGiftBaseUrlConfigDto, (i2 & 131072) != 0 ? null : giftsGiftVotesAttachmentDto);
    }
}

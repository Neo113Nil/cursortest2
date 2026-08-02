package com.vk.sdk.api.store.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseStickerNewDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.i5s;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.to;
import xsna.uq;
import xsna.vq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoreProductDto.kt */
/* loaded from: classes5.dex */
public final class StoreProductDto {

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final BaseBoolIntDto active;

    @pmi0("description_lang_key")
    private final String descriptionLangKey;

    @pmi0("has_animation")
    private final Boolean hasAnimation;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("id")
    private final int id;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("is_vmoji")
    private final Boolean isVmoji;

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

    @pmi0("stickers")
    private final List<BaseStickerNewDto> stickers;

    @pmi0("style_sticker_ids")
    private final List<Integer> styleStickerIds;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("title_lang_key")
    private final String titleLangKey;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreProductDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("stickers")
        public static final TypeDto STICKERS;

        @pmi0("subscriprions")
        public static final TypeDto SUBSCRIPRIONS;

        @pmi0("votes")
        public static final TypeDto VOTES;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("STICKERS", 0, "stickers");
            STICKERS = typeDto;
            TypeDto typeDto2 = new TypeDto("VOTES", 1, "votes");
            VOTES = typeDto2;
            TypeDto typeDto3 = new TypeDto("SUBSCRIPRIONS", 2, "subscriprions");
            SUBSCRIPRIONS = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public StoreProductDto(int i, TypeDto typeDto, Boolean bool, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, String str, List<BaseStickerNewDto> list, List<Integer> list2, List<BaseImageDto> list3, List<BaseImageDto> list4, Boolean bool2, String str2, String str3, Boolean bool3, String str4, String str5, String str6) {
        this.id = i;
        this.type = typeDto;
        this.isNew = bool;
        this.purchased = baseBoolIntDto;
        this.active = baseBoolIntDto2;
        this.promoted = baseBoolIntDto3;
        this.purchaseDate = num;
        this.title = str;
        this.stickers = list;
        this.styleStickerIds = list2;
        this.icon = list3;
        this.previews = list4;
        this.hasAnimation = bool2;
        this.subtitle = str2;
        this.paymentRegion = str3;
        this.isVmoji = bool3;
        this.titleLangKey = str4;
        this.descriptionLangKey = str5;
        this.url = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProductDto)) {
            return false;
        }
        StoreProductDto storeProductDto = (StoreProductDto) obj;
        return this.id == storeProductDto.id && this.type == storeProductDto.type && epx.f(this.isNew, storeProductDto.isNew) && this.purchased == storeProductDto.purchased && this.active == storeProductDto.active && this.promoted == storeProductDto.promoted && epx.f(this.purchaseDate, storeProductDto.purchaseDate) && epx.f(this.title, storeProductDto.title) && epx.f(this.stickers, storeProductDto.stickers) && epx.f(this.styleStickerIds, storeProductDto.styleStickerIds) && epx.f(this.icon, storeProductDto.icon) && epx.f(this.previews, storeProductDto.previews) && epx.f(this.hasAnimation, storeProductDto.hasAnimation) && epx.f(this.subtitle, storeProductDto.subtitle) && epx.f(this.paymentRegion, storeProductDto.paymentRegion) && epx.f(this.isVmoji, storeProductDto.isVmoji) && epx.f(this.titleLangKey, storeProductDto.titleLangKey) && epx.f(this.descriptionLangKey, storeProductDto.descriptionLangKey) && epx.f(this.url, storeProductDto.url);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Boolean bool = this.isNew;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.purchased;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.active;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.promoted;
        int hashCode5 = (hashCode4 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.purchaseDate;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseStickerNewDto> list = this.stickers;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.styleStickerIds;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BaseImageDto> list3 = this.icon;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BaseImageDto> list4 = this.previews;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.hasAnimation;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentRegion;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isVmoji;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.titleLangKey;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.descriptionLangKey;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        return hashCode17 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        TypeDto typeDto = this.type;
        Boolean bool = this.isNew;
        BaseBoolIntDto baseBoolIntDto = this.purchased;
        BaseBoolIntDto baseBoolIntDto2 = this.active;
        BaseBoolIntDto baseBoolIntDto3 = this.promoted;
        Integer num = this.purchaseDate;
        String str = this.title;
        List<BaseStickerNewDto> list = this.stickers;
        List<Integer> list2 = this.styleStickerIds;
        List<BaseImageDto> list3 = this.icon;
        List<BaseImageDto> list4 = this.previews;
        Boolean bool2 = this.hasAnimation;
        String str2 = this.subtitle;
        String str3 = this.paymentRegion;
        Boolean bool3 = this.isVmoji;
        String str4 = this.titleLangKey;
        String str5 = this.descriptionLangKey;
        String str6 = this.url;
        StringBuilder sb = new StringBuilder("StoreProductDto(id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(typeDto);
        sb.append(", isNew=");
        sb.append(bool);
        sb.append(", purchased=");
        sb.append(baseBoolIntDto);
        sb.append(", active=");
        to.b(sb, baseBoolIntDto2, ", promoted=", baseBoolIntDto3, ", purchaseDate=");
        mq.b(num, ", title=", str, ", stickers=", sb);
        vq.d(sb, list, ", styleStickerIds=", list2, ", icon=");
        vq.d(sb, list3, ", previews=", list4, ", hasAnimation=");
        l4.i(bool2, ", subtitle=", str2, ", paymentRegion=", sb);
        uq.c(bool3, str3, ", isVmoji=", ", titleLangKey=", sb);
        n6j.b(sb, str4, ", descriptionLangKey=", str5, ", url=");
        return i5s.a(sb, str6, ")");
    }

    public /* synthetic */ StoreProductDto(int i, TypeDto typeDto, Boolean bool, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, String str, List list, List list2, List list3, List list4, Boolean bool2, String str2, String str3, Boolean bool3, String str4, String str5, String str6, int i2, zcl zclVar) {
        this(i, typeDto, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : baseBoolIntDto, (i2 & 16) != 0 ? null : baseBoolIntDto2, (i2 & 32) != 0 ? null : baseBoolIntDto3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? null : list2, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : list4, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : str2, (i2 & 16384) != 0 ? null : str3, (32768 & i2) != 0 ? null : bool3, (65536 & i2) != 0 ? null : str4, (131072 & i2) != 0 ? null : str5, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str6);
    }
}

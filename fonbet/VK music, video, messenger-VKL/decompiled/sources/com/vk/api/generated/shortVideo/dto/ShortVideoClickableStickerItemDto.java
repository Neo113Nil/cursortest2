package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoClickableStickerItemDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoClickableStickerItemDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoClickableStickerItemDto> CREATOR = new a();

    @pmi0("ads_label")
    private final String adsLabel;

    @pmi0("clickable_area")
    private final List<ShortVideoClickableStickerAreaDto> clickableArea;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("link_object")
    private final BaseLinkDto linkObject;

    @pmi0("market_item")
    private final MarketMarketItemDto marketItem;

    @pmi0("mention")
    private final String mention;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("place_info")
    private final PlacesPlaceDto placeInfo;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("post_id")
    private final Long postId;

    @pmi0("post_owner_id")
    private final UserId postOwnerId;

    @pmi0("start_time")
    private final Integer startTime;

    @pmi0("sticker_id")
    private final Integer stickerId;

    @pmi0("sticker_pack_id")
    private final Integer stickerPackId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtype")
    private final SubtypeDto subtype;

    @pmi0("ticket")
    private final VkTicketsVkTicketDto ticket;

    @pmi0("tooltip_text")
    private final String tooltipText;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoClickableStickerItemDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("accent_background")
        public static final StyleDto ACCENT_BACKGROUND;

        @pmi0("accent_text")
        public static final StyleDto ACCENT_TEXT;

        @pmi0("black")
        public static final StyleDto BLACK;

        @pmi0("blue")
        public static final StyleDto BLUE;

        @pmi0("blue_gradient")
        public static final StyleDto BLUE_GRADIENT;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("dark")
        public static final StyleDto DARK;

        @pmi0("dark_text")
        public static final StyleDto DARK_TEXT;

        @pmi0("dark_unique")
        public static final StyleDto DARK_UNIQUE;

        @pmi0("dark_without_bg")
        public static final StyleDto DARK_WITHOUT_BG;

        @pmi0("green")
        public static final StyleDto GREEN;

        @pmi0("impressive")
        public static final StyleDto IMPRESSIVE;

        @pmi0("light")
        public static final StyleDto LIGHT;

        @pmi0("light_text")
        public static final StyleDto LIGHT_TEXT;

        @pmi0("light_unique")
        public static final StyleDto LIGHT_UNIQUE;

        @pmi0("light_without_bg")
        public static final StyleDto LIGHT_WITHOUT_BG;

        @pmi0("question_reply")
        public static final StyleDto QUESTION_REPLY;

        @pmi0("red_gradient")
        public static final StyleDto RED_GRADIENT;

        @pmi0(X3.i.T)
        public static final StyleDto TRANSPARENT;

        @pmi0(TtmlNode.UNDERLINE)
        public static final StyleDto UNDERLINE;

        @pmi0("white")
        public static final StyleDto WHITE;
        private final String value;

        /* compiled from: ShortVideoClickableStickerItemDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("TRANSPARENT", 0, X3.i.T);
            TRANSPARENT = styleDto;
            StyleDto styleDto2 = new StyleDto("BLUE_GRADIENT", 1, "blue_gradient");
            BLUE_GRADIENT = styleDto2;
            StyleDto styleDto3 = new StyleDto("RED_GRADIENT", 2, "red_gradient");
            RED_GRADIENT = styleDto3;
            StyleDto styleDto4 = new StyleDto("UNDERLINE", 3, TtmlNode.UNDERLINE);
            UNDERLINE = styleDto4;
            StyleDto styleDto5 = new StyleDto("BLUE", 4, "blue");
            BLUE = styleDto5;
            StyleDto styleDto6 = new StyleDto("GREEN", 5, "green");
            GREEN = styleDto6;
            StyleDto styleDto7 = new StyleDto("WHITE", 6, "white");
            WHITE = styleDto7;
            StyleDto styleDto8 = new StyleDto("QUESTION_REPLY", 7, "question_reply");
            QUESTION_REPLY = styleDto8;
            StyleDto styleDto9 = new StyleDto("LIGHT", 8, "light");
            LIGHT = styleDto9;
            StyleDto styleDto10 = new StyleDto("IMPRESSIVE", 9, "impressive");
            IMPRESSIVE = styleDto10;
            StyleDto styleDto11 = new StyleDto("DARK", 10, "dark");
            DARK = styleDto11;
            StyleDto styleDto12 = new StyleDto("ACCENT_BACKGROUND", 11, "accent_background");
            ACCENT_BACKGROUND = styleDto12;
            StyleDto styleDto13 = new StyleDto("ACCENT_TEXT", 12, "accent_text");
            ACCENT_TEXT = styleDto13;
            StyleDto styleDto14 = new StyleDto("DARK_UNIQUE", 13, "dark_unique");
            DARK_UNIQUE = styleDto14;
            StyleDto styleDto15 = new StyleDto("LIGHT_UNIQUE", 14, "light_unique");
            LIGHT_UNIQUE = styleDto15;
            StyleDto styleDto16 = new StyleDto("LIGHT_TEXT", 15, "light_text");
            LIGHT_TEXT = styleDto16;
            StyleDto styleDto17 = new StyleDto("DARK_TEXT", 16, "dark_text");
            DARK_TEXT = styleDto17;
            StyleDto styleDto18 = new StyleDto("BLACK", 17, "black");
            BLACK = styleDto18;
            StyleDto styleDto19 = new StyleDto("DARK_WITHOUT_BG", 18, "dark_without_bg");
            DARK_WITHOUT_BG = styleDto19;
            StyleDto styleDto20 = new StyleDto("LIGHT_WITHOUT_BG", 19, "light_without_bg");
            LIGHT_WITHOUT_BG = styleDto20;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6, styleDto7, styleDto8, styleDto9, styleDto10, styleDto11, styleDto12, styleDto13, styleDto14, styleDto15, styleDto16, styleDto17, styleDto18, styleDto19, styleDto20};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoClickableStickerItemDto.kt */
    public static final class SubtypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;
        public static final Parcelable.Creator<SubtypeDto> CREATOR;

        @pmi0("market_item")
        public static final SubtypeDto MARKET_ITEM;
        private final String value;

        /* compiled from: ShortVideoClickableStickerItemDto.kt */
        public static final class a implements Parcelable.Creator<SubtypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubtypeDto createFromParcel(Parcel parcel) {
                return SubtypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubtypeDto[] newArray(int i) {
                return new SubtypeDto[i];
            }
        }

        static {
            SubtypeDto subtypeDto = new SubtypeDto("MARKET_ITEM", 0, "market_item");
            MARKET_ITEM = subtypeDto;
            SubtypeDto[] subtypeDtoArr = {subtypeDto};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
            CREATOR = new a();
        }

        private SubtypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubtypeDto valueOf(String str) {
            return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
        }

        public static SubtypeDto[] values() {
            return (SubtypeDto[]) $VALUES.clone();
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
    /* compiled from: ShortVideoClickableStickerItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("hashtag")
        public static final TypeDto HASHTAG;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("market_item")
        public static final TypeDto MARKET_ITEM;

        @pmi0("mention")
        public static final TypeDto MENTION;

        @pmi0("place")
        public static final TypeDto PLACE;

        @pmi0("poll")
        public static final TypeDto POLL;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("ticket")
        public static final TypeDto TICKET;
        private final String value;

        /* compiled from: ShortVideoClickableStickerItemDto.kt */
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
            TypeDto typeDto = new TypeDto("POST", 0, "post");
            POST = typeDto;
            TypeDto typeDto2 = new TypeDto("LINK", 1, "link");
            LINK = typeDto2;
            TypeDto typeDto3 = new TypeDto("MARKET_ITEM", 2, "market_item");
            MARKET_ITEM = typeDto3;
            TypeDto typeDto4 = new TypeDto("MENTION", 3, "mention");
            MENTION = typeDto4;
            TypeDto typeDto5 = new TypeDto("HASHTAG", 4, "hashtag");
            HASHTAG = typeDto5;
            TypeDto typeDto6 = new TypeDto("PLACE", 5, "place");
            PLACE = typeDto6;
            TypeDto typeDto7 = new TypeDto("POLL", 6, "poll");
            POLL = typeDto7;
            TypeDto typeDto8 = new TypeDto("STICKER", 7, "sticker");
            STICKER = typeDto8;
            TypeDto typeDto9 = new TypeDto("TICKET", 8, "ticket");
            TICKET = typeDto9;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9};
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

    /* compiled from: ShortVideoClickableStickerItemDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoClickableStickerItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickerItemDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoClickableStickerAreaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoClickableStickerItemDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : SubtypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(ShortVideoClickableStickerItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : BaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MarketMarketItemDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(ShortVideoClickableStickerItemDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PlacesPlaceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PollsPollDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? VkTicketsVkTicketDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickerItemDto[] newArray(int i) {
            return new ShortVideoClickableStickerItemDto[i];
        }
    }

    public ShortVideoClickableStickerItemDto(TypeDto typeDto, List<ShortVideoClickableStickerAreaDto> list, SubtypeDto subtypeDto, StyleDto styleDto, Integer num, Integer num2, UserId userId, Long l, BaseLinkDto baseLinkDto, String str, MarketMarketItemDto marketMarketItemDto, String str2, String str3, UserId userId2, String str4, Integer num3, PlacesPlaceDto placesPlaceDto, PollsPollDto pollsPollDto, Integer num4, Integer num5, VkTicketsVkTicketDto vkTicketsVkTicketDto) {
        this.type = typeDto;
        this.clickableArea = list;
        this.subtype = subtypeDto;
        this.style = styleDto;
        this.startTime = num;
        this.duration = num2;
        this.postOwnerId = userId;
        this.postId = l;
        this.linkObject = baseLinkDto;
        this.tooltipText = str;
        this.marketItem = marketMarketItemDto;
        this.adsLabel = str2;
        this.mention = str3;
        this.ownerId = userId2;
        this.hashtag = str4;
        this.placeId = num3;
        this.placeInfo = placesPlaceDto;
        this.poll = pollsPollDto;
        this.stickerId = num4;
        this.stickerPackId = num5;
        this.ticket = vkTicketsVkTicketDto;
    }

    public final Integer B() {
        return this.stickerId;
    }

    public final Integer C() {
        return this.stickerPackId;
    }

    public final StyleDto D() {
        return this.style;
    }

    public final VkTicketsVkTicketDto F() {
        return this.ticket;
    }

    public final String G() {
        return this.tooltipText;
    }

    public final TypeDto K() {
        return this.type;
    }

    public final String d() {
        return this.adsLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ShortVideoClickableStickerAreaDto> e() {
        return this.clickableArea;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoClickableStickerItemDto)) {
            return false;
        }
        ShortVideoClickableStickerItemDto shortVideoClickableStickerItemDto = (ShortVideoClickableStickerItemDto) obj;
        return this.type == shortVideoClickableStickerItemDto.type && epx.f(this.clickableArea, shortVideoClickableStickerItemDto.clickableArea) && this.subtype == shortVideoClickableStickerItemDto.subtype && this.style == shortVideoClickableStickerItemDto.style && epx.f(this.startTime, shortVideoClickableStickerItemDto.startTime) && epx.f(this.duration, shortVideoClickableStickerItemDto.duration) && epx.f(this.postOwnerId, shortVideoClickableStickerItemDto.postOwnerId) && epx.f(this.postId, shortVideoClickableStickerItemDto.postId) && epx.f(this.linkObject, shortVideoClickableStickerItemDto.linkObject) && epx.f(this.tooltipText, shortVideoClickableStickerItemDto.tooltipText) && epx.f(this.marketItem, shortVideoClickableStickerItemDto.marketItem) && epx.f(this.adsLabel, shortVideoClickableStickerItemDto.adsLabel) && epx.f(this.mention, shortVideoClickableStickerItemDto.mention) && epx.f(this.ownerId, shortVideoClickableStickerItemDto.ownerId) && epx.f(this.hashtag, shortVideoClickableStickerItemDto.hashtag) && epx.f(this.placeId, shortVideoClickableStickerItemDto.placeId) && epx.f(this.placeInfo, shortVideoClickableStickerItemDto.placeInfo) && epx.f(this.poll, shortVideoClickableStickerItemDto.poll) && epx.f(this.stickerId, shortVideoClickableStickerItemDto.stickerId) && epx.f(this.stickerPackId, shortVideoClickableStickerItemDto.stickerPackId) && epx.f(this.ticket, shortVideoClickableStickerItemDto.ticket);
    }

    public final Integer f() {
        return this.duration;
    }

    public final String g() {
        return this.hashtag;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.type.hashCode() * 31, 31, this.clickableArea);
        SubtypeDto subtypeDto = this.subtype;
        int hashCode = (a2 + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        Integer num = this.startTime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.duration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.postOwnerId;
        int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Long l = this.postId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.linkObject;
        int hashCode7 = (hashCode6 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        String str = this.tooltipText;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        int hashCode9 = (hashCode8 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        String str2 = this.adsLabel;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mention;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode12 = (hashCode11 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str4 = this.hashtag;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.placeId;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PlacesPlaceDto placesPlaceDto = this.placeInfo;
        int hashCode15 = (hashCode14 + (placesPlaceDto == null ? 0 : placesPlaceDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode16 = (hashCode15 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        Integer num4 = this.stickerId;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.stickerPackId;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        VkTicketsVkTicketDto vkTicketsVkTicketDto = this.ticket;
        return hashCode18 + (vkTicketsVkTicketDto != null ? vkTicketsVkTicketDto.hashCode() : 0);
    }

    public final BaseLinkDto i() {
        return this.linkObject;
    }

    public final MarketMarketItemDto j() {
        return this.marketItem;
    }

    public final String k() {
        return this.mention;
    }

    public final Integer l() {
        return this.placeId;
    }

    public final PlacesPlaceDto n() {
        return this.placeInfo;
    }

    public final Long o() {
        return this.postId;
    }

    public final UserId p() {
        return this.postOwnerId;
    }

    public final String toString() {
        return "ShortVideoClickableStickerItemDto(type=" + this.type + ", clickableArea=" + this.clickableArea + ", subtype=" + this.subtype + ", style=" + this.style + ", startTime=" + this.startTime + ", duration=" + this.duration + ", postOwnerId=" + this.postOwnerId + ", postId=" + this.postId + ", linkObject=" + this.linkObject + ", tooltipText=" + this.tooltipText + ", marketItem=" + this.marketItem + ", adsLabel=" + this.adsLabel + ", mention=" + this.mention + ", ownerId=" + this.ownerId + ", hashtag=" + this.hashtag + ", placeId=" + this.placeId + ", placeInfo=" + this.placeInfo + ", poll=" + this.poll + ", stickerId=" + this.stickerId + ", stickerPackId=" + this.stickerPackId + ", ticket=" + this.ticket + ')';
    }

    public final Integer u() {
        return this.startTime;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.clickableArea);
        while (a2.hasNext()) {
            ((ShortVideoClickableStickerAreaDto) a2.next()).writeToParcel(parcel, i);
        }
        SubtypeDto subtypeDto = this.subtype;
        if (subtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subtypeDto.writeToParcel(parcel, i);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        Integer num = this.startTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.postOwnerId, i);
        Long l = this.postId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        BaseLinkDto baseLinkDto = this.linkObject;
        if (baseLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tooltipText);
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        if (marketMarketItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.adsLabel);
        parcel.writeString(this.mention);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.hashtag);
        Integer num3 = this.placeId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        PlacesPlaceDto placesPlaceDto = this.placeInfo;
        if (placesPlaceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placesPlaceDto.writeToParcel(parcel, i);
        }
        PollsPollDto pollsPollDto = this.poll;
        if (pollsPollDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsPollDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.stickerId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.stickerPackId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        VkTicketsVkTicketDto vkTicketsVkTicketDto = this.ticket;
        if (vkTicketsVkTicketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkTicketsVkTicketDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoClickableStickerItemDto(TypeDto typeDto, List list, SubtypeDto subtypeDto, StyleDto styleDto, Integer num, Integer num2, UserId userId, Long l, BaseLinkDto baseLinkDto, String str, MarketMarketItemDto marketMarketItemDto, String str2, String str3, UserId userId2, String str4, Integer num3, PlacesPlaceDto placesPlaceDto, PollsPollDto pollsPollDto, Integer num4, Integer num5, VkTicketsVkTicketDto vkTicketsVkTicketDto, int i, zcl zclVar) {
        this(typeDto, list, (i & 4) != 0 ? null : subtypeDto, (i & 8) != 0 ? null : styleDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : baseLinkDto, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : marketMarketItemDto, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : userId2, (i & 16384) != 0 ? null : str4, (32768 & i) != 0 ? null : num3, (65536 & i) != 0 ? null : placesPlaceDto, (131072 & i) != 0 ? null : pollsPollDto, (262144 & i) != 0 ? null : num4, (524288 & i) != 0 ? null : num5, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : vkTicketsVkTicketDto);
    }
}

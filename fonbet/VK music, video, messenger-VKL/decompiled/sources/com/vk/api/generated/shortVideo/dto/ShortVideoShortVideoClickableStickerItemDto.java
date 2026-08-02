package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoClickableStickerItemDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoClickableStickerItemDto> CREATOR = new a();

    @pmi0("ads_label")
    private final String adsLabel;

    @pmi0("clickable_areas")
    private final List<ShortVideoClickableStickerAreaDto> clickableAreas;

    @pmi0("duration_milliseconds")
    private final Integer durationMilliseconds;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("market_item_id")
    private final Integer marketItemId;

    @pmi0("mention")
    private final String mention;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("show_milliseconds")
    private final Integer showMilliseconds;

    @pmi0("sticker_id")
    private final Integer stickerId;

    @pmi0("sticker_pack_id")
    private final Integer stickerPackId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("ticket")
    private final VkTicketsVkTicketDto ticket;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
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

        /* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
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
    /* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("hashtag")
        public static final TypeDto HASHTAG;

        @pmi0("market_item")
        public static final TypeDto MARKET_ITEM;

        @pmi0("mention")
        public static final TypeDto MENTION;

        @pmi0("place")
        public static final TypeDto PLACE;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("ticket")
        public static final TypeDto TICKET;
        private final String value;

        /* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
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
            TypeDto typeDto = new TypeDto("MARKET_ITEM", 0, "market_item");
            MARKET_ITEM = typeDto;
            TypeDto typeDto2 = new TypeDto("MENTION", 1, "mention");
            MENTION = typeDto2;
            TypeDto typeDto3 = new TypeDto("HASHTAG", 2, "hashtag");
            HASHTAG = typeDto3;
            TypeDto typeDto4 = new TypeDto("PLACE", 3, "place");
            PLACE = typeDto4;
            TypeDto typeDto5 = new TypeDto("STICKER", 4, "sticker");
            STICKER = typeDto5;
            TypeDto typeDto6 = new TypeDto("TICKET", 5, "ticket");
            TICKET = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

    /* compiled from: ShortVideoShortVideoClickableStickerItemDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoClickableStickerItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoClickableStickerItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            StyleDto createFromParcel2 = parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoShortVideoClickableStickerItemDto.class, parcel, arrayList, i, 1);
                }
            }
            return new ShortVideoShortVideoClickableStickerItemDto(createFromParcel, createFromParcel2, valueOf, valueOf2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(ShortVideoShortVideoClickableStickerItemDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (VkTicketsVkTicketDto) parcel.readParcelable(ShortVideoShortVideoClickableStickerItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoClickableStickerItemDto[] newArray(int i) {
            return new ShortVideoShortVideoClickableStickerItemDto[i];
        }
    }

    public ShortVideoShortVideoClickableStickerItemDto(TypeDto typeDto, StyleDto styleDto, Integer num, Integer num2, List<ShortVideoClickableStickerAreaDto> list, Integer num3, String str, String str2, UserId userId, String str3, Integer num4, Integer num5, Integer num6, VkTicketsVkTicketDto vkTicketsVkTicketDto) {
        this.type = typeDto;
        this.style = styleDto;
        this.showMilliseconds = num;
        this.durationMilliseconds = num2;
        this.clickableAreas = list;
        this.marketItemId = num3;
        this.adsLabel = str;
        this.mention = str2;
        this.ownerId = userId;
        this.hashtag = str3;
        this.placeId = num4;
        this.stickerId = num5;
        this.stickerPackId = num6;
        this.ticket = vkTicketsVkTicketDto;
    }

    public final TypeDto B() {
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
        return this.clickableAreas;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoClickableStickerItemDto)) {
            return false;
        }
        ShortVideoShortVideoClickableStickerItemDto shortVideoShortVideoClickableStickerItemDto = (ShortVideoShortVideoClickableStickerItemDto) obj;
        return this.type == shortVideoShortVideoClickableStickerItemDto.type && this.style == shortVideoShortVideoClickableStickerItemDto.style && epx.f(this.showMilliseconds, shortVideoShortVideoClickableStickerItemDto.showMilliseconds) && epx.f(this.durationMilliseconds, shortVideoShortVideoClickableStickerItemDto.durationMilliseconds) && epx.f(this.clickableAreas, shortVideoShortVideoClickableStickerItemDto.clickableAreas) && epx.f(this.marketItemId, shortVideoShortVideoClickableStickerItemDto.marketItemId) && epx.f(this.adsLabel, shortVideoShortVideoClickableStickerItemDto.adsLabel) && epx.f(this.mention, shortVideoShortVideoClickableStickerItemDto.mention) && epx.f(this.ownerId, shortVideoShortVideoClickableStickerItemDto.ownerId) && epx.f(this.hashtag, shortVideoShortVideoClickableStickerItemDto.hashtag) && epx.f(this.placeId, shortVideoShortVideoClickableStickerItemDto.placeId) && epx.f(this.stickerId, shortVideoShortVideoClickableStickerItemDto.stickerId) && epx.f(this.stickerPackId, shortVideoShortVideoClickableStickerItemDto.stickerPackId) && epx.f(this.ticket, shortVideoShortVideoClickableStickerItemDto.ticket);
    }

    public final Integer f() {
        return this.durationMilliseconds;
    }

    public final String g() {
        return this.hashtag;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        Integer num = this.showMilliseconds;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.durationMilliseconds;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ShortVideoClickableStickerAreaDto> list = this.clickableAreas;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.marketItemId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.adsLabel;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mention;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode9 = (hashCode8 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str3 = this.hashtag;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.placeId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.stickerId;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.stickerPackId;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        VkTicketsVkTicketDto vkTicketsVkTicketDto = this.ticket;
        return hashCode13 + (vkTicketsVkTicketDto != null ? vkTicketsVkTicketDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.marketItemId;
    }

    public final String j() {
        return this.mention;
    }

    public final Integer k() {
        return this.placeId;
    }

    public final Integer l() {
        return this.showMilliseconds;
    }

    public final Integer n() {
        return this.stickerId;
    }

    public final Integer o() {
        return this.stickerPackId;
    }

    public final StyleDto p() {
        return this.style;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "ShortVideoShortVideoClickableStickerItemDto(type=" + this.type + ", style=" + this.style + ", showMilliseconds=" + this.showMilliseconds + ", durationMilliseconds=" + this.durationMilliseconds + ", clickableAreas=" + this.clickableAreas + ", marketItemId=" + this.marketItemId + ", adsLabel=" + this.adsLabel + ", mention=" + this.mention + ", ownerId=" + this.ownerId + ", hashtag=" + this.hashtag + ", placeId=" + this.placeId + ", stickerId=" + this.stickerId + ", stickerPackId=" + this.stickerPackId + ", ticket=" + this.ticket + ')';
    }

    public final VkTicketsVkTicketDto u() {
        return this.ticket;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        Integer num = this.showMilliseconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.durationMilliseconds;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<ShortVideoClickableStickerAreaDto> list = this.clickableAreas;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num3 = this.marketItemId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.adsLabel);
        parcel.writeString(this.mention);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.hashtag);
        Integer num4 = this.placeId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.stickerId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.stickerPackId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.ticket, i);
    }

    public /* synthetic */ ShortVideoShortVideoClickableStickerItemDto(TypeDto typeDto, StyleDto styleDto, Integer num, Integer num2, List list, Integer num3, String str, String str2, UserId userId, String str3, Integer num4, Integer num5, Integer num6, VkTicketsVkTicketDto vkTicketsVkTicketDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : styleDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : userId, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : vkTicketsVkTicketDto);
    }
}

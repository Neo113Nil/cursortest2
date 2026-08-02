package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogButtonOptionsDto.kt */
/* loaded from: classes14.dex */
public final class CatalogButtonOptionsDto implements Parcelable {
    public static final Parcelable.Creator<CatalogButtonOptionsDto> CREATOR = new a();

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("data_type")
    private final String dataType;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("icon_sizes")
    private final List<BaseImageDto> iconSizes;

    @pmi0("replacement_id")
    private final String replacementId;

    @pmi0("selected")
    private final BaseBoolIntDto selected;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("text")
    private final String text;

    @pmi0("trackcode")
    private final String trackcode;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogButtonOptionsDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;

        @pmi0("ball")
        public static final IconDto BALL;

        @pmi0("ball_outline")
        public static final IconDto BALL_OUTLINE;

        @pmi0("bank_outline")
        public static final IconDto BANK_OUTLINE;

        @pmi0("beauty_outline")
        public static final IconDto BEAUTY_OUTLINE;

        @pmi0("boxing_glove_outline")
        public static final IconDto BOXING_GLOVE_OUTLINE;

        @pmi0("briefcase_outline")
        public static final IconDto BRIEFCASE_OUTLINE;

        @pmi0("brush")
        public static final IconDto BRUSH;

        @pmi0("car_outline")
        public static final IconDto CAR_OUTLINE;

        @pmi0("chef_hat_outline")
        public static final IconDto CHEF_HAT_OUTLINE;

        @pmi0("clock")
        public static final IconDto CLOCK;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("delete_outline")
        public static final IconDto DELETE_OUTLINE;

        @pmi0("folder")
        public static final IconDto FOLDER;

        @pmi0("football_ball_outline")
        public static final IconDto FOOTBALL_BALL_OUTLINE;

        @pmi0("game")
        public static final IconDto GAME;

        @pmi0("gear_outline")
        public static final IconDto GEAR_OUTLINE;

        @pmi0("gift")
        public static final IconDto GIFT;

        @pmi0("globe")
        public static final IconDto GLOBE;

        @pmi0("hand_point_up_outline")
        public static final IconDto HAND_POINT_UP_OUTLINE;

        @pmi0("home_heart")
        public static final IconDto HOME_HEART;

        @pmi0("horse_toy_outline")
        public static final IconDto HORSE_TOY_OUTLINE;

        @pmi0("ice_skates_outline")
        public static final IconDto ICE_SKATES_OUTLINE;

        @pmi0("knife")
        public static final IconDto KNIFE;

        @pmi0("like")
        public static final IconDto LIKE;

        @pmi0("list")
        public static final IconDto LIST;

        @pmi0("live")
        public static final IconDto LIVE;

        @pmi0("more_horizontal")
        public static final IconDto MORE_HORIZONTAL;

        @pmi0("motorcycle")
        public static final IconDto MOTORCYCLE;

        @pmi0("movie_reel_outline")
        public static final IconDto MOVIE_REEL_OUTLINE;

        @pmi0("music_mic_outline")
        public static final IconDto MUSIC_MIC_OUTLINE;

        @pmi0("music_outline_blue")
        public static final IconDto MUSIC_OUTLINE_BLUE;

        @pmi0("pen_outline")
        public static final IconDto PEN_OUTLINE;

        @pmi0("politics")
        public static final IconDto POLITICS;

        @pmi0("request_in")
        public static final IconDto REQUEST_IN;

        @pmi0("request_out")
        public static final IconDto REQUEST_OUT;

        @pmi0("robot")
        public static final IconDto ROBOT;

        @pmi0("robot_outline")
        public static final IconDto ROBOT_OUTLINE;

        @pmi0("sad_face")
        public static final IconDto SAD_FACE;

        @pmi0("search")
        public static final IconDto SEARCH;

        @pmi0("share_outline")
        public static final IconDto SHARE_OUTLINE;

        @pmi0("skull")
        public static final IconDto SKULL;

        @pmi0("smartphone")
        public static final IconDto SMARTPHONE;

        @pmi0("smile")
        public static final IconDto SMILE;

        @pmi0("sneaker_outline")
        public static final IconDto SNEAKER_OUTLINE;

        @pmi0("sort_outline")
        public static final IconDto SORT_OUTLINE;

        @pmi0("talks")
        public static final IconDto TALKS;

        @pmi0("target")
        public static final IconDto TARGET;

        @pmi0("tennis_ball_outline")
        public static final IconDto TENNIS_BALL_OUTLINE;

        @pmi0("tv_outline")
        public static final IconDto TV_OUTLINE;

        @pmi0("user")
        public static final IconDto USER;

        @pmi0("users_3_outline")
        public static final IconDto USERS_3_OUTLINE;

        @pmi0("video_catalog_anime")
        public static final IconDto VIDEO_CATALOG_ANIME;

        @pmi0("video_market")
        public static final IconDto VIDEO_MARKET;

        @pmi0("volleyball_outline")
        public static final IconDto VOLLEYBALL_OUTLINE;
        private final String value;

        /* compiled from: CatalogButtonOptionsDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("BALL", 0, "ball");
            BALL = iconDto;
            IconDto iconDto2 = new IconDto("BALL_OUTLINE", 1, "ball_outline");
            BALL_OUTLINE = iconDto2;
            IconDto iconDto3 = new IconDto("BANK_OUTLINE", 2, "bank_outline");
            BANK_OUTLINE = iconDto3;
            IconDto iconDto4 = new IconDto("BEAUTY_OUTLINE", 3, "beauty_outline");
            BEAUTY_OUTLINE = iconDto4;
            IconDto iconDto5 = new IconDto("BOXING_GLOVE_OUTLINE", 4, "boxing_glove_outline");
            BOXING_GLOVE_OUTLINE = iconDto5;
            IconDto iconDto6 = new IconDto("BRIEFCASE_OUTLINE", 5, "briefcase_outline");
            BRIEFCASE_OUTLINE = iconDto6;
            IconDto iconDto7 = new IconDto("BRUSH", 6, "brush");
            BRUSH = iconDto7;
            IconDto iconDto8 = new IconDto("CAR_OUTLINE", 7, "car_outline");
            CAR_OUTLINE = iconDto8;
            IconDto iconDto9 = new IconDto("CHEF_HAT_OUTLINE", 8, "chef_hat_outline");
            CHEF_HAT_OUTLINE = iconDto9;
            IconDto iconDto10 = new IconDto("CLOCK", 9, "clock");
            CLOCK = iconDto10;
            IconDto iconDto11 = new IconDto("DELETE_OUTLINE", 10, "delete_outline");
            DELETE_OUTLINE = iconDto11;
            IconDto iconDto12 = new IconDto("FOLDER", 11, "folder");
            FOLDER = iconDto12;
            IconDto iconDto13 = new IconDto("FOOTBALL_BALL_OUTLINE", 12, "football_ball_outline");
            FOOTBALL_BALL_OUTLINE = iconDto13;
            IconDto iconDto14 = new IconDto("GAME", 13, "game");
            GAME = iconDto14;
            IconDto iconDto15 = new IconDto("GEAR_OUTLINE", 14, "gear_outline");
            GEAR_OUTLINE = iconDto15;
            IconDto iconDto16 = new IconDto("GIFT", 15, "gift");
            GIFT = iconDto16;
            IconDto iconDto17 = new IconDto("GLOBE", 16, "globe");
            GLOBE = iconDto17;
            IconDto iconDto18 = new IconDto("HAND_POINT_UP_OUTLINE", 17, "hand_point_up_outline");
            HAND_POINT_UP_OUTLINE = iconDto18;
            IconDto iconDto19 = new IconDto("HOME_HEART", 18, "home_heart");
            HOME_HEART = iconDto19;
            IconDto iconDto20 = new IconDto("HORSE_TOY_OUTLINE", 19, "horse_toy_outline");
            HORSE_TOY_OUTLINE = iconDto20;
            IconDto iconDto21 = new IconDto("ICE_SKATES_OUTLINE", 20, "ice_skates_outline");
            ICE_SKATES_OUTLINE = iconDto21;
            IconDto iconDto22 = new IconDto("KNIFE", 21, "knife");
            KNIFE = iconDto22;
            IconDto iconDto23 = new IconDto("LIKE", 22, "like");
            LIKE = iconDto23;
            IconDto iconDto24 = new IconDto("LIST", 23, "list");
            LIST = iconDto24;
            IconDto iconDto25 = new IconDto("LIVE", 24, "live");
            LIVE = iconDto25;
            IconDto iconDto26 = new IconDto("MORE_HORIZONTAL", 25, "more_horizontal");
            MORE_HORIZONTAL = iconDto26;
            IconDto iconDto27 = new IconDto("MOTORCYCLE", 26, "motorcycle");
            MOTORCYCLE = iconDto27;
            IconDto iconDto28 = new IconDto("MOVIE_REEL_OUTLINE", 27, "movie_reel_outline");
            MOVIE_REEL_OUTLINE = iconDto28;
            IconDto iconDto29 = new IconDto("MUSIC_MIC_OUTLINE", 28, "music_mic_outline");
            MUSIC_MIC_OUTLINE = iconDto29;
            IconDto iconDto30 = new IconDto("MUSIC_OUTLINE_BLUE", 29, "music_outline_blue");
            MUSIC_OUTLINE_BLUE = iconDto30;
            IconDto iconDto31 = new IconDto("PEN_OUTLINE", 30, "pen_outline");
            PEN_OUTLINE = iconDto31;
            IconDto iconDto32 = new IconDto("POLITICS", 31, "politics");
            POLITICS = iconDto32;
            IconDto iconDto33 = new IconDto("REQUEST_IN", 32, "request_in");
            REQUEST_IN = iconDto33;
            IconDto iconDto34 = new IconDto("REQUEST_OUT", 33, "request_out");
            REQUEST_OUT = iconDto34;
            IconDto iconDto35 = new IconDto("ROBOT", 34, "robot");
            ROBOT = iconDto35;
            IconDto iconDto36 = new IconDto("ROBOT_OUTLINE", 35, "robot_outline");
            ROBOT_OUTLINE = iconDto36;
            IconDto iconDto37 = new IconDto("SAD_FACE", 36, "sad_face");
            SAD_FACE = iconDto37;
            IconDto iconDto38 = new IconDto("SEARCH", 37, "search");
            SEARCH = iconDto38;
            IconDto iconDto39 = new IconDto("SHARE_OUTLINE", 38, "share_outline");
            SHARE_OUTLINE = iconDto39;
            IconDto iconDto40 = new IconDto("SKULL", 39, "skull");
            SKULL = iconDto40;
            IconDto iconDto41 = new IconDto("SMARTPHONE", 40, "smartphone");
            SMARTPHONE = iconDto41;
            IconDto iconDto42 = new IconDto("SMILE", 41, "smile");
            SMILE = iconDto42;
            IconDto iconDto43 = new IconDto("SNEAKER_OUTLINE", 42, "sneaker_outline");
            SNEAKER_OUTLINE = iconDto43;
            IconDto iconDto44 = new IconDto("SORT_OUTLINE", 43, "sort_outline");
            SORT_OUTLINE = iconDto44;
            IconDto iconDto45 = new IconDto("TALKS", 44, "talks");
            TALKS = iconDto45;
            IconDto iconDto46 = new IconDto("TARGET", 45, "target");
            TARGET = iconDto46;
            IconDto iconDto47 = new IconDto("TENNIS_BALL_OUTLINE", 46, "tennis_ball_outline");
            TENNIS_BALL_OUTLINE = iconDto47;
            IconDto iconDto48 = new IconDto("TV_OUTLINE", 47, "tv_outline");
            TV_OUTLINE = iconDto48;
            IconDto iconDto49 = new IconDto("USER", 48, "user");
            USER = iconDto49;
            IconDto iconDto50 = new IconDto("USERS_3_OUTLINE", 49, "users_3_outline");
            USERS_3_OUTLINE = iconDto50;
            IconDto iconDto51 = new IconDto("VIDEO_CATALOG_ANIME", 50, "video_catalog_anime");
            VIDEO_CATALOG_ANIME = iconDto51;
            IconDto iconDto52 = new IconDto("VIDEO_MARKET", 51, "video_market");
            VIDEO_MARKET = iconDto52;
            IconDto iconDto53 = new IconDto("VOLLEYBALL_OUTLINE", 52, "volleyball_outline");
            VOLLEYBALL_OUTLINE = iconDto53;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3, iconDto4, iconDto5, iconDto6, iconDto7, iconDto8, iconDto9, iconDto10, iconDto11, iconDto12, iconDto13, iconDto14, iconDto15, iconDto16, iconDto17, iconDto18, iconDto19, iconDto20, iconDto21, iconDto22, iconDto23, iconDto24, iconDto25, iconDto26, iconDto27, iconDto28, iconDto29, iconDto30, iconDto31, iconDto32, iconDto33, iconDto34, iconDto35, iconDto36, iconDto37, iconDto38, iconDto39, iconDto40, iconDto41, iconDto42, iconDto43, iconDto44, iconDto45, iconDto46, iconDto47, iconDto48, iconDto49, iconDto50, iconDto51, iconDto52, iconDto53};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
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

    /* compiled from: CatalogButtonOptionsDto.kt */
    public static final class a implements Parcelable.Creator<CatalogButtonOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogButtonOptionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(CatalogButtonOptionsDto.class.getClassLoader());
            IconDto createFromParcel = parcel.readInt() == 0 ? null : IconDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CatalogButtonOptionsDto.class, parcel, arrayList, i, 1);
                }
            }
            UserId userId = (UserId) parcel.readParcelable(CatalogButtonOptionsDto.class.getClassLoader());
            CatalogBadgeDto catalogBadgeDto = null;
            ArrayList arrayList2 = arrayList;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                catalogBadgeDto = CatalogBadgeDto.CREATOR.createFromParcel(parcel);
            }
            return new CatalogButtonOptionsDto(readString, readString2, readString3, baseBoolIntDto, createFromParcel, arrayList2, userId, readString4, readString5, catalogBadgeDto, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogButtonOptionsDto[] newArray(int i) {
            return new CatalogButtonOptionsDto[i];
        }
    }

    public CatalogButtonOptionsDto(String str, String str2, String str3, BaseBoolIntDto baseBoolIntDto, IconDto iconDto, List<BaseImageDto> list, UserId userId, String str4, String str5, CatalogBadgeDto catalogBadgeDto, String str6) {
        this.replacementId = str;
        this.text = str2;
        this.subtitle = str3;
        this.selected = baseBoolIntDto;
        this.icon = iconDto;
        this.iconSizes = list;
        this.groupId = userId;
        this.trackcode = str4;
        this.url = str5;
        this.badge = catalogBadgeDto;
        this.dataType = str6;
    }

    public final CatalogBadgeDto d() {
        return this.badge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.dataType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOptionsDto)) {
            return false;
        }
        CatalogButtonOptionsDto catalogButtonOptionsDto = (CatalogButtonOptionsDto) obj;
        return epx.f(this.replacementId, catalogButtonOptionsDto.replacementId) && epx.f(this.text, catalogButtonOptionsDto.text) && epx.f(this.subtitle, catalogButtonOptionsDto.subtitle) && this.selected == catalogButtonOptionsDto.selected && this.icon == catalogButtonOptionsDto.icon && epx.f(this.iconSizes, catalogButtonOptionsDto.iconSizes) && epx.f(this.groupId, catalogButtonOptionsDto.groupId) && epx.f(this.trackcode, catalogButtonOptionsDto.trackcode) && epx.f(this.url, catalogButtonOptionsDto.url) && epx.f(this.badge, catalogButtonOptionsDto.badge) && epx.f(this.dataType, catalogButtonOptionsDto.dataType);
    }

    public final IconDto f() {
        return this.icon;
    }

    public final List<BaseImageDto> g() {
        return this.iconSizes;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.replacementId.hashCode() * 31, 31, this.text);
        String str = this.subtitle;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.selected;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        IconDto iconDto = this.icon;
        int hashCode3 = (hashCode2 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        List<BaseImageDto> list = this.iconSizes;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.trackcode;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        int hashCode8 = (hashCode7 + (catalogBadgeDto == null ? 0 : catalogBadgeDto.hashCode())) * 31;
        String str4 = this.dataType;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.replacementId;
    }

    public final BaseBoolIntDto j() {
        return this.selected;
    }

    public final String k() {
        return this.subtitle;
    }

    public final String l() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOptionsDto(replacementId=");
        sb.append(this.replacementId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconSizes=");
        sb.append(this.iconSizes);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", trackcode=");
        sb.append(this.trackcode);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", dataType=");
        return ho8.a(sb, this.dataType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.replacementId);
        parcel.writeString(this.text);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.selected, i);
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.iconSizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.groupId, i);
        parcel.writeString(this.trackcode);
        parcel.writeString(this.url);
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.dataType);
    }

    public /* synthetic */ CatalogButtonOptionsDto(String str, String str2, String str3, BaseBoolIntDto baseBoolIntDto, IconDto iconDto, List list, UserId userId, String str4, String str5, CatalogBadgeDto catalogBadgeDto, String str6, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : iconDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : catalogBadgeDto, (i & 1024) != 0 ? null : str6);
    }
}

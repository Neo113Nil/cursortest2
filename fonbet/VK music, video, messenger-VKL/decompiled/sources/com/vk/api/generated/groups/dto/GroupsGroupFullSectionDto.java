package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullSectionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullSectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullSectionDto[] $VALUES;

    @pmi0("35")
    public static final GroupsGroupFullSectionDto ADDRESSES;

    @pmi0("27")
    public static final GroupsGroupFullSectionDto ADMIN_HELP;

    @pmi0("40")
    public static final GroupsGroupFullSectionDto ADMIN_TIPS;

    @pmi0("24")
    public static final GroupsGroupFullSectionDto ALBUMS;

    @pmi0(Gc.e)
    public static final GroupsGroupFullSectionDto APPS;

    @pmi0("13")
    public static final GroupsGroupFullSectionDto APP_BTNS;

    @pmi0("31")
    public static final GroupsGroupFullSectionDto APP_WIDGET;

    @pmi0("39")
    public static final GroupsGroupFullSectionDto ARTICLES;

    @pmi0("36")
    public static final GroupsGroupFullSectionDto ARTIST_PAGE;

    @pmi0("3")
    public static final GroupsGroupFullSectionDto AUDIOS;

    @pmi0("57")
    public static final GroupsGroupFullSectionDto BADGES;

    @pmi0("26")
    public static final GroupsGroupFullSectionDto CATEGORIES;

    @pmi0("43")
    public static final GroupsGroupFullSectionDto CHATS;

    @pmi0("58")
    public static final GroupsGroupFullSectionDto CHATS_CREATION;

    @pmi0("53")
    public static final GroupsGroupFullSectionDto CLASSIFIEDS;

    @pmi0("48")
    public static final GroupsGroupFullSectionDto CLIPS;

    @pmi0("12")
    public static final GroupsGroupFullSectionDto CONTACTS;
    public static final Parcelable.Creator<GroupsGroupFullSectionDto> CREATOR;

    @pmi0("50")
    public static final GroupsGroupFullSectionDto CURATORS;

    @pmi0("14")
    public static final GroupsGroupFullSectionDto DOCS;

    @pmi0("47")
    public static final GroupsGroupFullSectionDto DONUT_DONATE;

    @pmi0("55")
    public static final GroupsGroupFullSectionDto DONUT_FOR_DONS;

    @pmi0("10")
    public static final GroupsGroupFullSectionDto EVENTS;

    @pmi0("15")
    public static final GroupsGroupFullSectionDto EVENT_COUNTERS;

    @pmi0("44")
    public static final GroupsGroupFullSectionDto EVERGREEN_NOTICE;

    @pmi0("42")
    public static final GroupsGroupFullSectionDto FIXED_POST;

    @pmi0("8")
    public static final GroupsGroupFullSectionDto FOLLOWERS;

    @pmi0("16")
    public static final GroupsGroupFullSectionDto GROUP_MESSAGES;

    @pmi0("33")
    public static final GroupsGroupFullSectionDto HS_DONATION_APP;

    @pmi0("34")
    public static final GroupsGroupFullSectionDto HS_MARKET_APP;

    @pmi0("9")
    public static final GroupsGroupFullSectionDto LINKS;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final GroupsGroupFullSectionDto MARKET;

    @pmi0("49")
    public static final GroupsGroupFullSectionDto MARKET_CART;

    @pmi0("51")
    public static final GroupsGroupFullSectionDto MARKET_SERVICES;

    @pmi0("41")
    public static final GroupsGroupFullSectionDto MENU;

    @pmi0("45")
    public static final GroupsGroupFullSectionDto MUSICIANS;

    @pmi0("46")
    public static final GroupsGroupFullSectionDto NARRATIVES;

    @pmi0("0")
    public static final GroupsGroupFullSectionDto NONE;

    @pmi0("1")
    public static final GroupsGroupFullSectionDto PHOTOS;

    @pmi0("11")
    public static final GroupsGroupFullSectionDto PLACES;

    @pmi0("37")
    public static final GroupsGroupFullSectionDto PODCAST;

    @pmi0("32")
    public static final GroupsGroupFullSectionDto PUBLIC_HELP;

    @pmi0("60")
    public static final GroupsGroupFullSectionDto RATING;

    @pmi0("62")
    public static final GroupsGroupFullSectionDto RECOMMENDED_TIPS_WIDGET;

    @pmi0("61")
    public static final GroupsGroupFullSectionDto SERVICE_RATING;

    @pmi0("6")
    public static final GroupsGroupFullSectionDto STORIES;

    @pmi0("59")
    public static final GroupsGroupFullSectionDto STREAM_CREATION;

    @pmi0("54")
    public static final GroupsGroupFullSectionDto TEXTLIVES;

    @pmi0("2")
    public static final GroupsGroupFullSectionDto TOPICS;

    @pmi0("4")
    public static final GroupsGroupFullSectionDto VIDEOS;
    private final int value;

    /* compiled from: GroupsGroupFullSectionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullSectionDto createFromParcel(Parcel parcel) {
            return GroupsGroupFullSectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullSectionDto[] newArray(int i) {
            return new GroupsGroupFullSectionDto[i];
        }
    }

    static {
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = new GroupsGroupFullSectionDto("NONE", 0, 0);
        NONE = groupsGroupFullSectionDto;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = new GroupsGroupFullSectionDto("PHOTOS", 1, 1);
        PHOTOS = groupsGroupFullSectionDto2;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto3 = new GroupsGroupFullSectionDto("TOPICS", 2, 2);
        TOPICS = groupsGroupFullSectionDto3;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto4 = new GroupsGroupFullSectionDto("AUDIOS", 3, 3);
        AUDIOS = groupsGroupFullSectionDto4;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto5 = new GroupsGroupFullSectionDto("VIDEOS", 4, 4);
        VIDEOS = groupsGroupFullSectionDto5;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto6 = new GroupsGroupFullSectionDto("MARKET", 5, 5);
        MARKET = groupsGroupFullSectionDto6;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto7 = new GroupsGroupFullSectionDto("STORIES", 6, 6);
        STORIES = groupsGroupFullSectionDto7;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto8 = new GroupsGroupFullSectionDto("APPS", 7, 7);
        APPS = groupsGroupFullSectionDto8;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto9 = new GroupsGroupFullSectionDto("FOLLOWERS", 8, 8);
        FOLLOWERS = groupsGroupFullSectionDto9;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto10 = new GroupsGroupFullSectionDto("LINKS", 9, 9);
        LINKS = groupsGroupFullSectionDto10;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto11 = new GroupsGroupFullSectionDto("EVENTS", 10, 10);
        EVENTS = groupsGroupFullSectionDto11;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto12 = new GroupsGroupFullSectionDto("PLACES", 11, 11);
        PLACES = groupsGroupFullSectionDto12;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto13 = new GroupsGroupFullSectionDto("CONTACTS", 12, 12);
        CONTACTS = groupsGroupFullSectionDto13;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto14 = new GroupsGroupFullSectionDto("APP_BTNS", 13, 13);
        APP_BTNS = groupsGroupFullSectionDto14;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto15 = new GroupsGroupFullSectionDto("DOCS", 14, 14);
        DOCS = groupsGroupFullSectionDto15;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto16 = new GroupsGroupFullSectionDto("EVENT_COUNTERS", 15, 15);
        EVENT_COUNTERS = groupsGroupFullSectionDto16;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto17 = new GroupsGroupFullSectionDto("GROUP_MESSAGES", 16, 16);
        GROUP_MESSAGES = groupsGroupFullSectionDto17;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto18 = new GroupsGroupFullSectionDto("ALBUMS", 17, 24);
        ALBUMS = groupsGroupFullSectionDto18;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto19 = new GroupsGroupFullSectionDto("CATEGORIES", 18, 26);
        CATEGORIES = groupsGroupFullSectionDto19;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto20 = new GroupsGroupFullSectionDto("ADMIN_HELP", 19, 27);
        ADMIN_HELP = groupsGroupFullSectionDto20;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto21 = new GroupsGroupFullSectionDto("APP_WIDGET", 20, 31);
        APP_WIDGET = groupsGroupFullSectionDto21;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto22 = new GroupsGroupFullSectionDto("PUBLIC_HELP", 21, 32);
        PUBLIC_HELP = groupsGroupFullSectionDto22;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto23 = new GroupsGroupFullSectionDto("HS_DONATION_APP", 22, 33);
        HS_DONATION_APP = groupsGroupFullSectionDto23;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto24 = new GroupsGroupFullSectionDto("HS_MARKET_APP", 23, 34);
        HS_MARKET_APP = groupsGroupFullSectionDto24;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto25 = new GroupsGroupFullSectionDto("ADDRESSES", 24, 35);
        ADDRESSES = groupsGroupFullSectionDto25;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto26 = new GroupsGroupFullSectionDto("ARTIST_PAGE", 25, 36);
        ARTIST_PAGE = groupsGroupFullSectionDto26;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto27 = new GroupsGroupFullSectionDto("PODCAST", 26, 37);
        PODCAST = groupsGroupFullSectionDto27;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto28 = new GroupsGroupFullSectionDto("ARTICLES", 27, 39);
        ARTICLES = groupsGroupFullSectionDto28;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto29 = new GroupsGroupFullSectionDto("ADMIN_TIPS", 28, 40);
        ADMIN_TIPS = groupsGroupFullSectionDto29;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto30 = new GroupsGroupFullSectionDto("MENU", 29, 41);
        MENU = groupsGroupFullSectionDto30;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto31 = new GroupsGroupFullSectionDto("FIXED_POST", 30, 42);
        FIXED_POST = groupsGroupFullSectionDto31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto32 = new GroupsGroupFullSectionDto("CHATS", 31, 43);
        CHATS = groupsGroupFullSectionDto32;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto33 = new GroupsGroupFullSectionDto("EVERGREEN_NOTICE", 32, 44);
        EVERGREEN_NOTICE = groupsGroupFullSectionDto33;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto34 = new GroupsGroupFullSectionDto("MUSICIANS", 33, 45);
        MUSICIANS = groupsGroupFullSectionDto34;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto35 = new GroupsGroupFullSectionDto("NARRATIVES", 34, 46);
        NARRATIVES = groupsGroupFullSectionDto35;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto36 = new GroupsGroupFullSectionDto("DONUT_DONATE", 35, 47);
        DONUT_DONATE = groupsGroupFullSectionDto36;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto37 = new GroupsGroupFullSectionDto("CLIPS", 36, 48);
        CLIPS = groupsGroupFullSectionDto37;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto38 = new GroupsGroupFullSectionDto("MARKET_CART", 37, 49);
        MARKET_CART = groupsGroupFullSectionDto38;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto39 = new GroupsGroupFullSectionDto("CURATORS", 38, 50);
        CURATORS = groupsGroupFullSectionDto39;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto40 = new GroupsGroupFullSectionDto("MARKET_SERVICES", 39, 51);
        MARKET_SERVICES = groupsGroupFullSectionDto40;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto41 = new GroupsGroupFullSectionDto("CLASSIFIEDS", 40, 53);
        CLASSIFIEDS = groupsGroupFullSectionDto41;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto42 = new GroupsGroupFullSectionDto("TEXTLIVES", 41, 54);
        TEXTLIVES = groupsGroupFullSectionDto42;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto43 = new GroupsGroupFullSectionDto("DONUT_FOR_DONS", 42, 55);
        DONUT_FOR_DONS = groupsGroupFullSectionDto43;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto44 = new GroupsGroupFullSectionDto("BADGES", 43, 57);
        BADGES = groupsGroupFullSectionDto44;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto45 = new GroupsGroupFullSectionDto("CHATS_CREATION", 44, 58);
        CHATS_CREATION = groupsGroupFullSectionDto45;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto46 = new GroupsGroupFullSectionDto("STREAM_CREATION", 45, 59);
        STREAM_CREATION = groupsGroupFullSectionDto46;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto47 = new GroupsGroupFullSectionDto(NativeAdContent.ViewTag.RATING, 46, 60);
        RATING = groupsGroupFullSectionDto47;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto48 = new GroupsGroupFullSectionDto("SERVICE_RATING", 47, 61);
        SERVICE_RATING = groupsGroupFullSectionDto48;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto49 = new GroupsGroupFullSectionDto("RECOMMENDED_TIPS_WIDGET", 48, 62);
        RECOMMENDED_TIPS_WIDGET = groupsGroupFullSectionDto49;
        GroupsGroupFullSectionDto[] groupsGroupFullSectionDtoArr = {groupsGroupFullSectionDto, groupsGroupFullSectionDto2, groupsGroupFullSectionDto3, groupsGroupFullSectionDto4, groupsGroupFullSectionDto5, groupsGroupFullSectionDto6, groupsGroupFullSectionDto7, groupsGroupFullSectionDto8, groupsGroupFullSectionDto9, groupsGroupFullSectionDto10, groupsGroupFullSectionDto11, groupsGroupFullSectionDto12, groupsGroupFullSectionDto13, groupsGroupFullSectionDto14, groupsGroupFullSectionDto15, groupsGroupFullSectionDto16, groupsGroupFullSectionDto17, groupsGroupFullSectionDto18, groupsGroupFullSectionDto19, groupsGroupFullSectionDto20, groupsGroupFullSectionDto21, groupsGroupFullSectionDto22, groupsGroupFullSectionDto23, groupsGroupFullSectionDto24, groupsGroupFullSectionDto25, groupsGroupFullSectionDto26, groupsGroupFullSectionDto27, groupsGroupFullSectionDto28, groupsGroupFullSectionDto29, groupsGroupFullSectionDto30, groupsGroupFullSectionDto31, groupsGroupFullSectionDto32, groupsGroupFullSectionDto33, groupsGroupFullSectionDto34, groupsGroupFullSectionDto35, groupsGroupFullSectionDto36, groupsGroupFullSectionDto37, groupsGroupFullSectionDto38, groupsGroupFullSectionDto39, groupsGroupFullSectionDto40, groupsGroupFullSectionDto41, groupsGroupFullSectionDto42, groupsGroupFullSectionDto43, groupsGroupFullSectionDto44, groupsGroupFullSectionDto45, groupsGroupFullSectionDto46, groupsGroupFullSectionDto47, groupsGroupFullSectionDto48, groupsGroupFullSectionDto49};
        $VALUES = groupsGroupFullSectionDtoArr;
        $ENTRIES = new asp(groupsGroupFullSectionDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupFullSectionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullSectionDto valueOf(String str) {
        return (GroupsGroupFullSectionDto) Enum.valueOf(GroupsGroupFullSectionDto.class, str);
    }

    public static GroupsGroupFullSectionDto[] values() {
        return (GroupsGroupFullSectionDto[]) $VALUES.clone();
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

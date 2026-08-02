package com.vk.sdk.api.apps.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsScopeDto.kt */
/* loaded from: classes5.dex */
public final class AppsScopeDto {

    @pmi0("name")
    private final NameDto name;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsScopeDto.kt */
    public static final class NameDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @pmi0(b.JSON_KEY_ADS)
        public static final NameDto ADS;

        @pmi0("adsweb")
        public static final NameDto ADSWEB;

        @pmi0("app_widget")
        public static final NameDto APP_WIDGET;

        @pmi0("audio")
        public static final NameDto AUDIO;

        @pmi0("docs")
        public static final NameDto DOCS;

        @pmi0("email")
        public static final NameDto EMAIL;

        @pmi0("exchange")
        public static final NameDto EXCHANGE;

        @pmi0("friends")
        public static final NameDto FRIENDS;

        @pmi0("groups")
        public static final NameDto GROUPS;

        @pmi0("group_messages")
        public static final NameDto GROUP_MESSAGES;

        @pmi0("leads")
        public static final NameDto LEADS;

        @pmi0("manage")
        public static final NameDto MANAGE;

        @pmi0("market")
        public static final NameDto MARKET;

        @pmi0("menu")
        public static final NameDto MENU;

        @pmi0("messages")
        public static final NameDto MESSAGES;

        @pmi0("notes")
        public static final NameDto NOTES;

        @pmi0(C4504q2.x)
        public static final NameDto NOTIFICATIONS;

        @pmi0("notify")
        public static final NameDto NOTIFY;

        @pmi0("offline")
        public static final NameDto OFFLINE;

        @pmi0("pages")
        public static final NameDto PAGES;

        @pmi0("phone")
        public static final NameDto PHONE;

        @pmi0("photos")
        public static final NameDto PHOTOS;

        @pmi0("stats")
        public static final NameDto STATS;

        @pmi0("status")
        public static final NameDto STATUS;

        @pmi0("stories")
        public static final NameDto STORIES;

        @pmi0("support")
        public static final NameDto SUPPORT;

        @pmi0("video")
        public static final NameDto VIDEO;

        @pmi0("wall")
        public static final NameDto WALL;

        @pmi0("wallmenu")
        public static final NameDto WALLMENU;
        private final String value;

        static {
            NameDto nameDto = new NameDto(Privacy.FRIENDS, 0, "friends");
            FRIENDS = nameDto;
            NameDto nameDto2 = new NameDto("PHOTOS", 1, "photos");
            PHOTOS = nameDto2;
            NameDto nameDto3 = new NameDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
            VIDEO = nameDto3;
            NameDto nameDto4 = new NameDto("PAGES", 3, "pages");
            PAGES = nameDto4;
            NameDto nameDto5 = new NameDto(CommonConstant.RETKEY.STATUS, 4, "status");
            STATUS = nameDto5;
            NameDto nameDto6 = new NameDto("NOTES", 5, "notes");
            NOTES = nameDto6;
            NameDto nameDto7 = new NameDto("WALL", 6, "wall");
            WALL = nameDto7;
            NameDto nameDto8 = new NameDto("DOCS", 7, "docs");
            DOCS = nameDto8;
            NameDto nameDto9 = new NameDto("GROUPS", 8, "groups");
            GROUPS = nameDto9;
            NameDto nameDto10 = new NameDto("STATS", 9, "stats");
            STATS = nameDto10;
            NameDto nameDto11 = new NameDto("MARKET", 10, "market");
            MARKET = nameDto11;
            NameDto nameDto12 = new NameDto("STORIES", 11, "stories");
            STORIES = nameDto12;
            NameDto nameDto13 = new NameDto("APP_WIDGET", 12, "app_widget");
            APP_WIDGET = nameDto13;
            NameDto nameDto14 = new NameDto("MESSAGES", 13, "messages");
            MESSAGES = nameDto14;
            NameDto nameDto15 = new NameDto("MANAGE", 14, "manage");
            MANAGE = nameDto15;
            NameDto nameDto16 = new NameDto("NOTIFY", 15, "notify");
            NOTIFY = nameDto16;
            NameDto nameDto17 = new NameDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 16, "audio");
            AUDIO = nameDto17;
            NameDto nameDto18 = new NameDto("SUPPORT", 17, "support");
            SUPPORT = nameDto18;
            NameDto nameDto19 = new NameDto("MENU", 18, "menu");
            MENU = nameDto19;
            NameDto nameDto20 = new NameDto("WALLMENU", 19, "wallmenu");
            WALLMENU = nameDto20;
            NameDto nameDto21 = new NameDto("ADS", 20, b.JSON_KEY_ADS);
            ADS = nameDto21;
            NameDto nameDto22 = new NameDto("OFFLINE", 21, "offline");
            OFFLINE = nameDto22;
            NameDto nameDto23 = new NameDto("NOTIFICATIONS", 22, C4504q2.x);
            NOTIFICATIONS = nameDto23;
            NameDto nameDto24 = new NameDto(CommonConstant.RETKEY.EMAIL, 23, "email");
            EMAIL = nameDto24;
            NameDto nameDto25 = new NameDto("ADSWEB", 24, "adsweb");
            ADSWEB = nameDto25;
            NameDto nameDto26 = new NameDto("LEADS", 25, "leads");
            LEADS = nameDto26;
            NameDto nameDto27 = new NameDto("GROUP_MESSAGES", 26, "group_messages");
            GROUP_MESSAGES = nameDto27;
            NameDto nameDto28 = new NameDto("EXCHANGE", 27, "exchange");
            EXCHANGE = nameDto28;
            NameDto nameDto29 = new NameDto("PHONE", 28, "phone");
            PHONE = nameDto29;
            NameDto[] nameDtoArr = {nameDto, nameDto2, nameDto3, nameDto4, nameDto5, nameDto6, nameDto7, nameDto8, nameDto9, nameDto10, nameDto11, nameDto12, nameDto13, nameDto14, nameDto15, nameDto16, nameDto17, nameDto18, nameDto19, nameDto20, nameDto21, nameDto22, nameDto23, nameDto24, nameDto25, nameDto26, nameDto27, nameDto28, nameDto29};
            $VALUES = nameDtoArr;
            $ENTRIES = new asp(nameDtoArr);
        }

        private NameDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
        }
    }

    public AppsScopeDto(NameDto nameDto, String str) {
        this.name = nameDto;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsScopeDto)) {
            return false;
        }
        AppsScopeDto appsScopeDto = (AppsScopeDto) obj;
        return this.name == appsScopeDto.name && epx.f(this.title, appsScopeDto.title);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppsScopeDto(name=" + this.name + ", title=" + this.title + ")";
    }

    public /* synthetic */ AppsScopeDto(NameDto nameDto, String str, int i, zcl zclVar) {
        this(nameDto, (i & 2) != 0 ? null : str);
    }
}

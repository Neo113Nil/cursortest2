package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsCheckAllowedScopesScopesDto.kt */
/* loaded from: classes14.dex */
public final class AppsCheckAllowedScopesScopesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsCheckAllowedScopesScopesDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final AppsCheckAllowedScopesScopesDto ADS;

    @pmi0("adsweb")
    public static final AppsCheckAllowedScopesScopesDto ADSWEB;

    @pmi0("audio")
    public static final AppsCheckAllowedScopesScopesDto AUDIO;
    public static final Parcelable.Creator<AppsCheckAllowedScopesScopesDto> CREATOR;

    @pmi0("docs")
    public static final AppsCheckAllowedScopesScopesDto DOCS;

    @pmi0("email")
    public static final AppsCheckAllowedScopesScopesDto EMAIL;

    @pmi0("exchange")
    public static final AppsCheckAllowedScopesScopesDto EXCHANGE;

    @pmi0("friends")
    public static final AppsCheckAllowedScopesScopesDto FRIENDS;

    @pmi0("groups")
    public static final AppsCheckAllowedScopesScopesDto GROUPS;

    @pmi0("group_messages")
    public static final AppsCheckAllowedScopesScopesDto GROUP_MESSAGES;

    @pmi0("leads")
    public static final AppsCheckAllowedScopesScopesDto LEADS;

    @pmi0("market")
    public static final AppsCheckAllowedScopesScopesDto MARKET;

    @pmi0("menu")
    public static final AppsCheckAllowedScopesScopesDto MENU;

    @pmi0("messages")
    public static final AppsCheckAllowedScopesScopesDto MESSAGES;

    @pmi0("notes")
    public static final AppsCheckAllowedScopesScopesDto NOTES;

    @pmi0(C4504q2.x)
    public static final AppsCheckAllowedScopesScopesDto NOTIFICATIONS;

    @pmi0("notify")
    public static final AppsCheckAllowedScopesScopesDto NOTIFY;

    @pmi0("offline")
    public static final AppsCheckAllowedScopesScopesDto OFFLINE;

    @pmi0("pages")
    public static final AppsCheckAllowedScopesScopesDto PAGES;

    @pmi0("phone")
    public static final AppsCheckAllowedScopesScopesDto PHONE;

    @pmi0("photos")
    public static final AppsCheckAllowedScopesScopesDto PHOTOS;

    @pmi0("stats")
    public static final AppsCheckAllowedScopesScopesDto STATS;

    @pmi0("status")
    public static final AppsCheckAllowedScopesScopesDto STATUS;

    @pmi0("stories")
    public static final AppsCheckAllowedScopesScopesDto STORIES;

    @pmi0("video")
    public static final AppsCheckAllowedScopesScopesDto VIDEO;

    @pmi0("wall")
    public static final AppsCheckAllowedScopesScopesDto WALL;

    @pmi0("wallmenu")
    public static final AppsCheckAllowedScopesScopesDto WALLMENU;
    private final String value;

    /* compiled from: AppsCheckAllowedScopesScopesDto.kt */
    public static final class a implements Parcelable.Creator<AppsCheckAllowedScopesScopesDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCheckAllowedScopesScopesDto createFromParcel(Parcel parcel) {
            return AppsCheckAllowedScopesScopesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCheckAllowedScopesScopesDto[] newArray(int i) {
            return new AppsCheckAllowedScopesScopesDto[i];
        }
    }

    static {
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto = new AppsCheckAllowedScopesScopesDto("NOTIFY", 0, "notify");
        NOTIFY = appsCheckAllowedScopesScopesDto;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto2 = new AppsCheckAllowedScopesScopesDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = appsCheckAllowedScopesScopesDto2;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto3 = new AppsCheckAllowedScopesScopesDto("PHOTOS", 2, "photos");
        PHOTOS = appsCheckAllowedScopesScopesDto3;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto4 = new AppsCheckAllowedScopesScopesDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 3, "audio");
        AUDIO = appsCheckAllowedScopesScopesDto4;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto5 = new AppsCheckAllowedScopesScopesDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video");
        VIDEO = appsCheckAllowedScopesScopesDto5;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto6 = new AppsCheckAllowedScopesScopesDto("STORIES", 5, "stories");
        STORIES = appsCheckAllowedScopesScopesDto6;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto7 = new AppsCheckAllowedScopesScopesDto("PAGES", 6, "pages");
        PAGES = appsCheckAllowedScopesScopesDto7;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto8 = new AppsCheckAllowedScopesScopesDto("MENU", 7, "menu");
        MENU = appsCheckAllowedScopesScopesDto8;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto9 = new AppsCheckAllowedScopesScopesDto("WALLMENU", 8, "wallmenu");
        WALLMENU = appsCheckAllowedScopesScopesDto9;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto10 = new AppsCheckAllowedScopesScopesDto(CommonConstant.RETKEY.STATUS, 9, "status");
        STATUS = appsCheckAllowedScopesScopesDto10;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto11 = new AppsCheckAllowedScopesScopesDto("NOTES", 10, "notes");
        NOTES = appsCheckAllowedScopesScopesDto11;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto12 = new AppsCheckAllowedScopesScopesDto("MESSAGES", 11, "messages");
        MESSAGES = appsCheckAllowedScopesScopesDto12;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto13 = new AppsCheckAllowedScopesScopesDto("WALL", 12, "wall");
        WALL = appsCheckAllowedScopesScopesDto13;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto14 = new AppsCheckAllowedScopesScopesDto("ADS", 13, b.JSON_KEY_ADS);
        ADS = appsCheckAllowedScopesScopesDto14;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto15 = new AppsCheckAllowedScopesScopesDto("OFFLINE", 14, "offline");
        OFFLINE = appsCheckAllowedScopesScopesDto15;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto16 = new AppsCheckAllowedScopesScopesDto("DOCS", 15, "docs");
        DOCS = appsCheckAllowedScopesScopesDto16;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto17 = new AppsCheckAllowedScopesScopesDto("GROUPS", 16, "groups");
        GROUPS = appsCheckAllowedScopesScopesDto17;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto18 = new AppsCheckAllowedScopesScopesDto("NOTIFICATIONS", 17, C4504q2.x);
        NOTIFICATIONS = appsCheckAllowedScopesScopesDto18;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto19 = new AppsCheckAllowedScopesScopesDto("STATS", 18, "stats");
        STATS = appsCheckAllowedScopesScopesDto19;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto20 = new AppsCheckAllowedScopesScopesDto(CommonConstant.RETKEY.EMAIL, 19, "email");
        EMAIL = appsCheckAllowedScopesScopesDto20;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto21 = new AppsCheckAllowedScopesScopesDto("ADSWEB", 20, "adsweb");
        ADSWEB = appsCheckAllowedScopesScopesDto21;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto22 = new AppsCheckAllowedScopesScopesDto("LEADS", 21, "leads");
        LEADS = appsCheckAllowedScopesScopesDto22;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto23 = new AppsCheckAllowedScopesScopesDto("GROUP_MESSAGES", 22, "group_messages");
        GROUP_MESSAGES = appsCheckAllowedScopesScopesDto23;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto24 = new AppsCheckAllowedScopesScopesDto("EXCHANGE", 23, "exchange");
        EXCHANGE = appsCheckAllowedScopesScopesDto24;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto25 = new AppsCheckAllowedScopesScopesDto("MARKET", 24, "market");
        MARKET = appsCheckAllowedScopesScopesDto25;
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto26 = new AppsCheckAllowedScopesScopesDto("PHONE", 25, "phone");
        PHONE = appsCheckAllowedScopesScopesDto26;
        AppsCheckAllowedScopesScopesDto[] appsCheckAllowedScopesScopesDtoArr = {appsCheckAllowedScopesScopesDto, appsCheckAllowedScopesScopesDto2, appsCheckAllowedScopesScopesDto3, appsCheckAllowedScopesScopesDto4, appsCheckAllowedScopesScopesDto5, appsCheckAllowedScopesScopesDto6, appsCheckAllowedScopesScopesDto7, appsCheckAllowedScopesScopesDto8, appsCheckAllowedScopesScopesDto9, appsCheckAllowedScopesScopesDto10, appsCheckAllowedScopesScopesDto11, appsCheckAllowedScopesScopesDto12, appsCheckAllowedScopesScopesDto13, appsCheckAllowedScopesScopesDto14, appsCheckAllowedScopesScopesDto15, appsCheckAllowedScopesScopesDto16, appsCheckAllowedScopesScopesDto17, appsCheckAllowedScopesScopesDto18, appsCheckAllowedScopesScopesDto19, appsCheckAllowedScopesScopesDto20, appsCheckAllowedScopesScopesDto21, appsCheckAllowedScopesScopesDto22, appsCheckAllowedScopesScopesDto23, appsCheckAllowedScopesScopesDto24, appsCheckAllowedScopesScopesDto25, appsCheckAllowedScopesScopesDto26};
        $VALUES = appsCheckAllowedScopesScopesDtoArr;
        $ENTRIES = new asp(appsCheckAllowedScopesScopesDtoArr);
        CREATOR = new a();
    }

    private AppsCheckAllowedScopesScopesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsCheckAllowedScopesScopesDto valueOf(String str) {
        return (AppsCheckAllowedScopesScopesDto) Enum.valueOf(AppsCheckAllowedScopesScopesDto.class, str);
    }

    public static AppsCheckAllowedScopesScopesDto[] values() {
        return (AppsCheckAllowedScopesScopesDto[]) $VALUES.clone();
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

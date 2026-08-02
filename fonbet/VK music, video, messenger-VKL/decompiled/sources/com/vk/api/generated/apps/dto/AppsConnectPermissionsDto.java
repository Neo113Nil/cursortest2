package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsConnectPermissionsDto.kt */
/* loaded from: classes.dex */
public abstract class AppsConnectPermissionsDto implements Parcelable {

    /* compiled from: AppsConnectPermissionsDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsPermissionDto extends AppsConnectPermissionsDto implements Parcelable {
        public static final Parcelable.Creator<AppsPermissionDto> CREATOR = new a();

        @pmi0("description")
        private final String description;

        @pmi0("name")
        private final NameDto name;

        @pmi0("title")
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsConnectPermissionsDto.kt */
        public static final class NameDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ NameDto[] $VALUES;
            public static final Parcelable.Creator<NameDto> CREATOR;

            @pmi0("email")
            public static final NameDto EMAIL;

            @pmi0("geo_data")
            public static final NameDto GEO_DATA;

            @pmi0("microphone")
            public static final NameDto MICROPHONE;

            @pmi0("phone_number")
            public static final NameDto PHONE_NUMBER;
            private final String value;

            /* compiled from: AppsConnectPermissionsDto.kt */
            public static final class a implements Parcelable.Creator<NameDto> {
                @Override // android.os.Parcelable.Creator
                public final NameDto createFromParcel(Parcel parcel) {
                    return NameDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NameDto[] newArray(int i) {
                    return new NameDto[i];
                }
            }

            static {
                NameDto nameDto = new NameDto("PHONE_NUMBER", 0, "phone_number");
                PHONE_NUMBER = nameDto;
                NameDto nameDto2 = new NameDto(CommonConstant.RETKEY.EMAIL, 1, "email");
                EMAIL = nameDto2;
                NameDto nameDto3 = new NameDto("GEO_DATA", 2, "geo_data");
                GEO_DATA = nameDto3;
                NameDto nameDto4 = new NameDto("MICROPHONE", 3, "microphone");
                MICROPHONE = nameDto4;
                NameDto[] nameDtoArr = {nameDto, nameDto2, nameDto3, nameDto4};
                $VALUES = nameDtoArr;
                $ENTRIES = new asp(nameDtoArr);
                CREATOR = new a();
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

        /* compiled from: AppsConnectPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<AppsPermissionDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsPermissionDto createFromParcel(Parcel parcel) {
                return new AppsPermissionDto(NameDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsPermissionDto[] newArray(int i) {
                return new AppsPermissionDto[i];
            }
        }

        public /* synthetic */ AppsPermissionDto(NameDto nameDto, String str, String str2, int i, zcl zclVar) {
            this(nameDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final NameDto d() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsPermissionDto)) {
                return false;
            }
            AppsPermissionDto appsPermissionDto = (AppsPermissionDto) obj;
            return this.name == appsPermissionDto.name && epx.f(this.title, appsPermissionDto.title) && epx.f(this.description, appsPermissionDto.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsPermissionDto(name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            return ho8.a(sb, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.name.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }

        public AppsPermissionDto(NameDto nameDto, String str, String str2) {
            super(null);
            this.name = nameDto;
            this.title = str;
            this.description = str2;
        }
    }

    /* compiled from: AppsConnectPermissionsDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsScopeDto extends AppsConnectPermissionsDto implements Parcelable {
        public static final Parcelable.Creator<AppsScopeDto> CREATOR = new a();

        @pmi0("description")
        private final String description;

        @pmi0("name")
        private final NameDto name;

        @pmi0("title")
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsConnectPermissionsDto.kt */
        public static final class NameDto implements Parcelable {
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
            public static final Parcelable.Creator<NameDto> CREATOR;

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

            /* compiled from: AppsConnectPermissionsDto.kt */
            public static final class a implements Parcelable.Creator<NameDto> {
                @Override // android.os.Parcelable.Creator
                public final NameDto createFromParcel(Parcel parcel) {
                    return NameDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NameDto[] newArray(int i) {
                    return new NameDto[i];
                }
            }

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
                CREATOR = new a();
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

        /* compiled from: AppsConnectPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<AppsScopeDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsScopeDto createFromParcel(Parcel parcel) {
                return new AppsScopeDto(NameDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsScopeDto[] newArray(int i) {
                return new AppsScopeDto[i];
            }
        }

        public /* synthetic */ AppsScopeDto(NameDto nameDto, String str, String str2, int i, zcl zclVar) {
            this(nameDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final NameDto d() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsScopeDto)) {
                return false;
            }
            AppsScopeDto appsScopeDto = (AppsScopeDto) obj;
            return this.name == appsScopeDto.name && epx.f(this.title, appsScopeDto.title) && epx.f(this.description, appsScopeDto.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsScopeDto(name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            return ho8.a(sb, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.name.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }

        public AppsScopeDto(NameDto nameDto, String str, String str2) {
            super(null);
            this.name = nameDto;
            this.title = str;
            this.description = str2;
        }
    }

    /* compiled from: AppsConnectPermissionsDto.kt */
    public static final class Deserializer implements a9y<AppsConnectPermissionsDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "name");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1884266413:
                        if (f.equals("stories")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1854767153:
                        if (f.equals("support")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1548612125:
                        if (f.equals("offline")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1422043996:
                        if (f.equals("adsweb")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1237460524:
                        if (f.equals("groups")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1081306052:
                        if (f.equals("market")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -1039689911:
                        if (f.equals("notify")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -989034367:
                        if (f.equals("photos")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -892481550:
                        if (f.equals("status")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case -612351174:
                        if (f.equals("phone_number")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsPermissionDto.class);
                        }
                        break;
                    case -600094315:
                        if (f.equals("friends")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 96432:
                        if (f.equals(b.JSON_KEY_ADS)) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 3088955:
                        if (f.equals("docs")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 3347807:
                        if (f.equals("menu")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 3641802:
                        if (f.equals("wall")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 93166550:
                        if (f.equals("audio")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 96619420:
                        if (f.equals("email")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsPermissionDto.class);
                        }
                        break;
                    case 102845591:
                        if (f.equals("leads")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 105008833:
                        if (f.equals("notes")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 106426308:
                        if (f.equals("pages")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 106642798:
                        if (f.equals("phone")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 109757599:
                        if (f.equals("stats")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 324579881:
                        if (f.equals("wallmenu")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 1125980940:
                        if (f.equals("group_messages")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 1272354024:
                        if (f.equals(C4504q2.x)) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 1370921258:
                        if (f.equals("microphone")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsPermissionDto.class);
                        }
                        break;
                    case 1388275234:
                        if (f.equals("app_widget")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                    case 1833042904:
                        if (f.equals("geo_data")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsPermissionDto.class);
                        }
                        break;
                    case 1989774883:
                        if (f.equals("exchange")) {
                            return (AppsConnectPermissionsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsScopeDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AppsConnectPermissionsDto(zcl zclVar) {
        this();
    }

    private AppsConnectPermissionsDto() {
    }
}

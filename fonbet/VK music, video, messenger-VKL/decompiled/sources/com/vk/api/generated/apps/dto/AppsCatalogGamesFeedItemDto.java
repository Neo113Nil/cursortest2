package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsCatalogGamesFeedItemDto.kt */
/* loaded from: classes.dex */
public abstract class AppsCatalogGamesFeedItemDto implements Parcelable {

    /* compiled from: AppsCatalogGamesFeedItemDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsActivityItemDto extends AppsCatalogGamesFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<AppsActivityItemDto> CREATOR = new a();

        @pmi0("app_id")
        private final int appId;

        @pmi0("date")
        private final int date;

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("level")
        private final Integer level;

        @pmi0(X3.i.I0)
        private final AppsActivityMediaDto media;

        @pmi0("text")
        private final String text;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("value")
        private final Integer value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("achievement")
            public static final TypeDto ACHIEVEMENT;

            @pmi0("apps_news")
            public static final TypeDto APPS_NEWS;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("game_send_gift")
            public static final TypeDto GAME_SEND_GIFT;

            @pmi0("install")
            public static final TypeDto INSTALL;

            @pmi0("invite")
            public static final TypeDto INVITE;

            @pmi0("level")
            public static final TypeDto LEVEL;

            @pmi0("notification")
            public static final TypeDto NOTIFICATION;

            @pmi0("request")
            public static final TypeDto REQUEST;

            @pmi0("run")
            public static final TypeDto RUN;

            @pmi0("score")
            public static final TypeDto SCORE;

            @pmi0("stickers_achievement")
            public static final TypeDto STICKERS_ACHIEVEMENT;
            private final String value;

            /* compiled from: AppsCatalogGamesFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("REQUEST", 0, "request");
                REQUEST = typeDto;
                TypeDto typeDto2 = new TypeDto("APPS_NEWS", 1, "apps_news");
                APPS_NEWS = typeDto2;
                TypeDto typeDto3 = new TypeDto("NOTIFICATION", 2, "notification");
                NOTIFICATION = typeDto3;
                TypeDto typeDto4 = new TypeDto("INVITE", 3, "invite");
                INVITE = typeDto4;
                TypeDto typeDto5 = new TypeDto("RUN", 4, "run");
                RUN = typeDto5;
                TypeDto typeDto6 = new TypeDto("INSTALL", 5, "install");
                INSTALL = typeDto6;
                TypeDto typeDto7 = new TypeDto("SCORE", 6, "score");
                SCORE = typeDto7;
                TypeDto typeDto8 = new TypeDto("LEVEL", 7, "level");
                LEVEL = typeDto8;
                TypeDto typeDto9 = new TypeDto("ACHIEVEMENT", 8, "achievement");
                ACHIEVEMENT = typeDto9;
                TypeDto typeDto10 = new TypeDto("STICKERS_ACHIEVEMENT", 9, "stickers_achievement");
                STICKERS_ACHIEVEMENT = typeDto10;
                TypeDto typeDto11 = new TypeDto("GAME_SEND_GIFT", 10, "game_send_gift");
                GAME_SEND_GIFT = typeDto11;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11};
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

        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<AppsActivityItemDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsActivityItemDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                UserId userId = (UserId) parcel.readParcelable(AppsActivityItemDto.class.getClassLoader());
                int readInt2 = parcel.readInt();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    int i = 0;
                    while (i != readInt3) {
                        i = bo.b(AppsActivityItemDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AppsActivityItemDto(createFromParcel, readInt, userId, readInt2, valueOf, valueOf2, readString, arrayList, parcel.readInt() != 0 ? AppsActivityMediaDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsActivityItemDto[] newArray(int i) {
                return new AppsActivityItemDto[i];
            }
        }

        public /* synthetic */ AppsActivityItemDto(TypeDto typeDto, int i, UserId userId, int i2, Integer num, Integer num2, String str, List list, AppsActivityMediaDto appsActivityMediaDto, String str2, int i3, zcl zclVar) {
            this(typeDto, i, userId, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : appsActivityMediaDto, (i3 & 512) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsActivityItemDto)) {
                return false;
            }
            AppsActivityItemDto appsActivityItemDto = (AppsActivityItemDto) obj;
            return this.type == appsActivityItemDto.type && this.appId == appsActivityItemDto.appId && epx.f(this.userId, appsActivityItemDto.userId) && this.date == appsActivityItemDto.date && epx.f(this.value, appsActivityItemDto.value) && epx.f(this.level, appsActivityItemDto.level) && epx.f(this.text, appsActivityItemDto.text) && epx.f(this.icons, appsActivityItemDto.icons) && epx.f(this.media, appsActivityItemDto.media) && epx.f(this.trackCode, appsActivityItemDto.trackCode);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(shy.a(this.appId, this.type.hashCode() * 31, 31), 31, this.userId.b), 31);
            Integer num = this.value;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.level;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.text;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<BaseImageDto> list = this.icons;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            AppsActivityMediaDto appsActivityMediaDto = this.media;
            int hashCode5 = (hashCode4 + (appsActivityMediaDto == null ? 0 : appsActivityMediaDto.hashCode())) * 31;
            String str2 = this.trackCode;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsActivityItemDto(type=");
            sb.append(this.type);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", level=");
            sb.append(this.level);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", icons=");
            sb.append(this.icons);
            sb.append(", media=");
            sb.append(this.media);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.appId);
            parcel.writeParcelable(this.userId, i);
            parcel.writeInt(this.date);
            Integer num = this.value;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.level;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeString(this.text);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            AppsActivityMediaDto appsActivityMediaDto = this.media;
            if (appsActivityMediaDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appsActivityMediaDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
        }

        public AppsActivityItemDto(TypeDto typeDto, int i, UserId userId, int i2, Integer num, Integer num2, String str, List<BaseImageDto> list, AppsActivityMediaDto appsActivityMediaDto, String str2) {
            super(null);
            this.type = typeDto;
            this.appId = i;
            this.userId = userId;
            this.date = i2;
            this.value = num;
            this.level = num2;
            this.text = str;
            this.icons = list;
            this.media = appsActivityMediaDto;
            this.trackCode = str2;
        }
    }

    /* compiled from: AppsCatalogGamesFeedItemDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsNotificationDto extends AppsCatalogGamesFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<AppsNotificationDto> CREATOR = new a();

        @pmi0("app_id")
        private final int appId;

        @pmi0("date")
        private final int date;

        @pmi0("id")
        private final int id;

        @pmi0("is_new")
        private final Boolean isNew;

        @pmi0("message")
        private final String message;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("notification")
            public static final TypeDto NOTIFICATION;
            private final String value;

            /* compiled from: AppsCatalogGamesFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("NOTIFICATION", 0, "notification");
                NOTIFICATION = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<AppsNotificationDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsNotificationDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                Boolean bool = null;
                TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AppsNotificationDto(readInt, readInt2, readInt3, readString, createFromParcel, bool, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsNotificationDto[] newArray(int i) {
                return new AppsNotificationDto[i];
            }
        }

        public /* synthetic */ AppsNotificationDto(int i, int i2, int i3, String str, TypeDto typeDto, Boolean bool, String str2, int i4, zcl zclVar) {
            this(i, i2, i3, str, (i4 & 16) != 0 ? null : typeDto, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsNotificationDto)) {
                return false;
            }
            AppsNotificationDto appsNotificationDto = (AppsNotificationDto) obj;
            return this.appId == appsNotificationDto.appId && this.date == appsNotificationDto.date && this.id == appsNotificationDto.id && epx.f(this.message, appsNotificationDto.message) && this.type == appsNotificationDto.type && epx.f(this.isNew, appsNotificationDto.isNew) && epx.f(this.trackCode, appsNotificationDto.trackCode);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.appId) * 31, 31), 31), 31, this.message);
            TypeDto typeDto = this.type;
            int hashCode = (a2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            Boolean bool = this.isNew;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.trackCode;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsNotificationDto(appId=");
            sb.append(this.appId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", isNew=");
            sb.append(this.isNew);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.appId);
            parcel.writeInt(this.date);
            parcel.writeInt(this.id);
            parcel.writeString(this.message);
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isNew;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeString(this.trackCode);
        }

        public AppsNotificationDto(int i, int i2, int i3, String str, TypeDto typeDto, Boolean bool, String str2) {
            super(null);
            this.appId = i;
            this.date = i2;
            this.id = i3;
            this.message = str;
            this.type = typeDto;
            this.isNew = bool;
            this.trackCode = str2;
        }
    }

    /* compiled from: AppsCatalogGamesFeedItemDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsRequestItemDto extends AppsCatalogGamesFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<AppsRequestItemDto> CREATOR = new a();

        @pmi0("app_id")
        private final int appId;

        @pmi0("button")
        private final String button;

        @pmi0("date")
        private final Integer date;

        @pmi0("from")
        private final List<AppsRequestFromItemDto> from;

        @pmi0("from_id")
        private final Long fromId;

        @pmi0("id")
        private final Integer id;

        @pmi0("key")
        private final String key;

        @pmi0("name")
        private final String name;

        @pmi0("text")
        private final String text;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        @pmi0("unread")
        private final UnreadDto unread;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class UnreadDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ UnreadDto[] $VALUES;
            public static final Parcelable.Creator<UnreadDto> CREATOR;

            @pmi0("0")
            public static final UnreadDto READ;

            @pmi0("1")
            public static final UnreadDto UNREAD;
            private final int value;

            /* compiled from: AppsCatalogGamesFeedItemDto.kt */
            public static final class a implements Parcelable.Creator<UnreadDto> {
                @Override // android.os.Parcelable.Creator
                public final UnreadDto createFromParcel(Parcel parcel) {
                    return UnreadDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final UnreadDto[] newArray(int i) {
                    return new UnreadDto[i];
                }
            }

            static {
                UnreadDto unreadDto = new UnreadDto("READ", 0, 0);
                READ = unreadDto;
                UnreadDto unreadDto2 = new UnreadDto("UNREAD", 1, 1);
                UNREAD = unreadDto2;
                UnreadDto[] unreadDtoArr = {unreadDto, unreadDto2};
                $VALUES = unreadDtoArr;
                $ENTRIES = new asp(unreadDtoArr);
                CREATOR = new a();
            }

            private UnreadDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static UnreadDto valueOf(String str) {
                return (UnreadDto) Enum.valueOf(UnreadDto.class, str);
            }

            public static UnreadDto[] values() {
                return (UnreadDto[]) $VALUES.clone();
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

        /* compiled from: AppsCatalogGamesFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<AppsRequestItemDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsRequestItemDto createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                UnreadDto createFromParcel = parcel.readInt() == 0 ? null : UnreadDto.CREATOR.createFromParcel(parcel);
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                Integer num = valueOf;
                Long l = valueOf2;
                Integer num2 = valueOf3;
                String readString4 = parcel.readString();
                ArrayList arrayList = null;
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(AppsRequestFromItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AppsRequestItemDto(readString, readInt, readString2, createFromParcel, num, l, num2, readString3, readString4, readString5, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsRequestItemDto[] newArray(int i) {
                return new AppsRequestItemDto[i];
            }
        }

        public /* synthetic */ AppsRequestItemDto(String str, int i, String str2, UnreadDto unreadDto, Integer num, Long l, Integer num2, String str3, String str4, String str5, List list, String str6, int i2, zcl zclVar) {
            this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : unreadDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : str6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsRequestItemDto)) {
                return false;
            }
            AppsRequestItemDto appsRequestItemDto = (AppsRequestItemDto) obj;
            return epx.f(this.type, appsRequestItemDto.type) && this.appId == appsRequestItemDto.appId && epx.f(this.text, appsRequestItemDto.text) && this.unread == appsRequestItemDto.unread && epx.f(this.id, appsRequestItemDto.id) && epx.f(this.fromId, appsRequestItemDto.fromId) && epx.f(this.date, appsRequestItemDto.date) && epx.f(this.key, appsRequestItemDto.key) && epx.f(this.button, appsRequestItemDto.button) && epx.f(this.name, appsRequestItemDto.name) && epx.f(this.from, appsRequestItemDto.from) && epx.f(this.trackCode, appsRequestItemDto.trackCode);
        }

        public final int hashCode() {
            int a2 = shy.a(this.appId, this.type.hashCode() * 31, 31);
            String str = this.text;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            UnreadDto unreadDto = this.unread;
            int hashCode2 = (hashCode + (unreadDto == null ? 0 : unreadDto.hashCode())) * 31;
            Integer num = this.id;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.fromId;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num2 = this.date;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.key;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.button;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.name;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<AppsRequestFromItemDto> list = this.from;
            int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.trackCode;
            return hashCode9 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsRequestItemDto(type=");
            sb.append(this.type);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", unread=");
            sb.append(this.unread);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", fromId=");
            sb.append(this.fromId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", from=");
            sb.append(this.from);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeInt(this.appId);
            parcel.writeString(this.text);
            UnreadDto unreadDto = this.unread;
            if (unreadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                unreadDto.writeToParcel(parcel, i);
            }
            Integer num = this.id;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Long l = this.fromId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
            Integer num2 = this.date;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeString(this.key);
            parcel.writeString(this.button);
            parcel.writeString(this.name);
            List<AppsRequestFromItemDto> list = this.from;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((AppsRequestFromItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
        }

        public AppsRequestItemDto(String str, int i, String str2, UnreadDto unreadDto, Integer num, Long l, Integer num2, String str3, String str4, String str5, List<AppsRequestFromItemDto> list, String str6) {
            super(null);
            this.type = str;
            this.appId = i;
            this.text = str2;
            this.unread = unreadDto;
            this.id = num;
            this.fromId = l;
            this.date = num2;
            this.key = str3;
            this.button = str4;
            this.name = str5;
            this.from = list;
            this.trackCode = str6;
        }
    }

    /* compiled from: AppsCatalogGamesFeedItemDto.kt */
    public static final class Deserializer implements a9y<AppsCatalogGamesFeedItemDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1655966961) {
                    if (hashCode != 595233003) {
                        if (hashCode == 1095692943 && f.equals("request")) {
                            return (AppsCatalogGamesFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsRequestItemDto.class);
                        }
                    } else if (f.equals("notification")) {
                        return (AppsCatalogGamesFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsNotificationDto.class);
                    }
                } else if (f.equals("activity")) {
                    return (AppsCatalogGamesFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsActivityItemDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AppsCatalogGamesFeedItemDto(zcl zclVar) {
        this();
    }

    private AppsCatalogGamesFeedItemDto() {
    }
}

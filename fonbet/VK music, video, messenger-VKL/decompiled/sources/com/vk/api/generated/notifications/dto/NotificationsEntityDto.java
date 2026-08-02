package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsEntityDto implements Parcelable {

    /* compiled from: NotificationsEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsEntityDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -405568764:
                        if (f.equals("podcast")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPodcastDto.class);
                        }
                        break;
                    case 96801:
                        if (f.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityAppDto.class);
                        }
                        break;
                    case 3322092:
                        if (f.equals("live")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityLiveDto.class);
                        }
                        break;
                    case 3446719:
                        if (f.equals("poll")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPollDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPostDto.class);
                        }
                        break;
                    case 3599307:
                        if (f.equals("user")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityUserDto.class);
                        }
                        break;
                    case 98629247:
                        if (f.equals("group")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityGroupDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPhotoDto.class);
                        }
                        break;
                    case 109770997:
                        if (f.equals("story")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityStoryDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityVideoDto.class);
                        }
                        break;
                    case 285140278:
                        if (f.equals("market_item")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityMarketItemDto.class);
                        }
                        break;
                    case 950398559:
                        if (f.equals("comment")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityCommentDto.class);
                        }
                        break;
                    case 954925063:
                        if (f.equals("message")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityMessageDto.class);
                        }
                        break;
                    case 1302572792:
                        if (f.equals("short_video")) {
                            return (NotificationsEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityShortVideoDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityAppDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityAppDto> CREATOR = new a();

        @pmi0("app_id")
        private final int appId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
            public static final TypeDto APP;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                APP = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityAppDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityAppDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityAppDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityAppDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityAppDto[] newArray(int i) {
                return new NotificationsEntityAppDto[i];
            }
        }

        public NotificationsEntityAppDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.appId = i;
            this.url = str;
        }

        public final int d() {
            return this.appId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityAppDto)) {
                return false;
            }
            NotificationsEntityAppDto notificationsEntityAppDto = (NotificationsEntityAppDto) obj;
            return this.type == notificationsEntityAppDto.type && epx.f(this.ownerId, notificationsEntityAppDto.ownerId) && this.appId == notificationsEntityAppDto.appId && epx.f(this.url, notificationsEntityAppDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.appId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityAppDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.appId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityCommentDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityCommentDto> CREATOR = new a();

        @pmi0("comment_id")
        private final int commentId;

        @pmi0("entity")
        private final NotificationsEntityCommentEntityDto entity;

        @pmi0(CrashHianalyticsData.THREAD_ID)
        private final Integer threadId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("comment")
            public static final TypeDto COMMENT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("COMMENT", 0, "comment");
                COMMENT = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityCommentDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityCommentDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityCommentDto(TypeDto.CREATOR.createFromParcel(parcel), (NotificationsEntityCommentEntityDto) parcel.readParcelable(NotificationsEntityCommentDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityCommentDto[] newArray(int i) {
                return new NotificationsEntityCommentDto[i];
            }
        }

        public /* synthetic */ NotificationsEntityCommentDto(TypeDto typeDto, NotificationsEntityCommentEntityDto notificationsEntityCommentEntityDto, int i, String str, Integer num, int i2, zcl zclVar) {
            this(typeDto, notificationsEntityCommentEntityDto, i, str, (i2 & 16) != 0 ? null : num);
        }

        public final int d() {
            return this.commentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NotificationsEntityCommentEntityDto e() {
            return this.entity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityCommentDto)) {
                return false;
            }
            NotificationsEntityCommentDto notificationsEntityCommentDto = (NotificationsEntityCommentDto) obj;
            return this.type == notificationsEntityCommentDto.type && epx.f(this.entity, notificationsEntityCommentDto.entity) && this.commentId == notificationsEntityCommentDto.commentId && epx.f(this.url, notificationsEntityCommentDto.url) && epx.f(this.threadId, notificationsEntityCommentDto.threadId);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.commentId, (this.entity.hashCode() + (this.type.hashCode() * 31)) * 31, 31), 31, this.url);
            Integer num = this.threadId;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityCommentDto(type=");
            sb.append(this.type);
            sb.append(", entity=");
            sb.append(this.entity);
            sb.append(", commentId=");
            sb.append(this.commentId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", threadId=");
            return uqi.b(sb, this.threadId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.entity, i);
            parcel.writeInt(this.commentId);
            parcel.writeString(this.url);
            Integer num = this.threadId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public NotificationsEntityCommentDto(TypeDto typeDto, NotificationsEntityCommentEntityDto notificationsEntityCommentEntityDto, int i, String str, Integer num) {
            super(null);
            this.type = typeDto;
            this.entity = notificationsEntityCommentEntityDto;
            this.commentId = i;
            this.url = str;
            this.threadId = num;
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityGroupDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityGroupDto> CREATOR = new a();

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("group")
            public static final TypeDto GROUP;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("GROUP", 0, "group");
                GROUP = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityGroupDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityGroupDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityGroupDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityGroupDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityGroupDto[] newArray(int i) {
                return new NotificationsEntityGroupDto[i];
            }
        }

        public NotificationsEntityGroupDto(TypeDto typeDto, UserId userId, String str) {
            super(null);
            this.type = typeDto;
            this.groupId = userId;
            this.url = str;
        }

        public final UserId d() {
            return this.groupId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityGroupDto)) {
                return false;
            }
            NotificationsEntityGroupDto notificationsEntityGroupDto = (NotificationsEntityGroupDto) obj;
            return this.type == notificationsEntityGroupDto.type && epx.f(this.groupId, notificationsEntityGroupDto.groupId) && epx.f(this.url, notificationsEntityGroupDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + bh10.a(this.type.hashCode() * 31, 31, this.groupId.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityGroupDto(type=");
            sb.append(this.type);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.groupId, i);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityLiveDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityLiveDto> CREATOR = new a();

        @pmi0("live_id")
        private final int liveId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("live")
            public static final TypeDto LIVE;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("LIVE", 0, "live");
                LIVE = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityLiveDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityLiveDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityLiveDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityLiveDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityLiveDto[] newArray(int i) {
                return new NotificationsEntityLiveDto[i];
            }
        }

        public NotificationsEntityLiveDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.liveId = i;
            this.url = str;
        }

        public final int d() {
            return this.liveId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityLiveDto)) {
                return false;
            }
            NotificationsEntityLiveDto notificationsEntityLiveDto = (NotificationsEntityLiveDto) obj;
            return this.type == notificationsEntityLiveDto.type && epx.f(this.ownerId, notificationsEntityLiveDto.ownerId) && this.liveId == notificationsEntityLiveDto.liveId && epx.f(this.url, notificationsEntityLiveDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.liveId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityLiveDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", liveId=");
            sb.append(this.liveId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.liveId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityMarketItemDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityMarketItemDto> CREATOR = new a();

        @pmi0("market_item_id")
        private final int marketItemId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("market_item")
            public static final TypeDto MARKET_ITEM;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityMarketItemDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityMarketItemDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityMarketItemDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityMarketItemDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityMarketItemDto[] newArray(int i) {
                return new NotificationsEntityMarketItemDto[i];
            }
        }

        public NotificationsEntityMarketItemDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.marketItemId = i;
            this.url = str;
        }

        public final int d() {
            return this.marketItemId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityMarketItemDto)) {
                return false;
            }
            NotificationsEntityMarketItemDto notificationsEntityMarketItemDto = (NotificationsEntityMarketItemDto) obj;
            return this.type == notificationsEntityMarketItemDto.type && epx.f(this.ownerId, notificationsEntityMarketItemDto.ownerId) && this.marketItemId == notificationsEntityMarketItemDto.marketItemId && epx.f(this.url, notificationsEntityMarketItemDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.marketItemId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityMarketItemDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", marketItemId=");
            sb.append(this.marketItemId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.marketItemId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityMessageDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityMessageDto> CREATOR = new a();

        @pmi0("conversation_message_id")
        private final int conversationMessageId;

        @pmi0("message_id")
        private final int messageId;

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("message")
            public static final TypeDto MESSAGE;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("MESSAGE", 0, "message");
                MESSAGE = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityMessageDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityMessageDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityMessageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityMessageDto[] newArray(int i) {
                return new NotificationsEntityMessageDto[i];
            }
        }

        public NotificationsEntityMessageDto(TypeDto typeDto, long j, int i, int i2, String str) {
            super(null);
            this.type = typeDto;
            this.peerId = j;
            this.conversationMessageId = i;
            this.messageId = i2;
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityMessageDto)) {
                return false;
            }
            NotificationsEntityMessageDto notificationsEntityMessageDto = (NotificationsEntityMessageDto) obj;
            return this.type == notificationsEntityMessageDto.type && this.peerId == notificationsEntityMessageDto.peerId && this.conversationMessageId == notificationsEntityMessageDto.conversationMessageId && this.messageId == notificationsEntityMessageDto.messageId && epx.f(this.url, notificationsEntityMessageDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.messageId, shy.a(this.conversationMessageId, bh10.a(this.type.hashCode() * 31, 31, this.peerId), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityMessageDto(type=");
            sb.append(this.type);
            sb.append(", peerId=");
            sb.append(this.peerId);
            sb.append(", conversationMessageId=");
            sb.append(this.conversationMessageId);
            sb.append(", messageId=");
            sb.append(this.messageId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeLong(this.peerId);
            parcel.writeInt(this.conversationMessageId);
            parcel.writeInt(this.messageId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityPhotoDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityPhotoDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("photo_id")
        private final int photoId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("view_mode")
        private final ViewModeDto viewMode;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("photo")
            public static final TypeDto PHOTO;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("PHOTO", 0, "photo");
                PHOTO = typeDto;
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class ViewModeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ViewModeDto[] $VALUES;
            public static final Parcelable.Creator<ViewModeDto> CREATOR;

            @pmi0("real_tags")
            public static final ViewModeDto REAL_TAGS;

            @pmi0("recognition_tags")
            public static final ViewModeDto RECOGNITION_TAGS;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
            public static final class a implements Parcelable.Creator<ViewModeDto> {
                @Override // android.os.Parcelable.Creator
                public final ViewModeDto createFromParcel(Parcel parcel) {
                    return ViewModeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ViewModeDto[] newArray(int i) {
                    return new ViewModeDto[i];
                }
            }

            static {
                ViewModeDto viewModeDto = new ViewModeDto("REAL_TAGS", 0, "real_tags");
                REAL_TAGS = viewModeDto;
                ViewModeDto viewModeDto2 = new ViewModeDto("RECOGNITION_TAGS", 1, "recognition_tags");
                RECOGNITION_TAGS = viewModeDto2;
                ViewModeDto[] viewModeDtoArr = {viewModeDto, viewModeDto2};
                $VALUES = viewModeDtoArr;
                $ENTRIES = new asp(viewModeDtoArr);
                CREATOR = new a();
            }

            private ViewModeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ViewModeDto valueOf(String str) {
                return (ViewModeDto) Enum.valueOf(ViewModeDto.class, str);
            }

            public static ViewModeDto[] values() {
                return (ViewModeDto[]) $VALUES.clone();
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityPhotoDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPhotoDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityPhotoDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityPhotoDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ViewModeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPhotoDto[] newArray(int i) {
                return new NotificationsEntityPhotoDto[i];
            }
        }

        public /* synthetic */ NotificationsEntityPhotoDto(TypeDto typeDto, UserId userId, int i, String str, ViewModeDto viewModeDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : viewModeDto);
        }

        public final int d() {
            return this.photoId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityPhotoDto)) {
                return false;
            }
            NotificationsEntityPhotoDto notificationsEntityPhotoDto = (NotificationsEntityPhotoDto) obj;
            return this.type == notificationsEntityPhotoDto.type && epx.f(this.ownerId, notificationsEntityPhotoDto.ownerId) && this.photoId == notificationsEntityPhotoDto.photoId && epx.f(this.url, notificationsEntityPhotoDto.url) && this.viewMode == notificationsEntityPhotoDto.viewMode;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.photoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            ViewModeDto viewModeDto = this.viewMode;
            return a2 + (viewModeDto == null ? 0 : viewModeDto.hashCode());
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            return "NotificationsEntityPhotoDto(type=" + this.type + ", ownerId=" + this.ownerId + ", photoId=" + this.photoId + ", url=" + this.url + ", viewMode=" + this.viewMode + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.photoId);
            parcel.writeString(this.url);
            ViewModeDto viewModeDto = this.viewMode;
            if (viewModeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                viewModeDto.writeToParcel(parcel, i);
            }
        }

        public NotificationsEntityPhotoDto(TypeDto typeDto, UserId userId, int i, String str, ViewModeDto viewModeDto) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.photoId = i;
            this.url = str;
            this.viewMode = viewModeDto;
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityPodcastDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityPodcastDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("podcast_id")
        private final int podcastId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("podcast")
            public static final TypeDto PODCAST;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("PODCAST", 0, "podcast");
                PODCAST = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityPodcastDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPodcastDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityPodcastDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityPodcastDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPodcastDto[] newArray(int i) {
                return new NotificationsEntityPodcastDto[i];
            }
        }

        public NotificationsEntityPodcastDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.podcastId = i;
            this.url = str;
        }

        public final int d() {
            return this.podcastId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityPodcastDto)) {
                return false;
            }
            NotificationsEntityPodcastDto notificationsEntityPodcastDto = (NotificationsEntityPodcastDto) obj;
            return this.type == notificationsEntityPodcastDto.type && epx.f(this.ownerId, notificationsEntityPodcastDto.ownerId) && this.podcastId == notificationsEntityPodcastDto.podcastId && epx.f(this.url, notificationsEntityPodcastDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.podcastId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityPodcastDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", podcastId=");
            sb.append(this.podcastId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.podcastId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityPollDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityPollDto> CREATOR = new a();

        @pmi0("entity")
        private final NotificationsEntityPollEntityDto entity;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("poll_id")
        private final int pollId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("poll")
            public static final TypeDto POLL;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("POLL", 0, "poll");
                POLL = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityPollDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPollDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityPollDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityPollDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), (NotificationsEntityPollEntityDto) parcel.readParcelable(NotificationsEntityPollDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPollDto[] newArray(int i) {
                return new NotificationsEntityPollDto[i];
            }
        }

        public /* synthetic */ NotificationsEntityPollDto(TypeDto typeDto, UserId userId, int i, String str, NotificationsEntityPollEntityDto notificationsEntityPollEntityDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : notificationsEntityPollEntityDto);
        }

        public final int d() {
            return this.pollId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityPollDto)) {
                return false;
            }
            NotificationsEntityPollDto notificationsEntityPollDto = (NotificationsEntityPollDto) obj;
            return this.type == notificationsEntityPollDto.type && epx.f(this.ownerId, notificationsEntityPollDto.ownerId) && this.pollId == notificationsEntityPollDto.pollId && epx.f(this.url, notificationsEntityPollDto.url) && epx.f(this.entity, notificationsEntityPollDto.entity);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.pollId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            NotificationsEntityPollEntityDto notificationsEntityPollEntityDto = this.entity;
            return a2 + (notificationsEntityPollEntityDto == null ? 0 : notificationsEntityPollEntityDto.hashCode());
        }

        public final String toString() {
            return "NotificationsEntityPollDto(type=" + this.type + ", ownerId=" + this.ownerId + ", pollId=" + this.pollId + ", url=" + this.url + ", entity=" + this.entity + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.pollId);
            parcel.writeString(this.url);
            parcel.writeParcelable(this.entity, i);
        }

        public NotificationsEntityPollDto(TypeDto typeDto, UserId userId, int i, String str, NotificationsEntityPollEntityDto notificationsEntityPollEntityDto) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.pollId = i;
            this.url = str;
            this.entity = notificationsEntityPollEntityDto;
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityPostDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityPostDto> CREATOR = new a();

        @pmi0("attachments_string")
        private final String attachmentsString;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("post_id")
        private final int postId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post")
            public static final TypeDto POST;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityPostDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPostDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityPostDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityPostDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityPostDto[] newArray(int i) {
                return new NotificationsEntityPostDto[i];
            }
        }

        public /* synthetic */ NotificationsEntityPostDto(TypeDto typeDto, UserId userId, int i, String str, String str2, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : str2);
        }

        public final String d() {
            return this.attachmentsString;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.postId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityPostDto)) {
                return false;
            }
            NotificationsEntityPostDto notificationsEntityPostDto = (NotificationsEntityPostDto) obj;
            return this.type == notificationsEntityPostDto.type && epx.f(this.ownerId, notificationsEntityPostDto.ownerId) && this.postId == notificationsEntityPostDto.postId && epx.f(this.url, notificationsEntityPostDto.url) && epx.f(this.attachmentsString, notificationsEntityPostDto.attachmentsString);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.postId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            String str = this.attachmentsString;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityPostDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", attachmentsString=");
            return ho8.a(sb, this.attachmentsString, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.postId);
            parcel.writeString(this.url);
            parcel.writeString(this.attachmentsString);
        }

        public NotificationsEntityPostDto(TypeDto typeDto, UserId userId, int i, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.postId = i;
            this.url = str;
            this.attachmentsString = str2;
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityShortVideoDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityShortVideoDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("short_video_id")
        private final int shortVideoId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video")
            public static final TypeDto SHORT_VIDEO;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO", 0, "short_video");
                SHORT_VIDEO = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityShortVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityShortVideoDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityShortVideoDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityShortVideoDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityShortVideoDto[] newArray(int i) {
                return new NotificationsEntityShortVideoDto[i];
            }
        }

        public NotificationsEntityShortVideoDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.shortVideoId = i;
            this.url = str;
        }

        public final int d() {
            return this.shortVideoId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityShortVideoDto)) {
                return false;
            }
            NotificationsEntityShortVideoDto notificationsEntityShortVideoDto = (NotificationsEntityShortVideoDto) obj;
            return this.type == notificationsEntityShortVideoDto.type && epx.f(this.ownerId, notificationsEntityShortVideoDto.ownerId) && this.shortVideoId == notificationsEntityShortVideoDto.shortVideoId && epx.f(this.url, notificationsEntityShortVideoDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.shortVideoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityShortVideoDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", shortVideoId=");
            sb.append(this.shortVideoId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.shortVideoId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityStoryDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityStoryDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("story_id")
        private final int storyId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("story")
            public static final TypeDto STORY;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("STORY", 0, "story");
                STORY = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityStoryDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityStoryDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityStoryDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityStoryDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityStoryDto[] newArray(int i) {
                return new NotificationsEntityStoryDto[i];
            }
        }

        public NotificationsEntityStoryDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.storyId = i;
            this.url = str;
        }

        public final int d() {
            return this.storyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityStoryDto)) {
                return false;
            }
            NotificationsEntityStoryDto notificationsEntityStoryDto = (NotificationsEntityStoryDto) obj;
            return this.type == notificationsEntityStoryDto.type && epx.f(this.ownerId, notificationsEntityStoryDto.ownerId) && this.storyId == notificationsEntityStoryDto.storyId && epx.f(this.url, notificationsEntityStoryDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.storyId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityStoryDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.storyId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityUserDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityUserDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("user_id")
        private final UserId userId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user")
            public static final TypeDto USER;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("USER", 0, "user");
                USER = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityUserDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityUserDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityUserDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityUserDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityUserDto[] newArray(int i) {
                return new NotificationsEntityUserDto[i];
            }
        }

        public NotificationsEntityUserDto(TypeDto typeDto, UserId userId, String str) {
            super(null);
            this.type = typeDto;
            this.userId = userId;
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityUserDto)) {
                return false;
            }
            NotificationsEntityUserDto notificationsEntityUserDto = (NotificationsEntityUserDto) obj;
            return this.type == notificationsEntityUserDto.type && epx.f(this.userId, notificationsEntityUserDto.userId) && epx.f(this.url, notificationsEntityUserDto.url);
        }

        public final UserId getUserId() {
            return this.userId;
        }

        public final int hashCode() {
            return this.url.hashCode() + bh10.a(this.type.hashCode() * 31, 31, this.userId.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityUserDto(type=");
            sb.append(this.type);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.userId, i);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityDto.kt */
    public static final class NotificationsEntityVideoDto extends NotificationsEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityVideoDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("playlist")
        private final NotificationsEntityVideoPlaylistDto playlist;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("video_id")
        private final int videoId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("video")
            public static final TypeDto VIDEO;
            private final String value;

            /* compiled from: NotificationsEntityDto.kt */
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
                TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
                VIDEO = typeDto;
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

        /* compiled from: NotificationsEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityVideoDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityVideoDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityVideoDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : NotificationsEntityVideoPlaylistDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityVideoDto[] newArray(int i) {
                return new NotificationsEntityVideoDto[i];
            }
        }

        public /* synthetic */ NotificationsEntityVideoDto(TypeDto typeDto, UserId userId, int i, String str, NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : notificationsEntityVideoPlaylistDto);
        }

        public final int d() {
            return this.videoId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsEntityVideoDto)) {
                return false;
            }
            NotificationsEntityVideoDto notificationsEntityVideoDto = (NotificationsEntityVideoDto) obj;
            return this.type == notificationsEntityVideoDto.type && epx.f(this.ownerId, notificationsEntityVideoDto.ownerId) && this.videoId == notificationsEntityVideoDto.videoId && epx.f(this.url, notificationsEntityVideoDto.url) && epx.f(this.playlist, notificationsEntityVideoDto.playlist);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.videoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto = this.playlist;
            return a2 + (notificationsEntityVideoPlaylistDto == null ? 0 : notificationsEntityVideoPlaylistDto.hashCode());
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String toString() {
            return "NotificationsEntityVideoDto(type=" + this.type + ", ownerId=" + this.ownerId + ", videoId=" + this.videoId + ", url=" + this.url + ", playlist=" + this.playlist + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.videoId);
            parcel.writeString(this.url);
            NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto = this.playlist;
            if (notificationsEntityVideoPlaylistDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                notificationsEntityVideoPlaylistDto.writeToParcel(parcel, i);
            }
        }

        public NotificationsEntityVideoDto(TypeDto typeDto, UserId userId, int i, String str, NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.videoId = i;
            this.url = str;
            this.playlist = notificationsEntityVideoPlaylistDto;
        }
    }

    public /* synthetic */ NotificationsEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsEntityDto() {
    }
}

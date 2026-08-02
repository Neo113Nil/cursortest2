package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.X3;
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

/* compiled from: NotificationsActualFriendEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsActualFriendEntityDto implements Parcelable {

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsActualFriendEntityDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case 3322092:
                        if (f.equals("live")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityLiveDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityPhotoDto.class);
                        }
                        break;
                    case 109770997:
                        if (f.equals("story")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityStoryDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityVideoDto.class);
                        }
                        break;
                    case 929678202:
                        if (f.equals("new_divider")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityNewDividerDto.class);
                        }
                        break;
                    case 950398559:
                        if (f.equals("comment")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityCommentDto.class);
                        }
                        break;
                    case 1302572792:
                        if (f.equals("short_video")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityShortVideoDto.class);
                        }
                        break;
                    case 1955820421:
                        if (f.equals("post_media")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityPostMediaDto.class);
                        }
                        break;
                    case 2002962796:
                        if (f.equals("post_text")) {
                            return (NotificationsActualFriendEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActualFriendEntityPostTextDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityCommentDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityCommentDto> CREATOR = new a();

        @pmi0("comment_id")
        private final int commentId;

        @pmi0("entity")
        private final NotificationsEntityCommentEntityDto entity;

        @pmi0("post_author_id")
        private final UserId postAuthorId;

        @pmi0("post_author_name")
        private final String postAuthorName;

        @pmi0(CrashHianalyticsData.THREAD_ID)
        private final Integer threadId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("comment")
            public static final TypeDto COMMENT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityCommentDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityCommentDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityCommentDto(TypeDto.CREATOR.createFromParcel(parcel), (NotificationsEntityCommentEntityDto) parcel.readParcelable(NotificationsActualFriendEntityCommentDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(NotificationsActualFriendEntityCommentDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityCommentDto[] newArray(int i) {
                return new NotificationsActualFriendEntityCommentDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityCommentDto(TypeDto typeDto, NotificationsEntityCommentEntityDto notificationsEntityCommentEntityDto, int i, String str, UserId userId, String str2, Integer num, String str3, int i2, zcl zclVar) {
            this(typeDto, notificationsEntityCommentEntityDto, i, str, userId, str2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityCommentDto)) {
                return false;
            }
            NotificationsActualFriendEntityCommentDto notificationsActualFriendEntityCommentDto = (NotificationsActualFriendEntityCommentDto) obj;
            return this.type == notificationsActualFriendEntityCommentDto.type && epx.f(this.entity, notificationsActualFriendEntityCommentDto.entity) && this.commentId == notificationsActualFriendEntityCommentDto.commentId && epx.f(this.postAuthorName, notificationsActualFriendEntityCommentDto.postAuthorName) && epx.f(this.postAuthorId, notificationsActualFriendEntityCommentDto.postAuthorId) && epx.f(this.url, notificationsActualFriendEntityCommentDto.url) && epx.f(this.threadId, notificationsActualFriendEntityCommentDto.threadId) && epx.f(this.ungroupQuery, notificationsActualFriendEntityCommentDto.ungroupQuery);
        }

        public final int hashCode() {
            int a2 = urd0.a(bh10.a(urd0.a(shy.a(this.commentId, (this.entity.hashCode() + (this.type.hashCode() * 31)) * 31, 31), 31, this.postAuthorName), 31, this.postAuthorId.b), 31, this.url);
            Integer num = this.threadId;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityCommentDto(type=");
            sb.append(this.type);
            sb.append(", entity=");
            sb.append(this.entity);
            sb.append(", commentId=");
            sb.append(this.commentId);
            sb.append(", postAuthorName=");
            sb.append(this.postAuthorName);
            sb.append(", postAuthorId=");
            sb.append(this.postAuthorId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", threadId=");
            sb.append(this.threadId);
            sb.append(", ungroupQuery=");
            return ho8.a(sb, this.ungroupQuery, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.entity, i);
            parcel.writeInt(this.commentId);
            parcel.writeString(this.postAuthorName);
            parcel.writeParcelable(this.postAuthorId, i);
            parcel.writeString(this.url);
            Integer num = this.threadId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
        }

        public NotificationsActualFriendEntityCommentDto(TypeDto typeDto, NotificationsEntityCommentEntityDto notificationsEntityCommentEntityDto, int i, String str, UserId userId, String str2, Integer num, String str3) {
            super(null);
            this.type = typeDto;
            this.entity = notificationsEntityCommentEntityDto;
            this.commentId = i;
            this.postAuthorName = str;
            this.postAuthorId = userId;
            this.url = str2;
            this.threadId = num;
            this.ungroupQuery = str3;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityLiveDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityLiveDto> CREATOR = new a();

        @pmi0("counter")
        private final Integer counter;

        @pmi0("live_id")
        private final int liveId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("live")
            public static final TypeDto LIVE;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityLiveDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityLiveDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityLiveDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityLiveDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityLiveDto[] newArray(int i) {
                return new NotificationsActualFriendEntityLiveDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityLiveDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityLiveDto)) {
                return false;
            }
            NotificationsActualFriendEntityLiveDto notificationsActualFriendEntityLiveDto = (NotificationsActualFriendEntityLiveDto) obj;
            return this.type == notificationsActualFriendEntityLiveDto.type && epx.f(this.ownerId, notificationsActualFriendEntityLiveDto.ownerId) && this.liveId == notificationsActualFriendEntityLiveDto.liveId && epx.f(this.url, notificationsActualFriendEntityLiveDto.url) && epx.f(this.counter, notificationsActualFriendEntityLiveDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityLiveDto.ungroupQuery);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.liveId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityLiveDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", liveId=");
            sb.append(this.liveId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", ungroupQuery=");
            return ho8.a(sb, this.ungroupQuery, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.liveId);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
        }

        public NotificationsActualFriendEntityLiveDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.liveId = i;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityNewDividerDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityNewDividerDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("new_divider")
            public static final TypeDto NEW_DIVIDER;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("NEW_DIVIDER", 0, "new_divider");
                NEW_DIVIDER = typeDto;
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityNewDividerDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityNewDividerDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityNewDividerDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityNewDividerDto[] newArray(int i) {
                return new NotificationsActualFriendEntityNewDividerDto[i];
            }
        }

        public NotificationsActualFriendEntityNewDividerDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationsActualFriendEntityNewDividerDto) && this.type == ((NotificationsActualFriendEntityNewDividerDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "NotificationsActualFriendEntityNewDividerDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityPhotoDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityPhotoDto> CREATOR = new a();

        @pmi0("album_id")
        private final Integer albumId;

        @pmi0("counter")
        private final Integer counter;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("photo_id")
        private final int photoId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        @pmi0("view_mode")
        private final ViewModeDto viewMode;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("photo")
            public static final TypeDto PHOTO;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class ViewModeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ViewModeDto[] $VALUES;

            @pmi0("album")
            public static final ViewModeDto ALBUM;
            public static final Parcelable.Creator<ViewModeDto> CREATOR;

            @pmi0("real_tags")
            public static final ViewModeDto REAL_TAGS;

            @pmi0("recognition_tags")
            public static final ViewModeDto RECOGNITION_TAGS;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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
                ViewModeDto viewModeDto3 = new ViewModeDto("ALBUM", 2, "album");
                ALBUM = viewModeDto3;
                ViewModeDto[] viewModeDtoArr = {viewModeDto, viewModeDto2, viewModeDto3};
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityPhotoDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPhotoDto createFromParcel(Parcel parcel) {
                Integer valueOf;
                ViewModeDto viewModeDto;
                ViewModeDto viewModeDto2;
                Integer valueOf2;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(NotificationsActualFriendEntityPhotoDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    viewModeDto = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    viewModeDto = null;
                }
                String readString2 = parcel.readString();
                ViewModeDto createFromParcel2 = parcel.readInt() == 0 ? viewModeDto : ViewModeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf2 = viewModeDto;
                    viewModeDto2 = createFromParcel2;
                } else {
                    viewModeDto2 = createFromParcel2;
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new NotificationsActualFriendEntityPhotoDto(createFromParcel, userId, readInt, readString, valueOf, readString2, viewModeDto2, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPhotoDto[] newArray(int i) {
                return new NotificationsActualFriendEntityPhotoDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityPhotoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, ViewModeDto viewModeDto, Integer num2, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : viewModeDto, (i2 & 128) != 0 ? null : num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityPhotoDto)) {
                return false;
            }
            NotificationsActualFriendEntityPhotoDto notificationsActualFriendEntityPhotoDto = (NotificationsActualFriendEntityPhotoDto) obj;
            return this.type == notificationsActualFriendEntityPhotoDto.type && epx.f(this.ownerId, notificationsActualFriendEntityPhotoDto.ownerId) && this.photoId == notificationsActualFriendEntityPhotoDto.photoId && epx.f(this.url, notificationsActualFriendEntityPhotoDto.url) && epx.f(this.counter, notificationsActualFriendEntityPhotoDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityPhotoDto.ungroupQuery) && this.viewMode == notificationsActualFriendEntityPhotoDto.viewMode && epx.f(this.albumId, notificationsActualFriendEntityPhotoDto.albumId);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.photoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ViewModeDto viewModeDto = this.viewMode;
            int hashCode3 = (hashCode2 + (viewModeDto == null ? 0 : viewModeDto.hashCode())) * 31;
            Integer num2 = this.albumId;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityPhotoDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", photoId=");
            sb.append(this.photoId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", ungroupQuery=");
            sb.append(this.ungroupQuery);
            sb.append(", viewMode=");
            sb.append(this.viewMode);
            sb.append(", albumId=");
            return uqi.b(sb, this.albumId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.photoId);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
            ViewModeDto viewModeDto = this.viewMode;
            if (viewModeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                viewModeDto.writeToParcel(parcel, i);
            }
            Integer num2 = this.albumId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }

        public NotificationsActualFriendEntityPhotoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, ViewModeDto viewModeDto, Integer num2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.photoId = i;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
            this.viewMode = viewModeDto;
            this.albumId = num2;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityPostMediaDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityPostMediaDto> CREATOR = new a();

        @pmi0("counter")
        private final Integer counter;

        @pmi0(X3.i.I0)
        private final NotificationsActualFriendEntityPostMediaTypeDto media;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("post_id")
        private final int postId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post_media")
            public static final TypeDto POST_MEDIA;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("POST_MEDIA", 0, "post_media");
                POST_MEDIA = typeDto;
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityPostMediaDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPostMediaDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityPostMediaDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityPostMediaDto.class.getClassLoader()), parcel.readInt(), NotificationsActualFriendEntityPostMediaTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPostMediaDto[] newArray(int i) {
                return new NotificationsActualFriendEntityPostMediaDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityPostMediaDto(TypeDto typeDto, UserId userId, int i, NotificationsActualFriendEntityPostMediaTypeDto notificationsActualFriendEntityPostMediaTypeDto, String str, Integer num, String str2, int i2, zcl zclVar) {
            this(typeDto, userId, i, notificationsActualFriendEntityPostMediaTypeDto, str, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityPostMediaDto)) {
                return false;
            }
            NotificationsActualFriendEntityPostMediaDto notificationsActualFriendEntityPostMediaDto = (NotificationsActualFriendEntityPostMediaDto) obj;
            return this.type == notificationsActualFriendEntityPostMediaDto.type && epx.f(this.ownerId, notificationsActualFriendEntityPostMediaDto.ownerId) && this.postId == notificationsActualFriendEntityPostMediaDto.postId && epx.f(this.media, notificationsActualFriendEntityPostMediaDto.media) && epx.f(this.url, notificationsActualFriendEntityPostMediaDto.url) && epx.f(this.counter, notificationsActualFriendEntityPostMediaDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityPostMediaDto.ungroupQuery);
        }

        public final int hashCode() {
            int a2 = urd0.a((this.media.hashCode() + shy.a(this.postId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31)) * 31, 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityPostMediaDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", media=");
            sb.append(this.media);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", ungroupQuery=");
            return ho8.a(sb, this.ungroupQuery, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.postId);
            this.media.writeToParcel(parcel, i);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
        }

        public NotificationsActualFriendEntityPostMediaDto(TypeDto typeDto, UserId userId, int i, NotificationsActualFriendEntityPostMediaTypeDto notificationsActualFriendEntityPostMediaTypeDto, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.postId = i;
            this.media = notificationsActualFriendEntityPostMediaTypeDto;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityPostTextDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityPostTextDto> CREATOR = new a();

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
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post_text")
            public static final TypeDto POST_TEXT;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("POST_TEXT", 0, "post_text");
                POST_TEXT = typeDto;
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityPostTextDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPostTextDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityPostTextDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityPostTextDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityPostTextDto[] newArray(int i) {
                return new NotificationsActualFriendEntityPostTextDto[i];
            }
        }

        public NotificationsActualFriendEntityPostTextDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.postId = i;
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
            if (!(obj instanceof NotificationsActualFriendEntityPostTextDto)) {
                return false;
            }
            NotificationsActualFriendEntityPostTextDto notificationsActualFriendEntityPostTextDto = (NotificationsActualFriendEntityPostTextDto) obj;
            return this.type == notificationsActualFriendEntityPostTextDto.type && epx.f(this.ownerId, notificationsActualFriendEntityPostTextDto.ownerId) && this.postId == notificationsActualFriendEntityPostTextDto.postId && epx.f(this.url, notificationsActualFriendEntityPostTextDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.postId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityPostTextDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.postId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityShortVideoDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityShortVideoDto> CREATOR = new a();

        @pmi0("counter")
        private final Integer counter;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("short_video_id")
        private final int shortVideoId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video")
            public static final TypeDto SHORT_VIDEO;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityShortVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityShortVideoDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityShortVideoDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityShortVideoDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityShortVideoDto[] newArray(int i) {
                return new NotificationsActualFriendEntityShortVideoDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityShortVideoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityShortVideoDto)) {
                return false;
            }
            NotificationsActualFriendEntityShortVideoDto notificationsActualFriendEntityShortVideoDto = (NotificationsActualFriendEntityShortVideoDto) obj;
            return this.type == notificationsActualFriendEntityShortVideoDto.type && epx.f(this.ownerId, notificationsActualFriendEntityShortVideoDto.ownerId) && this.shortVideoId == notificationsActualFriendEntityShortVideoDto.shortVideoId && epx.f(this.url, notificationsActualFriendEntityShortVideoDto.url) && epx.f(this.counter, notificationsActualFriendEntityShortVideoDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityShortVideoDto.ungroupQuery);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.shortVideoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityShortVideoDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", shortVideoId=");
            sb.append(this.shortVideoId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", ungroupQuery=");
            return ho8.a(sb, this.ungroupQuery, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.shortVideoId);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
        }

        public NotificationsActualFriendEntityShortVideoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.shortVideoId = i;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityStoryDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityStoryDto> CREATOR = new a();

        @pmi0("counter")
        private final Integer counter;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("story_id")
        private final int storyId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("story")
            public static final TypeDto STORY;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityStoryDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityStoryDto createFromParcel(Parcel parcel) {
                return new NotificationsActualFriendEntityStoryDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityStoryDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityStoryDto[] newArray(int i) {
                return new NotificationsActualFriendEntityStoryDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityStoryDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityStoryDto)) {
                return false;
            }
            NotificationsActualFriendEntityStoryDto notificationsActualFriendEntityStoryDto = (NotificationsActualFriendEntityStoryDto) obj;
            return this.type == notificationsActualFriendEntityStoryDto.type && epx.f(this.ownerId, notificationsActualFriendEntityStoryDto.ownerId) && this.storyId == notificationsActualFriendEntityStoryDto.storyId && epx.f(this.url, notificationsActualFriendEntityStoryDto.url) && epx.f(this.counter, notificationsActualFriendEntityStoryDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityStoryDto.ungroupQuery);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.storyId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityStoryDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", ungroupQuery=");
            return ho8.a(sb, this.ungroupQuery, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.storyId);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
        }

        public NotificationsActualFriendEntityStoryDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.storyId = i;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
        }
    }

    /* compiled from: NotificationsActualFriendEntityDto.kt */
    public static final class NotificationsActualFriendEntityVideoDto extends NotificationsActualFriendEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActualFriendEntityVideoDto> CREATOR = new a();

        @pmi0("counter")
        private final Integer counter;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("playlist")
        private final NotificationsEntityVideoPlaylistDto playlist;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("ungroup_query")
        private final String ungroupQuery;

        @pmi0("url")
        private final String url;

        @pmi0("video_id")
        private final int videoId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("video")
            public static final TypeDto VIDEO;
            private final String value;

            /* compiled from: NotificationsActualFriendEntityDto.kt */
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

        /* compiled from: NotificationsActualFriendEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityVideoDto createFromParcel(Parcel parcel) {
                Integer valueOf;
                NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(NotificationsActualFriendEntityVideoDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    notificationsEntityVideoPlaylistDto = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    notificationsEntityVideoPlaylistDto = null;
                }
                return new NotificationsActualFriendEntityVideoDto(createFromParcel, userId, readInt, readString, valueOf, parcel.readString(), parcel.readInt() == 0 ? notificationsEntityVideoPlaylistDto : NotificationsEntityVideoPlaylistDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActualFriendEntityVideoDto[] newArray(int i) {
                return new NotificationsActualFriendEntityVideoDto[i];
            }
        }

        public /* synthetic */ NotificationsActualFriendEntityVideoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : notificationsEntityVideoPlaylistDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActualFriendEntityVideoDto)) {
                return false;
            }
            NotificationsActualFriendEntityVideoDto notificationsActualFriendEntityVideoDto = (NotificationsActualFriendEntityVideoDto) obj;
            return this.type == notificationsActualFriendEntityVideoDto.type && epx.f(this.ownerId, notificationsActualFriendEntityVideoDto.ownerId) && this.videoId == notificationsActualFriendEntityVideoDto.videoId && epx.f(this.url, notificationsActualFriendEntityVideoDto.url) && epx.f(this.counter, notificationsActualFriendEntityVideoDto.counter) && epx.f(this.ungroupQuery, notificationsActualFriendEntityVideoDto.ungroupQuery) && epx.f(this.playlist, notificationsActualFriendEntityVideoDto.playlist);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.videoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.url);
            Integer num = this.counter;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.ungroupQuery;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto = this.playlist;
            return hashCode2 + (notificationsEntityVideoPlaylistDto != null ? notificationsEntityVideoPlaylistDto.hashCode() : 0);
        }

        public final String toString() {
            return "NotificationsActualFriendEntityVideoDto(type=" + this.type + ", ownerId=" + this.ownerId + ", videoId=" + this.videoId + ", url=" + this.url + ", counter=" + this.counter + ", ungroupQuery=" + this.ungroupQuery + ", playlist=" + this.playlist + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.videoId);
            parcel.writeString(this.url);
            Integer num = this.counter;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.ungroupQuery);
            NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto = this.playlist;
            if (notificationsEntityVideoPlaylistDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                notificationsEntityVideoPlaylistDto.writeToParcel(parcel, i);
            }
        }

        public NotificationsActualFriendEntityVideoDto(TypeDto typeDto, UserId userId, int i, String str, Integer num, String str2, NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.videoId = i;
            this.url = str;
            this.counter = num;
            this.ungroupQuery = str2;
            this.playlist = notificationsEntityVideoPlaylistDto;
        }
    }

    public /* synthetic */ NotificationsActualFriendEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsActualFriendEntityDto() {
    }
}

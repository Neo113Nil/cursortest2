package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.vk.dto.common.id.UserId;
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

/* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto implements Parcelable {

    /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "post")) {
                return (NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPostDto.class);
            }
            if (epx.f(f, "comment")) {
                return (NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityCommentDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
    public static final class NotificationsEntityCommentDto extends NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto implements Parcelable {
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
        /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("comment")
            public static final TypeDto COMMENT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
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

        /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

    /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
    public static final class NotificationsEntityPostDto extends NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto implements Parcelable {
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
        /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post")
            public static final TypeDto POST;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
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

        /* compiled from: NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.kt */
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

    public /* synthetic */ NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto() {
    }
}

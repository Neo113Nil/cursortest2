package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
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

/* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationAttachmentBubbleEntityDto implements Parcelable {

    /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationAttachmentBubbleEntityDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "comment")) {
                return (NotificationsNotificationAttachmentBubbleEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityCommentDto.class);
            }
            if (epx.f(f, "message")) {
                return (NotificationsNotificationAttachmentBubbleEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityMessageDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
    public static final class NotificationsEntityCommentDto extends NotificationsNotificationAttachmentBubbleEntityDto implements Parcelable {
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
        /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("comment")
            public static final TypeDto COMMENT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
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

        /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
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

    /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
    public static final class NotificationsEntityMessageDto extends NotificationsNotificationAttachmentBubbleEntityDto implements Parcelable {
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
        /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("message")
            public static final TypeDto MESSAGE;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
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

        /* compiled from: NotificationsNotificationAttachmentBubbleEntityDto.kt */
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

    public /* synthetic */ NotificationsNotificationAttachmentBubbleEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationAttachmentBubbleEntityDto() {
    }
}

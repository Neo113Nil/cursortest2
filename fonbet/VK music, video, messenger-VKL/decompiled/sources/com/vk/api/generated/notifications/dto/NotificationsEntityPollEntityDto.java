package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsEntityPollEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsEntityPollEntityDto implements Parcelable {

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsEntityPollEntityDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -732377866:
                        if (f.equals("article")) {
                            return (NotificationsEntityPollEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityArticleDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NotificationsEntityPollEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPostDto.class);
                        }
                        break;
                    case 109770997:
                        if (f.equals("story")) {
                            return (NotificationsEntityPollEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityStoryDto.class);
                        }
                        break;
                    case 110546223:
                        if (f.equals("topic")) {
                            return (NotificationsEntityPollEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityTopicDto.class);
                        }
                        break;
                    case 954925063:
                        if (f.equals("message")) {
                            return (NotificationsEntityPollEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityMessageDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class NotificationsEntityArticleDto extends NotificationsEntityPollEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityArticleDto> CREATOR = new a();

        @pmi0("article_id")
        private final int articleId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("article")
            public static final TypeDto ARTICLE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsEntityPollEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("ARTICLE", 0, "article");
                ARTICLE = typeDto;
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

        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityArticleDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityArticleDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityArticleDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityArticleDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityArticleDto[] newArray(int i) {
                return new NotificationsEntityArticleDto[i];
            }
        }

        public NotificationsEntityArticleDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.articleId = i;
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
            if (!(obj instanceof NotificationsEntityArticleDto)) {
                return false;
            }
            NotificationsEntityArticleDto notificationsEntityArticleDto = (NotificationsEntityArticleDto) obj;
            return this.type == notificationsEntityArticleDto.type && epx.f(this.ownerId, notificationsEntityArticleDto.ownerId) && this.articleId == notificationsEntityArticleDto.articleId && epx.f(this.url, notificationsEntityArticleDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.articleId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityArticleDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", articleId=");
            sb.append(this.articleId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.articleId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class NotificationsEntityMessageDto extends NotificationsEntityPollEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("message")
            public static final TypeDto MESSAGE;
            private final String value;

            /* compiled from: NotificationsEntityPollEntityDto.kt */
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

        /* compiled from: NotificationsEntityPollEntityDto.kt */
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

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class NotificationsEntityPostDto extends NotificationsEntityPollEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post")
            public static final TypeDto POST;
            private final String value;

            /* compiled from: NotificationsEntityPollEntityDto.kt */
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

        /* compiled from: NotificationsEntityPollEntityDto.kt */
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

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class NotificationsEntityStoryDto extends NotificationsEntityPollEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("story")
            public static final TypeDto STORY;
            private final String value;

            /* compiled from: NotificationsEntityPollEntityDto.kt */
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

        /* compiled from: NotificationsEntityPollEntityDto.kt */
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

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.storyId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
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

    /* compiled from: NotificationsEntityPollEntityDto.kt */
    public static final class NotificationsEntityTopicDto extends NotificationsEntityPollEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityTopicDto> CREATOR = new a();

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("topic_id")
        private final int topicId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("topic")
            public static final TypeDto TOPIC;
            private final String value;

            /* compiled from: NotificationsEntityPollEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("TOPIC", 0, "topic");
                TOPIC = typeDto;
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

        /* compiled from: NotificationsEntityPollEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityTopicDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityTopicDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityTopicDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityTopicDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityTopicDto[] newArray(int i) {
                return new NotificationsEntityTopicDto[i];
            }
        }

        public NotificationsEntityTopicDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.topicId = i;
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
            if (!(obj instanceof NotificationsEntityTopicDto)) {
                return false;
            }
            NotificationsEntityTopicDto notificationsEntityTopicDto = (NotificationsEntityTopicDto) obj;
            return this.type == notificationsEntityTopicDto.type && epx.f(this.ownerId, notificationsEntityTopicDto.ownerId) && this.topicId == notificationsEntityTopicDto.topicId && epx.f(this.url, notificationsEntityTopicDto.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.topicId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityTopicDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", topicId=");
            sb.append(this.topicId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.topicId);
            parcel.writeString(this.url);
        }
    }

    public /* synthetic */ NotificationsEntityPollEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsEntityPollEntityDto() {
    }
}

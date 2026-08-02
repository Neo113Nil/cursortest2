package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
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

/* compiled from: NotificationsEntityCommentEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsEntityCommentEntityDto implements Parcelable {

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class Deserializer implements a9y<NotificationsEntityCommentEntityDto> {
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
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityLiveDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPostDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityPhotoDto.class);
                        }
                        break;
                    case 109770997:
                        if (f.equals("story")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityStoryDto.class);
                        }
                        break;
                    case 110546223:
                        if (f.equals("topic")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityTopicDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityVideoDto.class);
                        }
                        break;
                    case 285140278:
                        if (f.equals("market_item")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityMarketItemDto.class);
                        }
                        break;
                    case 1292512424:
                        if (f.equals("bugreport")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityBugreportDto.class);
                        }
                        break;
                    case 1302572792:
                        if (f.equals("short_video")) {
                            return (NotificationsEntityCommentEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsEntityShortVideoDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityBugreportDto extends NotificationsEntityCommentEntityDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsEntityBugreportDto> CREATOR = new a();

        @pmi0("bugreport_id")
        private final int bugreportId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("bugreport")
            public static final TypeDto BUGREPORT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("BUGREPORT", 0, "bugreport");
                BUGREPORT = typeDto;
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsEntityBugreportDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityBugreportDto createFromParcel(Parcel parcel) {
                return new NotificationsEntityBugreportDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityBugreportDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsEntityBugreportDto[] newArray(int i) {
                return new NotificationsEntityBugreportDto[i];
            }
        }

        public NotificationsEntityBugreportDto(TypeDto typeDto, UserId userId, int i, String str) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.bugreportId = i;
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
            if (!(obj instanceof NotificationsEntityBugreportDto)) {
                return false;
            }
            NotificationsEntityBugreportDto notificationsEntityBugreportDto = (NotificationsEntityBugreportDto) obj;
            return this.type == notificationsEntityBugreportDto.type && epx.f(this.ownerId, notificationsEntityBugreportDto.ownerId) && this.bugreportId == notificationsEntityBugreportDto.bugreportId && epx.f(this.url, notificationsEntityBugreportDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.bugreportId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsEntityBugreportDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", bugreportId=");
            sb.append(this.bugreportId);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.bugreportId);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityLiveDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("live")
            public static final TypeDto LIVE;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityMarketItemDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("market_item")
            public static final TypeDto MARKET_ITEM;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + shy.a(this.marketItemId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityPhotoDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("photo")
            public static final TypeDto PHOTO;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class ViewModeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ViewModeDto[] $VALUES;
            public static final Parcelable.Creator<ViewModeDto> CREATOR;

            @pmi0("real_tags")
            public static final ViewModeDto REAL_TAGS;

            @pmi0("recognition_tags")
            public static final ViewModeDto RECOGNITION_TAGS;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityPostDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("post")
            public static final TypeDto POST;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        public final int d() {
            return this.postId;
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityShortVideoDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video")
            public static final TypeDto SHORT_VIDEO;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityStoryDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("story")
            public static final TypeDto STORY;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        public final String getUrl() {
            return this.url;
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityTopicDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("topic")
            public static final TypeDto TOPIC;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        public final String getUrl() {
            return this.url;
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

    /* compiled from: NotificationsEntityCommentEntityDto.kt */
    public static final class NotificationsEntityVideoDto extends NotificationsEntityCommentEntityDto implements Parcelable {
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
        /* compiled from: NotificationsEntityCommentEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("video")
            public static final TypeDto VIDEO;
            private final String value;

            /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

        /* compiled from: NotificationsEntityCommentEntityDto.kt */
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

    public /* synthetic */ NotificationsEntityCommentEntityDto(zcl zclVar) {
        this();
    }

    private NotificationsEntityCommentEntityDto() {
    }
}

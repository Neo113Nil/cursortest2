package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsActionDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsActionDto implements Parcelable {

    /* compiled from: NotificationsActionDto.kt */
    public static final class Deserializer implements a9y<NotificationsActionDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -288415866:
                        if (f.equals("ungroup")) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionUngroupDto.class);
                        }
                        break;
                    case -219988557:
                        if (f.equals("open_group_notifications")) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionOpenGroupNotificationsDto.class);
                        }
                        break;
                    case 966916451:
                        if (f.equals(CallEventualStatName.API_CALL)) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionApiCallDto.class);
                        }
                        break;
                    case 1281664473:
                        if (f.equals("entity_show")) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionEntityShowDto.class);
                        }
                        break;
                    case 1833868028:
                        if (f.equals("open_group_category_notifications")) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionOpenGroupCategoryNotificationsDto.class);
                        }
                        break;
                    case 2028829590:
                        if (f.equals("link_follow")) {
                            return (NotificationsActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsActionLinkFollowDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionApiCallDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionApiCallDto> CREATOR = new a();

        @pmi0("confirm")
        private final NotificationsActionApiCallConfirmDto confirm;

        @pmi0("query")
        private final String query;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(CallEventualStatName.API_CALL)
            public static final TypeDto API_CALL;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("API_CALL", 0, CallEventualStatName.API_CALL);
                API_CALL = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionApiCallDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionApiCallDto createFromParcel(Parcel parcel) {
                return new NotificationsActionApiCallDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : NotificationsActionApiCallConfirmDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionApiCallDto[] newArray(int i) {
                return new NotificationsActionApiCallDto[i];
            }
        }

        public /* synthetic */ NotificationsActionApiCallDto(TypeDto typeDto, String str, NotificationsActionApiCallConfirmDto notificationsActionApiCallConfirmDto, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : notificationsActionApiCallConfirmDto);
        }

        public final NotificationsActionApiCallConfirmDto d() {
            return this.confirm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActionApiCallDto)) {
                return false;
            }
            NotificationsActionApiCallDto notificationsActionApiCallDto = (NotificationsActionApiCallDto) obj;
            return this.type == notificationsActionApiCallDto.type && epx.f(this.query, notificationsActionApiCallDto.query) && epx.f(this.confirm, notificationsActionApiCallDto.confirm);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.query);
            NotificationsActionApiCallConfirmDto notificationsActionApiCallConfirmDto = this.confirm;
            return a2 + (notificationsActionApiCallConfirmDto == null ? 0 : notificationsActionApiCallConfirmDto.hashCode());
        }

        public final String toString() {
            return "NotificationsActionApiCallDto(type=" + this.type + ", query=" + this.query + ", confirm=" + this.confirm + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.query);
            NotificationsActionApiCallConfirmDto notificationsActionApiCallConfirmDto = this.confirm;
            if (notificationsActionApiCallConfirmDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                notificationsActionApiCallConfirmDto.writeToParcel(parcel, i);
            }
        }

        public NotificationsActionApiCallDto(TypeDto typeDto, String str, NotificationsActionApiCallConfirmDto notificationsActionApiCallConfirmDto) {
            super(null);
            this.type = typeDto;
            this.query = str;
            this.confirm = notificationsActionApiCallConfirmDto;
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionEntityShowDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionEntityShowDto> CREATOR = new a();

        @pmi0("entity")
        private final NotificationsEntityDto entity;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("entity_show")
            public static final TypeDto ENTITY_SHOW;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("ENTITY_SHOW", 0, "entity_show");
                ENTITY_SHOW = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionEntityShowDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionEntityShowDto createFromParcel(Parcel parcel) {
                return new NotificationsActionEntityShowDto(TypeDto.CREATOR.createFromParcel(parcel), (NotificationsEntityDto) parcel.readParcelable(NotificationsActionEntityShowDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionEntityShowDto[] newArray(int i) {
                return new NotificationsActionEntityShowDto[i];
            }
        }

        public NotificationsActionEntityShowDto(TypeDto typeDto, NotificationsEntityDto notificationsEntityDto) {
            super(null);
            this.type = typeDto;
            this.entity = notificationsEntityDto;
        }

        public final NotificationsEntityDto d() {
            return this.entity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActionEntityShowDto)) {
                return false;
            }
            NotificationsActionEntityShowDto notificationsActionEntityShowDto = (NotificationsActionEntityShowDto) obj;
            return this.type == notificationsActionEntityShowDto.type && epx.f(this.entity, notificationsActionEntityShowDto.entity);
        }

        public final int hashCode() {
            return this.entity.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationsActionEntityShowDto(type=" + this.type + ", entity=" + this.entity + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.entity, i);
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionLinkFollowDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionLinkFollowDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("link_follow")
            public static final TypeDto LINK_FOLLOW;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("LINK_FOLLOW", 0, "link_follow");
                LINK_FOLLOW = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionLinkFollowDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionLinkFollowDto createFromParcel(Parcel parcel) {
                return new NotificationsActionLinkFollowDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionLinkFollowDto[] newArray(int i) {
                return new NotificationsActionLinkFollowDto[i];
            }
        }

        public NotificationsActionLinkFollowDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
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
            if (!(obj instanceof NotificationsActionLinkFollowDto)) {
                return false;
            }
            NotificationsActionLinkFollowDto notificationsActionLinkFollowDto = (NotificationsActionLinkFollowDto) obj;
            return this.type == notificationsActionLinkFollowDto.type && epx.f(this.url, notificationsActionLinkFollowDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActionLinkFollowDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionOpenGroupCategoryNotificationsDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionOpenGroupCategoryNotificationsDto> CREATOR = new a();

        @pmi0("category_name")
        private final String categoryName;

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("query")
        private final String query;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_group_category_notifications")
            public static final TypeDto OPEN_GROUP_CATEGORY_NOTIFICATIONS;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_GROUP_CATEGORY_NOTIFICATIONS", 0, "open_group_category_notifications");
                OPEN_GROUP_CATEGORY_NOTIFICATIONS = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionOpenGroupCategoryNotificationsDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionOpenGroupCategoryNotificationsDto createFromParcel(Parcel parcel) {
                return new NotificationsActionOpenGroupCategoryNotificationsDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActionOpenGroupCategoryNotificationsDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionOpenGroupCategoryNotificationsDto[] newArray(int i) {
                return new NotificationsActionOpenGroupCategoryNotificationsDto[i];
            }
        }

        public /* synthetic */ NotificationsActionOpenGroupCategoryNotificationsDto(TypeDto typeDto, UserId userId, String str, String str2, String str3, int i, zcl zclVar) {
            this(typeDto, userId, str, str2, (i & 16) != 0 ? null : str3);
        }

        public final String d() {
            return this.categoryName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final UserId e() {
            return this.groupId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActionOpenGroupCategoryNotificationsDto)) {
                return false;
            }
            NotificationsActionOpenGroupCategoryNotificationsDto notificationsActionOpenGroupCategoryNotificationsDto = (NotificationsActionOpenGroupCategoryNotificationsDto) obj;
            return this.type == notificationsActionOpenGroupCategoryNotificationsDto.type && epx.f(this.groupId, notificationsActionOpenGroupCategoryNotificationsDto.groupId) && epx.f(this.title, notificationsActionOpenGroupCategoryNotificationsDto.title) && epx.f(this.categoryName, notificationsActionOpenGroupCategoryNotificationsDto.categoryName) && epx.f(this.query, notificationsActionOpenGroupCategoryNotificationsDto.query);
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(bh10.a(this.type.hashCode() * 31, 31, this.groupId.b), 31, this.title), 31, this.categoryName);
            String str = this.query;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActionOpenGroupCategoryNotificationsDto(type=");
            sb.append(this.type);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", categoryName=");
            sb.append(this.categoryName);
            sb.append(", query=");
            return ho8.a(sb, this.query, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.groupId, i);
            parcel.writeString(this.title);
            parcel.writeString(this.categoryName);
            parcel.writeString(this.query);
        }

        public NotificationsActionOpenGroupCategoryNotificationsDto(TypeDto typeDto, UserId userId, String str, String str2, String str3) {
            super(null);
            this.type = typeDto;
            this.groupId = userId;
            this.title = str;
            this.categoryName = str2;
            this.query = str3;
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionOpenGroupNotificationsDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionOpenGroupNotificationsDto> CREATOR = new a();

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("query")
        private final String query;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_group_notifications")
            public static final TypeDto OPEN_GROUP_NOTIFICATIONS;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_GROUP_NOTIFICATIONS", 0, "open_group_notifications");
                OPEN_GROUP_NOTIFICATIONS = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionOpenGroupNotificationsDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionOpenGroupNotificationsDto createFromParcel(Parcel parcel) {
                return new NotificationsActionOpenGroupNotificationsDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActionOpenGroupNotificationsDto.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionOpenGroupNotificationsDto[] newArray(int i) {
                return new NotificationsActionOpenGroupNotificationsDto[i];
            }
        }

        public /* synthetic */ NotificationsActionOpenGroupNotificationsDto(TypeDto typeDto, UserId userId, String str, String str2, int i, zcl zclVar) {
            this(typeDto, userId, str, (i & 8) != 0 ? null : str2);
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
            if (!(obj instanceof NotificationsActionOpenGroupNotificationsDto)) {
                return false;
            }
            NotificationsActionOpenGroupNotificationsDto notificationsActionOpenGroupNotificationsDto = (NotificationsActionOpenGroupNotificationsDto) obj;
            return this.type == notificationsActionOpenGroupNotificationsDto.type && epx.f(this.groupId, notificationsActionOpenGroupNotificationsDto.groupId) && epx.f(this.title, notificationsActionOpenGroupNotificationsDto.title) && epx.f(this.query, notificationsActionOpenGroupNotificationsDto.query);
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(bh10.a(this.type.hashCode() * 31, 31, this.groupId.b), 31, this.title);
            String str = this.query;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActionOpenGroupNotificationsDto(type=");
            sb.append(this.type);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", query=");
            return ho8.a(sb, this.query, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.groupId, i);
            parcel.writeString(this.title);
            parcel.writeString(this.query);
        }

        public NotificationsActionOpenGroupNotificationsDto(TypeDto typeDto, UserId userId, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.groupId = userId;
            this.title = str;
            this.query = str2;
        }
    }

    /* compiled from: NotificationsActionDto.kt */
    public static final class NotificationsActionUngroupDto extends NotificationsActionDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsActionUngroupDto> CREATOR = new a();

        @pmi0("query")
        private final String query;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("ungroup")
            public static final TypeDto UNGROUP;
            private final String value;

            /* compiled from: NotificationsActionDto.kt */
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
                TypeDto typeDto = new TypeDto("UNGROUP", 0, "ungroup");
                UNGROUP = typeDto;
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

        /* compiled from: NotificationsActionDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsActionUngroupDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsActionUngroupDto createFromParcel(Parcel parcel) {
                return new NotificationsActionUngroupDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsActionUngroupDto[] newArray(int i) {
                return new NotificationsActionUngroupDto[i];
            }
        }

        public NotificationsActionUngroupDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.query = str;
        }

        public final String d() {
            return this.query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsActionUngroupDto)) {
                return false;
            }
            NotificationsActionUngroupDto notificationsActionUngroupDto = (NotificationsActionUngroupDto) obj;
            return this.type == notificationsActionUngroupDto.type && epx.f(this.query, notificationsActionUngroupDto.query);
        }

        public final int hashCode() {
            return this.query.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsActionUngroupDto(type=");
            sb.append(this.type);
            sb.append(", query=");
            return ho8.a(sb, this.query, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.query);
        }
    }

    public /* synthetic */ NotificationsActionDto(zcl zclVar) {
        this();
    }

    private NotificationsActionDto() {
    }
}

package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.gp;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationDotsMenuItemDto implements Parcelable {

    /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationDotsMenuItemDto> {
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
                    case -1822101157:
                        if (f.equals("open_setting")) {
                            return (NotificationsNotificationDotsMenuItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationDotsMenuItemOpenSettingDto.class);
                        }
                        break;
                    case 583281361:
                        if (f.equals("unsubscribe")) {
                            return (NotificationsNotificationDotsMenuItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationDotsMenuItemUnsubscribeDto.class);
                        }
                        break;
                    case 640037064:
                        if (f.equals("hide_notification")) {
                            return (NotificationsNotificationDotsMenuItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationDotsMenuItemHideNotificationDto.class);
                        }
                        break;
                    case 1919849773:
                        if (f.equals("delete_content_item")) {
                            return (NotificationsNotificationDotsMenuItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationDotsMenuItemDeleteContentItemDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
    public static final class NotificationsNotificationDotsMenuItemDeleteContentItemDto extends NotificationsNotificationDotsMenuItemDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationDotsMenuItemDeleteContentItemDto> CREATOR = new a();

        @pmi0("entity")
        private final NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto entity;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("delete_content_item")
            public static final TypeDto DELETE_CONTENT_ITEM;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
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
                TypeDto typeDto = new TypeDto("DELETE_CONTENT_ITEM", 0, "delete_content_item");
                DELETE_CONTENT_ITEM = typeDto;
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

        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationDotsMenuItemDeleteContentItemDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemDeleteContentItemDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationDotsMenuItemDeleteContentItemDto(TypeDto.CREATOR.createFromParcel(parcel), (NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto) parcel.readParcelable(NotificationsNotificationDotsMenuItemDeleteContentItemDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemDeleteContentItemDto[] newArray(int i) {
                return new NotificationsNotificationDotsMenuItemDeleteContentItemDto[i];
            }
        }

        public NotificationsNotificationDotsMenuItemDeleteContentItemDto(TypeDto typeDto, NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto notificationsNotificationDotsMenuItemDeleteContentItemEntityDto) {
            super(null);
            this.type = typeDto;
            this.entity = notificationsNotificationDotsMenuItemDeleteContentItemEntityDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationDotsMenuItemDeleteContentItemDto)) {
                return false;
            }
            NotificationsNotificationDotsMenuItemDeleteContentItemDto notificationsNotificationDotsMenuItemDeleteContentItemDto = (NotificationsNotificationDotsMenuItemDeleteContentItemDto) obj;
            return this.type == notificationsNotificationDotsMenuItemDeleteContentItemDto.type && epx.f(this.entity, notificationsNotificationDotsMenuItemDeleteContentItemDto.entity);
        }

        public final int hashCode() {
            return this.entity.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationsNotificationDotsMenuItemDeleteContentItemDto(type=" + this.type + ", entity=" + this.entity + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.entity, i);
        }
    }

    /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
    public static final class NotificationsNotificationDotsMenuItemHideNotificationDto extends NotificationsNotificationDotsMenuItemDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationDotsMenuItemHideNotificationDto> CREATOR = new a();

        @pmi0("query")
        private final String query;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("hide_notification")
            public static final TypeDto HIDE_NOTIFICATION;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
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
                TypeDto typeDto = new TypeDto("HIDE_NOTIFICATION", 0, "hide_notification");
                HIDE_NOTIFICATION = typeDto;
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

        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationDotsMenuItemHideNotificationDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemHideNotificationDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationDotsMenuItemHideNotificationDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemHideNotificationDto[] newArray(int i) {
                return new NotificationsNotificationDotsMenuItemHideNotificationDto[i];
            }
        }

        public NotificationsNotificationDotsMenuItemHideNotificationDto(TypeDto typeDto, String str) {
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
            if (!(obj instanceof NotificationsNotificationDotsMenuItemHideNotificationDto)) {
                return false;
            }
            NotificationsNotificationDotsMenuItemHideNotificationDto notificationsNotificationDotsMenuItemHideNotificationDto = (NotificationsNotificationDotsMenuItemHideNotificationDto) obj;
            return this.type == notificationsNotificationDotsMenuItemHideNotificationDto.type && epx.f(this.query, notificationsNotificationDotsMenuItemHideNotificationDto.query);
        }

        public final int hashCode() {
            return this.query.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationDotsMenuItemHideNotificationDto(type=");
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

    /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
    public static final class NotificationsNotificationDotsMenuItemOpenSettingDto extends NotificationsNotificationDotsMenuItemDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationDotsMenuItemOpenSettingDto> CREATOR = new a();

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("name")
        private final String name;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_setting")
            public static final TypeDto OPEN_SETTING;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_SETTING", 0, "open_setting");
                OPEN_SETTING = typeDto;
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

        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationDotsMenuItemOpenSettingDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemOpenSettingDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationDotsMenuItemOpenSettingDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), (UserId) parcel.readParcelable(NotificationsNotificationDotsMenuItemOpenSettingDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemOpenSettingDto[] newArray(int i) {
                return new NotificationsNotificationDotsMenuItemOpenSettingDto[i];
            }
        }

        public /* synthetic */ NotificationsNotificationDotsMenuItemOpenSettingDto(TypeDto typeDto, String str, UserId userId, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : userId);
        }

        public final UserId d() {
            return this.groupId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationDotsMenuItemOpenSettingDto)) {
                return false;
            }
            NotificationsNotificationDotsMenuItemOpenSettingDto notificationsNotificationDotsMenuItemOpenSettingDto = (NotificationsNotificationDotsMenuItemOpenSettingDto) obj;
            return this.type == notificationsNotificationDotsMenuItemOpenSettingDto.type && epx.f(this.name, notificationsNotificationDotsMenuItemOpenSettingDto.name) && epx.f(this.groupId, notificationsNotificationDotsMenuItemOpenSettingDto.groupId);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.name);
            UserId userId = this.groupId;
            return a2 + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationDotsMenuItemOpenSettingDto(type=");
            sb.append(this.type);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", groupId=");
            return gp.b(sb, this.groupId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.groupId, i);
        }

        public NotificationsNotificationDotsMenuItemOpenSettingDto(TypeDto typeDto, String str, UserId userId) {
            super(null);
            this.type = typeDto;
            this.name = str;
            this.groupId = userId;
        }
    }

    /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
    public static final class NotificationsNotificationDotsMenuItemUnsubscribeDto extends NotificationsNotificationDotsMenuItemDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationDotsMenuItemUnsubscribeDto> CREATOR = new a();

        @pmi0("name")
        private final String name;

        @pmi0("query")
        private final String query;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("unsubscribe")
            public static final TypeDto UNSUBSCRIBE;
            private final String value;

            /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
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
                TypeDto typeDto = new TypeDto("UNSUBSCRIBE", 0, "unsubscribe");
                UNSUBSCRIBE = typeDto;
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

        /* compiled from: NotificationsNotificationDotsMenuItemDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationDotsMenuItemUnsubscribeDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemUnsubscribeDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationDotsMenuItemUnsubscribeDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationDotsMenuItemUnsubscribeDto[] newArray(int i) {
                return new NotificationsNotificationDotsMenuItemUnsubscribeDto[i];
            }
        }

        public /* synthetic */ NotificationsNotificationDotsMenuItemUnsubscribeDto(TypeDto typeDto, String str, String str2, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : str2);
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
            if (!(obj instanceof NotificationsNotificationDotsMenuItemUnsubscribeDto)) {
                return false;
            }
            NotificationsNotificationDotsMenuItemUnsubscribeDto notificationsNotificationDotsMenuItemUnsubscribeDto = (NotificationsNotificationDotsMenuItemUnsubscribeDto) obj;
            return this.type == notificationsNotificationDotsMenuItemUnsubscribeDto.type && epx.f(this.query, notificationsNotificationDotsMenuItemUnsubscribeDto.query) && epx.f(this.name, notificationsNotificationDotsMenuItemUnsubscribeDto.name);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.query);
            String str = this.name;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationDotsMenuItemUnsubscribeDto(type=");
            sb.append(this.type);
            sb.append(", query=");
            sb.append(this.query);
            sb.append(", name=");
            return ho8.a(sb, this.name, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.query);
            parcel.writeString(this.name);
        }

        public NotificationsNotificationDotsMenuItemUnsubscribeDto(TypeDto typeDto, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.query = str;
            this.name = str2;
        }
    }

    public /* synthetic */ NotificationsNotificationDotsMenuItemDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationDotsMenuItemDto() {
    }
}

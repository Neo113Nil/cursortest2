package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsNotificationImageDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationImageDto implements Parcelable {

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationImageDto> {
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
                    case -1490676719:
                        if (f.equals("single_owner_static")) {
                            return (NotificationsNotificationImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationImageSingleOwnerStaticDto.class);
                        }
                        break;
                    case -1359492551:
                        if (f.equals("mini_app")) {
                            return (NotificationsNotificationImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationImageMiniAppDto.class);
                        }
                        break;
                    case -892481938:
                        if (f.equals("static")) {
                            return (NotificationsNotificationImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationImageStaticDto.class);
                        }
                        break;
                    case 1385558213:
                        if (f.equals("double_owner")) {
                            return (NotificationsNotificationImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationImageDoubleOwnerDto.class);
                        }
                        break;
                    case 2146862076:
                        if (f.equals("single_owner")) {
                            return (NotificationsNotificationImageDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationImageSingleOwnerDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class NotificationsNotificationImageDoubleOwnerDto extends NotificationsNotificationImageDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationImageDoubleOwnerDto> CREATOR = new a();

        @pmi0("back")
        private final NotificationsOwnerDto back;

        @pmi0("front")
        private final NotificationsOwnerDto front;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("double_owner")
            public static final TypeDto DOUBLE_OWNER;
            private final String value;

            /* compiled from: NotificationsNotificationImageDto.kt */
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
                TypeDto typeDto = new TypeDto("DOUBLE_OWNER", 0, "double_owner");
                DOUBLE_OWNER = typeDto;
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

        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationImageDoubleOwnerDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageDoubleOwnerDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<NotificationsOwnerDto> creator = NotificationsOwnerDto.CREATOR;
                return new NotificationsNotificationImageDoubleOwnerDto(createFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageDoubleOwnerDto[] newArray(int i) {
                return new NotificationsNotificationImageDoubleOwnerDto[i];
            }
        }

        public NotificationsNotificationImageDoubleOwnerDto(TypeDto typeDto, NotificationsOwnerDto notificationsOwnerDto, NotificationsOwnerDto notificationsOwnerDto2) {
            super(null);
            this.type = typeDto;
            this.front = notificationsOwnerDto;
            this.back = notificationsOwnerDto2;
        }

        public final NotificationsOwnerDto d() {
            return this.back;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NotificationsOwnerDto e() {
            return this.front;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationImageDoubleOwnerDto)) {
                return false;
            }
            NotificationsNotificationImageDoubleOwnerDto notificationsNotificationImageDoubleOwnerDto = (NotificationsNotificationImageDoubleOwnerDto) obj;
            return this.type == notificationsNotificationImageDoubleOwnerDto.type && epx.f(this.front, notificationsNotificationImageDoubleOwnerDto.front) && epx.f(this.back, notificationsNotificationImageDoubleOwnerDto.back);
        }

        public final int hashCode() {
            return this.back.hashCode() + ((this.front.hashCode() + (this.type.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "NotificationsNotificationImageDoubleOwnerDto(type=" + this.type + ", front=" + this.front + ", back=" + this.back + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.front.writeToParcel(parcel, i);
            this.back.writeToParcel(parcel, i);
        }
    }

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class NotificationsNotificationImageMiniAppDto extends NotificationsNotificationImageDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationImageMiniAppDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("mini_app")
            public static final TypeDto MINI_APP;
            private final String value;

            /* compiled from: NotificationsNotificationImageDto.kt */
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
                TypeDto typeDto = new TypeDto("MINI_APP", 0, "mini_app");
                MINI_APP = typeDto;
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

        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationImageMiniAppDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageMiniAppDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationImageMiniAppDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageMiniAppDto[] newArray(int i) {
                return new NotificationsNotificationImageMiniAppDto[i];
            }
        }

        public NotificationsNotificationImageMiniAppDto(TypeDto typeDto, int i) {
            super(null);
            this.type = typeDto;
            this.id = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationImageMiniAppDto)) {
                return false;
            }
            NotificationsNotificationImageMiniAppDto notificationsNotificationImageMiniAppDto = (NotificationsNotificationImageMiniAppDto) obj;
            return this.type == notificationsNotificationImageMiniAppDto.type && this.id == notificationsNotificationImageMiniAppDto.id;
        }

        public final int getId() {
            return this.id;
        }

        public final int hashCode() {
            return Integer.hashCode(this.id) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationImageMiniAppDto(type=");
            sb.append(this.type);
            sb.append(", id=");
            return vu5.b(sb, this.id, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
        }
    }

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class NotificationsNotificationImageSingleOwnerDto extends NotificationsNotificationImageDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationImageSingleOwnerDto> CREATOR = new a();

        @pmi0("owner")
        private final NotificationsOwnerDto owner;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("single_owner")
            public static final TypeDto SINGLE_OWNER;
            private final String value;

            /* compiled from: NotificationsNotificationImageDto.kt */
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
                TypeDto typeDto = new TypeDto("SINGLE_OWNER", 0, "single_owner");
                SINGLE_OWNER = typeDto;
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

        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationImageSingleOwnerDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageSingleOwnerDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationImageSingleOwnerDto(TypeDto.CREATOR.createFromParcel(parcel), NotificationsOwnerDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageSingleOwnerDto[] newArray(int i) {
                return new NotificationsNotificationImageSingleOwnerDto[i];
            }
        }

        public NotificationsNotificationImageSingleOwnerDto(TypeDto typeDto, NotificationsOwnerDto notificationsOwnerDto) {
            super(null);
            this.type = typeDto;
            this.owner = notificationsOwnerDto;
        }

        public final NotificationsOwnerDto d() {
            return this.owner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationImageSingleOwnerDto)) {
                return false;
            }
            NotificationsNotificationImageSingleOwnerDto notificationsNotificationImageSingleOwnerDto = (NotificationsNotificationImageSingleOwnerDto) obj;
            return this.type == notificationsNotificationImageSingleOwnerDto.type && epx.f(this.owner, notificationsNotificationImageSingleOwnerDto.owner);
        }

        public final int hashCode() {
            return this.owner.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationsNotificationImageSingleOwnerDto(type=" + this.type + ", owner=" + this.owner + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.owner.writeToParcel(parcel, i);
        }
    }

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class NotificationsNotificationImageSingleOwnerStaticDto extends NotificationsNotificationImageDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationImageSingleOwnerStaticDto> CREATOR = new a();

        @pmi0("owner")
        private final NotificationsOwnerDto owner;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("single_owner_static")
            public static final TypeDto SINGLE_OWNER_STATIC;
            private final String value;

            /* compiled from: NotificationsNotificationImageDto.kt */
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
                TypeDto typeDto = new TypeDto("SINGLE_OWNER_STATIC", 0, "single_owner_static");
                SINGLE_OWNER_STATIC = typeDto;
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

        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationImageSingleOwnerStaticDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageSingleOwnerStaticDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationImageSingleOwnerStaticDto(TypeDto.CREATOR.createFromParcel(parcel), NotificationsOwnerDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageSingleOwnerStaticDto[] newArray(int i) {
                return new NotificationsNotificationImageSingleOwnerStaticDto[i];
            }
        }

        public NotificationsNotificationImageSingleOwnerStaticDto(TypeDto typeDto, NotificationsOwnerDto notificationsOwnerDto, String str) {
            super(null);
            this.type = typeDto;
            this.owner = notificationsOwnerDto;
            this.url = str;
        }

        public final NotificationsOwnerDto d() {
            return this.owner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationImageSingleOwnerStaticDto)) {
                return false;
            }
            NotificationsNotificationImageSingleOwnerStaticDto notificationsNotificationImageSingleOwnerStaticDto = (NotificationsNotificationImageSingleOwnerStaticDto) obj;
            return this.type == notificationsNotificationImageSingleOwnerStaticDto.type && epx.f(this.owner, notificationsNotificationImageSingleOwnerStaticDto.owner) && epx.f(this.url, notificationsNotificationImageSingleOwnerStaticDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + ((this.owner.hashCode() + (this.type.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationImageSingleOwnerStaticDto(type=");
            sb.append(this.type);
            sb.append(", owner=");
            sb.append(this.owner);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.owner.writeToParcel(parcel, i);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: NotificationsNotificationImageDto.kt */
    public static final class NotificationsNotificationImageStaticDto extends NotificationsNotificationImageDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationImageStaticDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("static")
            public static final TypeDto STATIC;
            private final String value;

            /* compiled from: NotificationsNotificationImageDto.kt */
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
                TypeDto typeDto = new TypeDto("STATIC", 0, "static");
                STATIC = typeDto;
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

        /* compiled from: NotificationsNotificationImageDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationImageStaticDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageStaticDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationImageStaticDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationImageStaticDto[] newArray(int i) {
                return new NotificationsNotificationImageStaticDto[i];
            }
        }

        public NotificationsNotificationImageStaticDto(TypeDto typeDto, String str) {
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
            if (!(obj instanceof NotificationsNotificationImageStaticDto)) {
                return false;
            }
            NotificationsNotificationImageStaticDto notificationsNotificationImageStaticDto = (NotificationsNotificationImageStaticDto) obj;
            return this.type == notificationsNotificationImageStaticDto.type && epx.f(this.url, notificationsNotificationImageStaticDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationImageStaticDto(type=");
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

    public /* synthetic */ NotificationsNotificationImageDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationImageDto() {
    }
}

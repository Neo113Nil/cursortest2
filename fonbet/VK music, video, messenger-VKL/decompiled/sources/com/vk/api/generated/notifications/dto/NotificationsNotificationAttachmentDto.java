package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsNotificationAttachmentDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationAttachmentDto implements Parcelable {

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationAttachmentDto> {
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
                    case -1378241396:
                        if (f.equals("bubble")) {
                            return (NotificationsNotificationAttachmentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationAttachmentBubbleDto.class);
                        }
                        break;
                    case 910557427:
                        if (f.equals("actual_friend_attachment")) {
                            return (NotificationsNotificationAttachmentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationActualFriendAttachmentDto.class);
                        }
                        break;
                    case 1060569853:
                        if (f.equals("entity_array")) {
                            return (NotificationsNotificationAttachmentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationAttachmentEntityArrayDto.class);
                        }
                        break;
                    case 1673515082:
                        if (f.equals("static_image")) {
                            return (NotificationsNotificationAttachmentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationAttachmentStaticImageDto.class);
                        }
                        break;
                    case 1934806292:
                        if (f.equals("user_stack")) {
                            return (NotificationsNotificationAttachmentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationAttachmentUserStackDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class NotificationsNotificationActualFriendAttachmentDto extends NotificationsNotificationAttachmentDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationActualFriendAttachmentDto> CREATOR = new a();

        @pmi0("items")
        private final List<NotificationsActualFriendEntityDto> items;

        @pmi0("show_more")
        private final Boolean showMore;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("actual_friend_attachment")
            public static final TypeDto ACTUAL_FRIEND_ATTACHMENT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentDto.kt */
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
                TypeDto typeDto = new TypeDto("ACTUAL_FRIEND_ATTACHMENT", 0, "actual_friend_attachment");
                ACTUAL_FRIEND_ATTACHMENT = typeDto;
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

        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationActualFriendAttachmentDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationActualFriendAttachmentDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NotificationsNotificationActualFriendAttachmentDto.class, parcel, arrayList, i, 1);
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NotificationsNotificationActualFriendAttachmentDto(createFromParcel, arrayList, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationActualFriendAttachmentDto[] newArray(int i) {
                return new NotificationsNotificationActualFriendAttachmentDto[i];
            }
        }

        public /* synthetic */ NotificationsNotificationActualFriendAttachmentDto(TypeDto typeDto, List list, Boolean bool, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : bool);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationActualFriendAttachmentDto)) {
                return false;
            }
            NotificationsNotificationActualFriendAttachmentDto notificationsNotificationActualFriendAttachmentDto = (NotificationsNotificationActualFriendAttachmentDto) obj;
            return this.type == notificationsNotificationActualFriendAttachmentDto.type && epx.f(this.items, notificationsNotificationActualFriendAttachmentDto.items) && epx.f(this.showMore, notificationsNotificationActualFriendAttachmentDto.showMore);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            Boolean bool = this.showMore;
            return a2 + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationActualFriendAttachmentDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", showMore=");
            return tn.a(sb, this.showMore, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Boolean bool = this.showMore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationsNotificationActualFriendAttachmentDto(TypeDto typeDto, List<? extends NotificationsActualFriendEntityDto> list, Boolean bool) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.showMore = bool;
        }
    }

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class NotificationsNotificationAttachmentBubbleDto extends NotificationsNotificationAttachmentDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationAttachmentBubbleDto> CREATOR = new a();

        @pmi0("additional_text")
        private final String additionalText;

        @pmi0("entity")
        private final NotificationsNotificationAttachmentBubbleEntityDto entity;

        @pmi0("main_text")
        private final String mainText;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("bubble")
            public static final TypeDto BUBBLE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentDto.kt */
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
                TypeDto typeDto = new TypeDto("BUBBLE", 0, "bubble");
                BUBBLE = typeDto;
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

        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationAttachmentBubbleDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentBubbleDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationAttachmentBubbleDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (NotificationsNotificationAttachmentBubbleEntityDto) parcel.readParcelable(NotificationsNotificationAttachmentBubbleDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentBubbleDto[] newArray(int i) {
                return new NotificationsNotificationAttachmentBubbleDto[i];
            }
        }

        public /* synthetic */ NotificationsNotificationAttachmentBubbleDto(TypeDto typeDto, String str, String str2, NotificationsNotificationAttachmentBubbleEntityDto notificationsNotificationAttachmentBubbleEntityDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : notificationsNotificationAttachmentBubbleEntityDto);
        }

        public final String d() {
            return this.additionalText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NotificationsNotificationAttachmentBubbleEntityDto e() {
            return this.entity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationAttachmentBubbleDto)) {
                return false;
            }
            NotificationsNotificationAttachmentBubbleDto notificationsNotificationAttachmentBubbleDto = (NotificationsNotificationAttachmentBubbleDto) obj;
            return this.type == notificationsNotificationAttachmentBubbleDto.type && epx.f(this.mainText, notificationsNotificationAttachmentBubbleDto.mainText) && epx.f(this.additionalText, notificationsNotificationAttachmentBubbleDto.additionalText) && epx.f(this.entity, notificationsNotificationAttachmentBubbleDto.entity);
        }

        public final String f() {
            return this.mainText;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.mainText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.additionalText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            NotificationsNotificationAttachmentBubbleEntityDto notificationsNotificationAttachmentBubbleEntityDto = this.entity;
            return hashCode3 + (notificationsNotificationAttachmentBubbleEntityDto != null ? notificationsNotificationAttachmentBubbleEntityDto.hashCode() : 0);
        }

        public final String toString() {
            return "NotificationsNotificationAttachmentBubbleDto(type=" + this.type + ", mainText=" + this.mainText + ", additionalText=" + this.additionalText + ", entity=" + this.entity + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.mainText);
            parcel.writeString(this.additionalText);
            parcel.writeParcelable(this.entity, i);
        }

        public NotificationsNotificationAttachmentBubbleDto(TypeDto typeDto, String str, String str2, NotificationsNotificationAttachmentBubbleEntityDto notificationsNotificationAttachmentBubbleEntityDto) {
            super(null);
            this.type = typeDto;
            this.mainText = str;
            this.additionalText = str2;
            this.entity = notificationsNotificationAttachmentBubbleEntityDto;
        }
    }

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class NotificationsNotificationAttachmentEntityArrayDto extends NotificationsNotificationAttachmentDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationAttachmentEntityArrayDto> CREATOR = new a();

        @pmi0("items")
        private final List<NotificationsEntityDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("entity_array")
            public static final TypeDto ENTITY_ARRAY;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentDto.kt */
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
                TypeDto typeDto = new TypeDto("ENTITY_ARRAY", 0, "entity_array");
                ENTITY_ARRAY = typeDto;
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

        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationAttachmentEntityArrayDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentEntityArrayDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NotificationsNotificationAttachmentEntityArrayDto.class, parcel, arrayList, i, 1);
                }
                return new NotificationsNotificationAttachmentEntityArrayDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentEntityArrayDto[] newArray(int i) {
                return new NotificationsNotificationAttachmentEntityArrayDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationsNotificationAttachmentEntityArrayDto(TypeDto typeDto, List<? extends NotificationsEntityDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        public final List<NotificationsEntityDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationAttachmentEntityArrayDto)) {
                return false;
            }
            NotificationsNotificationAttachmentEntityArrayDto notificationsNotificationAttachmentEntityArrayDto = (NotificationsNotificationAttachmentEntityArrayDto) obj;
            return this.type == notificationsNotificationAttachmentEntityArrayDto.type && epx.f(this.items, notificationsNotificationAttachmentEntityArrayDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationAttachmentEntityArrayDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class NotificationsNotificationAttachmentStaticImageDto extends NotificationsNotificationAttachmentDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationAttachmentStaticImageDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("static_image")
            public static final TypeDto STATIC_IMAGE;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentDto.kt */
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
                TypeDto typeDto = new TypeDto("STATIC_IMAGE", 0, "static_image");
                STATIC_IMAGE = typeDto;
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

        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationAttachmentStaticImageDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentStaticImageDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationAttachmentStaticImageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentStaticImageDto[] newArray(int i) {
                return new NotificationsNotificationAttachmentStaticImageDto[i];
            }
        }

        public NotificationsNotificationAttachmentStaticImageDto(TypeDto typeDto, String str) {
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
            if (!(obj instanceof NotificationsNotificationAttachmentStaticImageDto)) {
                return false;
            }
            NotificationsNotificationAttachmentStaticImageDto notificationsNotificationAttachmentStaticImageDto = (NotificationsNotificationAttachmentStaticImageDto) obj;
            return this.type == notificationsNotificationAttachmentStaticImageDto.type && epx.f(this.url, notificationsNotificationAttachmentStaticImageDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationAttachmentStaticImageDto(type=");
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

    /* compiled from: NotificationsNotificationAttachmentDto.kt */
    public static final class NotificationsNotificationAttachmentUserStackDto extends NotificationsNotificationAttachmentDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationAttachmentUserStackDto> CREATOR = new a();

        @pmi0("items")
        private final List<UserId> items;

        @pmi0("label")
        private final String label;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: NotificationsNotificationAttachmentDto.kt */
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
                TypeDto typeDto = new TypeDto("USER_STACK", 0, "user_stack");
                USER_STACK = typeDto;
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

        /* compiled from: NotificationsNotificationAttachmentDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationAttachmentUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentUserStackDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NotificationsNotificationAttachmentUserStackDto.class, parcel, arrayList, i, 1);
                }
                return new NotificationsNotificationAttachmentUserStackDto(createFromParcel, readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationAttachmentUserStackDto[] newArray(int i) {
                return new NotificationsNotificationAttachmentUserStackDto[i];
            }
        }

        public NotificationsNotificationAttachmentUserStackDto(TypeDto typeDto, String str, List<UserId> list) {
            super(null);
            this.type = typeDto;
            this.label = str;
            this.items = list;
        }

        public final List<UserId> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.label;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationAttachmentUserStackDto)) {
                return false;
            }
            NotificationsNotificationAttachmentUserStackDto notificationsNotificationAttachmentUserStackDto = (NotificationsNotificationAttachmentUserStackDto) obj;
            return this.type == notificationsNotificationAttachmentUserStackDto.type && epx.f(this.label, notificationsNotificationAttachmentUserStackDto.label) && epx.f(this.items, notificationsNotificationAttachmentUserStackDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.label);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationAttachmentUserStackDto(type=");
            sb.append(this.type);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.label);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    public /* synthetic */ NotificationsNotificationAttachmentDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationAttachmentDto() {
    }
}

package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConversationBarPayloadDto.kt */
/* loaded from: classes.dex */
public abstract class MessagesConversationBarPayloadDto implements Parcelable {

    /* compiled from: MessagesConversationBarPayloadDto.kt */
    public static final class Deserializer implements a9y<MessagesConversationBarPayloadDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1847644774) {
                    if (hashCode != -1081138978) {
                        if (hashCode == -531262825 && f.equals("gifts_holidays")) {
                            return (MessagesConversationBarPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MessagesConversationBarPayloadGiftsHolidaysDto.class);
                        }
                    } else if (f.equals("max_ad")) {
                        return (MessagesConversationBarPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MessagesConversationBarPayloadMaxAdDto.class);
                    }
                } else if (f.equals("gifts_birthdays")) {
                    return (MessagesConversationBarPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MessagesConversationBarPayloadGiftsBirthdaysDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: MessagesConversationBarPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class MessagesConversationBarPayloadGiftsBirthdaysDto extends MessagesConversationBarPayloadDto implements Parcelable {
        public static final Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysDto> CREATOR = new a();

        @pmi0("birthday_users")
        private final List<UsersUserDto> birthdayUsers;

        @pmi0("is_today_birthday")
        private final Boolean isTodayBirthday;

        @pmi0("modal_info")
        private final MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto modalInfo;

        @pmi0("other_birthday_user_ids")
        private final List<UserId> otherBirthdayUserIds;

        @pmi0("ref")
        private final String ref;

        @pmi0("trailing_image")
        private final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto trailingImage;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("gifts_birthdays")
            public static final TypeDto GIFTS_BIRTHDAYS;
            private final String value;

            /* compiled from: MessagesConversationBarPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GIFTS_BIRTHDAYS", 0, "gifts_birthdays");
                GIFTS_BIRTHDAYS = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysDto> {
            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadGiftsBirthdaysDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesConversationBarPayloadGiftsBirthdaysDto.class, parcel, arrayList2, i, 1);
                }
                String readString = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(MessagesConversationBarPayloadGiftsBirthdaysDto.class, parcel, arrayList3, i2, 1);
                    }
                    arrayList = arrayList3;
                }
                MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto.CREATOR.createFromParcel(parcel);
                MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MessagesConversationBarPayloadGiftsBirthdaysDto(createFromParcel, arrayList2, readString, arrayList, createFromParcel2, createFromParcel3, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadGiftsBirthdaysDto[] newArray(int i) {
                return new MessagesConversationBarPayloadGiftsBirthdaysDto[i];
            }
        }

        public /* synthetic */ MessagesConversationBarPayloadGiftsBirthdaysDto(TypeDto typeDto, List list, String str, List list2, MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto, MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto messagesConversationBarPayloadGiftsBirthdaysModalInfoDto, Boolean bool, int i, zcl zclVar) {
            this(typeDto, list, str, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : messagesConversationBarPayloadGiftsHolidaysTrailingImageDto, (i & 32) != 0 ? null : messagesConversationBarPayloadGiftsBirthdaysModalInfoDto, (i & 64) != 0 ? null : bool);
        }

        public final List<UsersUserDto> d() {
            return this.birthdayUsers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto e() {
            return this.modalInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesConversationBarPayloadGiftsBirthdaysDto)) {
                return false;
            }
            MessagesConversationBarPayloadGiftsBirthdaysDto messagesConversationBarPayloadGiftsBirthdaysDto = (MessagesConversationBarPayloadGiftsBirthdaysDto) obj;
            return this.type == messagesConversationBarPayloadGiftsBirthdaysDto.type && epx.f(this.birthdayUsers, messagesConversationBarPayloadGiftsBirthdaysDto.birthdayUsers) && epx.f(this.ref, messagesConversationBarPayloadGiftsBirthdaysDto.ref) && epx.f(this.otherBirthdayUserIds, messagesConversationBarPayloadGiftsBirthdaysDto.otherBirthdayUserIds) && epx.f(this.trailingImage, messagesConversationBarPayloadGiftsBirthdaysDto.trailingImage) && epx.f(this.modalInfo, messagesConversationBarPayloadGiftsBirthdaysDto.modalInfo) && epx.f(this.isTodayBirthday, messagesConversationBarPayloadGiftsBirthdaysDto.isTodayBirthday);
        }

        public final List<UserId> f() {
            return this.otherBirthdayUserIds;
        }

        public final String g() {
            return this.ref;
        }

        public final int hashCode() {
            int a2 = urd0.a(fw3.a(this.type.hashCode() * 31, 31, this.birthdayUsers), 31, this.ref);
            List<UserId> list = this.otherBirthdayUserIds;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto = this.trailingImage;
            int hashCode2 = (hashCode + (messagesConversationBarPayloadGiftsHolidaysTrailingImageDto == null ? 0 : messagesConversationBarPayloadGiftsHolidaysTrailingImageDto.hashCode())) * 31;
            MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto messagesConversationBarPayloadGiftsBirthdaysModalInfoDto = this.modalInfo;
            int hashCode3 = (hashCode2 + (messagesConversationBarPayloadGiftsBirthdaysModalInfoDto == null ? 0 : messagesConversationBarPayloadGiftsBirthdaysModalInfoDto.hashCode())) * 31;
            Boolean bool = this.isTodayBirthday;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto i() {
            return this.trailingImage;
        }

        public final TypeDto j() {
            return this.type;
        }

        public final Boolean k() {
            return this.isTodayBirthday;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesConversationBarPayloadGiftsBirthdaysDto(type=");
            sb.append(this.type);
            sb.append(", birthdayUsers=");
            sb.append(this.birthdayUsers);
            sb.append(", ref=");
            sb.append(this.ref);
            sb.append(", otherBirthdayUserIds=");
            sb.append(this.otherBirthdayUserIds);
            sb.append(", trailingImage=");
            sb.append(this.trailingImage);
            sb.append(", modalInfo=");
            sb.append(this.modalInfo);
            sb.append(", isTodayBirthday=");
            return tn.a(sb, this.isTodayBirthday, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.birthdayUsers);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.ref);
            List<UserId> list = this.otherBirthdayUserIds;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto = this.trailingImage;
            if (messagesConversationBarPayloadGiftsHolidaysTrailingImageDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                messagesConversationBarPayloadGiftsHolidaysTrailingImageDto.writeToParcel(parcel, i);
            }
            MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto messagesConversationBarPayloadGiftsBirthdaysModalInfoDto = this.modalInfo;
            if (messagesConversationBarPayloadGiftsBirthdaysModalInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                messagesConversationBarPayloadGiftsBirthdaysModalInfoDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isTodayBirthday;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
        }

        public MessagesConversationBarPayloadGiftsBirthdaysDto(TypeDto typeDto, List<UsersUserDto> list, String str, List<UserId> list2, MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto, MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto messagesConversationBarPayloadGiftsBirthdaysModalInfoDto, Boolean bool) {
            super(null);
            this.type = typeDto;
            this.birthdayUsers = list;
            this.ref = str;
            this.otherBirthdayUserIds = list2;
            this.trailingImage = messagesConversationBarPayloadGiftsHolidaysTrailingImageDto;
            this.modalInfo = messagesConversationBarPayloadGiftsBirthdaysModalInfoDto;
            this.isTodayBirthday = bool;
        }
    }

    /* compiled from: MessagesConversationBarPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class MessagesConversationBarPayloadGiftsHolidaysDto extends MessagesConversationBarPayloadDto implements Parcelable {
        public static final Parcelable.Creator<MessagesConversationBarPayloadGiftsHolidaysDto> CREATOR = new a();

        @pmi0("trailing_image")
        private final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto trailingImage;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("gifts_holidays")
            public static final TypeDto GIFTS_HOLIDAYS;
            private final String value;

            /* compiled from: MessagesConversationBarPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GIFTS_HOLIDAYS", 0, "gifts_holidays");
                GIFTS_HOLIDAYS = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadGiftsHolidaysDto> {
            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadGiftsHolidaysDto createFromParcel(Parcel parcel) {
                return new MessagesConversationBarPayloadGiftsHolidaysDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadGiftsHolidaysDto[] newArray(int i) {
                return new MessagesConversationBarPayloadGiftsHolidaysDto[i];
            }
        }

        public /* synthetic */ MessagesConversationBarPayloadGiftsHolidaysDto(TypeDto typeDto, MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : messagesConversationBarPayloadGiftsHolidaysTrailingImageDto);
        }

        public final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto d() {
            return this.trailingImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TypeDto e() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesConversationBarPayloadGiftsHolidaysDto)) {
                return false;
            }
            MessagesConversationBarPayloadGiftsHolidaysDto messagesConversationBarPayloadGiftsHolidaysDto = (MessagesConversationBarPayloadGiftsHolidaysDto) obj;
            return this.type == messagesConversationBarPayloadGiftsHolidaysDto.type && epx.f(this.trailingImage, messagesConversationBarPayloadGiftsHolidaysDto.trailingImage);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto = this.trailingImage;
            return hashCode + (messagesConversationBarPayloadGiftsHolidaysTrailingImageDto == null ? 0 : messagesConversationBarPayloadGiftsHolidaysTrailingImageDto.hashCode());
        }

        public final String toString() {
            return "MessagesConversationBarPayloadGiftsHolidaysDto(type=" + this.type + ", trailingImage=" + this.trailingImage + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto = this.trailingImage;
            if (messagesConversationBarPayloadGiftsHolidaysTrailingImageDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                messagesConversationBarPayloadGiftsHolidaysTrailingImageDto.writeToParcel(parcel, i);
            }
        }

        public MessagesConversationBarPayloadGiftsHolidaysDto(TypeDto typeDto, MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto messagesConversationBarPayloadGiftsHolidaysTrailingImageDto) {
            super(null);
            this.type = typeDto;
            this.trailingImage = messagesConversationBarPayloadGiftsHolidaysTrailingImageDto;
        }
    }

    /* compiled from: MessagesConversationBarPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class MessagesConversationBarPayloadMaxAdDto extends MessagesConversationBarPayloadDto implements Parcelable {
        public static final Parcelable.Creator<MessagesConversationBarPayloadMaxAdDto> CREATOR = new a();

        @pmi0(X3.i.F0)
        private final String advertiser;

        @pmi0("erid")
        private final String erid;

        @pmi0("hide_after_views_count")
        private final Integer hideAfterViewsCount;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("max_ad")
            public static final TypeDto MAX_AD;
            private final String value;

            /* compiled from: MessagesConversationBarPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("MAX_AD", 0, "max_ad");
                MAX_AD = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MessagesConversationBarPayloadDto.kt */
        public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadMaxAdDto> {
            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadMaxAdDto createFromParcel(Parcel parcel) {
                return new MessagesConversationBarPayloadMaxAdDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final MessagesConversationBarPayloadMaxAdDto[] newArray(int i) {
                return new MessagesConversationBarPayloadMaxAdDto[i];
            }
        }

        public /* synthetic */ MessagesConversationBarPayloadMaxAdDto(TypeDto typeDto, String str, String str2, Integer num, int i, zcl zclVar) {
            this(typeDto, str, str2, (i & 8) != 0 ? null : num);
        }

        public final String d() {
            return this.advertiser;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.erid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesConversationBarPayloadMaxAdDto)) {
                return false;
            }
            MessagesConversationBarPayloadMaxAdDto messagesConversationBarPayloadMaxAdDto = (MessagesConversationBarPayloadMaxAdDto) obj;
            return this.type == messagesConversationBarPayloadMaxAdDto.type && epx.f(this.erid, messagesConversationBarPayloadMaxAdDto.erid) && epx.f(this.advertiser, messagesConversationBarPayloadMaxAdDto.advertiser) && epx.f(this.hideAfterViewsCount, messagesConversationBarPayloadMaxAdDto.hideAfterViewsCount);
        }

        public final Integer f() {
            return this.hideAfterViewsCount;
        }

        public final TypeDto g() {
            return this.type;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.erid), 31, this.advertiser);
            Integer num = this.hideAfterViewsCount;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesConversationBarPayloadMaxAdDto(type=");
            sb.append(this.type);
            sb.append(", erid=");
            sb.append(this.erid);
            sb.append(", advertiser=");
            sb.append(this.advertiser);
            sb.append(", hideAfterViewsCount=");
            return uqi.b(sb, this.hideAfterViewsCount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.erid);
            parcel.writeString(this.advertiser);
            Integer num = this.hideAfterViewsCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public MessagesConversationBarPayloadMaxAdDto(TypeDto typeDto, String str, String str2, Integer num) {
            super(null);
            this.type = typeDto;
            this.erid = str;
            this.advertiser = str2;
            this.hideAfterViewsCount = num;
        }
    }

    public /* synthetic */ MessagesConversationBarPayloadDto(zcl zclVar) {
        this();
    }

    private MessagesConversationBarPayloadDto() {
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.C4217a2;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.users.dto.UsersUserDonatedFriendDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupDonutDescriptionDto.kt */
/* loaded from: classes.dex */
public abstract class GroupsGroupDonutDescriptionDto implements Parcelable {

    /* compiled from: GroupsGroupDonutDescriptionDto.kt */
    public static final class Deserializer implements a9y<GroupsGroupDonutDescriptionDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, C4217a2.e)) {
                return (GroupsGroupDonutDescriptionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GroupsGroupDonutDescriptionLevelsDisabledDto.class);
            }
            if (epx.f(f, "enabled")) {
                return (GroupsGroupDonutDescriptionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GroupsGroupDonutDescriptionLevelsEnabledDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: GroupsGroupDonutDescriptionDto.kt */
    /* loaded from: classes14.dex */
    public static final class GroupsGroupDonutDescriptionLevelsDisabledDto extends GroupsGroupDonutDescriptionDto implements Parcelable {
        public static final Parcelable.Creator<GroupsGroupDonutDescriptionLevelsDisabledDto> CREATOR = new a();

        @pmi0("about_button")
        private final BaseLinkButtonDto aboutButton;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("friends")
        private final List<UsersUserDonatedFriendDto> friends;

        @pmi0("has_icon")
        private final Boolean hasIcon;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("price")
        private final Integer price;

        @pmi0("statistics")
        private final List<GroupsGroupDonutStatisticDto> statistics;

        @pmi0("subscription_info")
        private final GroupsGroupDonutSubscriptionInfoDto subscriptionInfo;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupsGroupDonutDescriptionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(C4217a2.e)
            public static final TypeDto DISABLED;
            private final String value;

            /* compiled from: GroupsGroupDonutDescriptionDto.kt */
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
                TypeDto typeDto = new TypeDto("DISABLED", 0, C4217a2.e);
                DISABLED = typeDto;
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

        /* compiled from: GroupsGroupDonutDescriptionDto.kt */
        public static final class a implements Parcelable.Creator<GroupsGroupDonutDescriptionLevelsDisabledDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupsGroupDonutDescriptionLevelsDisabledDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(GroupsGroupDonutStatisticDto.CREATOR, parcel, arrayList3, i2, 1);
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                BaseLinkButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
                BaseLinkButtonDto createFromParcel3 = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = en.a(UsersUserDonatedFriendDto.CREATOR, parcel, arrayList, i3, 1);
                    }
                }
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new GroupsGroupDonutDescriptionLevelsDisabledDto(createFromParcel, arrayList2, arrayList3, readString, readString2, createFromParcel2, createFromParcel3, arrayList, valueOf2, valueOf, parcel.readInt() != 0 ? GroupsGroupDonutSubscriptionInfoDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final GroupsGroupDonutDescriptionLevelsDisabledDto[] newArray(int i) {
                return new GroupsGroupDonutDescriptionLevelsDisabledDto[i];
            }
        }

        public /* synthetic */ GroupsGroupDonutDescriptionLevelsDisabledDto(TypeDto typeDto, List list, List list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List list3, Integer num, Boolean bool, GroupsGroupDonutSubscriptionInfoDto groupsGroupDonutSubscriptionInfoDto, int i, zcl zclVar) {
            this(typeDto, list, list2, str, str2, (i & 32) != 0 ? null : baseLinkButtonDto, (i & 64) != 0 ? null : baseLinkButtonDto2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : groupsGroupDonutSubscriptionInfoDto);
        }

        public final BaseLinkButtonDto d() {
            return this.aboutButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final BaseLinkButtonDto e() {
            return this.button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupsGroupDonutDescriptionLevelsDisabledDto)) {
                return false;
            }
            GroupsGroupDonutDescriptionLevelsDisabledDto groupsGroupDonutDescriptionLevelsDisabledDto = (GroupsGroupDonutDescriptionLevelsDisabledDto) obj;
            return this.type == groupsGroupDonutDescriptionLevelsDisabledDto.type && epx.f(this.image, groupsGroupDonutDescriptionLevelsDisabledDto.image) && epx.f(this.statistics, groupsGroupDonutDescriptionLevelsDisabledDto.statistics) && epx.f(this.text, groupsGroupDonutDescriptionLevelsDisabledDto.text) && epx.f(this.title, groupsGroupDonutDescriptionLevelsDisabledDto.title) && epx.f(this.aboutButton, groupsGroupDonutDescriptionLevelsDisabledDto.aboutButton) && epx.f(this.button, groupsGroupDonutDescriptionLevelsDisabledDto.button) && epx.f(this.friends, groupsGroupDonutDescriptionLevelsDisabledDto.friends) && epx.f(this.price, groupsGroupDonutDescriptionLevelsDisabledDto.price) && epx.f(this.hasIcon, groupsGroupDonutDescriptionLevelsDisabledDto.hasIcon) && epx.f(this.subscriptionInfo, groupsGroupDonutDescriptionLevelsDisabledDto.subscriptionInfo);
        }

        public final List<UsersUserDonatedFriendDto> f() {
            return this.friends;
        }

        public final Boolean g() {
            return this.hasIcon;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(fw3.a(fw3.a(this.type.hashCode() * 31, 31, this.image), 31, this.statistics), 31, this.text), 31, this.title);
            BaseLinkButtonDto baseLinkButtonDto = this.aboutButton;
            int hashCode = (a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto2 = this.button;
            int hashCode2 = (hashCode + (baseLinkButtonDto2 == null ? 0 : baseLinkButtonDto2.hashCode())) * 31;
            List<UsersUserDonatedFriendDto> list = this.friends;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.price;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.hasIcon;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            GroupsGroupDonutSubscriptionInfoDto groupsGroupDonutSubscriptionInfoDto = this.subscriptionInfo;
            return hashCode5 + (groupsGroupDonutSubscriptionInfoDto != null ? groupsGroupDonutSubscriptionInfoDto.hashCode() : 0);
        }

        public final List<BaseImageDto> i() {
            return this.image;
        }

        public final List<GroupsGroupDonutStatisticDto> j() {
            return this.statistics;
        }

        public final GroupsGroupDonutSubscriptionInfoDto k() {
            return this.subscriptionInfo;
        }

        public final String l() {
            return this.text;
        }

        public final String toString() {
            return "GroupsGroupDonutDescriptionLevelsDisabledDto(type=" + this.type + ", image=" + this.image + ", statistics=" + this.statistics + ", text=" + this.text + ", title=" + this.title + ", aboutButton=" + this.aboutButton + ", button=" + this.button + ", friends=" + this.friends + ", price=" + this.price + ", hasIcon=" + this.hasIcon + ", subscriptionInfo=" + this.subscriptionInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.image);
            while (a2.hasNext()) {
                ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
            }
            Iterator a3 = ao.a(parcel, this.statistics);
            while (a3.hasNext()) {
                ((GroupsGroupDonutStatisticDto) a3.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.text);
            parcel.writeString(this.title);
            BaseLinkButtonDto baseLinkButtonDto = this.aboutButton;
            if (baseLinkButtonDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseLinkButtonDto.writeToParcel(parcel, i);
            }
            BaseLinkButtonDto baseLinkButtonDto2 = this.button;
            if (baseLinkButtonDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseLinkButtonDto2.writeToParcel(parcel, i);
            }
            List<UsersUserDonatedFriendDto> list = this.friends;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((UsersUserDonatedFriendDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Integer num = this.price;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool = this.hasIcon;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            GroupsGroupDonutSubscriptionInfoDto groupsGroupDonutSubscriptionInfoDto = this.subscriptionInfo;
            if (groupsGroupDonutSubscriptionInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                groupsGroupDonutSubscriptionInfoDto.writeToParcel(parcel, i);
            }
        }

        public GroupsGroupDonutDescriptionLevelsDisabledDto(TypeDto typeDto, List<BaseImageDto> list, List<GroupsGroupDonutStatisticDto> list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List<UsersUserDonatedFriendDto> list3, Integer num, Boolean bool, GroupsGroupDonutSubscriptionInfoDto groupsGroupDonutSubscriptionInfoDto) {
            super(null);
            this.type = typeDto;
            this.image = list;
            this.statistics = list2;
            this.text = str;
            this.title = str2;
            this.aboutButton = baseLinkButtonDto;
            this.button = baseLinkButtonDto2;
            this.friends = list3;
            this.price = num;
            this.hasIcon = bool;
            this.subscriptionInfo = groupsGroupDonutSubscriptionInfoDto;
        }
    }

    /* compiled from: GroupsGroupDonutDescriptionDto.kt */
    /* loaded from: classes14.dex */
    public static final class GroupsGroupDonutDescriptionLevelsEnabledDto extends GroupsGroupDonutDescriptionDto implements Parcelable {
        public static final Parcelable.Creator<GroupsGroupDonutDescriptionLevelsEnabledDto> CREATOR = new a();

        @pmi0("current_level")
        private final Integer currentLevel;

        @pmi0("friends")
        private final List<UsersUserDonatedFriendDto> friends;

        @pmi0("levels")
        private final List<GroupsGroupDonutSubscriptionLevelDto> levels;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupsGroupDonutDescriptionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("enabled")
            public static final TypeDto ENABLED;
            private final String value;

            /* compiled from: GroupsGroupDonutDescriptionDto.kt */
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
                TypeDto typeDto = new TypeDto("ENABLED", 0, "enabled");
                ENABLED = typeDto;
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

        /* compiled from: GroupsGroupDonutDescriptionDto.kt */
        public static final class a implements Parcelable.Creator<GroupsGroupDonutDescriptionLevelsEnabledDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupsGroupDonutDescriptionLevelsEnabledDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GroupsGroupDonutSubscriptionLevelDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(UsersUserDonatedFriendDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new GroupsGroupDonutDescriptionLevelsEnabledDto(createFromParcel, arrayList2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final GroupsGroupDonutDescriptionLevelsEnabledDto[] newArray(int i) {
                return new GroupsGroupDonutDescriptionLevelsEnabledDto[i];
            }
        }

        public /* synthetic */ GroupsGroupDonutDescriptionLevelsEnabledDto(TypeDto typeDto, List list, List list2, Integer num, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : num);
        }

        public final List<UsersUserDonatedFriendDto> d() {
            return this.friends;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupsGroupDonutDescriptionLevelsEnabledDto)) {
                return false;
            }
            GroupsGroupDonutDescriptionLevelsEnabledDto groupsGroupDonutDescriptionLevelsEnabledDto = (GroupsGroupDonutDescriptionLevelsEnabledDto) obj;
            return this.type == groupsGroupDonutDescriptionLevelsEnabledDto.type && epx.f(this.levels, groupsGroupDonutDescriptionLevelsEnabledDto.levels) && epx.f(this.friends, groupsGroupDonutDescriptionLevelsEnabledDto.friends) && epx.f(this.currentLevel, groupsGroupDonutDescriptionLevelsEnabledDto.currentLevel);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.levels);
            List<UsersUserDonatedFriendDto> list = this.friends;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.currentLevel;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupsGroupDonutDescriptionLevelsEnabledDto(type=");
            sb.append(this.type);
            sb.append(", levels=");
            sb.append(this.levels);
            sb.append(", friends=");
            sb.append(this.friends);
            sb.append(", currentLevel=");
            return uqi.b(sb, this.currentLevel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.levels);
            while (a2.hasNext()) {
                ((GroupsGroupDonutSubscriptionLevelDto) a2.next()).writeToParcel(parcel, i);
            }
            List<UsersUserDonatedFriendDto> list = this.friends;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((UsersUserDonatedFriendDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Integer num = this.currentLevel;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public GroupsGroupDonutDescriptionLevelsEnabledDto(TypeDto typeDto, List<GroupsGroupDonutSubscriptionLevelDto> list, List<UsersUserDonatedFriendDto> list2, Integer num) {
            super(null);
            this.type = typeDto;
            this.levels = list;
            this.friends = list2;
            this.currentLevel = num;
        }
    }

    public /* synthetic */ GroupsGroupDonutDescriptionDto(zcl zclVar) {
        this();
    }

    private GroupsGroupDonutDescriptionDto() {
    }
}

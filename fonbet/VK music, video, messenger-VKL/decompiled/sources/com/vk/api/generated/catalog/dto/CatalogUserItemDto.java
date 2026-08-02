package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.api.generated.users.dto.UsersUserDescriptionDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogUserItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogUserItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogUserItemDto> CREATOR = new a();

    @pmi0("actions")
    private final List<CatalogButtonDto> actions;

    @pmi0("birthday")
    private final BirthdayDto birthday;

    @pmi0("common_friends")
    private final List<UserId> commonFriends;

    @pmi0("common_friends_count")
    private final Integer commonFriendsCount;

    @pmi0("common_friends_description")
    private final UsersUserDescriptionDto commonFriendsDescription;

    @pmi0("descriptions")
    private final List<UsersUserDescriptionDto> descriptions;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("name_in_genitive")
    private final String nameInGenitive;

    @pmi0("state")
    private final StateDto state;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogUserItemDto.kt */
    public static final class BirthdayDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BirthdayDto[] $VALUES;
        public static final Parcelable.Creator<BirthdayDto> CREATOR;

        @pmi0("today")
        public static final BirthdayDto TODAY;

        @pmi0("tomorrow")
        public static final BirthdayDto TOMORROW;
        private final String value;

        /* compiled from: CatalogUserItemDto.kt */
        public static final class a implements Parcelable.Creator<BirthdayDto> {
            @Override // android.os.Parcelable.Creator
            public final BirthdayDto createFromParcel(Parcel parcel) {
                return BirthdayDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BirthdayDto[] newArray(int i) {
                return new BirthdayDto[i];
            }
        }

        static {
            BirthdayDto birthdayDto = new BirthdayDto("TODAY", 0, "today");
            TODAY = birthdayDto;
            BirthdayDto birthdayDto2 = new BirthdayDto("TOMORROW", 1, "tomorrow");
            TOMORROW = birthdayDto2;
            BirthdayDto[] birthdayDtoArr = {birthdayDto, birthdayDto2};
            $VALUES = birthdayDtoArr;
            $ENTRIES = new asp(birthdayDtoArr);
            CREATOR = new a();
        }

        private BirthdayDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BirthdayDto valueOf(String str) {
            return (BirthdayDto) Enum.valueOf(BirthdayDto.class, str);
        }

        public static BirthdayDto[] values() {
            return (BirthdayDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogUserItemDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("new")
        public static final StateDto NEW;

        @pmi0("regular")
        public static final StateDto REGULAR;

        @pmi0("unknown")
        public static final StateDto UNKNOWN;
        private final String value;

        /* compiled from: CatalogUserItemDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("REGULAR", 0, "regular");
            REGULAR = stateDto;
            StateDto stateDto2 = new StateDto("NEW", 1, "new");
            NEW = stateDto2;
            StateDto stateDto3 = new StateDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
            UNKNOWN = stateDto3;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
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

    /* compiled from: CatalogUserItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogUserItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogUserItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(CatalogUserItemDto.class.getClassLoader());
            String readString2 = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CatalogUserItemDto.class, parcel, arrayList, i, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UsersUserDescriptionDto createFromParcel = parcel.readInt() == 0 ? null : UsersUserDescriptionDto.CREATOR.createFromParcel(parcel);
            StateDto createFromParcel2 = parcel.readInt() == 0 ? null : StateDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(UsersUserDescriptionDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            BirthdayDto createFromParcel3 = parcel.readInt() == 0 ? null : BirthdayDto.CREATOR.createFromParcel(parcel);
            int i3 = 0;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i3 != readInt3) {
                    i3 = en.a(CatalogButtonDto.CREATOR, parcel, arrayList4, i3, 1);
                }
                arrayList3 = arrayList4;
            }
            return new CatalogUserItemDto(readString, userId, readString2, arrayList, valueOf, createFromParcel, createFromParcel2, arrayList2, createFromParcel3, readString3, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogUserItemDto[] newArray(int i) {
            return new CatalogUserItemDto[i];
        }
    }

    public CatalogUserItemDto(String str, UserId userId, String str2, List<UserId> list, Integer num, UsersUserDescriptionDto usersUserDescriptionDto, StateDto stateDto, List<UsersUserDescriptionDto> list2, BirthdayDto birthdayDto, String str3, List<CatalogButtonDto> list3) {
        this.itemId = str;
        this.userId = userId;
        this.trackCode = str2;
        this.commonFriends = list;
        this.commonFriendsCount = num;
        this.commonFriendsDescription = usersUserDescriptionDto;
        this.state = stateDto;
        this.descriptions = list2;
        this.birthday = birthdayDto;
        this.nameInGenitive = str3;
        this.actions = list3;
    }

    public final List<CatalogButtonDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BirthdayDto e() {
        return this.birthday;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogUserItemDto)) {
            return false;
        }
        CatalogUserItemDto catalogUserItemDto = (CatalogUserItemDto) obj;
        return epx.f(this.itemId, catalogUserItemDto.itemId) && epx.f(this.userId, catalogUserItemDto.userId) && epx.f(this.trackCode, catalogUserItemDto.trackCode) && epx.f(this.commonFriends, catalogUserItemDto.commonFriends) && epx.f(this.commonFriendsCount, catalogUserItemDto.commonFriendsCount) && epx.f(this.commonFriendsDescription, catalogUserItemDto.commonFriendsDescription) && this.state == catalogUserItemDto.state && epx.f(this.descriptions, catalogUserItemDto.descriptions) && this.birthday == catalogUserItemDto.birthday && epx.f(this.nameInGenitive, catalogUserItemDto.nameInGenitive) && epx.f(this.actions, catalogUserItemDto.actions);
    }

    public final List<UserId> f() {
        return this.commonFriends;
    }

    public final Integer g() {
        return this.commonFriendsCount;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int a2 = bh10.a(this.itemId.hashCode() * 31, 31, this.userId.b);
        String str = this.trackCode;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UserId> list = this.commonFriends;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.commonFriendsCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserDescriptionDto usersUserDescriptionDto = this.commonFriendsDescription;
        int hashCode4 = (hashCode3 + (usersUserDescriptionDto == null ? 0 : usersUserDescriptionDto.hashCode())) * 31;
        StateDto stateDto = this.state;
        int hashCode5 = (hashCode4 + (stateDto == null ? 0 : stateDto.hashCode())) * 31;
        List<UsersUserDescriptionDto> list2 = this.descriptions;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BirthdayDto birthdayDto = this.birthday;
        int hashCode7 = (hashCode6 + (birthdayDto == null ? 0 : birthdayDto.hashCode())) * 31;
        String str2 = this.nameInGenitive;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CatalogButtonDto> list3 = this.actions;
        return hashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final UsersUserDescriptionDto i() {
        return this.commonFriendsDescription;
    }

    public final List<UsersUserDescriptionDto> j() {
        return this.descriptions;
    }

    public final String k() {
        return this.itemId;
    }

    public final String l() {
        return this.nameInGenitive;
    }

    public final StateDto n() {
        return this.state;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogUserItemDto(itemId=");
        sb.append(this.itemId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", commonFriends=");
        sb.append(this.commonFriends);
        sb.append(", commonFriendsCount=");
        sb.append(this.commonFriendsCount);
        sb.append(", commonFriendsDescription=");
        sb.append(this.commonFriendsDescription);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", nameInGenitive=");
        sb.append(this.nameInGenitive);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.trackCode);
        List<UserId> list = this.commonFriends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.commonFriendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        UsersUserDescriptionDto usersUserDescriptionDto = this.commonFriendsDescription;
        if (usersUserDescriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserDescriptionDto.writeToParcel(parcel, i);
        }
        StateDto stateDto = this.state;
        if (stateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stateDto.writeToParcel(parcel, i);
        }
        List<UsersUserDescriptionDto> list2 = this.descriptions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((UsersUserDescriptionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        BirthdayDto birthdayDto = this.birthday;
        if (birthdayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            birthdayDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.nameInGenitive);
        List<CatalogButtonDto> list3 = this.actions;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((CatalogButtonDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogUserItemDto(String str, UserId userId, String str2, List list, Integer num, UsersUserDescriptionDto usersUserDescriptionDto, StateDto stateDto, List list2, BirthdayDto birthdayDto, String str3, List list3, int i, zcl zclVar) {
        this(str, userId, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : usersUserDescriptionDto, (i & 64) != 0 ? null : stateDto, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : birthdayDto, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : list3);
    }
}

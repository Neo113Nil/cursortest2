package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.users.dto.UsersUserDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsOwnerXtrBanInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsOwnerXtrBanInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsOwnerXtrBanInfoDto> CREATOR = new a();

    @pmi0("ban_info")
    private final GroupsBanInfoDto banInfo;

    @pmi0("group")
    private final GroupsGroupDto group;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserDto profile;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsOwnerXtrBanInfoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("group")
        public static final TypeDto GROUP;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final TypeDto PROFILE;
        private final String value;

        /* compiled from: GroupsOwnerXtrBanInfoDto.kt */
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
            TypeDto typeDto = new TypeDto("GROUP", 0, "group");
            GROUP = typeDto;
            TypeDto typeDto2 = new TypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            PROFILE = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: GroupsOwnerXtrBanInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsOwnerXtrBanInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsOwnerXtrBanInfoDto createFromParcel(Parcel parcel) {
            return new GroupsOwnerXtrBanInfoDto(parcel.readInt() == 0 ? null : GroupsBanInfoDto.CREATOR.createFromParcel(parcel), (GroupsGroupDto) parcel.readParcelable(GroupsOwnerXtrBanInfoDto.class.getClassLoader()), (UsersUserDto) parcel.readParcelable(GroupsOwnerXtrBanInfoDto.class.getClassLoader()), parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsOwnerXtrBanInfoDto[] newArray(int i) {
            return new GroupsOwnerXtrBanInfoDto[i];
        }
    }

    public GroupsOwnerXtrBanInfoDto() {
        this(null, null, null, null, 15, null);
    }

    public final GroupsBanInfoDto d() {
        return this.banInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UsersUserDto e() {
        return this.profile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsOwnerXtrBanInfoDto)) {
            return false;
        }
        GroupsOwnerXtrBanInfoDto groupsOwnerXtrBanInfoDto = (GroupsOwnerXtrBanInfoDto) obj;
        return epx.f(this.banInfo, groupsOwnerXtrBanInfoDto.banInfo) && epx.f(this.group, groupsOwnerXtrBanInfoDto.group) && epx.f(this.profile, groupsOwnerXtrBanInfoDto.profile) && this.type == groupsOwnerXtrBanInfoDto.type;
    }

    public final int hashCode() {
        GroupsBanInfoDto groupsBanInfoDto = this.banInfo;
        int hashCode = (groupsBanInfoDto == null ? 0 : groupsBanInfoDto.hashCode()) * 31;
        GroupsGroupDto groupsGroupDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupDto == null ? 0 : groupsGroupDto.hashCode())) * 31;
        UsersUserDto usersUserDto = this.profile;
        int hashCode3 = (hashCode2 + (usersUserDto == null ? 0 : usersUserDto.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode3 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsOwnerXtrBanInfoDto(banInfo=" + this.banInfo + ", group=" + this.group + ", profile=" + this.profile + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsBanInfoDto groupsBanInfoDto = this.banInfo;
        if (groupsBanInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBanInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.group, i);
        parcel.writeParcelable(this.profile, i);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public GroupsOwnerXtrBanInfoDto(GroupsBanInfoDto groupsBanInfoDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto, TypeDto typeDto) {
        this.banInfo = groupsBanInfoDto;
        this.group = groupsGroupDto;
        this.profile = usersUserDto;
        this.type = typeDto;
    }

    public /* synthetic */ GroupsOwnerXtrBanInfoDto(GroupsBanInfoDto groupsBanInfoDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsBanInfoDto, (i & 2) != 0 ? null : groupsGroupDto, (i & 4) != 0 ? null : usersUserDto, (i & 8) != 0 ? null : typeDto);
    }
}

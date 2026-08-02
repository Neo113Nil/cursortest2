package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesGetBirthdayBannedItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetBirthdayBannedItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetBirthdayBannedItemDto> CREATOR = new a();

    @pmi0("group")
    private final GroupsGroupDto group;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user")
    private final UsersUserDto user;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesGetBirthdayBannedItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("group")
        public static final TypeDto GROUP;

        @pmi0("user")
        public static final TypeDto USER;
        private final String value;

        /* compiled from: StoriesGetBirthdayBannedItemDto.kt */
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
            TypeDto typeDto = new TypeDto("USER", 0, "user");
            USER = typeDto;
            TypeDto typeDto2 = new TypeDto("GROUP", 1, "group");
            GROUP = typeDto2;
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

    /* compiled from: StoriesGetBirthdayBannedItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetBirthdayBannedItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetBirthdayBannedItemDto createFromParcel(Parcel parcel) {
            return new StoriesGetBirthdayBannedItemDto(TypeDto.CREATOR.createFromParcel(parcel), (GroupsGroupDto) parcel.readParcelable(StoriesGetBirthdayBannedItemDto.class.getClassLoader()), (UsersUserDto) parcel.readParcelable(StoriesGetBirthdayBannedItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetBirthdayBannedItemDto[] newArray(int i) {
            return new StoriesGetBirthdayBannedItemDto[i];
        }
    }

    public StoriesGetBirthdayBannedItemDto(TypeDto typeDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto) {
        this.type = typeDto;
        this.group = groupsGroupDto;
        this.user = usersUserDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetBirthdayBannedItemDto)) {
            return false;
        }
        StoriesGetBirthdayBannedItemDto storiesGetBirthdayBannedItemDto = (StoriesGetBirthdayBannedItemDto) obj;
        return this.type == storiesGetBirthdayBannedItemDto.type && epx.f(this.group, storiesGetBirthdayBannedItemDto.group) && epx.f(this.user, storiesGetBirthdayBannedItemDto.user);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        GroupsGroupDto groupsGroupDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupDto == null ? 0 : groupsGroupDto.hashCode())) * 31;
        UsersUserDto usersUserDto = this.user;
        return hashCode2 + (usersUserDto != null ? usersUserDto.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesGetBirthdayBannedItemDto(type=" + this.type + ", group=" + this.group + ", user=" + this.user + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.group, i);
        parcel.writeParcelable(this.user, i);
    }

    public /* synthetic */ StoriesGetBirthdayBannedItemDto(TypeDto typeDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : groupsGroupDto, (i & 4) != 0 ? null : usersUserDto);
    }
}

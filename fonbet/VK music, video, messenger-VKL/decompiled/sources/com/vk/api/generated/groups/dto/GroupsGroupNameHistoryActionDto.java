package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: GroupsGroupNameHistoryActionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupNameHistoryActionDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupNameHistoryActionDto> CREATOR = new a();

    @pmi0("time")
    private final long time;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupNameHistoryActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("collapse")
        public static final TypeDto COLLAPSE;

        @pmi0("create")
        public static final TypeDto CREATE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("rename")
        public static final TypeDto RENAME;
        private final String value;

        /* compiled from: GroupsGroupNameHistoryActionDto.kt */
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
            TypeDto typeDto = new TypeDto("RENAME", 0, "rename");
            RENAME = typeDto;
            TypeDto typeDto2 = new TypeDto("CREATE", 1, "create");
            CREATE = typeDto2;
            TypeDto typeDto3 = new TypeDto("COLLAPSE", 2, "collapse");
            COLLAPSE = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: GroupsGroupNameHistoryActionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupNameHistoryActionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupNameHistoryActionDto createFromParcel(Parcel parcel) {
            return new GroupsGroupNameHistoryActionDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupNameHistoryActionDto[] newArray(int i) {
            return new GroupsGroupNameHistoryActionDto[i];
        }
    }

    public GroupsGroupNameHistoryActionDto(TypeDto typeDto, long j, String str) {
        this.type = typeDto;
        this.time = j;
        this.title = str;
    }

    public final long d() {
        return this.time;
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
        if (!(obj instanceof GroupsGroupNameHistoryActionDto)) {
            return false;
        }
        GroupsGroupNameHistoryActionDto groupsGroupNameHistoryActionDto = (GroupsGroupNameHistoryActionDto) obj;
        return this.type == groupsGroupNameHistoryActionDto.type && this.time == groupsGroupNameHistoryActionDto.time && epx.f(this.title, groupsGroupNameHistoryActionDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + bh10.a(this.type.hashCode() * 31, 31, this.time);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupNameHistoryActionDto(type=");
        sb.append(this.type);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeLong(this.time);
        parcel.writeString(this.title);
    }
}

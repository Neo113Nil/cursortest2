package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersRelativeDto.kt */
/* loaded from: classes5.dex */
public final class UsersRelativeDto {

    @pmi0("birth_date")
    private final String birthDate;

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersRelativeDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("child")
        public static final TypeDto CHILD;

        @pmi0("grandchild")
        public static final TypeDto GRANDCHILD;

        @pmi0("grandparent")
        public static final TypeDto GRANDPARENT;

        @pmi0("parent")
        public static final TypeDto PARENT;

        @pmi0("sibling")
        public static final TypeDto SIBLING;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("PARENT", 0, "parent");
            PARENT = typeDto;
            TypeDto typeDto2 = new TypeDto("CHILD", 1, "child");
            CHILD = typeDto2;
            TypeDto typeDto3 = new TypeDto("GRANDPARENT", 2, "grandparent");
            GRANDPARENT = typeDto3;
            TypeDto typeDto4 = new TypeDto("GRANDCHILD", 3, "grandchild");
            GRANDCHILD = typeDto4;
            TypeDto typeDto5 = new TypeDto("SIBLING", 4, "sibling");
            SIBLING = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public UsersRelativeDto(TypeDto typeDto, String str, UserId userId, String str2) {
        this.type = typeDto;
        this.birthDate = str;
        this.id = userId;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersRelativeDto)) {
            return false;
        }
        UsersRelativeDto usersRelativeDto = (UsersRelativeDto) obj;
        return this.type == usersRelativeDto.type && epx.f(this.birthDate, usersRelativeDto.birthDate) && epx.f(this.id, usersRelativeDto.id) && epx.f(this.name, usersRelativeDto.name);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.birthDate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.id;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.name;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UsersRelativeDto(type=" + this.type + ", birthDate=" + this.birthDate + ", id=" + this.id + ", name=" + this.name + ")";
    }

    public /* synthetic */ UsersRelativeDto(TypeDto typeDto, String str, UserId userId, String str2, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str2);
    }
}

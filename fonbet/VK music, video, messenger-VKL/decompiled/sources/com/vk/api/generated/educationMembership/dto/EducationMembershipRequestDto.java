package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: EducationMembershipRequestDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipRequestDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipRequestDto> CREATOR = new a();

    @pmi0("created_at")
    private final int createdAt;

    @pmi0("creator")
    private final EducationMembershipCreatorDto creator;

    @pmi0("id")
    private final int id;

    @pmi0("organization")
    private final EducationMembershipOrganizationDto organization;

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<EducationMembershipRoleDto> roles;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationMembershipRequestDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("general")
        public static final TypeDto GENERAL;

        @pmi0("personal")
        public static final TypeDto PERSONAL;

        @pmi0("self")
        public static final TypeDto SELF;
        private final String value;

        /* compiled from: EducationMembershipRequestDto.kt */
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
            TypeDto typeDto = new TypeDto("GENERAL", 0, "general");
            GENERAL = typeDto;
            TypeDto typeDto2 = new TypeDto("PERSONAL", 1, "personal");
            PERSONAL = typeDto2;
            TypeDto typeDto3 = new TypeDto("SELF", 2, "self");
            SELF = typeDto3;
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

    /* compiled from: EducationMembershipRequestDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipRequestDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipRequestDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(EducationMembershipRoleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationMembershipRequestDto(readInt, createFromParcel, readInt2, arrayList, EducationMembershipCreatorDto.CREATOR.createFromParcel(parcel), EducationMembershipOrganizationDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipRequestDto[] newArray(int i) {
            return new EducationMembershipRequestDto[i];
        }
    }

    public EducationMembershipRequestDto(int i, TypeDto typeDto, int i2, List<EducationMembershipRoleDto> list, EducationMembershipCreatorDto educationMembershipCreatorDto, EducationMembershipOrganizationDto educationMembershipOrganizationDto) {
        this.id = i;
        this.type = typeDto;
        this.createdAt = i2;
        this.roles = list;
        this.creator = educationMembershipCreatorDto;
        this.organization = educationMembershipOrganizationDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipRequestDto)) {
            return false;
        }
        EducationMembershipRequestDto educationMembershipRequestDto = (EducationMembershipRequestDto) obj;
        return this.id == educationMembershipRequestDto.id && this.type == educationMembershipRequestDto.type && this.createdAt == educationMembershipRequestDto.createdAt && epx.f(this.roles, educationMembershipRequestDto.roles) && epx.f(this.creator, educationMembershipRequestDto.creator) && epx.f(this.organization, educationMembershipRequestDto.organization);
    }

    public final int hashCode() {
        return this.organization.hashCode() + ((this.creator.hashCode() + fw3.a(shy.a(this.createdAt, (this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31, this.roles)) * 31);
    }

    public final String toString() {
        return "EducationMembershipRequestDto(id=" + this.id + ", type=" + this.type + ", createdAt=" + this.createdAt + ", roles=" + this.roles + ", creator=" + this.creator + ", organization=" + this.organization + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.createdAt);
        Iterator a2 = ao.a(parcel, this.roles);
        while (a2.hasNext()) {
            ((EducationMembershipRoleDto) a2.next()).writeToParcel(parcel, i);
        }
        this.creator.writeToParcel(parcel, i);
        this.organization.writeToParcel(parcel, i);
    }
}

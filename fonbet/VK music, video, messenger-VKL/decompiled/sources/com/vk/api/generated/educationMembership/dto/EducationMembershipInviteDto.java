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
import xsna.urd0;
import xsna.zrp;

/* compiled from: EducationMembershipInviteDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipInviteDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipInviteDto> CREATOR = new a();

    @pmi0("accepted_count")
    private final int acceptedCount;

    @pmi0("created_at")
    private final int createdAt;

    @pmi0("creator")
    private final EducationMembershipCreatorDto creator;

    @pmi0("expire_count")
    private final int expireCount;

    @pmi0("expire_time")
    private final int expireTime;

    @pmi0("hash")
    private final String hash;

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
    /* compiled from: EducationMembershipInviteDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("general")
        public static final TypeDto GENERAL;

        @pmi0("personal")
        public static final TypeDto PERSONAL;
        private final String value;

        /* compiled from: EducationMembershipInviteDto.kt */
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

    /* compiled from: EducationMembershipInviteDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipInviteDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipInviteDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            int i = 0;
            while (i != readInt6) {
                i = en.a(EducationMembershipRoleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationMembershipInviteDto(readInt, readString, createFromParcel, readInt2, readInt3, readInt4, readInt5, arrayList, EducationMembershipCreatorDto.CREATOR.createFromParcel(parcel), EducationMembershipOrganizationDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipInviteDto[] newArray(int i) {
            return new EducationMembershipInviteDto[i];
        }
    }

    public EducationMembershipInviteDto(int i, String str, TypeDto typeDto, int i2, int i3, int i4, int i5, List<EducationMembershipRoleDto> list, EducationMembershipCreatorDto educationMembershipCreatorDto, EducationMembershipOrganizationDto educationMembershipOrganizationDto) {
        this.id = i;
        this.hash = str;
        this.type = typeDto;
        this.createdAt = i2;
        this.expireTime = i3;
        this.expireCount = i4;
        this.acceptedCount = i5;
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
        if (!(obj instanceof EducationMembershipInviteDto)) {
            return false;
        }
        EducationMembershipInviteDto educationMembershipInviteDto = (EducationMembershipInviteDto) obj;
        return this.id == educationMembershipInviteDto.id && epx.f(this.hash, educationMembershipInviteDto.hash) && this.type == educationMembershipInviteDto.type && this.createdAt == educationMembershipInviteDto.createdAt && this.expireTime == educationMembershipInviteDto.expireTime && this.expireCount == educationMembershipInviteDto.expireCount && this.acceptedCount == educationMembershipInviteDto.acceptedCount && epx.f(this.roles, educationMembershipInviteDto.roles) && epx.f(this.creator, educationMembershipInviteDto.creator) && epx.f(this.organization, educationMembershipInviteDto.organization);
    }

    public final int hashCode() {
        return this.organization.hashCode() + ((this.creator.hashCode() + fw3.a(shy.a(this.acceptedCount, shy.a(this.expireCount, shy.a(this.expireTime, shy.a(this.createdAt, (this.type.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.hash)) * 31, 31), 31), 31), 31), 31, this.roles)) * 31);
    }

    public final String toString() {
        return "EducationMembershipInviteDto(id=" + this.id + ", hash=" + this.hash + ", type=" + this.type + ", createdAt=" + this.createdAt + ", expireTime=" + this.expireTime + ", expireCount=" + this.expireCount + ", acceptedCount=" + this.acceptedCount + ", roles=" + this.roles + ", creator=" + this.creator + ", organization=" + this.organization + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.hash);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.createdAt);
        parcel.writeInt(this.expireTime);
        parcel.writeInt(this.expireCount);
        parcel.writeInt(this.acceptedCount);
        Iterator a2 = ao.a(parcel, this.roles);
        while (a2.hasNext()) {
            ((EducationMembershipRoleDto) a2.next()).writeToParcel(parcel, i);
        }
        this.creator.writeToParcel(parcel, i);
        this.organization.writeToParcel(parcel, i);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsBidOrganizationDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBidOrganizationDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBidOrganizationDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("org_id")
    private final Integer orgId;

    @pmi0("org_type")
    private final String orgType;

    @pmi0("type_name")
    private final String typeName;

    @pmi0("verified")
    private final Boolean verified;

    /* compiled from: GroupsBidOrganizationDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBidOrganizationDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsBidOrganizationDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsBidOrganizationDto(valueOf, readString, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBidOrganizationDto[] newArray(int i) {
            return new GroupsBidOrganizationDto[i];
        }
    }

    public GroupsBidOrganizationDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.orgId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBidOrganizationDto)) {
            return false;
        }
        GroupsBidOrganizationDto groupsBidOrganizationDto = (GroupsBidOrganizationDto) obj;
        return epx.f(this.orgId, groupsBidOrganizationDto.orgId) && epx.f(this.orgType, groupsBidOrganizationDto.orgType) && epx.f(this.verified, groupsBidOrganizationDto.verified) && epx.f(this.name, groupsBidOrganizationDto.name) && epx.f(this.typeName, groupsBidOrganizationDto.typeName);
    }

    public final String f() {
        return this.orgType;
    }

    public final String g() {
        return this.typeName;
    }

    public final int hashCode() {
        Integer num = this.orgId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.orgType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.verified;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.typeName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean i() {
        return this.verified;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsBidOrganizationDto(orgId=");
        sb.append(this.orgId);
        sb.append(", orgType=");
        sb.append(this.orgType);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", typeName=");
        return ho8.a(sb, this.typeName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.orgId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.orgType);
        Boolean bool = this.verified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.typeName);
    }

    public GroupsBidOrganizationDto(Integer num, String str, Boolean bool, String str2, String str3) {
        this.orgId = num;
        this.orgType = str;
        this.verified = bool;
        this.name = str2;
        this.typeName = str3;
    }

    public /* synthetic */ GroupsBidOrganizationDto(Integer num, String str, Boolean bool, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsBidOrganizationLinkedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBidOrganizationLinkedDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBidOrganizationLinkedDto> CREATOR = new a();

    @pmi0("created_at")
    private final Integer createdAt;

    @pmi0("name")
    private final String name;

    @pmi0("org_id")
    private final Integer orgId;

    @pmi0("org_type")
    private final String orgType;

    @pmi0("verified")
    private final Boolean verified;

    /* compiled from: GroupsBidOrganizationLinkedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBidOrganizationLinkedDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GroupsBidOrganizationLinkedDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            Boolean valueOf2;
            Boolean bool2;
            String str;
            Integer valueOf3;
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = bool;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = bool;
                bool2 = valueOf2;
                str = readString2;
            } else {
                bool2 = valueOf2;
                str = readString2;
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new GroupsBidOrganizationLinkedDto(valueOf, readString, bool2, str, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBidOrganizationLinkedDto[] newArray(int i) {
            return new GroupsBidOrganizationLinkedDto[i];
        }
    }

    public GroupsBidOrganizationLinkedDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Boolean d() {
        return this.verified;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBidOrganizationLinkedDto)) {
            return false;
        }
        GroupsBidOrganizationLinkedDto groupsBidOrganizationLinkedDto = (GroupsBidOrganizationLinkedDto) obj;
        return epx.f(this.orgId, groupsBidOrganizationLinkedDto.orgId) && epx.f(this.orgType, groupsBidOrganizationLinkedDto.orgType) && epx.f(this.verified, groupsBidOrganizationLinkedDto.verified) && epx.f(this.name, groupsBidOrganizationLinkedDto.name) && epx.f(this.createdAt, groupsBidOrganizationLinkedDto.createdAt);
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
        Integer num2 = this.createdAt;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsBidOrganizationLinkedDto(orgId=");
        sb.append(this.orgId);
        sb.append(", orgType=");
        sb.append(this.orgType);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", createdAt=");
        return uqi.b(sb, this.createdAt, ')');
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
        Integer num2 = this.createdAt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public GroupsBidOrganizationLinkedDto(Integer num, String str, Boolean bool, String str2, Integer num2) {
        this.orgId = num;
        this.orgType = str;
        this.verified = bool;
        this.name = str2;
        this.createdAt = num2;
    }

    public /* synthetic */ GroupsBidOrganizationLinkedDto(Integer num, String str, Boolean bool, String str2, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2);
    }
}

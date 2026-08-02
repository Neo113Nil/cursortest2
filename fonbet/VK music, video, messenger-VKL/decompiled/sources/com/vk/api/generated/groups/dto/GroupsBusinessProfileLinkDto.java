package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsBusinessProfileLinkDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBusinessProfileLinkDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBusinessProfileLinkDto> CREATOR = new a();

    @pmi0("created_at")
    private final Integer createdAt;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("name")
    private final String name;

    @pmi0("org_id")
    private final Integer orgId;

    @pmi0("org_type")
    private final String orgType;

    @pmi0("type_name")
    private final String typeName;

    /* compiled from: GroupsBusinessProfileLinkDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBusinessProfileLinkDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GroupsBusinessProfileLinkDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            Object obj;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                obj = num;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsBusinessProfileLinkDto(valueOf, readString, obj, readString2, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBusinessProfileLinkDto[] newArray(int i) {
            return new GroupsBusinessProfileLinkDto[i];
        }
    }

    public GroupsBusinessProfileLinkDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBusinessProfileLinkDto)) {
            return false;
        }
        GroupsBusinessProfileLinkDto groupsBusinessProfileLinkDto = (GroupsBusinessProfileLinkDto) obj;
        return epx.f(this.orgId, groupsBusinessProfileLinkDto.orgId) && epx.f(this.orgType, groupsBusinessProfileLinkDto.orgType) && epx.f(this.isActive, groupsBusinessProfileLinkDto.isActive) && epx.f(this.name, groupsBusinessProfileLinkDto.name) && epx.f(this.createdAt, groupsBusinessProfileLinkDto.createdAt) && epx.f(this.typeName, groupsBusinessProfileLinkDto.typeName);
    }

    public final int hashCode() {
        Integer num = this.orgId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.orgType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isActive;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.createdAt;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.typeName;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsBusinessProfileLinkDto(orgId=");
        sb.append(this.orgId);
        sb.append(", orgType=");
        sb.append(this.orgType);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
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
        Boolean bool = this.isActive;
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
        parcel.writeString(this.typeName);
    }

    public GroupsBusinessProfileLinkDto(Integer num, String str, Boolean bool, String str2, Integer num2, String str3) {
        this.orgId = num;
        this.orgType = str;
        this.isActive = bool;
        this.name = str2;
        this.createdAt = num2;
        this.typeName = str3;
    }

    public /* synthetic */ GroupsBusinessProfileLinkDto(Integer num, String str, Boolean bool, String str2, Integer num2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3);
    }
}

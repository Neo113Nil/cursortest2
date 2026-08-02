package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsAppModuleItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAppModuleItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAppModuleItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("icon")
    private final String icon;

    @pmi0("link")
    private final String link;

    @pmi0("title")
    private final String title;

    @pmi0("users_count")
    private final Integer usersCount;

    /* compiled from: GroupsAppModuleItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAppModuleItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAppModuleItemDto createFromParcel(Parcel parcel) {
            return new GroupsAppModuleItemDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAppModuleItemDto[] newArray(int i) {
            return new GroupsAppModuleItemDto[i];
        }
    }

    public GroupsAppModuleItemDto(int i, String str, String str2, String str3, Integer num) {
        this.appId = i;
        this.icon = str;
        this.title = str2;
        this.link = str3;
        this.usersCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAppModuleItemDto)) {
            return false;
        }
        GroupsAppModuleItemDto groupsAppModuleItemDto = (GroupsAppModuleItemDto) obj;
        return this.appId == groupsAppModuleItemDto.appId && epx.f(this.icon, groupsAppModuleItemDto.icon) && epx.f(this.title, groupsAppModuleItemDto.title) && epx.f(this.link, groupsAppModuleItemDto.link) && epx.f(this.usersCount, groupsAppModuleItemDto.usersCount);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.appId) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.usersCount;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAppModuleItemDto(appId=");
        sb.append(this.appId);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", usersCount=");
        return uqi.b(sb, this.usersCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeString(this.link);
        Integer num = this.usersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsAppModuleItemDto(int i, String str, String str2, String str3, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num);
    }
}

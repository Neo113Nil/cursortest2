package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsChatsStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChatsStatusDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChatsStatusDto> CREATOR = new a();

    @pmi0("activity_count")
    private final Integer activityCount;

    @pmi0("can_create")
    private final Boolean canCreate;

    @pmi0("can_create_donut_chat")
    private final Boolean canCreateDonutChat;

    @pmi0("can_create_regular_chat")
    private final Boolean canCreateRegularChat;

    @pmi0("can_manage")
    private final Boolean canManage;

    @pmi0("count")
    private final int count;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: GroupsChatsStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChatsStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChatsStatusDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            int readInt = parcel.readInt();
            Boolean bool = null;
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() == 0 ? z2 : true);
            }
            return new GroupsChatsStatusDto(z, readInt, valueOf4, valueOf, valueOf2, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChatsStatusDto[] newArray(int i) {
            return new GroupsChatsStatusDto[i];
        }
    }

    public GroupsChatsStatusDto(boolean z, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.isEnabled = z;
        this.count = i;
        this.activityCount = num;
        this.canManage = bool;
        this.canCreate = bool2;
        this.canCreateRegularChat = bool3;
        this.canCreateDonutChat = bool4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChatsStatusDto)) {
            return false;
        }
        GroupsChatsStatusDto groupsChatsStatusDto = (GroupsChatsStatusDto) obj;
        return this.isEnabled == groupsChatsStatusDto.isEnabled && this.count == groupsChatsStatusDto.count && epx.f(this.activityCount, groupsChatsStatusDto.activityCount) && epx.f(this.canManage, groupsChatsStatusDto.canManage) && epx.f(this.canCreate, groupsChatsStatusDto.canCreate) && epx.f(this.canCreateRegularChat, groupsChatsStatusDto.canCreateRegularChat) && epx.f(this.canCreateDonutChat, groupsChatsStatusDto.canCreateDonutChat);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, Boolean.hashCode(this.isEnabled) * 31, 31);
        Integer num = this.activityCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canManage;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canCreate;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canCreateRegularChat;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canCreateDonutChat;
        return hashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsChatsStatusDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", activityCount=");
        sb.append(this.activityCount);
        sb.append(", canManage=");
        sb.append(this.canManage);
        sb.append(", canCreate=");
        sb.append(this.canCreate);
        sb.append(", canCreateRegularChat=");
        sb.append(this.canCreateRegularChat);
        sb.append(", canCreateDonutChat=");
        return tn.a(sb, this.canCreateDonutChat, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.count);
        Integer num = this.activityCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canManage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canCreate;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canCreateRegularChat;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canCreateDonutChat;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ GroupsChatsStatusDto(boolean z, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i2, zcl zclVar) {
        this(z, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : bool4);
    }
}

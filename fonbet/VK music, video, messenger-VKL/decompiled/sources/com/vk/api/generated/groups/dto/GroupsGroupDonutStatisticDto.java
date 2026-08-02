package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsGroupDonutStatisticDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutStatisticDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutStatisticDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final GroupsGroupDonutStatisticIconDto icon;

    @pmi0("show_friends")
    private final Boolean showFriends;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("value")
    private final Integer value;

    /* compiled from: GroupsGroupDonutStatisticDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutStatisticDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutStatisticDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            GroupsGroupDonutStatisticIconDto createFromParcel = GroupsGroupDonutStatisticIconDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLinkButtonActionDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel);
            Integer num = null;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsGroupDonutStatisticDto(readString, createFromParcel, valueOf, createFromParcel2, readString2, num);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutStatisticDto[] newArray(int i) {
            return new GroupsGroupDonutStatisticDto[i];
        }
    }

    public GroupsGroupDonutStatisticDto(String str, GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto, Boolean bool, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, Integer num) {
        this.description = str;
        this.icon = groupsGroupDonutStatisticIconDto;
        this.showFriends = bool;
        this.action = baseLinkButtonActionDto;
        this.trackCode = str2;
        this.value = num;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupDonutStatisticIconDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutStatisticDto)) {
            return false;
        }
        GroupsGroupDonutStatisticDto groupsGroupDonutStatisticDto = (GroupsGroupDonutStatisticDto) obj;
        return epx.f(this.description, groupsGroupDonutStatisticDto.description) && this.icon == groupsGroupDonutStatisticDto.icon && epx.f(this.showFriends, groupsGroupDonutStatisticDto.showFriends) && epx.f(this.action, groupsGroupDonutStatisticDto.action) && epx.f(this.trackCode, groupsGroupDonutStatisticDto.trackCode) && epx.f(this.value, groupsGroupDonutStatisticDto.value);
    }

    public final Boolean f() {
        return this.showFriends;
    }

    public final Integer g() {
        return this.value;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = (this.icon.hashCode() + (this.description.hashCode() * 31)) * 31;
        Boolean bool = this.showFriends;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode3 = (hashCode2 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.value;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutStatisticDto(description=");
        sb.append(this.description);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", showFriends=");
        sb.append(this.showFriends);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", value=");
        return uqi.b(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        this.icon.writeToParcel(parcel, i);
        Boolean bool = this.showFriends;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        if (baseLinkButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsGroupDonutStatisticDto(String str, GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto, Boolean bool, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, Integer num, int i, zcl zclVar) {
        this(str, groupsGroupDonutStatisticIconDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : baseLinkButtonActionDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num);
    }
}

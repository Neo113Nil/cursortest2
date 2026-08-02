package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutSubscriptionsStatisticDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionsStatisticDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionsStatisticDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("avatars")
    private final List<BaseImageDto> avatars;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final GroupsGroupDonutStatisticIconDto icon;

    @pmi0("type")
    private final GroupsGroupDonutSubscriptionsStatisticTypeDto type;

    /* compiled from: GroupsGroupDonutSubscriptionsStatisticDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionsStatisticDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsStatisticDto createFromParcel(Parcel parcel) {
            GroupsGroupDonutSubscriptionsStatisticTypeDto createFromParcel = GroupsGroupDonutSubscriptionsStatisticTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            ArrayList arrayList = null;
            BaseLinkButtonActionDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel);
            GroupsGroupDonutStatisticIconDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupsGroupDonutStatisticIconDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsGroupDonutSubscriptionsStatisticDto(createFromParcel, readString, createFromParcel2, createFromParcel3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsStatisticDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionsStatisticDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionsStatisticDto(GroupsGroupDonutSubscriptionsStatisticTypeDto groupsGroupDonutSubscriptionsStatisticTypeDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto, List<BaseImageDto> list) {
        this.type = groupsGroupDonutSubscriptionsStatisticTypeDto;
        this.description = str;
        this.action = baseLinkButtonActionDto;
        this.icon = groupsGroupDonutStatisticIconDto;
        this.avatars = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutSubscriptionsStatisticDto)) {
            return false;
        }
        GroupsGroupDonutSubscriptionsStatisticDto groupsGroupDonutSubscriptionsStatisticDto = (GroupsGroupDonutSubscriptionsStatisticDto) obj;
        return this.type == groupsGroupDonutSubscriptionsStatisticDto.type && epx.f(this.description, groupsGroupDonutSubscriptionsStatisticDto.description) && epx.f(this.action, groupsGroupDonutSubscriptionsStatisticDto.action) && this.icon == groupsGroupDonutSubscriptionsStatisticDto.icon && epx.f(this.avatars, groupsGroupDonutSubscriptionsStatisticDto.avatars);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.description);
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (a2 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto = this.icon;
        int hashCode2 = (hashCode + (groupsGroupDonutStatisticIconDto == null ? 0 : groupsGroupDonutStatisticIconDto.hashCode())) * 31;
        List<BaseImageDto> list = this.avatars;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutSubscriptionsStatisticDto(type=");
        sb.append(this.type);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", avatars=");
        return ms9.a(')', sb, this.avatars);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        if (baseLinkButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionDto.writeToParcel(parcel, i);
        }
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto = this.icon;
        if (groupsGroupDonutStatisticIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutStatisticIconDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.avatars;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutSubscriptionsStatisticDto(GroupsGroupDonutSubscriptionsStatisticTypeDto groupsGroupDonutSubscriptionsStatisticTypeDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto, List list, int i, zcl zclVar) {
        this(groupsGroupDonutSubscriptionsStatisticTypeDto, str, (i & 4) != 0 ? null : baseLinkButtonActionDto, (i & 8) != 0 ? null : groupsGroupDonutStatisticIconDto, (i & 16) != 0 ? null : list);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsActionButtonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsActionButtonDto> CREATOR = new a();

    @pmi0("action_type")
    private final GroupsActionButtonActionTypeDto actionType;

    @pmi0("button_type")
    private final Integer buttonType;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("target")
    private final GroupsActionButtonTargetDto target;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonDto createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            GroupsActionButtonActionTypeDto createFromParcel = parcel.readInt() == 0 ? null : GroupsActionButtonActionTypeDto.CREATOR.createFromParcel(parcel);
            GroupsActionButtonTargetDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsActionButtonTargetDto.CREATOR.createFromParcel(parcel);
            Integer num = null;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsActionButtonDto(z, createFromParcel, createFromParcel2, readString, num);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonDto[] newArray(int i) {
            return new GroupsActionButtonDto[i];
        }
    }

    public GroupsActionButtonDto(boolean z, GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto, GroupsActionButtonTargetDto groupsActionButtonTargetDto, String str, Integer num) {
        this.isEnabled = z;
        this.actionType = groupsActionButtonActionTypeDto;
        this.target = groupsActionButtonTargetDto;
        this.title = str;
        this.buttonType = num;
    }

    public final GroupsActionButtonActionTypeDto d() {
        return this.actionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsActionButtonTargetDto e() {
        return this.target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsActionButtonDto)) {
            return false;
        }
        GroupsActionButtonDto groupsActionButtonDto = (GroupsActionButtonDto) obj;
        return this.isEnabled == groupsActionButtonDto.isEnabled && this.actionType == groupsActionButtonDto.actionType && epx.f(this.target, groupsActionButtonDto.target) && epx.f(this.title, groupsActionButtonDto.title) && epx.f(this.buttonType, groupsActionButtonDto.buttonType);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto = this.actionType;
        int hashCode2 = (hashCode + (groupsActionButtonActionTypeDto == null ? 0 : groupsActionButtonActionTypeDto.hashCode())) * 31;
        GroupsActionButtonTargetDto groupsActionButtonTargetDto = this.target;
        int hashCode3 = (hashCode2 + (groupsActionButtonTargetDto == null ? 0 : groupsActionButtonTargetDto.hashCode())) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.buttonType;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsActionButtonDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", actionType=");
        sb.append(this.actionType);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", buttonType=");
        return uqi.b(sb, this.buttonType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto = this.actionType;
        if (groupsActionButtonActionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsActionButtonActionTypeDto.writeToParcel(parcel, i);
        }
        GroupsActionButtonTargetDto groupsActionButtonTargetDto = this.target;
        if (groupsActionButtonTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsActionButtonTargetDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        Integer num = this.buttonType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsActionButtonDto(boolean z, GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto, GroupsActionButtonTargetDto groupsActionButtonTargetDto, String str, Integer num, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : groupsActionButtonActionTypeDto, (i & 4) != 0 ? null : groupsActionButtonTargetDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
    }
}

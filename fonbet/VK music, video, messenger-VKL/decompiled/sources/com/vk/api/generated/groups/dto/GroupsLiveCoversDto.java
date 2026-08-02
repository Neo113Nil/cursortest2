package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsLiveCoversDto.kt */
/* loaded from: classes14.dex */
public final class GroupsLiveCoversDto implements Parcelable {
    public static final Parcelable.Creator<GroupsLiveCoversDto> CREATOR = new a();

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_scalable")
    private final Boolean isScalable;

    @pmi0("story_ids")
    private final List<String> storyIds;

    /* compiled from: GroupsLiveCoversDto.kt */
    public static final class a implements Parcelable.Creator<GroupsLiveCoversDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsLiveCoversDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsLiveCoversDto(z, valueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsLiveCoversDto[] newArray(int i) {
            return new GroupsLiveCoversDto[i];
        }
    }

    public GroupsLiveCoversDto(boolean z, Boolean bool, List<String> list) {
        this.isEnabled = z;
        this.isScalable = bool;
        this.storyIds = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLiveCoversDto)) {
            return false;
        }
        GroupsLiveCoversDto groupsLiveCoversDto = (GroupsLiveCoversDto) obj;
        return this.isEnabled == groupsLiveCoversDto.isEnabled && epx.f(this.isScalable, groupsLiveCoversDto.isScalable) && epx.f(this.storyIds, groupsLiveCoversDto.storyIds);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Boolean bool = this.isScalable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.storyIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsLiveCoversDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isScalable=");
        sb.append(this.isScalable);
        sb.append(", storyIds=");
        return ms9.a(')', sb, this.storyIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Boolean bool = this.isScalable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeStringList(this.storyIds);
    }

    public /* synthetic */ GroupsLiveCoversDto(boolean z, Boolean bool, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}

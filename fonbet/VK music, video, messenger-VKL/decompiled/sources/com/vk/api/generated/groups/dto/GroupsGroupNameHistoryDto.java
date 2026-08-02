package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupNameHistoryDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupNameHistoryDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupNameHistoryDto> CREATOR = new a();

    @pmi0("has_more")
    private final boolean hasMore;

    @pmi0("history")
    private final List<GroupsGroupNameHistoryActionDto> history;

    /* compiled from: GroupsGroupNameHistoryDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupNameHistoryDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupNameHistoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(GroupsGroupNameHistoryActionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsGroupNameHistoryDto(z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupNameHistoryDto[] newArray(int i) {
            return new GroupsGroupNameHistoryDto[i];
        }
    }

    public GroupsGroupNameHistoryDto(boolean z, List<GroupsGroupNameHistoryActionDto> list) {
        this.hasMore = z;
        this.history = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupNameHistoryDto)) {
            return false;
        }
        GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = (GroupsGroupNameHistoryDto) obj;
        return this.hasMore == groupsGroupNameHistoryDto.hasMore && epx.f(this.history, groupsGroupNameHistoryDto.history);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hasMore) * 31;
        List<GroupsGroupNameHistoryActionDto> list = this.history;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupNameHistoryDto(hasMore=");
        sb.append(this.hasMore);
        sb.append(", history=");
        return ms9.a(')', sb, this.history);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasMore ? 1 : 0);
        List<GroupsGroupNameHistoryActionDto> list = this.history;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsGroupNameHistoryActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupNameHistoryDto(boolean z, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list);
    }
}

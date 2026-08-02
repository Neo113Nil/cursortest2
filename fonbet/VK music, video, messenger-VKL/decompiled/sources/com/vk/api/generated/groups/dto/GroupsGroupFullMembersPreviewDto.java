package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupFullMembersPreviewDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullMembersPreviewDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupFullMembersPreviewDto> CREATOR = new a();

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("friends_ids")
    private final List<UserId> friendsIds;

    @pmi0("friends_preview")
    private final List<GroupsGroupFriendPreviewDto> friendsPreview;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("members_ids")
    private final List<UserId> membersIds;

    /* compiled from: GroupsGroupFullMembersPreviewDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullMembersPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullMembersPreviewDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(GroupsGroupFullMembersPreviewDto.class, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(GroupsGroupFullMembersPreviewDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(GroupsGroupFriendPreviewDto.CREATOR, parcel, arrayList6, i, 1);
                }
                arrayList3 = arrayList6;
            }
            return new GroupsGroupFullMembersPreviewDto(readInt, valueOf, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullMembersPreviewDto[] newArray(int i) {
            return new GroupsGroupFullMembersPreviewDto[i];
        }
    }

    public GroupsGroupFullMembersPreviewDto(int i, Integer num, List<UserId> list, List<UserId> list2, List<GroupsGroupFriendPreviewDto> list3) {
        this.membersCount = i;
        this.friendsCount = num;
        this.friendsIds = list;
        this.membersIds = list2;
        this.friendsPreview = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupFullMembersPreviewDto)) {
            return false;
        }
        GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = (GroupsGroupFullMembersPreviewDto) obj;
        return this.membersCount == groupsGroupFullMembersPreviewDto.membersCount && epx.f(this.friendsCount, groupsGroupFullMembersPreviewDto.friendsCount) && epx.f(this.friendsIds, groupsGroupFullMembersPreviewDto.friendsIds) && epx.f(this.membersIds, groupsGroupFullMembersPreviewDto.membersIds) && epx.f(this.friendsPreview, groupsGroupFullMembersPreviewDto.friendsPreview);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.membersCount) * 31;
        Integer num = this.friendsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<UserId> list = this.friendsIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserId> list2 = this.membersIds;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFriendPreviewDto> list3 = this.friendsPreview;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupFullMembersPreviewDto(membersCount=");
        sb.append(this.membersCount);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", friendsIds=");
        sb.append(this.friendsIds);
        sb.append(", membersIds=");
        sb.append(this.membersIds);
        sb.append(", friendsPreview=");
        return ms9.a(')', sb, this.friendsPreview);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.membersCount);
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.friendsIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UserId> list2 = this.membersIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFriendPreviewDto> list3 = this.friendsPreview;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((GroupsGroupFriendPreviewDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupFullMembersPreviewDto(int i, Integer num, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GroupsGroupLikeItemFriendsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupLikeItemFriendsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupLikeItemFriendsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("preview")
    private final List<UserId> preview;

    /* compiled from: GroupsGroupLikeItemFriendsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupLikeItemFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupLikeItemFriendsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGroupLikeItemFriendsDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsGroupLikeItemFriendsDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupLikeItemFriendsDto[] newArray(int i) {
            return new GroupsGroupLikeItemFriendsDto[i];
        }
    }

    public GroupsGroupLikeItemFriendsDto(int i, List<UserId> list) {
        this.count = i;
        this.preview = list;
    }

    public final List<UserId> d() {
        return this.preview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupLikeItemFriendsDto)) {
            return false;
        }
        GroupsGroupLikeItemFriendsDto groupsGroupLikeItemFriendsDto = (GroupsGroupLikeItemFriendsDto) obj;
        return this.count == groupsGroupLikeItemFriendsDto.count && epx.f(this.preview, groupsGroupLikeItemFriendsDto.preview);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.preview.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupLikeItemFriendsDto(count=");
        sb.append(this.count);
        sb.append(", preview=");
        return ms9.a(')', sb, this.preview);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.preview);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

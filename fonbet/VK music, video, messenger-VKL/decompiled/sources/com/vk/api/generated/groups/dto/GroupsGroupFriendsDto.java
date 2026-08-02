package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupFriendsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFriendsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupFriendsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("preview")
    private final List<UserId> preview;

    @pmi0("preview_profiles")
    private final List<GroupsGroupFriendPreviewProfileDto> previewProfiles;

    /* compiled from: GroupsGroupFriendsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(GroupsGroupFriendsDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(GroupsGroupFriendPreviewProfileDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new GroupsGroupFriendsDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendsDto[] newArray(int i) {
            return new GroupsGroupFriendsDto[i];
        }
    }

    public GroupsGroupFriendsDto(int i, List<UserId> list, List<GroupsGroupFriendPreviewProfileDto> list2) {
        this.count = i;
        this.preview = list;
        this.previewProfiles = list2;
    }

    public final List<UserId> d() {
        return this.preview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFriendPreviewProfileDto> e() {
        return this.previewProfiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupFriendsDto)) {
            return false;
        }
        GroupsGroupFriendsDto groupsGroupFriendsDto = (GroupsGroupFriendsDto) obj;
        return this.count == groupsGroupFriendsDto.count && epx.f(this.preview, groupsGroupFriendsDto.preview) && epx.f(this.previewProfiles, groupsGroupFriendsDto.previewProfiles);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.preview);
        List<GroupsGroupFriendPreviewProfileDto> list = this.previewProfiles;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupFriendsDto(count=");
        sb.append(this.count);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", previewProfiles=");
        return ms9.a(')', sb, this.previewProfiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.preview);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<GroupsGroupFriendPreviewProfileDto> list = this.previewProfiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsGroupFriendPreviewProfileDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupFriendsDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}

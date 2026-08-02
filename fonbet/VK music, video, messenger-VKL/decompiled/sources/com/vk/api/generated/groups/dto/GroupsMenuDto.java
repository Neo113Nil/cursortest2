package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsMenuDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMenuDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMenuDto> CREATOR = new a();

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("items")
    private final List<GroupsMenuItemDto> items;

    @pmi0("max_items")
    private final Integer maxItems;

    /* compiled from: GroupsMenuDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMenuDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMenuDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsMenuItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsMenuDto(arrayList, valueOf, valueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMenuDto[] newArray(int i) {
            return new GroupsMenuDto[i];
        }
    }

    public GroupsMenuDto() {
        this(null, null, null, null, 15, null);
    }

    public final Boolean d() {
        return this.canAdd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsMenuItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMenuDto)) {
            return false;
        }
        GroupsMenuDto groupsMenuDto = (GroupsMenuDto) obj;
        return epx.f(this.items, groupsMenuDto.items) && epx.f(this.isHidden, groupsMenuDto.isHidden) && epx.f(this.canAdd, groupsMenuDto.canAdd) && epx.f(this.maxItems, groupsMenuDto.maxItems);
    }

    public final Integer f() {
        return this.maxItems;
    }

    public final Boolean g() {
        return this.isHidden;
    }

    public final int hashCode() {
        List<GroupsMenuItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isHidden;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAdd;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.maxItems;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsMenuDto(items=");
        sb.append(this.items);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", maxItems=");
        return uqi.b(sb, this.maxItems, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupsMenuItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsMenuItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAdd;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.maxItems;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public GroupsMenuDto(List<GroupsMenuItemDto> list, Boolean bool, Boolean bool2, Integer num) {
        this.items = list;
        this.isHidden = bool;
        this.canAdd = bool2;
        this.maxItems = num;
    }

    public /* synthetic */ GroupsMenuDto(List list, Boolean bool, Boolean bool2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num);
    }
}

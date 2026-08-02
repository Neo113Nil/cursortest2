package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.tabbar.dto.TabbarItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersNavigationTabbarDto.kt */
/* loaded from: classes15.dex */
public final class UsersNavigationTabbarDto implements Parcelable {
    public static final Parcelable.Creator<UsersNavigationTabbarDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("is_title_visible")
    private final boolean isTitleVisible;

    @pmi0("items")
    private final List<TabbarItemDto> items;

    /* compiled from: UsersNavigationTabbarDto.kt */
    public static final class a implements Parcelable.Creator<UsersNavigationTabbarDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersNavigationTabbarDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(TabbarItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(UsersNavigationTabbarDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new UsersNavigationTabbarDto(z, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersNavigationTabbarDto[] newArray(int i) {
            return new UsersNavigationTabbarDto[i];
        }
    }

    public UsersNavigationTabbarDto(boolean z, List<TabbarItemDto> list, List<GroupsGroupFullDto> list2) {
        this.isTitleVisible = z;
        this.items = list;
        this.groups = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersNavigationTabbarDto)) {
            return false;
        }
        UsersNavigationTabbarDto usersNavigationTabbarDto = (UsersNavigationTabbarDto) obj;
        return this.isTitleVisible == usersNavigationTabbarDto.isTitleVisible && epx.f(this.items, usersNavigationTabbarDto.items) && epx.f(this.groups, usersNavigationTabbarDto.groups);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isTitleVisible) * 31;
        List<TabbarItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersNavigationTabbarDto(isTitleVisible=");
        sb.append(this.isTitleVisible);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isTitleVisible ? 1 : 0);
        List<TabbarItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((TabbarItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ UsersNavigationTabbarDto(boolean z, List list, List list2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}

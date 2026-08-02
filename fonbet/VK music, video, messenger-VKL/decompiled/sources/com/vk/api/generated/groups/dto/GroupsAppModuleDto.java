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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAppModuleDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAppModuleDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAppModuleDto> CREATOR = new a();

    @pmi0("apps_link")
    private final String appsLink;

    @pmi0("items")
    private final List<GroupsAppModuleItemDto> items;

    @pmi0("title")
    private final String title;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: GroupsAppModuleDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAppModuleDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAppModuleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsAppModuleItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsAppModuleDto(valueOf, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAppModuleDto[] newArray(int i) {
            return new GroupsAppModuleDto[i];
        }
    }

    public GroupsAppModuleDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAppModuleDto)) {
            return false;
        }
        GroupsAppModuleDto groupsAppModuleDto = (GroupsAppModuleDto) obj;
        return epx.f(this.totalCount, groupsAppModuleDto.totalCount) && epx.f(this.appsLink, groupsAppModuleDto.appsLink) && epx.f(this.title, groupsAppModuleDto.title) && epx.f(this.items, groupsAppModuleDto.items);
    }

    public final int hashCode() {
        Integer num = this.totalCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.appsLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GroupsAppModuleItemDto> list = this.items;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAppModuleDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", appsLink=");
        sb.append(this.appsLink);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.appsLink);
        parcel.writeString(this.title);
        List<GroupsAppModuleItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsAppModuleItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsAppModuleDto(Integer num, String str, String str2, List<GroupsAppModuleItemDto> list) {
        this.totalCount = num;
        this.appsLink = str;
        this.title = str2;
        this.items = list;
    }

    public /* synthetic */ GroupsAppModuleDto(Integer num, String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsRecommendedTipsListCategoryDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRecommendedTipsListCategoryDto implements Parcelable {
    public static final Parcelable.Creator<GroupsRecommendedTipsListCategoryDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("tips")
    private final List<GroupsRecommendedTipsListItemDto> tips;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsRecommendedTipsListCategoryDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRecommendedTipsListCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListCategoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsRecommendedTipsListItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsRecommendedTipsListCategoryDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListCategoryDto[] newArray(int i) {
            return new GroupsRecommendedTipsListCategoryDto[i];
        }
    }

    public GroupsRecommendedTipsListCategoryDto(String str, String str2, List<GroupsRecommendedTipsListItemDto> list) {
        this.name = str;
        this.title = str2;
        this.tips = list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsRecommendedTipsListItemDto> e() {
        return this.tips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsRecommendedTipsListCategoryDto)) {
            return false;
        }
        GroupsRecommendedTipsListCategoryDto groupsRecommendedTipsListCategoryDto = (GroupsRecommendedTipsListCategoryDto) obj;
        return epx.f(this.name, groupsRecommendedTipsListCategoryDto.name) && epx.f(this.title, groupsRecommendedTipsListCategoryDto.title) && epx.f(this.tips, groupsRecommendedTipsListCategoryDto.tips);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.title);
        List<GroupsRecommendedTipsListItemDto> list = this.tips;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsRecommendedTipsListCategoryDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", tips=");
        return ms9.a(')', sb, this.tips);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        List<GroupsRecommendedTipsListItemDto> list = this.tips;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsRecommendedTipsListItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsRecommendedTipsListCategoryDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}

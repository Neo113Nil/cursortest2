package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
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
import xsna.shy;
import xsna.zcl;

/* compiled from: GroupsGetRecommendedGroupsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetRecommendedGroupsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetRecommendedGroupsResponseDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsSuggestionDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<GroupsProfileItemDto> profiles;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGetRecommendedGroupsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetRecommendedGroupsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetRecommendedGroupsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(GroupsSuggestionDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(GroupsGetRecommendedGroupsResponseDto.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(GroupsGetRecommendedGroupsResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new GroupsGetRecommendedGroupsResponseDto(readString, arrayList2, readInt2, baseLinkButtonDto, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetRecommendedGroupsResponseDto[] newArray(int i) {
            return new GroupsGetRecommendedGroupsResponseDto[i];
        }
    }

    public GroupsGetRecommendedGroupsResponseDto(String str, List<GroupsSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, String str2, List<GroupsProfileItemDto> list2) {
        this.title = str;
        this.items = list;
        this.count = i;
        this.button = baseLinkButtonDto;
        this.nextFrom = str2;
        this.profiles = list2;
    }

    public final List<GroupsSuggestionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetRecommendedGroupsResponseDto)) {
            return false;
        }
        GroupsGetRecommendedGroupsResponseDto groupsGetRecommendedGroupsResponseDto = (GroupsGetRecommendedGroupsResponseDto) obj;
        return epx.f(this.title, groupsGetRecommendedGroupsResponseDto.title) && epx.f(this.items, groupsGetRecommendedGroupsResponseDto.items) && this.count == groupsGetRecommendedGroupsResponseDto.count && epx.f(this.button, groupsGetRecommendedGroupsResponseDto.button) && epx.f(this.nextFrom, groupsGetRecommendedGroupsResponseDto.nextFrom) && epx.f(this.profiles, groupsGetRecommendedGroupsResponseDto.profiles);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + shy.a(this.count, fw3.a(this.title.hashCode() * 31, 31, this.items), 31)) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsProfileItemDto> list = this.profiles;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetRecommendedGroupsResponseDto(title=");
        sb.append(this.title);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GroupsSuggestionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.button, i);
        parcel.writeString(this.nextFrom);
        List<GroupsProfileItemDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ GroupsGetRecommendedGroupsResponseDto(String str, List list, int i, BaseLinkButtonDto baseLinkButtonDto, String str2, List list2, int i2, zcl zclVar) {
        this(str, list, i, baseLinkButtonDto, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : list2);
    }
}

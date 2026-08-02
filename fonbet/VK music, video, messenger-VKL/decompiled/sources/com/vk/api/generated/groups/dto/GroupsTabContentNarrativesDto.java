package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentNarrativesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentNarrativesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentNarrativesDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("count_stories")
    private final Integer countStories;

    @pmi0("items")
    private final List<NarrativesNarrativeDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentNarrativesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentNarrativesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentNarrativesDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(GroupsTabContentNarrativesDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsTabContentNarrativesDto(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentNarrativesDto[] newArray(int i) {
            return new GroupsTabContentNarrativesDto[i];
        }
    }

    public GroupsTabContentNarrativesDto(List<NarrativesNarrativeDto> list, boolean z, Integer num, Integer num2, String str) {
        this.items = list;
        this.canAdd = z;
        this.countStories = num;
        this.count = num2;
        this.nextFrom = str;
    }

    public final List<NarrativesNarrativeDto> d() {
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
        if (!(obj instanceof GroupsTabContentNarrativesDto)) {
            return false;
        }
        GroupsTabContentNarrativesDto groupsTabContentNarrativesDto = (GroupsTabContentNarrativesDto) obj;
        return epx.f(this.items, groupsTabContentNarrativesDto.items) && this.canAdd == groupsTabContentNarrativesDto.canAdd && epx.f(this.countStories, groupsTabContentNarrativesDto.countStories) && epx.f(this.count, groupsTabContentNarrativesDto.count) && epx.f(this.nextFrom, groupsTabContentNarrativesDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        Integer num = this.countStories;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentNarrativesDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", countStories=");
        sb.append(this.countStories);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        Integer num = this.countStories;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentNarrativesDto(List list, boolean z, Integer num, Integer num2, String str, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str);
    }
}

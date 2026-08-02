package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.textlives.dto.TextlivesTextlivePreviewDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentTextlivesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentTextlivesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentTextlivesDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<TextlivesTextlivePreviewDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentTextlivesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentTextlivesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentTextlivesDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(TextlivesTextlivePreviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsTabContentTextlivesDto(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentTextlivesDto[] newArray(int i) {
            return new GroupsTabContentTextlivesDto[i];
        }
    }

    public GroupsTabContentTextlivesDto(List<TextlivesTextlivePreviewDto> list, boolean z, Integer num, String str) {
        this.items = list;
        this.canAdd = z;
        this.count = num;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentTextlivesDto)) {
            return false;
        }
        GroupsTabContentTextlivesDto groupsTabContentTextlivesDto = (GroupsTabContentTextlivesDto) obj;
        return epx.f(this.items, groupsTabContentTextlivesDto.items) && this.canAdd == groupsTabContentTextlivesDto.canAdd && epx.f(this.count, groupsTabContentTextlivesDto.count) && epx.f(this.nextFrom, groupsTabContentTextlivesDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        Integer num = this.count;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentTextlivesDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((TextlivesTextlivePreviewDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentTextlivesDto(List list, boolean z, Integer num, String str, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}

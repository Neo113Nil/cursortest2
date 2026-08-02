package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: GroupsTabContentChatsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentChatsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentChatsDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("create_modal_params")
    private final GroupsModalParamsChatCreateDto createModalParams;

    @pmi0("items")
    private final List<GroupsChatDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentChatsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentChatsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentChatsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GroupsChatDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsTabContentChatsDto(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : GroupsModalParamsChatCreateDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentChatsDto[] newArray(int i) {
            return new GroupsTabContentChatsDto[i];
        }
    }

    public GroupsTabContentChatsDto(List<GroupsChatDto> list, boolean z, GroupsModalParamsChatCreateDto groupsModalParamsChatCreateDto, Integer num, String str) {
        this.items = list;
        this.canAdd = z;
        this.createModalParams = groupsModalParamsChatCreateDto;
        this.count = num;
        this.nextFrom = str;
    }

    public final List<GroupsChatDto> d() {
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
        if (!(obj instanceof GroupsTabContentChatsDto)) {
            return false;
        }
        GroupsTabContentChatsDto groupsTabContentChatsDto = (GroupsTabContentChatsDto) obj;
        return epx.f(this.items, groupsTabContentChatsDto.items) && this.canAdd == groupsTabContentChatsDto.canAdd && epx.f(this.createModalParams, groupsTabContentChatsDto.createModalParams) && epx.f(this.count, groupsTabContentChatsDto.count) && epx.f(this.nextFrom, groupsTabContentChatsDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        GroupsModalParamsChatCreateDto groupsModalParamsChatCreateDto = this.createModalParams;
        int hashCode = (b + (groupsModalParamsChatCreateDto == null ? 0 : groupsModalParamsChatCreateDto.hashCode())) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentChatsDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", createModalParams=");
        sb.append(this.createModalParams);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GroupsChatDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        GroupsModalParamsChatCreateDto groupsModalParamsChatCreateDto = this.createModalParams;
        if (groupsModalParamsChatCreateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsModalParamsChatCreateDto.writeToParcel(parcel, i);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentChatsDto(List list, boolean z, GroupsModalParamsChatCreateDto groupsModalParamsChatCreateDto, Integer num, String str, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : groupsModalParamsChatCreateDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str);
    }
}

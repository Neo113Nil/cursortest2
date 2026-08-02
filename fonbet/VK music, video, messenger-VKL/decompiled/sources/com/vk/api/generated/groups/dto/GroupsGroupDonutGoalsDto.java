package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.donut.dto.DonutGoalDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: GroupsGroupDonutGoalsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutGoalsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutGoalsDto> CREATOR = new a();

    @pmi0("all_button")
    private final BaseLinkButtonDto allButton;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DonutGoalDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutGoalsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutGoalsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutGoalsDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(DonutGoalDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGroupDonutGoalsDto(readString, readInt, arrayList, parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutGoalsDto[] newArray(int i) {
            return new GroupsGroupDonutGoalsDto[i];
        }
    }

    public GroupsGroupDonutGoalsDto(String str, int i, List<DonutGoalDto> list, BaseLinkButtonDto baseLinkButtonDto) {
        this.title = str;
        this.count = i;
        this.items = list;
        this.allButton = baseLinkButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutGoalsDto)) {
            return false;
        }
        GroupsGroupDonutGoalsDto groupsGroupDonutGoalsDto = (GroupsGroupDonutGoalsDto) obj;
        return epx.f(this.title, groupsGroupDonutGoalsDto.title) && this.count == groupsGroupDonutGoalsDto.count && epx.f(this.items, groupsGroupDonutGoalsDto.items) && epx.f(this.allButton, groupsGroupDonutGoalsDto.allButton);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.count, this.title.hashCode() * 31, 31), 31, this.items);
        BaseLinkButtonDto baseLinkButtonDto = this.allButton;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "GroupsGroupDonutGoalsDto(title=" + this.title + ", count=" + this.count + ", items=" + this.items + ", allButton=" + this.allButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((DonutGoalDto) a2.next()).writeToParcel(parcel, i);
        }
        BaseLinkButtonDto baseLinkButtonDto = this.allButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutGoalsDto(String str, int i, List list, BaseLinkButtonDto baseLinkButtonDto, int i2, zcl zclVar) {
        this(str, i, list, (i2 & 8) != 0 ? null : baseLinkButtonDto);
    }
}

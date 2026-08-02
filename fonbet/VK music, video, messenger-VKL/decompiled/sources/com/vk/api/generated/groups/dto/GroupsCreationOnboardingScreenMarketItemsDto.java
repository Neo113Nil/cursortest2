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

/* compiled from: GroupsCreationOnboardingScreenMarketItemsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenMarketItemsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenMarketItemsDto> CREATOR = new a();

    @pmi0("additional_modal")
    private final GroupsCreationOnboardingScreenModalDto additionalModal;

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("conditions")
    private final List<GroupsCreationOnboardingScreenConditionDto> conditions;

    @pmi0("image")
    private final String image;

    @pmi0("modal")
    private final GroupsCreationOnboardingScreenModalDto modal;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("tooltip")
    private final GroupsCreationOnboardingScreenTooltipDto tooltip;

    /* compiled from: GroupsCreationOnboardingScreenMarketItemsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenMarketItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenMarketItemsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            GroupsCreationOnboardingScreenButtonDto createFromParcel = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenButtonDto.CREATOR.createFromParcel(parcel);
            GroupsCreationOnboardingScreenModalDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenModalDto.CREATOR.createFromParcel(parcel);
            GroupsCreationOnboardingScreenModalDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenModalDto.CREATOR.createFromParcel(parcel);
            GroupsCreationOnboardingScreenTooltipDto createFromParcel4 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenTooltipDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsCreationOnboardingScreenConditionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsCreationOnboardingScreenMarketItemsDto(readString, readString2, readString3, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenMarketItemsDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenMarketItemsDto[i];
        }
    }

    public GroupsCreationOnboardingScreenMarketItemsDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto2, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto, List<GroupsCreationOnboardingScreenConditionDto> list) {
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.button = groupsCreationOnboardingScreenButtonDto;
        this.modal = groupsCreationOnboardingScreenModalDto;
        this.additionalModal = groupsCreationOnboardingScreenModalDto2;
        this.tooltip = groupsCreationOnboardingScreenTooltipDto;
        this.conditions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenMarketItemsDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenMarketItemsDto groupsCreationOnboardingScreenMarketItemsDto = (GroupsCreationOnboardingScreenMarketItemsDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenMarketItemsDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenMarketItemsDto.subtitle) && epx.f(this.image, groupsCreationOnboardingScreenMarketItemsDto.image) && epx.f(this.button, groupsCreationOnboardingScreenMarketItemsDto.button) && epx.f(this.modal, groupsCreationOnboardingScreenMarketItemsDto.modal) && epx.f(this.additionalModal, groupsCreationOnboardingScreenMarketItemsDto.additionalModal) && epx.f(this.tooltip, groupsCreationOnboardingScreenMarketItemsDto.tooltip) && epx.f(this.conditions, groupsCreationOnboardingScreenMarketItemsDto.conditions);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        int hashCode = (a2 + (groupsCreationOnboardingScreenButtonDto == null ? 0 : groupsCreationOnboardingScreenButtonDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto = this.modal;
        int hashCode2 = (hashCode + (groupsCreationOnboardingScreenModalDto == null ? 0 : groupsCreationOnboardingScreenModalDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto2 = this.additionalModal;
        int hashCode3 = (hashCode2 + (groupsCreationOnboardingScreenModalDto2 == null ? 0 : groupsCreationOnboardingScreenModalDto2.hashCode())) * 31;
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        int hashCode4 = (hashCode3 + (groupsCreationOnboardingScreenTooltipDto == null ? 0 : groupsCreationOnboardingScreenTooltipDto.hashCode())) * 31;
        List<GroupsCreationOnboardingScreenConditionDto> list = this.conditions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenMarketItemsDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", modal=");
        sb.append(this.modal);
        sb.append(", additionalModal=");
        sb.append(this.additionalModal);
        sb.append(", tooltip=");
        sb.append(this.tooltip);
        sb.append(", conditions=");
        return ms9.a(')', sb, this.conditions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        if (groupsCreationOnboardingScreenButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenButtonDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto = this.modal;
        if (groupsCreationOnboardingScreenModalDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenModalDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto2 = this.additionalModal;
        if (groupsCreationOnboardingScreenModalDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenModalDto2.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        if (groupsCreationOnboardingScreenTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenTooltipDto.writeToParcel(parcel, i);
        }
        List<GroupsCreationOnboardingScreenConditionDto> list = this.conditions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsCreationOnboardingScreenConditionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenMarketItemsDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto2, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto, (i & 16) != 0 ? null : groupsCreationOnboardingScreenModalDto, (i & 32) != 0 ? null : groupsCreationOnboardingScreenModalDto2, (i & 64) != 0 ? null : groupsCreationOnboardingScreenTooltipDto, (i & 128) != 0 ? null : list);
    }
}

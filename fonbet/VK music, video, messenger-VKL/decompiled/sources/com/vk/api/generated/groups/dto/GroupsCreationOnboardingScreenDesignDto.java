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

/* compiled from: GroupsCreationOnboardingScreenDesignDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenDesignDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenDesignDto> CREATOR = new a();

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("conditions")
    private final List<GroupsCreationOnboardingScreenConditionDto> conditions;

    @pmi0("modal")
    private final GroupsCreationOnboardingScreenModalDto modal;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final GroupsCreationOnboardingScreenValueObjectDto value;

    /* compiled from: GroupsCreationOnboardingScreenDesignDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenDesignDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenDesignDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            GroupsCreationOnboardingScreenValueObjectDto createFromParcel = GroupsCreationOnboardingScreenValueObjectDto.CREATOR.createFromParcel(parcel);
            GroupsCreationOnboardingScreenButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenButtonDto.CREATOR.createFromParcel(parcel);
            GroupsCreationOnboardingScreenModalDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenModalDto.CREATOR.createFromParcel(parcel);
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
            return new GroupsCreationOnboardingScreenDesignDto(readString, readString2, createFromParcel, createFromParcel2, createFromParcel3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenDesignDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenDesignDto[i];
        }
    }

    public GroupsCreationOnboardingScreenDesignDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, List<GroupsCreationOnboardingScreenConditionDto> list) {
        this.title = str;
        this.subtitle = str2;
        this.value = groupsCreationOnboardingScreenValueObjectDto;
        this.button = groupsCreationOnboardingScreenButtonDto;
        this.modal = groupsCreationOnboardingScreenModalDto;
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
        if (!(obj instanceof GroupsCreationOnboardingScreenDesignDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenDesignDto groupsCreationOnboardingScreenDesignDto = (GroupsCreationOnboardingScreenDesignDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenDesignDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenDesignDto.subtitle) && epx.f(this.value, groupsCreationOnboardingScreenDesignDto.value) && epx.f(this.button, groupsCreationOnboardingScreenDesignDto.button) && epx.f(this.modal, groupsCreationOnboardingScreenDesignDto.modal) && epx.f(this.conditions, groupsCreationOnboardingScreenDesignDto.conditions);
    }

    public final int hashCode() {
        int hashCode = (this.value.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        int hashCode2 = (hashCode + (groupsCreationOnboardingScreenButtonDto == null ? 0 : groupsCreationOnboardingScreenButtonDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto = this.modal;
        int hashCode3 = (hashCode2 + (groupsCreationOnboardingScreenModalDto == null ? 0 : groupsCreationOnboardingScreenModalDto.hashCode())) * 31;
        List<GroupsCreationOnboardingScreenConditionDto> list = this.conditions;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenDesignDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", modal=");
        sb.append(this.modal);
        sb.append(", conditions=");
        return ms9.a(')', sb, this.conditions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.value.writeToParcel(parcel, i);
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

    public /* synthetic */ GroupsCreationOnboardingScreenDesignDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, List list, int i, zcl zclVar) {
        this(str, str2, groupsCreationOnboardingScreenValueObjectDto, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto, (i & 16) != 0 ? null : groupsCreationOnboardingScreenModalDto, (i & 32) != 0 ? null : list);
    }
}

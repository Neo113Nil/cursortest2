package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenSubscribersDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenSubscribersDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenSubscribersDto> CREATOR = new a();

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("modal")
    private final GroupsCreationOnboardingScreenModalDto modal;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<GroupsCreationOnboardingScreenOptionDto> options;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("tooltip")
    private final GroupsCreationOnboardingScreenTooltipDto tooltip;

    @pmi0("value")
    private final GroupsCreationOnboardingScreenValueObjectDto value;

    /* compiled from: GroupsCreationOnboardingScreenSubscribersDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenSubscribersDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenSubscribersDto createFromParcel(Parcel parcel) {
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
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsCreationOnboardingScreenOptionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsCreationOnboardingScreenSubscribersDto(readString, readString2, createFromParcel, createFromParcel2, createFromParcel3, arrayList, parcel.readInt() != 0 ? GroupsCreationOnboardingScreenTooltipDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenSubscribersDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenSubscribersDto[i];
        }
    }

    public GroupsCreationOnboardingScreenSubscribersDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, List<GroupsCreationOnboardingScreenOptionDto> list, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto) {
        this.title = str;
        this.subtitle = str2;
        this.value = groupsCreationOnboardingScreenValueObjectDto;
        this.button = groupsCreationOnboardingScreenButtonDto;
        this.modal = groupsCreationOnboardingScreenModalDto;
        this.options = list;
        this.tooltip = groupsCreationOnboardingScreenTooltipDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenSubscribersDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenSubscribersDto groupsCreationOnboardingScreenSubscribersDto = (GroupsCreationOnboardingScreenSubscribersDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenSubscribersDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenSubscribersDto.subtitle) && epx.f(this.value, groupsCreationOnboardingScreenSubscribersDto.value) && epx.f(this.button, groupsCreationOnboardingScreenSubscribersDto.button) && epx.f(this.modal, groupsCreationOnboardingScreenSubscribersDto.modal) && epx.f(this.options, groupsCreationOnboardingScreenSubscribersDto.options) && epx.f(this.tooltip, groupsCreationOnboardingScreenSubscribersDto.tooltip);
    }

    public final int hashCode() {
        int hashCode = (this.value.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        int hashCode2 = (hashCode + (groupsCreationOnboardingScreenButtonDto == null ? 0 : groupsCreationOnboardingScreenButtonDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto = this.modal;
        int hashCode3 = (hashCode2 + (groupsCreationOnboardingScreenModalDto == null ? 0 : groupsCreationOnboardingScreenModalDto.hashCode())) * 31;
        List<GroupsCreationOnboardingScreenOptionDto> list = this.options;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        return hashCode4 + (groupsCreationOnboardingScreenTooltipDto != null ? groupsCreationOnboardingScreenTooltipDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsCreationOnboardingScreenSubscribersDto(title=" + this.title + ", subtitle=" + this.subtitle + ", value=" + this.value + ", button=" + this.button + ", modal=" + this.modal + ", options=" + this.options + ", tooltip=" + this.tooltip + ')';
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
        List<GroupsCreationOnboardingScreenOptionDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsCreationOnboardingScreenOptionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        if (groupsCreationOnboardingScreenTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenTooltipDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenSubscribersDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto, List list, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto, int i, zcl zclVar) {
        this(str, str2, groupsCreationOnboardingScreenValueObjectDto, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto, (i & 16) != 0 ? null : groupsCreationOnboardingScreenModalDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : groupsCreationOnboardingScreenTooltipDto);
    }
}

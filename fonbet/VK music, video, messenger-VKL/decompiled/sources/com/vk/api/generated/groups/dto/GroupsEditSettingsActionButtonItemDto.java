package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsEditSettingsActionButtonItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsActionButtonItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditSettingsActionButtonItemDto> CREATOR = new a();

    @pmi0("action_type")
    private final String actionType;

    @pmi0("button_types")
    private final List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> buttonTypes;

    @pmi0("params")
    private final List<GroupsEditSettingsActionButtonParamItemDto> params;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsEditSettingsActionButtonItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsActionButtonItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(GroupsEditSettingsActionButtonParamSelectorValueItemDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(GroupsEditSettingsActionButtonParamItemDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new GroupsEditSettingsActionButtonItemDto(readString, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonItemDto[] newArray(int i) {
            return new GroupsEditSettingsActionButtonItemDto[i];
        }
    }

    public GroupsEditSettingsActionButtonItemDto(String str, List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> list, List<GroupsEditSettingsActionButtonParamItemDto> list2, String str2) {
        this.actionType = str;
        this.buttonTypes = list;
        this.params = list2;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEditSettingsActionButtonItemDto)) {
            return false;
        }
        GroupsEditSettingsActionButtonItemDto groupsEditSettingsActionButtonItemDto = (GroupsEditSettingsActionButtonItemDto) obj;
        return epx.f(this.actionType, groupsEditSettingsActionButtonItemDto.actionType) && epx.f(this.buttonTypes, groupsEditSettingsActionButtonItemDto.buttonTypes) && epx.f(this.params, groupsEditSettingsActionButtonItemDto.params) && epx.f(this.title, groupsEditSettingsActionButtonItemDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + fw3.a(fw3.a(this.actionType.hashCode() * 31, 31, this.buttonTypes), 31, this.params);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEditSettingsActionButtonItemDto(actionType=");
        sb.append(this.actionType);
        sb.append(", buttonTypes=");
        sb.append(this.buttonTypes);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionType);
        Iterator a2 = ao.a(parcel, this.buttonTypes);
        while (a2.hasNext()) {
            ((GroupsEditSettingsActionButtonParamSelectorValueItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.params);
        while (a3.hasNext()) {
            ((GroupsEditSettingsActionButtonParamItemDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
    }
}

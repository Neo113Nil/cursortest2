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
import xsna.zcl;

/* compiled from: GroupsEditSettingsActionButtonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditSettingsActionButtonDto> CREATOR = new a();

    @pmi0("action_buttons")
    private final List<GroupsEditSettingsActionButtonItemDto> actionButtons;

    /* compiled from: GroupsEditSettingsActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsEditSettingsActionButtonItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsEditSettingsActionButtonDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonDto[] newArray(int i) {
            return new GroupsEditSettingsActionButtonDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsEditSettingsActionButtonDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsEditSettingsActionButtonDto) && epx.f(this.actionButtons, ((GroupsEditSettingsActionButtonDto) obj).actionButtons);
    }

    public final int hashCode() {
        List<GroupsEditSettingsActionButtonItemDto> list = this.actionButtons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GroupsEditSettingsActionButtonDto(actionButtons="), this.actionButtons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupsEditSettingsActionButtonItemDto> list = this.actionButtons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsEditSettingsActionButtonItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsEditSettingsActionButtonDto(List<GroupsEditSettingsActionButtonItemDto> list) {
        this.actionButtons = list;
    }

    public /* synthetic */ GroupsEditSettingsActionButtonDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsEditSettingsActionButtonParamSelectorValueItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsActionButtonParamSelectorValueItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditSettingsActionButtonParamSelectorValueItemDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final Integer value;

    /* compiled from: GroupsEditSettingsActionButtonParamSelectorValueItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsActionButtonParamSelectorValueItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonParamSelectorValueItemDto createFromParcel(Parcel parcel) {
            return new GroupsEditSettingsActionButtonParamSelectorValueItemDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonParamSelectorValueItemDto[] newArray(int i) {
            return new GroupsEditSettingsActionButtonParamSelectorValueItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsEditSettingsActionButtonParamSelectorValueItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEditSettingsActionButtonParamSelectorValueItemDto)) {
            return false;
        }
        GroupsEditSettingsActionButtonParamSelectorValueItemDto groupsEditSettingsActionButtonParamSelectorValueItemDto = (GroupsEditSettingsActionButtonParamSelectorValueItemDto) obj;
        return epx.f(this.title, groupsEditSettingsActionButtonParamSelectorValueItemDto.title) && epx.f(this.value, groupsEditSettingsActionButtonParamSelectorValueItemDto.value);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.value;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEditSettingsActionButtonParamSelectorValueItemDto(title=");
        sb.append(this.title);
        sb.append(", value=");
        return uqi.b(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public GroupsEditSettingsActionButtonParamSelectorValueItemDto(String str, Integer num) {
        this.title = str;
        this.value = num;
    }

    public /* synthetic */ GroupsEditSettingsActionButtonParamSelectorValueItemDto(String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}

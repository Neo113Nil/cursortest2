package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsNotificationSettingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsNotificationSettingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsNotificationSettingDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final String name;

    @pmi0("type_name")
    private final String typeName;

    /* compiled from: GroupsNotificationSettingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsNotificationSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsNotificationSettingDto createFromParcel(Parcel parcel) {
            return new GroupsNotificationSettingDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsNotificationSettingDto[] newArray(int i) {
            return new GroupsNotificationSettingDto[i];
        }
    }

    public GroupsNotificationSettingDto(int i, String str, String str2, boolean z) {
        this.id = i;
        this.name = str;
        this.typeName = str2;
        this.isEnabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsNotificationSettingDto)) {
            return false;
        }
        GroupsNotificationSettingDto groupsNotificationSettingDto = (GroupsNotificationSettingDto) obj;
        return this.id == groupsNotificationSettingDto.id && epx.f(this.name, groupsNotificationSettingDto.name) && epx.f(this.typeName, groupsNotificationSettingDto.typeName) && this.isEnabled == groupsNotificationSettingDto.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled) + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.typeName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsNotificationSettingDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", typeName=");
        sb.append(this.typeName);
        sb.append(", isEnabled=");
        return q0.a(sb, this.isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.typeName);
        parcel.writeInt(this.isEnabled ? 1 : 0);
    }
}

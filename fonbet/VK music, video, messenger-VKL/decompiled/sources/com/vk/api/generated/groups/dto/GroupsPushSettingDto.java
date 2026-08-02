package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsPushSettingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsPushSettingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsPushSettingDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("name")
    private final String name;

    @pmi0("no_sound")
    private final Boolean noSound;

    @pmi0("no_text")
    private final Boolean noText;

    /* compiled from: GroupsPushSettingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsPushSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsPushSettingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsPushSettingDto(readString, z, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsPushSettingDto[] newArray(int i) {
            return new GroupsPushSettingDto[i];
        }
    }

    public GroupsPushSettingDto(String str, boolean z, Boolean bool, Boolean bool2) {
        this.name = str;
        this.enabled = z;
        this.noSound = bool;
        this.noText = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPushSettingDto)) {
            return false;
        }
        GroupsPushSettingDto groupsPushSettingDto = (GroupsPushSettingDto) obj;
        return epx.f(this.name, groupsPushSettingDto.name) && this.enabled == groupsPushSettingDto.enabled && epx.f(this.noSound, groupsPushSettingDto.noSound) && epx.f(this.noText, groupsPushSettingDto.noText);
    }

    public final int hashCode() {
        int b = qoy.b(this.name.hashCode() * 31, 31, this.enabled);
        Boolean bool = this.noSound;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.noText;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsPushSettingDto(name=");
        sb.append(this.name);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", noSound=");
        sb.append(this.noSound);
        sb.append(", noText=");
        return tn.a(sb, this.noText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.enabled ? 1 : 0);
        Boolean bool = this.noSound;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.noText;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ GroupsPushSettingDto(String str, boolean z, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}

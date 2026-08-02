package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsViewSettingsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsViewSettingsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsViewSettingsDto> CREATOR = new a();

    @pmi0("market_section_settings_link")
    private final String marketSectionSettingsLink;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsViewSettingsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsViewSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsViewSettingsDto createFromParcel(Parcel parcel) {
            return new GroupsViewSettingsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsViewSettingsDto[] newArray(int i) {
            return new GroupsViewSettingsDto[i];
        }
    }

    public GroupsViewSettingsDto(String str, String str2) {
        this.title = str;
        this.marketSectionSettingsLink = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsViewSettingsDto)) {
            return false;
        }
        GroupsViewSettingsDto groupsViewSettingsDto = (GroupsViewSettingsDto) obj;
        return epx.f(this.title, groupsViewSettingsDto.title) && epx.f(this.marketSectionSettingsLink, groupsViewSettingsDto.marketSectionSettingsLink);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.marketSectionSettingsLink;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsViewSettingsDto(title=");
        sb.append(this.title);
        sb.append(", marketSectionSettingsLink=");
        return ho8.a(sb, this.marketSectionSettingsLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.marketSectionSettingsLink);
    }

    public /* synthetic */ GroupsViewSettingsDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

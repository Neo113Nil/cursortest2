package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsGroupBanInfoGeoBlockDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupBanInfoGeoBlockDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupBanInfoGeoBlockDto> CREATOR = new a();

    @pmi0("block_reason_text")
    private final String blockReasonText;

    @pmi0("can_unblock")
    private final Boolean canUnblock;

    @pmi0("country_code")
    private final String countryCode;

    @pmi0("unblock_button_label")
    private final String unblockButtonLabel;

    /* compiled from: GroupsGroupBanInfoGeoBlockDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupBanInfoGeoBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupBanInfoGeoBlockDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGroupBanInfoGeoBlockDto(readString, readString2, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupBanInfoGeoBlockDto[] newArray(int i) {
            return new GroupsGroupBanInfoGeoBlockDto[i];
        }
    }

    public GroupsGroupBanInfoGeoBlockDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupBanInfoGeoBlockDto)) {
            return false;
        }
        GroupsGroupBanInfoGeoBlockDto groupsGroupBanInfoGeoBlockDto = (GroupsGroupBanInfoGeoBlockDto) obj;
        return epx.f(this.countryCode, groupsGroupBanInfoGeoBlockDto.countryCode) && epx.f(this.blockReasonText, groupsGroupBanInfoGeoBlockDto.blockReasonText) && epx.f(this.canUnblock, groupsGroupBanInfoGeoBlockDto.canUnblock) && epx.f(this.unblockButtonLabel, groupsGroupBanInfoGeoBlockDto.unblockButtonLabel);
    }

    public final int hashCode() {
        String str = this.countryCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blockReasonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canUnblock;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.unblockButtonLabel;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupBanInfoGeoBlockDto(countryCode=");
        sb.append(this.countryCode);
        sb.append(", blockReasonText=");
        sb.append(this.blockReasonText);
        sb.append(", canUnblock=");
        sb.append(this.canUnblock);
        sb.append(", unblockButtonLabel=");
        return ho8.a(sb, this.unblockButtonLabel, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.countryCode);
        parcel.writeString(this.blockReasonText);
        Boolean bool = this.canUnblock;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.unblockButtonLabel);
    }

    public GroupsGroupBanInfoGeoBlockDto(String str, String str2, Boolean bool, String str3) {
        this.countryCode = str;
        this.blockReasonText = str2;
        this.canUnblock = bool;
        this.unblockButtonLabel = str3;
    }

    public /* synthetic */ GroupsGroupBanInfoGeoBlockDto(String str, String str2, Boolean bool, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}

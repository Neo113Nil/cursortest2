package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsBusinessCommunitySettingsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBusinessCommunitySettingsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBusinessCommunitySettingsDto> CREATOR = new a();

    @pmi0("created_as_business")
    private final Boolean createdAsBusiness;

    @pmi0("has_confirmed_business_profile")
    private final Boolean hasConfirmedBusinessProfile;

    @pmi0("vk_bid_modal_enabled")
    private final Boolean vkBidModalEnabled;

    /* compiled from: GroupsBusinessCommunitySettingsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBusinessCommunitySettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsBusinessCommunitySettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsBusinessCommunitySettingsDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBusinessCommunitySettingsDto[] newArray(int i) {
            return new GroupsBusinessCommunitySettingsDto[i];
        }
    }

    public GroupsBusinessCommunitySettingsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBusinessCommunitySettingsDto)) {
            return false;
        }
        GroupsBusinessCommunitySettingsDto groupsBusinessCommunitySettingsDto = (GroupsBusinessCommunitySettingsDto) obj;
        return epx.f(this.createdAsBusiness, groupsBusinessCommunitySettingsDto.createdAsBusiness) && epx.f(this.hasConfirmedBusinessProfile, groupsBusinessCommunitySettingsDto.hasConfirmedBusinessProfile) && epx.f(this.vkBidModalEnabled, groupsBusinessCommunitySettingsDto.vkBidModalEnabled);
    }

    public final int hashCode() {
        Boolean bool = this.createdAsBusiness;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasConfirmedBusinessProfile;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.vkBidModalEnabled;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsBusinessCommunitySettingsDto(createdAsBusiness=");
        sb.append(this.createdAsBusiness);
        sb.append(", hasConfirmedBusinessProfile=");
        sb.append(this.hasConfirmedBusinessProfile);
        sb.append(", vkBidModalEnabled=");
        return tn.a(sb, this.vkBidModalEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.createdAsBusiness;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasConfirmedBusinessProfile;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.vkBidModalEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public GroupsBusinessCommunitySettingsDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.createdAsBusiness = bool;
        this.hasConfirmedBusinessProfile = bool2;
        this.vkBidModalEnabled = bool3;
    }

    public /* synthetic */ GroupsBusinessCommunitySettingsDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}

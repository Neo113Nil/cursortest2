package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: GroupsGroupDonutSubscriptionInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionInfoDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("text")
    private final String text;

    /* compiled from: GroupsGroupDonutSubscriptionInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionInfoDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutSubscriptionInfoDto(parcel.readString(), BaseLinkButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionInfoDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionInfoDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionInfoDto(String str, BaseLinkButtonDto baseLinkButtonDto) {
        this.text = str;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutSubscriptionInfoDto)) {
            return false;
        }
        GroupsGroupDonutSubscriptionInfoDto groupsGroupDonutSubscriptionInfoDto = (GroupsGroupDonutSubscriptionInfoDto) obj;
        return epx.f(this.text, groupsGroupDonutSubscriptionInfoDto.text) && epx.f(this.button, groupsGroupDonutSubscriptionInfoDto.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "GroupsGroupDonutSubscriptionInfoDto(text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.button.writeToParcel(parcel, i);
    }
}

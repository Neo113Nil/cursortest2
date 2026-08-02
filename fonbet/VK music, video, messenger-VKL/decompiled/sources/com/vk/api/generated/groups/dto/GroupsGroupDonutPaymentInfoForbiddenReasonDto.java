package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutPaymentInfoForbiddenReasonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutPaymentInfoForbiddenReasonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutPaymentInfoForbiddenReasonDto> CREATOR = new a();

    @pmi0("back_button")
    private final String backButton;

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutPaymentInfoForbiddenReasonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutPaymentInfoForbiddenReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutPaymentInfoForbiddenReasonDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutPaymentInfoForbiddenReasonDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutPaymentInfoForbiddenReasonDto[] newArray(int i) {
            return new GroupsGroupDonutPaymentInfoForbiddenReasonDto[i];
        }
    }

    public GroupsGroupDonutPaymentInfoForbiddenReasonDto() {
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
        if (!(obj instanceof GroupsGroupDonutPaymentInfoForbiddenReasonDto)) {
            return false;
        }
        GroupsGroupDonutPaymentInfoForbiddenReasonDto groupsGroupDonutPaymentInfoForbiddenReasonDto = (GroupsGroupDonutPaymentInfoForbiddenReasonDto) obj;
        return epx.f(this.title, groupsGroupDonutPaymentInfoForbiddenReasonDto.title) && epx.f(this.description, groupsGroupDonutPaymentInfoForbiddenReasonDto.description) && epx.f(this.backButton, groupsGroupDonutPaymentInfoForbiddenReasonDto.backButton);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backButton;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutPaymentInfoForbiddenReasonDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", backButton=");
        return ho8.a(sb, this.backButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.backButton);
    }

    public GroupsGroupDonutPaymentInfoForbiddenReasonDto(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.backButton = str3;
    }

    public /* synthetic */ GroupsGroupDonutPaymentInfoForbiddenReasonDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

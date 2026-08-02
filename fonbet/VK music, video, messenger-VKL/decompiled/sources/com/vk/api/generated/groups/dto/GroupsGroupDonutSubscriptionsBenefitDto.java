package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsGroupDonutSubscriptionsBenefitDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionsBenefitDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionsBenefitDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    /* compiled from: GroupsGroupDonutSubscriptionsBenefitDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionsBenefitDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsBenefitDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutSubscriptionsBenefitDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsBenefitDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionsBenefitDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionsBenefitDto(String str) {
        this.description = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsGroupDonutSubscriptionsBenefitDto) && epx.f(this.description, ((GroupsGroupDonutSubscriptionsBenefitDto) obj).description);
    }

    public final int hashCode() {
        return this.description.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GroupsGroupDonutSubscriptionsBenefitDto(description="), this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
    }
}

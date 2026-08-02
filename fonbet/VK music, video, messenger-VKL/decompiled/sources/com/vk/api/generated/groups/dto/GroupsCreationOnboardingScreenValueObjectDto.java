package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenValueObjectDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenValueObjectDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenValueObjectDto> CREATOR = new a();

    @pmi0("current_value")
    private final int currentValue;

    @pmi0("max_count")
    private final Integer maxCount;

    /* compiled from: GroupsCreationOnboardingScreenValueObjectDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenValueObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenValueObjectDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenValueObjectDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenValueObjectDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenValueObjectDto[i];
        }
    }

    public GroupsCreationOnboardingScreenValueObjectDto(int i, Integer num) {
        this.currentValue = i;
        this.maxCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenValueObjectDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto = (GroupsCreationOnboardingScreenValueObjectDto) obj;
        return this.currentValue == groupsCreationOnboardingScreenValueObjectDto.currentValue && epx.f(this.maxCount, groupsCreationOnboardingScreenValueObjectDto.maxCount);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.currentValue) * 31;
        Integer num = this.maxCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenValueObjectDto(currentValue=");
        sb.append(this.currentValue);
        sb.append(", maxCount=");
        return uqi.b(sb, this.maxCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentValue);
        Integer num = this.maxCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenValueObjectDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}

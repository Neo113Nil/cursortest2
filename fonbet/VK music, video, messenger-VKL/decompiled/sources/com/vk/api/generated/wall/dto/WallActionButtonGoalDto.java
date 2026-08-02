package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallActionButtonGoalDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonGoalDto implements Parcelable {
    public static final Parcelable.Creator<WallActionButtonGoalDto> CREATOR = new a();

    @pmi0("goal_id")
    private final int goalId;

    /* compiled from: WallActionButtonGoalDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonGoalDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonGoalDto createFromParcel(Parcel parcel) {
            return new WallActionButtonGoalDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonGoalDto[] newArray(int i) {
            return new WallActionButtonGoalDto[i];
        }
    }

    public WallActionButtonGoalDto(int i) {
        this.goalId = i;
    }

    public final int d() {
        return this.goalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallActionButtonGoalDto) && this.goalId == ((WallActionButtonGoalDto) obj).goalId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.goalId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallActionButtonGoalDto(goalId="), this.goalId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.goalId);
    }
}

package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallActionButtonLevelDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonLevelDto implements Parcelable {
    public static final Parcelable.Creator<WallActionButtonLevelDto> CREATOR = new a();

    @pmi0("level_id")
    private final int levelId;

    /* compiled from: WallActionButtonLevelDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonLevelDto createFromParcel(Parcel parcel) {
            return new WallActionButtonLevelDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonLevelDto[] newArray(int i) {
            return new WallActionButtonLevelDto[i];
        }
    }

    public WallActionButtonLevelDto(int i) {
        this.levelId = i;
    }

    public final int d() {
        return this.levelId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallActionButtonLevelDto) && this.levelId == ((WallActionButtonLevelDto) obj).levelId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.levelId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallActionButtonLevelDto(levelId="), this.levelId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.levelId);
    }
}

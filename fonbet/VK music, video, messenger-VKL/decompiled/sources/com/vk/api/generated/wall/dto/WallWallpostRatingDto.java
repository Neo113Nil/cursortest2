package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallWallpostRatingDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostRatingDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostRatingDto> CREATOR = new a();

    @pmi0("can_change")
    private final boolean canChange;

    @pmi0("rated")
    private final int rated;

    @pmi0("value")
    private final Integer value;

    /* compiled from: WallWallpostRatingDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostRatingDto createFromParcel(Parcel parcel) {
            return new WallWallpostRatingDto(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostRatingDto[] newArray(int i) {
            return new WallWallpostRatingDto[i];
        }
    }

    public WallWallpostRatingDto(int i, boolean z, Integer num) {
        this.rated = i;
        this.canChange = z;
        this.value = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostRatingDto)) {
            return false;
        }
        WallWallpostRatingDto wallWallpostRatingDto = (WallWallpostRatingDto) obj;
        return this.rated == wallWallpostRatingDto.rated && this.canChange == wallWallpostRatingDto.canChange && epx.f(this.value, wallWallpostRatingDto.value);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.rated) * 31, 31, this.canChange);
        Integer num = this.value;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostRatingDto(rated=");
        sb.append(this.rated);
        sb.append(", canChange=");
        sb.append(this.canChange);
        sb.append(", value=");
        return uqi.b(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.rated);
        parcel.writeInt(this.canChange ? 1 : 0);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ WallWallpostRatingDto(int i, boolean z, Integer num, int i2, zcl zclVar) {
        this(i, z, (i2 & 4) != 0 ? null : num);
    }
}

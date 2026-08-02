package com.vk.video.recast.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vby;

/* compiled from: Position.kt */
@vby
/* loaded from: classes6.dex */
public final class Position implements Parcelable {
    public static final Parcelable.Creator<Position> CREATOR = new a();
    public final double b;

    /* compiled from: Position.kt */
    public static final class a implements Parcelable.Creator<Position> {
        @Override // android.os.Parcelable.Creator
        public final Position createFromParcel(Parcel parcel) {
            return new Position(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Position[] newArray(int i) {
            return new Position[i];
        }
    }

    public /* synthetic */ Position(double d) {
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Position) {
            return Double.compare(this.b, ((Position) obj).b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.b);
    }

    public final String toString() {
        return "Position(value=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.b);
    }
}

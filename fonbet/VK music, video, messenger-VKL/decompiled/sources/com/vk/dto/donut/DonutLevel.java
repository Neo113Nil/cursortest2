package com.vk.dto.donut;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: DonutLevel.kt */
/* loaded from: classes18.dex */
public final class DonutLevel implements Parcelable {
    public static final Parcelable.Creator<DonutLevel> CREATOR = new a();
    public static final DonutLevel f = new DonutLevel(-1, "", 0, false);
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    /* compiled from: DonutLevel.kt */
    public static final class a implements Parcelable.Creator<DonutLevel> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevel createFromParcel(Parcel parcel) {
            return new DonutLevel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevel[] newArray(int i) {
            return new DonutLevel[i];
        }
    }

    public DonutLevel(int i, String str, int i2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevel)) {
            return false;
        }
        DonutLevel donutLevel = (DonutLevel) obj;
        return this.b == donutLevel.b && epx.f(this.c, donutLevel.c) && this.d == donutLevel.d && this.e == donutLevel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevel(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", isHighestLevel=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}

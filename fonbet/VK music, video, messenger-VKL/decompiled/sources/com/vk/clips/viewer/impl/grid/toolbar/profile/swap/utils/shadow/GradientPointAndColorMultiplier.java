package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.xq;

/* compiled from: GradientPointAndColorMultiplier.kt */
/* loaded from: classes17.dex */
public final class GradientPointAndColorMultiplier implements Parcelable {
    public static final Parcelable.Creator<GradientPointAndColorMultiplier> CREATOR = new a();
    public final float b;
    public final float c;

    /* compiled from: GradientPointAndColorMultiplier.kt */
    public static final class a implements Parcelable.Creator<GradientPointAndColorMultiplier> {
        @Override // android.os.Parcelable.Creator
        public final GradientPointAndColorMultiplier createFromParcel(Parcel parcel) {
            return new GradientPointAndColorMultiplier(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final GradientPointAndColorMultiplier[] newArray(int i) {
            return new GradientPointAndColorMultiplier[i];
        }
    }

    public GradientPointAndColorMultiplier(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientPointAndColorMultiplier)) {
            return false;
        }
        GradientPointAndColorMultiplier gradientPointAndColorMultiplier = (GradientPointAndColorMultiplier) obj;
        return Float.compare(this.b, gradientPointAndColorMultiplier.b) == 0 && Float.compare(this.c, gradientPointAndColorMultiplier.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientPointAndColorMultiplier(point=");
        sb.append(this.b);
        sb.append(", colorMultiplier=");
        return xq.c(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}

package com.vk.media.pipeline.model.source.picture;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.shy;
import xsna.vu5;

/* compiled from: ColorMediaSource.kt */
/* loaded from: classes3.dex */
public final class ColorMediaSource implements ImageMediaSource, Parcelable {
    public static final Parcelable.Creator<ColorMediaSource> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: ColorMediaSource.kt */
    public static final class a implements Parcelable.Creator<ColorMediaSource> {
        @Override // android.os.Parcelable.Creator
        public final ColorMediaSource createFromParcel(Parcel parcel) {
            return new ColorMediaSource(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ColorMediaSource[] newArray(int i) {
            return new ColorMediaSource[i];
        }
    }

    public ColorMediaSource(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorMediaSource)) {
            return false;
        }
        ColorMediaSource colorMediaSource = (ColorMediaSource) obj;
        return this.b == colorMediaSource.b && this.c == colorMediaSource.c && this.d == colorMediaSource.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorMediaSource(color=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}

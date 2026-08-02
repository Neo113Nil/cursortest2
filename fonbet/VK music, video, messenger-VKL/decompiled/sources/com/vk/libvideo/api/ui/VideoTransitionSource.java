package com.vk.libvideo.api.ui;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.shy;
import xsna.vu5;

/* compiled from: VideoTransitionSource.kt */
/* loaded from: classes2.dex */
public final class VideoTransitionSource implements Parcelable {
    public static final Parcelable.Creator<VideoTransitionSource> CREATOR = new a();
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: VideoTransitionSource.kt */
    public static final class a implements Parcelable.Creator<VideoTransitionSource> {
        @Override // android.os.Parcelable.Creator
        public final VideoTransitionSource createFromParcel(Parcel parcel) {
            return new VideoTransitionSource(parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTransitionSource[] newArray(int i) {
            return new VideoTransitionSource[i];
        }
    }

    public VideoTransitionSource(float f, float f2, int i, int i2, int i3) {
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTransitionSource)) {
            return false;
        }
        VideoTransitionSource videoTransitionSource = (VideoTransitionSource) obj;
        return Float.compare(this.b, videoTransitionSource.b) == 0 && Float.compare(this.c, videoTransitionSource.c) == 0 && this.d == videoTransitionSource.d && this.e == videoTransitionSource.e && this.f == videoTransitionSource.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTransitionSource(globalVisibleX=");
        sb.append(this.b);
        sb.append(", globalVisibleY=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", visibleHeight=");
        return vu5.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}

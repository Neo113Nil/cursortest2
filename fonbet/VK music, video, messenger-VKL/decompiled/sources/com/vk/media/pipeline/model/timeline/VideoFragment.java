package com.vk.media.pipeline.model.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.item.VideoItem;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;

/* compiled from: Timeline.kt */
/* loaded from: classes3.dex */
public final class VideoFragment implements Fragment {
    public static final Parcelable.Creator<VideoFragment> CREATOR = new a();
    public final VideoItem b;
    public final long c;
    public final long d;

    /* compiled from: Timeline.kt */
    public static final class a implements Parcelable.Creator<VideoFragment> {
        @Override // android.os.Parcelable.Creator
        public final VideoFragment createFromParcel(Parcel parcel) {
            return new VideoFragment((VideoItem) parcel.readParcelable(VideoFragment.class.getClassLoader()), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoFragment[] newArray(int i) {
            return new VideoFragment[i];
        }
    }

    public VideoFragment(VideoItem videoItem, long j, long j2) {
        this.b = videoItem;
        this.c = j;
        this.d = j2;
    }

    @Override // com.vk.media.pipeline.model.timeline.Fragment
    public final long O0() {
        return this.c;
    }

    @Override // com.vk.media.pipeline.model.timeline.Fragment
    public final long W0() {
        return this.d;
    }

    public final long d() {
        return W0() - O0();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFragment)) {
            return false;
        }
        VideoFragment videoFragment = (VideoFragment) obj;
        return epx.f(this.b, videoFragment.b) && this.c == videoFragment.c && this.d == videoFragment.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFragment(item=");
        sb.append(this.b);
        sb.append(", startMcs=");
        sb.append(this.c);
        sb.append(", endMcs=");
        return vu5.a(')', this.d, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}

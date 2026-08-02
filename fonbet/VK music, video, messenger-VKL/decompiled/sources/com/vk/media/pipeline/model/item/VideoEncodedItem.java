package com.vk.media.pipeline.model.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import xsna.bh10;
import xsna.epx;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: VideoItem.kt */
/* loaded from: classes3.dex */
public final class VideoEncodedItem implements VideoItem {
    public static final Parcelable.Creator<VideoEncodedItem> CREATOR = new a();
    public final TrackMediaSource b;
    public final long c;
    public final long d;
    public final double e;
    public final VideoEffect f;

    /* compiled from: VideoItem.kt */
    public static final class a implements Parcelable.Creator<VideoEncodedItem> {
        @Override // android.os.Parcelable.Creator
        public final VideoEncodedItem createFromParcel(Parcel parcel) {
            return new VideoEncodedItem(TrackMediaSource.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong(), parcel.readDouble(), VideoEffect.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEncodedItem[] newArray(int i) {
            return new VideoEncodedItem[i];
        }
    }

    public VideoEncodedItem(TrackMediaSource trackMediaSource, long j, long j2, double d, VideoEffect videoEffect, int i, zcl zclVar) {
        this(trackMediaSource, j, j2, d, (i & 16) != 0 ? (VideoEffect) VideoEffect.e.getValue() : videoEffect);
    }

    public static VideoEncodedItem a(VideoEncodedItem videoEncodedItem, long j, long j2, VideoEffect videoEffect, int i) {
        TrackMediaSource trackMediaSource = videoEncodedItem.b;
        if ((i & 2) != 0) {
            j = videoEncodedItem.c;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = videoEncodedItem.d;
        }
        long j4 = j2;
        double d = videoEncodedItem.e;
        if ((i & 16) != 0) {
            videoEffect = videoEncodedItem.f;
        }
        return new VideoEncodedItem(trackMediaSource, j3, j4, d, videoEffect);
    }

    @Override // com.vk.media.pipeline.model.item.VideoItem
    public final VideoItem A3(long j, long j2) {
        return a(this, j, j2, null, 25);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final long O0() {
        return this.c;
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final long W0() {
        return this.d;
    }

    @Override // com.vk.media.pipeline.model.item.VideoItem
    public final VideoEffect X8() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEncodedItem)) {
            return false;
        }
        VideoEncodedItem videoEncodedItem = (VideoEncodedItem) obj;
        return epx.f(this.b, videoEncodedItem.b) && this.c == videoEncodedItem.c && this.d == videoEncodedItem.d && Double.compare(this.e, videoEncodedItem.e) == 0 && epx.f(this.f, videoEncodedItem.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + zjh0.b(this.e, bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final long j4() {
        return W0() - O0();
    }

    @Override // com.vk.media.pipeline.model.item.VideoItem
    public final VideoItem q3(VideoEffect videoEffect) {
        return a(this, 0L, 0L, videoEffect, 15);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final MediaSource t() {
        return this.b;
    }

    public final String toString() {
        return "VideoEncodedItem(source=" + this.b + ", startMcs=" + this.c + ", endMcs=" + this.d + ", speed=" + this.e + ", effect=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeDouble(this.e);
        this.f.writeToParcel(parcel, i);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final double z() {
        return this.e;
    }

    public VideoEncodedItem(TrackMediaSource trackMediaSource, long j, long j2, double d, VideoEffect videoEffect) {
        this.b = trackMediaSource;
        this.c = j;
        this.d = j2;
        this.e = d;
        this.f = videoEffect;
    }
}

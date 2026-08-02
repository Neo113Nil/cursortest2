package com.vk.media.pipeline.model.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import xsna.bh10;
import xsna.epx;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: VideoItem.kt */
/* loaded from: classes3.dex */
public final class VideoRawItem implements VideoItem {
    public static final Parcelable.Creator<VideoRawItem> CREATOR = new a();
    public final ImageMediaSource b;
    public final long c;
    public final long d;
    public final double e;
    public final VideoEffect f;

    /* compiled from: VideoItem.kt */
    public static final class a implements Parcelable.Creator<VideoRawItem> {
        @Override // android.os.Parcelable.Creator
        public final VideoRawItem createFromParcel(Parcel parcel) {
            return new VideoRawItem((ImageMediaSource) parcel.readParcelable(VideoRawItem.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readDouble(), VideoEffect.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRawItem[] newArray(int i) {
            return new VideoRawItem[i];
        }
    }

    public VideoRawItem(ImageMediaSource imageMediaSource, long j, long j2, double d, VideoEffect videoEffect, int i, zcl zclVar) {
        this(imageMediaSource, j, j2, d, (i & 16) != 0 ? (VideoEffect) VideoEffect.e.getValue() : videoEffect);
    }

    public static VideoRawItem a(VideoRawItem videoRawItem, long j, long j2, VideoEffect videoEffect, int i) {
        ImageMediaSource imageMediaSource = videoRawItem.b;
        if ((i & 2) != 0) {
            j = videoRawItem.c;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = videoRawItem.d;
        }
        long j4 = j2;
        double d = videoRawItem.e;
        if ((i & 16) != 0) {
            videoEffect = videoRawItem.f;
        }
        return new VideoRawItem(imageMediaSource, j3, j4, d, videoEffect);
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
        if (!(obj instanceof VideoRawItem)) {
            return false;
        }
        VideoRawItem videoRawItem = (VideoRawItem) obj;
        return epx.f(this.b, videoRawItem.b) && this.c == videoRawItem.c && this.d == videoRawItem.d && Double.compare(this.e, videoRawItem.e) == 0 && epx.f(this.f, videoRawItem.f);
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
        return "VideoRawItem(source=" + this.b + ", startMcs=" + this.c + ", endMcs=" + this.d + ", speed=" + this.e + ", effect=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeDouble(this.e);
        this.f.writeToParcel(parcel, i);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final double z() {
        return this.e;
    }

    public VideoRawItem(ImageMediaSource imageMediaSource, long j, long j2, double d, VideoEffect videoEffect) {
        this.b = imageMediaSource;
        this.c = j;
        this.d = j2;
        this.e = d;
        this.f = videoEffect;
    }
}

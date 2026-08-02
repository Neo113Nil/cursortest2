package com.vk.video.growth.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import xsna.epx;

/* compiled from: VideoGrowthTrapArguments.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthTrapArguments implements Parcelable {
    public static final Parcelable.Creator<VideoGrowthTrapArguments> CREATOR = new a();
    public final TrapContentParams b;
    public final VideoGrowthStoreParams c;
    public final VideoGrowthVideoParams d;

    /* compiled from: VideoGrowthTrapArguments.kt */
    public static final class a implements Parcelable.Creator<VideoGrowthTrapArguments> {
        @Override // android.os.Parcelable.Creator
        public final VideoGrowthTrapArguments createFromParcel(Parcel parcel) {
            return new VideoGrowthTrapArguments(TrapContentParams.CREATOR.createFromParcel(parcel), VideoGrowthStoreParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoGrowthVideoParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGrowthTrapArguments[] newArray(int i) {
            return new VideoGrowthTrapArguments[i];
        }
    }

    public VideoGrowthTrapArguments(TrapContentParams trapContentParams, VideoGrowthStoreParams videoGrowthStoreParams, VideoGrowthVideoParams videoGrowthVideoParams) {
        this.b = trapContentParams;
        this.c = videoGrowthStoreParams;
        this.d = videoGrowthVideoParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGrowthTrapArguments)) {
            return false;
        }
        VideoGrowthTrapArguments videoGrowthTrapArguments = (VideoGrowthTrapArguments) obj;
        return epx.f(this.b, videoGrowthTrapArguments.b) && epx.f(this.c, videoGrowthTrapArguments.c) && epx.f(this.d, videoGrowthTrapArguments.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        VideoGrowthVideoParams videoGrowthVideoParams = this.d;
        return hashCode + (videoGrowthVideoParams == null ? 0 : videoGrowthVideoParams.hashCode());
    }

    public final String toString() {
        return "VideoGrowthTrapArguments(trapContentParams=" + this.b + ", storeParams=" + this.c + ", videoParams=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        VideoGrowthVideoParams videoGrowthVideoParams = this.d;
        if (videoGrowthVideoParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoGrowthVideoParams.writeToParcel(parcel, i);
        }
    }
}

package com.vk.video.growth.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoGrowthTrapArguments.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthStoreParams implements Parcelable {
    public static final Parcelable.Creator<VideoGrowthStoreParams> CREATOR = new a();
    public final VideoGrowthAppStore b;
    public final String c;

    /* compiled from: VideoGrowthTrapArguments.kt */
    public static final class a implements Parcelable.Creator<VideoGrowthStoreParams> {
        @Override // android.os.Parcelable.Creator
        public final VideoGrowthStoreParams createFromParcel(Parcel parcel) {
            return new VideoGrowthStoreParams(VideoGrowthAppStore.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGrowthStoreParams[] newArray(int i) {
            return new VideoGrowthStoreParams[i];
        }
    }

    public VideoGrowthStoreParams(VideoGrowthAppStore videoGrowthAppStore, String str) {
        this.b = videoGrowthAppStore;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGrowthStoreParams)) {
            return false;
        }
        VideoGrowthStoreParams videoGrowthStoreParams = (VideoGrowthStoreParams) obj;
        return this.b == videoGrowthStoreParams.b && epx.f(this.c, videoGrowthStoreParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthStoreParams(appStore=");
        sb.append(this.b);
        sb.append(", storeLink=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }
}

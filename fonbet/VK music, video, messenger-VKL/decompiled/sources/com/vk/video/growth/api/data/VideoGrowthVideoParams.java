package com.vk.video.growth.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: VideoGrowthVideoParams.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthVideoParams implements Parcelable {
    public static final Parcelable.Creator<VideoGrowthVideoParams> CREATOR = new a();
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;

    /* compiled from: VideoGrowthVideoParams.kt */
    public static final class a implements Parcelable.Creator<VideoGrowthVideoParams> {
        @Override // android.os.Parcelable.Creator
        public final VideoGrowthVideoParams createFromParcel(Parcel parcel) {
            return new VideoGrowthVideoParams(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGrowthVideoParams[] newArray(int i) {
            return new VideoGrowthVideoParams[i];
        }
    }

    public VideoGrowthVideoParams(String str, long j, boolean z, boolean z2) {
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGrowthVideoParams)) {
            return false;
        }
        VideoGrowthVideoParams videoGrowthVideoParams = (VideoGrowthVideoParams) obj;
        return epx.f(this.b, videoGrowthVideoParams.b) && this.c == videoGrowthVideoParams.c && this.d == videoGrowthVideoParams.d && this.e == videoGrowthVideoParams.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthVideoParams(videoId=");
        sb.append(this.b);
        sb.append(", autoPlayPosition=");
        sb.append(this.c);
        sb.append(", shouldStartDownload=");
        sb.append(this.d);
        sb.append(", shouldAdsSuspend=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ VideoGrowthVideoParams(String str, long j, boolean z, boolean z2, int i, zcl zclVar) {
        this(str, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}

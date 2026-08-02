package com.vk.video.ui.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoShareArguments.kt */
/* loaded from: classes7.dex */
public final class VideoShareArguments implements Parcelable {
    public static final Parcelable.Creator<VideoShareArguments> CREATOR = new a();
    public final String b;
    public final int c;
    public final boolean d;
    public final StatsArguments e;

    /* compiled from: VideoShareArguments.kt */
    public static final class a implements Parcelable.Creator<VideoShareArguments> {
        @Override // android.os.Parcelable.Creator
        public final VideoShareArguments createFromParcel(Parcel parcel) {
            return new VideoShareArguments(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, StatsArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoShareArguments[] newArray(int i) {
            return new VideoShareArguments[i];
        }
    }

    public VideoShareArguments(String str, int i, boolean z, StatsArguments statsArguments) {
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = statsArguments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoShareArguments)) {
            return false;
        }
        VideoShareArguments videoShareArguments = (VideoShareArguments) obj;
        return epx.f(this.b, videoShareArguments.b) && this.c == videoShareArguments.c && this.d == videoShareArguments.d && epx.f(this.e, videoShareArguments.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "VideoShareArguments(shareLink=" + this.b + ", shareTimeSec=" + this.c + ", forceDarkTheme=" + this.d + ", statsArguments=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
    }

    public /* synthetic */ VideoShareArguments(String str, int i, boolean z, StatsArguments statsArguments, int i2, zcl zclVar) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, statsArguments);
    }
}

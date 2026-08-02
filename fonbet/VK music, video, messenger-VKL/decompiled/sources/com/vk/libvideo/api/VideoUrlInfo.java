package com.vk.libvideo.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bpn0;
import xsna.epx;
import xsna.ho8;
import xsna.icn0;

/* compiled from: VideoUrlInfo.kt */
/* loaded from: classes2.dex */
public final class VideoUrlInfo implements Parcelable {
    public static final Parcelable.Creator<VideoUrlInfo> CREATOR = new a();
    public final String b;
    public final bpn0 c = new bpn0(new icn0(this, 14));

    /* compiled from: VideoUrlInfo.kt */
    public static final class a implements Parcelable.Creator<VideoUrlInfo> {
        @Override // android.os.Parcelable.Creator
        public final VideoUrlInfo createFromParcel(Parcel parcel) {
            return new VideoUrlInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUrlInfo[] newArray(int i) {
            return new VideoUrlInfo[i];
        }
    }

    public VideoUrlInfo(String str) {
        this.b = str;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoUrlInfo) && epx.f(this.b, ((VideoUrlInfo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoUrlInfo(originalUrl="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}

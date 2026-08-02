package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VideoPlayerStatInfo.kt */
/* loaded from: classes7.dex */
public final class VideoPlayerStatInfo implements Parcelable {
    public static final Parcelable.Creator<VideoPlayerStatInfo> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: VideoPlayerStatInfo.kt */
    public static final class a implements Parcelable.Creator<VideoPlayerStatInfo> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlayerStatInfo createFromParcel(Parcel parcel) {
            return new VideoPlayerStatInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlayerStatInfo[] newArray(int i) {
            return new VideoPlayerStatInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPlayerStatInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlayerStatInfo)) {
            return false;
        }
        VideoPlayerStatInfo videoPlayerStatInfo = (VideoPlayerStatInfo) obj;
        return epx.f(this.b, videoPlayerStatInfo.b) && epx.f(this.c, videoPlayerStatInfo.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayerStatInfo(vsId=");
        sb.append(this.b);
        sb.append(", videoId=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public VideoPlayerStatInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ VideoPlayerStatInfo(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

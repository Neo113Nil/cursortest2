package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class VideoUrlInfoDo implements Parcelable {
    public static final Parcelable.Creator<VideoUrlInfoDo> CREATOR = new a();
    public final VideoQuality b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<VideoUrlInfoDo> {
        @Override // android.os.Parcelable.Creator
        public final VideoUrlInfoDo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            VideoQuality valueOf = VideoQuality.valueOf(parcel.readString());
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new VideoUrlInfoDo(valueOf, readString, z5, z3, z4, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUrlInfoDo[] newArray(int i) {
            return new VideoUrlInfoDo[i];
        }
    }

    public VideoUrlInfoDo(VideoQuality videoQuality, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.b = videoQuality;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
    }

    public final String d() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoQuality e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrlInfoDo)) {
            return false;
        }
        VideoUrlInfoDo videoUrlInfoDo = (VideoUrlInfoDo) obj;
        return this.b == videoUrlInfoDo.b && epx.f(this.c, videoUrlInfoDo.c) && this.d == videoUrlInfoDo.d && this.e == videoUrlInfoDo.e && this.f == videoUrlInfoDo.f && this.g == videoUrlInfoDo.g && epx.f(this.h, videoUrlInfoDo.h);
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean isExternal() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUrlInfoDo(quality=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", isOndemand=");
        sb.append(this.d);
        sb.append(", isWebm=");
        sb.append(this.e);
        sb.append(", isExternal=");
        sb.append(this.f);
        sb.append(", isPlayback=");
        sb.append(this.g);
        sb.append(", contentType=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
    }
}

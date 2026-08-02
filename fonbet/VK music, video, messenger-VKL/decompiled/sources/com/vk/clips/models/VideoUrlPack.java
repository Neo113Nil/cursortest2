package com.vk.clips.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoUrlPack.kt */
/* loaded from: classes16.dex */
public final class VideoUrlPack implements Parcelable {
    public static final Parcelable.Creator<VideoUrlPack> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: VideoUrlPack.kt */
    public static final class a implements Parcelable.Creator<VideoUrlPack> {
        @Override // android.os.Parcelable.Creator
        public final VideoUrlPack createFromParcel(Parcel parcel) {
            return new VideoUrlPack(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUrlPack[] newArray(int i) {
            return new VideoUrlPack[i];
        }
    }

    public VideoUrlPack(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrlPack)) {
            return false;
        }
        VideoUrlPack videoUrlPack = (VideoUrlPack) obj;
        return epx.f(this.b, videoUrlPack.b) && epx.f(this.c, videoUrlPack.c) && epx.f(this.d, videoUrlPack.d) && epx.f(this.e, videoUrlPack.e) && epx.f(this.f, videoUrlPack.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUrlPack(urlWebmDash=");
        sb.append(this.b);
        sb.append(", urlDash=");
        sb.append(this.c);
        sb.append(", urlLiveHls=");
        sb.append(this.d);
        sb.append(", urlHls=");
        sb.append(this.e);
        sb.append(", urlMp4=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}

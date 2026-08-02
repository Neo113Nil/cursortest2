package com.vk.dto.clips.media;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.shy;
import xsna.ujm0;
import xsna.vu5;

/* compiled from: VideoConfigEditor.kt */
/* loaded from: classes18.dex */
public final class VideoConfigEditor implements Parcelable, bxx {
    public static final Parcelable.Creator<VideoConfigEditor> CREATOR = new a();
    public static final b g = new b();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: VideoConfigEditor.kt */
    public static final class a implements Parcelable.Creator<VideoConfigEditor> {
        @Override // android.os.Parcelable.Creator
        public final VideoConfigEditor createFromParcel(Parcel parcel) {
            return new VideoConfigEditor(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoConfigEditor[] newArray(int i) {
            return new VideoConfigEditor[i];
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<VideoConfigEditor> {
        @Override // xsna.aay
        public final VideoConfigEditor a(JSONObject jSONObject) {
            return new VideoConfigEditor(jSONObject);
        }
    }

    public VideoConfigEditor(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new ujm0(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoConfigEditor)) {
            return false;
        }
        VideoConfigEditor videoConfigEditor = (VideoConfigEditor) obj;
        return this.b == videoConfigEditor.b && this.c == videoConfigEditor.c && this.d == videoConfigEditor.d && this.e == videoConfigEditor.e && this.f == videoConfigEditor.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConfigEditor(width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", videoBitrate=");
        sb.append(this.d);
        sb.append(", videoFrameRate=");
        sb.append(this.e);
        sb.append(", durationMs=");
        return vu5.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public VideoConfigEditor(JSONObject jSONObject) {
        this(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("video_bitrate"), jSONObject.getInt("video_frame_rate"), jSONObject.getInt("duration"));
    }
}

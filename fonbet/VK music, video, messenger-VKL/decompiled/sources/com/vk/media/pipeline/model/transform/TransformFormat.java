package com.vk.media.pipeline.model.transform;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.quality.MediaQuality;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.uqi;
import xsna.vu5;
import xsna.zcl;

/* compiled from: TransformFormat.kt */
/* loaded from: classes3.dex */
public final class TransformFormat implements Parcelable {
    public static final Parcelable.Creator<TransformFormat> CREATOR = new a();
    public final MediaQuality b;
    public final VideoOutputFormat c;
    public final AudioOutputFormat d;

    /* compiled from: TransformFormat.kt */
    public static final class AudioOutputFormat implements Parcelable {
        public static final Parcelable.Creator<AudioOutputFormat> CREATOR = new a();
        public final int b;

        /* compiled from: TransformFormat.kt */
        public static final class a implements Parcelable.Creator<AudioOutputFormat> {
            @Override // android.os.Parcelable.Creator
            public final AudioOutputFormat createFromParcel(Parcel parcel) {
                return new AudioOutputFormat(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AudioOutputFormat[] newArray(int i) {
                return new AudioOutputFormat[i];
            }
        }

        public AudioOutputFormat(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioOutputFormat) && this.b == ((AudioOutputFormat) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AudioOutputFormat(sampleRate="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: TransformFormat.kt */
    public static final class a implements Parcelable.Creator<TransformFormat> {
        @Override // android.os.Parcelable.Creator
        public final TransformFormat createFromParcel(Parcel parcel) {
            return new TransformFormat(MediaQuality.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : VideoOutputFormat.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AudioOutputFormat.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TransformFormat[] newArray(int i) {
            return new TransformFormat[i];
        }
    }

    public TransformFormat(MediaQuality mediaQuality, VideoOutputFormat videoOutputFormat, AudioOutputFormat audioOutputFormat) {
        this.b = mediaQuality;
        this.c = videoOutputFormat;
        this.d = audioOutputFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformFormat)) {
            return false;
        }
        TransformFormat transformFormat = (TransformFormat) obj;
        return this.b == transformFormat.b && epx.f(this.c, transformFormat.c) && epx.f(this.d, transformFormat.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoOutputFormat videoOutputFormat = this.c;
        int hashCode2 = (hashCode + (videoOutputFormat == null ? 0 : videoOutputFormat.hashCode())) * 31;
        AudioOutputFormat audioOutputFormat = this.d;
        return hashCode2 + (audioOutputFormat != null ? Integer.hashCode(audioOutputFormat.b) : 0);
    }

    public final String toString() {
        return "TransformFormat(quality=" + this.b + ", videoFormat=" + this.c + ", audioFormat=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        VideoOutputFormat videoOutputFormat = this.c;
        if (videoOutputFormat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoOutputFormat.writeToParcel(parcel, i);
        }
        AudioOutputFormat audioOutputFormat = this.d;
        if (audioOutputFormat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioOutputFormat.writeToParcel(parcel, i);
        }
    }

    /* compiled from: TransformFormat.kt */
    public static final class VideoOutputFormat implements Parcelable {
        public static final Parcelable.Creator<VideoOutputFormat> CREATOR = new a();
        public final int b;
        public final int c;
        public final Integer d;
        public final Float e;
        public final Integer f;

        /* compiled from: TransformFormat.kt */
        public static final class a implements Parcelable.Creator<VideoOutputFormat> {
            @Override // android.os.Parcelable.Creator
            public final VideoOutputFormat createFromParcel(Parcel parcel) {
                return new VideoOutputFormat(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoOutputFormat[] newArray(int i) {
                return new VideoOutputFormat[i];
            }
        }

        public VideoOutputFormat(int i, int i2, Integer num, Float f, Integer num2) {
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = f;
            this.f = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoOutputFormat)) {
                return false;
            }
            VideoOutputFormat videoOutputFormat = (VideoOutputFormat) obj;
            return this.b == videoOutputFormat.b && this.c == videoOutputFormat.c && epx.f(this.d, videoOutputFormat.d) && epx.f(this.e, videoOutputFormat.e) && epx.f(this.f, videoOutputFormat.f);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Integer num = this.d;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.e;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num2 = this.f;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoOutputFormat(width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", frameRate=");
            sb.append(this.d);
            sb.append(", iFrameInterval=");
            sb.append(this.e);
            sb.append(", bitrate=");
            return uqi.b(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            Integer num = this.d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Float f = this.e;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            Integer num2 = this.f;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }

        public /* synthetic */ VideoOutputFormat(int i, int i2, Integer num, Float f, Integer num2, int i3, zcl zclVar) {
            this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : f, (i3 & 16) != 0 ? null : num2);
        }
    }
}

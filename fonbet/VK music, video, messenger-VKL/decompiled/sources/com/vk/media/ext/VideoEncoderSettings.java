package com.vk.media.ext;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: VideoEncoderSettings.kt */
/* loaded from: classes3.dex */
public final class VideoEncoderSettings implements Parcelable {
    public static final Parcelable.Creator<VideoEncoderSettings> CREATOR;
    public static final VideoEncoderSettings d;
    public final int b;
    public final int c;

    /* compiled from: VideoEncoderSettings.kt */
    public static final class a implements Parcelable.Creator<VideoEncoderSettings> {
        @Override // android.os.Parcelable.Creator
        public final VideoEncoderSettings createFromParcel(Parcel parcel) {
            return new VideoEncoderSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEncoderSettings[] newArray(int i) {
            return new VideoEncoderSettings[i];
        }
    }

    /* compiled from: VideoEncoderSettings.kt */
    public static final class b {
        public static VideoEncoderSettings a() {
            return VideoEncoderSettings.d;
        }
    }

    static {
        new VideoEncoderSettings(Tensorflow.FRAME_WIDTH, 1000000);
        d = new VideoEncoderSettings(CoverVideoUploadTask.y, (int) 2260000.0f);
        new VideoEncoderSettings(1920, 8388608);
        CREATOR = new a();
    }

    public VideoEncoderSettings(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public VideoEncoderSettings(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}

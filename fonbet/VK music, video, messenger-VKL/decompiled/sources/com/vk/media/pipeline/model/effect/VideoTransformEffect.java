package com.vk.media.pipeline.model.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoTransformEffect.kt */
/* loaded from: classes3.dex */
public final class VideoTransformEffect implements Parcelable {
    public static final Parcelable.Creator<VideoTransformEffect> CREATOR = new a();
    public final float[] b;
    public final int c;
    public final int d;
    public final float e;

    /* compiled from: VideoTransformEffect.kt */
    public static final class a implements Parcelable.Creator<VideoTransformEffect> {
        @Override // android.os.Parcelable.Creator
        public final VideoTransformEffect createFromParcel(Parcel parcel) {
            return new VideoTransformEffect(parcel.createFloatArray(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTransformEffect[] newArray(int i) {
            return new VideoTransformEffect[i];
        }
    }

    public VideoTransformEffect(float[] fArr, int i, int i2, float f) {
        this.b = fArr;
        this.c = i;
        this.d = i2;
        this.e = f;
        if (fArr.length != 9 || i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("Wrong video transform specified: " + this).toString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VideoTransformEffect.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VideoTransformEffect videoTransformEffect = (VideoTransformEffect) obj;
        return Arrays.equals(this.b, videoTransformEffect.b) && this.c == videoTransformEffect.c && this.d == videoTransformEffect.d && this.e == videoTransformEffect.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Arrays.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        return "matrix=" + Arrays.toString(this.b) + ", size=" + this.c + " x " + this.d + ", cornerRadius=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
    }

    public /* synthetic */ VideoTransformEffect(float[] fArr, int i, int i2, float f, int i3, zcl zclVar) {
        this(fArr, i, i2, (i3 & 8) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f);
    }
}

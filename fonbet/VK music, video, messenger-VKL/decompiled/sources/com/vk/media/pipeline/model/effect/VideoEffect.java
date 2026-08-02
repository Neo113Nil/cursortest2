package com.vk.media.pipeline.model.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.filters.model.FilterItem;
import xsna.bpn0;
import xsna.epx;
import xsna.pis0;
import xsna.t970;
import xsna.zcl;

/* compiled from: VideoEffect.kt */
/* loaded from: classes3.dex */
public final class VideoEffect implements Parcelable {
    public static final Parcelable.Creator<VideoEffect> CREATOR = new a();
    public static final bpn0 e = new bpn0(new t970(16));
    public final VideoTransformEffect b;
    public final FilterItem c;
    public final bpn0 d;

    /* compiled from: VideoEffect.kt */
    public static final class a implements Parcelable.Creator<VideoEffect> {
        @Override // android.os.Parcelable.Creator
        public final VideoEffect createFromParcel(Parcel parcel) {
            return new VideoEffect(parcel.readInt() == 0 ? null : VideoTransformEffect.CREATOR.createFromParcel(parcel), (FilterItem) parcel.readParcelable(VideoEffect.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEffect[] newArray(int i) {
            return new VideoEffect[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoEffect() {
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
        if (!(obj instanceof VideoEffect)) {
            return false;
        }
        VideoEffect videoEffect = (VideoEffect) obj;
        return epx.f(this.b, videoEffect.b) && epx.f(this.c, videoEffect.c);
    }

    public final int hashCode() {
        VideoTransformEffect videoTransformEffect = this.b;
        int hashCode = (videoTransformEffect == null ? 0 : videoTransformEffect.hashCode()) * 31;
        FilterItem filterItem = this.c;
        return hashCode + (filterItem != null ? filterItem.hashCode() : 0);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoTransformEffect videoTransformEffect = this.b;
        if (videoTransformEffect == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTransformEffect.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }

    public VideoEffect(VideoTransformEffect videoTransformEffect, FilterItem filterItem) {
        this.b = videoTransformEffect;
        this.c = filterItem;
        this.d = new bpn0(new pis0(this, 0));
    }

    public /* synthetic */ VideoEffect(VideoTransformEffect videoTransformEffect, FilterItem filterItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoTransformEffect, (i & 2) != 0 ? null : filterItem);
    }
}

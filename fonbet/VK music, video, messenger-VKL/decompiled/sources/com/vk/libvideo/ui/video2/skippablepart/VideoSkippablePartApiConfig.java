package com.vk.libvideo.ui.video2.skippablepart;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VideoSkippablePartApiConfig.kt */
/* loaded from: classes3.dex */
public final class VideoSkippablePartApiConfig implements Parcelable {
    public static final Parcelable.Creator<VideoSkippablePartApiConfig> CREATOR = new a();

    @pmi0("animation_duration")
    private final int animationDuration;

    @pmi0("buttons_above_controls")
    private final boolean buttonsAboveControls;

    /* compiled from: VideoSkippablePartApiConfig.kt */
    public static final class a implements Parcelable.Creator<VideoSkippablePartApiConfig> {
        @Override // android.os.Parcelable.Creator
        public final VideoSkippablePartApiConfig createFromParcel(Parcel parcel) {
            return new VideoSkippablePartApiConfig(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSkippablePartApiConfig[] newArray(int i) {
            return new VideoSkippablePartApiConfig[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSkippablePartApiConfig() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSkippablePartApiConfig)) {
            return false;
        }
        VideoSkippablePartApiConfig videoSkippablePartApiConfig = (VideoSkippablePartApiConfig) obj;
        return this.buttonsAboveControls == videoSkippablePartApiConfig.buttonsAboveControls && this.animationDuration == videoSkippablePartApiConfig.animationDuration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.animationDuration) + (Boolean.hashCode(this.buttonsAboveControls) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSkippablePartApiConfig(buttonsAboveControls=");
        sb.append(this.buttonsAboveControls);
        sb.append(", animationDuration=");
        return vu5.b(sb, this.animationDuration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.buttonsAboveControls ? 1 : 0);
        parcel.writeInt(this.animationDuration);
    }

    public VideoSkippablePartApiConfig(boolean z, int i) {
        this.buttonsAboveControls = z;
        this.animationDuration = i;
    }

    public /* synthetic */ VideoSkippablePartApiConfig(boolean z, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}

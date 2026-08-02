package com.vk.dto.clips.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.gallery.ClipsProcessedItem;

/* compiled from: VideoToClipInput.kt */
/* loaded from: classes18.dex */
public final class VideoToClipInput implements Parcelable {
    public static final Parcelable.Creator<VideoToClipInput> CREATOR = new a();
    public final ClipsProcessedItem b;
    public final VideoToClipInfo c;

    /* compiled from: VideoToClipInput.kt */
    public static final class a implements Parcelable.Creator<VideoToClipInput> {
        @Override // android.os.Parcelable.Creator
        public final VideoToClipInput createFromParcel(Parcel parcel) {
            return new VideoToClipInput(ClipsProcessedItem.CREATOR.createFromParcel(parcel), VideoToClipInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoToClipInput[] newArray(int i) {
            return new VideoToClipInput[i];
        }
    }

    public VideoToClipInput(ClipsProcessedItem clipsProcessedItem, VideoToClipInfo videoToClipInfo) {
        this.b = clipsProcessedItem;
        this.c = videoToClipInfo;
    }

    public final VideoToClipInfo d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ClipsProcessedItem e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}

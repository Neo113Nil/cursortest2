package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.lq;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class VkMediaEntry$VkVideo implements MediaPickerEntry {
    public static final Parcelable.Creator<VkMediaEntry$VkVideo> CREATOR = new a();
    public final VideoFile b;

    /* compiled from: MediaPickerState.kt */
    public static final class a implements Parcelable.Creator<VkMediaEntry$VkVideo> {
        @Override // android.os.Parcelable.Creator
        public final VkMediaEntry$VkVideo createFromParcel(Parcel parcel) {
            return new VkMediaEntry$VkVideo((VideoFile) parcel.readParcelable(VkMediaEntry$VkVideo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkMediaEntry$VkVideo[] newArray(int i) {
            return new VkMediaEntry$VkVideo[i];
        }
    }

    public VkMediaEntry$VkVideo(VideoFile videoFile) {
        this.b = videoFile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkMediaEntry$VkVideo) && epx.f(this.b, ((VkMediaEntry$VkVideo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return lq.a(new StringBuilder("VkVideo(video="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}

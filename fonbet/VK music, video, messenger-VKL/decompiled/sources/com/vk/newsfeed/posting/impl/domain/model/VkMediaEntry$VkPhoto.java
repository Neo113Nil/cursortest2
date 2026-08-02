package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.photo.Photo;
import xsna.epx;
import xsna.tq;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class VkMediaEntry$VkPhoto implements MediaPickerEntry {
    public static final Parcelable.Creator<VkMediaEntry$VkPhoto> CREATOR = new a();
    public final Photo b;

    /* compiled from: MediaPickerState.kt */
    public static final class a implements Parcelable.Creator<VkMediaEntry$VkPhoto> {
        @Override // android.os.Parcelable.Creator
        public final VkMediaEntry$VkPhoto createFromParcel(Parcel parcel) {
            return new VkMediaEntry$VkPhoto((Photo) parcel.readParcelable(VkMediaEntry$VkPhoto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkMediaEntry$VkPhoto[] newArray(int i) {
            return new VkMediaEntry$VkPhoto[i];
        }
    }

    public VkMediaEntry$VkPhoto(Photo photo) {
        this.b = photo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkMediaEntry$VkPhoto) && epx.f(this.b, ((VkMediaEntry$VkPhoto) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tq.c(new StringBuilder("VkPhoto(photo="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}

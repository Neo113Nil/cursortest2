package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public interface MediaPickerSelectedItem extends Parcelable {

    /* compiled from: MediaPickerState.kt */
    public static final class LocalMedia implements MediaPickerSelectedItem {
        public static final Parcelable.Creator<LocalMedia> CREATOR = new a();
        public final LocalMediaEntry b;

        /* compiled from: MediaPickerState.kt */
        public static final class a implements Parcelable.Creator<LocalMedia> {
            @Override // android.os.Parcelable.Creator
            public final LocalMedia createFromParcel(Parcel parcel) {
                return new LocalMedia((LocalMediaEntry) parcel.readParcelable(LocalMedia.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LocalMedia[] newArray(int i) {
                return new LocalMedia[i];
            }
        }

        public LocalMedia(LocalMediaEntry localMediaEntry) {
            this.b = localMediaEntry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalMedia) && epx.f(this.b, ((LocalMedia) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LocalMedia(entry=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class VkPhoto implements MediaPickerSelectedItem {
        public static final Parcelable.Creator<VkPhoto> CREATOR = new a();
        public final VkMediaEntry$VkPhoto b;

        /* compiled from: MediaPickerState.kt */
        public static final class a implements Parcelable.Creator<VkPhoto> {
            @Override // android.os.Parcelable.Creator
            public final VkPhoto createFromParcel(Parcel parcel) {
                return new VkPhoto(VkMediaEntry$VkPhoto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VkPhoto[] newArray(int i) {
                return new VkPhoto[i];
            }
        }

        public VkPhoto(VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto) {
            this.b = vkMediaEntry$VkPhoto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkPhoto) && epx.f(this.b, ((VkPhoto) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "VkPhoto(entry=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class VkVideo implements MediaPickerSelectedItem {
        public static final Parcelable.Creator<VkVideo> CREATOR = new a();
        public final VkMediaEntry$VkVideo b;

        /* compiled from: MediaPickerState.kt */
        public static final class a implements Parcelable.Creator<VkVideo> {
            @Override // android.os.Parcelable.Creator
            public final VkVideo createFromParcel(Parcel parcel) {
                return new VkVideo(VkMediaEntry$VkVideo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideo[] newArray(int i) {
                return new VkVideo[i];
            }
        }

        public VkVideo(VkMediaEntry$VkVideo vkMediaEntry$VkVideo) {
            this.b = vkMediaEntry$VkVideo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkVideo) && epx.f(this.b, ((VkVideo) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "VkVideo(entry=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }
}

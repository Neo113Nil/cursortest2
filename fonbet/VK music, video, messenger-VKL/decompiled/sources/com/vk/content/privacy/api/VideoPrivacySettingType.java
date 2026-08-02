package com.vk.content.privacy.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VideoPrivacySettingType.kt */
/* loaded from: classes17.dex */
public interface VideoPrivacySettingType extends Parcelable {

    /* compiled from: VideoPrivacySettingType.kt */
    public static final class PlaylistWatch implements VideoPrivacySettingType {
        public static final PlaylistWatch b = new PlaylistWatch();
        public static final Parcelable.Creator<PlaylistWatch> CREATOR = new a();

        /* compiled from: VideoPrivacySettingType.kt */
        public static final class a implements Parcelable.Creator<PlaylistWatch> {
            @Override // android.os.Parcelable.Creator
            public final PlaylistWatch createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PlaylistWatch.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PlaylistWatch[] newArray(int i) {
                return new PlaylistWatch[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlaylistWatch);
        }

        public final int hashCode() {
            return 457496561;
        }

        public final String toString() {
            return "PlaylistWatch";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPrivacySettingType.kt */
    public static final class VideoComments implements VideoPrivacySettingType {
        public static final VideoComments b = new VideoComments();
        public static final Parcelable.Creator<VideoComments> CREATOR = new a();

        /* compiled from: VideoPrivacySettingType.kt */
        public static final class a implements Parcelable.Creator<VideoComments> {
            @Override // android.os.Parcelable.Creator
            public final VideoComments createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VideoComments.b;
            }

            @Override // android.os.Parcelable.Creator
            public final VideoComments[] newArray(int i) {
                return new VideoComments[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoComments);
        }

        public final int hashCode() {
            return -1220485789;
        }

        public final String toString() {
            return "VideoComments";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPrivacySettingType.kt */
    public static final class VideoWatch implements VideoPrivacySettingType {
        public static final VideoWatch b = new VideoWatch();
        public static final Parcelable.Creator<VideoWatch> CREATOR = new a();

        /* compiled from: VideoPrivacySettingType.kt */
        public static final class a implements Parcelable.Creator<VideoWatch> {
            @Override // android.os.Parcelable.Creator
            public final VideoWatch createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VideoWatch.b;
            }

            @Override // android.os.Parcelable.Creator
            public final VideoWatch[] newArray(int i) {
                return new VideoWatch[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoWatch);
        }

        public final int hashCode() {
            return 2030343104;
        }

        public final String toString() {
            return "VideoWatch";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}

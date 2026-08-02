package com.vk.dto.stories.entities;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: StoryImSharingData.kt */
/* loaded from: classes18.dex */
public abstract class StoryImSharingData implements Parcelable {
    public final Uri b;
    public final StoryImSharingStats c;

    /* compiled from: StoryImSharingData.kt */
    public static final class Photo extends StoryImSharingData {
        public static final Parcelable.Creator<Photo> CREATOR = new a();
        public final Uri d;
        public final StoryImSharingStats e;

        /* compiled from: StoryImSharingData.kt */
        public static final class a implements Parcelable.Creator<Photo> {
            @Override // android.os.Parcelable.Creator
            public final Photo createFromParcel(Parcel parcel) {
                return new Photo((Uri) parcel.readParcelable(Photo.class.getClassLoader()), StoryImSharingStats.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Photo[] newArray(int i) {
                return new Photo[i];
            }
        }

        public Photo(Uri uri, StoryImSharingStats storyImSharingStats) {
            super(uri, storyImSharingStats, null);
            this.d = uri;
            this.e = storyImSharingStats;
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final StoryImSharingStats d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj;
            return epx.f(this.d, photo.d) && epx.f(this.e, photo.e);
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final Uri getUri() {
            return this.d;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Photo(uri=" + this.d + ", stats=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            this.e.writeToParcel(parcel, i);
        }
    }

    /* compiled from: StoryImSharingData.kt */
    public static final class Video extends StoryImSharingData {
        public static final Parcelable.Creator<Video> CREATOR = new a();
        public final Uri d;
        public final StoryImSharingStats e;

        /* compiled from: StoryImSharingData.kt */
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            public final Video createFromParcel(Parcel parcel) {
                return new Video((Uri) parcel.readParcelable(Video.class.getClassLoader()), StoryImSharingStats.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Video[] newArray(int i) {
                return new Video[i];
            }
        }

        public Video(Uri uri, StoryImSharingStats storyImSharingStats) {
            super(uri, storyImSharingStats, null);
            this.d = uri;
            this.e = storyImSharingStats;
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final StoryImSharingStats d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return epx.f(this.d, video.d) && epx.f(this.e, video.e);
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final Uri getUri() {
            return this.d;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Video(uri=" + this.d + ", stats=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            this.e.writeToParcel(parcel, i);
        }
    }

    /* compiled from: StoryImSharingData.kt */
    public static final class VideoMsg extends StoryImSharingData {
        public static final Parcelable.Creator<VideoMsg> CREATOR = new a();
        public final Uri d;
        public final StoryImSharingStats e;
        public final String f;

        /* compiled from: StoryImSharingData.kt */
        public static final class a implements Parcelable.Creator<VideoMsg> {
            @Override // android.os.Parcelable.Creator
            public final VideoMsg createFromParcel(Parcel parcel) {
                return new VideoMsg((Uri) parcel.readParcelable(VideoMsg.class.getClassLoader()), StoryImSharingStats.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoMsg[] newArray(int i) {
                return new VideoMsg[i];
            }
        }

        public VideoMsg(Uri uri, StoryImSharingStats storyImSharingStats, String str) {
            super(uri, storyImSharingStats, null);
            this.d = uri;
            this.e = storyImSharingStats;
            this.f = str;
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final StoryImSharingStats d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMsg)) {
                return false;
            }
            VideoMsg videoMsg = (VideoMsg) obj;
            return epx.f(this.d, videoMsg.d) && epx.f(this.e, videoMsg.e) && epx.f(this.f, videoMsg.f);
        }

        @Override // com.vk.dto.stories.entities.StoryImSharingData
        public final Uri getUri() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoMsg(uri=");
            sb.append(this.d);
            sb.append(", stats=");
            sb.append(this.e);
            sb.append(", path=");
            return ho8.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            this.e.writeToParcel(parcel, i);
            parcel.writeString(this.f);
        }
    }

    public StoryImSharingData(Uri uri, StoryImSharingStats storyImSharingStats, zcl zclVar) {
        this.b = uri;
        this.c = storyImSharingStats;
    }

    public StoryImSharingStats d() {
        return this.c;
    }

    public Uri getUri() {
        return this.b;
    }
}

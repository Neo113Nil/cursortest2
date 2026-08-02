package com.vk.video.ui.discovery.minimizable.announce;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceState;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;

/* compiled from: VideoAnnounceState.kt */
/* loaded from: classes7.dex */
public interface VideoAnnounceState extends Parcelable {

    /* compiled from: VideoAnnounceState.kt */
    public static final class Closed implements VideoAnnounceState {
        public static final Closed b = new Closed();
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: VideoAnnounceState.kt */
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Closed[] newArray(int i) {
                return new Closed[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return -2081088690;
        }

        public final String toString() {
            return "Closed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoAnnounceState.kt */
    public static final class Shown implements VideoAnnounceState {
        public static final Parcelable.Creator<Shown> CREATOR = new a();
        public final VideoFile b;
        public final VideoFile c;
        public final long d;
        public final boolean e;
        public final AuthorAnnounceState f;

        /* compiled from: VideoAnnounceState.kt */
        public static final class a implements Parcelable.Creator<Shown> {
            @Override // android.os.Parcelable.Creator
            public final Shown createFromParcel(Parcel parcel) {
                return new Shown((VideoFile) parcel.readParcelable(Shown.class.getClassLoader()), (VideoFile) parcel.readParcelable(Shown.class.getClassLoader()), parcel.readLong(), parcel.readInt() != 0, AuthorAnnounceState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Shown[] newArray(int i) {
                return new Shown[i];
            }
        }

        public Shown(VideoFile videoFile, VideoFile videoFile2, long j, boolean z, AuthorAnnounceState authorAnnounceState) {
            this.b = videoFile;
            this.c = videoFile2;
            this.d = j;
            this.e = z;
            this.f = authorAnnounceState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shown)) {
                return false;
            }
            Shown shown = (Shown) obj;
            return epx.f(this.b, shown.b) && epx.f(this.c, shown.c) && this.d == shown.d && this.e == shown.e && epx.f(this.f, shown.f);
        }

        public final int hashCode() {
            VideoFile videoFile = this.b;
            int hashCode = (videoFile == null ? 0 : videoFile.hashCode()) * 31;
            VideoFile videoFile2 = this.c;
            return this.f.hashCode() + qoy.b(bh10.a((hashCode + (videoFile2 != null ? videoFile2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            return "Shown(currentVideo=" + this.b + ", nextVideo=" + this.c + ", timeUntilNextVideo=" + this.d + ", isAutoplay=" + this.e + ", authorAnnounceState=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeLong(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            this.f.writeToParcel(parcel, i);
        }
    }
}

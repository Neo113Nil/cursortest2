package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VideoPlayerProgress.kt */
/* loaded from: classes7.dex */
public abstract class VideoPlayerProgress implements Parcelable {

    /* compiled from: VideoPlayerProgress.kt */
    public static final class Ad extends VideoPlayerProgress {
        public static final Parcelable.Creator<Ad> CREATOR = new a();
        public final long b;
        public final long c;

        /* compiled from: VideoPlayerProgress.kt */
        public static final class a implements Parcelable.Creator<Ad> {
            @Override // android.os.Parcelable.Creator
            public final Ad createFromParcel(Parcel parcel) {
                return new Ad(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Ad[] newArray(int i) {
                return new Ad[i];
            }
        }

        public Ad(long j, long j2) {
            super(null);
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ad)) {
                return false;
            }
            Ad ad = (Ad) obj;
            return this.b == ad.b && this.c == ad.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ad(position=");
            sb.append(this.b);
            sb.append(", duration=");
            return vu5.a(')', this.c, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    /* compiled from: VideoPlayerProgress.kt */
    public static final class Empty extends VideoPlayerProgress {
        public static final Empty b = new Empty(null);
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* compiled from: VideoPlayerProgress.kt */
        public static final class a implements Parcelable.Creator<Empty> {
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Empty.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -765472735;
        }

        public final String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerProgress.kt */
    public static final class Filled extends VideoPlayerProgress {
        public static final Filled b = new Filled(null);
        public static final Parcelable.Creator<Filled> CREATOR = new a();

        /* compiled from: VideoPlayerProgress.kt */
        public static final class a implements Parcelable.Creator<Filled> {
            @Override // android.os.Parcelable.Creator
            public final Filled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Filled.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Filled[] newArray(int i) {
                return new Filled[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Filled);
        }

        public final int hashCode() {
            return 2064956686;
        }

        public final String toString() {
            return "Filled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerProgress.kt */
    public static final class Vod extends VideoPlayerProgress {
        public static final Parcelable.Creator<Vod> CREATOR = new a();
        public final long b;
        public final long c;

        /* compiled from: VideoPlayerProgress.kt */
        public static final class a implements Parcelable.Creator<Vod> {
            @Override // android.os.Parcelable.Creator
            public final Vod createFromParcel(Parcel parcel) {
                return new Vod(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Vod[] newArray(int i) {
                return new Vod[i];
            }
        }

        public Vod(long j, long j2) {
            super(null);
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vod)) {
                return false;
            }
            Vod vod = (Vod) obj;
            return this.b == vod.b && this.c == vod.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vod(position=");
            sb.append(this.b);
            sb.append(", duration=");
            return vu5.a(')', this.c, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    public /* synthetic */ VideoPlayerProgress(zcl zclVar) {
        this();
    }

    public VideoPlayerProgress() {
    }
}

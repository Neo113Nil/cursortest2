package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VideoPlayerStatus.kt */
/* loaded from: classes7.dex */
public abstract class VideoPlayerStatus implements Parcelable {

    /* compiled from: VideoPlayerStatus.kt */
    public static final class AdPaused extends VideoPlayerStatus {
        public static final Parcelable.Creator<AdPaused> CREATOR = new a();
        public final boolean b;

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<AdPaused> {
            @Override // android.os.Parcelable.Creator
            public final AdPaused createFromParcel(Parcel parcel) {
                return new AdPaused(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AdPaused[] newArray(int i) {
                return new AdPaused[i];
            }
        }

        public AdPaused(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdPaused) && this.b == ((AdPaused) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("AdPaused(pausedByUser="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class AdPlaying extends VideoPlayerStatus {
        public static final AdPlaying b = new AdPlaying(null);
        public static final Parcelable.Creator<AdPlaying> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<AdPlaying> {
            @Override // android.os.Parcelable.Creator
            public final AdPlaying createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AdPlaying.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AdPlaying[] newArray(int i) {
                return new AdPlaying[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdPlaying);
        }

        public final int hashCode() {
            return 1877636132;
        }

        public final String toString() {
            return "AdPlaying";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Announce extends VideoPlayerStatus {
        public static final Parcelable.Creator<Announce> CREATOR = new a();
        public final long b;
        public final long c;

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Announce> {
            @Override // android.os.Parcelable.Creator
            public final Announce createFromParcel(Parcel parcel) {
                return new Announce(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Announce[] newArray(int i) {
                return new Announce[i];
            }
        }

        public Announce() {
            this(0L, 0L, 3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Announce)) {
                return false;
            }
            Announce announce = (Announce) obj;
            return this.b == announce.b && this.c == announce.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Announce(secondsLeft=");
            sb.append(this.b);
            sb.append(", secondsTotal=");
            return vu5.a(')', this.c, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public /* synthetic */ Announce(long j, long j2, int i, zcl zclVar) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }

        public Announce(long j, long j2) {
            super(null);
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Completed extends VideoPlayerStatus {
        public static final Completed b = new Completed();
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Completed> {
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Completed.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Completed);
        }

        public final int hashCode() {
            return 345664484;
        }

        public final String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Error extends VideoPlayerStatus {
        public static final Error b = new Error(null);
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1271069729;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Loading extends VideoPlayerStatus {
        public static final Loading b = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -752031467;
        }

        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Paused extends VideoPlayerStatus {
        public static final Parcelable.Creator<Paused> CREATOR = new a();
        public final boolean b;

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Paused> {
            @Override // android.os.Parcelable.Creator
            public final Paused createFromParcel(Parcel parcel) {
                return new Paused(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Paused[] newArray(int i) {
                return new Paused[i];
            }
        }

        public Paused() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && this.b == ((Paused) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Paused(pausedByUser="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }

        public Paused(boolean z) {
            super(null);
            this.b = z;
        }

        public /* synthetic */ Paused(boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Playing extends VideoPlayerStatus {
        public static final Playing b = new Playing();
        public static final Parcelable.Creator<Playing> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Playing> {
            @Override // android.os.Parcelable.Creator
            public final Playing createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Playing.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Playing[] newArray(int i) {
                return new Playing[i];
            }
        }

        public Playing() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Playing);
        }

        public final int hashCode() {
            return -1582245881;
        }

        public final String toString() {
            return "Playing";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoPlayerStatus.kt */
    public static final class Restricted extends VideoPlayerStatus {
        public static final Restricted b = new Restricted(null);
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* compiled from: VideoPlayerStatus.kt */
        public static final class a implements Parcelable.Creator<Restricted> {
            @Override // android.os.Parcelable.Creator
            public final Restricted createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Restricted.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Restricted[] newArray(int i) {
                return new Restricted[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Restricted);
        }

        public final int hashCode() {
            return 1369589218;
        }

        public final String toString() {
            return "Restricted";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ VideoPlayerStatus(zcl zclVar) {
        this();
    }

    public VideoPlayerStatus() {
    }
}

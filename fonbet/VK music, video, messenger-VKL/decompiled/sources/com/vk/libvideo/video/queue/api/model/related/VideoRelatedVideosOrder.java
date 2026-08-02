package com.vk.libvideo.video.queue.api.model.related;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoRelatedVideosOrder.kt */
/* loaded from: classes3.dex */
public interface VideoRelatedVideosOrder extends Parcelable {

    /* compiled from: VideoRelatedVideosOrder.kt */
    public static final class Original implements VideoRelatedVideosOrder {
        public static final Original b = new Original();
        public static final Parcelable.Creator<Original> CREATOR = new a();

        /* compiled from: VideoRelatedVideosOrder.kt */
        public static final class a implements Parcelable.Creator<Original> {
            @Override // android.os.Parcelable.Creator
            public final Original createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Original.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Original[] newArray(int i) {
                return new Original[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Original);
        }

        public final int hashCode() {
            return -43216751;
        }

        public final String toString() {
            return "Original";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoRelatedVideosOrder.kt */
    public static final class Reverse implements VideoRelatedVideosOrder {
        public static final Reverse b = new Reverse();
        public static final Parcelable.Creator<Reverse> CREATOR = new a();

        /* compiled from: VideoRelatedVideosOrder.kt */
        public static final class a implements Parcelable.Creator<Reverse> {
            @Override // android.os.Parcelable.Creator
            public final Reverse createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Reverse.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Reverse[] newArray(int i) {
                return new Reverse[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reverse);
        }

        public final int hashCode() {
            return 1469608994;
        }

        public final String toString() {
            return "Reverse";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoRelatedVideosOrder.kt */
    public static final class Shuffled implements VideoRelatedVideosOrder {
        public static final Parcelable.Creator<Shuffled> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: VideoRelatedVideosOrder.kt */
        public static final class a implements Parcelable.Creator<Shuffled> {
            @Override // android.os.Parcelable.Creator
            public final Shuffled createFromParcel(Parcel parcel) {
                return new Shuffled(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Shuffled[] newArray(int i) {
                return new Shuffled[i];
            }
        }

        public Shuffled(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shuffled)) {
                return false;
            }
            Shuffled shuffled = (Shuffled) obj;
            return this.b == shuffled.b && epx.f(this.c, shuffled.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Shuffled(shuffleId=");
            sb.append(this.b);
            sb.append(", firstShuffledVideo=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }
}

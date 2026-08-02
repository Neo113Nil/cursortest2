package com.vk.music.bottomsheets.audiobook;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: AudioBookBottomSheetLaunchPoint.kt */
/* loaded from: classes3.dex */
public interface AudioBookBottomSheetLaunchPoint extends Parcelable {

    /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
    public static abstract class AudioBookListPoint implements AudioBookBottomSheetLaunchPoint {
        public final boolean b;

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class AudioBookFavoriteList extends AudioBookListPoint {
            public static final Parcelable.Creator<AudioBookFavoriteList> CREATOR = new a();
            public final int c;
            public final boolean d;
            public final String e;

            /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
            public static final class a implements Parcelable.Creator<AudioBookFavoriteList> {
                @Override // android.os.Parcelable.Creator
                public final AudioBookFavoriteList createFromParcel(Parcel parcel) {
                    return new AudioBookFavoriteList(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AudioBookFavoriteList[] newArray(int i) {
                    return new AudioBookFavoriteList[i];
                }
            }

            public AudioBookFavoriteList(int i, boolean z, String str) {
                super(i, z, str, null);
                this.c = i;
                this.d = z;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
                parcel.writeInt(this.d ? 1 : 0);
                parcel.writeString(this.e);
            }
        }

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class AudioBookListenedList extends AudioBookListPoint {
            public static final Parcelable.Creator<AudioBookListenedList> CREATOR = new a();
            public final int c;
            public final boolean d;
            public final String e;

            /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
            public static final class a implements Parcelable.Creator<AudioBookListenedList> {
                @Override // android.os.Parcelable.Creator
                public final AudioBookListenedList createFromParcel(Parcel parcel) {
                    return new AudioBookListenedList(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AudioBookListenedList[] newArray(int i) {
                    return new AudioBookListenedList[i];
                }
            }

            public AudioBookListenedList(int i, boolean z, String str) {
                super(i, z, str, null);
                this.c = i;
                this.d = z;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
                parcel.writeInt(this.d ? 1 : 0);
                parcel.writeString(this.e);
            }
        }

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class AudioBookOfflineList extends AudioBookListPoint {
            public static final Parcelable.Creator<AudioBookOfflineList> CREATOR = new a();
            public final int c;
            public final boolean d;
            public final String e;

            /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
            public static final class a implements Parcelable.Creator<AudioBookOfflineList> {
                @Override // android.os.Parcelable.Creator
                public final AudioBookOfflineList createFromParcel(Parcel parcel) {
                    return new AudioBookOfflineList(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AudioBookOfflineList[] newArray(int i) {
                    return new AudioBookOfflineList[i];
                }
            }

            public AudioBookOfflineList(int i, boolean z, String str) {
                super(i, z, str, null);
                this.c = i;
                this.d = z;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
                parcel.writeInt(this.d ? 1 : 0);
                parcel.writeString(this.e);
            }
        }

        public AudioBookListPoint(int i, boolean z, String str, zcl zclVar) {
            this.b = z;
        }
    }

    /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
    public static final class AudioBookScreen implements AudioBookBottomSheetLaunchPoint {
        public static final Parcelable.Creator<AudioBookScreen> CREATOR = new a();
        public final int b;
        public final boolean c;
        public final String d;

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<AudioBookScreen> {
            @Override // android.os.Parcelable.Creator
            public final AudioBookScreen createFromParcel(Parcel parcel) {
                return new AudioBookScreen(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AudioBookScreen[] newArray(int i) {
                return new AudioBookScreen[i];
            }
        }

        public AudioBookScreen(int i, boolean z, String str) {
            this.b = i;
            this.c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
    public static final class BigPlayer implements AudioBookBottomSheetLaunchPoint {
        public static final BigPlayer b = new BigPlayer();
        public static final Parcelable.Creator<BigPlayer> CREATOR = new a();

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<BigPlayer> {
            @Override // android.os.Parcelable.Creator
            public final BigPlayer createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BigPlayer.b;
            }

            @Override // android.os.Parcelable.Creator
            public final BigPlayer[] newArray(int i) {
                return new BigPlayer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BigPlayer);
        }

        public final int hashCode() {
            return 1066101746;
        }

        public final String toString() {
            return "BigPlayer";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
    public static final class SmallPlayer implements AudioBookBottomSheetLaunchPoint {
        public static final SmallPlayer b = new SmallPlayer();
        public static final Parcelable.Creator<SmallPlayer> CREATOR = new a();

        /* compiled from: AudioBookBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<SmallPlayer> {
            @Override // android.os.Parcelable.Creator
            public final SmallPlayer createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SmallPlayer.b;
            }

            @Override // android.os.Parcelable.Creator
            public final SmallPlayer[] newArray(int i) {
                return new SmallPlayer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SmallPlayer);
        }

        public final int hashCode() {
            return 67168889;
        }

        public final String toString() {
            return "SmallPlayer";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}

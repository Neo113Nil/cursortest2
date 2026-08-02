package com.vk.music.bottomsheets.audiobook;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
/* loaded from: classes3.dex */
public interface AudioBookPersonBottomSheetLaunchPoint extends Parcelable {

    /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
    public static final class AudioBookPersonScreen implements AudioBookPersonBottomSheetLaunchPoint {
        public static final AudioBookPersonScreen b = new AudioBookPersonScreen();
        public static final Parcelable.Creator<AudioBookPersonScreen> CREATOR = new a();

        /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<AudioBookPersonScreen> {
            @Override // android.os.Parcelable.Creator
            public final AudioBookPersonScreen createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AudioBookPersonScreen.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AudioBookPersonScreen[] newArray(int i) {
                return new AudioBookPersonScreen[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AudioBookPersonScreen);
        }

        public final int hashCode() {
            return -242562170;
        }

        public final String toString() {
            return "AudioBookPersonScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
    public static final class AudioBookScreen implements AudioBookPersonBottomSheetLaunchPoint {
        public static final AudioBookScreen b = new AudioBookScreen();
        public static final Parcelable.Creator<AudioBookScreen> CREATOR = new a();

        /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<AudioBookScreen> {
            @Override // android.os.Parcelable.Creator
            public final AudioBookScreen createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AudioBookScreen.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AudioBookScreen[] newArray(int i) {
                return new AudioBookScreen[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AudioBookScreen);
        }

        public final int hashCode() {
            return -1583642735;
        }

        public final String toString() {
            return "AudioBookScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
    public static final class Player implements AudioBookPersonBottomSheetLaunchPoint {
        public static final Player b = new Player();
        public static final Parcelable.Creator<Player> CREATOR = new a();

        /* compiled from: AudioBookPersonBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<Player> {
            @Override // android.os.Parcelable.Creator
            public final Player createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Player.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Player[] newArray(int i) {
                return new Player[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Player);
        }

        public final int hashCode() {
            return -1844665925;
        }

        public final String toString() {
            return "Player";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}

package com.vk.video.playlist.playlistscreen.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import xsna.epx;

/* compiled from: PlaylistScreenState.kt */
/* loaded from: classes6.dex */
public interface PlaylistScreenInfoDataState extends Parcelable {

    /* compiled from: PlaylistScreenState.kt */
    public static final class Failed implements PlaylistScreenInfoDataState {
        public static final Failed b = new Failed();
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* compiled from: PlaylistScreenState.kt */
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Failed.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1866533108;
        }

        public final String toString() {
            return "Failed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PlaylistScreenState.kt */
    public static final class Loaded implements PlaylistScreenInfoDataState {
        public static final Parcelable.Creator<Loaded> CREATOR = new a();
        public final PlaylistDataDo b;

        /* compiled from: PlaylistScreenState.kt */
        public static final class a implements Parcelable.Creator<Loaded> {
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                return new Loaded(PlaylistDataDo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i) {
                return new Loaded[i];
            }
        }

        public Loaded(PlaylistDataDo playlistDataDo) {
            this.b = playlistDataDo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && epx.f(this.b, ((Loaded) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loaded(playlistInfoDo=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: PlaylistScreenState.kt */
    public static final class Loading implements PlaylistScreenInfoDataState {
        public static final Loading b = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: PlaylistScreenState.kt */
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -843775131;
        }

        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}

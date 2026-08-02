package com.vk.music.bottomsheets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.music.player.PlayerTrack;
import xsna.zcl;

/* compiled from: MusicBottomSheetLaunchPoint.kt */
/* loaded from: classes3.dex */
public abstract class MusicBottomSheetLaunchPoint implements Parcelable {

    /* compiled from: MusicBottomSheetLaunchPoint.kt */
    public static final class App extends MusicBottomSheetLaunchPoint {
        public static final App b = new App("BOTTOM_SHEET_APP", null);
        public static final Parcelable.Creator<App> CREATOR = new a();

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<App> {
            @Override // android.os.Parcelable.Creator
            public final App createFromParcel(Parcel parcel) {
                parcel.readInt();
                return App.b;
            }

            @Override // android.os.Parcelable.Creator
            public final App[] newArray(int i) {
                return new App[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MusicBottomSheetLaunchPoint.kt */
    public static final class Delete extends MusicBottomSheetLaunchPoint {
        public static final Delete b = new Delete("BOTTOM_SHEET_DELETE", null);
        public static final Parcelable.Creator<Delete> CREATOR = new a();

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<Delete> {
            @Override // android.os.Parcelable.Creator
            public final Delete createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Delete.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Delete[] newArray(int i) {
                return new Delete[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MusicBottomSheetLaunchPoint.kt */
    public static class Player extends MusicBottomSheetLaunchPoint {
        public static final Parcelable.Creator<Player> CREATOR = new a();
        public final PlayerTrack b;

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class Full extends Player {
            public Full(PlayerTrack playerTrack) {
                super(playerTrack);
            }
        }

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class Limited extends Player {
            public Limited(PlayerTrack playerTrack) {
                super(playerTrack);
            }
        }

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class Messenger extends Player {
            public Messenger(PlayerTrack playerTrack) {
                super(playerTrack);
            }
        }

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<Player> {
            @Override // android.os.Parcelable.Creator
            public final Player createFromParcel(Parcel parcel) {
                return new Player((PlayerTrack) parcel.readParcelable(Player.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Player[] newArray(int i) {
                return new Player[i];
            }
        }

        public Player(PlayerTrack playerTrack) {
            super("BOTTOM_SHEET_PLAYER", null);
            this.b = playerTrack;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: MusicBottomSheetLaunchPoint.kt */
    public static final class Playlist extends MusicBottomSheetLaunchPoint {
        public static final Parcelable.Creator<Playlist> CREATOR = new a();
        public final com.vk.dto.music.Playlist b;

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<Playlist> {
            @Override // android.os.Parcelable.Creator
            public final Playlist createFromParcel(Parcel parcel) {
                return new Playlist((com.vk.dto.music.Playlist) parcel.readParcelable(Playlist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Playlist[] newArray(int i) {
                return new Playlist[i];
            }
        }

        public Playlist(com.vk.dto.music.Playlist playlist) {
            super("BOTTOM_SHEET_PLAYLIST", null);
            this.b = playlist;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: MusicBottomSheetLaunchPoint.kt */
    public static final class Stories extends MusicBottomSheetLaunchPoint {
        public static final Stories b = new Stories("BOTTOM_SHEET_STORIES", null);
        public static final Parcelable.Creator<Stories> CREATOR = new a();

        /* compiled from: MusicBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<Stories> {
            @Override // android.os.Parcelable.Creator
            public final Stories createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Stories.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Stories[] newArray(int i) {
                return new Stories[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public MusicBottomSheetLaunchPoint(String str, zcl zclVar) {
    }
}

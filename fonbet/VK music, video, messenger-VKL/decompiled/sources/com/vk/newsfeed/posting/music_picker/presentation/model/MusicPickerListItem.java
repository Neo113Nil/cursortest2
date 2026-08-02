package com.vk.newsfeed.posting.music_picker.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MusicPickerListItem.kt */
/* loaded from: classes4.dex */
public abstract class MusicPickerListItem implements Parcelable {

    /* compiled from: MusicPickerListItem.kt */
    public static final class EmptyListItem extends MusicPickerListItem {
        public static final Parcelable.Creator<EmptyListItem> CREATOR = new a();
        public final int b;

        /* compiled from: MusicPickerListItem.kt */
        public static final class a implements Parcelable.Creator<EmptyListItem> {
            @Override // android.os.Parcelable.Creator
            public final EmptyListItem createFromParcel(Parcel parcel) {
                return new EmptyListItem(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyListItem[] newArray(int i) {
                return new EmptyListItem[i];
            }
        }

        public EmptyListItem(int i) {
            super(3, null);
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmptyListItem) && this.b == ((EmptyListItem) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("EmptyListItem(messageResourceId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: MusicPickerListItem.kt */
    public static final class MusicPlaylistItem extends MusicPickerListItem {
        public static final Parcelable.Creator<MusicPlaylistItem> CREATOR = new a();
        public final Playlist b;

        /* compiled from: MusicPickerListItem.kt */
        public static final class a implements Parcelable.Creator<MusicPlaylistItem> {
            @Override // android.os.Parcelable.Creator
            public final MusicPlaylistItem createFromParcel(Parcel parcel) {
                return new MusicPlaylistItem((Playlist) parcel.readParcelable(MusicPlaylistItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MusicPlaylistItem[] newArray(int i) {
                return new MusicPlaylistItem[i];
            }
        }

        public MusicPlaylistItem(Playlist playlist) {
            super(2, null);
            this.b = playlist;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicPlaylistItem) && epx.f(this.b, ((MusicPlaylistItem) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "MusicPlaylistItem(playlist=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: MusicPickerListItem.kt */
    public static final class MusicTrackItem extends MusicPickerListItem {
        public static final Parcelable.Creator<MusicTrackItem> CREATOR = new a();
        public final MusicTrack b;
        public final MusicDto c;
        public final boolean d;
        public final PlayingState e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MusicPickerListItem.kt */
        public static final class PlayingState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PlayingState[] $VALUES;
            public static final PlayingState None;
            public static final PlayingState Paused;
            public static final PlayingState Playing;

            static {
                PlayingState playingState = new PlayingState("None", 0);
                None = playingState;
                PlayingState playingState2 = new PlayingState("Playing", 1);
                Playing = playingState2;
                PlayingState playingState3 = new PlayingState("Paused", 2);
                Paused = playingState3;
                PlayingState[] playingStateArr = {playingState, playingState2, playingState3};
                $VALUES = playingStateArr;
                $ENTRIES = new asp(playingStateArr);
            }

            public PlayingState() {
                throw null;
            }

            public static PlayingState valueOf(String str) {
                return (PlayingState) Enum.valueOf(PlayingState.class, str);
            }

            public static PlayingState[] values() {
                return (PlayingState[]) $VALUES.clone();
            }
        }

        /* compiled from: MusicPickerListItem.kt */
        public static final class a implements Parcelable.Creator<MusicTrackItem> {
            @Override // android.os.Parcelable.Creator
            public final MusicTrackItem createFromParcel(Parcel parcel) {
                return new MusicTrackItem((MusicTrack) parcel.readParcelable(MusicTrackItem.class.getClassLoader()), MusicDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, PlayingState.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final MusicTrackItem[] newArray(int i) {
                return new MusicTrackItem[i];
            }
        }

        public MusicTrackItem(MusicTrack musicTrack, MusicDto musicDto, boolean z, PlayingState playingState) {
            super(1, null);
            this.b = musicTrack;
            this.c = musicDto;
            this.d = z;
            this.e = playingState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicTrackItem)) {
                return false;
            }
            MusicTrackItem musicTrackItem = (MusicTrackItem) obj;
            return epx.f(this.b, musicTrackItem.b) && epx.f(this.c, musicTrackItem.c) && this.d == musicTrackItem.d && this.e == musicTrackItem.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            return "MusicTrackItem(track=" + this.b + ", musicDto=" + this.c + ", isSelected=" + this.d + ", playingState=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            this.c.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e.name());
        }
    }

    /* compiled from: MusicPickerListItem.kt */
    public static final class PlaylistsAndAlbumsItem extends MusicPickerListItem {
        public static final PlaylistsAndAlbumsItem b = new PlaylistsAndAlbumsItem(0, null);
        public static final Parcelable.Creator<PlaylistsAndAlbumsItem> CREATOR = new a();

        /* compiled from: MusicPickerListItem.kt */
        public static final class a implements Parcelable.Creator<PlaylistsAndAlbumsItem> {
            @Override // android.os.Parcelable.Creator
            public final PlaylistsAndAlbumsItem createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PlaylistsAndAlbumsItem.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PlaylistsAndAlbumsItem[] newArray(int i) {
                return new PlaylistsAndAlbumsItem[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlaylistsAndAlbumsItem);
        }

        public final int hashCode() {
            return -1137056089;
        }

        public final String toString() {
            return "PlaylistsAndAlbumsItem";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MusicPickerListItem.kt */
    public static final class SelectPlaylistItem extends MusicPickerListItem {
        public static final SelectPlaylistItem b = new SelectPlaylistItem(4, null);
        public static final Parcelable.Creator<SelectPlaylistItem> CREATOR = new a();

        /* compiled from: MusicPickerListItem.kt */
        public static final class a implements Parcelable.Creator<SelectPlaylistItem> {
            @Override // android.os.Parcelable.Creator
            public final SelectPlaylistItem createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SelectPlaylistItem.b;
            }

            @Override // android.os.Parcelable.Creator
            public final SelectPlaylistItem[] newArray(int i) {
                return new SelectPlaylistItem[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectPlaylistItem);
        }

        public final int hashCode() {
            return 1180593115;
        }

        public final String toString() {
            return "SelectPlaylistItem";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public MusicPickerListItem(int i, zcl zclVar) {
    }
}

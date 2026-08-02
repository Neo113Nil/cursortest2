package com.vk.clips.playlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import defpackage.q0;
import xsna.epx;

/* compiled from: ClipsPlaylistPickerParams.kt */
/* loaded from: classes16.dex */
public interface ClipsPlaylistPickerParams extends Parcelable {

    /* compiled from: ClipsPlaylistPickerParams.kt */
    public static final class AddClips implements ClipsPlaylistPickerParams {
        public static final Parcelable.Creator<AddClips> CREATOR = new a();
        public final ClipsPlaylist b;
        public final boolean c;

        /* compiled from: ClipsPlaylistPickerParams.kt */
        public static final class a implements Parcelable.Creator<AddClips> {
            @Override // android.os.Parcelable.Creator
            public final AddClips createFromParcel(Parcel parcel) {
                return new AddClips((ClipsPlaylist) parcel.readParcelable(AddClips.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AddClips[] newArray(int i) {
                return new AddClips[i];
            }
        }

        public AddClips(ClipsPlaylist clipsPlaylist, boolean z) {
            this.b = clipsPlaylist;
            this.c = z;
        }

        @Override // com.vk.clips.playlists.ClipsPlaylistPickerParams
        public final boolean G8() {
            return this.c;
        }

        @Override // com.vk.clips.playlists.ClipsPlaylistPickerParams
        public final ClipsPlaylist Z0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddClips)) {
                return false;
            }
            AddClips addClips = (AddClips) obj;
            return epx.f(this.b, addClips.b) && this.c == addClips.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddClips(playlist=");
            sb.append(this.b);
            sb.append(", isForceDarkTheme=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: ClipsPlaylistPickerParams.kt */
    public static final class RemoveClips implements ClipsPlaylistPickerParams {
        public static final Parcelable.Creator<RemoveClips> CREATOR = new a();
        public final ClipsPlaylist b;
        public final boolean c;

        /* compiled from: ClipsPlaylistPickerParams.kt */
        public static final class a implements Parcelable.Creator<RemoveClips> {
            @Override // android.os.Parcelable.Creator
            public final RemoveClips createFromParcel(Parcel parcel) {
                return new RemoveClips((ClipsPlaylist) parcel.readParcelable(RemoveClips.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final RemoveClips[] newArray(int i) {
                return new RemoveClips[i];
            }
        }

        public RemoveClips(ClipsPlaylist clipsPlaylist, boolean z) {
            this.b = clipsPlaylist;
            this.c = z;
        }

        @Override // com.vk.clips.playlists.ClipsPlaylistPickerParams
        public final boolean G8() {
            return this.c;
        }

        @Override // com.vk.clips.playlists.ClipsPlaylistPickerParams
        public final ClipsPlaylist Z0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveClips)) {
                return false;
            }
            RemoveClips removeClips = (RemoveClips) obj;
            return epx.f(this.b, removeClips.b) && this.c == removeClips.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveClips(playlist=");
            sb.append(this.b);
            sb.append(", isForceDarkTheme=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    boolean G8();

    ClipsPlaylist Z0();
}

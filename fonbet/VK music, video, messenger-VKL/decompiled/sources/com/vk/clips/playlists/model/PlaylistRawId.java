package com.vk.clips.playlists.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: PlaylistRawId.kt */
/* loaded from: classes16.dex */
public final class PlaylistRawId implements Parcelable {
    public static final Parcelable.Creator<PlaylistRawId> CREATOR = new a();
    public final UserId b;
    public final int c;

    /* compiled from: PlaylistRawId.kt */
    public static final class a implements Parcelable.Creator<PlaylistRawId> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistRawId createFromParcel(Parcel parcel) {
            return new PlaylistRawId((UserId) parcel.readParcelable(PlaylistRawId.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistRawId[] newArray(int i) {
            return new PlaylistRawId[i];
        }
    }

    public PlaylistRawId(UserId userId, int i) {
        this.b = userId;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistRawId)) {
            return false;
        }
        PlaylistRawId playlistRawId = (PlaylistRawId) obj;
        return epx.f(this.b, playlistRawId.b) && this.c == playlistRawId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistRawId(ownerId=");
        sb.append(this.b);
        sb.append(", playlistId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}

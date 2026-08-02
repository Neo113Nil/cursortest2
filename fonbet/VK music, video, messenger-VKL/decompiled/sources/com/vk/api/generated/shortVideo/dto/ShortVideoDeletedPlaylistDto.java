package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: ShortVideoDeletedPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoDeletedPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoDeletedPlaylistDto> CREATOR = new a();

    @pmi0("deleted")
    private final boolean deleted;

    @pmi0("playlist_id")
    private final int playlistId;

    /* compiled from: ShortVideoDeletedPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoDeletedPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoDeletedPlaylistDto createFromParcel(Parcel parcel) {
            return new ShortVideoDeletedPlaylistDto(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoDeletedPlaylistDto[] newArray(int i) {
            return new ShortVideoDeletedPlaylistDto[i];
        }
    }

    public ShortVideoDeletedPlaylistDto(int i, boolean z) {
        this.playlistId = i;
        this.deleted = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoDeletedPlaylistDto)) {
            return false;
        }
        ShortVideoDeletedPlaylistDto shortVideoDeletedPlaylistDto = (ShortVideoDeletedPlaylistDto) obj;
        return this.playlistId == shortVideoDeletedPlaylistDto.playlistId && this.deleted == shortVideoDeletedPlaylistDto.deleted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.deleted) + (Integer.hashCode(this.playlistId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoDeletedPlaylistDto(playlistId=");
        sb.append(this.playlistId);
        sb.append(", deleted=");
        return q0.a(sb, this.deleted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.playlistId);
        parcel.writeInt(this.deleted ? 1 : 0);
    }
}

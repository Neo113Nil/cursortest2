package com.vk.video.playlist.playlistscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;

/* compiled from: PlaylistScreenArgs.kt */
/* loaded from: classes6.dex */
public final class PlaylistScreenArgs implements Parcelable {
    public static final Parcelable.Creator<PlaylistScreenArgs> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final CatalogSearchStatInfo e;

    /* compiled from: PlaylistScreenArgs.kt */
    public static final class a implements Parcelable.Creator<PlaylistScreenArgs> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenArgs createFromParcel(Parcel parcel) {
            return new PlaylistScreenArgs(parcel.readInt(), (UserId) parcel.readParcelable(PlaylistScreenArgs.class.getClassLoader()), parcel.readString(), (CatalogSearchStatInfo) parcel.readParcelable(PlaylistScreenArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenArgs[] newArray(int i) {
            return new PlaylistScreenArgs[i];
        }
    }

    public PlaylistScreenArgs(int i, UserId userId, String str, CatalogSearchStatInfo catalogSearchStatInfo) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = catalogSearchStatInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistScreenArgs)) {
            return false;
        }
        PlaylistScreenArgs playlistScreenArgs = (PlaylistScreenArgs) obj;
        return this.b == playlistScreenArgs.b && epx.f(this.c, playlistScreenArgs.c) && epx.f(this.d, playlistScreenArgs.d) && epx.f(this.e, playlistScreenArgs.e);
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        CatalogSearchStatInfo catalogSearchStatInfo = this.e;
        return hashCode + (catalogSearchStatInfo != null ? catalogSearchStatInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PlaylistScreenArgs(playlistId=" + this.b + ", ownerId=" + this.c + ", trackCode=" + this.d + ", catalogSearchStatInfo=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }
}

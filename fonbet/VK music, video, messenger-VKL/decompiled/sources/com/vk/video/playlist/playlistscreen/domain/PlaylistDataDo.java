package com.vk.video.playlist.playlistscreen.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;

/* compiled from: PlaylistDataDo.kt */
/* loaded from: classes6.dex */
public final class PlaylistDataDo implements Parcelable {
    public static final Parcelable.Creator<PlaylistDataDo> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final boolean d;
    public final boolean e;
    public final Image f;
    public final String g;
    public final VideoAlbum h;

    /* compiled from: PlaylistDataDo.kt */
    public static final class a implements Parcelable.Creator<PlaylistDataDo> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistDataDo createFromParcel(Parcel parcel) {
            Class cls;
            UserId userId;
            boolean z;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(PlaylistDataDo.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = PlaylistDataDo.class;
                userId = userId2;
                z = true;
            } else {
                cls = PlaylistDataDo.class;
                userId = userId2;
                z = false;
            }
            return new PlaylistDataDo(readInt, userId, z, parcel.readInt() != 0, (Image) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), (VideoAlbum) parcel.readParcelable(cls.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistDataDo[] newArray(int i) {
            return new PlaylistDataDo[i];
        }
    }

    public PlaylistDataDo(int i, UserId userId, boolean z, boolean z2, Image image, String str, VideoAlbum videoAlbum) {
        this.b = i;
        this.c = userId;
        this.d = z;
        this.e = z2;
        this.f = image;
        this.g = str;
        this.h = videoAlbum;
    }

    public static PlaylistDataDo a(PlaylistDataDo playlistDataDo, boolean z, boolean z2, int i) {
        int i2 = playlistDataDo.b;
        UserId userId = playlistDataDo.c;
        if ((i & 8) != 0) {
            z2 = playlistDataDo.e;
        }
        Image image = playlistDataDo.f;
        String str = playlistDataDo.g;
        VideoAlbum videoAlbum = playlistDataDo.h;
        playlistDataDo.getClass();
        return new PlaylistDataDo(i2, userId, z, z2, image, str, videoAlbum);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistDataDo)) {
            return false;
        }
        PlaylistDataDo playlistDataDo = (PlaylistDataDo) obj;
        return this.b == playlistDataDo.b && epx.f(this.c, playlistDataDo.c) && this.d == playlistDataDo.d && this.e == playlistDataDo.e && epx.f(this.f, playlistDataDo.f) && epx.f(this.g, playlistDataDo.g) && epx.f(this.h, playlistDataDo.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        Image image = this.f;
        int hashCode = (b + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaylistDataDo(playlistId=" + this.b + ", ownerId=" + this.c + ", isSubscribed=" + this.d + ", isSubscribing=" + this.e + ", cover=" + this.f + ", title=" + this.g + ", videoAlbum=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
    }
}

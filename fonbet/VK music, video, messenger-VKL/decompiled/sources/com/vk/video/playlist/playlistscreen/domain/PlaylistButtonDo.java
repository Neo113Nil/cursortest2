package com.vk.video.playlist.playlistscreen.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import xsna.epx;

/* compiled from: PlaylistCatalogDo.kt */
/* loaded from: classes6.dex */
public final class PlaylistButtonDo implements Parcelable {
    public static final Parcelable.Creator<PlaylistButtonDo> CREATOR = new a();
    public final String b;
    public final CatalogLinkButtonActionDo c;

    /* compiled from: PlaylistCatalogDo.kt */
    public static final class a implements Parcelable.Creator<PlaylistButtonDo> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistButtonDo createFromParcel(Parcel parcel) {
            return new PlaylistButtonDo(parcel.readString(), (CatalogLinkButtonActionDo) parcel.readParcelable(PlaylistButtonDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistButtonDo[] newArray(int i) {
            return new PlaylistButtonDo[i];
        }
    }

    public PlaylistButtonDo(String str, CatalogLinkButtonActionDo catalogLinkButtonActionDo) {
        this.b = str;
        this.c = catalogLinkButtonActionDo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistButtonDo)) {
            return false;
        }
        PlaylistButtonDo playlistButtonDo = (PlaylistButtonDo) obj;
        return epx.f(this.b, playlistButtonDo.b) && epx.f(this.c, playlistButtonDo.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogLinkButtonActionDo catalogLinkButtonActionDo = this.c;
        return hashCode + (catalogLinkButtonActionDo == null ? 0 : catalogLinkButtonActionDo.hashCode());
    }

    public final String toString() {
        return "PlaylistButtonDo(title=" + this.b + ", actionType=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}

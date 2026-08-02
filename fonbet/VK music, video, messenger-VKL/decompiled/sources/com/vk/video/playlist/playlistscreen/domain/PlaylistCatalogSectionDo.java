package com.vk.video.playlist.playlistscreen.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import xsna.epx;
import xsna.urd0;

/* compiled from: PlaylistCatalogDo.kt */
/* loaded from: classes6.dex */
public final class PlaylistCatalogSectionDo implements Parcelable {
    public static final Parcelable.Creator<PlaylistCatalogSectionDo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final CatalogSectionDo e;

    /* compiled from: PlaylistCatalogDo.kt */
    public static final class a implements Parcelable.Creator<PlaylistCatalogSectionDo> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistCatalogSectionDo createFromParcel(Parcel parcel) {
            return new PlaylistCatalogSectionDo(parcel.readString(), parcel.readString(), parcel.readString(), (CatalogSectionDo) parcel.readParcelable(PlaylistCatalogSectionDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistCatalogSectionDo[] newArray(int i) {
            return new PlaylistCatalogSectionDo[i];
        }
    }

    public PlaylistCatalogSectionDo(String str, String str2, String str3, CatalogSectionDo catalogSectionDo) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = catalogSectionDo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistCatalogSectionDo)) {
            return false;
        }
        PlaylistCatalogSectionDo playlistCatalogSectionDo = (PlaylistCatalogSectionDo) obj;
        return epx.f(this.b, playlistCatalogSectionDo.b) && epx.f(this.c, playlistCatalogSectionDo.c) && epx.f(this.d, playlistCatalogSectionDo.d) && epx.f(this.e, playlistCatalogSectionDo.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PlaylistCatalogSectionDo(id=" + this.b + ", title=" + this.c + ", sectionUrl=" + this.d + ", sectionDo=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }
}

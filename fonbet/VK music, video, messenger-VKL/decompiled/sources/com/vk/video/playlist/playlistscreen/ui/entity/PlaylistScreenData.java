package com.vk.video.playlist.playlistscreen.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogSectionDo;
import xsna.epx;

/* compiled from: PlaylistScreenState.kt */
/* loaded from: classes6.dex */
public final class PlaylistScreenData implements Parcelable {
    public static final Parcelable.Creator<PlaylistScreenData> CREATOR = new a();
    public final PlaylistCatalogSectionDo b;
    public final CatalogSectionStateFlow c;

    /* compiled from: PlaylistScreenState.kt */
    public static final class a implements Parcelable.Creator<PlaylistScreenData> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenData createFromParcel(Parcel parcel) {
            return new PlaylistScreenData(PlaylistCatalogSectionDo.CREATOR.createFromParcel(parcel), (CatalogSectionStateFlow) parcel.readParcelable(PlaylistScreenData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenData[] newArray(int i) {
            return new PlaylistScreenData[i];
        }
    }

    public PlaylistScreenData(PlaylistCatalogSectionDo playlistCatalogSectionDo, CatalogSectionStateFlow catalogSectionStateFlow) {
        this.b = playlistCatalogSectionDo;
        this.c = catalogSectionStateFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistScreenData)) {
            return false;
        }
        PlaylistScreenData playlistScreenData = (PlaylistScreenData) obj;
        return epx.f(this.b, playlistScreenData.b) && epx.f(this.c, playlistScreenData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistScreenData(sectionDo=" + this.b + ", sectionState=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}

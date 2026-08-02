package com.vk.video.playlist.playlistscreen.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;

/* compiled from: PlaylistCatalogDo.kt */
/* loaded from: classes6.dex */
public final class PlaylistCatalogDo implements Parcelable {
    public static final Parcelable.Creator<PlaylistCatalogDo> CREATOR = new a();
    public final PlaylistCatalogSectionDo b;
    public final PlaylistDataDo c;
    public final List<PlaylistButtonDo> d;
    public final List<VideoFile> e;

    /* compiled from: PlaylistCatalogDo.kt */
    public static final class a implements Parcelable.Creator<PlaylistCatalogDo> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistCatalogDo createFromParcel(Parcel parcel) {
            PlaylistCatalogSectionDo createFromParcel = PlaylistCatalogSectionDo.CREATOR.createFromParcel(parcel);
            PlaylistDataDo createFromParcel2 = parcel.readInt() == 0 ? null : PlaylistDataDo.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(PlaylistButtonDo.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(PlaylistCatalogDo.class, parcel, arrayList2, i, 1);
            }
            return new PlaylistCatalogDo(createFromParcel, createFromParcel2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistCatalogDo[] newArray(int i) {
            return new PlaylistCatalogDo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaylistCatalogDo(PlaylistCatalogSectionDo playlistCatalogSectionDo, PlaylistDataDo playlistDataDo, List<PlaylistButtonDo> list, List<? extends VideoFile> list2) {
        this.b = playlistCatalogSectionDo;
        this.c = playlistDataDo;
        this.d = list;
        this.e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistCatalogDo)) {
            return false;
        }
        PlaylistCatalogDo playlistCatalogDo = (PlaylistCatalogDo) obj;
        return epx.f(this.b, playlistCatalogDo.b) && epx.f(this.c, playlistCatalogDo.c) && epx.f(this.d, playlistCatalogDo.d) && epx.f(this.e, playlistCatalogDo.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PlaylistDataDo playlistDataDo = this.c;
        return this.e.hashCode() + fw3.a((hashCode + (playlistDataDo == null ? 0 : playlistDataDo.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistCatalogDo(section=");
        sb.append(this.b);
        sb.append(", playlistInfoDo=");
        sb.append(this.c);
        sb.append(", buttons=");
        sb.append(this.d);
        sb.append(", videoFiles=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        PlaylistDataDo playlistDataDo = this.c;
        if (playlistDataDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playlistDataDo.writeToParcel(parcel, i);
        }
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            ((PlaylistButtonDo) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.e);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}

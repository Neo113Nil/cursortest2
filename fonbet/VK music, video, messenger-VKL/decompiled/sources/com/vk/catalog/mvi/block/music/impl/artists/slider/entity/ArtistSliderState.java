package com.vk.catalog.mvi.block.music.impl.artists.slider.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ArtistSliderState.kt */
/* loaded from: classes.dex */
public final class ArtistSliderState implements CatalogBlockState {
    public static final Parcelable.Creator<ArtistSliderState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final PlayingState d;
    public final Playlist e;
    public final List<Artist> f;
    public final String g;
    public final String h;

    /* compiled from: ArtistSliderState.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<ArtistSliderState> {
        @Override // android.os.Parcelable.Creator
        public final ArtistSliderState createFromParcel(Parcel parcel) {
            BlockId blockId = (BlockId) parcel.readParcelable(ArtistSliderState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            PlayingState valueOf2 = PlayingState.valueOf(parcel.readString());
            Playlist playlist = (Playlist) parcel.readParcelable(ArtistSliderState.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ArtistSliderState.class, parcel, arrayList, i, 1);
            }
            return new ArtistSliderState(blockId, valueOf, valueOf2, playlist, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArtistSliderState[] newArray(int i) {
            return new ArtistSliderState[i];
        }
    }

    public ArtistSliderState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, PlayingState playingState, Playlist playlist, List<Artist> list, String str, String str2) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = playingState;
        this.e = playlist;
        this.f = list;
        this.g = str;
        this.h = str2;
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistSliderState)) {
            return false;
        }
        ArtistSliderState artistSliderState = (ArtistSliderState) obj;
        return epx.f(this.b, artistSliderState.b) && this.c == artistSliderState.c && this.d == artistSliderState.d && epx.f(this.e, artistSliderState.e) && epx.f(this.f, artistSliderState.f) && epx.f(this.g, artistSliderState.g) && epx.f(this.h, artistSliderState.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a((this.e.hashCode() + ((this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31)) * 31)) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistSliderState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", playingState=");
        sb.append(this.d);
        sb.append(", playlist=");
        sb.append(this.e);
        sb.append(", artists=");
        sb.append(this.f);
        sb.append(", sectionId=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        Iterator a2 = ao.a(parcel, this.f);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}

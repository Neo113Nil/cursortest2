package com.vk.catalog.mvi.block.music.impl.recommended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.music.Playlist;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: RecommendedPlaylistState.kt */
/* loaded from: classes.dex */
public final class RecommendedPlaylistState implements CatalogBlockState {
    public static final Parcelable.Creator<RecommendedPlaylistState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final String d;
    public final Float e;
    public final String f;
    public final PlayingState g;
    public final Playlist h;
    public final boolean i;
    public final String j;
    public final String k;

    /* compiled from: RecommendedPlaylistState.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<RecommendedPlaylistState> {
        @Override // android.os.Parcelable.Creator
        public final RecommendedPlaylistState createFromParcel(Parcel parcel) {
            return new RecommendedPlaylistState((BlockId) parcel.readParcelable(RecommendedPlaylistState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), PlayingState.valueOf(parcel.readString()), (Playlist) parcel.readParcelable(RecommendedPlaylistState.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendedPlaylistState[] newArray(int i) {
            return new RecommendedPlaylistState[i];
        }
    }

    public RecommendedPlaylistState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, String str, Float f, String str2, PlayingState playingState, Playlist playlist, boolean z, String str3, String str4) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = str;
        this.e = f;
        this.f = str2;
        this.g = playingState;
        this.h = playlist;
        this.i = z;
        this.j = str3;
        this.k = str4;
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
        if (!(obj instanceof RecommendedPlaylistState)) {
            return false;
        }
        RecommendedPlaylistState recommendedPlaylistState = (RecommendedPlaylistState) obj;
        return epx.f(this.b, recommendedPlaylistState.b) && this.c == recommendedPlaylistState.c && epx.f(this.d, recommendedPlaylistState.d) && epx.f(this.e, recommendedPlaylistState.e) && epx.f(this.f, recommendedPlaylistState.f) && this.g == recommendedPlaylistState.g && epx.f(this.h, recommendedPlaylistState.h) && this.i == recommendedPlaylistState.i && epx.f(this.j, recommendedPlaylistState.j) && epx.f(this.k, recommendedPlaylistState.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        Float f = this.e;
        int b = qoy.b((this.h.hashCode() + ((this.g.hashCode() + urd0.a((a2 + (f == null ? 0 : f.hashCode())) * 31, 31, this.f)) * 31)) * 31, 31, this.i);
        String str = this.j;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedPlaylistState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", matchPercent=");
        sb.append(this.e);
        sb.append(", matchTitle=");
        sb.append(this.f);
        sb.append(", playingState=");
        sb.append(this.g);
        sb.append(", playlist=");
        sb.append(this.h);
        sb.append(", isWithOwner=");
        sb.append(this.i);
        sb.append(", backgroundImageUrl=");
        sb.append(this.j);
        sb.append(", playingTrackMid=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        Float f = this.e;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g.name());
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
    }
}

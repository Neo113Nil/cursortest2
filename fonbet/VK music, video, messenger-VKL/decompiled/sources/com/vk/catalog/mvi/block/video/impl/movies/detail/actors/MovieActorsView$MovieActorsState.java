package com.vk.catalog.mvi.block.video.impl.movies.detail.actors;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.r2a;

/* compiled from: MovieActorsView.kt */
/* loaded from: classes.dex */
public final class MovieActorsView$MovieActorsState implements CatalogBlockState, r2a {
    public static final Parcelable.Creator<MovieActorsView$MovieActorsState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final List<String> d;

    /* compiled from: MovieActorsView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieActorsView$MovieActorsState> {
        @Override // android.os.Parcelable.Creator
        public final MovieActorsView$MovieActorsState createFromParcel(Parcel parcel) {
            return new MovieActorsView$MovieActorsState((BlockId) parcel.readParcelable(MovieActorsView$MovieActorsState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MovieActorsView$MovieActorsState[] newArray(int i) {
            return new MovieActorsView$MovieActorsState[i];
        }
    }

    public MovieActorsView$MovieActorsState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, List<String> list) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = list;
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
        if (!(obj instanceof MovieActorsView$MovieActorsState)) {
            return false;
        }
        MovieActorsView$MovieActorsState movieActorsView$MovieActorsState = (MovieActorsView$MovieActorsState) obj;
        return epx.f(this.b, movieActorsView$MovieActorsState.b) && this.c == movieActorsView$MovieActorsState.c && epx.f(this.d, movieActorsView$MovieActorsState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieActorsState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", actorNames=");
        return ms9.a(')', sb, this.d);
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeStringList(this.d);
    }
}

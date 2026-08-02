package com.vk.catalog.mvi.block.video.impl.movies.detail.poster;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.r2a;
import xsna.shy;
import xsna.urd0;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes.dex */
public final class MoviePosterView$MoviePosterBlockState implements CatalogBlockState, r2a {
    public static final Parcelable.Creator<MoviePosterView$MoviePosterBlockState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final int d;
    public final String e;
    public final Float f;
    public final String g;
    public final String h;

    /* compiled from: MoviePosterView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MoviePosterView$MoviePosterBlockState> {
        @Override // android.os.Parcelable.Creator
        public final MoviePosterView$MoviePosterBlockState createFromParcel(Parcel parcel) {
            return new MoviePosterView$MoviePosterBlockState((BlockId) parcel.readParcelable(MoviePosterView$MoviePosterBlockState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoviePosterView$MoviePosterBlockState[] newArray(int i) {
            return new MoviePosterView$MoviePosterBlockState[i];
        }
    }

    public MoviePosterView$MoviePosterBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, int i, String str, Float f, String str2, String str3) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = i;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = str3;
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
        if (!(obj instanceof MoviePosterView$MoviePosterBlockState)) {
            return false;
        }
        MoviePosterView$MoviePosterBlockState moviePosterView$MoviePosterBlockState = (MoviePosterView$MoviePosterBlockState) obj;
        return epx.f(this.b, moviePosterView$MoviePosterBlockState.b) && this.c == moviePosterView$MoviePosterBlockState.c && this.d == moviePosterView$MoviePosterBlockState.d && epx.f(this.e, moviePosterView$MoviePosterBlockState.e) && epx.f(this.f, moviePosterView$MoviePosterBlockState.f) && epx.f(this.g, moviePosterView$MoviePosterBlockState.g) && epx.f(this.h, moviePosterView$MoviePosterBlockState.h);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, b.b(this.c, this.b.hashCode() * 31, 31), 31);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.f;
        int a3 = urd0.a((hashCode + (f == null ? 0 : f.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return a3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoviePosterBlockState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", movieId=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", rating=");
        sb.append(this.f);
        sb.append(", name=");
        sb.append(this.g);
        sb.append(", subtitle=");
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
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        Float f = this.f;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}

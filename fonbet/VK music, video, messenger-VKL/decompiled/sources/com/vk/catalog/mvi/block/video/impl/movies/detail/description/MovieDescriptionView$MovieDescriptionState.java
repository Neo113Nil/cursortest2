package com.vk.catalog.mvi.block.video.impl.movies.detail.description;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: MovieDescriptionView.kt */
/* loaded from: classes.dex */
public final class MovieDescriptionView$MovieDescriptionState implements CatalogBlockState {
    public static final Parcelable.Creator<MovieDescriptionView$MovieDescriptionState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final String d;
    public final boolean e;

    /* compiled from: MovieDescriptionView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieDescriptionView$MovieDescriptionState> {
        @Override // android.os.Parcelable.Creator
        public final MovieDescriptionView$MovieDescriptionState createFromParcel(Parcel parcel) {
            return new MovieDescriptionView$MovieDescriptionState((BlockId) parcel.readParcelable(MovieDescriptionView$MovieDescriptionState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MovieDescriptionView$MovieDescriptionState[] newArray(int i) {
            return new MovieDescriptionView$MovieDescriptionState[i];
        }
    }

    public MovieDescriptionView$MovieDescriptionState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, String str, boolean z) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = str;
        this.e = z;
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
        if (!(obj instanceof MovieDescriptionView$MovieDescriptionState)) {
            return false;
        }
        MovieDescriptionView$MovieDescriptionState movieDescriptionView$MovieDescriptionState = (MovieDescriptionView$MovieDescriptionState) obj;
        return epx.f(this.b, movieDescriptionView$MovieDescriptionState.b) && this.c == movieDescriptionView$MovieDescriptionState.c && epx.f(this.d, movieDescriptionView$MovieDescriptionState.d) && this.e == movieDescriptionView$MovieDescriptionState.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieDescriptionState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", isExpanded=");
        return q0.a(sb, this.e, ')');
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
        parcel.writeInt(this.e ? 1 : 0);
    }
}

package com.vk.catalog.mvi.block.video.impl.movies.detail.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.zrp;

/* compiled from: MovieRatingsView.kt */
/* loaded from: classes.dex */
public final class MovieRatingsView$MovieRatingsBlockState implements CatalogBlockState {
    public static final Parcelable.Creator<MovieRatingsView$MovieRatingsBlockState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final List<RatingBlockState> d;

    /* compiled from: MovieRatingsView.kt */
    /* loaded from: classes16.dex */
    public static final class RatingBlockState implements Parcelable {
        public static final Parcelable.Creator<RatingBlockState> CREATOR = new a();
        public final float b;
        public final Provider c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MovieRatingsView.kt */
        public static final class Provider {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Provider[] $VALUES;
            public static final Provider Imdb;
            public static final Provider KinoMail;

            static {
                Provider provider = new Provider("KinoMail", 0);
                KinoMail = provider;
                Provider provider2 = new Provider("Imdb", 1);
                Imdb = provider2;
                Provider[] providerArr = {provider, provider2};
                $VALUES = providerArr;
                $ENTRIES = new asp(providerArr);
            }

            public Provider() {
                throw null;
            }

            public static Provider valueOf(String str) {
                return (Provider) Enum.valueOf(Provider.class, str);
            }

            public static Provider[] values() {
                return (Provider[]) $VALUES.clone();
            }
        }

        /* compiled from: MovieRatingsView.kt */
        public static final class a implements Parcelable.Creator<RatingBlockState> {
            @Override // android.os.Parcelable.Creator
            public final RatingBlockState createFromParcel(Parcel parcel) {
                return new RatingBlockState(parcel.readFloat(), Provider.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final RatingBlockState[] newArray(int i) {
                return new RatingBlockState[i];
            }
        }

        public RatingBlockState(float f, Provider provider) {
            this.b = f;
            this.c = provider;
        }

        public final Provider d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final float e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingBlockState)) {
                return false;
            }
            RatingBlockState ratingBlockState = (RatingBlockState) obj;
            return Float.compare(this.b, ratingBlockState.b) == 0 && this.c == ratingBlockState.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Float.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "RatingBlockState(value=" + this.b + ", provider=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.b);
            parcel.writeString(this.c.name());
        }
    }

    /* compiled from: MovieRatingsView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieRatingsView$MovieRatingsBlockState> {
        @Override // android.os.Parcelable.Creator
        public final MovieRatingsView$MovieRatingsBlockState createFromParcel(Parcel parcel) {
            BlockId blockId = (BlockId) parcel.readParcelable(MovieRatingsView$MovieRatingsBlockState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(RatingBlockState.CREATOR, parcel, arrayList, i, 1);
            }
            return new MovieRatingsView$MovieRatingsBlockState(blockId, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MovieRatingsView$MovieRatingsBlockState[] newArray(int i) {
            return new MovieRatingsView$MovieRatingsBlockState[i];
        }
    }

    public MovieRatingsView$MovieRatingsBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, List<RatingBlockState> list) {
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
        if (!(obj instanceof MovieRatingsView$MovieRatingsBlockState)) {
            return false;
        }
        MovieRatingsView$MovieRatingsBlockState movieRatingsView$MovieRatingsBlockState = (MovieRatingsView$MovieRatingsBlockState) obj;
        return epx.f(this.b, movieRatingsView$MovieRatingsBlockState.b) && this.c == movieRatingsView$MovieRatingsBlockState.c && epx.f(this.d, movieRatingsView$MovieRatingsBlockState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieRatingsBlockState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", ratings=");
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
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            ((RatingBlockState) a2.next()).writeToParcel(parcel, i);
        }
    }
}

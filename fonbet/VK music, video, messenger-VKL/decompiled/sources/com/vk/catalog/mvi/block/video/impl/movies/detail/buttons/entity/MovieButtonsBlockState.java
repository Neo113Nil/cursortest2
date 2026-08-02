package com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFile;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.jq;
import xsna.qoy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MovieButtonsBlockState.kt */
/* loaded from: classes.dex */
public final class MovieButtonsBlockState implements CatalogBlockState {
    public static final Parcelable.Creator<MovieButtonsBlockState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final WatchButtonState d;
    public final boolean e;
    public final VideoFile f;
    public final boolean g;
    public final int h;

    /* compiled from: MovieButtonsBlockState.kt */
    /* loaded from: classes16.dex */
    public interface WatchButtonState extends Parcelable {

        /* compiled from: MovieButtonsBlockState.kt */
        public static final class WatchFromSearch implements WatchButtonState {
            public static final WatchFromSearch b = new WatchFromSearch();
            public static final Parcelable.Creator<WatchFromSearch> CREATOR = new a();

            /* compiled from: MovieButtonsBlockState.kt */
            public static final class a implements Parcelable.Creator<WatchFromSearch> {
                @Override // android.os.Parcelable.Creator
                public final WatchFromSearch createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return WatchFromSearch.b;
                }

                @Override // android.os.Parcelable.Creator
                public final WatchFromSearch[] newArray(int i) {
                    return new WatchFromSearch[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof WatchFromSearch);
            }

            public final int hashCode() {
                return -612838917;
            }

            public final String toString() {
                return "WatchFromSearch";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: MovieButtonsBlockState.kt */
        public static final class WatchMovie implements WatchButtonState {
            public static final WatchMovie b = new WatchMovie();
            public static final Parcelable.Creator<WatchMovie> CREATOR = new a();

            /* compiled from: MovieButtonsBlockState.kt */
            public static final class a implements Parcelable.Creator<WatchMovie> {
                @Override // android.os.Parcelable.Creator
                public final WatchMovie createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return WatchMovie.b;
                }

                @Override // android.os.Parcelable.Creator
                public final WatchMovie[] newArray(int i) {
                    return new WatchMovie[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof WatchMovie);
            }

            public final int hashCode() {
                return -676377209;
            }

            public final String toString() {
                return "WatchMovie";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: MovieButtonsBlockState.kt */
        public static final class WatchSeries implements WatchButtonState {
            public static final WatchSeries b = new WatchSeries();
            public static final Parcelable.Creator<WatchSeries> CREATOR = new a();

            /* compiled from: MovieButtonsBlockState.kt */
            public static final class a implements Parcelable.Creator<WatchSeries> {
                @Override // android.os.Parcelable.Creator
                public final WatchSeries createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return WatchSeries.b;
                }

                @Override // android.os.Parcelable.Creator
                public final WatchSeries[] newArray(int i) {
                    return new WatchSeries[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof WatchSeries);
            }

            public final int hashCode() {
                return 669563648;
            }

            public final String toString() {
                return "WatchSeries";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: MovieButtonsBlockState.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieButtonsBlockState> {
        @Override // android.os.Parcelable.Creator
        public final MovieButtonsBlockState createFromParcel(Parcel parcel) {
            Class cls;
            BlockId blockId;
            CatalogBlockVariant catalogBlockVariant;
            WatchButtonState watchButtonState;
            boolean z;
            BlockId blockId2 = (BlockId) parcel.readParcelable(MovieButtonsBlockState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            WatchButtonState watchButtonState2 = (WatchButtonState) parcel.readParcelable(MovieButtonsBlockState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = MovieButtonsBlockState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                watchButtonState = watchButtonState2;
                z = true;
            } else {
                cls = MovieButtonsBlockState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                watchButtonState = watchButtonState2;
                z = false;
            }
            return new MovieButtonsBlockState(blockId, catalogBlockVariant, watchButtonState, z, (VideoFile) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MovieButtonsBlockState[] newArray(int i) {
            return new MovieButtonsBlockState[i];
        }
    }

    public MovieButtonsBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, WatchButtonState watchButtonState, boolean z, VideoFile videoFile, boolean z2, int i) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = watchButtonState;
        this.e = z;
        this.f = videoFile;
        this.g = z2;
        this.h = i;
    }

    public static MovieButtonsBlockState a(MovieButtonsBlockState movieButtonsBlockState, int i) {
        BlockId blockId = movieButtonsBlockState.b;
        CatalogBlockVariant catalogBlockVariant = movieButtonsBlockState.c;
        WatchButtonState watchButtonState = movieButtonsBlockState.d;
        boolean z = movieButtonsBlockState.e;
        VideoFile videoFile = movieButtonsBlockState.f;
        boolean z2 = movieButtonsBlockState.g;
        movieButtonsBlockState.getClass();
        return new MovieButtonsBlockState(blockId, catalogBlockVariant, watchButtonState, z, videoFile, z2, i);
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
        if (!(obj instanceof MovieButtonsBlockState)) {
            return false;
        }
        MovieButtonsBlockState movieButtonsBlockState = (MovieButtonsBlockState) obj;
        return epx.f(this.b, movieButtonsBlockState.b) && this.c == movieButtonsBlockState.c && epx.f(this.d, movieButtonsBlockState.d) && this.e == movieButtonsBlockState.e && epx.f(this.f, movieButtonsBlockState.f) && this.g == movieButtonsBlockState.g && this.h == movieButtonsBlockState.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + qoy.b(jq.b(this.f, qoy.b((this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31)) * 31, 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieButtonsBlockState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", watchButtonState=");
        sb.append(this.d);
        sb.append(", watchLaterButtonPresent=");
        sb.append(this.e);
        sb.append(", videoFile=");
        sb.append(this.f);
        sb.append(", isLicenced=");
        sb.append(this.g);
        sb.append(", forceUpdate=");
        return vu5.b(sb, this.h, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
    }

    public /* synthetic */ MovieButtonsBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, WatchButtonState watchButtonState, boolean z, VideoFile videoFile, boolean z2, int i, int i2, zcl zclVar) {
        this(blockId, catalogBlockVariant, watchButtonState, z, videoFile, z2, (i2 & 64) != 0 ? 0 : i);
    }
}

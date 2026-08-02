package com.vk.video.playlist.playlistscreen.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
/* loaded from: classes6.dex */
final class PlaylistHorizontalFiltersWithScrollView$State implements CatalogBlockState {
    public static final Parcelable.Creator<PlaylistHorizontalFiltersWithScrollView$State> CREATOR = new a();
    public final String b;
    public final CatalogBlockVariant c;
    public final List<CatalogFilterDo> d;
    public final int e;

    /* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
    public static final class a implements Parcelable.Creator<PlaylistHorizontalFiltersWithScrollView$State> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistHorizontalFiltersWithScrollView$State createFromParcel(Parcel parcel) {
            String str = ((BlockId.Simple) parcel.readParcelable(PlaylistHorizontalFiltersWithScrollView$State.class.getClassLoader())).b;
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(PlaylistHorizontalFiltersWithScrollView$State.class, parcel, arrayList, i, 1);
            }
            return new PlaylistHorizontalFiltersWithScrollView$State(str, valueOf, arrayList, parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistHorizontalFiltersWithScrollView$State[] newArray(int i) {
            return new PlaylistHorizontalFiltersWithScrollView$State[i];
        }
    }

    public PlaylistHorizontalFiltersWithScrollView$State() {
        throw null;
    }

    public PlaylistHorizontalFiltersWithScrollView$State(String str, CatalogBlockVariant catalogBlockVariant, List list, int i, zcl zclVar) {
        this.b = str;
        this.c = catalogBlockVariant;
        this.d = list;
        this.e = i;
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
        if (!(obj instanceof PlaylistHorizontalFiltersWithScrollView$State)) {
            return false;
        }
        PlaylistHorizontalFiltersWithScrollView$State playlistHorizontalFiltersWithScrollView$State = (PlaylistHorizontalFiltersWithScrollView$State) obj;
        return epx.f(this.b, playlistHorizontalFiltersWithScrollView$State.b) && this.c == playlistHorizontalFiltersWithScrollView$State.c && epx.f(this.d, playlistHorizontalFiltersWithScrollView$State.d) && this.e == playlistHorizontalFiltersWithScrollView$State.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + fw3.a(io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
        sb.append(this.c);
        sb.append(", seasonsBlockFilters=");
        sb.append(this.d);
        sb.append(", selectedIndex=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new BlockId.Simple(this.b), i);
        parcel.writeString(this.c.name());
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.e);
    }
}

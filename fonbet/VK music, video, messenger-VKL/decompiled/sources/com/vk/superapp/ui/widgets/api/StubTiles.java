package com.vk.superapp.ui.widgets.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import xsna.epx;

/* compiled from: StubTiles.kt */
/* loaded from: classes6.dex */
public final class StubTiles implements Parcelable {
    public static final Parcelable.Creator<StubTiles> CREATOR = new a();
    public final SuperAppWidgetTile b;
    public final SuperAppWidgetHalfTile c;

    /* compiled from: StubTiles.kt */
    public static final class a implements Parcelable.Creator<StubTiles> {
        @Override // android.os.Parcelable.Creator
        public final StubTiles createFromParcel(Parcel parcel) {
            return new StubTiles((SuperAppWidgetTile) parcel.readParcelable(StubTiles.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppWidgetHalfTile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StubTiles[] newArray(int i) {
            return new StubTiles[i];
        }
    }

    public StubTiles(SuperAppWidgetTile superAppWidgetTile, SuperAppWidgetHalfTile superAppWidgetHalfTile) {
        this.b = superAppWidgetTile;
        this.c = superAppWidgetHalfTile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StubTiles)) {
            return false;
        }
        StubTiles stubTiles = (StubTiles) obj;
        return epx.f(this.b, stubTiles.b) && epx.f(this.c, stubTiles.c);
    }

    public final int hashCode() {
        SuperAppWidgetTile superAppWidgetTile = this.b;
        int hashCode = (superAppWidgetTile == null ? 0 : superAppWidgetTile.hashCode()) * 31;
        SuperAppWidgetHalfTile superAppWidgetHalfTile = this.c;
        return hashCode + (superAppWidgetHalfTile != null ? superAppWidgetHalfTile.hashCode() : 0);
    }

    public final String toString() {
        return "StubTiles(tile=" + this.b + ", halfTile=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        SuperAppWidgetHalfTile superAppWidgetHalfTile = this.c;
        if (superAppWidgetHalfTile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppWidgetHalfTile.writeToParcel(parcel, i);
        }
    }
}

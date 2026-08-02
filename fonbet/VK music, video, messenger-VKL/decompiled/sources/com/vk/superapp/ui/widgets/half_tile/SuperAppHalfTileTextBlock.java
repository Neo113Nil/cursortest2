package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class SuperAppHalfTileTextBlock implements Parcelable {
    public static final Parcelable.Creator<SuperAppHalfTileTextBlock> CREATOR = new a();
    public final String b;
    public final String c;
    public final HalfTileAlign d;
    public final HalfTileTitleSize e;

    /* compiled from: HalfTileContent.kt */
    public static final class a implements Parcelable.Creator<SuperAppHalfTileTextBlock> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppHalfTileTextBlock createFromParcel(Parcel parcel) {
            return new SuperAppHalfTileTextBlock(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HalfTileAlign.valueOf(parcel.readString()), parcel.readInt() != 0 ? HalfTileTitleSize.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppHalfTileTextBlock[] newArray(int i) {
            return new SuperAppHalfTileTextBlock[i];
        }
    }

    public SuperAppHalfTileTextBlock(String str, String str2, HalfTileAlign halfTileAlign, HalfTileTitleSize halfTileTitleSize) {
        this.b = str;
        this.c = str2;
        this.d = halfTileAlign;
        this.e = halfTileTitleSize;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppHalfTileTextBlock)) {
            return false;
        }
        SuperAppHalfTileTextBlock superAppHalfTileTextBlock = (SuperAppHalfTileTextBlock) obj;
        return epx.f(this.b, superAppHalfTileTextBlock.b) && epx.f(this.c, superAppHalfTileTextBlock.c) && this.d == superAppHalfTileTextBlock.d && this.e == superAppHalfTileTextBlock.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HalfTileAlign halfTileAlign = this.d;
        int hashCode3 = (hashCode2 + (halfTileAlign == null ? 0 : halfTileAlign.hashCode())) * 31;
        HalfTileTitleSize halfTileTitleSize = this.e;
        return hashCode3 + (halfTileTitleSize != null ? halfTileTitleSize.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppHalfTileTextBlock(title=" + this.b + ", subtitle=" + this.c + ", align=" + this.d + ", titleSize=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        HalfTileAlign halfTileAlign = this.d;
        if (halfTileAlign == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(halfTileAlign.name());
        }
        HalfTileTitleSize halfTileTitleSize = this.e;
        if (halfTileTitleSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(halfTileTitleSize.name());
        }
    }
}

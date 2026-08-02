package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.zcl;

/* compiled from: TileBackgroundImage.kt */
/* loaded from: classes6.dex */
public final class TileStyle implements Parcelable {
    public static final Parcelable.Creator<TileStyle> CREATOR = new a();
    public final TileType b;
    public final boolean c;

    /* compiled from: TileBackgroundImage.kt */
    public static final class a implements Parcelable.Creator<TileStyle> {
        @Override // android.os.Parcelable.Creator
        public final TileStyle createFromParcel(Parcel parcel) {
            return new TileStyle(TileType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TileStyle[] newArray(int i) {
            return new TileStyle[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileStyle() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileStyle)) {
            return false;
        }
        TileStyle tileStyle = (TileStyle) obj;
        return this.b == tileStyle.b && this.c == tileStyle.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileStyle(type=");
        sb.append(this.b);
        sb.append(", isVerified=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
    }

    public TileStyle(TileType tileType, boolean z) {
        this.b = tileType;
        this.c = z;
    }

    public /* synthetic */ TileStyle(TileType tileType, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? TileType.NONE : tileType, (i & 2) != 0 ? false : z);
    }
}

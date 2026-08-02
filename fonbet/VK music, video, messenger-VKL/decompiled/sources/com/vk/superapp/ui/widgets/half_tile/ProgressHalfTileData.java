package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.shy;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class ProgressHalfTileData implements Parcelable {
    public static final Parcelable.Creator<ProgressHalfTileData> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public final HalfTileProgressType e;

    /* compiled from: HalfTileContent.kt */
    public static final class a implements Parcelable.Creator<ProgressHalfTileData> {
        @Override // android.os.Parcelable.Creator
        public final ProgressHalfTileData createFromParcel(Parcel parcel) {
            return new ProgressHalfTileData(parcel.readString(), parcel.readInt(), parcel.readInt(), HalfTileProgressType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressHalfTileData[] newArray(int i) {
            return new ProgressHalfTileData[i];
        }
    }

    public ProgressHalfTileData(String str, int i, int i2, HalfTileProgressType halfTileProgressType) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = halfTileProgressType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressHalfTileData)) {
            return false;
        }
        ProgressHalfTileData progressHalfTileData = (ProgressHalfTileData) obj;
        return epx.f(this.b, progressHalfTileData.b) && this.c == progressHalfTileData.c && this.d == progressHalfTileData.d && this.e == progressHalfTileData.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProgressHalfTileData(text=" + this.b + ", current=" + this.c + ", total=" + this.d + ", type=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e.name());
    }
}

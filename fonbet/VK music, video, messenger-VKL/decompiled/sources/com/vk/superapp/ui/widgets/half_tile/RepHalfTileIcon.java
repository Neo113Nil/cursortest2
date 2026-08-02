package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class RepHalfTileIcon extends HalfTileIcon {
    public static final Parcelable.Creator<RepHalfTileIcon> CREATOR = new a();
    public final String b;
    public final HalfTileAlign c;

    /* compiled from: HalfTileContent.kt */
    public static final class a implements Parcelable.Creator<RepHalfTileIcon> {
        @Override // android.os.Parcelable.Creator
        public final RepHalfTileIcon createFromParcel(Parcel parcel) {
            return new RepHalfTileIcon(parcel.readString(), parcel.readInt() == 0 ? null : HalfTileAlign.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RepHalfTileIcon[] newArray(int i) {
            return new RepHalfTileIcon[i];
        }
    }

    public RepHalfTileIcon(String str, HalfTileAlign halfTileAlign) {
        super(null);
        this.b = str;
        this.c = halfTileAlign;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepHalfTileIcon)) {
            return false;
        }
        RepHalfTileIcon repHalfTileIcon = (RepHalfTileIcon) obj;
        return epx.f(this.b, repHalfTileIcon.b) && this.c == repHalfTileIcon.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        HalfTileAlign halfTileAlign = this.c;
        return hashCode + (halfTileAlign == null ? 0 : halfTileAlign.hashCode());
    }

    public final String toString() {
        return "RepHalfTileIcon(iconId=" + this.b + ", align=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        HalfTileAlign halfTileAlign = this.c;
        if (halfTileAlign == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(halfTileAlign.name());
        }
    }
}

package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: TileBackground.kt */
/* loaded from: classes6.dex */
public final class OverlapIcons implements Parcelable {
    public static final Parcelable.Creator<OverlapIcons> CREATOR = new a();
    public final TileBackgroundImage b;
    public final TileBackgroundImage c;
    public final Boolean d;

    /* compiled from: TileBackground.kt */
    public static final class a implements Parcelable.Creator<OverlapIcons> {
        @Override // android.os.Parcelable.Creator
        public final OverlapIcons createFromParcel(Parcel parcel) {
            Boolean bool = null;
            TileBackgroundImage createFromParcel = parcel.readInt() == 0 ? null : TileBackgroundImage.CREATOR.createFromParcel(parcel);
            TileBackgroundImage createFromParcel2 = parcel.readInt() == 0 ? null : TileBackgroundImage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OverlapIcons(createFromParcel, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OverlapIcons[] newArray(int i) {
            return new OverlapIcons[i];
        }
    }

    public OverlapIcons() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlapIcons)) {
            return false;
        }
        OverlapIcons overlapIcons = (OverlapIcons) obj;
        return epx.f(this.b, overlapIcons.b) && epx.f(this.c, overlapIcons.c) && epx.f(this.d, overlapIcons.d);
    }

    public final int hashCode() {
        TileBackgroundImage tileBackgroundImage = this.b;
        int hashCode = (tileBackgroundImage == null ? 0 : tileBackgroundImage.hashCode()) * 31;
        TileBackgroundImage tileBackgroundImage2 = this.c;
        int hashCode2 = (hashCode + (tileBackgroundImage2 == null ? 0 : tileBackgroundImage2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlapIcons(left=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", isRightAbove=");
        return tn.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TileBackgroundImage tileBackgroundImage = this.b;
        if (tileBackgroundImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileBackgroundImage.writeToParcel(parcel, i);
        }
        TileBackgroundImage tileBackgroundImage2 = this.c;
        if (tileBackgroundImage2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileBackgroundImage2.writeToParcel(parcel, i);
        }
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public OverlapIcons(TileBackgroundImage tileBackgroundImage, TileBackgroundImage tileBackgroundImage2, Boolean bool) {
        this.b = tileBackgroundImage;
        this.c = tileBackgroundImage2;
        this.d = bool;
    }

    public /* synthetic */ OverlapIcons(TileBackgroundImage tileBackgroundImage, TileBackgroundImage tileBackgroundImage2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : tileBackgroundImage, (i & 2) != 0 ? null : tileBackgroundImage2, (i & 4) != 0 ? null : bool);
    }
}

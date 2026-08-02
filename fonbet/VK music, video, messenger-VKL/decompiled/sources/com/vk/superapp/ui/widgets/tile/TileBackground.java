package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.zcl;

/* compiled from: TileBackground.kt */
/* loaded from: classes6.dex */
public final class TileBackground implements Parcelable {
    public static final Parcelable.Creator<TileBackground> CREATOR = new a();
    public final List<TileBackgroundImage> b;
    public final TileBackgroundImage c;
    public final TileBackgroundImage d;
    public final OverlapIcons e;

    /* compiled from: TileBackground.kt */
    public static final class a implements Parcelable.Creator<TileBackground> {
        @Override // android.os.Parcelable.Creator
        public final TileBackground createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(TileBackgroundImage.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new TileBackground(arrayList, parcel.readInt() == 0 ? null : TileBackgroundImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TileBackgroundImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlapIcons.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TileBackground[] newArray(int i) {
            return new TileBackground[i];
        }
    }

    public TileBackground() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileBackground)) {
            return false;
        }
        TileBackground tileBackground = (TileBackground) obj;
        return epx.f(this.b, tileBackground.b) && epx.f(this.c, tileBackground.c) && epx.f(this.d, tileBackground.d) && epx.f(this.e, tileBackground.e);
    }

    public final int hashCode() {
        List<TileBackgroundImage> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        TileBackgroundImage tileBackgroundImage = this.c;
        int hashCode2 = (hashCode + (tileBackgroundImage == null ? 0 : tileBackgroundImage.hashCode())) * 31;
        TileBackgroundImage tileBackgroundImage2 = this.d;
        int hashCode3 = (hashCode2 + (tileBackgroundImage2 == null ? 0 : tileBackgroundImage2.hashCode())) * 31;
        OverlapIcons overlapIcons = this.e;
        return hashCode3 + (overlapIcons != null ? overlapIcons.hashCode() : 0);
    }

    public final String toString() {
        return "TileBackground(gridImages=" + this.b + ", bigIcon=" + this.c + ", backgroundImage=" + this.d + ", overlapIcons=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TileBackgroundImage> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((TileBackgroundImage) f.next()).writeToParcel(parcel, i);
            }
        }
        TileBackgroundImage tileBackgroundImage = this.c;
        if (tileBackgroundImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileBackgroundImage.writeToParcel(parcel, i);
        }
        TileBackgroundImage tileBackgroundImage2 = this.d;
        if (tileBackgroundImage2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileBackgroundImage2.writeToParcel(parcel, i);
        }
        OverlapIcons overlapIcons = this.e;
        if (overlapIcons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlapIcons.writeToParcel(parcel, i);
        }
    }

    public TileBackground(List<TileBackgroundImage> list, TileBackgroundImage tileBackgroundImage, TileBackgroundImage tileBackgroundImage2, OverlapIcons overlapIcons) {
        this.b = list;
        this.c = tileBackgroundImage;
        this.d = tileBackgroundImage2;
        this.e = overlapIcons;
    }

    public /* synthetic */ TileBackground(List list, TileBackgroundImage tileBackgroundImage, TileBackgroundImage tileBackgroundImage2, OverlapIcons overlapIcons, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : tileBackgroundImage, (i & 4) != 0 ? null : tileBackgroundImage2, (i & 8) != 0 ? null : overlapIcons);
    }
}

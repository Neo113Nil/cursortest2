package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.zcl;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class RawHalfTileIcon extends HalfTileIcon {
    public static final Parcelable.Creator<RawHalfTileIcon> CREATOR = new a();
    public final List<ImageWithAction> b;
    public final HalfTileIconSize c;

    /* compiled from: HalfTileContent.kt */
    public static final class a implements Parcelable.Creator<RawHalfTileIcon> {
        @Override // android.os.Parcelable.Creator
        public final RawHalfTileIcon createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ImageWithAction.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new RawHalfTileIcon(arrayList, parcel.readInt() != 0 ? HalfTileIconSize.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RawHalfTileIcon[] newArray(int i) {
            return new RawHalfTileIcon[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawHalfTileIcon() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawHalfTileIcon)) {
            return false;
        }
        RawHalfTileIcon rawHalfTileIcon = (RawHalfTileIcon) obj;
        return epx.f(this.b, rawHalfTileIcon.b) && this.c == rawHalfTileIcon.c;
    }

    public final int hashCode() {
        List<ImageWithAction> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        HalfTileIconSize halfTileIconSize = this.c;
        return hashCode + (halfTileIconSize != null ? halfTileIconSize.hashCode() : 0);
    }

    public final String toString() {
        return "RawHalfTileIcon(background=" + this.b + ", size=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ImageWithAction> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ImageWithAction) f.next()).writeToParcel(parcel, i);
            }
        }
        HalfTileIconSize halfTileIconSize = this.c;
        if (halfTileIconSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(halfTileIconSize.name());
        }
    }

    public /* synthetic */ RawHalfTileIcon(List list, HalfTileIconSize halfTileIconSize, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : halfTileIconSize);
    }

    public RawHalfTileIcon(List<ImageWithAction> list, HalfTileIconSize halfTileIconSize) {
        super(null);
        this.b = list;
        this.c = halfTileIconSize;
    }
}

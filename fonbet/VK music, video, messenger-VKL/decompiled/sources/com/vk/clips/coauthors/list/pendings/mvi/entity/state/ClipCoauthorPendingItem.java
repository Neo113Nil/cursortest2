package com.vk.clips.coauthors.list.pendings.mvi.entity.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.newsfeed.Owner;
import defpackage.q0;
import xsna.epx;

/* compiled from: ClipCoauthorPendingItem.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorPendingItem implements Parcelable {
    public static final Parcelable.Creator<ClipCoauthorPendingItem> CREATOR = new a();
    public final Owner b;
    public final boolean c;

    /* compiled from: ClipCoauthorPendingItem.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorPendingItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorPendingItem createFromParcel(Parcel parcel) {
            return new ClipCoauthorPendingItem((Owner) parcel.readParcelable(ClipCoauthorPendingItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorPendingItem[] newArray(int i) {
            return new ClipCoauthorPendingItem[i];
        }
    }

    public ClipCoauthorPendingItem(Owner owner, boolean z) {
        this.b = owner;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorPendingItem)) {
            return false;
        }
        ClipCoauthorPendingItem clipCoauthorPendingItem = (ClipCoauthorPendingItem) obj;
        return epx.f(this.b, clipCoauthorPendingItem.b) && this.c == clipCoauthorPendingItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCoauthorPendingItem(owner=");
        sb.append(this.b);
        sb.append(", selected=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}

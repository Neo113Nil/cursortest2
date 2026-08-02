package com.vk.dto.gift;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;

/* compiled from: CatalogedGift.kt */
/* loaded from: classes18.dex */
public final class CatalogedGift implements Parcelable {
    public static final Parcelable.Creator<CatalogedGift> CREATOR = new a();
    public final Gift b;
    public final boolean c;

    /* compiled from: CatalogedGift.kt */
    public static final class a implements Parcelable.Creator<CatalogedGift> {
        @Override // android.os.Parcelable.Creator
        public final CatalogedGift createFromParcel(Parcel parcel) {
            return new CatalogedGift((Gift) parcel.readParcelable(CatalogedGift.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogedGift[] newArray(int i) {
            return new CatalogedGift[i];
        }
    }

    public CatalogedGift(Gift gift, boolean z) {
        this.b = gift;
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
        if (!(obj instanceof CatalogedGift)) {
            return false;
        }
        CatalogedGift catalogedGift = (CatalogedGift) obj;
        return epx.f(this.b, catalogedGift.b) && this.c == catalogedGift.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogedGift(gift=");
        sb.append(this.b);
        sb.append(", isFree=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}

package com.vk.catalog.mvi.section.ui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.dsy;
import xsna.epx;
import xsna.vby;

/* compiled from: ParcelableLazyGridState.kt */
@vby
/* loaded from: classes16.dex */
public final class ParcelableLazyGridState implements ParcelableLazyState, Parcelable {
    public static final a CREATOR = new a();
    public final dsy b;

    /* compiled from: ParcelableLazyGridState.kt */
    public static final class a implements Parcelable.Creator<ParcelableLazyGridState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableLazyGridState createFromParcel(Parcel parcel) {
            return new ParcelableLazyGridState(new dsy(parcel.readInt(), parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableLazyGridState[] newArray(int i) {
            return new ParcelableLazyGridState[i];
        }
    }

    public /* synthetic */ ParcelableLazyGridState(dsy dsyVar) {
        this.b = dsyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParcelableLazyGridState) {
            return epx.f(this.b, ((ParcelableLazyGridState) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ParcelableLazyGridState(value=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dsy dsyVar = this.b;
        parcel.writeInt(dsyVar.g());
        parcel.writeInt(dsyVar.h());
    }
}

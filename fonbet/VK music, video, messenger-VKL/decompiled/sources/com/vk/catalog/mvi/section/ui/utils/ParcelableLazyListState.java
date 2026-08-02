package com.vk.catalog.mvi.section.ui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vby;
import xsna.xvy;

/* compiled from: ParcelableLazyListState.kt */
@vby
/* loaded from: classes16.dex */
public final class ParcelableLazyListState implements ParcelableLazyState, Parcelable {
    public static final a CREATOR = new a();
    public final xvy b;

    /* compiled from: ParcelableLazyListState.kt */
    public static final class a implements Parcelable.Creator<ParcelableLazyListState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableLazyListState createFromParcel(Parcel parcel) {
            return new ParcelableLazyListState(new xvy(parcel.readInt(), parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableLazyListState[] newArray(int i) {
            return new ParcelableLazyListState[i];
        }
    }

    public /* synthetic */ ParcelableLazyListState(xvy xvyVar) {
        this.b = xvyVar;
    }

    public static final /* synthetic */ ParcelableLazyListState a(xvy xvyVar) {
        return new ParcelableLazyListState(xvyVar);
    }

    public static xvy d() {
        return new xvy(0, 0);
    }

    public static final boolean e(xvy xvyVar, xvy xvyVar2) {
        return epx.f(xvyVar, xvyVar2);
    }

    public static int f(xvy xvyVar) {
        return xvyVar.hashCode();
    }

    public static String g(xvy xvyVar) {
        return "ParcelableLazyListState(value=" + xvyVar + ')';
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParcelableLazyListState) {
            return epx.f(this.b, ((ParcelableLazyListState) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        xvy xvyVar = this.b;
        parcel.writeInt(xvyVar.h());
        parcel.writeInt(xvyVar.i());
    }
}

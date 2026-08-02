package com.vk.geo.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.an10;
import xsna.vby;

/* compiled from: ZoomLevel.kt */
@vby
/* loaded from: classes2.dex */
public final class ZoomLevel implements Comparable<ZoomLevel>, Parcelable {
    public static final Parcelable.Creator<ZoomLevel> CREATOR = new a();
    public final float b;

    /* compiled from: ZoomLevel.kt */
    public static final class a implements Parcelable.Creator<ZoomLevel> {
        @Override // android.os.Parcelable.Creator
        public final ZoomLevel createFromParcel(Parcel parcel) {
            return new ZoomLevel(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ZoomLevel[] newArray(int i) {
            return new ZoomLevel[i];
        }
    }

    public /* synthetic */ ZoomLevel(float f) {
        this.b = f;
    }

    public static String a(float f) {
        return "ZoomLevel(" + an10.b(f) + '/' + f + ')';
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoomLevel zoomLevel) {
        return Float.compare(this.b, zoomLevel.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ZoomLevel) {
            return Float.compare(this.b, ((ZoomLevel) obj).b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
    }
}

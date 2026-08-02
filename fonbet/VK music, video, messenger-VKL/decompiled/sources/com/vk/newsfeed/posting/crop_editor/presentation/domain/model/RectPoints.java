package com.vk.newsfeed.posting.crop_editor.presentation.domain.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.zcl;

/* compiled from: RectPoints.kt */
/* loaded from: classes4.dex */
public final class RectPoints implements Parcelable {
    public static final Parcelable.Creator<RectPoints> CREATOR = new a();
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;

    /* compiled from: RectPoints.kt */
    public static final class a implements Parcelable.Creator<RectPoints> {
        @Override // android.os.Parcelable.Creator
        public final RectPoints createFromParcel(Parcel parcel) {
            return new RectPoints((PointF) parcel.readParcelable(RectPoints.class.getClassLoader()), (PointF) parcel.readParcelable(RectPoints.class.getClassLoader()), (PointF) parcel.readParcelable(RectPoints.class.getClassLoader()), (PointF) parcel.readParcelable(RectPoints.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RectPoints[] newArray(int i) {
            return new RectPoints[i];
        }
    }

    public RectPoints() {
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
        if (!(obj instanceof RectPoints)) {
            return false;
        }
        RectPoints rectPoints = (RectPoints) obj;
        return epx.f(this.b, rectPoints.b) && epx.f(this.c, rectPoints.c) && epx.f(this.d, rectPoints.d) && epx.f(this.e, rectPoints.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RectPoints(leftTop=" + this.b + ", rightTop=" + this.c + ", rightBottom=" + this.d + ", leftBottom=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }

    public RectPoints(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.b = pointF;
        this.c = pointF2;
        this.d = pointF3;
        this.e = pointF4;
    }

    public /* synthetic */ RectPoints(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i, zcl zclVar) {
        this((i & 1) != 0 ? new PointF() : pointF, (i & 2) != 0 ? new PointF() : pointF2, (i & 4) != 0 ? new PointF() : pointF3, (i & 8) != 0 ? new PointF() : pointF4);
    }
}

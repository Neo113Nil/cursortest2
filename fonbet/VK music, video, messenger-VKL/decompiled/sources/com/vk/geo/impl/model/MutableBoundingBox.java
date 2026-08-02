package com.vk.geo.impl.model;

import android.os.Parcelable;
import xsna.gqr;
import xsna.zcl;

/* compiled from: MutableBoundingBox.kt */
/* loaded from: classes2.dex */
public final class MutableBoundingBox extends BoundingBox {
    public long g;
    public long h;

    public MutableBoundingBox(long j, long j2, zcl zclVar) {
        super(j, j2, (zcl) null);
        this.g = j;
        this.h = j2;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final String B() {
        return " \"p\":\"" + Integer.toHexString(System.identityHashCode(this)) + "\" ";
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final long C() {
        return p();
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final long M() {
        return this.g;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final long T() {
        return this.h;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableBoundingBox@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{ne=");
        long K = K();
        sb.append(Coordinate.e(K));
        sb.append(' ');
        sb.append(Coordinate.a(K));
        sb.append(',');
        sb.append(Coordinate.f(K));
        sb.append(' ');
        sb.append(Coordinate.b(K));
        sb.append(",sw=");
        long W = W();
        sb.append(Coordinate.e(W));
        sb.append(' ');
        sb.append(Coordinate.a(W));
        sb.append(',');
        sb.append(Coordinate.f(W));
        sb.append(' ');
        sb.append(Coordinate.b(W));
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MutableBoundingBox(float f, float f2, float f3, float f4, zcl zclVar) {
        this(gqr.a(f4, f), gqr.a(f2, f3), null);
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
    }

    public MutableBoundingBox(BoundingBox boundingBox) {
        this(boundingBox.M(), boundingBox.T(), null);
    }
}

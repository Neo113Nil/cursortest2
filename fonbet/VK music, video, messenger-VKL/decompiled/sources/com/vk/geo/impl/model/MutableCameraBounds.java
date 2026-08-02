package com.vk.geo.impl.model;

import android.os.Parcelable;
import xsna.gqr;
import xsna.q7o;
import xsna.vu5;
import xsna.y98;
import xsna.zcl;

/* compiled from: MutableCameraBounds.kt */
/* loaded from: classes2.dex */
public final class MutableCameraBounds extends CameraBounds {
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public MutableBoundingBox t;

    public MutableCameraBounds(float f, float f2, float f3, float f4, float f5, long j, float f6, int i, zcl zclVar) {
        super(f, f2, f3, f4, f5, j, f6, i, null);
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        Coordinate coordinate = new Coordinate(j);
        coordinate = Coordinate.g(coordinate.j()) ? coordinate : null;
        this.r = coordinate != null ? coordinate.j() : p();
        this.s = -1L;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final String B() {
        StringBuilder sb = new StringBuilder(" \"p\":\"");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("\",\"updatedAt\":");
        return vu5.a(' ', this.s, sb);
    }

    @Override // com.vk.geo.impl.model.CameraBounds, com.vk.geo.impl.model.BoundingBox
    public final long C() {
        return this.r;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final float D() {
        return this.n;
    }

    @Override // com.vk.geo.impl.model.CameraBounds
    public final BoundingBox D0() {
        MutableBoundingBox mutableBoundingBox = this.t;
        if (mutableBoundingBox != null && Degrees.a(mutableBoundingBox.Z(), this.l) && Degrees.a(mutableBoundingBox.R(), this.m) && Degrees.a(mutableBoundingBox.D(), this.n) && Degrees.a(mutableBoundingBox.G(), this.o)) {
            return mutableBoundingBox;
        }
        if (Degrees.a(this.q, Float.NaN)) {
            return this;
        }
        q7o.k(this.t);
        MutableBoundingBox a = y98.e.a();
        float f = this.l;
        float f2 = this.q;
        float f3 = this.n;
        float f4 = this.o;
        if (a != null) {
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            a.g = gqr.a(f4, f);
            a.h = gqr.a(f2, f3);
        } else {
            a = new MutableBoundingBox(f, f2, f3, f4, null);
        }
        this.t = a;
        return a;
    }

    @Override // com.vk.geo.impl.model.CameraBounds
    public final float F0() {
        return this.p;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final float G() {
        return this.o;
    }

    public final void H0(long j, float f, float f2, float f3, float f4, float f5, float f6) {
        this.l = f;
        this.o = f2;
        this.n = f3;
        this.m = f4;
        Coordinate coordinate = new Coordinate(j);
        if (!Coordinate.g(coordinate.j())) {
            coordinate = null;
        }
        this.r = coordinate != null ? coordinate.j() : p();
        this.p = f5;
        this.q = f6;
        this.s = System.currentTimeMillis();
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final long M() {
        float f = this.o;
        float f2 = this.l;
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        return gqr.a(f, f2);
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final float R() {
        return this.m;
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final long T() {
        float f = this.m;
        float f2 = this.n;
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        return gqr.a(f, f2);
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final float Z() {
        return this.l;
    }

    @Override // com.vk.geo.impl.model.CameraBounds, com.vk.geo.impl.model.BoundingBox
    public final String toString() {
        return "CameraBounds@" + Integer.toHexString(System.identityHashCode(this)) + "{W=" + ((Object) String.valueOf(this.l)) + ";N=" + ((Object) String.valueOf(this.o)) + ";E=" + ((Object) String.valueOf(this.n)) + ";S=" + ((Object) String.valueOf(this.m)) + ";center=" + ((Object) Coordinate.i(this.r)) + ",z=" + ((Object) ZoomLevel.a(this.p)) + '}';
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public final boolean v0() {
        return true;
    }

    @Override // com.vk.geo.impl.model.CameraBounds
    public final float y0() {
        return this.q;
    }
}

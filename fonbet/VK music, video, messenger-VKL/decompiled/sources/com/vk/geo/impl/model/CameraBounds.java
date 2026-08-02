package com.vk.geo.impl.model;

import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Degrees;
import kotlin.LazyThreadSafetyMode;
import xsna.bh10;
import xsna.gqr;
import xsna.gzs;
import xsna.msy;
import xsna.zcl;

/* compiled from: CameraBounds.kt */
/* loaded from: classes2.dex */
public class CameraBounds extends BoundingBox {
    public static final /* synthetic */ int k = 0;
    public final float g;
    public final float h;
    public final long i;
    public final Object j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CameraBounds(float f, float f2, float f3, float f4, float f5, long j, float f6, int i, int i2, zcl zclVar) {
        this(f, f2, f3, f4, f5, r9, (i2 & 64) != 0 ? Float.NaN : f6, (i2 & 128) != 0 ? -1 : i, null);
        long j2;
        if ((i2 & 32) != 0) {
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            j2 = Coordinate.b;
        } else {
            j2 = j;
        }
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public long C() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public BoundingBox D0() {
        return (BoundingBox) this.j.getValue();
    }

    public float F0() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraBounds)) {
            return false;
        }
        CameraBounds cameraBounds = (CameraBounds) obj;
        if (!Degrees.a(Z(), cameraBounds.Z()) || !Degrees.a(R(), cameraBounds.R()) || !Degrees.a(D(), cameraBounds.D()) || !Degrees.a(G(), cameraBounds.G()) || Float.compare(F0(), cameraBounds.F0()) != 0) {
            return false;
        }
        long C = C();
        long C2 = cameraBounds.C();
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        if (gqr.b(C, C2)) {
            return Degrees.a(y0(), cameraBounds.y0());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (Float.hashCode(F0()) + ((Float.hashCode(G()) + ((Float.hashCode(D()) + ((Float.hashCode(R()) + ((Float.hashCode(Z()) + (CameraBounds.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        long C = C();
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        return Float.hashCode(y0()) + bh10.a(hashCode, 31, C);
    }

    @Override // com.vk.geo.impl.model.BoundingBox
    public String toString() {
        return "CameraBounds{W=" + ((Object) String.valueOf(Z())) + ";N=" + ((Object) String.valueOf(G())) + ";E=" + ((Object) String.valueOf(D())) + ";S=" + ((Object) String.valueOf(R())) + ";center=" + ((Object) Coordinate.i(C())) + ",z=" + ((Object) ZoomLevel.a(F0())) + '}';
    }

    public float y0() {
        return this.h;
    }

    public CameraBounds(final float f, float f2, final float f3, final float f4, float f5, long j, float f6, int i, zcl zclVar) {
        super(f, f2, f3, f4, null);
        this.g = f5;
        this.h = f6;
        Coordinate coordinate = new Coordinate(j);
        coordinate = Coordinate.g(coordinate.j()) ? coordinate : null;
        this.i = coordinate != null ? coordinate.j() : p();
        this.j = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs() { // from class: xsna.rf9
            @Override // xsna.gzs
            public final Object invoke() {
                int i2 = CameraBounds.k;
                CameraBounds cameraBounds = CameraBounds.this;
                if (Degrees.a(cameraBounds.y0(), Float.NaN)) {
                    return cameraBounds;
                }
                return new BoundingBox(f, cameraBounds.y0(), f3, f4, null);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CameraBounds(BoundingBox boundingBox, float f, long j, int i, zcl zclVar) {
        this(boundingBox, f, j, null);
        if ((i & 4) != 0) {
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            j = Coordinate.b;
        }
    }

    public CameraBounds(BoundingBox boundingBox, float f, long j, zcl zclVar) {
        this(boundingBox.Z(), boundingBox.R(), boundingBox.D(), boundingBox.G(), f, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, PsExtractor.AUDIO_STREAM, null);
    }
}

package com.vk.geo.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import java.util.Collection;
import java.util.Iterator;
import xsna.an10;
import xsna.du9;
import xsna.elb0;
import xsna.gqr;
import xsna.i35;
import xsna.j5g;
import xsna.l370;
import xsna.lif0;
import xsna.ro;
import xsna.sdi;
import xsna.snt;
import xsna.swe0;
import xsna.uq;
import xsna.vy9;
import xsna.xqm0;
import xsna.zcl;
import xsna.znk0;

/* compiled from: BoundingBox.kt */
/* loaded from: classes2.dex */
public class BoundingBox implements lif0, Parcelable, vy9 {
    public static final Parcelable.Creator<BoundingBox> CREATOR = new b();
    public static final BoundingBox e;
    public static final BoundingBox f;
    public final long b;
    public final long c;
    public final long d;

    /* compiled from: BoundingBox.kt */
    public static final class a {
        public static BoundingBox a(Collection collection) {
            if (collection.isEmpty()) {
                return null;
            }
            Collection collection2 = collection;
            float e = Coordinate.e(((Coordinate) j5g.X(collection2)).j());
            float f = Coordinate.f(((Coordinate) j5g.X(collection2)).j());
            Iterator it = collection2.iterator();
            float f2 = e;
            float f3 = f2;
            float f4 = f;
            float f5 = f4;
            while (it.hasNext()) {
                long j = ((Coordinate) it.next()).j();
                float e2 = Coordinate.e(j);
                if (Float.compare(e2, f2) < 0) {
                    f2 = e2;
                }
                if (Float.compare(e2, f3) > 0) {
                    f3 = e2;
                }
                float f6 = Coordinate.f(j);
                if (Float.compare(f6, f4) < 0) {
                    f4 = f6;
                }
                if (Float.compare(f6, f5) > 0) {
                    f5 = f6;
                }
            }
            return new BoundingBox(f4, f2, f5, f3, null);
        }
    }

    /* compiled from: BoundingBox.kt */
    public static final class b implements Parcelable.Creator<BoundingBox> {
        @Override // android.os.Parcelable.Creator
        public final BoundingBox createFromParcel(Parcel parcel) {
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            return new BoundingBox(creator.createFromParcel(parcel).j(), creator.createFromParcel(parcel).j(), (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final BoundingBox[] newArray(int i) {
            return new BoundingBox[i];
        }
    }

    static {
        long j = Coordinate.b;
        e = new BoundingBox(j, j, (zcl) null);
        f = new BoundingBox(29.983513d, 59.70489d, 30.664416d, 60.14099d);
    }

    public BoundingBox(long j, long j2, zcl zclVar) {
        this.b = j;
        this.c = j2;
        if (Coordinate.g(M()) && Coordinate.g(T())) {
            long j3 = j();
            long e2 = e();
            if (Float.intBitsToFloat((int) (j3 >> 32)) > Float.intBitsToFloat((int) (e2 >> 32))) {
                L.G("bbox cartesian fail for x");
            }
            if (Float.intBitsToFloat((int) (j3 & 4294967295L)) < Float.intBitsToFloat((int) (e2 & 4294967295L))) {
                L.G("bbox cartesian fail for y");
            }
        }
        this.d = p();
    }

    public String B() {
        return "";
    }

    public long C() {
        return this.d;
    }

    public float D() {
        return Coordinate.f(T());
    }

    public final float F() {
        return (float) ((l370.q(M(), W()) + l370.q(K(), T())) / 2.0d);
    }

    public float G() {
        return Coordinate.e(M());
    }

    public final long K() {
        return gqr.a(Coordinate.e(M()), Coordinate.f(T()));
    }

    public long M() {
        return this.b;
    }

    public float R() {
        return Coordinate.e(T());
    }

    public long T() {
        return this.c;
    }

    public final long W() {
        return gqr.a(Coordinate.e(T()), Coordinate.f(M()));
    }

    public float Z() {
        return Coordinate.f(M());
    }

    public final float a0() {
        return (float) ((l370.q(T(), W()) + l370.q(K(), M())) / 2.0d);
    }

    @Override // xsna.snt
    public final boolean b(lif0 lif0Var) {
        char c;
        float f2;
        long a2;
        long a3;
        long j = j();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long e2 = e();
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        boolean z = lif0Var instanceof vy9;
        if (z) {
            a2 = ((vy9) lif0Var).j();
            c = ' ';
            f2 = intBitsToFloat;
        } else {
            float f3 = lif0Var.f();
            c = ' ';
            f2 = intBitsToFloat;
            float sin = (float) Math.sin(sdi.x(lif0Var.k()));
            a2 = gqr.a(((f3 / 360.0f) + 0.5f) * 1080.0f, uq.a((float) Math.log((sin + 1.0f) / (1.0f - sin)), 0.5f, -6.2831855f, 0.5f) * 1080.0f);
        }
        float intBitsToFloat5 = Float.intBitsToFloat((int) (a2 >> c));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (a2 & 4294967295L));
        if (z) {
            a3 = ((vy9) lif0Var).e();
        } else {
            float g = lif0Var.g();
            float sin2 = (float) Math.sin(sdi.x(lif0Var.l()));
            a3 = gqr.a(((g / 360.0f) + 0.5f) * 1080.0f, uq.a((float) Math.log((sin2 + 1.0f) / (1.0f - sin2)), 0.5f, -6.2831855f, 0.5f) * 1080.0f);
        }
        return f2 <= Float.intBitsToFloat((int) (a3 >> c)) && intBitsToFloat5 <= intBitsToFloat3 && Float.intBitsToFloat((int) (4294967295L & a3)) <= intBitsToFloat2 && intBitsToFloat4 <= intBitsToFloat6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.vy9
    public final long e() {
        float g = g();
        float sin = (float) Math.sin(sdi.x(l()));
        return gqr.a(((g / 360.0f) + 0.5f) * 1080.0f, uq.a((float) Math.log((sin + 1.0f) / (1.0f - sin)), 0.5f, -6.2831855f, 0.5f) * 1080.0f);
    }

    @Override // xsna.lif0
    public final float f() {
        return Coordinate.f(W());
    }

    @Override // xsna.lif0
    public final float g() {
        return Coordinate.f(K());
    }

    @Keep
    public final String geoJsonString(boolean z) {
        StringBuilder sb = new StringBuilder("\n        {\n          \"type\": \"Feature\",\n          \"properties\": {");
        String str = "";
        String str2 = this == f ? "\"title\"=\"Saint-Petersburg\"" : "";
        String B = B();
        if (str2.length() != 0 || B.length() != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (str2.length() > 0) {
                sb2.append(str2);
                if (B.length() > 0) {
                    sb2.append(',');
                }
            }
            if (B.length() > 0) {
                sb2.append(B);
            }
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("},\n          \"geometry\": {\n            \"coordinates\": [\n              [\n                [\n                  ");
        sb.append(Z());
        sb.append(",\n                  ");
        sb.append(R());
        sb.append("\n                ],\n                [\n                  ");
        sb.append(D());
        sb.append(",\n                  ");
        sb.append(R());
        sb.append("\n                ],\n                [\n                  ");
        sb.append(D());
        sb.append(",\n                  ");
        sb.append(G());
        sb.append("\n                ],\n                [\n                  ");
        sb.append(Z());
        sb.append(",\n                  ");
        sb.append(G());
        sb.append("\n                ],\n                [\n                  ");
        sb.append(Z());
        sb.append(",\n                  ");
        sb.append(R());
        sb.append("\n                ]\n              ]\n            ],\n            \"type\": \"Polygon\"\n          }\n        }\n    ");
        String g = xqm0.g(sb.toString());
        if (!z) {
            return g;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < g.length(); i++) {
            char charAt = g.charAt(i);
            if (!ro.j(charAt)) {
                sb3.append(charAt);
            }
        }
        return sb3.toString();
    }

    @Override // xsna.lif0
    public final BoundingBox i(lif0 lif0Var) {
        return new BoundingBox(Math.min(f(), lif0Var.f()), Math.min(k(), lif0Var.k()), Math.max(g(), lif0Var.g()), Math.max(l(), lif0Var.l()), null);
    }

    @Override // xsna.vy9
    public final long j() {
        float f2 = f();
        float sin = (float) Math.sin(sdi.x(k()));
        return gqr.a(((f2 / 360.0f) + 0.5f) * 1080.0f, uq.a((float) Math.log((sin + 1.0f) / (1.0f - sin)), 0.5f, -6.2831855f, 0.5f) * 1080.0f);
    }

    @Override // xsna.lif0
    public final float k() {
        return Coordinate.e(W());
    }

    @Override // xsna.lif0
    public final float l() {
        return Coordinate.e(K());
    }

    public final float l0(lif0 lif0Var) {
        float max;
        float max2;
        float min;
        float min2;
        if (!b(lif0Var)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (lif0Var instanceof vy9) {
            vy9 vy9Var = (vy9) lif0Var;
            max = Math.max(Float.intBitsToFloat((int) (j() >> 32)), Float.intBitsToFloat((int) (vy9Var.j() >> 32)));
            max2 = Math.max(Float.intBitsToFloat((int) (j() & 4294967295L)), Float.intBitsToFloat((int) (vy9Var.j() & 4294967295L)));
            min = Math.min(Float.intBitsToFloat((int) (e() >> 32)), Float.intBitsToFloat((int) (vy9Var.e() >> 32)));
            min2 = Math.min(Float.intBitsToFloat((int) (e() & 4294967295L)), Float.intBitsToFloat((int) (4294967295L & vy9Var.e())));
        } else {
            long o = i35.o(lif0Var.f(), lif0Var.k());
            long o2 = i35.o(lif0Var.g(), lif0Var.l());
            max = Math.max(Float.intBitsToFloat((int) (j() >> 32)), Float.intBitsToFloat((int) (o >> 32)));
            max2 = Math.max(Float.intBitsToFloat((int) (j() & 4294967295L)), Float.intBitsToFloat((int) (o & 4294967295L)));
            min = Math.min(Float.intBitsToFloat((int) (e() >> 32)), Float.intBitsToFloat((int) (o2 >> 32)));
            min2 = Math.min(Float.intBitsToFloat((int) (e() & 4294967295L)), Float.intBitsToFloat((int) (4294967295L & o2)));
        }
        long n = i35.n(gqr.a(max, max2));
        double q = l370.q(n, i35.n(gqr.a(min, max2)));
        if (q < 0.1d) {
            q = 0.1d;
        }
        return (float) (l370.q(n, i35.n(gqr.a(max, min2))) * q);
    }

    @Override // xsna.lif0
    public final float o() {
        return F() * a0();
    }

    public final long p() {
        long W = W();
        float e2 = Coordinate.e(W);
        double e3 = (Coordinate.e(r3) + e2) / 2.0d;
        float f2 = Coordinate.f(K());
        float f3 = Coordinate.f(W);
        return gqr.a((float) e3, (float) (f3 <= f2 ? (f2 + f3) / 2.0d : ((f2 + 360.0d) + f3) / 2.0d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BoundingBox{");
        if (this == f) {
            sb.append("Spb!,");
        }
        sb.append("ne=");
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

    public final boolean u(elb0 elb0Var) {
        float f2 = elb0Var.f;
        float f3 = elb0Var.g;
        return ((R() > f2 ? 1 : (R() == f2 ? 0 : -1)) <= 0 && (f2 > G() ? 1 : (f2 == G() ? 0 : -1)) <= 0) && (Float.compare(Z(), D()) > 0 ? (Z() > f3 ? 1 : (Z() == f3 ? 0 : -1)) <= 0 || (f3 > D() ? 1 : (f3 == D() ? 0 : -1)) <= 0 : (f3 > Z() ? 1 : (f3 == Z() ? 0 : -1)) >= 0 && (f3 > D() ? 1 : (f3 == D() ? 0 : -1)) <= 0);
    }

    public boolean v0() {
        return this instanceof MutableBoundingBox;
    }

    public final float w0(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return Float.NaN;
        }
        long b2 = 256 << an10.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        double d = 180;
        double d2 = 360;
        double d3 = b2;
        return swe0.f((float) Math.floor(Math.min((-Math.log(Math.abs((((D() + d) / d2) * d3) - (((Z() + d) / d2) * d3)) / i)) / 0.6931471805599453d, (-Math.log(Math.abs(znk0.F(G(), b2) - znk0.F(R(), b2)) / i2)) / 0.6931471805599453d)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        parcel.writeFloat(Coordinate.e(j));
        parcel.writeFloat(Coordinate.f(j));
        long j2 = this.c;
        parcel.writeFloat(Coordinate.e(j2));
        parcel.writeFloat(Coordinate.f(j2));
    }

    public BoundingBox(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null);
    }

    public BoundingBox(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BoundingBox(long j, double d, double d2, zcl zclVar) {
        this(gqr.a(sdi.w(r9) + Coordinate.e(j), Coordinate.f(j) - sdi.w(r11)), gqr.a(Coordinate.e(j) - sdi.w(r9), sdi.w(r11) + Coordinate.f(j)), (zcl) null);
        float f2 = (float) d;
        float f3 = (float) d2;
    }

    @Override // xsna.luu, xsna.ktx0
    public final lif0 d() {
        return this;
    }

    @Override // xsna.luu
    public final snt n() {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BoundingBox(long j, float f2, zcl zclVar) {
        this(j, r5, r5 / ((float) Math.cos(sdi.x(Coordinate.e(j)))), (zcl) null);
        double d = f2 / 6371009.0d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoundingBox(float f2, float f3, float f4, float f5, zcl zclVar) {
        this(gqr.a(f5, f2), gqr.a(f3, f4), (zcl) null);
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BoundingBox(long j, float f2, float f3, zcl zclVar) {
        this(r3, Coordinate.e(l370.s(j, r12, du9.c)), Coordinate.f(l370.s(j, r11, du9.b)), r6, null);
        float f4 = f2 / 2.0f;
        float f5 = Coordinate.f(l370.s(j, f4, du9.d));
        float f6 = f3 / 2.0f;
        float e2 = Coordinate.e(l370.s(j, f6, du9.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BoundingBox(BoundingBox boundingBox) {
        this(r1, boundingBox.R(), boundingBox.D(), r4, null);
        float Z = boundingBox.Z();
        float G = boundingBox.G();
    }
}

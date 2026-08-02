package p1;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21410a;

    public c(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f21410a = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public final float a() {
        return this.f21410a[6];
    }

    public final float b() {
        return this.f21410a[7];
    }

    public final long c(float f6) {
        float f10 = 1 - f6;
        float[] fArr = this.f21410a;
        float f11 = f10 * f10 * f10;
        float f12 = 3 * f6;
        float f13 = f12 * f10 * f10;
        float f14 = f12 * f6 * f10;
        float f15 = f6 * f6 * f6;
        return s.g.a((a() * f15) + (fArr[4] * f14) + (fArr[2] * f13) + (fArr[0] * f11), (b() * f15) + (fArr[5] * f14) + (fArr[3] * f13) + (fArr[1] * f11));
    }

    public final Pair d(float f6) {
        float f10 = 1 - f6;
        long c2 = c(f6);
        float[] fArr = this.f21410a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = f10 * f10;
        float f16 = 2 * f10 * f6;
        float f17 = f6 * f6;
        return new Pair(u6.h.a(f11, f12, (f13 * f6) + (f11 * f10), (f14 * f6) + (f12 * f10), (fArr[4] * f17) + (f13 * f16) + (f11 * f15), (fArr[5] * f17) + (f14 * f16) + (f12 * f15), ci.c.y(c2), ci.c.z(c2)), u6.h.a(ci.c.y(c2), ci.c.z(c2), (a() * f17) + (fArr[4] * f16) + (fArr[2] * f15), (b() * f17) + (fArr[5] * f16) + (fArr[3] * f15), (a() * f6) + (fArr[4] * f10), (b() * f6) + (fArr[5] * f10), a(), b()));
    }

    public final l e(io.sentry.util.network.b f6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        float[] destination = new float[8];
        l lVar = new l(destination);
        float[] fArr = this.f21410a;
        int length = fArr.length;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, 0, destination, 0, length);
        Intrinsics.checkNotNullParameter(f6, "f");
        lVar.g(f6, 0);
        lVar.g(f6, 2);
        lVar.g(f6, 4);
        lVar.g(f6, 6);
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return Arrays.equals(this.f21410a, ((c) obj).f21410a);
    }

    public final boolean f() {
        float[] fArr = this.f21410a;
        return Math.abs(fArr[0] - a()) < 1.0E-4f && Math.abs(fArr[1] - b()) < 1.0E-4f;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21410a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("anchor0: (");
        float[] fArr = this.f21410a;
        sb2.append(fArr[0]);
        sb2.append(", ");
        sb2.append(fArr[1]);
        sb2.append(") control0: (");
        sb2.append(fArr[2]);
        sb2.append(", ");
        sb2.append(fArr[3]);
        sb2.append("), control1: (");
        sb2.append(fArr[4]);
        sb2.append(", ");
        sb2.append(fArr[5]);
        sb2.append("), anchor1: (");
        sb2.append(a());
        sb2.append(", ");
        sb2.append(b());
        sb2.append(')');
        return sb2.toString();
    }
}

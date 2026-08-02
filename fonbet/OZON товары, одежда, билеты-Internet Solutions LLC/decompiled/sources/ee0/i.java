package ee0;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;
import we0.x;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f62212a;

    /* renamed from: b, reason: collision with root package name */
    private final float f62213b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Function0<x> getMapState) {
        Intrinsics.checkNotNullParameter(getMapState, "getMapState");
        this.f62212a = (AbstractC7737t) getMapState;
        this.f62213b = Resources.getSystem().getDisplayMetrics().density;
    }

    private final m b(double d11, double d12, m mVar, double d13, double d14, double d15, double d16, double d17) {
        double d18 = 2;
        double d19 = d11 - (d16 / d18);
        double cos = (d12 - (d17 / d18)) / Math.cos(Math.toRadians(d15));
        double radians = Math.toRadians(-d14);
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d21 = (cos * sin) + (d19 * cos2);
        double d22 = (cos * cos2) + ((-d19) * sin);
        double pow = Math.pow(2.0d, d13) * 256.0d * this.f62213b;
        return new m(kotlin.ranges.h.c(Math.toDegrees((Math.atan(Math.exp(((-(((((0.5d - (Math.log(Math.tan((Math.toRadians(kotlin.ranges.h.c(mVar.getLatitude(), -85.05112878d, 85.05112878d)) / d18) + 0.7853981633974483d)) / 6.283185307179586d)) * pow) + d22) / pow) - 0.5d)) * d18) * 3.141592653589793d)) * d18) - 1.5707963267948966d), -85.05112878d, 85.05112878d), ((((((Math.toRadians(mVar.getLongitude()) / 6.283185307179586d) + 0.5d) * pow) + d21) / pow) - 0.5d) * 360.0d);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @NotNull
    public final we0.i a(double d11, @NotNull m center, double d12, double d13) {
        Intrinsics.checkNotNullParameter(center, "center");
        we0.j jVar = new we0.j(0, 0, 0, 0);
        int a11 = jVar.a();
        int b11 = jVar.b();
        int c11 = jVar.c();
        int d14 = jVar.d();
        x xVar = (x) this.f62212a.invoke();
        int a12 = xVar.a();
        int b12 = xVar.b();
        double d15 = a11;
        double d16 = b11;
        double d17 = a12;
        double d18 = b12;
        double d19 = a12 - c11;
        double d21 = b12 - d14;
        return new we0.i(b(d15, d16, center, d11, d12, d13, d17, d18), b(d19, d16, center, d11, d12, d13, d17, d18), b(d19, d21, center, d11, d12, d13, d17, d18), b(d15, d21, center, d11, d12, d13, d17, d18));
    }
}

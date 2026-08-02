package l1;

import B90.C2605g;
import B90.C2606h;
import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1.AbstractC8032c;
import m1.C8034e;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7819f0 {
    @NotNull
    public static final ColorSpace a(@NotNull AbstractC8032c abstractC8032c) {
        if (Intrinsics.d(abstractC8032c, C8034e.s())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.a())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.b())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.c())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.d())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.e())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.f())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.g())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.i())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.j())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.k())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.l())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.m())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.n())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.q())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.d(abstractC8032c, C8034e.r())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC8032c instanceof m1.p)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        m1.p pVar = (m1.p) abstractC8032c;
        float[] c11 = pVar.A().c();
        m1.q y11 = pVar.y();
        ColorSpace.Rgb.TransferParameters transferParameters = y11 != null ? new ColorSpace.Rgb.TransferParameters(y11.a(), y11.b(), y11.c(), y11.d(), y11.e(), y11.f(), y11.g()) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(abstractC8032c.g(), pVar.x(), c11, transferParameters);
        }
        String g10 = abstractC8032c.g();
        float[] x11 = pVar.x();
        final Function1<Double, Double> u11 = pVar.u();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: l1.d0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d11) {
                return ((Number) Function1.this.invoke(Double.valueOf(d11))).doubleValue();
            }
        };
        final Function1<Double, Double> q11 = pVar.q();
        return new ColorSpace.Rgb(g10, x11, c11, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: l1.e0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d11) {
                return ((Number) Function1.this.invoke(Double.valueOf(d11))).doubleValue();
            }
        }, abstractC8032c.e(0), abstractC8032c.d(0));
    }

    @NotNull
    public static final AbstractC8032c b(@NotNull ColorSpace colorSpace) {
        m1.r rVar;
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return C8034e.s();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return C8034e.a();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return C8034e.b();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C8034e.c();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return C8034e.d();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return C8034e.e();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C8034e.f();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C8034e.g();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C8034e.i();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C8034e.j();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C8034e.k();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C8034e.l();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C8034e.m();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C8034e.n();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C8034e.q();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C8034e.r();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return C8034e.s();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f7 = rgb.getWhitePoint()[0];
            float f11 = rgb.getWhitePoint()[1];
            float f12 = f7 + f11 + rgb.getWhitePoint()[2];
            rVar = new m1.r(f7 / f12, f11 / f12);
        } else {
            rVar = new m1.r(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        return new m1.p(rgb.getName(), rgb.getPrimaries(), rVar, rgb.getTransform(), new C2605g(colorSpace), new C2606h(colorSpace, 4), colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new m1.q(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
    }
}

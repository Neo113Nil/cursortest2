package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import k1.C7459e;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7844u implements InterfaceC7802U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Canvas f72280a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f72281b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f72282c;

    public C7844u() {
        Canvas canvas;
        canvas = C7845v.f72283a;
        this.f72280a = canvas;
    }

    @Override // l1.InterfaceC7802U
    public final void a(@NotNull InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, @NotNull r0 r0Var) {
        if (this.f72281b == null) {
            this.f72281b = new Rect();
            this.f72282c = new Rect();
        }
        Canvas canvas = this.f72280a;
        Bitmap a11 = C7849z.a(interfaceC7829k0);
        Rect rect = this.f72281b;
        Intrinsics.f(rect);
        int i11 = (int) (j11 >> 32);
        rect.left = i11;
        int i12 = (int) (j11 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j12 >> 32));
        rect.bottom = i12 + ((int) (j12 & 4294967295L));
        Unit unit = Unit.f71690a;
        Rect rect2 = this.f72282c;
        Intrinsics.f(rect2);
        int i13 = (int) (j13 >> 32);
        rect2.left = i13;
        int i14 = (int) (j13 & 4294967295L);
        rect2.top = i14;
        rect2.right = i13 + ((int) (j14 >> 32));
        rect2.bottom = i14 + ((int) (j14 & 4294967295L));
        canvas.drawBitmap(a11, rect, rect2, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void b(@NotNull C7460f c7460f, @NotNull r0 r0Var) {
        this.f72280a.saveLayer(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h(), r0Var.d(), 31);
    }

    @Override // l1.InterfaceC7802U
    public final void c(@NotNull s0 s0Var, @NotNull r0 r0Var) {
        Canvas canvas = this.f72280a;
        if (!(s0Var instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C7786D) s0Var).x(), r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void d(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull r0 r0Var) {
        this.f72280a.drawArc(f7, f11, f12, f13, f14, f15, false, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void e(float f7, float f11, float f12, float f13, int i11) {
        this.f72280a.clipRect(f7, f11, f12, f13, i11 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // l1.InterfaceC7802U
    public final void f(float f7, float f11) {
        this.f72280a.translate(f7, f11);
    }

    @Override // l1.InterfaceC7802U
    public final void g(@NotNull InterfaceC7829k0 interfaceC7829k0, @NotNull r0 r0Var) {
        this.f72280a.drawBitmap(C7849z.a(interfaceC7829k0), C7459e.g(0L), C7459e.h(0L), r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void h(float f7, float f11, float f12, float f13, @NotNull r0 r0Var) {
        this.f72280a.drawOval(f7, f11, f12, f13, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void i() {
        C7805X.a(this.f72280a, false);
    }

    @Override // l1.InterfaceC7802U
    public final void k(long j11, long j12, @NotNull r0 r0Var) {
        this.f72280a.drawLine(C7459e.g(j11), C7459e.h(j11), C7459e.g(j12), C7459e.h(j12), r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void l(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull r0 r0Var) {
        this.f72280a.drawRoundRect(f7, f11, f12, f13, f14, f15, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void m(float f7, float f11, float f12, float f13, @NotNull r0 r0Var) {
        this.f72280a.drawRect(f7, f11, f12, f13, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void n(long j11, @NotNull r0 r0Var, float f7) {
        this.f72280a.drawCircle(C7459e.g(j11), C7459e.h(j11), f7, r0Var.d());
    }

    @Override // l1.InterfaceC7802U
    public final void o(float f7, float f11) {
        this.f72280a.scale(f7, f11);
    }

    @Override // l1.InterfaceC7802U
    public final void p() {
        this.f72280a.restore();
    }

    @Override // l1.InterfaceC7802U
    public final void q() {
        C7805X.a(this.f72280a, true);
    }

    @Override // l1.InterfaceC7802U
    public final void s(@NotNull float[] fArr) {
        int i11 = 0;
        while (i11 < 4) {
            int i12 = 0;
            while (i12 < 4) {
                if (fArr[(i11 * 4) + i12] != (i11 == i12 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    C7783A.a(matrix, fArr);
                    this.f72280a.concat(matrix);
                    return;
                }
                i12++;
            }
            i11++;
        }
    }

    @Override // l1.InterfaceC7802U
    public final void save() {
        this.f72280a.save();
    }

    @Override // l1.InterfaceC7802U
    public final void t() {
        this.f72280a.rotate(45.0f);
    }

    @Override // l1.InterfaceC7802U
    public final void u(@NotNull s0 s0Var) {
        Canvas canvas = this.f72280a;
        if (!(s0Var instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C7786D) s0Var).x(), Region.Op.INTERSECT);
    }

    @NotNull
    public final Canvas v() {
        return this.f72280a;
    }

    public final void w(@NotNull Canvas canvas) {
        this.f72280a = canvas;
    }
}

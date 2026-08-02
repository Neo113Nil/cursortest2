package l1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import k1.C7455a;
import k1.C7459e;
import k1.C7460f;
import k1.C7462h;
import kotlin.jvm.internal.Intrinsics;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7786D implements s0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f72192a;

    /* renamed from: b, reason: collision with root package name */
    private RectF f72193b;

    /* renamed from: c, reason: collision with root package name */
    private float[] f72194c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f72195d;

    public C7786D() {
        this(0);
    }

    @Override // l1.s0
    public final void a(float f7, float f11) {
        this.f72192a.moveTo(f7, f11);
    }

    @Override // l1.s0
    public final void b(float f7, float f11) {
        this.f72192a.lineTo(f7, f11);
    }

    @Override // l1.s0
    public final void c(float f7, float f11, float f12, float f13, float f14, float f15) {
        this.f72192a.cubicTo(f7, f11, f12, f13, f14, f15);
    }

    @Override // l1.s0
    public final void close() {
        this.f72192a.close();
    }

    @Override // l1.s0
    public final void d(@NotNull C7460f c7460f, @NotNull s0.a aVar) {
        if (Float.isNaN(c7460f.n()) || Float.isNaN(c7460f.q()) || Float.isNaN(c7460f.o()) || Float.isNaN(c7460f.h())) {
            throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
        if (this.f72193b == null) {
            this.f72193b = new RectF();
        }
        RectF rectF = this.f72193b;
        Intrinsics.f(rectF);
        rectF.set(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h());
        RectF rectF2 = this.f72193b;
        Intrinsics.f(rectF2);
        this.f72192a.addRect(rectF2, C7790H.b(aVar));
    }

    @Override // l1.s0
    public final void e(float f7, float f11) {
        this.f72192a.rMoveTo(f7, f11);
    }

    @Override // l1.s0
    public final void f(float f7, float f11, float f12, float f13, float f14, float f15) {
        this.f72192a.rCubicTo(f7, f11, f12, f13, f14, f15);
    }

    @Override // l1.s0
    public final void g(float f7, float f11, float f12, float f13) {
        this.f72192a.rQuadTo(f7, f11, f12, f13);
    }

    @Override // l1.s0
    @NotNull
    public final C7460f getBounds() {
        if (this.f72193b == null) {
            this.f72193b = new RectF();
        }
        RectF rectF = this.f72193b;
        Intrinsics.f(rectF);
        this.f72192a.computeBounds(rectF, true);
        return new C7460f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // l1.s0
    public final void h() {
        this.f72192a.rewind();
    }

    @Override // l1.s0
    public final void i(long j11) {
        Matrix matrix = this.f72195d;
        if (matrix == null) {
            this.f72195d = new Matrix();
        } else {
            Intrinsics.f(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f72195d;
        Intrinsics.f(matrix2);
        matrix2.setTranslate(C7459e.g(j11), C7459e.h(j11));
        Matrix matrix3 = this.f72195d;
        Intrinsics.f(matrix3);
        this.f72192a.transform(matrix3);
    }

    @Override // l1.s0
    public final void j(float f7, float f11, float f12, float f13) {
        this.f72192a.rQuadTo(f7, f11, f12, f13);
    }

    @Override // l1.s0
    public final boolean k(@NotNull s0 s0Var, @NotNull s0 s0Var2, int i11) {
        Path.Op op = v0.a(i11, 0) ? Path.Op.DIFFERENCE : v0.a(i11, 1) ? Path.Op.INTERSECT : v0.a(i11, 4) ? Path.Op.REVERSE_DIFFERENCE : v0.a(i11, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(s0Var instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C7786D) s0Var).f72192a;
        if (s0Var2 instanceof C7786D) {
            return this.f72192a.op(path, ((C7786D) s0Var2).f72192a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // l1.s0
    public final int m() {
        return this.f72192a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // l1.s0
    public final boolean o() {
        return this.f72192a.isConvex();
    }

    @Override // l1.s0
    public final void p(float f7, float f11, float f12, float f13) {
        this.f72192a.quadTo(f7, f11, f12, f13);
    }

    @Override // l1.s0
    public final void q(int i11) {
        this.f72192a.setFillType(i11 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // l1.s0
    public final void r(float f7, float f11, float f12, float f13) {
        this.f72192a.quadTo(f7, f11, f12, f13);
    }

    @Override // l1.s0
    public final void reset() {
        this.f72192a.reset();
    }

    @Override // l1.s0
    public final void s(@NotNull C7462h c7462h, @NotNull s0.a aVar) {
        if (this.f72193b == null) {
            this.f72193b = new RectF();
        }
        RectF rectF = this.f72193b;
        Intrinsics.f(rectF);
        rectF.set(c7462h.e(), c7462h.g(), c7462h.f(), c7462h.a());
        if (this.f72194c == null) {
            this.f72194c = new float[8];
        }
        float[] fArr = this.f72194c;
        Intrinsics.f(fArr);
        fArr[0] = C7455a.d(c7462h.h());
        fArr[1] = C7455a.e(c7462h.h());
        fArr[2] = C7455a.d(c7462h.i());
        fArr[3] = C7455a.e(c7462h.i());
        fArr[4] = C7455a.d(c7462h.c());
        fArr[5] = C7455a.e(c7462h.c());
        fArr[6] = C7455a.d(c7462h.b());
        fArr[7] = C7455a.e(c7462h.b());
        RectF rectF2 = this.f72193b;
        Intrinsics.f(rectF2);
        float[] fArr2 = this.f72194c;
        Intrinsics.f(fArr2);
        this.f72192a.addRoundRect(rectF2, fArr2, C7790H.b(aVar));
    }

    @Override // l1.s0
    public final void t(float f7, float f11) {
        this.f72192a.rLineTo(f7, f11);
    }

    public final void u(@NotNull C7460f c7460f, @NotNull s0.a aVar) {
        if (this.f72193b == null) {
            this.f72193b = new RectF();
        }
        RectF rectF = this.f72193b;
        Intrinsics.f(rectF);
        rectF.set(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h());
        RectF rectF2 = this.f72193b;
        Intrinsics.f(rectF2);
        this.f72192a.addOval(rectF2, C7790H.b(aVar));
    }

    public final void v(@NotNull s0 s0Var, long j11) {
        if (!(s0Var instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f72192a.addPath(((C7786D) s0Var).f72192a, C7459e.g(j11), C7459e.h(j11));
    }

    public final void w(@NotNull C7460f c7460f, float f7, float f11) {
        float n11 = c7460f.n();
        float q11 = c7460f.q();
        float o11 = c7460f.o();
        float h11 = c7460f.h();
        if (this.f72193b == null) {
            this.f72193b = new RectF();
        }
        RectF rectF = this.f72193b;
        Intrinsics.f(rectF);
        rectF.set(n11, q11, o11, h11);
        RectF rectF2 = this.f72193b;
        Intrinsics.f(rectF2);
        this.f72192a.arcTo(rectF2, f7, f11, false);
    }

    @NotNull
    public final Path x() {
        return this.f72192a;
    }

    public final boolean y() {
        return this.f72192a.isEmpty();
    }

    public C7786D(@NotNull Path path) {
        this.f72192a = path;
    }

    public /* synthetic */ C7786D(int i11) {
        this(new Path());
    }
}

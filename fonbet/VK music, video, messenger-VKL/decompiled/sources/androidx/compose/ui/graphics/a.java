package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.Path;
import xsna.aog0;
import xsna.zhf0;

/* compiled from: AndroidPath.android.kt */
/* loaded from: classes11.dex */
public final class a implements Path {
    public final android.graphics.Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public a() {
        this(0);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void a(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        this.d.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.a.transform(this.d);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void g(zhf0 zhf0Var, Path.Direction direction) {
        float f = zhf0Var.a;
        float f2 = zhf0Var.d;
        float f3 = zhf0Var.c;
        float f4 = zhf0Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            b.c("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        this.b.set(zhf0Var.a, f4, f3, f2);
        this.a.addRect(this.b, b.b(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final zhf0 getBounds() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        this.a.computeBounds(rectF, true);
        return new zhf0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final int h() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean j() {
        return this.a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void k(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void l(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void m(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void n(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void o(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void q(aog0 aog0Var, Path.Direction direction) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        float f = aog0Var.a;
        long j = aog0Var.h;
        long j2 = aog0Var.g;
        long j3 = aog0Var.f;
        long j4 = aog0Var.e;
        rectF.set(f, aog0Var.b, aog0Var.c, aog0Var.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a.addRoundRect(this.b, this.c, b.b(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.a.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void rewind() {
        this.a.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void s(zhf0 zhf0Var, float f, float f2) {
        float f3 = zhf0Var.a;
        float f4 = zhf0Var.b;
        float f5 = zhf0Var.c;
        float f6 = zhf0Var.d;
        if (this.b == null) {
            this.b = new RectF();
        }
        this.b.set(f3, f4, f5, f6);
        this.a.arcTo(this.b, f, f2, false);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void t(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void w(Path path, long j) {
        if (!(path instanceof a)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.addPath(((a) path).a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final boolean x(Path path, Path path2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(path instanceof a)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((a) path).a;
        if (path2 instanceof a) {
            return this.a.op(path3, ((a) path2).a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public a(android.graphics.Path path) {
        this.a = path;
    }

    public /* synthetic */ a(int i) {
        this(new android.graphics.Path());
    }
}

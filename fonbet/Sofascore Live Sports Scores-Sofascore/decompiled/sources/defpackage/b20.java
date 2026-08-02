package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b20 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public b20(Path path) {
        this.a = path;
    }

    public static void a(b20 b20Var, b20 b20Var2) {
        Path path = b20Var.a;
        if (b20Var2 instanceof b20) {
            path.addPath(b20Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            a70.m("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(b20 b20Var, oqf oqfVar) {
        tae[] taeVarArr = tae.a;
        float f = oqfVar.a;
        float f2 = oqfVar.d;
        float f3 = oqfVar.c;
        float f4 = oqfVar.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            e20.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = b20Var.b;
        if (rectF == null) {
            rectF = new RectF();
            b20Var.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = b20Var.a;
        RectF rectF2 = b20Var.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(b20 b20Var, e7g e7gVar) {
        tae[] taeVarArr = tae.a;
        RectF rectF = b20Var.b;
        if (rectF == null) {
            rectF = new RectF();
            b20Var.b = rectF;
        }
        float f = e7gVar.a;
        long j = e7gVar.h;
        long j2 = e7gVar.g;
        long j3 = e7gVar.f;
        long j4 = e7gVar.e;
        rectF.set(f, e7gVar.b, e7gVar.c, e7gVar.d);
        float[] fArr = b20Var.c;
        if (fArr == null) {
            fArr = new float[8];
            b20Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = b20Var.a;
        RectF rectF2 = b20Var.b;
        rectF2.getClass();
        float[] fArr2 = b20Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void d() {
        this.a.close();
    }

    public final oqf e() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new oqf(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void f(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void g(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean h(b20 b20Var, b20 b20Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(b20Var instanceof b20)) {
            a70.m("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = b20Var.a;
        if (b20Var2 instanceof b20) {
            return this.a.op(path, b20Var2.a, op);
        }
        a70.m("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void i() {
        this.a.reset();
    }

    public final void j(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void k(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}

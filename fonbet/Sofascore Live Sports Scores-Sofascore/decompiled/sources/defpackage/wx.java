package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wx implements uj2 {
    public Canvas a = xx.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.uj2
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.uj2
    public final void b(b20 b20Var, gtj gtjVar) {
        Canvas canvas = this.a;
        if (b20Var instanceof b20) {
            canvas.drawPath(b20Var.a, yqo.D(gtjVar));
        } else {
            a70.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.uj2
    public final void c(float f, long j, gtj gtjVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) gtjVar.d);
    }

    @Override // defpackage.uj2
    public final void d(float f, float f2, float f3, float f4, gtj gtjVar) {
        this.a.drawRect(f, f2, f3, f4, yqo.D(gtjVar));
    }

    @Override // defpackage.uj2
    public final void e(long j, long j2, gtj gtjVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) gtjVar.d);
    }

    @Override // defpackage.uj2
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.uj2
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.uj2
    public final void h() {
        this.a.restore();
    }

    @Override // defpackage.uj2
    public final void i(float f, float f2, float f3, float f4, float f5, float f6, gtj gtjVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) gtjVar.d);
    }

    @Override // defpackage.uj2
    public final void j() {
        pd0.p(this.a, true);
    }

    @Override // defpackage.uj2
    public final void k(oqf oqfVar, gtj gtjVar) {
        this.a.saveLayer(oqfVar.a, oqfVar.b, oqfVar.c, oqfVar.d, (Paint) gtjVar.d, 31);
    }

    @Override // defpackage.uj2
    public final void l(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.uj2
    public final void m(a10 a10Var, long j, gtj gtjVar) {
        this.a.drawBitmap(c6o.z(a10Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) gtjVar.d);
    }

    @Override // defpackage.uj2
    public final void n(float f, float f2, float f3, float f4, float f5, float f6, gtj gtjVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) gtjVar.d);
    }

    @Override // defpackage.uj2
    public final void o() {
        this.a.save();
    }

    @Override // defpackage.uj2
    public final void p() {
        pd0.p(this.a, false);
    }

    @Override // defpackage.uj2
    public final void q(float[] fArr) {
        if (y6a.F(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        pco.O(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.uj2
    public final void r(b20 b20Var) {
        Canvas canvas = this.a;
        if (b20Var instanceof b20) {
            canvas.clipPath(b20Var.a, Region.Op.INTERSECT);
        } else {
            a70.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.uj2
    public final void s(a10 a10Var, long j, long j2, long j3, gtj gtjVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap z = c6o.z(a10Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.a;
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(z, rect, rect2, (Paint) gtjVar.d);
    }
}

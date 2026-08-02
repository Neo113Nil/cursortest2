package androidx.vectordrawable.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.transition.n0;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2827p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2828a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2829b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2830c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f2831d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2832e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2833f;

    /* renamed from: g, reason: collision with root package name */
    public final n f2834g;

    /* renamed from: h, reason: collision with root package name */
    public float f2835h;

    /* renamed from: i, reason: collision with root package name */
    public float f2836i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f2837k;

    /* renamed from: l, reason: collision with root package name */
    public int f2838l;

    /* renamed from: m, reason: collision with root package name */
    public String f2839m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2840n;

    /* renamed from: o, reason: collision with root package name */
    public final s.e f2841o;

    public q() {
        this.f2830c = new Matrix();
        this.f2835h = 0.0f;
        this.f2836i = 0.0f;
        this.j = 0.0f;
        this.f2837k = 0.0f;
        this.f2838l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f2839m = null;
        this.f2840n = null;
        this.f2841o = new s.e(0);
        this.f2834g = new n();
        this.f2828a = new Path();
        this.f2829b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(n nVar, Matrix matrix, Canvas canvas, int i5, int i10) {
        int i11;
        float f6;
        int i12;
        float f10;
        Matrix matrix2 = nVar.f2814a;
        ArrayList arrayList = nVar.f2815b;
        matrix2.set(matrix);
        Matrix matrix3 = nVar.f2814a;
        matrix3.preConcat(nVar.j);
        canvas.save();
        char c2 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            o oVar = (o) arrayList.get(i13);
            if (oVar instanceof n) {
                a((n) oVar, matrix3, canvas, i5, i10);
            } else if (oVar instanceof p) {
                p pVar = (p) oVar;
                float f11 = i5 / this.j;
                float f12 = i10 / this.f2837k;
                float min = Math.min(f11, f12);
                Matrix matrix4 = this.f2830c;
                matrix4.set(matrix3);
                matrix4.postScale(f11, f12);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c2], fArr[1]);
                boolean z5 = c2;
                i11 = i13;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f13 = (fArr[z5 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f13) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f2828a;
                    path.reset();
                    g0.f[] fVarArr = pVar.f2824a;
                    if (fVarArr != null) {
                        y4.a.B(fVarArr, path);
                    }
                    Path path2 = this.f2829b;
                    path2.reset();
                    if (pVar instanceof l) {
                        path2.setFillType(pVar.f2826c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        m mVar = (m) pVar;
                        float f14 = mVar.f2809i;
                        if (f14 != 0.0f || mVar.j != 1.0f) {
                            float f15 = mVar.f2810k;
                            float f16 = (f14 + f15) % 1.0f;
                            float f17 = (mVar.j + f15) % 1.0f;
                            if (this.f2833f == null) {
                                this.f2833f = new PathMeasure();
                            }
                            this.f2833f.setPath(path, z5);
                            float length = this.f2833f.getLength();
                            float f18 = f16 * length;
                            float f19 = f17 * length;
                            path.reset();
                            if (f18 > f19) {
                                this.f2833f.getSegment(f18, length, path, true);
                                f6 = 0.0f;
                                this.f2833f.getSegment(0.0f, f19, path, true);
                            } else {
                                f6 = 0.0f;
                                this.f2833f.getSegment(f18, f19, path, true);
                            }
                            path.rLineTo(f6, f6);
                        }
                        path2.addPath(path, matrix4);
                        n0 n0Var = mVar.f2806f;
                        if (((Shader) n0Var.f2734c) == null && n0Var.f2733b == 0) {
                            f10 = 255.0f;
                            i12 = 16777215;
                        } else {
                            if (this.f2832e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f2832e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f2832e;
                            Shader shader = (Shader) n0Var.f2734c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(mVar.f2808h * 255.0f));
                                f10 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i14 = n0Var.f2733b;
                                float f20 = mVar.f2808h;
                                PorterDuff.Mode mode = t.j;
                                f10 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f20)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(mVar.f2826c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        n0 n0Var2 = mVar.f2804d;
                        if (((Shader) n0Var2.f2734c) != null || n0Var2.f2733b != 0) {
                            if (this.f2831d == null) {
                                Paint paint3 = new Paint(1);
                                this.f2831d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f2831d;
                            Paint.Join join = mVar.f2812m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = mVar.f2811l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(mVar.f2813n);
                            Shader shader2 = (Shader) n0Var2.f2734c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(mVar.f2807g * f10));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i15 = n0Var2.f2733b;
                                float f21 = mVar.f2807g;
                                PorterDuff.Mode mode2 = t.j;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(mVar.f2805e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c2 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c2 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2838l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i5) {
        this.f2838l = i5;
    }

    public q(q qVar) {
        this.f2830c = new Matrix();
        this.f2835h = 0.0f;
        this.f2836i = 0.0f;
        this.j = 0.0f;
        this.f2837k = 0.0f;
        this.f2838l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f2839m = null;
        this.f2840n = null;
        s.e eVar = new s.e(0);
        this.f2841o = eVar;
        this.f2834g = new n(qVar.f2834g, eVar);
        this.f2828a = new Path(qVar.f2828a);
        this.f2829b = new Path(qVar.f2829b);
        this.f2835h = qVar.f2835h;
        this.f2836i = qVar.f2836i;
        this.j = qVar.j;
        this.f2837k = qVar.f2837k;
        this.f2838l = qVar.f2838l;
        this.f2839m = qVar.f2839m;
        String str = qVar.f2839m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f2840n = qVar.f2840n;
    }
}

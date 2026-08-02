package y7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import x7.C10673a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f106178a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f106179b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f106180c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f106181d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f106182e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f106183f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f106184g = new ArrayList();

    static class a extends f {

        /* renamed from: b, reason: collision with root package name */
        private final c f106185b;

        public a(c cVar) {
            this.f106185b = cVar;
        }

        @Override // y7.n.f
        public final void a(Matrix matrix, @NonNull C10673a c10673a, int i11, @NonNull Canvas canvas) {
            c cVar = this.f106185b;
            c10673a.a(canvas, matrix, new RectF(cVar.f106190b, cVar.f106191c, cVar.f106192d, cVar.f106193e), i11, cVar.f106194f, cVar.f106195g);
        }
    }

    static class b extends f {

        /* renamed from: b, reason: collision with root package name */
        private final d f106186b;

        /* renamed from: c, reason: collision with root package name */
        private final float f106187c;

        /* renamed from: d, reason: collision with root package name */
        private final float f106188d;

        public b(d dVar, float f7, float f11) {
            this.f106186b = dVar;
            this.f106187c = f7;
            this.f106188d = f11;
        }

        @Override // y7.n.f
        public final void a(Matrix matrix, @NonNull C10673a c10673a, int i11, @NonNull Canvas canvas) {
            d dVar = this.f106186b;
            float f7 = dVar.f106197c;
            float f11 = this.f106188d;
            float f12 = dVar.f106196b;
            float f13 = this.f106187c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f7 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            c10673a.b(canvas, matrix2, rectF, i11);
        }

        final float b() {
            d dVar = this.f106186b;
            return (float) Math.toDegrees(Math.atan((dVar.f106197c - this.f106188d) / (dVar.f106196b - this.f106187c)));
        }
    }

    public static class c extends e {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f106189h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f106190b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f106191c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f106192d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f106193e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f106194f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f106195g;

        public c(float f7, float f11, float f12, float f13) {
            this.f106190b = f7;
            this.f106191c = f11;
            this.f106192d = f12;
            this.f106193e = f13;
        }

        @Override // y7.n.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f106198a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f106189h;
            rectF.set(this.f106190b, this.f106191c, this.f106192d, this.f106193e);
            path.arcTo(rectF, this.f106194f, this.f106195g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        private float f106196b;

        /* renamed from: c, reason: collision with root package name */
        private float f106197c;

        @Override // y7.n.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f106198a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f106196b, this.f106197c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f106198a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f106199a = new Matrix();

        f() {
        }

        public abstract void a(Matrix matrix, C10673a c10673a, int i11, Canvas canvas);
    }

    public n() {
        f(0.0f, 270.0f, 0.0f);
    }

    private void b(float f7) {
        float f11 = this.f106181d;
        if (f11 == f7) {
            return;
        }
        float f12 = ((f7 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f106179b;
        float f14 = this.f106180c;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f106194f = this.f106181d;
        cVar.f106195g = f12;
        this.f106184g.add(new a(cVar));
        this.f106181d = f7;
    }

    public final void a(float f7, float f11, float f12, float f13, float f14, float f15) {
        c cVar = new c(f7, f11, f12, f13);
        cVar.f106194f = f14;
        cVar.f106195g = f15;
        this.f106183f.add(cVar);
        a aVar = new a(cVar);
        float f16 = f14 + f15;
        boolean z11 = f15 < 0.0f;
        if (z11) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z11 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f106184g.add(aVar);
        this.f106181d = f17;
        double d11 = f16;
        this.f106179b = (((f12 - f7) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))) + ((f7 + f12) * 0.5f);
        this.f106180c = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))) + ((f11 + f13) * 0.5f);
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f106183f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e) arrayList.get(i11)).a(matrix, path);
        }
    }

    @NonNull
    final m d(Matrix matrix) {
        b(this.f106182e);
        return new m(new ArrayList(this.f106184g), new Matrix(matrix));
    }

    public final void e(float f7, float f11) {
        d dVar = new d();
        dVar.f106196b = f7;
        dVar.f106197c = f11;
        this.f106183f.add(dVar);
        b bVar = new b(dVar, this.f106179b, this.f106180c);
        float b11 = bVar.b() + 270.0f;
        float b12 = bVar.b() + 270.0f;
        b(b11);
        this.f106184g.add(bVar);
        this.f106181d = b12;
        this.f106179b = f7;
        this.f106180c = f11;
    }

    public final void f(float f7, float f11, float f12) {
        this.f106178a = f7;
        this.f106179b = 0.0f;
        this.f106180c = f7;
        this.f106181d = f11;
        this.f106182e = (f11 + f12) % 360.0f;
        this.f106183f.clear();
        this.f106184g.clear();
    }
}

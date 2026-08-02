package o2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import h2.AbstractC6784b;
import h2.p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class e extends p {

    static class a extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setAlpha(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    public static class b extends e {

        /* renamed from: i, reason: collision with root package name */
        String f77622i;

        /* renamed from: j, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f77623j;

        /* renamed from: k, reason: collision with root package name */
        SparseArray<float[]> f77624k;

        /* renamed from: l, reason: collision with root package name */
        float[] f77625l;

        /* renamed from: m, reason: collision with root package name */
        float[] f77626m;

        public b() {
            throw null;
        }

        @Override // h2.p
        public final void b(int i11, float f7, float f11, int i12, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // h2.p
        public final void d(int i11) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f77623j;
            int size = sparseArray.size();
            int g10 = sparseArray.valueAt(0).g();
            double[] dArr = new double[size];
            int i12 = g10 + 2;
            this.f77625l = new float[i12];
            this.f77626m = new float[g10];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.constraintlayout.widget.a valueAt = sparseArray.valueAt(i13);
                float[] valueAt2 = this.f77624k.valueAt(i13);
                dArr[i13] = keyAt * 0.01d;
                valueAt.e(this.f77625l);
                int i14 = 0;
                while (true) {
                    if (i14 < this.f77625l.length) {
                        dArr2[i13][i14] = r10[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[g10] = valueAt2[0];
                dArr3[g10 + 1] = valueAt2[1];
            }
            this.f64712a = AbstractC6784b.a(i11, dArr, dArr2);
        }

        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            this.f64712a.d(f7, this.f77625l);
            float[] fArr = this.f77625l;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j12 = j11 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = dVar.a(view, this.f77622i);
                if (Float.isNaN(this.last_cycle)) {
                    this.last_cycle = 0.0f;
                }
            }
            this.last_cycle = (float) ((((j12 * 1.0E-9d) * f11) + this.last_cycle) % 1.0d);
            this.last_time = j11;
            float a11 = a(this.last_cycle);
            this.f64719h = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f77626m;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f64719h;
                float f13 = this.f77625l[i11];
                this.f64719h = z11 | (((double) f13) != 0.0d);
                fArr2[i11] = (f13 * a11) + f12;
                i11++;
            }
            C8632a.b(this.f77623j.valueAt(0), view, this.f77626m);
            if (f11 != 0.0f) {
                this.f64719h = true;
            }
            return this.f64719h;
        }

        public final void i(int i11, androidx.constraintlayout.widget.a aVar, float f7, int i12, float f11) {
            this.f77623j.append(i11, aVar);
            this.f77624k.append(i11, new float[]{f7, f11});
            this.f64713b = Math.max(this.f64713b, i12);
        }
    }

    static class c extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setElevation(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    public static class d extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            return this.f64719h;
        }

        public final boolean i(View view, h2.d dVar, float f7, long j11, double d11, double d12) {
            view.setRotation(e(f7, j11, view, dVar) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.f64719h;
        }
    }

    /* renamed from: o2.e$e, reason: collision with other inner class name */
    static class C1309e extends e {

        /* renamed from: i, reason: collision with root package name */
        boolean f77627i;

        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            Method method;
            C1309e c1309e;
            float e11;
            if (view instanceof MotionLayout) {
                float e12 = e(f7, j11, view, dVar);
                c1309e = this;
                ((MotionLayout) view).H(e12);
            } else {
                if (this.f77627i) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f77627i = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        e11 = e(f7, j11, view, dVar);
                        c1309e = this;
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        c1309e = this;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        c1309e = this;
                    }
                    try {
                        method.invoke(view, Float.valueOf(e11));
                    } catch (IllegalAccessException e15) {
                        e = e15;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                        return c1309e.f64719h;
                    } catch (InvocationTargetException e16) {
                        e = e16;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                        return c1309e.f64719h;
                    }
                } else {
                    c1309e = this;
                }
            }
            return c1309e.f64719h;
        }
    }

    static class f extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setRotation(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class g extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setRotationX(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class h extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setRotationY(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class i extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setScaleX(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class j extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setScaleY(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class k extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setTranslationX(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class l extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setTranslationY(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    static class m extends e {
        @Override // o2.e
        public final boolean h(float f7, long j11, View view, h2.d dVar) {
            view.setTranslationZ(e(f7, j11, view, dVar));
            return this.f64719h;
        }
    }

    public static b f(String str, SparseArray sparseArray) {
        b bVar = new b();
        bVar.f77624k = new SparseArray<>();
        bVar.f77622i = str.split(",")[1];
        bVar.f77623j = sparseArray;
        return bVar;
    }

    public static e g(String str) {
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                C1309e c1309e = new C1309e();
                c1309e.f77627i = false;
                return c1309e;
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "rotation":
                return new f();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            default:
                return null;
        }
    }

    public final float e(float f7, long j11, View view, h2.d dVar) {
        this.f64712a.d(f7, this.f64718g);
        float[] fArr = this.f64718g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f64719h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            this.last_cycle = dVar.a(view, this.f64717f);
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = 0.0f;
            }
        }
        this.last_cycle = (float) (((((j11 - this.last_time) * 1.0E-9d) * f11) + this.last_cycle) % 1.0d);
        dVar.b(view, this.f64717f, this.last_cycle);
        this.last_time = j11;
        float f12 = this.f64718g[0];
        float a11 = (a(this.last_cycle) * f12) + this.f64718g[2];
        this.f64719h = (f12 == 0.0f && f11 == 0.0f) ? false : true;
        return a11;
    }

    public abstract boolean h(float f7, long j11, View view, h2.d dVar);
}

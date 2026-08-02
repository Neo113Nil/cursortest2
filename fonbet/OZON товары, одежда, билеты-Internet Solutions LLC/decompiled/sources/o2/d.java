package o2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import h2.AbstractC6784b;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class d extends h2.k {

    static class a extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setAlpha(a(f7));
        }
    }

    public static class b extends d {

        /* renamed from: f, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f77619f;

        /* renamed from: g, reason: collision with root package name */
        float[] f77620g;

        public b() {
            throw null;
        }

        @Override // h2.k
        public final void b(float f7, int i11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // h2.k
        public final void d(int i11) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f77619f;
            int size = sparseArray.size();
            int g10 = sparseArray.valueAt(0).g();
            double[] dArr = new double[size];
            this.f77620g = new float[g10];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, g10);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = sparseArray.keyAt(i12);
                androidx.constraintlayout.widget.a valueAt = sparseArray.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                valueAt.e(this.f77620g);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f77620g.length) {
                        dArr2[i12][i13] = r7[i13];
                        i13++;
                    }
                }
            }
            this.f64683a = AbstractC6784b.a(i11, dArr, dArr2);
        }

        @Override // o2.d
        public final void g(View view, float f7) {
            this.f64683a.d(f7, this.f77620g);
            C8632a.b(this.f77619f.valueAt(0), view, this.f77620g);
        }

        public final void h(int i11, androidx.constraintlayout.widget.a aVar) {
            this.f77619f.append(i11, aVar);
        }
    }

    static class c extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setElevation(a(f7));
        }
    }

    /* renamed from: o2.d$d, reason: collision with other inner class name */
    public static class C1308d extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
        }
    }

    static class e extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setPivotX(a(f7));
        }
    }

    static class f extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setPivotY(a(f7));
        }
    }

    static class g extends d {

        /* renamed from: f, reason: collision with root package name */
        boolean f77621f;

        @Override // o2.d
        public final void g(View view, float f7) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).H(a(f7));
                return;
            }
            if (this.f77621f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f77621f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f7)));
                } catch (IllegalAccessException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e("ViewSpline", "unable to setProgress", e12);
                }
            }
        }
    }

    static class h extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setRotation(a(f7));
        }
    }

    static class i extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setRotationX(a(f7));
        }
    }

    static class j extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setRotationY(a(f7));
        }
    }

    static class k extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setScaleX(a(f7));
        }
    }

    static class l extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setScaleY(a(f7));
        }
    }

    static class m extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setTranslationX(a(f7));
        }
    }

    static class n extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setTranslationY(a(f7));
        }
    }

    static class o extends d {
        @Override // o2.d
        public final void g(View view, float f7) {
            view.setTranslationZ(a(f7));
        }
    }

    public static b e(String str, SparseArray sparseArray) {
        b bVar = new b();
        String str2 = str.split(",")[1];
        bVar.f77619f = sparseArray;
        return bVar;
    }

    public static d f(String str) {
        switch (str) {
            case "progress":
                g gVar = new g();
                gVar.f77621f = false;
                break;
        }
        return new a();
    }

    public abstract void g(View view, float f7);
}

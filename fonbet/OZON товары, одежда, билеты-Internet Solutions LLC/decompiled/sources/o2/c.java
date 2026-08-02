package o2;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class c extends h2.f {

    static class a extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setAlpha(a(f7));
        }
    }

    static class b extends c {

        /* renamed from: g, reason: collision with root package name */
        float[] f77616g;

        /* renamed from: h, reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f77617h;

        @Override // h2.f
        protected final void b(androidx.constraintlayout.widget.a aVar) {
            this.f77617h = aVar;
        }

        @Override // o2.c
        public final void h(View view, float f7) {
            float a11 = a(f7);
            float[] fArr = this.f77616g;
            fArr[0] = a11;
            C8632a.b(this.f77617h, view, fArr);
        }
    }

    /* renamed from: o2.c$c, reason: collision with other inner class name */
    static class C1307c extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setElevation(a(f7));
        }
    }

    public static class d extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
        }
    }

    static class e extends c {

        /* renamed from: g, reason: collision with root package name */
        boolean f77618g;

        @Override // o2.c
        public final void h(View view, float f7) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).H(a(f7));
                return;
            }
            if (this.f77618g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f77618g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f7)));
                } catch (IllegalAccessException e11) {
                    Log.e("ViewOscillator", "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e("ViewOscillator", "unable to setProgress", e12);
                }
            }
        }
    }

    static class f extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setRotation(a(f7));
        }
    }

    static class g extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setRotationX(a(f7));
        }
    }

    static class h extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setRotationY(a(f7));
        }
    }

    static class i extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setScaleX(a(f7));
        }
    }

    static class j extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setScaleY(a(f7));
        }
    }

    static class k extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setTranslationX(a(f7));
        }
    }

    static class l extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setTranslationY(a(f7));
        }
    }

    static class m extends c {
        @Override // o2.c
        public final void h(View view, float f7) {
            view.setTranslationZ(a(f7));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b6, code lost:
    
        if (r4.equals("rotationY") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c g(String str) {
        char c11 = 1;
        if (str.startsWith("CUSTOM")) {
            b bVar = new b();
            bVar.f77616g = new float[1];
            return bVar;
        }
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1249320805:
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                e eVar = new e();
                eVar.f77618g = false;
                return eVar;
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new C1307c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void h(View view, float f7);
}

package C0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2082d0;
import io.agora.rtc2.video.FaceShapeAreaOptions;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: m, reason: collision with root package name */
    public static final int f1032m = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    public final View f1035c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f1036d;

    /* renamed from: e, reason: collision with root package name */
    public int f1037e;

    /* renamed from: f, reason: collision with root package name */
    public int f1038f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1039g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1040h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1041i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1042j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1043k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1044l;

    /* renamed from: a, reason: collision with root package name */
    public final C0028a f1033a = new C0028a();

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f1034b = new AccelerateInterpolator();
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: C0.a$a, reason: collision with other inner class name */
    public static class C0028a {

        /* renamed from: a, reason: collision with root package name */
        public int f1045a;

        /* renamed from: b, reason: collision with root package name */
        public int f1046b;

        /* renamed from: c, reason: collision with root package name */
        public float f1047c;

        /* renamed from: d, reason: collision with root package name */
        public float f1048d;

        /* renamed from: j, reason: collision with root package name */
        public float f1054j;

        /* renamed from: k, reason: collision with root package name */
        public int f1055k;

        /* renamed from: e, reason: collision with root package name */
        public long f1049e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f1053i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f1050f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f1051g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f1052h = 0;

        public void a() {
            if (this.f1050f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f1050f;
            this.f1050f = currentAnimationTimeMillis;
            float f10 = j10 * g10;
            this.f1051g = (int) (this.f1047c * f10);
            this.f1052h = (int) (f10 * this.f1048d);
        }

        public int b() {
            return this.f1051g;
        }

        public int c() {
            return this.f1052h;
        }

        public int d() {
            float f10 = this.f1047c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            if (j10 < this.f1049e) {
                return 0.0f;
            }
            long j11 = this.f1053i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f1045a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f1054j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f1055k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f1048d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f1053i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1053i + ((long) this.f1055k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1055k = a.f((int) (currentAnimationTimeMillis - this.f1049e), 0, this.f1046b);
            this.f1054j = e(currentAnimationTimeMillis);
            this.f1053i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f1046b = i10;
        }

        public void k(int i10) {
            this.f1045a = i10;
        }

        public void l(float f10, float f11) {
            this.f1047c = f10;
            this.f1048d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1049e = currentAnimationTimeMillis;
            this.f1053i = -1L;
            this.f1050f = currentAnimationTimeMillis;
            this.f1054j = 0.5f;
            this.f1051g = 0;
            this.f1052h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1042j) {
                if (aVar.f1040h) {
                    aVar.f1040h = false;
                    aVar.f1033a.m();
                }
                C0028a c0028a = a.this.f1033a;
                if (c0028a.h() || !a.this.u()) {
                    a.this.f1042j = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1041i) {
                    aVar2.f1041i = false;
                    aVar2.c();
                }
                c0028a.a();
                a.this.j(c0028a.b(), c0028a.c());
                AbstractC2082d0.d0(a.this.f1035c, this);
            }
        }
    }

    public a(View view) {
        this.f1035c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1032m);
        r(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
        q(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1035c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.mRelativeEdges[i10], f11, this.mMaximumEdges[i10], f10);
        if (h10 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.mRelativeVelocity[i10];
        float f14 = this.mMinimumVelocity[i10];
        float f15 = this.mMaximumVelocity[i10];
        float f16 = f13 * f12;
        return h10 > 0.0f ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f1037e;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f1042j && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f1034b.getInterpolation(-g10);
        } else {
            if (g10 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1034b.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f1040h) {
            this.f1042j = false;
        } else {
            this.f1033a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f1038f = i10;
        return this;
    }

    public a l(int i10) {
        this.f1037e = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f1043k && !z10) {
            i();
        }
        this.f1043k = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1043k) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            return !this.f1044l && this.f1042j;
        }
        this.f1041i = true;
        this.f1039g = false;
        this.f1033a.l(d(0, motionEvent.getX(), view.getWidth(), this.f1035c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f1035c.getHeight()));
        if (!this.f1042j && u()) {
            v();
        }
        if (this.f1044l) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f1033a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f1033a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0028a c0028a = this.f1033a;
        int f10 = c0028a.f();
        int d10 = c0028a.d();
        if (f10 == 0 || !b(f10)) {
            return d10 != 0 && a(d10);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f1036d == null) {
            this.f1036d = new b();
        }
        this.f1042j = true;
        this.f1040h = true;
        if (this.f1039g || (i10 = this.f1038f) <= 0) {
            this.f1036d.run();
        } else {
            AbstractC2082d0.e0(this.f1035c, this.f1036d, i10);
        }
        this.f1039g = true;
    }
}

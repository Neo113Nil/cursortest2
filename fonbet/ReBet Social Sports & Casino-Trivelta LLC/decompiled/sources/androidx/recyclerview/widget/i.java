package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import io.agora.rtc2.video.FaceShapeAreaOptions;

/* loaded from: classes.dex */
public class i extends RecyclerView.p implements RecyclerView.u {

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView.v f23091A;

    /* renamed from: a, reason: collision with root package name */
    public final int f23092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23093b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f23094c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f23095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23096e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23097f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f23098g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f23099h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23100i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23101j;

    /* renamed from: k, reason: collision with root package name */
    public int f23102k;

    /* renamed from: l, reason: collision with root package name */
    public int f23103l;

    /* renamed from: m, reason: collision with root package name */
    public float f23104m;

    /* renamed from: n, reason: collision with root package name */
    public int f23105n;

    /* renamed from: o, reason: collision with root package name */
    public int f23106o;

    /* renamed from: p, reason: collision with root package name */
    public float f23107p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f23110s;

    /* renamed from: x, reason: collision with root package name */
    public final ValueAnimator f23115x;

    /* renamed from: y, reason: collision with root package name */
    public int f23116y;

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f23117z;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] EMPTY_STATE_SET = new int[0];

    /* renamed from: q, reason: collision with root package name */
    public int f23108q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f23109r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23111t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23112u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f23113v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f23114w = 0;
    private final int[] mVerticalRange = new int[2];
    private final int[] mHorizontalRange = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.m(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
        }
    }

    public class b extends RecyclerView.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            i.this.x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23120a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f23120a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f23120a) {
                this.f23120a = false;
                return;
            }
            if (((Float) i.this.f23115x.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.f23116y = 0;
                iVar.u(0);
            } else {
                i iVar2 = i.this;
                iVar2.f23116y = 2;
                iVar2.r();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f23094c.setAlpha(floatValue);
            i.this.f23095d.setAlpha(floatValue);
            i.this.r();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23115x = ofFloat;
        this.f23116y = 0;
        this.f23117z = new a();
        this.f23091A = new b();
        this.f23094c = stateListDrawable;
        this.f23095d = drawable;
        this.f23098g = stateListDrawable2;
        this.f23099h = drawable2;
        this.f23096e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f23097f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f23100i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f23101j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f23092a = i11;
        this.f23093b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f23113v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean q10 = q(motionEvent.getX(), motionEvent.getY());
            boolean p10 = p(motionEvent.getX(), motionEvent.getY());
            if (q10 || p10) {
                if (p10) {
                    this.f23114w = 1;
                    this.f23107p = (int) motionEvent.getX();
                } else if (q10) {
                    this.f23114w = 2;
                    this.f23104m = (int) motionEvent.getY();
                }
                u(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f23113v == 2) {
            this.f23104m = 0.0f;
            this.f23107p = 0.0f;
            u(1);
            this.f23114w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f23113v == 2) {
            w();
            if (this.f23114w == 1) {
                n(motionEvent.getX());
            }
            if (this.f23114w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f23113v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean q10 = q(motionEvent.getX(), motionEvent.getY());
        boolean p10 = p(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!q10 && !p10)) {
            return false;
        }
        if (p10) {
            this.f23114w = 1;
            this.f23107p = (int) motionEvent.getX();
        } else if (q10) {
            this.f23114w = 2;
            this.f23104m = (int) motionEvent.getY();
        }
        u(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void e(boolean z10) {
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f23110s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f23110s = recyclerView;
        if (recyclerView != null) {
            v();
        }
    }

    public final void g() {
        this.f23110s.removeCallbacks(this.f23117z);
    }

    public final void h() {
        this.f23110s.k1(this);
        this.f23110s.n1(this);
        this.f23110s.o1(this.f23091A);
        g();
    }

    public final void i(Canvas canvas) {
        int i10 = this.f23109r;
        int i11 = this.f23100i;
        int i12 = this.f23106o;
        int i13 = this.f23105n;
        this.f23098g.setBounds(0, 0, i13, i11);
        this.f23099h.setBounds(0, 0, this.f23108q, this.f23101j);
        canvas.translate(0.0f, i10 - i11);
        this.f23099h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f23098g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void j(Canvas canvas) {
        int i10 = this.f23108q;
        int i11 = this.f23096e;
        int i12 = i10 - i11;
        int i13 = this.f23103l;
        int i14 = this.f23102k;
        int i15 = i13 - (i14 / 2);
        this.f23094c.setBounds(0, 0, i11, i14);
        this.f23095d.setBounds(0, 0, this.f23097f, this.f23109r);
        if (!o()) {
            canvas.translate(i12, 0.0f);
            this.f23095d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f23094c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f23095d.draw(canvas);
        canvas.translate(this.f23096e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f23094c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f23096e, -i15);
    }

    public final int[] k() {
        int[] iArr = this.mHorizontalRange;
        int i10 = this.f23093b;
        iArr[0] = i10;
        iArr[1] = this.f23108q - i10;
        return iArr;
    }

    public final int[] l() {
        int[] iArr = this.mVerticalRange;
        int i10 = this.f23093b;
        iArr[0] = i10;
        iArr[1] = this.f23109r - i10;
        return iArr;
    }

    public void m(int i10) {
        int i11 = this.f23116y;
        if (i11 == 1) {
            this.f23115x.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f23116y = 3;
        ValueAnimator valueAnimator = this.f23115x;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f23115x.setDuration(i10);
        this.f23115x.start();
    }

    public final void n(float f10) {
        int[] k10 = k();
        float max = Math.max(k10[0], Math.min(k10[1], f10));
        if (Math.abs(this.f23106o - max) < 2.0f) {
            return;
        }
        int t10 = t(this.f23107p, max, k10, this.f23110s.computeHorizontalScrollRange(), this.f23110s.computeHorizontalScrollOffset(), this.f23108q);
        if (t10 != 0) {
            this.f23110s.scrollBy(t10, 0);
        }
        this.f23107p = max;
    }

    public final boolean o() {
        return this.f23110s.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f23108q != this.f23110s.getWidth() || this.f23109r != this.f23110s.getHeight()) {
            this.f23108q = this.f23110s.getWidth();
            this.f23109r = this.f23110s.getHeight();
            u(0);
        } else if (this.f23116y != 0) {
            if (this.f23111t) {
                j(canvas);
            }
            if (this.f23112u) {
                i(canvas);
            }
        }
    }

    public boolean p(float f10, float f11) {
        if (f11 < this.f23109r - this.f23100i) {
            return false;
        }
        int i10 = this.f23106o;
        int i11 = this.f23105n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean q(float f10, float f11) {
        if (o()) {
            if (f10 > this.f23096e) {
                return false;
            }
        } else if (f10 < this.f23108q - this.f23096e) {
            return false;
        }
        int i10 = this.f23103l;
        int i11 = this.f23102k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    public void r() {
        this.f23110s.invalidate();
    }

    public final void s(int i10) {
        g();
        this.f23110s.postDelayed(this.f23117z, i10);
    }

    public final int t(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void u(int i10) {
        if (i10 == 2 && this.f23113v != 2) {
            this.f23094c.setState(PRESSED_STATE_SET);
            g();
        }
        if (i10 == 0) {
            r();
        } else {
            w();
        }
        if (this.f23113v == 2 && i10 != 2) {
            this.f23094c.setState(EMPTY_STATE_SET);
            s(1200);
        } else if (i10 == 1) {
            s(1500);
        }
        this.f23113v = i10;
    }

    public final void v() {
        this.f23110s.j(this);
        this.f23110s.m(this);
        this.f23110s.n(this.f23091A);
    }

    public void w() {
        int i10 = this.f23116y;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f23115x.cancel();
            }
        }
        this.f23116y = 1;
        ValueAnimator valueAnimator = this.f23115x;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f23115x.setDuration(500L);
        this.f23115x.setStartDelay(0L);
        this.f23115x.start();
    }

    public void x(int i10, int i11) {
        int computeVerticalScrollRange = this.f23110s.computeVerticalScrollRange();
        int i12 = this.f23109r;
        this.f23111t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f23092a;
        int computeHorizontalScrollRange = this.f23110s.computeHorizontalScrollRange();
        int i13 = this.f23108q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f23092a;
        this.f23112u = z10;
        boolean z11 = this.f23111t;
        if (!z11 && !z10) {
            if (this.f23113v != 0) {
                u(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f23103l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f23102k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f23112u) {
            float f11 = i13;
            this.f23106o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f23105n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f23113v;
        if (i14 == 0 || i14 == 1) {
            u(1);
        }
    }

    public final void y(float f10) {
        int[] l10 = l();
        float max = Math.max(l10[0], Math.min(l10[1], f10));
        if (Math.abs(this.f23103l - max) < 2.0f) {
            return;
        }
        int t10 = t(this.f23104m, max, l10, this.f23110s.computeVerticalScrollRange(), this.f23110s.computeVerticalScrollOffset(), this.f23109r);
        if (t10 != 0) {
            this.f23110s.scrollBy(0, t10);
        }
        this.f23104m = max;
    }
}

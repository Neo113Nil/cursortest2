package Df;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2110s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.List;
import y2.AbstractC6848b;

/* loaded from: classes4.dex */
public class c extends RecyclerView.p implements RecyclerView.s {

    /* renamed from: B, reason: collision with root package name */
    public Rect f2675B;

    /* renamed from: C, reason: collision with root package name */
    public long f2676C;

    /* renamed from: a, reason: collision with root package name */
    public int f2677a;

    /* renamed from: d, reason: collision with root package name */
    public float f2680d;

    /* renamed from: e, reason: collision with root package name */
    public float f2681e;

    /* renamed from: f, reason: collision with root package name */
    public float f2682f;

    /* renamed from: g, reason: collision with root package name */
    public float f2683g;

    /* renamed from: h, reason: collision with root package name */
    public float f2684h;

    /* renamed from: i, reason: collision with root package name */
    public float f2685i;

    /* renamed from: j, reason: collision with root package name */
    public float f2686j;

    /* renamed from: k, reason: collision with root package name */
    public float f2687k;

    /* renamed from: m, reason: collision with root package name */
    public e f2689m;

    /* renamed from: o, reason: collision with root package name */
    public int f2691o;

    /* renamed from: q, reason: collision with root package name */
    public int f2693q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2694r;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f2696t;

    /* renamed from: u, reason: collision with root package name */
    public List f2697u;

    /* renamed from: v, reason: collision with root package name */
    public List f2698v;

    /* renamed from: z, reason: collision with root package name */
    public C2110s f2702z;

    /* renamed from: b, reason: collision with root package name */
    public final List f2678b = new ArrayList();
    private final float[] mTmpPosition = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.F f2679c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f2688l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f2690n = 0;

    /* renamed from: p, reason: collision with root package name */
    public List f2692p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f2695s = new a();

    /* renamed from: w, reason: collision with root package name */
    public RecyclerView.l f2699w = null;

    /* renamed from: x, reason: collision with root package name */
    public View f2700x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f2701y = -1;

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView.u f2674A = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            if (cVar.f2679c == null || !cVar.v()) {
                return;
            }
            c cVar2 = c.this;
            RecyclerView.F f10 = cVar2.f2679c;
            if (f10 != null) {
                cVar2.r(f10);
            }
            c cVar3 = c.this;
            cVar3.f2694r.removeCallbacks(cVar3.f2695s);
            AbstractC2082d0.d0(c.this.f2694r, this);
        }
    }

    public class b implements RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            c.this.f2702z.a(motionEvent);
            VelocityTracker velocityTracker = c.this.f2696t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c.this.f2688l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                c.this.f2677a = actionMasked;
            }
            int findPointerIndex = motionEvent.findPointerIndex(c.this.f2688l);
            if (findPointerIndex >= 0) {
                c.this.h(actionMasked, motionEvent, findPointerIndex);
            }
            c cVar = c.this;
            RecyclerView.F f10 = cVar.f2679c;
            if (f10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        cVar.y(motionEvent, cVar.f2691o, findPointerIndex);
                        c.this.r(f10);
                        c cVar2 = c.this;
                        cVar2.f2694r.removeCallbacks(cVar2.f2695s);
                        c.this.f2695s.run();
                        c.this.f2694r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    c cVar3 = c.this;
                    if (pointerId == cVar3.f2688l) {
                        cVar3.f2688l = motionEvent.getPointerId(actionIndex != 0 ? 0 : 1);
                        c cVar4 = c.this;
                        cVar4.y(motionEvent, cVar4.f2691o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = cVar.f2696t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            c.this.w(null, 0);
            c.this.f2688l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g k10;
            c.this.f2702z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                c.this.f2677a = actionMasked;
            }
            if (actionMasked == 0) {
                c.this.f2688l = motionEvent.getPointerId(0);
                c.this.f2680d = motionEvent.getX();
                c.this.f2681e = motionEvent.getY();
                c.this.s();
                c cVar = c.this;
                if (cVar.f2679c == null && (k10 = cVar.k(motionEvent)) != null) {
                    c cVar2 = c.this;
                    cVar2.f2680d -= k10.f2723j;
                    cVar2.f2681e -= k10.f2724k;
                    cVar2.j(k10.f2718e, true);
                    if (c.this.f2678b.remove(k10.f2718e.itemView)) {
                        c cVar3 = c.this;
                        cVar3.f2689m.c(cVar3.f2694r, k10.f2718e);
                    }
                    c.this.w(k10.f2718e, k10.f2719f);
                    c cVar4 = c.this;
                    cVar4.y(motionEvent, cVar4.f2691o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                c cVar5 = c.this;
                cVar5.f2688l = -1;
                cVar5.w(null, 0);
            } else {
                int i10 = c.this.f2688l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    c.this.h(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = c.this.f2696t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return c.this.f2679c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void e(boolean z10) {
            if (z10) {
                c.this.w(null, 0);
            }
        }
    }

    /* renamed from: Df.c$c, reason: collision with other inner class name */
    public class C0056c extends g {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.F f2705o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0056c(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14, RecyclerView.F f15) {
            super(f10, i10, i11, f11, f12, f13, f14);
            this.f2705o = f15;
        }

        @Override // Df.c.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f2725l) {
                return;
            }
            c cVar = c.this;
            cVar.f2689m.c(cVar.f2694r, this.f2705o);
            c cVar2 = c.this;
            View view = cVar2.f2700x;
            View view2 = this.f2705o.itemView;
            if (view == view2) {
                cVar2.u(view2);
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f2707a;

        public d(g gVar) {
            this.f2707a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2707a.d();
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public int f2712a = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final Interpolator f2710c = new a();

        /* renamed from: d, reason: collision with root package name */
        public static final Interpolator f2711d = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final l f2709b = new Df.a();

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int o(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int p(int i10, int i11) {
            return o(2, i10) | o(1, i11) | o(0, i11 | i10);
        }

        public boolean a(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11) {
            return true;
        }

        public RecyclerView.F b(RecyclerView.F f10, List list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = f10.itemView.getWidth() + i10;
            int height = i11 + f10.itemView.getHeight();
            int left2 = i10 - f10.itemView.getLeft();
            int top2 = i11 - f10.itemView.getTop();
            int size = list.size();
            RecyclerView.F f11 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.F f12 = (RecyclerView.F) list.get(i13);
                if (left2 > 0 && (right = f12.itemView.getRight() - width) < 0 && f12.itemView.getRight() > f10.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                    f11 = f12;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = f12.itemView.getLeft() - i10) > 0 && f12.itemView.getLeft() < f10.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    f11 = f12;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = f12.itemView.getTop() - i11) > 0 && f12.itemView.getTop() < f10.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                    f11 = f12;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = f12.itemView.getBottom() - height) < 0 && f12.itemView.getBottom() > f10.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    f11 = f12;
                    i12 = abs;
                }
            }
            return f11;
        }

        public abstract void c(RecyclerView recyclerView, RecyclerView.F f10);

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public final int e(RecyclerView recyclerView, RecyclerView.F f10) {
            return d(j(recyclerView, f10), AbstractC2082d0.z(recyclerView));
        }

        public long f(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int g() {
            return 0;
        }

        public final int h(RecyclerView recyclerView) {
            if (this.f2712a == -1) {
                this.f2712a = recyclerView.getResources().getDimensionPixelSize(AbstractC6848b.f68253d);
            }
            return this.f2712a;
        }

        public float i(RecyclerView.F f10) {
            return 0.5f;
        }

        public abstract int j(RecyclerView recyclerView, RecyclerView.F f10);

        public boolean k(RecyclerView recyclerView, RecyclerView.F f10) {
            return (e(recyclerView, f10) & 16711680) != 0;
        }

        public int l(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int signum = (int) (((int) (((int) Math.signum(i11)) * h(recyclerView) * f2711d.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * f2710c.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f));
            return signum == 0 ? i11 > 0 ? 1 : -1 : signum;
        }

        public boolean m() {
            return true;
        }

        public boolean n() {
            return true;
        }

        public void q(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
            f2709b.c(canvas, recyclerView, view, f10, f11, i10, z10);
        }

        public abstract void r(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, float f11, float f12, int i10, boolean z10);

        public void s(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
            f2709b.d(canvas, recyclerView, f10.itemView, f11, f12, i10, z10);
        }

        public void t(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List list, int i10, float f11, float f12) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) list.get(i11);
                gVar.e();
                int save = canvas.save();
                r(canvas, recyclerView, gVar.f2718e, gVar.f2723j, gVar.f2724k, gVar.f2719f, false);
                canvas.restoreToCount(save);
            }
            if (f10 != null) {
                int save2 = canvas.save();
                r(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List list, int i10, float f11, float f12) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) list.get(i11);
                int save = canvas.save();
                s(canvas, recyclerView, gVar.f2718e, gVar.f2723j, gVar.f2724k, gVar.f2719f, false);
                canvas.restoreToCount(save);
            }
            if (f10 != null) {
                int save2 = canvas.save();
                s(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = (g) list.get(i12);
                boolean z11 = gVar2.f2726m;
                if (z11 && !gVar2.f2722i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean v(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11);

        public void w(RecyclerView recyclerView, RecyclerView.F f10, int i10, RecyclerView.F f11, int i11, int i12, int i13) {
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            if (layoutManager.A()) {
                if (layoutManager.g0(f11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.x1(i11);
                }
                if (layoutManager.j0(f11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.x1(i11);
                }
            }
            if (layoutManager.B()) {
                if (layoutManager.k0(f11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.x1(i11);
                }
                if (layoutManager.e0(f11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.x1(i11);
                }
            }
        }

        public void x(RecyclerView.F f10, int i10) {
            if (f10 != null) {
                f2709b.b(f10.itemView);
            }
        }
    }

    public class f extends GestureDetector.SimpleOnGestureListener {
        public f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View l10;
            RecyclerView.F o02;
            c cVar = c.this;
            if (cVar.f2694r == null || (l10 = cVar.l(motionEvent)) == null || (o02 = c.this.f2694r.o0(l10)) == null) {
                return;
            }
            c cVar2 = c.this;
            if (cVar2.f2689m.k(cVar2.f2694r, o02)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = c.this.f2688l;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    c cVar3 = c.this;
                    cVar3.f2680d = x10;
                    cVar3.f2681e = y10;
                    cVar3.f2685i = 0.0f;
                    cVar3.f2684h = 0.0f;
                    if (cVar3.f2689m.n()) {
                        c.this.w(o02, 2);
                    }
                }
            }
        }
    }

    public static abstract class h extends e {

        /* renamed from: e, reason: collision with root package name */
        public int f2729e;

        /* renamed from: f, reason: collision with root package name */
        public int f2730f;

        public h(int i10, int i11) {
            this.f2729e = i11;
            this.f2730f = i10;
        }

        @Override // Df.c.e
        public int j(RecyclerView recyclerView, RecyclerView.F f10) {
            return e.p(y(recyclerView, f10), z(recyclerView, f10));
        }

        public int y(RecyclerView recyclerView, RecyclerView.F f10) {
            return this.f2730f;
        }

        public int z(RecyclerView recyclerView, RecyclerView.F f10) {
            return this.f2729e;
        }
    }

    public c(e eVar) {
        this.f2677a = -1;
        this.f2677a = -1;
        this.f2689m = eVar;
    }

    private void i() {
        this.f2694r.k1(this);
        this.f2694r.n1(this.f2674A);
        this.f2694r.m1(this);
        for (int size = this.f2692p.size() - 1; size >= 0; size--) {
            this.f2689m.c(this.f2694r, ((g) this.f2692p.get(0)).f2718e);
        }
        this.f2692p.clear();
        this.f2700x = null;
        this.f2701y = -1;
        t();
    }

    private List m(RecyclerView.F f10) {
        RecyclerView.F f11 = f10;
        List list = this.f2697u;
        if (list == null) {
            this.f2697u = new ArrayList();
            this.f2698v = new ArrayList();
        } else {
            list.clear();
            this.f2698v.clear();
        }
        int g10 = this.f2689m.g();
        int round = Math.round(this.f2686j + this.f2684h) - g10;
        int round2 = Math.round(this.f2687k + this.f2685i) - g10;
        int i10 = g10 * 2;
        int width = f11.itemView.getWidth() + round + i10;
        int height = f11.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.q layoutManager = this.f2694r.getLayoutManager();
        int Z10 = layoutManager.Z();
        int i13 = 0;
        while (i13 < Z10) {
            View Y10 = layoutManager.Y(i13);
            if (Y10 != f11.itemView && Y10.getBottom() >= round2 && Y10.getTop() <= height && Y10.getRight() >= round && Y10.getLeft() <= width) {
                RecyclerView.F o02 = this.f2694r.o0(Y10);
                if (this.f2689m.a(this.f2694r, this.f2679c, o02)) {
                    int abs = Math.abs(i11 - ((Y10.getLeft() + Y10.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((Y10.getTop() + Y10.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f2697u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > ((Integer) this.f2698v.get(i16)).intValue(); i16++) {
                        i15++;
                    }
                    this.f2697u.add(i15, o02);
                    this.f2698v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            f11 = f10;
        }
        return this.f2697u;
    }

    private RecyclerView.F n(MotionEvent motionEvent) {
        View l10;
        RecyclerView.q layoutManager = this.f2694r.getLayoutManager();
        int i10 = this.f2688l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(findPointerIndex) - this.f2680d;
        float y10 = motionEvent.getY(findPointerIndex) - this.f2681e;
        float abs = Math.abs(x10);
        float abs2 = Math.abs(y10);
        int i11 = this.f2693q;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.A()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.B()) && (l10 = l(motionEvent)) != null) {
            return this.f2694r.o0(l10);
        }
        return null;
    }

    private void o(float[] fArr) {
        if ((this.f2691o & 12) != 0) {
            fArr[0] = (this.f2686j + this.f2684h) - this.f2679c.itemView.getLeft();
        } else {
            fArr[0] = this.f2679c.itemView.getTranslationX();
        }
        if ((this.f2691o & 3) != 0) {
            fArr[1] = (this.f2687k + this.f2685i) - this.f2679c.itemView.getTop();
        } else {
            fArr[1] = this.f2679c.itemView.getTranslationY();
        }
    }

    private static boolean p(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void t() {
        VelocityTracker velocityTracker = this.f2696t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2696t = null;
        }
    }

    private void x() {
        this.f2693q = ViewConfiguration.get(this.f2694r.getContext()).getScaledTouchSlop();
        this.f2694r.j(this);
        this.f2694r.m(this.f2674A);
        this.f2694r.l(this);
        q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(View view) {
        u(view);
        RecyclerView.F o02 = this.f2694r.o0(view);
        if (o02 == null) {
            return;
        }
        RecyclerView.F f10 = this.f2679c;
        if (f10 != null && o02 == f10) {
            w(null, 0);
            return;
        }
        j(o02, false);
        if (this.f2678b.remove(o02.itemView)) {
            this.f2689m.c(this.f2694r, o02);
        }
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2694r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            i();
        }
        this.f2694r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f2682f = resources.getDimension(AbstractC6848b.f68255f);
            this.f2683g = resources.getDimension(AbstractC6848b.f68254e);
            x();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        rect.setEmpty();
    }

    public boolean h(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.F n10;
        int e10;
        if (this.f2679c != null || i10 != 2 || this.f2690n == 2 || !this.f2689m.m() || this.f2694r.getScrollState() == 1 || (n10 = n(motionEvent)) == null || (e10 = (this.f2689m.e(this.f2694r, n10) & 65280) >> 8) == 0) {
            return false;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f2680d;
        float f11 = y10 - this.f2681e;
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        int i12 = this.f2693q;
        if (abs < i12 && abs2 < i12) {
            return false;
        }
        if (abs > abs2) {
            if (f10 < 0.0f && (e10 & 4) == 0) {
                return false;
            }
            if (f10 > 0.0f && (e10 & 8) == 0) {
                return false;
            }
        } else {
            if (f11 < 0.0f && (e10 & 1) == 0) {
                return false;
            }
            if (f11 > 0.0f && (e10 & 2) == 0) {
                return false;
            }
        }
        this.f2685i = 0.0f;
        this.f2684h = 0.0f;
        this.f2688l = motionEvent.getPointerId(0);
        w(n10, 1);
        return true;
    }

    public int j(RecyclerView.F f10, boolean z10) {
        for (int size = this.f2692p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f2692p.get(size);
            if (gVar.f2718e == f10) {
                gVar.f2725l |= z10;
                if (!gVar.f2726m) {
                    gVar.a();
                }
                this.f2692p.remove(size);
                return gVar.f2721h;
            }
        }
        return 0;
    }

    public g k(MotionEvent motionEvent) {
        if (this.f2692p.isEmpty()) {
            return null;
        }
        View l10 = l(motionEvent);
        for (int size = this.f2692p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f2692p.get(size);
            if (gVar.f2718e.itemView == l10) {
                return gVar;
            }
        }
        return null;
    }

    public View l(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.F f10 = this.f2679c;
        if (f10 != null) {
            View view = f10.itemView;
            if (p(view, x10, y10, this.f2686j + this.f2684h, this.f2687k + this.f2685i)) {
                return view;
            }
        }
        for (int size = this.f2692p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f2692p.get(size);
            View view2 = gVar.f2718e.itemView;
            if (p(view2, x10, y10, gVar.f2723j, gVar.f2724k)) {
                return view2;
            }
        }
        return this.f2694r.X(x10, y10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        this.f2701y = -1;
        if (this.f2679c != null) {
            o(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f2689m.t(canvas, recyclerView, this.f2679c, this.f2692p, this.f2690n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        if (this.f2679c != null) {
            o(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f2689m.u(canvas, recyclerView, this.f2679c, this.f2692p, this.f2690n, f10, f11);
    }

    public final void q() {
        if (this.f2702z != null) {
            return;
        }
        this.f2702z = new C2110s(this.f2694r.getContext(), new f());
    }

    public void r(RecyclerView.F f10) {
        if (!this.f2694r.isLayoutRequested() && this.f2690n == 2) {
            float i10 = this.f2689m.i(f10);
            int i11 = (int) (this.f2686j + this.f2684h);
            int i12 = (int) (this.f2687k + this.f2685i);
            if (Math.abs(i12 - f10.itemView.getTop()) >= f10.itemView.getHeight() * i10 || Math.abs(i11 - f10.itemView.getLeft()) >= f10.itemView.getWidth() * i10) {
                List m10 = m(f10);
                if (m10.size() == 0) {
                    return;
                }
                RecyclerView.F b10 = this.f2689m.b(f10, m10, i11, i12);
                if (b10 == null) {
                    this.f2697u.clear();
                    this.f2698v.clear();
                    return;
                }
                int adapterPosition = b10.getAdapterPosition();
                int adapterPosition2 = f10.getAdapterPosition();
                if (this.f2689m.v(this.f2694r, f10, b10)) {
                    this.f2689m.w(this.f2694r, f10, adapterPosition2, b10, adapterPosition, i11, i12);
                }
            }
        }
    }

    public void s() {
        VelocityTracker velocityTracker = this.f2696t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f2696t = VelocityTracker.obtain();
    }

    public void u(View view) {
        if (view == this.f2700x) {
            this.f2700x = null;
            if (this.f2699w != null) {
                this.f2694r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r6 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v() {
        int i10;
        int i11;
        int i12;
        if (this.f2679c == null) {
            this.f2676C = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f2676C;
        long j11 = j10 == Long.MIN_VALUE ? 0L : currentTimeMillis - j10;
        RecyclerView.q layoutManager = this.f2694r.getLayoutManager();
        if (this.f2675B == null) {
            this.f2675B = new Rect();
        }
        layoutManager.z(this.f2679c.itemView, this.f2675B);
        if (layoutManager.A()) {
            int i13 = (int) (this.f2686j + this.f2684h);
            int paddingLeft = (i13 - this.f2675B.left) - this.f2694r.getPaddingLeft();
            float f10 = this.f2684h;
            if ((f10 < 0.0f && paddingLeft < 0) || (f10 > 0.0f && (paddingLeft = ((i13 + this.f2679c.itemView.getWidth()) + this.f2675B.right) - (this.f2694r.getWidth() - this.f2694r.getPaddingRight())) > 0)) {
                i10 = paddingLeft;
                if (layoutManager.B()) {
                    int i14 = (int) (this.f2687k + this.f2685i);
                    i11 = (i14 - this.f2675B.top) - this.f2694r.getPaddingTop();
                    float f11 = this.f2685i;
                    if (f11 < 0.0f) {
                    }
                    if (f11 > 0.0f) {
                        i11 = ((i14 + this.f2679c.itemView.getHeight()) + this.f2675B.bottom) - (this.f2694r.getHeight() - this.f2694r.getPaddingBottom());
                    }
                }
                i11 = 0;
                if (i10 != 0) {
                    i10 = this.f2689m.l(this.f2694r, this.f2679c.itemView.getWidth(), i10, this.f2694r.getWidth(), j11);
                }
                i12 = i10;
                if (i11 == 0) {
                    i11 = this.f2689m.l(this.f2694r, this.f2679c.itemView.getHeight(), i11, this.f2694r.getHeight(), j11);
                }
                if (i12 != 0 && i11 == 0) {
                    this.f2676C = Long.MIN_VALUE;
                    return false;
                }
                if (this.f2676C == Long.MIN_VALUE) {
                    this.f2676C = currentTimeMillis;
                }
                this.f2694r.scrollBy(i12, i11);
                return true;
            }
        }
        i10 = 0;
        if (layoutManager.B()) {
        }
        i11 = 0;
        if (i10 != 0) {
        }
        i12 = i10;
        if (i11 == 0) {
        }
        if (i12 != 0) {
        }
        if (this.f2676C == Long.MIN_VALUE) {
        }
        this.f2694r.scrollBy(i12, i11);
        return true;
    }

    public void w(RecyclerView.F f10, int i10) {
        boolean z10;
        if (f10 == this.f2679c && i10 == this.f2690n) {
            return;
        }
        this.f2676C = Long.MIN_VALUE;
        int i11 = this.f2690n;
        j(f10, true);
        this.f2690n = i10;
        if (i10 == 2) {
            this.f2700x = f10.itemView;
            f();
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.F f11 = this.f2679c;
        boolean z11 = false;
        if (f11 != null) {
            if (f11.itemView.getParent() != null) {
                t();
                int i13 = i11 == 2 ? 8 : 4;
                o(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f12 = fArr[0];
                float f13 = fArr[1];
                z10 = false;
                C0056c c0056c = new C0056c(f11, i13, i11, f12, f13, 0.0f, 0.0f, f11);
                c0056c.b(this.f2689m.f(this.f2694r, i13, 0.0f - f12, 0.0f - f13));
                this.f2692p.add(c0056c);
                new Handler(Looper.getMainLooper()).post(new d(c0056c));
                z11 = true;
            } else {
                z10 = false;
                u(f11.itemView);
                this.f2689m.c(this.f2694r, f11);
                z11 = false;
            }
            this.f2679c = null;
        } else {
            z10 = false;
        }
        if (f10 != null) {
            this.f2691o = (this.f2689m.e(this.f2694r, f10) & i12) >> (this.f2690n * 8);
            this.f2686j = f10.itemView.getLeft();
            this.f2687k = f10.itemView.getTop();
            this.f2679c = f10;
            if (i10 == 2) {
                f10.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f2694r.getParent();
        if (parent != null) {
            if (this.f2679c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f2694r.getLayoutManager().I1();
        }
        this.f2689m.x(this.f2679c, this.f2690n);
        this.f2694r.invalidate();
    }

    public void y(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f2680d;
        this.f2684h = f10;
        this.f2685i = y10 - this.f2681e;
        if ((i10 & 4) == 0) {
            this.f2684h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f2684h = Math.min(0.0f, this.f2684h);
        }
        if ((i10 & 1) == 0) {
            this.f2685i = Math.max(0.0f, this.f2685i);
        }
        if ((i10 & 2) == 0) {
            this.f2685i = Math.min(0.0f, this.f2685i);
        }
    }

    private void f() {
    }

    public static class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f2714a;

        /* renamed from: b, reason: collision with root package name */
        public final float f2715b;

        /* renamed from: c, reason: collision with root package name */
        public final float f2716c;

        /* renamed from: d, reason: collision with root package name */
        public final float f2717d;

        /* renamed from: e, reason: collision with root package name */
        public final RecyclerView.F f2718e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2719f;

        /* renamed from: g, reason: collision with root package name */
        public final ValueAnimator f2720g;

        /* renamed from: h, reason: collision with root package name */
        public final int f2721h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2722i;

        /* renamed from: j, reason: collision with root package name */
        public float f2723j;

        /* renamed from: k, reason: collision with root package name */
        public float f2724k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2725l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2726m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f2727n;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14) {
            this.f2719f = i11;
            this.f2721h = i10;
            this.f2718e = f10;
            this.f2714a = f11;
            this.f2715b = f12;
            this.f2716c = f13;
            this.f2717d = f14;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2720g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f10.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f2720g.cancel();
        }

        public void b(long j10) {
            this.f2720g.setDuration(j10);
        }

        public void c(float f10) {
            this.f2727n = f10;
        }

        public void d() {
            this.f2718e.setIsRecyclable(false);
            this.f2720g.start();
        }

        public void e() {
            float f10 = this.f2714a;
            float f11 = this.f2716c;
            if (f10 == f11) {
                this.f2723j = this.f2718e.itemView.getTranslationX();
            } else {
                this.f2723j = f10 + (this.f2727n * (f11 - f10));
            }
            float f12 = this.f2715b;
            float f13 = this.f2717d;
            if (f12 == f13) {
                this.f2724k = this.f2718e.itemView.getTranslationY();
            } else {
                this.f2724k = f12 + (this.f2727n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2726m) {
                this.f2718e.setIsRecyclable(true);
            }
            this.f2726m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void d(View view) {
    }
}

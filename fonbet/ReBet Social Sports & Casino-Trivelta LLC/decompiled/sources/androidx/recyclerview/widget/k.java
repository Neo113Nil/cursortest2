package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import y2.AbstractC6848b;

/* loaded from: classes.dex */
public class k extends RecyclerView.p implements RecyclerView.s {

    /* renamed from: B, reason: collision with root package name */
    public Rect f23138B;

    /* renamed from: C, reason: collision with root package name */
    public long f23139C;

    /* renamed from: c, reason: collision with root package name */
    public float f23142c;

    /* renamed from: d, reason: collision with root package name */
    public float f23143d;

    /* renamed from: e, reason: collision with root package name */
    public float f23144e;

    /* renamed from: f, reason: collision with root package name */
    public float f23145f;

    /* renamed from: g, reason: collision with root package name */
    public float f23146g;

    /* renamed from: h, reason: collision with root package name */
    public float f23147h;

    /* renamed from: i, reason: collision with root package name */
    public float f23148i;

    /* renamed from: j, reason: collision with root package name */
    public float f23149j;

    /* renamed from: l, reason: collision with root package name */
    public e f23151l;

    /* renamed from: n, reason: collision with root package name */
    public int f23153n;

    /* renamed from: p, reason: collision with root package name */
    public int f23155p;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f23156q;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f23158s;

    /* renamed from: t, reason: collision with root package name */
    public List f23159t;

    /* renamed from: u, reason: collision with root package name */
    public List f23160u;

    /* renamed from: y, reason: collision with root package name */
    public GestureDetector f23164y;

    /* renamed from: z, reason: collision with root package name */
    public f f23165z;

    /* renamed from: a, reason: collision with root package name */
    public final List f23140a = new ArrayList();
    private final float[] mTmpPosition = new float[2];

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView.F f23141b = null;

    /* renamed from: k, reason: collision with root package name */
    public int f23150k = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f23152m = 0;

    /* renamed from: o, reason: collision with root package name */
    public List f23154o = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f23157r = new a();

    /* renamed from: v, reason: collision with root package name */
    public RecyclerView.l f23161v = null;

    /* renamed from: w, reason: collision with root package name */
    public View f23162w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f23163x = -1;

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView.u f23137A = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            if (kVar.f23141b == null || !kVar.y()) {
                return;
            }
            k kVar2 = k.this;
            RecyclerView.F f10 = kVar2.f23141b;
            if (f10 != null) {
                kVar2.t(f10);
            }
            k kVar3 = k.this;
            kVar3.f23156q.removeCallbacks(kVar3.f23157r);
            AbstractC2082d0.d0(k.this.f23156q, this);
        }
    }

    public class b implements RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            k.this.f23164y.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = k.this.f23158s;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (k.this.f23150k == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(k.this.f23150k);
            if (findPointerIndex >= 0) {
                k.this.i(actionMasked, motionEvent, findPointerIndex);
            }
            k kVar = k.this;
            RecyclerView.F f10 = kVar.f23141b;
            if (f10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        kVar.E(motionEvent, kVar.f23153n, findPointerIndex);
                        k.this.t(f10);
                        k kVar2 = k.this;
                        kVar2.f23156q.removeCallbacks(kVar2.f23157r);
                        k.this.f23157r.run();
                        k.this.f23156q.invalidate();
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
                    k kVar3 = k.this;
                    if (pointerId == kVar3.f23150k) {
                        kVar3.f23150k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        k kVar4 = k.this;
                        kVar4.E(motionEvent, kVar4.f23153n, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = kVar.f23158s;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            k.this.z(null, 0);
            k.this.f23150k = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g m10;
            k.this.f23164y.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                k.this.f23150k = motionEvent.getPointerId(0);
                k.this.f23142c = motionEvent.getX();
                k.this.f23143d = motionEvent.getY();
                k.this.u();
                k kVar = k.this;
                if (kVar.f23141b == null && (m10 = kVar.m(motionEvent)) != null) {
                    k kVar2 = k.this;
                    kVar2.f23142c -= m10.f23185j;
                    kVar2.f23143d -= m10.f23186k;
                    kVar2.l(m10.f23180e, true);
                    if (k.this.f23140a.remove(m10.f23180e.itemView)) {
                        k kVar3 = k.this;
                        kVar3.f23151l.clearView(kVar3.f23156q, m10.f23180e);
                    }
                    k.this.z(m10.f23180e, m10.f23181f);
                    k kVar4 = k.this;
                    kVar4.E(motionEvent, kVar4.f23153n, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                k kVar5 = k.this;
                kVar5.f23150k = -1;
                kVar5.z(null, 0);
            } else {
                int i10 = k.this.f23150k;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    k.this.i(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = k.this.f23158s;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return k.this.f23141b != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void e(boolean z10) {
            if (z10) {
                k.this.z(null, 0);
            }
        }
    }

    public class c extends g {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f23168o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.F f23169p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14, int i12, RecyclerView.F f15) {
            super(f10, i10, i11, f11, f12, f13, f14);
            this.f23168o = i12;
            this.f23169p = f15;
        }

        @Override // androidx.recyclerview.widget.k.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f23187l) {
                return;
            }
            if (this.f23168o <= 0) {
                k kVar = k.this;
                kVar.f23151l.clearView(kVar.f23156q, this.f23169p);
            } else {
                k.this.f23140a.add(this.f23169p.itemView);
                this.f23184i = true;
                int i10 = this.f23168o;
                if (i10 > 0) {
                    k.this.v(this, i10);
                }
            }
            k kVar2 = k.this;
            View view = kVar2.f23162w;
            View view2 = this.f23169p.itemView;
            if (view == view2) {
                kVar2.x(view2);
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f23171a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23172b;

        public d(g gVar, int i10) {
            this.f23171a = gVar;
            this.f23172b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = k.this.f23156q;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f23171a;
            if (gVar.f23187l || gVar.f23180e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.n itemAnimator = k.this.f23156q.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !k.this.r()) {
                k.this.f23151l.onSwiped(this.f23171a.f23180e, this.f23172b);
            } else {
                k.this.f23156q.post(this);
            }
        }
    }

    public static abstract class e {
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

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

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public final int a(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(AbstractC6848b.f68253d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.F f10, @NonNull RecyclerView.F f11) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.F chooseDropTarget(@NonNull RecyclerView.F f10, @NonNull List<RecyclerView.F> list, int i10, int i11) {
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
                RecyclerView.F f12 = list.get(i13);
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

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.F f10) {
            m.f23191a.a(f10.itemView);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
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

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.F f10) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, f10), recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.F f10) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.F f10);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeThreshold(@NonNull RecyclerView.F f10) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.F f10) {
            return (getAbsoluteMovementFlags(recyclerView, f10) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int signum = (int) (((int) (((int) Math.signum(i11)) * a(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * sDragScrollInterpolator.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f));
            return signum == 0 ? i11 > 0 ? 1 : -1 : signum;
        }

        public abstract boolean isItemViewSwipeEnabled();

        public abstract boolean isLongPressDragEnabled();

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
            m.f23191a.c(canvas, recyclerView, f10.itemView, f11, f12, i10, z10);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
            m.f23191a.d(canvas, recyclerView, f10.itemView, f11, f12, i10, z10);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List<g> list, int i10, float f11, float f12) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.f23180e, gVar.f23185j, gVar.f23186k, gVar.f23181f, false);
                canvas.restoreToCount(save);
            }
            if (f10 != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List<g> list, int i10, float f11, float f12) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.f23180e, gVar.f23185j, gVar.f23186k, gVar.f23181f, false);
                canvas.restoreToCount(save);
            }
            if (f10 != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                boolean z11 = gVar2.f23188m;
                if (z11 && !gVar2.f23184i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.F f10, int i10, @NonNull RecyclerView.F f11, int i11, int i12, int i13) {
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).f(f10.itemView, f11.itemView, i12, i13);
                return;
            }
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

        public void onSelectedChanged(RecyclerView.F f10, int i10) {
            if (f10 != null) {
                m.f23191a.b(f10.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.F f10, int i10);
    }

    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23174a = true;

        public f() {
        }

        public void a() {
            this.f23174a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View n10;
            RecyclerView.F o02;
            if (!this.f23174a || (n10 = k.this.n(motionEvent)) == null || (o02 = k.this.f23156q.o0(n10)) == null) {
                return;
            }
            k kVar = k.this;
            if (kVar.f23151l.hasDragFlag(kVar.f23156q, o02)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = k.this.f23150k;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    k kVar2 = k.this;
                    kVar2.f23142c = x10;
                    kVar2.f23143d = y10;
                    kVar2.f23147h = 0.0f;
                    kVar2.f23146g = 0.0f;
                    if (kVar2.f23151l.isLongPressDragEnabled()) {
                        k.this.z(o02, 2);
                    }
                }
            }
        }
    }

    public static class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f23176a;

        /* renamed from: b, reason: collision with root package name */
        public final float f23177b;

        /* renamed from: c, reason: collision with root package name */
        public final float f23178c;

        /* renamed from: d, reason: collision with root package name */
        public final float f23179d;

        /* renamed from: e, reason: collision with root package name */
        public final RecyclerView.F f23180e;

        /* renamed from: f, reason: collision with root package name */
        public final int f23181f;

        /* renamed from: g, reason: collision with root package name */
        public final ValueAnimator f23182g;

        /* renamed from: h, reason: collision with root package name */
        public final int f23183h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f23184i;

        /* renamed from: j, reason: collision with root package name */
        public float f23185j;

        /* renamed from: k, reason: collision with root package name */
        public float f23186k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f23187l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f23188m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f23189n;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14) {
            this.f23181f = i11;
            this.f23183h = i10;
            this.f23180e = f10;
            this.f23176a = f11;
            this.f23177b = f12;
            this.f23178c = f13;
            this.f23179d = f14;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f23182g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f10.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f23182g.cancel();
        }

        public void b(long j10) {
            this.f23182g.setDuration(j10);
        }

        public void c(float f10) {
            this.f23189n = f10;
        }

        public void d() {
            this.f23180e.setIsRecyclable(false);
            this.f23182g.start();
        }

        public void e() {
            float f10 = this.f23176a;
            float f11 = this.f23178c;
            if (f10 == f11) {
                this.f23185j = this.f23180e.itemView.getTranslationX();
            } else {
                this.f23185j = f10 + (this.f23189n * (f11 - f10));
            }
            float f12 = this.f23177b;
            float f13 = this.f23179d;
            if (f12 == f13) {
                this.f23186k = this.f23180e.itemView.getTranslationY();
            } else {
                this.f23186k = f12 + (this.f23189n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f23188m) {
                this.f23180e.setIsRecyclable(true);
            }
            this.f23188m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface h {
        void f(View view, View view2, int i10, int i11);
    }

    public k(e eVar) {
        this.f23151l = eVar;
    }

    private void A() {
        this.f23155p = ViewConfiguration.get(this.f23156q.getContext()).getScaledTouchSlop();
        this.f23156q.j(this);
        this.f23156q.m(this.f23137A);
        this.f23156q.l(this);
        B();
    }

    private void k() {
        this.f23156q.k1(this);
        this.f23156q.n1(this.f23137A);
        this.f23156q.m1(this);
        for (int size = this.f23154o.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f23154o.get(0);
            gVar.a();
            this.f23151l.clearView(this.f23156q, gVar.f23180e);
        }
        this.f23154o.clear();
        this.f23162w = null;
        this.f23163x = -1;
        w();
        C();
    }

    public static boolean s(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public final void B() {
        this.f23165z = new f();
        this.f23164y = new GestureDetector(this.f23156q.getContext(), this.f23165z);
    }

    public final void C() {
        f fVar = this.f23165z;
        if (fVar != null) {
            fVar.a();
            this.f23165z = null;
        }
        if (this.f23164y != null) {
            this.f23164y = null;
        }
    }

    public final int D(RecyclerView.F f10) {
        if (this.f23152m == 2) {
            return 0;
        }
        int movementFlags = this.f23151l.getMovementFlags(this.f23156q, f10);
        int convertToAbsoluteDirection = (this.f23151l.convertToAbsoluteDirection(movementFlags, this.f23156q.getLayoutDirection()) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i10 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f23146g) > Math.abs(this.f23147h)) {
            int h10 = h(f10, convertToAbsoluteDirection);
            if (h10 > 0) {
                return (i10 & h10) == 0 ? e.convertToRelativeDirection(h10, this.f23156q.getLayoutDirection()) : h10;
            }
            int j10 = j(f10, convertToAbsoluteDirection);
            if (j10 > 0) {
                return j10;
            }
        } else {
            int j11 = j(f10, convertToAbsoluteDirection);
            if (j11 > 0) {
                return j11;
            }
            int h11 = h(f10, convertToAbsoluteDirection);
            if (h11 > 0) {
                return (i10 & h11) == 0 ? e.convertToRelativeDirection(h11, this.f23156q.getLayoutDirection()) : h11;
            }
        }
        return 0;
    }

    public void E(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f23142c;
        this.f23146g = f10;
        this.f23147h = y10 - this.f23143d;
        if ((i10 & 4) == 0) {
            this.f23146g = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f23146g = Math.min(0.0f, this.f23146g);
        }
        if ((i10 & 1) == 0) {
            this.f23147h = Math.max(0.0f, this.f23147h);
        }
        if ((i10 & 2) == 0) {
            this.f23147h = Math.min(0.0f, this.f23147h);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(View view) {
        x(view);
        RecyclerView.F o02 = this.f23156q.o0(view);
        if (o02 == null) {
            return;
        }
        RecyclerView.F f10 = this.f23141b;
        if (f10 != null && o02 == f10) {
            z(null, 0);
            return;
        }
        l(o02, false);
        if (this.f23140a.remove(o02.itemView)) {
            this.f23151l.clearView(this.f23156q, o02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void d(View view) {
    }

    public final void f() {
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f23156q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f23156q = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f23144e = resources.getDimension(AbstractC6848b.f68255f);
            this.f23145f = resources.getDimension(AbstractC6848b.f68254e);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.F f10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f23146g > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f23158s;
        if (velocityTracker != null && this.f23150k > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f23151l.getSwipeVelocityThreshold(this.f23145f));
            float xVelocity = this.f23158s.getXVelocity(this.f23150k);
            float yVelocity = this.f23158s.getYVelocity(this.f23150k);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f23151l.getSwipeEscapeVelocity(this.f23144e) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.f23156q.getWidth() * this.f23151l.getSwipeThreshold(f10);
        if ((i10 & i11) == 0 || Math.abs(this.f23146g) <= width) {
            return 0;
        }
        return i11;
    }

    public void i(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.F p10;
        int absoluteMovementFlags;
        if (this.f23141b != null || i10 != 2 || this.f23152m == 2 || !this.f23151l.isItemViewSwipeEnabled() || this.f23156q.getScrollState() == 1 || (p10 = p(motionEvent)) == null || (absoluteMovementFlags = (this.f23151l.getAbsoluteMovementFlags(this.f23156q, p10) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f23142c;
        float f11 = y10 - this.f23143d;
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        int i12 = this.f23155p;
        if (abs >= i12 || abs2 >= i12) {
            if (abs > abs2) {
                if (f10 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f10 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.f23147h = 0.0f;
            this.f23146g = 0.0f;
            this.f23150k = motionEvent.getPointerId(0);
            z(p10, 1);
        }
    }

    public final int j(RecyclerView.F f10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f23147h > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f23158s;
        if (velocityTracker != null && this.f23150k > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f23151l.getSwipeVelocityThreshold(this.f23145f));
            float xVelocity = this.f23158s.getXVelocity(this.f23150k);
            float yVelocity = this.f23158s.getYVelocity(this.f23150k);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f23151l.getSwipeEscapeVelocity(this.f23144e) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f23156q.getHeight() * this.f23151l.getSwipeThreshold(f10);
        if ((i10 & i11) == 0 || Math.abs(this.f23147h) <= height) {
            return 0;
        }
        return i11;
    }

    public void l(RecyclerView.F f10, boolean z10) {
        for (int size = this.f23154o.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f23154o.get(size);
            if (gVar.f23180e == f10) {
                gVar.f23187l |= z10;
                if (!gVar.f23188m) {
                    gVar.a();
                }
                this.f23154o.remove(size);
                return;
            }
        }
    }

    public g m(MotionEvent motionEvent) {
        if (this.f23154o.isEmpty()) {
            return null;
        }
        View n10 = n(motionEvent);
        for (int size = this.f23154o.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f23154o.get(size);
            if (gVar.f23180e.itemView == n10) {
                return gVar;
            }
        }
        return null;
    }

    public View n(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.F f10 = this.f23141b;
        if (f10 != null) {
            View view = f10.itemView;
            if (s(view, x10, y10, this.f23148i + this.f23146g, this.f23149j + this.f23147h)) {
                return view;
            }
        }
        for (int size = this.f23154o.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f23154o.get(size);
            View view2 = gVar.f23180e.itemView;
            if (s(view2, x10, y10, gVar.f23185j, gVar.f23186k)) {
                return view2;
            }
        }
        return this.f23156q.X(x10, y10);
    }

    public final List o(RecyclerView.F f10) {
        RecyclerView.F f11 = f10;
        List list = this.f23159t;
        if (list == null) {
            this.f23159t = new ArrayList();
            this.f23160u = new ArrayList();
        } else {
            list.clear();
            this.f23160u.clear();
        }
        int boundingBoxMargin = this.f23151l.getBoundingBoxMargin();
        int round = Math.round(this.f23148i + this.f23146g) - boundingBoxMargin;
        int round2 = Math.round(this.f23149j + this.f23147h) - boundingBoxMargin;
        int i10 = boundingBoxMargin * 2;
        int width = f11.itemView.getWidth() + round + i10;
        int height = f11.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.q layoutManager = this.f23156q.getLayoutManager();
        int Z10 = layoutManager.Z();
        int i13 = 0;
        while (i13 < Z10) {
            View Y10 = layoutManager.Y(i13);
            if (Y10 != f11.itemView && Y10.getBottom() >= round2 && Y10.getTop() <= height && Y10.getRight() >= round && Y10.getLeft() <= width) {
                RecyclerView.F o02 = this.f23156q.o0(Y10);
                if (this.f23151l.canDropOver(this.f23156q, this.f23141b, o02)) {
                    int abs = Math.abs(i11 - ((Y10.getLeft() + Y10.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((Y10.getTop() + Y10.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f23159t.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > ((Integer) this.f23160u.get(i16)).intValue(); i16++) {
                        i15++;
                    }
                    this.f23159t.add(i15, o02);
                    this.f23160u.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            f11 = f10;
        }
        return this.f23159t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        this.f23163x = -1;
        if (this.f23141b != null) {
            q(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f23151l.onDraw(canvas, recyclerView, this.f23141b, this.f23154o, this.f23152m, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        if (this.f23141b != null) {
            q(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f23151l.onDrawOver(canvas, recyclerView, this.f23141b, this.f23154o, this.f23152m, f10, f11);
    }

    public final RecyclerView.F p(MotionEvent motionEvent) {
        View n10;
        RecyclerView.q layoutManager = this.f23156q.getLayoutManager();
        int i10 = this.f23150k;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(findPointerIndex) - this.f23142c;
        float y10 = motionEvent.getY(findPointerIndex) - this.f23143d;
        float abs = Math.abs(x10);
        float abs2 = Math.abs(y10);
        int i11 = this.f23155p;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.A()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.B()) && (n10 = n(motionEvent)) != null) {
            return this.f23156q.o0(n10);
        }
        return null;
    }

    public final void q(float[] fArr) {
        if ((this.f23153n & 12) != 0) {
            fArr[0] = (this.f23148i + this.f23146g) - this.f23141b.itemView.getLeft();
        } else {
            fArr[0] = this.f23141b.itemView.getTranslationX();
        }
        if ((this.f23153n & 3) != 0) {
            fArr[1] = (this.f23149j + this.f23147h) - this.f23141b.itemView.getTop();
        } else {
            fArr[1] = this.f23141b.itemView.getTranslationY();
        }
    }

    public boolean r() {
        int size = this.f23154o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((g) this.f23154o.get(i10)).f23188m) {
                return true;
            }
        }
        return false;
    }

    public void t(RecyclerView.F f10) {
        if (!this.f23156q.isLayoutRequested() && this.f23152m == 2) {
            float moveThreshold = this.f23151l.getMoveThreshold(f10);
            int i10 = (int) (this.f23148i + this.f23146g);
            int i11 = (int) (this.f23149j + this.f23147h);
            if (Math.abs(i11 - f10.itemView.getTop()) >= f10.itemView.getHeight() * moveThreshold || Math.abs(i10 - f10.itemView.getLeft()) >= f10.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.F> o10 = o(f10);
                if (o10.size() == 0) {
                    return;
                }
                RecyclerView.F chooseDropTarget = this.f23151l.chooseDropTarget(f10, o10, i10, i11);
                if (chooseDropTarget == null) {
                    this.f23159t.clear();
                    this.f23160u.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = f10.getAbsoluteAdapterPosition();
                if (this.f23151l.onMove(this.f23156q, f10, chooseDropTarget)) {
                    this.f23151l.onMoved(this.f23156q, f10, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    public void u() {
        VelocityTracker velocityTracker = this.f23158s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f23158s = VelocityTracker.obtain();
    }

    public void v(g gVar, int i10) {
        this.f23156q.post(new d(gVar, i10));
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f23158s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23158s = null;
        }
    }

    public void x(View view) {
        if (view == this.f23162w) {
            this.f23162w = null;
            if (this.f23161v != null) {
                this.f23156q.setChildDrawingOrderCallback(null);
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
    public boolean y() {
        int i10;
        int i11;
        int i12;
        if (this.f23141b == null) {
            this.f23139C = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f23139C;
        long j11 = j10 == Long.MIN_VALUE ? 0L : currentTimeMillis - j10;
        RecyclerView.q layoutManager = this.f23156q.getLayoutManager();
        if (this.f23138B == null) {
            this.f23138B = new Rect();
        }
        layoutManager.z(this.f23141b.itemView, this.f23138B);
        if (layoutManager.A()) {
            int i13 = (int) (this.f23148i + this.f23146g);
            int paddingLeft = (i13 - this.f23138B.left) - this.f23156q.getPaddingLeft();
            float f10 = this.f23146g;
            if ((f10 < 0.0f && paddingLeft < 0) || (f10 > 0.0f && (paddingLeft = ((i13 + this.f23141b.itemView.getWidth()) + this.f23138B.right) - (this.f23156q.getWidth() - this.f23156q.getPaddingRight())) > 0)) {
                i10 = paddingLeft;
                if (layoutManager.B()) {
                    int i14 = (int) (this.f23149j + this.f23147h);
                    i11 = (i14 - this.f23138B.top) - this.f23156q.getPaddingTop();
                    float f11 = this.f23147h;
                    if (f11 < 0.0f) {
                    }
                    if (f11 > 0.0f) {
                        i11 = ((i14 + this.f23141b.itemView.getHeight()) + this.f23138B.bottom) - (this.f23156q.getHeight() - this.f23156q.getPaddingBottom());
                    }
                }
                i11 = 0;
                if (i10 != 0) {
                    i10 = this.f23151l.interpolateOutOfBoundsScroll(this.f23156q, this.f23141b.itemView.getWidth(), i10, this.f23156q.getWidth(), j11);
                }
                i12 = i10;
                if (i11 == 0) {
                    i11 = this.f23151l.interpolateOutOfBoundsScroll(this.f23156q, this.f23141b.itemView.getHeight(), i11, this.f23156q.getHeight(), j11);
                }
                if (i12 != 0 && i11 == 0) {
                    this.f23139C = Long.MIN_VALUE;
                    return false;
                }
                if (this.f23139C == Long.MIN_VALUE) {
                    this.f23139C = currentTimeMillis;
                }
                this.f23156q.scrollBy(i12, i11);
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
        if (this.f23139C == Long.MIN_VALUE) {
        }
        this.f23156q.scrollBy(i12, i11);
        return true;
    }

    public void z(RecyclerView.F f10, int i10) {
        boolean z10;
        float f11;
        float signum;
        if (f10 == this.f23141b && i10 == this.f23152m) {
            return;
        }
        this.f23139C = Long.MIN_VALUE;
        int i11 = this.f23152m;
        l(f10, true);
        this.f23152m = i10;
        if (i10 == 2) {
            if (f10 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f23162w = f10.itemView;
            f();
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.F f12 = this.f23141b;
        boolean z11 = false;
        if (f12 != null) {
            if (f12.itemView.getParent() != null) {
                int D10 = i11 == 2 ? 0 : D(f12);
                w();
                int i13 = 4;
                if (D10 == 1 || D10 == 2) {
                    f11 = 0.0f;
                    signum = Math.signum(this.f23147h) * this.f23156q.getHeight();
                } else if (D10 == 4 || D10 == 8 || D10 == 16 || D10 == 32) {
                    signum = 0.0f;
                    f11 = Math.signum(this.f23146g) * this.f23156q.getWidth();
                } else {
                    f11 = 0.0f;
                    signum = 0.0f;
                }
                if (i11 == 2) {
                    i13 = 8;
                } else if (D10 > 0) {
                    i13 = 2;
                }
                q(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f13 = fArr[0];
                float f14 = fArr[1];
                z10 = false;
                c cVar = new c(f12, i13, i11, f13, f14, f11, signum, D10, f12);
                cVar.b(this.f23151l.getAnimationDuration(this.f23156q, i13, f11 - f13, signum - f14));
                this.f23154o.add(cVar);
                cVar.d();
                z11 = true;
            } else {
                z10 = false;
                x(f12.itemView);
                this.f23151l.clearView(this.f23156q, f12);
                z11 = false;
            }
            this.f23141b = null;
        } else {
            z10 = false;
        }
        if (f10 != null) {
            this.f23153n = (this.f23151l.getAbsoluteMovementFlags(this.f23156q, f10) & i12) >> (this.f23152m * 8);
            this.f23148i = f10.itemView.getLeft();
            this.f23149j = f10.itemView.getTop();
            this.f23141b = f10;
            if (i10 == 2) {
                f10.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f23156q.getParent();
        if (parent != null) {
            if (this.f23141b != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f23156q.getLayoutManager().I1();
        }
        this.f23151l.onSelectedChanged(this.f23141b, this.f23152m);
        this.f23156q.invalidate();
    }
}

package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.e440;
import xsna.fot;
import xsna.iut0;
import xsna.jim;
import xsna.u11;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes12.dex */
public final class r extends RecyclerView.n implements RecyclerView.q {
    public Rect B;
    public long C;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;

    @NonNull
    public final d n;
    public int p;
    public int r;
    public RecyclerView s;
    public VelocityTracker u;
    public ArrayList v;
    public ArrayList w;
    public fot y;
    public e z;
    public final ArrayList b = new ArrayList();
    public final float[] c = new float[2];
    public RecyclerView.e0 d = null;
    public int m = -1;
    public int o = 0;
    public final ArrayList q = new ArrayList();
    public final a t = new a();
    public View x = null;
    public final b A = new b();

    /* compiled from: ItemTouchHelper.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
        
            if (r4 < 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        
            if (r4 > 0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i;
            int i2;
            int i3;
            RecyclerView.e0 e0Var;
            r rVar = r.this;
            if (rVar.d != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = rVar.C;
                long j2 = j == Long.MIN_VALUE ? 0L : currentTimeMillis - j;
                RecyclerView.o layoutManager = rVar.s.getLayoutManager();
                if (rVar.B == null) {
                    rVar.B = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(rVar.d.itemView, rVar.B);
                if (layoutManager.canScrollHorizontally()) {
                    int i4 = (int) (rVar.k + rVar.i);
                    int paddingLeft = (i4 - rVar.B.left) - rVar.s.getPaddingLeft();
                    float f = rVar.i;
                    if ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && paddingLeft < 0) || (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (paddingLeft = ((rVar.d.itemView.getWidth() + i4) + rVar.B.right) - (rVar.s.getWidth() - rVar.s.getPaddingRight())) > 0)) {
                        i = paddingLeft;
                        if (layoutManager.canScrollVertically()) {
                            int i5 = (int) (rVar.l + rVar.j);
                            i2 = (i5 - rVar.B.top) - rVar.s.getPaddingTop();
                            float f2 = rVar.j;
                            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i2 = ((rVar.d.itemView.getHeight() + i5) + rVar.B.bottom) - (rVar.s.getHeight() - rVar.s.getPaddingBottom());
                            }
                        }
                        i2 = 0;
                        if (i != 0) {
                            d dVar = rVar.n;
                            RecyclerView recyclerView = rVar.s;
                            int width = rVar.d.itemView.getWidth();
                            rVar.s.getWidth();
                            i = dVar.i(recyclerView, width, i, j2);
                        }
                        i3 = i;
                        if (i2 == 0) {
                            d dVar2 = rVar.n;
                            RecyclerView recyclerView2 = rVar.s;
                            int height = rVar.d.itemView.getHeight();
                            rVar.s.getHeight();
                            i2 = dVar2.i(recyclerView2, height, i2, j2);
                        }
                        if (i3 != 0 && i2 == 0) {
                            rVar.C = Long.MIN_VALUE;
                            return;
                        }
                        if (rVar.C == Long.MIN_VALUE) {
                            rVar.C = currentTimeMillis;
                        }
                        rVar.s.scrollBy(i3, i2);
                        e0Var = rVar.d;
                        if (e0Var != null) {
                            rVar.u(e0Var);
                        }
                        rVar.s.removeCallbacks(rVar.t);
                        RecyclerView recyclerView3 = rVar.s;
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        recyclerView3.postOnAnimation(this);
                    }
                }
                i = 0;
                if (layoutManager.canScrollVertically()) {
                }
                i2 = 0;
                if (i != 0) {
                }
                i3 = i;
                if (i2 == 0) {
                }
                if (i3 != 0) {
                }
                if (rVar.C == Long.MIN_VALUE) {
                }
                rVar.s.scrollBy(i3, i2);
                e0Var = rVar.d;
                if (e0Var != null) {
                }
                rVar.s.removeCallbacks(rVar.t);
                RecyclerView recyclerView32 = rVar.s;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                recyclerView32.postOnAnimation(this);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void f(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            r rVar = r.this;
            a aVar = rVar.t;
            rVar.y.a(motionEvent);
            VelocityTracker velocityTracker = rVar.u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (rVar.m == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(rVar.m);
            if (findPointerIndex >= 0) {
                rVar.n(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.e0 e0Var = rVar.d;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        rVar.y(rVar.p, findPointerIndex, motionEvent);
                        rVar.u(e0Var);
                        rVar.s.removeCallbacks(aVar);
                        aVar.run();
                        rVar.s.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == rVar.m) {
                        rVar.m = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        rVar.y(rVar.p, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = rVar.u;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            rVar.w(null, 0);
            rVar.m = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void h(boolean z) {
            if (z) {
                r.this.w(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            r rVar = r.this;
            rVar.y.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                rVar.m = motionEvent.getPointerId(0);
                rVar.e = motionEvent.getX();
                rVar.f = motionEvent.getY();
                VelocityTracker velocityTracker = rVar.u;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                rVar.u = VelocityTracker.obtain();
                if (rVar.d == null) {
                    ArrayList arrayList = rVar.q;
                    if (!arrayList.isEmpty()) {
                        View q = rVar.q(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f.itemView == q) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        RecyclerView.e0 e0Var = fVar.f;
                        rVar.e -= fVar.j;
                        rVar.f -= fVar.k;
                        rVar.p(e0Var, true);
                        if (rVar.b.remove(e0Var.itemView)) {
                            rVar.n.b(rVar.s, e0Var);
                        }
                        rVar.w(e0Var, fVar.g);
                        rVar.y(rVar.p, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                rVar.m = -1;
                rVar.w(null, 0);
            } else {
                int i = rVar.m;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    rVar.n(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = rVar.u;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return rVar.d != null;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class c extends f {
        public final /* synthetic */ int o;
        public final /* synthetic */ RecyclerView.e0 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.e0 e0Var, int i, float f, float f2, float f3, float f4, int i2, RecyclerView.e0 e0Var2) {
            super(e0Var, i, f, f2, f3, f4);
            this.o = i2;
            this.p = e0Var2;
        }

        @Override // androidx.recyclerview.widget.r.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.l) {
                return;
            }
            int i = this.o;
            RecyclerView.e0 e0Var = this.p;
            r rVar = r.this;
            if (i <= 0) {
                rVar.n.b(rVar.s, e0Var);
            } else {
                rVar.b.add(e0Var.itemView);
                this.i = true;
                if (i > 0) {
                    rVar.s.post(new s(rVar, this, i));
                }
            }
            View view = rVar.x;
            View view2 = e0Var.itemView;
            if (view == view2) {
                rVar.v(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean b = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            r rVar;
            View q;
            RecyclerView.e0 childViewHolder;
            if (!this.b || (q = (rVar = r.this).q(motionEvent)) == null || (childViewHolder = rVar.s.getChildViewHolder(q)) == null) {
                return;
            }
            d dVar = rVar.n;
            RecyclerView recyclerView = rVar.s;
            int f = dVar.f(recyclerView, childViewHolder);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if ((d.c(f, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = rVar.m;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    rVar.e = x;
                    rVar.f = y;
                    rVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    rVar.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (rVar.n.k()) {
                        rVar.w(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static abstract class g extends d {
        public final int e;
        public int f;

        public g(int i, int i2) {
            this.e = i2;
            this.f = i;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.e0 e0Var) {
            return d.l(this.f, this.e);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface h {
        void b(@NonNull View view, @NonNull View view2);
    }

    public r(@NonNull d dVar) {
        this.n = dVar;
    }

    public static boolean t(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(@NonNull View view) {
        v(view);
        RecyclerView.e0 childViewHolder = this.s.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.d;
        if (e0Var != null && childViewHolder == e0Var) {
            w(null, 0);
            return;
        }
        p(childViewHolder, false);
        if (this.b.remove(childViewHolder.itemView)) {
            this.n.b(this.s, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    public final void l(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.A;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.s.removeOnItemTouchListener(bVar);
            this.s.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList.get(0);
                fVar.h.cancel();
                this.n.b(this.s, fVar.f);
            }
            arrayList.clear();
            this.x = null;
            VelocityTracker velocityTracker = this.u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.u = null;
            }
            e eVar = this.z;
            if (eVar != null) {
                eVar.b = false;
                this.z = null;
            }
            if (this.y != null) {
                this.y = null;
            }
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.h = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.r = ViewConfiguration.get(this.s.getContext()).getScaledTouchSlop();
            this.s.addItemDecoration(this);
            this.s.addOnItemTouchListener(bVar);
            this.s.addOnChildAttachStateChangeListener(this);
            this.z = new e();
            this.y = new fot(this.s.getContext(), this.z, null);
        }
    }

    public final int m(RecyclerView.e0 e0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 8 : 4;
        VelocityTracker velocityTracker = this.u;
        d dVar = this.n;
        if (velocityTracker != null && this.m > -1) {
            float f2 = this.h;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.u.getXVelocity(this.m);
            float yVelocity = this.u.getYVelocity(this.m);
            int i3 = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= dVar.g(this.g) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float h2 = dVar.h() * this.s.getWidth();
        if ((i & i2) == 0 || Math.abs(this.i) <= h2) {
            return 0;
        }
        return i2;
    }

    public final void n(int i, int i2, MotionEvent motionEvent) {
        View q;
        if (this.d == null && i == 2 && this.o != 2) {
            d dVar = this.n;
            if (dVar.j() && this.s.getScrollState() != 1) {
                RecyclerView.o layoutManager = this.s.getLayoutManager();
                int i3 = this.m;
                RecyclerView.e0 e0Var = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.e;
                    float y = motionEvent.getY(findPointerIndex) - this.f;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f2 = this.r;
                    if ((abs >= f2 || abs2 >= f2) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (q = q(motionEvent)) != null))) {
                        e0Var = this.s.getChildViewHolder(q);
                    }
                }
                if (e0Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.s;
                int f3 = dVar.f(recyclerView, e0Var);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                int c2 = (d.c(f3, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (c2 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f4 = x2 - this.e;
                float f5 = y2 - this.f;
                float abs3 = Math.abs(f4);
                float abs4 = Math.abs(f5);
                float f6 = this.r;
                if (abs3 >= f6 || abs4 >= f6) {
                    if (abs3 > abs4) {
                        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c2 & 4) == 0) {
                            return;
                        }
                        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c2 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c2 & 1) == 0) {
                            return;
                        }
                        if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c2 & 2) == 0) {
                            return;
                        }
                    }
                    this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.m = motionEvent.getPointerId(0);
                    w(e0Var, 1);
                }
            }
        }
    }

    public final int o(RecyclerView.e0 e0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.j > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 1;
        VelocityTracker velocityTracker = this.u;
        d dVar = this.n;
        if (velocityTracker != null && this.m > -1) {
            float f2 = this.h;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.u.getXVelocity(this.m);
            float yVelocity = this.u.getYVelocity(this.m);
            int i3 = yVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= dVar.g(this.g) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float h2 = dVar.h() * this.s.getHeight();
        if ((i & i2) == 0 || Math.abs(this.j) <= h2) {
            return 0;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        if (this.d != null) {
            float[] fArr = this.c;
            r(fArr);
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        RecyclerView.e0 e0Var = this.d;
        int i = this.o;
        d dVar = this.n;
        dVar.getClass();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = (f) arrayList.get(i2);
            RecyclerView.e0 e0Var2 = fVar.f;
            float f5 = fVar.b;
            float f6 = fVar.d;
            if (f5 == f6) {
                fVar.j = e0Var2.itemView.getTranslationX();
            } else {
                fVar.j = u11.b(f6, f5, fVar.n, f5);
            }
            float f7 = fVar.c;
            float f8 = fVar.e;
            if (f7 == f8) {
                fVar.k = e0Var2.itemView.getTranslationY();
            } else {
                fVar.k = u11.b(f8, f7, fVar.n, f7);
            }
            int save = canvas.save();
            dVar.m(canvas, recyclerView, fVar.f, fVar.j, fVar.k, fVar.g, false);
            canvas.restoreToCount(save);
        }
        if (e0Var != null) {
            int save2 = canvas.save();
            dVar.m(canvas, recyclerView, e0Var, f3, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        boolean z = false;
        if (this.d != null) {
            float[] fArr = this.c;
            r(fArr);
            float f2 = fArr[0];
            float f3 = fArr[1];
        }
        RecyclerView.e0 e0Var = this.d;
        this.n.getClass();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f fVar = (f) arrayList.get(i);
            int save = canvas.save();
            View view = fVar.f.itemView;
            canvas.restoreToCount(save);
        }
        if (e0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            f fVar2 = (f) arrayList.get(i2);
            boolean z2 = fVar2.m;
            if (z2 && !fVar2.i) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void p(RecyclerView.e0 e0Var, boolean z) {
        ArrayList arrayList = this.q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.f == e0Var) {
                fVar.l |= z;
                if (!fVar.m) {
                    fVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.e0 e0Var = this.d;
        if (e0Var != null) {
            View view = e0Var.itemView;
            if (t(view, x, y, this.k + this.i, this.l + this.j)) {
                return view;
            }
        }
        ArrayList arrayList = this.q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.f.itemView;
            if (t(view2, x, y, fVar.j, fVar.k)) {
                return view2;
            }
        }
        return this.s.findChildViewUnder(x, y);
    }

    public final void r(float[] fArr) {
        if ((this.p & 12) != 0) {
            fArr[0] = (this.k + this.i) - this.d.itemView.getLeft();
        } else {
            fArr[0] = this.d.itemView.getTranslationX();
        }
        if ((this.p & 3) != 0) {
            fArr[1] = (this.l + this.j) - this.d.itemView.getTop();
        } else {
            fArr[1] = this.d.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(RecyclerView.e0 e0Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        if (this.s.isLayoutRequested()) {
            return;
        }
        char c2 = 2;
        if (this.o != 2) {
            return;
        }
        d dVar = this.n;
        dVar.getClass();
        int i4 = (int) (this.k + this.i);
        int i5 = (int) (this.l + this.j);
        if (Math.abs(i5 - e0Var.itemView.getTop()) >= e0Var.itemView.getHeight() * 0.5f || Math.abs(i4 - e0Var.itemView.getLeft()) >= e0Var.itemView.getWidth() * 0.5f) {
            ArrayList arrayList = this.v;
            if (arrayList == null) {
                this.v = new ArrayList();
                this.w = new ArrayList();
            } else {
                arrayList.clear();
                this.w.clear();
            }
            int round = Math.round(this.k + this.i);
            int round2 = Math.round(this.l + this.j);
            int width = e0Var.itemView.getWidth() + round;
            int height = e0Var.itemView.getHeight() + round2;
            int i6 = (round + width) / 2;
            int i7 = (round2 + height) / 2;
            RecyclerView.o layoutManager = this.s.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i8 = 0;
            while (i8 < childCount) {
                char c3 = c2;
                View childAt = layoutManager.getChildAt(i8);
                if (childAt != e0Var.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                    RecyclerView.e0 childViewHolder = this.s.getChildViewHolder(childAt);
                    if (dVar.a(this.d, childViewHolder)) {
                        int abs5 = Math.abs(i6 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int abs6 = Math.abs(i7 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i9 = (abs6 * abs6) + (abs5 * abs5);
                        i = i4;
                        int size = this.v.size();
                        i2 = i5;
                        i3 = round;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < size) {
                            int i12 = size;
                            if (i9 <= ((Integer) this.w.get(i10)).intValue()) {
                                break;
                            }
                            i11++;
                            i10++;
                            size = i12;
                        }
                        this.v.add(i11, childViewHolder);
                        this.w.add(i11, Integer.valueOf(i9));
                        i8++;
                        c2 = c3;
                        i4 = i;
                        i5 = i2;
                        round = i3;
                    }
                }
                i = i4;
                i2 = i5;
                i3 = round;
                i8++;
                c2 = c3;
                i4 = i;
                i5 = i2;
                round = i3;
            }
            int i13 = i4;
            int i14 = i5;
            ArrayList arrayList2 = this.v;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = e0Var.itemView.getWidth() + i13;
            int height2 = e0Var.itemView.getHeight() + i14;
            int left2 = i13 - e0Var.itemView.getLeft();
            int top2 = i14 - e0Var.itemView.getTop();
            int size2 = arrayList2.size();
            RecyclerView.e0 e0Var2 = null;
            int i15 = -1;
            for (int i16 = 0; i16 < size2; i16++) {
                RecyclerView.e0 e0Var3 = (RecyclerView.e0) arrayList2.get(i16);
                if (left2 > 0 && (right = e0Var3.itemView.getRight() - width2) < 0 && e0Var3.itemView.getRight() > e0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i15) {
                    e0Var2 = e0Var3;
                    i15 = abs4;
                }
                if (left2 < 0 && (left = e0Var3.itemView.getLeft() - i13) > 0 && e0Var3.itemView.getLeft() < e0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i15) {
                    e0Var2 = e0Var3;
                    i15 = abs3;
                }
                if (top2 < 0 && (top = e0Var3.itemView.getTop() - i14) > 0 && e0Var3.itemView.getTop() < e0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i15) {
                    e0Var2 = e0Var3;
                    i15 = abs2;
                }
                if (top2 > 0 && (bottom = e0Var3.itemView.getBottom() - height2) < 0 && e0Var3.itemView.getBottom() > e0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i15) {
                    e0Var2 = e0Var3;
                    i15 = abs;
                }
            }
            if (e0Var2 == null) {
                this.v.clear();
                this.w.clear();
                return;
            }
            int absoluteAdapterPosition = e0Var2.getAbsoluteAdapterPosition();
            e0Var.getAbsoluteAdapterPosition();
            if (dVar.n(this.s, e0Var, e0Var2)) {
                RecyclerView recyclerView = this.s;
                RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof h) {
                    ((h) layoutManager2).b(e0Var.itemView, e0Var2.itemView);
                    return;
                }
                if (layoutManager2.canScrollHorizontally()) {
                    if (layoutManager2.getDecoratedLeft(e0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedRight(e0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
                if (layoutManager2.canScrollVertically()) {
                    if (layoutManager2.getDecoratedTop(e0Var2.itemView) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedBottom(e0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
            }
        }
    }

    public final void v(View view) {
        if (view == this.x) {
            this.x = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0092, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(@Nullable RecyclerView.e0 e0Var, int i) {
        d dVar;
        boolean z;
        boolean z2;
        int o;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        if (e0Var == this.d && i == this.o) {
            return;
        }
        this.C = Long.MIN_VALUE;
        int i2 = this.o;
        p(e0Var, true);
        this.o = i;
        if (i == 2) {
            if (e0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.x = e0Var.itemView;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.e0 e0Var2 = this.d;
        d dVar2 = this.n;
        if (e0Var2 != null) {
            if (e0Var2.itemView.getParent() != null) {
                if (i2 != 2 && this.o != 2) {
                    int f2 = dVar2.f(this.s, e0Var2);
                    RecyclerView recyclerView = this.s;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    int c2 = (d.c(f2, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (c2 != 0) {
                        int i4 = (f2 & 65280) >> 8;
                        if (Math.abs(this.i) > Math.abs(this.j)) {
                            o = m(e0Var2, c2);
                            if (o <= 0) {
                                o = o(e0Var2, c2);
                            } else if ((i4 & o) == 0) {
                                o = d.d(o, this.s.getLayoutDirection());
                            }
                            velocityTracker = this.u;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.u = null;
                            }
                            int i5 = 4;
                            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (o != 1 || o == 2) {
                                r16 = 0;
                                signum = Math.signum(this.j) * this.s.getHeight();
                            } else if (o == 4 || o == 8 || o == 16 || o == 32) {
                                r16 = 0;
                                signum = 0.0f;
                                f3 = Math.signum(this.i) * this.s.getWidth();
                            } else {
                                signum = 0.0f;
                                r16 = 0;
                            }
                            if (i2 == 2) {
                                i5 = 8;
                            } else if (o > 0) {
                                i5 = 2;
                            }
                            float[] fArr = this.c;
                            r(fArr);
                            z = r16;
                            dVar = dVar2;
                            c cVar = new c(e0Var2, i2, fArr[r16], fArr[1], f3, signum, o, e0Var2);
                            long e2 = dVar.e(this.s, i5);
                            ValueAnimator valueAnimator = cVar.h;
                            valueAnimator.setDuration(e2);
                            this.q.add(cVar);
                            e0Var2.setIsRecyclable(z);
                            valueAnimator.start();
                            z2 = true;
                        } else {
                            o = o(e0Var2, c2);
                            if (o <= 0) {
                                o = m(e0Var2, c2);
                                if (o > 0) {
                                    if ((i4 & o) == 0) {
                                        o = d.d(o, this.s.getLayoutDirection());
                                    }
                                }
                            }
                            velocityTracker = this.u;
                            if (velocityTracker != null) {
                            }
                            int i52 = 4;
                            float f32 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (o != 1) {
                            }
                            r16 = 0;
                            signum = Math.signum(this.j) * this.s.getHeight();
                            if (i2 == 2) {
                            }
                            float[] fArr2 = this.c;
                            r(fArr2);
                            z = r16;
                            dVar = dVar2;
                            c cVar2 = new c(e0Var2, i2, fArr2[r16], fArr2[1], f32, signum, o, e0Var2);
                            long e22 = dVar.e(this.s, i52);
                            ValueAnimator valueAnimator2 = cVar2.h;
                            valueAnimator2.setDuration(e22);
                            this.q.add(cVar2);
                            e0Var2.setIsRecyclable(z);
                            valueAnimator2.start();
                            z2 = true;
                        }
                    }
                }
                o = 0;
                velocityTracker = this.u;
                if (velocityTracker != null) {
                }
                int i522 = 4;
                float f322 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (o != 1) {
                }
                r16 = 0;
                signum = Math.signum(this.j) * this.s.getHeight();
                if (i2 == 2) {
                }
                float[] fArr22 = this.c;
                r(fArr22);
                z = r16;
                dVar = dVar2;
                c cVar22 = new c(e0Var2, i2, fArr22[r16], fArr22[1], f322, signum, o, e0Var2);
                long e222 = dVar.e(this.s, i522);
                ValueAnimator valueAnimator22 = cVar22.h;
                valueAnimator22.setDuration(e222);
                this.q.add(cVar22);
                e0Var2.setIsRecyclable(z);
                valueAnimator22.start();
                z2 = true;
            } else {
                dVar = dVar2;
                z = false;
                v(e0Var2.itemView);
                dVar.b(this.s, e0Var2);
                z2 = false;
            }
            this.d = null;
        } else {
            dVar = dVar2;
            z = false;
            z2 = false;
        }
        if (e0Var != null) {
            RecyclerView recyclerView2 = this.s;
            int f4 = dVar.f(recyclerView2, e0Var);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            this.p = (d.c(f4, recyclerView2.getLayoutDirection()) & i3) >> (this.o * 8);
            this.k = e0Var.itemView.getLeft();
            this.l = e0Var.itemView.getTop();
            this.d = e0Var;
            if (i == 2) {
                e0Var.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.s.getParent();
        if (parent != null) {
            if (this.d != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.s.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        dVar.o(this.d, this.o);
        this.s.invalidate();
    }

    public final void x(@NonNull RecyclerView.e0 e0Var) {
        RecyclerView recyclerView = this.s;
        int f2 = this.n.f(recyclerView, e0Var);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if ((d.c(f2, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (e0Var.itemView.getParent() != this.s) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.u = VelocityTracker.obtain();
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        w(e0Var, 2);
    }

    public final void y(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.e;
        this.i = f2;
        this.j = y - this.f;
        if ((i & 4) == 0) {
            this.i = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        }
        if ((i & 8) == 0) {
            this.i = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        }
        if ((i & 1) == 0) {
            this.j = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.j);
        }
        if ((i & 2) == 0) {
            this.j = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.j);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static abstract class d {
        public static final a c = new a();
        public static final b d = new b();
        public int b = -1;

        /* compiled from: ItemTouchHelper.java */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int c(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public static int d(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int l(int i, int i2) {
            int i3 = i2 | i;
            return (i << 16) | (i2 << 8) | i3;
        }

        public boolean a(@NonNull RecyclerView.e0 e0Var, @NonNull RecyclerView.e0 e0Var2) {
            return true;
        }

        public void b(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.e0 e0Var) {
            View view = e0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.setElevation(floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public long e(@NonNull RecyclerView recyclerView, int i) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.l() : itemAnimator.m();
        }

        public abstract int f(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.e0 e0Var);

        public float h() {
            return 0.5f;
        }

        public final int i(@NonNull RecyclerView recyclerView, int i, int i2, long j) {
            if (this.b == -1) {
                this.b = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (c.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.b)));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean j() {
            return !(this instanceof e440);
        }

        public boolean k() {
            return !(this instanceof jim.a);
        }

        public void m(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
            View view = e0Var.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                Float valueOf = Float.valueOf(view.getElevation());
                int childCount = recyclerView.getChildCount();
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        float elevation = childAt.getElevation();
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                view.setElevation(f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public abstract boolean n(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.e0 e0Var, @NonNull RecyclerView.e0 e0Var2);

        public abstract void p(@NonNull RecyclerView.e0 e0Var);

        public float g(float f) {
            return f;
        }

        public void o(@Nullable RecyclerView.e0 e0Var, int i) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static class f implements Animator.AnimatorListener {
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final RecyclerView.e0 f;
        public final int g;
        public final ValueAnimator h;
        public boolean i;
        public float j;
        public float k;
        public boolean l = false;
        public boolean m = false;
        public float n;

        public f(RecyclerView.e0 e0Var, int i, float f, float f2, float f3, float f4) {
            this.g = i;
            this.f = e0Var;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new t(this));
            ofFloat.setTarget(e0Var.itemView);
            ofFloat.addListener(this);
            this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.n = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.f.setIsRecyclable(true);
            }
            this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(@NonNull View view) {
    }
}

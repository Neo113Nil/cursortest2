package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;

/* compiled from: FastScroller.java */
/* loaded from: classes12.dex */
public final class o extends RecyclerView.n implements RecyclerView.s {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public final ValueAnimator A;
    public int B;
    public final a C;
    public final int b;
    public final int c;
    public final StateListDrawable d;
    public final Drawable e;
    public final int f;
    public final int g;
    public final StateListDrawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public int p;
    public float q;
    public final RecyclerView t;
    public int r = 0;
    public int s = 0;
    public boolean u = false;
    public boolean v = false;
    public int w = 0;
    public int x = 0;
    public final int[] y = new int[2];
    public final int[] z = new int[2];

    /* compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            ValueAnimator valueAnimator = oVar.A;
            int i = oVar.B;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            oVar.B = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            o oVar = o.this;
            int i3 = oVar.b;
            int computeVerticalScrollRange = oVar.t.computeVerticalScrollRange();
            int i4 = oVar.s;
            oVar.u = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
            int computeHorizontalScrollRange = oVar.t.computeHorizontalScrollRange();
            int i5 = oVar.r;
            boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
            oVar.v = z;
            boolean z2 = oVar.u;
            if (!z2 && !z) {
                if (oVar.w != 0) {
                    oVar.o(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i4;
                oVar.m = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                oVar.l = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (oVar.v) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i5;
                oVar.p = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                oVar.o = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = oVar.w;
            if (i6 == 0 || i6 == 1) {
                oVar.o(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {
        public boolean b = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                this.b = false;
                return;
            }
            o oVar = o.this;
            if (((Float) oVar.A.getAnimatedValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                oVar.B = 0;
                oVar.o(0);
            } else {
                oVar.B = 2;
                oVar.t.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            o oVar = o.this;
            oVar.d.setAlpha(floatValue);
            oVar.e.setAlpha(floatValue);
            oVar.t.invalidate();
        }
    }

    public o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.A = ofFloat;
        this.B = 0;
        a aVar = new a();
        this.C = aVar;
        b bVar = new b();
        this.d = stateListDrawable;
        this.e = drawable;
        this.h = stateListDrawable2;
        this.i = drawable2;
        this.f = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.g = Math.max(i, drawable.getIntrinsicWidth());
        this.j = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.k = Math.max(i, drawable2.getIntrinsicWidth());
        this.b = i2;
        this.c = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.t.removeOnItemTouchListener(this);
            this.t.removeOnScrollListener(bVar);
            this.t.removeCallbacks(aVar);
        }
        this.t = recyclerView;
        recyclerView.addItemDecoration(this);
        this.t.addOnItemTouchListener(this);
        this.t.addOnScrollListener(bVar);
    }

    public static int n(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.w == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m = m(motionEvent.getX(), motionEvent.getY());
            boolean l = l(motionEvent.getX(), motionEvent.getY());
            if (m || l) {
                if (l) {
                    this.x = 1;
                    this.q = (int) motionEvent.getX();
                } else if (m) {
                    this.x = 2;
                    this.n = (int) motionEvent.getY();
                }
                o(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.w == 2) {
            this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            o(1);
            this.x = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.w == 2) {
            show();
            int i = this.x;
            int i2 = this.c;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.z;
                iArr[0] = i2;
                int i3 = this.r - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.p - max) >= 2.0f) {
                    int n = n(this.q, max, iArr, this.t.computeHorizontalScrollRange(), this.t.computeHorizontalScrollOffset(), this.r);
                    if (n != 0) {
                        this.t.scrollBy(n, 0);
                    }
                    this.q = max;
                }
            }
            if (this.x == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.y;
                iArr2[0] = i2;
                int i4 = this.s - i2;
                iArr2[1] = i4;
                float max2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.m - max2) < 2.0f) {
                    return;
                }
                int n2 = n(this.n, max2, iArr2, this.t.computeVerticalScrollRange(), this.t.computeVerticalScrollOffset(), this.s);
                if (n2 != 0) {
                    this.t.scrollBy(0, n2);
                }
                this.n = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i = this.w;
        if (i != 1) {
            return i == 2;
        }
        boolean m = m(motionEvent.getX(), motionEvent.getY());
        boolean l = l(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!m && !l) {
            return false;
        }
        if (l) {
            this.x = 1;
            this.q = (int) motionEvent.getX();
        } else if (m) {
            this.x = 2;
            this.n = (int) motionEvent.getY();
        }
        o(2);
        return true;
    }

    public final boolean l(float f, float f2) {
        if (f2 < this.s - this.j) {
            return false;
        }
        int i = this.p;
        int i2 = this.o;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean m(float f, float f2) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = this.t.getLayoutDirection();
        int i = this.f;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.r - i) {
            return false;
        }
        int i2 = this.m;
        int i3 = this.l / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void o(int i) {
        a aVar = this.C;
        StateListDrawable stateListDrawable = this.d;
        if (i == 2 && this.w != 2) {
            stateListDrawable.setState(D);
            this.t.removeCallbacks(aVar);
        }
        if (i == 0) {
            this.t.invalidate();
        } else {
            show();
        }
        if (this.w == 2 && i != 2) {
            stateListDrawable.setState(E);
            this.t.removeCallbacks(aVar);
            this.t.postDelayed(aVar, 1200);
        } else if (i == 1) {
            this.t.removeCallbacks(aVar);
            this.t.postDelayed(aVar, 1500);
        }
        this.w = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = this.r;
        RecyclerView recyclerView2 = this.t;
        if (i != recyclerView2.getWidth() || this.s != recyclerView2.getHeight()) {
            this.r = recyclerView2.getWidth();
            this.s = recyclerView2.getHeight();
            o(0);
            return;
        }
        if (this.B != 0) {
            if (this.u) {
                int i2 = this.r;
                int i3 = this.f;
                int i4 = i2 - i3;
                int i5 = this.m;
                int i6 = this.l;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.d;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.g;
                int i9 = this.s;
                Drawable drawable = this.e;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    drawable.draw(canvas);
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.v) {
                int i10 = this.s;
                int i11 = this.j;
                int i12 = i10 - i11;
                int i13 = this.p;
                int i14 = this.o;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.h;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.r;
                int i17 = this.k;
                Drawable drawable2 = this.i;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final void show() {
        int i = this.B;
        ValueAnimator valueAnimator = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.B = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b8;
import defpackage.erf;
import defpackage.gm6;
import defpackage.krf;
import defpackage.qrf;
import defpackage.wz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends erf implements krf {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final b8 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        b8 b8Var = new b8(this, 14);
        this.B = b8Var;
        c cVar = new c(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new gm6(this));
        ofFloat.addUpdateListener(new wz1(this, 2));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.s.removeOnItemTouchListener(this);
            this.s.removeOnScrollListener(cVar);
            this.s.removeCallbacks(b8Var);
        }
        this.s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(cVar);
    }

    public static int h(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // defpackage.krf
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (g || f) {
                if (f) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (g) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                i(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            i(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            j();
            int i = this.w;
            RecyclerView recyclerView2 = this.s;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i2;
                int i3 = this.q - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.o - max) >= 2.0f) {
                    int h = h(this.p, max, iArr, recyclerView2.computeHorizontalScrollRange(), recyclerView2.computeHorizontalScrollOffset(), this.q);
                    if (h != 0) {
                        recyclerView2.scrollBy(h, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i2;
                int i4 = this.r - i2;
                iArr2[1] = i4;
                float max2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.l - max2) < 2.0f) {
                    return;
                }
                int h2 = h(this.m, max2, iArr2, recyclerView2.computeVerticalScrollRange(), recyclerView2.computeVerticalScrollOffset(), this.r);
                if (h2 != 0) {
                    recyclerView2.scrollBy(0, h2);
                }
                this.m = max2;
            }
        }
    }

    @Override // defpackage.krf
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i != 1) {
            return i == 2;
        }
        boolean g = g(motionEvent.getX(), motionEvent.getY());
        boolean f = f(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!g && !f) {
            return false;
        }
        if (f) {
            this.w = 1;
            this.p = (int) motionEvent.getX();
        } else if (g) {
            this.w = 2;
            this.m = (int) motionEvent.getY();
        }
        i(2);
        return true;
    }

    public final boolean f(float f, float f2) {
        if (f2 < this.r - this.i) {
            return false;
        }
        int i = this.o;
        int i2 = this.n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean g(float f, float f2) {
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void i(int i) {
        RecyclerView recyclerView = this.s;
        b8 b8Var = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(b8Var);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            j();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(b8Var);
            recyclerView.postDelayed(b8Var, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(b8Var);
            recyclerView.postDelayed(b8Var, 1500L);
        }
        this.v = i;
    }

    public final void j() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // defpackage.erf
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        int i = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            i(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f;
                int i9 = this.r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i9);
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
            if (this.u) {
                int i10 = this.r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.o;
                int i14 = this.n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.q;
                int i17 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    @Override // defpackage.krf
    public final void e(boolean z) {
    }
}

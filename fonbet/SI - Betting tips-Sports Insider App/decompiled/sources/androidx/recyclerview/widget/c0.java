package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends g1 implements o1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final y B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2332b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2333c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f2334d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2335e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2336f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2337g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f2338h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2339i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f2340k;

    /* renamed from: l, reason: collision with root package name */
    public int f2341l;

    /* renamed from: m, reason: collision with root package name */
    public float f2342m;

    /* renamed from: n, reason: collision with root package name */
    public int f2343n;

    /* renamed from: o, reason: collision with root package name */
    public int f2344o;

    /* renamed from: p, reason: collision with root package name */
    public float f2345p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2347s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2354z;
    public int q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2346r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2348t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2349u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2350v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2351w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2352x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2353y = new int[2];

    public c0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i5, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2354z = ofFloat;
        this.A = 0;
        y yVar = new y(0, this);
        this.B = yVar;
        z zVar = new z(0, this);
        this.f2333c = stateListDrawable;
        this.f2334d = drawable;
        this.f2337g = stateListDrawable2;
        this.f2338h = drawable2;
        this.f2335e = Math.max(i5, stateListDrawable.getIntrinsicWidth());
        this.f2336f = Math.max(i5, drawable.getIntrinsicWidth());
        this.f2339i = Math.max(i5, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i5, drawable2.getIntrinsicWidth());
        this.f2331a = i10;
        this.f2332b = i11;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new a0(this));
        ofFloat.addUpdateListener(new b0(this));
        RecyclerView recyclerView2 = this.f2347s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f2347s.removeOnItemTouchListener(this);
            this.f2347s.removeOnScrollListener(zVar);
            this.f2347s.removeCallbacks(yVar);
        }
        this.f2347s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f2347s.addOnItemTouchListener(this);
        this.f2347s.addOnScrollListener(zVar);
    }

    public static int c(float f6, float f10, int[] iArr, int i5, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i5 - i11;
            int i14 = (int) (((f10 - f6) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    public final boolean a(float f6, float f10) {
        if (f10 < this.f2346r - this.f2339i) {
            return false;
        }
        int i5 = this.f2344o;
        int i10 = this.f2343n;
        return f6 >= ((float) (i5 - (i10 / 2))) && f6 <= ((float) ((i10 / 2) + i5));
    }

    public final boolean b(float f6, float f10) {
        int layoutDirection = this.f2347s.getLayoutDirection();
        int i5 = this.f2335e;
        if (layoutDirection == 1) {
            if (f6 > i5) {
                return false;
            }
        } else if (f6 < this.q - i5) {
            return false;
        }
        int i10 = this.f2341l;
        int i11 = this.f2340k / 2;
        return f10 >= ((float) (i10 - i11)) && f10 <= ((float) (i11 + i10));
    }

    public final void d(int i5) {
        y yVar = this.B;
        StateListDrawable stateListDrawable = this.f2333c;
        if (i5 == 2 && this.f2350v != 2) {
            stateListDrawable.setState(C);
            this.f2347s.removeCallbacks(yVar);
        }
        if (i5 == 0) {
            this.f2347s.invalidate();
        } else {
            e();
        }
        if (this.f2350v == 2 && i5 != 2) {
            stateListDrawable.setState(D);
            this.f2347s.removeCallbacks(yVar);
            this.f2347s.postDelayed(yVar, 1200);
        } else if (i5 == 1) {
            this.f2347s.removeCallbacks(yVar);
            this.f2347s.postDelayed(yVar, 1500);
        }
        this.f2350v = i5;
    }

    public final void e() {
        int i5 = this.A;
        ValueAnimator valueAnimator = this.f2354z;
        if (i5 != 0) {
            if (i5 != 3) {
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

    @Override // androidx.recyclerview.widget.g1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, z1 z1Var) {
        if (this.q != this.f2347s.getWidth() || this.f2346r != this.f2347s.getHeight()) {
            this.q = this.f2347s.getWidth();
            this.f2346r = this.f2347s.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2348t) {
                int i5 = this.q;
                int i10 = this.f2335e;
                int i11 = i5 - i10;
                int i12 = this.f2341l;
                int i13 = this.f2340k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f2333c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f2336f;
                int i16 = this.f2346r;
                Drawable drawable = this.f2334d;
                drawable.setBounds(0, 0, i15, i16);
                if (this.f2347s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i10, i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i10, -i14);
                } else {
                    canvas.translate(i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i11, -i14);
                }
            }
            if (this.f2349u) {
                int i17 = this.f2346r;
                int i18 = this.f2339i;
                int i19 = i17 - i18;
                int i20 = this.f2344o;
                int i21 = this.f2343n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f2337g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.q;
                int i24 = this.j;
                Drawable drawable2 = this.f2338h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, i19);
                drawable2.draw(canvas);
                canvas.translate(i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i22, -i19);
            }
        }
    }
}

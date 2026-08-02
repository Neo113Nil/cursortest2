package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ScrollingPagerIndicator extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f97972a;

    /* renamed from: b, reason: collision with root package name */
    private final int f97973b;

    /* renamed from: c, reason: collision with root package name */
    private final int f97974c;

    /* renamed from: d, reason: collision with root package name */
    private final int f97975d;

    /* renamed from: e, reason: collision with root package name */
    private final int f97976e;

    /* renamed from: f, reason: collision with root package name */
    private int f97977f;

    /* renamed from: g, reason: collision with root package name */
    private int f97978g;

    /* renamed from: h, reason: collision with root package name */
    private int f97979h;

    /* renamed from: i, reason: collision with root package name */
    private float f97980i;

    /* renamed from: j, reason: collision with root package name */
    private float f97981j;

    /* renamed from: k, reason: collision with root package name */
    private float f97982k;

    /* renamed from: l, reason: collision with root package name */
    private SparseArray<Float> f97983l;

    /* renamed from: m, reason: collision with root package name */
    private int f97984m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f97985n;

    /* renamed from: o, reason: collision with root package name */
    private final ArgbEvaluator f97986o;

    /* renamed from: p, reason: collision with root package name */
    private int f97987p;

    /* renamed from: q, reason: collision with root package name */
    private int f97988q;

    /* renamed from: r, reason: collision with root package name */
    private final Drawable f97989r;

    /* renamed from: s, reason: collision with root package name */
    private final Drawable f97990s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f97991t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f97992u;

    /* renamed from: v, reason: collision with root package name */
    private b<?> f97993v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f97994w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f97995x;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f97996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f97997b;

        a(Object obj, b bVar) {
            this.f97996a = obj;
            this.f97997b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollingPagerIndicator scrollingPagerIndicator = ScrollingPagerIndicator.this;
            scrollingPagerIndicator.f97984m = -1;
            scrollingPagerIndicator.c(this.f97996a, this.f97997b);
        }
    }

    public interface b<T> {
        void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull T t2);

        void detachFromPager();
    }

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.scrollingPagerIndicatorStyle);
        this.f97986o = new ArgbEvaluator();
        this.f97994w = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Fm0.a.f9511a, R.attr.scrollingPagerIndicatorStyle, R.style.ScrollingPagerIndicator);
        int color = obtainStyledAttributes.getColor(0, 0);
        this.f97987p = color;
        this.f97988q = obtainStyledAttributes.getColor(2, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f97974c = dimensionPixelSize;
        this.f97975d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.f97973b = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : -1;
        this.f97976e = obtainStyledAttributes.getDimensionPixelSize(5, 0) + dimensionPixelSize;
        this.f97991t = obtainStyledAttributes.getBoolean(8, false);
        int i11 = obtainStyledAttributes.getInt(10, 0);
        if (i11 % 2 == 0) {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
        this.f97977f = i11;
        this.f97972a = i11 + 2;
        if (this.f97992u != null) {
            i();
        } else {
            requestLayout();
        }
        this.f97978g = obtainStyledAttributes.getInt(11, 2);
        this.f97979h = obtainStyledAttributes.getInt(9, 0);
        this.f97989r = obtainStyledAttributes.getDrawable(6);
        this.f97990s = obtainStyledAttributes.getDrawable(7);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f97985n = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            m(i11);
            h(i11 / 2, 0.0f);
        }
    }

    private void b(float f7, int i11) {
        int i12 = this.f97984m;
        int i13 = this.f97977f;
        if (i12 <= i13) {
            this.f97980i = 0.0f;
            return;
        }
        boolean z11 = this.f97991t;
        int i14 = this.f97976e;
        if (z11 || i12 <= i13) {
            this.f97980i = ((i14 * f7) + g(this.f97972a / 2)) - (this.f97981j / 2.0f);
            return;
        }
        this.f97980i = ((i14 * f7) + g(i11)) - (this.f97981j / 2.0f);
        int i15 = this.f97977f / 2;
        float g10 = g((f() - 1) - i15);
        if ((this.f97981j / 2.0f) + this.f97980i < g(i15)) {
            this.f97980i = g(i15) - (this.f97981j / 2.0f);
            return;
        }
        float f11 = this.f97980i;
        float f12 = this.f97981j;
        if ((f12 / 2.0f) + f11 > g10) {
            this.f97980i = g10 - (f12 / 2.0f);
        }
    }

    private int f() {
        return (!this.f97991t || this.f97984m <= this.f97977f) ? this.f97984m : this.f97972a;
    }

    private float g(int i11) {
        return this.f97982k + (i11 * this.f97976e);
    }

    private void j(int i11, float f7) {
        if (this.f97983l == null || f() == 0) {
            return;
        }
        float abs = 1.0f - Math.abs(f7);
        if (abs == 0.0f) {
            this.f97983l.remove(i11);
        } else {
            this.f97983l.put(i11, Float.valueOf(abs));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@NonNull T t2, @NonNull b<T> bVar) {
        e();
        bVar.attachToPager(this, t2);
        this.f97993v = bVar;
        this.f97992u = new a(t2, bVar);
    }

    public final void d(@NonNull RecyclerView recyclerView) {
        c(recyclerView, new d());
    }

    public final void e() {
        b<?> bVar = this.f97993v;
        if (bVar != null) {
            bVar.detachFromPager();
            this.f97993v = null;
            this.f97992u = null;
            this.f97994w = true;
        }
        this.f97995x = false;
    }

    public final void h(int i11, float f7) {
        int i12;
        if (f7 < 0.0f || f7 > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        if (i11 < 0 || (i11 != 0 && i11 >= this.f97984m)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        boolean z11 = this.f97991t;
        int i13 = this.f97979h;
        if (!z11 || ((i12 = this.f97984m) <= this.f97977f && i12 > 1)) {
            this.f97983l.clear();
            if (i13 == 0) {
                j(i11, f7);
                int i14 = this.f97984m;
                if (i11 < i14 - 1) {
                    j(i11 + 1, 1.0f - f7);
                } else if (i14 > 1) {
                    j(0, 1.0f - f7);
                }
            } else {
                j(i11 - 1, f7);
                j(i11, 1.0f - f7);
            }
            invalidate();
        }
        if (i13 == 0) {
            b(f7, i11);
        } else {
            b(f7, i11 - 1);
        }
        invalidate();
    }

    public final void i() {
        Runnable runnable = this.f97992u;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public final void k(int i11) {
        if (i11 != 0 && (i11 < 0 || i11 >= this.f97984m)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.f97984m == 0) {
            return;
        }
        b(0.0f, i11);
        if (!this.f97991t || this.f97984m < this.f97977f) {
            this.f97983l.clear();
            this.f97983l.put(i11, Float.valueOf(1.0f));
            invalidate();
        }
    }

    public final void l(int i11) {
        this.f97987p = i11;
        invalidate();
    }

    public final void m(int i11) {
        if (this.f97984m == i11 && this.f97995x) {
            return;
        }
        this.f97984m = i11;
        this.f97995x = true;
        this.f97983l = new SparseArray<>();
        if (i11 < this.f97978g) {
            requestLayout();
            invalidate();
            return;
        }
        boolean z11 = this.f97991t;
        int i12 = this.f97975d;
        this.f97982k = (!z11 || this.f97984m <= this.f97977f) ? i12 / 2 : 0.0f;
        this.f97981j = ((this.f97977f - 1) * this.f97976e) + i12;
        requestLayout();
        invalidate();
    }

    public final void n(int i11) {
        this.f97988q = i11;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        if (r3 < r13) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onDraw(Canvas canvas) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Drawable drawable;
        float f7;
        int f11 = f();
        if (f11 < this.f97978g) {
            return;
        }
        int i17 = this.f97975d;
        int i18 = this.f97974c;
        int i19 = i17 - i18;
        int i21 = this.f97976e;
        float f12 = ((i19 / 2) + i21) * 0.7f;
        int i22 = i17 / 2;
        float f13 = i22;
        float f14 = i21 * 0.85714287f;
        float f15 = this.f97980i;
        int i23 = ((int) (f15 - this.f97982k)) / i21;
        int g10 = (((int) ((f15 + this.f97981j) - g(i23))) / i21) + i23;
        if (i23 == 0 && g10 + 1 > f11) {
            g10 = f11 - 1;
        }
        int i24 = i23;
        while (i24 <= g10) {
            float g11 = g(i24);
            float f16 = this.f97980i;
            if (g11 >= f16) {
                float f17 = this.f97981j;
                if (g11 < f16 + f17) {
                    boolean z11 = this.f97991t;
                    float f18 = 0.0f;
                    i11 = f11;
                    if (z11) {
                        i12 = i22;
                        if (this.f97984m > this.f97977f) {
                            float f19 = (f17 / 2.0f) + f16;
                            if (g11 >= f19 - f14 && g11 <= f19) {
                                f18 = ((g11 - f19) + f14) / f14;
                            } else if (g11 > f19 && g11 < f19 + f14) {
                                f18 = 1.0f - ((g11 - f19) / f14);
                            }
                            float f21 = f18;
                            float f22 = (i19 * f21) + i18;
                            i15 = this.f97984m;
                            i16 = this.f97977f;
                            i13 = i18;
                            int i25 = this.f97979h;
                            i14 = i19;
                            if (i15 > i16) {
                                float f23 = (z11 || !(i24 == 0 || i24 == i11 + (-1))) ? f12 : f13;
                                int width = getWidth();
                                if (i25 == 1) {
                                    width = getHeight();
                                }
                                float f24 = this.f97980i;
                                float f25 = g11 - f24;
                                int i26 = this.f97973b;
                                if (f25 < f23) {
                                    float f26 = (f25 * f22) / f23;
                                    f7 = i26;
                                    if (f26 > f7) {
                                        if (f26 < f22) {
                                            f22 = f26;
                                        }
                                    }
                                    f22 = f7;
                                } else {
                                    float f27 = width;
                                    if (f25 > f27 - f23) {
                                        f7 = ((((-g11) + f24) + f27) * f22) / f23;
                                        float f28 = i26;
                                        if (f7 <= f28) {
                                            f22 = f28;
                                        }
                                    }
                                }
                                i24++;
                                i18 = i13;
                                f11 = i11;
                                i22 = i12;
                                i19 = i14;
                            }
                            Paint paint = this.f97985n;
                            paint.setColor(((Integer) this.f97986o.evaluate(f21, Integer.valueOf(this.f97987p), Integer.valueOf(this.f97988q))).intValue());
                            drawable = i24 != i23 ? this.f97989r : i24 == g10 ? this.f97990s : null;
                            if (drawable == null) {
                                if (i25 == 0) {
                                    drawable.setBounds((int) ((g11 - this.f97980i) - f13), (getMeasuredHeight() / 2) - i12, (int) ((g11 - this.f97980i) + f13), (getMeasuredHeight() / 2) + i12);
                                } else {
                                    drawable.setBounds((getMeasuredWidth() / 2) - i12, (int) ((g11 - this.f97980i) - f13), (getMeasuredWidth() / 2) + i12, (int) ((g11 - this.f97980i) + f13));
                                }
                                drawable.setTint(paint.getColor());
                                drawable.draw(canvas);
                            } else if (i25 == 0) {
                                float f29 = g11 - this.f97980i;
                                if (this.f97994w && getLayoutDirection() == 1) {
                                    f29 = getWidth() - f29;
                                }
                                canvas.drawCircle(f29, getMeasuredHeight() / 2, f22 / 2.0f, paint);
                            } else {
                                canvas.drawCircle(getMeasuredWidth() / 2, g11 - this.f97980i, f22 / 2.0f, paint);
                            }
                            i24++;
                            i18 = i13;
                            f11 = i11;
                            i22 = i12;
                            i19 = i14;
                        }
                    } else {
                        i12 = i22;
                    }
                    Float f31 = this.f97983l.get(i24);
                    if (f31 != null) {
                        f18 = f31.floatValue();
                    }
                    float f212 = f18;
                    float f222 = (i19 * f212) + i18;
                    i15 = this.f97984m;
                    i16 = this.f97977f;
                    i13 = i18;
                    int i252 = this.f97979h;
                    i14 = i19;
                    if (i15 > i16) {
                    }
                    Paint paint2 = this.f97985n;
                    paint2.setColor(((Integer) this.f97986o.evaluate(f212, Integer.valueOf(this.f97987p), Integer.valueOf(this.f97988q))).intValue());
                    if (i24 != i23) {
                    }
                    if (drawable == null) {
                    }
                    i24++;
                    i18 = i13;
                    f11 = i11;
                    i22 = i12;
                    i19 = i14;
                }
            }
            i11 = f11;
            i12 = i22;
            i13 = i18;
            i14 = i19;
            i24++;
            i18 = i13;
            f11 = i11;
            i22 = i12;
            i19 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r0 != 1073741824) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int mode;
        int size;
        int i15;
        int mode2;
        int i16 = this.f97979h;
        int i17 = this.f97976e;
        int i18 = this.f97975d;
        if (i16 != 0) {
            if (isInEditMode()) {
                i13 = this.f97977f;
            } else {
                i13 = this.f97984m;
                if (i13 >= this.f97977f) {
                    i14 = (int) this.f97981j;
                    mode = View.MeasureSpec.getMode(i11);
                    size = View.MeasureSpec.getSize(i11);
                    if (mode != Integer.MIN_VALUE) {
                        i18 = Math.min(i18, size);
                    }
                    setMeasuredDimension(i18, i14);
                }
            }
            i14 = ((i13 - 1) * i17) + i18;
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
            }
            setMeasuredDimension(i18, i14);
        }
        if (isInEditMode()) {
            i15 = this.f97977f;
        } else {
            i15 = this.f97984m;
            if (i15 >= this.f97977f) {
                size = (int) this.f97981j;
                mode2 = View.MeasureSpec.getMode(i12);
                int size2 = View.MeasureSpec.getSize(i12);
                if (mode2 != Integer.MIN_VALUE) {
                    i18 = Math.min(i18, size2);
                } else if (mode2 == 1073741824) {
                    i18 = size2;
                }
                i14 = i18;
            }
        }
        size = ((i15 - 1) * i17) + i18;
        mode2 = View.MeasureSpec.getMode(i12);
        int size22 = View.MeasureSpec.getSize(i12);
        if (mode2 != Integer.MIN_VALUE) {
        }
        i14 = i18;
        i18 = size;
        setMeasuredDimension(i18, i14);
    }
}

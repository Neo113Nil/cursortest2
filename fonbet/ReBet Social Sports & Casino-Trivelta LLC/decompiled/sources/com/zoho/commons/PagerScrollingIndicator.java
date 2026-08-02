package com.zoho.commons;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.utils.P;
import od.AbstractC5886l;
import od.u;
import od.v;

/* loaded from: classes4.dex */
public class PagerScrollingIndicator extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f42403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42406d;

    /* renamed from: e, reason: collision with root package name */
    public int f42407e;

    /* renamed from: f, reason: collision with root package name */
    public int f42408f;

    /* renamed from: g, reason: collision with root package name */
    public float f42409g;

    /* renamed from: h, reason: collision with root package name */
    public float f42410h;

    /* renamed from: i, reason: collision with root package name */
    public float f42411i;

    /* renamed from: j, reason: collision with root package name */
    public SparseArray f42412j;

    /* renamed from: k, reason: collision with root package name */
    public int f42413k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f42414l;

    /* renamed from: m, reason: collision with root package name */
    public final ArgbEvaluator f42415m;

    /* renamed from: n, reason: collision with root package name */
    public int f42416n;

    /* renamed from: o, reason: collision with root package name */
    public int f42417o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42418p;

    /* renamed from: q, reason: collision with root package name */
    public Runnable f42419q;

    /* renamed from: r, reason: collision with root package name */
    public b f42420r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f42421s;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f42422a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f42423b;

        public a(Object obj, b bVar) {
            this.f42422a = obj;
            this.f42423b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            PagerScrollingIndicator.this.f42413k = -1;
            PagerScrollingIndicator.this.c(this.f42422a, this.f42423b);
        }
    }

    public interface b {
        void a(PagerScrollingIndicator pagerScrollingIndicator, Object obj);

        void b();
    }

    public PagerScrollingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getDotCount() {
        return (!this.f42418p || this.f42413k <= this.f42407e) ? this.f42413k : this.f42403a;
    }

    public final void b(float f10, int i10) {
        int i11 = this.f42413k;
        int i12 = this.f42407e;
        if (i11 <= i12) {
            this.f42409g = 0.0f;
            return;
        }
        if (this.f42418p || i11 <= i12) {
            this.f42409g = (g(this.f42403a / 2) + (this.f42406d * f10)) - (this.f42410h / 2.0f);
            return;
        }
        this.f42409g = (g(i10) + (this.f42406d * f10)) - (this.f42410h / 2.0f);
        int i13 = this.f42407e / 2;
        float g10 = g((getDotCount() - 1) - i13);
        if (this.f42409g + (this.f42410h / 2.0f) < g(i13)) {
            this.f42409g = g(i13) - (this.f42410h / 2.0f);
            return;
        }
        float f11 = this.f42409g;
        float f12 = this.f42410h;
        if (f11 + (f12 / 2.0f) > g10) {
            this.f42409g = g10 - (f12 / 2.0f);
        }
    }

    public void c(Object obj, b bVar) {
        f();
        bVar.a(this, obj);
        this.f42420r = bVar;
        this.f42419q = new a(obj, bVar);
    }

    public void d(RecyclerView recyclerView) {
        c(recyclerView, new com.zoho.commons.a());
    }

    public final int e(float f10) {
        return ((Integer) this.f42415m.evaluate(f10, Integer.valueOf(this.f42416n), Integer.valueOf(this.f42417o))).intValue();
    }

    public void f() {
        b bVar = this.f42420r;
        if (bVar != null) {
            bVar.b();
            this.f42420r = null;
            this.f42419q = null;
        }
        this.f42421s = false;
    }

    public final float g(int i10) {
        return this.f42411i + (i10 * this.f42406d);
    }

    public int getDotColor() {
        return this.f42416n;
    }

    public int getSelectedDotColor() {
        return this.f42417o;
    }

    public int getVisibleDotCount() {
        return this.f42407e;
    }

    public int getVisibleDotThreshold() {
        return this.f42408f;
    }

    public final float h(int i10) {
        Float f10 = (Float) this.f42412j.get(i10);
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    public final void i(int i10) {
        if (this.f42413k == i10 && this.f42421s) {
            return;
        }
        this.f42413k = i10;
        this.f42421s = true;
        this.f42412j = new SparseArray();
        if (i10 < this.f42408f) {
            requestLayout();
            invalidate();
        } else {
            this.f42411i = (!this.f42418p || this.f42413k <= this.f42407e) ? this.f42405c / 2 : 0.0f;
            this.f42410h = ((this.f42407e - 1) * this.f42406d) + this.f42405c;
            requestLayout();
            invalidate();
        }
    }

    public void j(int i10, float f10) {
        int i11;
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        if (i10 < 0 || (i10 != 0 && i10 >= this.f42413k)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        if (!this.f42418p || ((i11 = this.f42413k) <= this.f42407e && i11 > 1)) {
            this.f42412j.clear();
            l(i10, f10);
            int i12 = this.f42413k;
            if (i10 < i12 - 1) {
                l(i10 + 1, 1.0f - f10);
            } else if (i12 > 1) {
                l(0, 1.0f - f10);
            }
            invalidate();
        }
        b(f10, i10);
        invalidate();
    }

    public void k() {
        Runnable runnable = this.f42419q;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public final void l(int i10, float f10) {
        if (this.f42412j == null || getDotCount() == 0) {
            return;
        }
        m(i10, 1.0f - Math.abs(f10));
    }

    public final void m(int i10, float f10) {
        if (f10 == 0.0f) {
            this.f42412j.remove(i10);
        } else {
            this.f42412j.put(i10, Float.valueOf(f10));
        }
    }

    public final void n(int i10) {
        if (!this.f42418p || this.f42413k < this.f42407e) {
            this.f42412j.clear();
            this.f42412j.put(i10, Float.valueOf(1.0f));
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float h10;
        int dotCount = getDotCount();
        if (dotCount < this.f42408f) {
            return;
        }
        int i10 = this.f42406d;
        float f10 = i10 * 0.85714287f;
        float f11 = this.f42409g;
        int i11 = ((int) (f11 - this.f42411i)) / i10;
        int g10 = (((int) ((f11 + this.f42410h) - g(i11))) / this.f42406d) + i11;
        if (i11 == 0 && g10 + 1 > dotCount) {
            g10 = dotCount - 1;
        }
        while (i11 <= g10) {
            float g11 = g(i11);
            float f12 = this.f42409g;
            if (g11 >= f12) {
                float f13 = this.f42410h;
                if (g11 < f12 + f13) {
                    if (!this.f42418p || this.f42413k <= this.f42407e) {
                        h10 = h(i11);
                    } else {
                        float f14 = f12 + (f13 / 2.0f);
                        h10 = (g11 < f14 - f10 || g11 > f14) ? (g11 <= f14 || g11 >= f14 + f10) ? 0.0f : 1.0f - ((g11 - f14) / f10) : ((g11 - f14) + f10) / f10;
                    }
                    float f15 = this.f42404b + ((this.f42405c - r5) * h10);
                    this.f42414l.setColor(e(h10));
                    canvas.drawCircle(g11 - this.f42409g, getMeasuredHeight() / 2, f15 / 2.0f, this.f42414l);
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int mode;
        if (isInEditMode()) {
            i12 = (this.f42407e - 1) * this.f42406d;
            i13 = this.f42405c;
        } else {
            int i15 = this.f42413k;
            if (i15 >= this.f42407e) {
                i14 = (int) this.f42410h;
                mode = View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i11);
                int i16 = this.f42405c;
                if (mode != Integer.MIN_VALUE) {
                    size = Math.min(i16, size);
                } else if (mode != 1073741824) {
                    size = i16;
                }
                setMeasuredDimension(i14, size);
            }
            i12 = (i15 - 1) * this.f42406d;
            i13 = this.f42405c;
        }
        i14 = i12 + i13;
        mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i162 = this.f42405c;
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(i14, size2);
    }

    public void setCurrentPosition(int i10) {
        if (i10 != 0 && (i10 < 0 || i10 >= this.f42413k)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.f42413k == 0) {
            return;
        }
        b(0.0f, i10);
        n(i10);
    }

    public void setDotColor(int i10) {
        this.f42416n = i10;
        invalidate();
    }

    public void setDotCount(int i10) {
        i(i10);
    }

    public void setSelectedDotColor(int i10) {
        this.f42417o = i10;
        invalidate();
    }

    public void setVisibleDotCount(int i10) {
        if (i10 % 2 == 0) {
            throw new IllegalArgumentException("siq_scrollingindicator_maximum_dotcount must be odd");
        }
        this.f42407e = i10;
        this.f42403a = i10 + 2;
        if (this.f42419q != null) {
            k();
        } else {
            requestLayout();
        }
    }

    public void setVisibleDotThreshold(int i10) {
        this.f42408f = i10;
        if (this.f42419q != null) {
            k();
        } else {
            requestLayout();
        }
    }

    public PagerScrollingIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42415m = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.PagerScrollingIndicator, i10, u.f61159e);
        this.f42416n = P.e(context, AbstractC5886l.f59780V2);
        this.f42417o = P.e(context, AbstractC5886l.f59784W2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(v.f61168d, 0);
        this.f42404b = dimensionPixelSize;
        this.f42405c = obtainStyledAttributes.getDimensionPixelSize(v.f61167c, 0);
        this.f42406d = obtainStyledAttributes.getDimensionPixelSize(v.f61169e, 0) + dimensionPixelSize;
        this.f42418p = obtainStyledAttributes.getBoolean(v.f61170f, false);
        int i11 = obtainStyledAttributes.getInt(v.f61171g, 0);
        setVisibleDotCount(i11);
        this.f42408f = obtainStyledAttributes.getInt(v.f61172h, 2);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f42414l = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i11);
            j(i11 / 2, 0.0f);
        }
    }
}

package com.vk.emoji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import xsna.dgh0;
import xsna.k46;
import xsna.krv0;
import xsna.too0;

/* loaded from: classes18.dex */
public class FastScroller extends View implements too0 {
    public static final a u = new a(Integer.class, "paddingBottom");
    public static final b v = new b(Integer.class, "paddingTop");
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public int k;
    public Integer l;
    public Integer m;
    public RecyclerView n;
    public dgh0 o;
    public final c p;
    public float q;
    public float r;
    public int s;
    public boolean t;

    public class a extends Property<FastScroller, Integer> {
        @Override // android.util.Property
        public final Integer get(FastScroller fastScroller) {
            return Integer.valueOf(fastScroller.getPaddingBottom());
        }

        @Override // android.util.Property
        public final void set(FastScroller fastScroller, Integer num) {
            fastScroller.setPaddingBottom(num.intValue());
        }
    }

    public class b extends Property<FastScroller, Integer> {
        @Override // android.util.Property
        public final Integer get(FastScroller fastScroller) {
            return Integer.valueOf(fastScroller.getPaddingTop());
        }

        @Override // android.util.Property
        public final void set(FastScroller fastScroller, Integer num) {
            fastScroller.setPaddingTop(num.intValue());
        }
    }

    public class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            a aVar = FastScroller.u;
            FastScroller fastScroller = FastScroller.this;
            if (fastScroller.t) {
                return;
            }
            fastScroller.setProgress(recyclerView.computeVerticalScrollOffset() / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()));
        }
    }

    public FastScroller(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new RectF();
        this.j = -11433012;
        this.k = -3880756;
        this.l = null;
        this.m = null;
        this.p = new c();
        this.r = -1.0f;
        this.s = -1;
        this.t = false;
        setTrackColor(-3880756);
        setHandleColor(-11433012);
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.e = (int) k46.a(context, 8.0f);
        this.f = (int) k46.a(context, 1.0f);
        this.g = (int) k46.a(context, 3.0f);
        this.h = (int) k46.a(context, 32.0f);
        this.i = (int) k46.a(context, 1.5f);
    }

    private int getHandlePathLength() {
        int i = this.h / 2;
        return (((getMeasuredHeight() - this.e) - getPaddingBottom()) - i) - ((getPaddingTop() + this.e) + i);
    }

    @Override // xsna.too0
    public final void Ng() {
        Integer num = this.l;
        if (num != null) {
            setHandleColorAttr(num.intValue());
        }
        Integer num2 = this.m;
        if (num2 != null) {
            setTrackColorAttr(num2.intValue());
        }
    }

    public int getHandleColor() {
        return this.j;
    }

    public float getProgress() {
        return this.q;
    }

    public int getTrackColor() {
        return this.k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth() / 2;
        float f = width - (this.f / 2);
        float paddingTop = getPaddingTop() + this.e;
        float f2 = (this.f / 2) + width;
        float height = (canvas.getHeight() - this.e) - getPaddingBottom();
        RectF rectF = this.d;
        rectF.set(f, paddingTop, f2, height);
        canvas.drawRect(rectF, this.c);
        int handlePathLength = (int) ((getHandlePathLength() * this.q) + getPaddingTop() + this.e + (this.h / 2));
        int i = this.g;
        rectF.set(width - (i / 2), handlePathLength - r1, (i / 2) + width, handlePathLength + r1);
        int i2 = this.i;
        canvas.drawRoundRect(rectF, i2, i2, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) k46.a(getContext(), 20.0f), 1073741824), i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int y = (int) motionEvent.getY();
        if (action == 0 || action == 5) {
            this.r = this.q;
            this.s = y;
            this.t = true;
            return true;
        }
        if (action == 1 || action == 3) {
            this.r = -1.0f;
            this.s = -1;
            this.t = false;
            RecyclerView recyclerView = this.n;
            setProgress(recyclerView.computeVerticalScrollOffset() / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()));
            return true;
        }
        if (action == 2) {
            RecyclerView recyclerView2 = this.n;
            if (recyclerView2 != null) {
                recyclerView2.stopScroll();
            }
            setProgress(this.r + ((y - this.s) / getHandlePathLength()));
            if (this.o != null && (this.n.getLayoutManager() instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) this.n.getLayoutManager()).K(this.o.j0(getProgress()), 0);
            }
        }
        return true;
    }

    public void setHandleColor(int i) {
        this.j = i;
        this.l = null;
        this.b.setColor(i);
        invalidate();
    }

    public void setHandleColorAttr(int i) {
        setHandleColor(krv0.l(i));
        this.l = Integer.valueOf(i);
    }

    public void setPaddingBottom(int i) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        invalidate();
    }

    public void setPaddingTop(int i) {
        setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
        invalidate();
    }

    public void setProgress(float f) {
        this.q = Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        invalidate();
    }

    public void setTrackColor(int i) {
        this.k = i;
        this.c.setColor(i);
        invalidate();
    }

    public void setTrackColorAttr(int i) {
        setTrackColor(krv0.l(i));
        this.m = Integer.valueOf(i);
    }
}

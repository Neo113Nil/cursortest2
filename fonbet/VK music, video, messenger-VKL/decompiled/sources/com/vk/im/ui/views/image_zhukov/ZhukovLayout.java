package com.vk.im.ui.views.image_zhukov;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.vk.im.ui.views.image_zhukov.a;
import com.vk.ui.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b6y0;
import xsna.e6y0;
import xsna.f6y0;
import xsna.g6y0;
import xsna.hp10;
import xsna.m900;
import xsna.svb0;
import xsna.tgw;
import xsna.tvb0;

/* loaded from: classes2.dex */
public class ZhukovLayout extends ViewGroup {
    public static final m900<a.C1181a, a.b> n = new m900<>(100);

    @Nullable
    public f6y0 b;
    public final a.C1181a c;
    public final a.b d;
    public final ArrayList e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public b6y0 m;

    public ZhukovLayout(Context context) {
        super(context);
        this.c = new a.C1181a();
        this.d = new a.b();
        this.e = new ArrayList(10);
        b(context, null);
    }

    private void setDividerSize(int i) {
        if (this.l != i) {
            this.l = i;
            this.f = true;
            requestLayout();
            invalidate();
        }
    }

    private void setItemMinSize(int i) {
        if (this.k != i) {
            this.k = i;
            this.f = true;
            requestLayout();
            invalidate();
        }
    }

    public final g6y0 a(int i) {
        return (g6y0) this.e.get(i);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f = false;
        this.g = 0;
        this.h = 0;
        TypedArray obtainStyledAttributes = attributeSet == null ? context.obtainStyledAttributes(new int[0]) : context.obtainStyledAttributes(attributeSet, R$styleable.G, 0, 0);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setDividerSize(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        setItemMinSize(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        setAdapter(null);
    }

    public final void c() {
        f6y0 f6y0Var = this.b;
        ArrayList arrayList = this.e;
        if (f6y0Var != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g6y0 g6y0Var = (g6y0) it.next();
                SparseArray<svb0<g6y0>> sparseArray = f6y0Var.a;
                int i = g6y0Var.c;
                svb0<g6y0> svb0Var = sparseArray.get(i);
                if (svb0Var == null) {
                    svb0Var = new tvb0<>(30);
                }
                sparseArray.append(i, svb0Var);
                svb0Var.a(g6y0Var);
            }
        }
        arrayList.clear();
        a.C1181a c1181a = this.c;
        c1181a.g.clear();
        a.b bVar = this.d;
        bVar.b.clear();
        removeAllViews();
        b6y0 b6y0Var = this.m;
        if (b6y0Var != null) {
            int a = b6y0Var.a();
            for (int i2 = 0; i2 < a; i2++) {
                int c = this.m.c(i2);
                svb0<g6y0> svb0Var2 = this.b.a.get(c);
                g6y0 c2 = svb0Var2 != null ? svb0Var2.c() : null;
                if (c2 == null) {
                    c2 = this.m.f(this, c);
                }
                this.m.e(c2, i2);
                arrayList.add(c2);
                super.addView(c2.b);
                e6y0 e6y0Var = new e6y0();
                this.m.b(i2, e6y0Var);
                c1181a.g.add(e6y0Var);
                bVar.b.add(new Rect());
            }
        }
        this.f = true;
        requestLayout();
        invalidate();
    }

    public b6y0<? extends g6y0> getAdapter() {
        return this.m;
    }

    public int getMaximumHeight() {
        return this.j;
    }

    public int getMaximumWidth() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = ((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft()) - (this.g / 2);
        int measuredHeight = ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop()) - (this.h / 2);
        int childCount = getChildCount();
        if (this.m == null || childCount == 0) {
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Rect rect = (Rect) this.d.b.get(i5);
            childAt.layout(rect.left + measuredWidth, rect.top + measuredHeight, rect.right + measuredWidth, rect.bottom + measuredHeight);
        }
        if (this.f) {
            int childCount2 = getChildCount();
            if (childCount2 != 0) {
                View view = null;
                View view2 = null;
                View view3 = null;
                View view4 = null;
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = getChildAt(i6);
                    if (view == null || childAt2.getLeft() < view.getLeft() || childAt2.getTop() < view.getTop()) {
                        view = childAt2;
                    }
                    if (view2 == null || childAt2.getRight() > view2.getRight() || childAt2.getTop() < view2.getTop()) {
                        view2 = childAt2;
                    }
                    if (view3 == null || childAt2.getRight() > view3.getRight() || childAt2.getBottom() > view3.getBottom()) {
                        view3 = childAt2;
                    }
                    if (view4 == null || childAt2.getLeft() < view4.getLeft() || childAt2.getBottom() > view4.getBottom()) {
                        view4 = childAt2;
                    }
                }
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt3 = getChildAt(i7);
                    this.m.d((g6y0) this.e.get(i7), childAt3 == view, childAt3 == view2, childAt3 == view4, childAt3 == view3);
                }
            }
            this.f = false;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth = getMaximumWidth();
        int maximumHeight = getMaximumHeight();
        int childCount = getChildCount();
        if (this.m == null || childCount == 0) {
            setMeasuredDimension(hp10.b(i, suggestedMinimumWidth, maximumWidth, paddingRight), hp10.b(i2, suggestedMinimumHeight, maximumHeight, paddingBottom));
            return;
        }
        if (childCount == 1) {
            aVar = b.a;
        } else if (childCount == 2) {
            aVar = c.b;
        } else if (childCount == 3) {
            aVar = d.b;
        } else if (childCount == 4) {
            aVar = e.a;
        } else if (childCount < 5 || childCount > 10) {
            com.vk.metrics.eventtracking.b.a.a(new UnsupportedOperationException(tgw.b(childCount, "No strategy to support ", " items")));
            aVar = f.h;
        } else {
            aVar = f.h;
        }
        int a = hp10.a(i, suggestedMinimumWidth, maximumWidth, paddingRight);
        int a2 = hp10.a(i2, suggestedMinimumHeight, maximumHeight, paddingBottom);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE);
        a.C1181a c1181a = this.c;
        c1181a.a = makeMeasureSpec;
        c1181a.b = View.MeasureSpec.makeMeasureSpec(a2, Integer.MIN_VALUE);
        c1181a.c = Math.min(a, maximumWidth);
        c1181a.d = Math.min(a2, maximumHeight);
        c1181a.e = this.l;
        c1181a.f = this.k;
        m900<a.C1181a, a.b> m900Var = n;
        a.b bVar = m900Var.get(c1181a);
        a.b bVar2 = this.d;
        if (bVar != null) {
            bVar2.a(bVar);
        } else {
            aVar.a(c1181a, bVar2);
            a.C1181a c1181a2 = new a.C1181a();
            c1181a2.a = c1181a.a;
            c1181a2.b = c1181a.b;
            c1181a2.c = c1181a.c;
            c1181a2.d = c1181a.d;
            c1181a2.e = c1181a.e;
            c1181a2.f = c1181a.f;
            c1181a2.g.addAll(c1181a.g);
            bVar2.getClass();
            a.b bVar3 = new a.b();
            bVar3.a(bVar2);
            m900Var.put(c1181a2, bVar3);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Rect rect = (Rect) bVar2.b.get(i3);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
        }
        e6y0 e6y0Var = bVar2.a;
        int i4 = paddingRight + e6y0Var.a;
        this.g = i4;
        this.h = paddingBottom + e6y0Var.b;
        setMeasuredDimension(hp10.b(i, suggestedMinimumWidth, maximumWidth, i4), hp10.b(i2, suggestedMinimumHeight, maximumHeight, this.h));
    }

    public void setAdapter(b6y0<? extends g6y0> b6y0Var) {
        b6y0 b6y0Var2 = this.m;
        if (b6y0Var2 != null && b6y0Var2.a() > 10) {
            throw new IllegalArgumentException("Adapter size must be <= 10");
        }
        b6y0 b6y0Var3 = this.m;
        if (b6y0Var3 != null) {
            b6y0Var3.a = null;
        }
        this.m = b6y0Var;
        if (b6y0Var != null) {
            b6y0Var.a = this;
        }
        c();
    }

    public void setMaximumHeight(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumWidth(int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        requestLayout();
        invalidate();
    }

    public void setPools(f6y0 f6y0Var) {
        this.b = f6y0Var;
    }

    public ZhukovLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new a.C1181a();
        this.d = new a.b();
        this.e = new ArrayList(10);
        b(context, attributeSet);
    }

    public ZhukovLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new a.C1181a();
        this.d = new a.b();
        this.e = new ArrayList(10);
        b(context, attributeSet);
    }

    public ZhukovLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new a.C1181a();
        this.d = new a.b();
        this.e = new ArrayList(10);
        b(context, attributeSet);
    }
}

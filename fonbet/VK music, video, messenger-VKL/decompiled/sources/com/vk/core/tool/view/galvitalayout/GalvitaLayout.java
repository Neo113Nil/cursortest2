package com.vk.core.tool.view.galvitalayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.galvitalayout.ChildSize;
import com.vk.core.tool.view.galvitalayout.a;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a6t;
import xsna.c6t;
import xsna.d6t;
import xsna.jw5;
import xsna.o5t;
import xsna.ruj;
import xsna.svb0;
import xsna.tvb0;
import xsna.uzt0;

/* compiled from: GalvitaLayout.kt */
/* loaded from: classes17.dex */
public final class GalvitaLayout extends ViewGroup {
    public static final LruCache<a.C0782a, a.b> k = new LruCache<>(100);
    public int b;
    public int c;
    public o5t<?> d;
    public a e;
    public c6t f;
    public final com.vk.core.tool.view.galvitalayout.a g;
    public final a.C0782a h;
    public final a.b i;
    public final ArrayList j;

    /* compiled from: GalvitaLayout.kt */
    public static abstract class a {
        public abstract void a(Canvas canvas, GalvitaLayout galvitaLayout);
    }

    public GalvitaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = Integer.MAX_VALUE;
        this.g = new com.vk.core.tool.view.galvitalayout.a();
        this.h = new a.C0782a(0);
        this.i = new a.b(0);
        this.j = new ArrayList(10);
    }

    public final void a() {
        d6t d;
        c6t c6tVar = this.f;
        ArrayList arrayList = this.j;
        if (c6tVar != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d6t d6tVar = (d6t) it.next();
                SparseArray<svb0<d6t>> sparseArray = c6tVar.a;
                int i = d6tVar.b;
                svb0<d6t> svb0Var = sparseArray.get(i);
                if (svb0Var == null) {
                    svb0Var = new tvb0<>(30);
                }
                sparseArray.append(i, svb0Var);
                svb0Var.a(d6tVar);
            }
        }
        arrayList.clear();
        a.C0782a c0782a = this.h;
        c0782a.a();
        this.i.a();
        removeAllViews();
        o5t<?> o5tVar = this.d;
        if (o5tVar == null) {
            return;
        }
        int size = o5tVar.a.size();
        if (size > 10) {
            size = 10;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int b2 = o5tVar.b(i2);
            c6t c6tVar2 = this.f;
            if (c6tVar2 != null) {
                svb0<d6t> svb0Var2 = c6tVar2.a.get(b2);
                d = svb0Var2 != null ? svb0Var2.c() : null;
                if (d != null) {
                    o5tVar.c(d, i2);
                    arrayList.add(d);
                    addView(d.a);
                    c0782a.b = size;
                    ChildSize[] childSizeArr = c0782a.a;
                    float a2 = o5tVar.a(i2);
                    ChildSize.Companion.getClass();
                    childSizeArr[i2] = ChildSize.a.a(a2);
                }
            }
            d = o5tVar.d(this, b2);
            o5tVar.c(d, i2);
            arrayList.add(d);
            addView(d.a);
            c0782a.b = size;
            ChildSize[] childSizeArr2 = c0782a.a;
            float a22 = o5tVar.a(i2);
            ChildSize.Companion.getClass();
            childSizeArr2[i2] = ChildSize.a.a(a22);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new b(layoutParams) : new b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = this.h.b;
        for (int i6 = 0; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null) {
                Rect rect = this.i.a[i6];
                childAt.layout(rect.left + paddingLeft, rect.top + paddingTop, rect.right + paddingLeft, rect.bottom + paddingTop);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a.C0782a c0782a = this.h;
        c0782a.d = i;
        c0782a.e = i2;
        c0782a.f = getPaddingRight() + getPaddingLeft();
        c0782a.g = getPaddingBottom() + getPaddingTop();
        c0782a.h = getSuggestedMinimumWidth();
        c0782a.j = getSuggestedMinimumHeight();
        c0782a.i = this.c;
        c0782a.c = this.b;
        LruCache<a.C0782a, a.b> lruCache = k;
        a.b bVar = lruCache.get(c0782a);
        a.b bVar2 = this.i;
        if (bVar != null) {
            bVar2.b(bVar);
        } else {
            bVar2.a();
            this.g.b(c0782a, bVar2);
            a.C0782a c0782a2 = new a.C0782a(0);
            jw5.k(c0782a.a, 0, c0782a2.a, 0, 14);
            c0782a2.b = c0782a.b;
            c0782a2.c = c0782a.c;
            c0782a2.d = c0782a.d;
            c0782a2.e = c0782a.e;
            c0782a2.f = c0782a.f;
            c0782a2.g = c0782a.g;
            c0782a2.h = c0782a.h;
            c0782a2.i = c0782a.i;
            c0782a2.j = c0782a.j;
            c0782a2.k = c0782a.k;
            a.b bVar3 = new a.b(0);
            bVar3.b(bVar2);
            lruCache.put(c0782a2, bVar3);
        }
        int i3 = c0782a.b;
        int i4 = 0;
        while (i4 < i3) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                Rect rect = bVar2.a[i4];
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(rect.width(), 1073741823)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(rect.height(), 1073741823)), 1073741824));
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                b bVar4 = layoutParams instanceof b ? (b) layoutParams : null;
                if (bVar4 != null) {
                    ruj rujVar = bVar2.b;
                    uzt0 uzt0Var = bVar4.a.a;
                    rujVar.getClass();
                    uzt0Var.a = i4 == 0;
                    uzt0Var.b = rujVar.a == i4;
                    uzt0Var.c = rujVar.b == i4;
                    uzt0Var.d = rujVar.c == i4;
                }
            }
            i4++;
        }
        setMeasuredDimension(bVar2.c + c0782a.f, bVar2.d + c0782a.g);
    }

    public final void setAdapter(o5t<?> o5tVar) {
        o5t<?> o5tVar2 = this.d;
        if (o5tVar2 != null) {
            o5tVar2.b = null;
        }
        this.d = o5tVar;
        if (o5tVar != null) {
            o5tVar.b = this;
        }
        a();
    }

    public final void setDecoration(a aVar) {
        this.e = aVar;
        setWillNotDraw(aVar == null);
        invalidate();
    }

    public final void setGap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setMaximumWidth(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setViewPool(c6t c6tVar) {
        this.f = c6tVar;
    }

    /* compiled from: GalvitaLayout.kt */
    public static final class b extends ViewGroup.MarginLayoutParams {
        public final a6t a;

        public b() {
            super(-2, -2);
            this.a = new a6t((uzt0) null, 3);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = new a6t((uzt0) null, 3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = new a6t((uzt0) null, 3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }
}

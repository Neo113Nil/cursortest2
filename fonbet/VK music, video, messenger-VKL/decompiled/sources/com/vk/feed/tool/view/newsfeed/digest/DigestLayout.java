package com.vk.feed.tool.view.newsfeed.digest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.gp10;
import xsna.mym;
import xsna.svb0;
import xsna.tvb0;

/* loaded from: classes18.dex */
public class DigestLayout extends GridLayout {
    public static final GridLayout.Spec f = GridLayout.spec(Integer.MIN_VALUE, 1);
    public static final GridLayout.Spec g = GridLayout.spec(Integer.MIN_VALUE, 2);
    public int b;
    public a c;
    public final ArrayList d;
    public final c e;

    public static abstract class a<T> {

        @Nullable
        public DigestLayout a = null;
        public final ArrayList b = new ArrayList();

        public abstract int a(int i);

        public abstract int b(int i);

        public abstract void c(d<T> dVar, int i);

        public abstract mym d(DigestLayout digestLayout, int i);
    }

    public static class b extends GridLayout.LayoutParams {
        public d a;
    }

    public static class c {
        public final SparseArray<svb0<d>> a = new SparseArray<>(2);
    }

    public static abstract class d<T> {
        public final View b;
        public int c = Integer.MIN_VALUE;
        public int d = -1;

        public d(DigestLayout digestLayout) {
            this.b = LayoutInflater.from(digestLayout.getContext()).inflate(R.layout.news_digest_media_item, (ViewGroup) digestLayout, false);
        }

        public abstract void a(T t);
    }

    public DigestLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 0;
        this.c = null;
        this.d = new ArrayList();
        this.e = new c();
    }

    public final void a() {
        c cVar = this.e;
        cVar.getClass();
        SparseArray<svb0<d>> sparseArray = cVar.a;
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            ViewGroup.LayoutParams layoutParams = dVar.b.getLayoutParams();
            if (layoutParams instanceof b) {
                ((b) layoutParams).a = null;
            }
            svb0<d> svb0Var = sparseArray.get(dVar.c);
            if (svb0Var == null) {
                svb0Var = new tvb0<>(30);
            }
            sparseArray.append(dVar.c, svb0Var);
            svb0Var.a(dVar);
        }
        arrayList.clear();
        removeAllViews();
        a aVar = this.c;
        if (aVar != null) {
            int size = aVar.b.size();
            for (int i = 0; i < size; i++) {
                int b2 = aVar.b(i);
                svb0<d> svb0Var2 = sparseArray.get(b2);
                d c2 = svb0Var2 != null ? svb0Var2.c() : null;
                if (c2 == null) {
                    c2 = aVar.d(this, b2);
                }
                c2.c = b2;
                View view = c2.b;
                c2.d = i;
                aVar.c(c2, i);
                arrayList.add(c2);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!checkLayoutParams(layoutParams2)) {
                    layoutParams2 = new b(super.generateDefaultLayoutParams());
                }
                if (layoutParams2 instanceof b) {
                    ((b) layoutParams2).a = c2;
                }
                addView(view, layoutParams2);
            }
        }
        requestLayout();
        invalidate();
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(super.generateDefaultLayoutParams());
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(super.generateLayoutParams(layoutParams));
    }

    @Override // android.widget.GridLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int a2 = gp10.a(i, getSuggestedMinimumWidth(), Integer.MAX_VALUE, getPaddingRight() + getPaddingLeft());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                if (this.c.a(i3) == 1) {
                    b bVar = (b) childAt.getLayoutParams();
                    int columnCount = a2 / getColumnCount();
                    int i4 = this.b;
                    int i5 = columnCount - i4;
                    ((GridLayout.LayoutParams) bVar).width = i5;
                    ((GridLayout.LayoutParams) bVar).height = i5;
                    GridLayout.Spec spec = f;
                    ((GridLayout.LayoutParams) bVar).rowSpec = spec;
                    ((GridLayout.LayoutParams) bVar).columnSpec = spec;
                    ((GridLayout.LayoutParams) bVar).rightMargin = i4;
                    ((GridLayout.LayoutParams) bVar).bottomMargin = i4;
                } else {
                    b bVar2 = (b) childAt.getLayoutParams();
                    int columnCount2 = (a2 / getColumnCount()) * 2;
                    int i6 = this.b;
                    int i7 = columnCount2 - i6;
                    ((GridLayout.LayoutParams) bVar2).width = i7;
                    ((GridLayout.LayoutParams) bVar2).height = i7;
                    GridLayout.Spec spec2 = g;
                    ((GridLayout.LayoutParams) bVar2).rowSpec = spec2;
                    ((GridLayout.LayoutParams) bVar2).columnSpec = spec2;
                    ((GridLayout.LayoutParams) bVar2).rightMargin = i6;
                    ((GridLayout.LayoutParams) bVar2).bottomMargin = i6;
                }
            }
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - this.b);
    }

    public void setAdapter(a aVar) {
        this.c = aVar;
        aVar.a = this;
        a();
    }

    public void setItemSpacing(int i) {
        int paddingRight = (getPaddingRight() + this.b) - i;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        this.b = i;
        setPadding(getPaddingLeft(), getPaddingTop(), paddingRight, getPaddingBottom());
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final GridLayout.LayoutParams generateDefaultLayoutParams() {
        return new b(super.generateDefaultLayoutParams());
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final GridLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(super.generateLayoutParams(layoutParams));
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(super.generateLayoutParams(attributeSet));
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final GridLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(super.generateLayoutParams(attributeSet));
    }
}

package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.flexbox.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.eor;
import xsna.iut0;
import xsna.lhg;

/* loaded from: classes12.dex */
public class FlexboxLayout extends ViewGroup implements eor {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    @Nullable
    public Drawable h;

    @Nullable
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int[] n;
    public SparseIntArray o;
    public final b p;
    public List<a> q;
    public final b.a r;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = -1;
        this.p = new b(this);
        this.q = new ArrayList();
        this.r = new b.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        this.b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(6, 0);
        this.d = obtainStyledAttributes.getInt(7, 0);
        this.e = obtainStyledAttributes.getInt(1, 0);
        this.f = obtainStyledAttributes.getInt(0, 0);
        this.g = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = obtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.k = i;
            this.j = i;
        }
        int i2 = obtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.k = i2;
        }
        int i3 = obtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.eor
    public final int a(int i, int i2, View view) {
        int i3;
        int i4;
        if (m()) {
            i3 = p(i, i2) ? this.m : 0;
            if ((this.k & 4) <= 0) {
                return i3;
            }
            i4 = this.m;
        } else {
            i3 = p(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        }
        return i3 + i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.o == null) {
            this.o = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.o;
        b bVar = this.p;
        eor eorVar = bVar.a;
        int flexItemCount = eorVar.getFlexItemCount();
        ArrayList f = bVar.f(flexItemCount);
        b.C0110b c0110b = new b.C0110b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0110b.c = 1;
        } else {
            c0110b.c = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            c0110b.b = flexItemCount;
        } else if (i < eorVar.getFlexItemCount()) {
            c0110b.b = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((b.C0110b) f.get(i2)).b++;
            }
        } else {
            c0110b.b = flexItemCount;
        }
        f.add(c0110b);
        this.n = b.r(flexItemCount + 1, f, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    public final void b(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.q.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View o = o(i3);
                if (o != null && o.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? o.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (o.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.m, aVar.b, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.k & 4) > 0) {
                        n(canvas, z ? (o.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.m : o.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.b, aVar.g);
                    }
                }
            }
            if (q(i)) {
                e(canvas, paddingLeft, z2 ? aVar.d : aVar.b - this.l, max);
            }
            if (r(i) && (this.j & 4) > 0) {
                e(canvas, paddingLeft, z2 ? aVar.b - this.l : aVar.d, max);
            }
        }
    }

    @Override // xsna.eor
    public final int c(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.q.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View o = o(i3);
                if (o != null && o.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                    if (p(i3, i2)) {
                        e(canvas, aVar.a, z2 ? o.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (o.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.l, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.j & 4) > 0) {
                        e(canvas, aVar.a, z2 ? (o.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.l : o.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? aVar.c : aVar.a - this.m, paddingTop, max);
            }
            if (r(i) && (this.k & 4) > 0) {
                n(canvas, z ? aVar.a - this.m : aVar.c, paddingTop, max);
            }
        }
    }

    public final void e(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.l + i2);
        this.h.draw(canvas);
    }

    @Override // xsna.eor
    public final void f(a aVar) {
        if (m()) {
            if ((this.k & 4) > 0) {
                int i = aVar.e;
                int i2 = this.m;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.j & 4) > 0) {
            int i3 = aVar.e;
            int i4 = this.l;
            aVar.e = i3 + i4;
            aVar.f += i4;
        }
    }

    @Override // xsna.eor
    public final void g(View view, int i, int i2, a aVar) {
        if (p(i, i2)) {
            if (m()) {
                int i3 = aVar.e;
                int i4 = this.m;
                aVar.e = i3 + i4;
                aVar.f += i4;
                return;
            }
            int i5 = aVar.e;
            int i6 = this.l;
            aVar.e = i5 + i6;
            aVar.f += i6;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // xsna.eor
    public int getAlignContent() {
        return this.f;
    }

    @Override // xsna.eor
    public int getAlignItems() {
        return this.e;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.h;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.i;
    }

    @Override // xsna.eor
    public int getFlexDirection() {
        return this.b;
    }

    @Override // xsna.eor
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.q.size());
        for (a aVar : this.q) {
            if (aVar.a() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // xsna.eor
    public List<a> getFlexLinesInternal() {
        return this.q;
    }

    @Override // xsna.eor
    public int getFlexWrap() {
        return this.c;
    }

    public int getJustifyContent() {
        return this.d;
    }

    @Override // xsna.eor
    public int getLargestMainSize() {
        Iterator<a> it = this.q.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().e);
        }
        return i;
    }

    @Override // xsna.eor
    public int getMaxLine() {
        return this.g;
    }

    public int getShowDividerHorizontal() {
        return this.j;
    }

    public int getShowDividerVertical() {
        return this.k;
    }

    @Override // xsna.eor
    public int getSumOfCrossSize() {
        int size = this.q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.q.get(i2);
            if (q(i2)) {
                i += m() ? this.l : this.m;
            }
            if (r(i2)) {
                i += m() ? this.l : this.m;
            }
            i += aVar.g;
        }
        return i;
    }

    @Override // xsna.eor
    public final View h(int i) {
        return getChildAt(i);
    }

    @Override // xsna.eor
    public final int i(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // xsna.eor
    public final View j(int i) {
        return o(i);
    }

    @Override // xsna.eor
    public final int k(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // xsna.eor
    public final boolean m() {
        int i = this.b;
        return i == 0 || i == 1;
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.m + i, i3 + i2);
        this.i.draw(canvas);
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.n;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i == null && this.h == null) {
            return;
        }
        if (this.j == 0 && this.k == 0) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        int i = this.b;
        if (i == 0) {
            b(canvas, layoutDirection == 1, this.c == 2);
            return;
        }
        if (i == 1) {
            b(canvas, layoutDirection != 1, this.c == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.c == 2) {
                z = !z;
            }
            d(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.c == 2) {
            z2 = !z2;
        }
        d(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.b;
        if (i5 == 0) {
            s(i, i2, i3, i4, layoutDirection == 1);
            return;
        }
        if (i5 == 1) {
            s(i, i2, i3, i4, layoutDirection != 1);
            return;
        }
        if (i5 == 2) {
            boolean z2 = false;
            if (layoutDirection == 1) {
                z2 = true;
            }
            if (this.c == 2) {
                z2 = !z2;
            }
            t(i, i2, i3, i4, z2, false);
            return;
        }
        if (i5 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.b);
        }
        boolean z3 = layoutDirection == 1;
        if (this.c == 2) {
            z3 = !z3;
        }
        t(i, i2, i3, i4, z3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        b.a aVar;
        if (this.o == null) {
            this.o = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.o;
        b bVar = this.p;
        eor eorVar = bVar.a;
        int flexItemCount = eorVar.getFlexItemCount();
        if (sparseIntArray.size() == flexItemCount) {
            for (int i4 = 0; i4 < flexItemCount; i4++) {
                View h = eorVar.h(i4);
                if (h == null || ((FlexItem) h.getLayoutParams()).getOrder() == sparseIntArray.get(i4)) {
                }
            }
            i3 = this.b;
            aVar = this.r;
            if (i3 == 0 && i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("Invalid value for the flex direction is set: " + this.b);
                }
                this.q.clear();
                aVar.a = null;
                aVar.b = 0;
                this.p.b(this.r, i2, i, Integer.MAX_VALUE, 0, -1, null);
                this.q = aVar.a;
                bVar.h(i, i2, 0);
                bVar.g(i, i2, getPaddingRight() + getPaddingLeft());
                bVar.u(0);
                u(this.b, i, i2, aVar.b);
                return;
            }
            this.q.clear();
            aVar.a = null;
            aVar.b = 0;
            this.p.b(this.r, i, i2, Integer.MAX_VALUE, 0, -1, null);
            this.q = aVar.a;
            bVar.h(i, i2, 0);
            if (this.e == 3) {
                for (a aVar2 : this.q) {
                    int i5 = Integer.MIN_VALUE;
                    for (int i6 = 0; i6 < aVar2.h; i6++) {
                        View o = o(aVar2.o + i6);
                        if (o != null && o.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                            i5 = this.c != 2 ? Math.max(i5, o.getMeasuredHeight() + Math.max(aVar2.l - o.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i5, o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(o.getBaseline() + (aVar2.l - o.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                    aVar2.g = i5;
                }
            }
            bVar.g(i, i2, getPaddingBottom() + getPaddingTop());
            bVar.u(0);
            u(this.b, i, i2, aVar.b);
        }
        SparseIntArray sparseIntArray2 = this.o;
        int flexItemCount2 = bVar.a.getFlexItemCount();
        this.n = b.r(flexItemCount2, bVar.f(flexItemCount2), sparseIntArray2);
        i3 = this.b;
        aVar = this.r;
        if (i3 == 0) {
        }
        this.q.clear();
        aVar.a = null;
        aVar.b = 0;
        this.p.b(this.r, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.q = aVar.a;
        bVar.h(i, i2, 0);
        if (this.e == 3) {
        }
        bVar.g(i, i2, getPaddingBottom() + getPaddingTop());
        bVar.u(0);
        u(this.b, i, i2, aVar.b);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View o = o(i - i3);
            if (o != null && o.getVisibility() != 8) {
                return m() ? (this.k & 2) != 0 : (this.j & 2) != 0;
            }
        }
        return m() ? (this.k & 1) != 0 : (this.j & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.q.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (this.q.get(i2).a() > 0) {
                    return m() ? (this.j & 2) != 0 : (this.k & 2) != 0;
                }
            }
            if (m()) {
                return (this.j & 1) != 0;
            }
            if ((this.k & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.q.size()) {
            for (int i2 = i + 1; i2 < this.q.size(); i2++) {
                if (this.q.get(i2).a() > 0) {
                    return false;
                }
            }
            if (m()) {
                return (this.j & 4) != 0;
            }
            if ((this.k & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        float f3;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        a aVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.q.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar2 = this.q.get(i11);
            if (q(i11)) {
                int i12 = this.l;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = paddingBottom;
            int i14 = this.d;
            char c = 4;
            int i15 = 2;
            boolean z3 = true;
            if (i14 == 0) {
                f = paddingLeft;
                f2 = i10 - paddingRight;
            } else if (i14 == 1) {
                int i16 = aVar2.e;
                f2 = i16 - paddingLeft;
                f = (i10 - i16) + paddingRight;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    f = paddingLeft;
                    f3 = (i10 - aVar2.e) / (aVar2.a() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingRight;
                } else if (i14 == 4) {
                    int a = aVar2.a();
                    float f4 = a != 0 ? (i10 - aVar2.e) / a : 0.0f;
                    float f5 = f4 / 2.0f;
                    f = paddingLeft + f5;
                    float f6 = (i10 - paddingRight) - f5;
                    f3 = f4;
                    f2 = f6;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.d);
                    }
                    f3 = aVar2.a() != 0 ? (i10 - aVar2.e) / (r3 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i10 - paddingRight) - f3;
                }
                float max = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < aVar2.h) {
                    int i17 = aVar2.o + i5;
                    View o = o(i17);
                    char c2 = c;
                    if (o != null) {
                        boolean z4 = z3;
                        if (o.getVisibility() == 8) {
                            z2 = z4;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                            float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (p(i17, i5)) {
                                int i18 = this.m;
                                float f9 = i18;
                                f7 += f9;
                                f8 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            float f10 = f8;
                            int i19 = (i5 != aVar2.h + (-1) || (this.k & 4) <= 0) ? 0 : this.m;
                            if (this.c == i15) {
                                if (z) {
                                    i7 = i15;
                                    i8 = i5;
                                    view = o;
                                    z2 = z4;
                                    this.p.o(view, aVar2, Math.round(f10) - o.getMeasuredWidth(), i13 - o.getMeasuredHeight(), Math.round(f10), i13);
                                } else {
                                    i8 = i5;
                                    view = o;
                                    z2 = z4;
                                    i7 = i15;
                                    this.p.o(view, aVar2, Math.round(f7), i13 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f7), i13);
                                }
                                i6 = i13;
                            } else {
                                i8 = i5;
                                view = o;
                                z2 = z4;
                                i7 = i15;
                                i6 = i13;
                                if (z) {
                                    this.p.o(view, aVar2, Math.round(f10) - view.getMeasuredWidth(), paddingTop, Math.round(f10), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i20 = paddingTop;
                                    this.p.o(view, aVar2, Math.round(f7), i20, view.getMeasuredWidth() + Math.round(f7), view.getMeasuredHeight() + i20);
                                    paddingTop = i20;
                                }
                            }
                            f = f7 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth = f10 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                aVar = aVar2;
                                aVar.b(view, i19, 0, i9, 0);
                            } else {
                                aVar = aVar2;
                                aVar.b(view, i9, 0, i19, 0);
                            }
                            aVar2 = aVar;
                            f2 = measuredWidth;
                            i5 = i8 + 1;
                            c = c2;
                            i15 = i7;
                            z3 = z2;
                            i13 = i6;
                        }
                    } else {
                        z2 = z3;
                    }
                    i7 = i15;
                    i8 = i5;
                    i6 = i13;
                    i5 = i8 + 1;
                    c = c2;
                    i15 = i7;
                    z3 = z2;
                    i13 = i6;
                }
                int i21 = aVar2.g;
                paddingTop += i21;
                paddingBottom = i13 - i21;
            } else {
                int i22 = aVar2.e;
                f = paddingLeft + ((i10 - i22) / 2.0f);
                f2 = (i10 - paddingRight) - ((i10 - i22) / 2.0f);
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < aVar2.h) {
            }
            int i212 = aVar2.g;
            paddingTop += i212;
            paddingBottom = i13 - i212;
        }
    }

    public void setAlignContent(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
        }
        if (this.h == null && this.i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.i) {
            return;
        }
        this.i = drawable;
        if (drawable != null) {
            this.m = drawable.getIntrinsicWidth();
        } else {
            this.m = 0;
        }
        if (this.h == null && this.i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    @Override // xsna.eor
    public void setFlexLines(List<a> list) {
        this.q = list;
    }

    public void setFlexWrap(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.k) {
            this.k = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        a aVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.q.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar2 = this.q.get(i12);
            if (q(i12)) {
                int i13 = this.m;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = i11;
            int i15 = this.d;
            char c2 = 4;
            int i16 = 1;
            if (i15 == 0) {
                f = paddingTop;
                f2 = i10 - paddingBottom;
            } else if (i15 == 1) {
                int i17 = aVar2.e;
                f2 = i17 - paddingTop;
                f = (i10 - i17) + paddingBottom;
            } else if (i15 != 2) {
                if (i15 == 3) {
                    f = paddingTop;
                    f3 = (i10 - aVar2.e) / (aVar2.a() != 1 ? r13 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i15 == 4) {
                    int a = aVar2.a();
                    f3 = a != 0 ? (i10 - aVar2.e) / a : 0.0f;
                    float f4 = f3 / 2.0f;
                    f = paddingTop + f4;
                    f2 = (i10 - paddingBottom) - f4;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.d);
                    }
                    f3 = aVar2.a() != 0 ? (i10 - aVar2.e) / (r5 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                }
                float max = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < aVar2.h) {
                    int i18 = aVar2.o + i5;
                    int i19 = i16;
                    View o = o(i18);
                    if (o != null) {
                        c = c2;
                        if (o.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                            float f5 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f6 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (p(i18, i5)) {
                                i9 = this.l;
                                float f7 = i9;
                                f5 += f7;
                                f6 -= f7;
                            } else {
                                i9 = 0;
                            }
                            float f8 = f6;
                            int i20 = (i5 != aVar2.h - i19 || (this.j & 4) <= 0) ? 0 : this.l;
                            if (z) {
                                if (z2) {
                                    i8 = i5;
                                    i7 = i19;
                                    this.p.p(o, aVar2, true, i14 - o.getMeasuredWidth(), Math.round(f8) - o.getMeasuredHeight(), i14, Math.round(f8));
                                } else {
                                    i8 = i5;
                                    i7 = i19;
                                    this.p.p(o, aVar2, true, i14 - o.getMeasuredWidth(), Math.round(f5), i14, o.getMeasuredHeight() + Math.round(f5));
                                }
                                i6 = i14;
                            } else {
                                i8 = i5;
                                i7 = i19;
                                i6 = i14;
                                if (z2) {
                                    this.p.p(o, aVar2, false, paddingLeft, Math.round(f8) - o.getMeasuredHeight(), o.getMeasuredWidth() + paddingLeft, Math.round(f8));
                                } else {
                                    int i21 = paddingLeft;
                                    this.p.p(o, aVar2, false, i21, Math.round(f5), o.getMeasuredWidth() + i21, o.getMeasuredHeight() + Math.round(f5));
                                    paddingLeft = i21;
                                }
                            }
                            f = f5 + o.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight = f8 - ((o.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                aVar = aVar2;
                                aVar.b(o, 0, i20, 0, i9);
                            } else {
                                aVar = aVar2;
                                aVar.b(o, 0, i9, 0, i20);
                            }
                            aVar2 = aVar;
                            f2 = measuredHeight;
                            i5 = i8 + 1;
                            c2 = c;
                            i16 = i7;
                            i14 = i6;
                        }
                    } else {
                        c = c2;
                    }
                    i8 = i5;
                    i7 = i19;
                    i6 = i14;
                    i5 = i8 + 1;
                    c2 = c;
                    i16 = i7;
                    i14 = i6;
                }
                int i22 = aVar2.g;
                paddingLeft += i22;
                i11 = i14 - i22;
            } else {
                float f9 = (i10 - aVar2.e) / 2.0f;
                f = paddingTop + f9;
                f2 = (i10 - paddingBottom) - f9;
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < aVar2.h) {
            }
            int i222 = aVar2.g;
            paddingLeft += i222;
            i11 = i14 - i222;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(lhg.a(i, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(lhg.a(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(lhg.a(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public int b;
        public float c;
        public float d;
        public int e;
        public float f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;

        public class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.b = 1;
                layoutParams.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                layoutParams.d = 1.0f;
                layoutParams.e = -1;
                layoutParams.f = -1.0f;
                layoutParams.g = -1;
                layoutParams.h = -1;
                layoutParams.i = 16777215;
                layoutParams.j = 16777215;
                layoutParams.b = parcel.readInt();
                layoutParams.c = parcel.readFloat();
                layoutParams.d = parcel.readFloat();
                layoutParams.e = parcel.readInt();
                layoutParams.f = parcel.readFloat();
                layoutParams.g = parcel.readInt();
                layoutParams.h = parcel.readInt();
                layoutParams.i = parcel.readInt();
                layoutParams.j = parcel.readInt();
                layoutParams.k = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 1;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = 1.0f;
            this.e = -1;
            this.f = -1.0f;
            this.g = -1;
            this.h = -1;
            this.i = 16777215;
            this.j = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.b = obtainStyledAttributes.getInt(8, 1);
            this.c = obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.d = obtainStyledAttributes.getFloat(3, 1.0f);
            this.e = obtainStyledAttributes.getInt(0, -1);
            this.f = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.h = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.i = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.j = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.k = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float B9() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int F1() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean H9() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L0() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int T5() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int U5() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Z3() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Z8() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxWidth() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void o4(int i) {
            this.h = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float r4() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void t5(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int u5() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeFloat(this.c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.b = 1;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = 1.0f;
            this.e = -1;
            this.f = -1.0f;
            this.g = -1;
            this.h = -1;
            this.i = 16777215;
            this.j = 16777215;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
            this.k = layoutParams.k;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 1;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = 1.0f;
            this.e = -1;
            this.f = -1.0f;
            this.g = -1;
            this.h = -1;
            this.i = 16777215;
            this.j = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 1;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = 1.0f;
            this.e = -1;
            this.f = -1.0f;
            this.g = -1;
            this.h = -1;
            this.i = 16777215;
            this.j = 16777215;
        }
    }

    @Override // xsna.eor
    public final void l(int i, View view) {
    }
}

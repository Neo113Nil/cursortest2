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
import androidx.core.view.AbstractC2082d0;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f31869a;

    /* renamed from: b, reason: collision with root package name */
    public int f31870b;

    /* renamed from: c, reason: collision with root package name */
    public int f31871c;

    /* renamed from: d, reason: collision with root package name */
    public int f31872d;

    /* renamed from: e, reason: collision with root package name */
    public int f31873e;

    /* renamed from: f, reason: collision with root package name */
    public int f31874f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f31875g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f31876h;

    /* renamed from: i, reason: collision with root package name */
    public int f31877i;

    /* renamed from: j, reason: collision with root package name */
    public int f31878j;

    /* renamed from: k, reason: collision with root package name */
    public int f31879k;

    /* renamed from: l, reason: collision with root package name */
    public int f31880l;

    /* renamed from: m, reason: collision with root package name */
    public SparseIntArray f31881m;
    private int[] mReorderedIndices;

    /* renamed from: n, reason: collision with root package name */
    public c f31882n;

    /* renamed from: o, reason: collision with root package name */
    public List f31883o;

    /* renamed from: p, reason: collision with root package name */
    public c.b f31884p;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public final void A() {
        if (this.f31875g == null && this.f31876h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) this.f31883o.get(i11)).c() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f31881m == null) {
            this.f31881m = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.f31882n.n(view, i10, layoutParams, this.f31881m);
        super.addView(view, i10, layoutParams);
    }

    public final boolean b(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View r10 = r(i10 - i12);
            if (r10 != null && r10.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    public final void c(Canvas canvas, boolean z10, boolean z11) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f31883o.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f31883o.get(i10);
            for (int i11 = 0; i11 < bVar.f31958h; i11++) {
                int i12 = bVar.f31965o + i11;
                View r10 = r(i12);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i12, i11)) {
                        j(canvas, z10 ? r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f31880l, bVar.f31952b, bVar.f31957g);
                    }
                    if (i11 == bVar.f31958h - 1 && (this.f31878j & 4) > 0) {
                        j(canvas, z10 ? (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f31880l : r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.f31952b, bVar.f31957g);
                    }
                }
            }
            if (t(i10)) {
                h(canvas, paddingLeft, z11 ? bVar.f31954d : bVar.f31952b - this.f31879k, max);
            }
            if (u(i10) && (this.f31877i & 4) > 0) {
                h(canvas, paddingLeft, z11 ? bVar.f31952b - this.f31879k : bVar.f31954d, max);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public void d(View view, int i10, int i11, b bVar) {
        if (s(i10, i11)) {
            if (q()) {
                int i12 = bVar.f31955e;
                int i13 = this.f31880l;
                bVar.f31955e = i12 + i13;
                bVar.f31956f += i13;
                return;
            }
            int i14 = bVar.f31955e;
            int i15 = this.f31879k;
            bVar.f31955e = i14 + i15;
            bVar.f31956f += i15;
        }
    }

    @Override // com.google.android.flexbox.a
    public int e(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final void f(Canvas canvas, boolean z10, boolean z11) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f31883o.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f31883o.get(i10);
            for (int i11 = 0; i11 < bVar.f31958h; i11++) {
                int i12 = bVar.f31965o + i11;
                View r10 = r(i12);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i12, i11)) {
                        h(canvas, bVar.f31951a, z11 ? r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f31879k, bVar.f31957g);
                    }
                    if (i11 == bVar.f31958h - 1 && (this.f31877i & 4) > 0) {
                        h(canvas, bVar.f31951a, z11 ? (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f31879k : r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f31957g);
                    }
                }
            }
            if (t(i10)) {
                j(canvas, z10 ? bVar.f31953c : bVar.f31951a - this.f31880l, paddingTop, max);
            }
            if (u(i10) && (this.f31878j & 4) > 0) {
                j(canvas, z10 ? bVar.f31951a - this.f31880l : bVar.f31953c, paddingTop, max);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public View g(int i10) {
        return getChildAt(i10);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f31873e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f31872d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f31875g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f31876h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f31869a;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f31883o.size());
        for (b bVar : this.f31883o) {
            if (bVar.c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.f31883o;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f31870b;
    }

    public int getJustifyContent() {
        return this.f31871c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator it = this.f31883o.iterator();
        int i10 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i10 = Math.max(i10, ((b) it.next()).f31955e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f31874f;
    }

    public int getShowDividerHorizontal() {
        return this.f31877i;
    }

    public int getShowDividerVertical() {
        return this.f31878j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f31883o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f31883o.get(i11);
            if (t(i11)) {
                i10 += q() ? this.f31879k : this.f31880l;
            }
            if (u(i11)) {
                i10 += q() ? this.f31879k : this.f31880l;
            }
            i10 += bVar.f31957g;
        }
        return i10;
    }

    public final void h(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f31875g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f31879k + i11);
        this.f31875g.draw(canvas);
    }

    @Override // com.google.android.flexbox.a
    public int i(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final void j(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f31876h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f31880l + i10, i12 + i11);
        this.f31876h.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public void m(b bVar) {
        if (q()) {
            if ((this.f31878j & 4) > 0) {
                int i10 = bVar.f31955e;
                int i11 = this.f31880l;
                bVar.f31955e = i10 + i11;
                bVar.f31956f += i11;
                return;
            }
            return;
        }
        if ((this.f31877i & 4) > 0) {
            int i12 = bVar.f31955e;
            int i13 = this.f31879k;
            bVar.f31955e = i12 + i13;
            bVar.f31956f += i13;
        }
    }

    @Override // com.google.android.flexbox.a
    public View n(int i10) {
        return r(i10);
    }

    @Override // com.google.android.flexbox.a
    public void o(int i10, View view) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f31876h == null && this.f31875g == null) {
            return;
        }
        if (this.f31877i == 0 && this.f31878j == 0) {
            return;
        }
        int z10 = AbstractC2082d0.z(this);
        int i10 = this.f31869a;
        if (i10 == 0) {
            c(canvas, z10 == 1, this.f31870b == 2);
            return;
        }
        if (i10 == 1) {
            c(canvas, z10 != 1, this.f31870b == 2);
            return;
        }
        if (i10 == 2) {
            boolean z11 = z10 == 1;
            if (this.f31870b == 2) {
                z11 = !z11;
            }
            f(canvas, z11, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z12 = z10 == 1;
        if (this.f31870b == 2) {
            z12 = !z12;
        }
        f(canvas, z12, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        FlexboxLayout flexboxLayout;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        FlexboxLayout flexboxLayout2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z13;
        int z14 = AbstractC2082d0.z(this);
        int i22 = this.f31869a;
        if (i22 == 0) {
            if (z14 == 1) {
                z11 = true;
                flexboxLayout = this;
                i14 = i10;
                i17 = i11;
                i16 = i13;
                i15 = i12;
            } else {
                z11 = false;
                flexboxLayout = this;
                i14 = i10;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            flexboxLayout.v(z11, i14, i17, i15, i16);
            return;
        }
        if (i22 == 1) {
            if (z14 != 1) {
                z12 = true;
                flexboxLayout2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                flexboxLayout2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            flexboxLayout2.v(z12, i18, i21, i19, i20);
            return;
        }
        if (i22 == 2) {
            z13 = z14 == 1;
            if (this.f31870b == 2) {
                z13 = !z13;
            }
            w(z13, false, i10, i11, i12, i13);
            return;
        }
        if (i22 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f31869a);
        }
        z13 = z14 == 1;
        if (this.f31870b == 2) {
            z13 = !z13;
        }
        w(z13, true, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f31881m == null) {
            this.f31881m = new SparseIntArray(getChildCount());
        }
        if (this.f31882n.O(this.f31881m)) {
            this.mReorderedIndices = this.f31882n.m(this.f31881m);
        }
        int i12 = this.f31869a;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
            return;
        }
        if (i12 == 2 || i12 == 3) {
            y(i10, i11);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f31869a);
    }

    @Override // com.google.android.flexbox.a
    public int p(View view, int i10, int i11) {
        int i12;
        int i13;
        if (q()) {
            i12 = s(i10, i11) ? this.f31880l : 0;
            if ((this.f31878j & 4) <= 0) {
                return i12;
            }
            i13 = this.f31880l;
        } else {
            i12 = s(i10, i11) ? this.f31879k : 0;
            if ((this.f31877i & 4) <= 0) {
                return i12;
            }
            i13 = this.f31879k;
        }
        return i12 + i13;
    }

    @Override // com.google.android.flexbox.a
    public boolean q() {
        int i10 = this.f31869a;
        return i10 == 0 || i10 == 1;
    }

    public View r(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public final boolean s(int i10, int i11) {
        return b(i10, i11) ? q() ? (this.f31878j & 1) != 0 : (this.f31877i & 1) != 0 : q() ? (this.f31878j & 2) != 0 : (this.f31877i & 2) != 0;
    }

    public void setAlignContent(int i10) {
        if (this.f31873e != i10) {
            this.f31873e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f31872d != i10) {
            this.f31872d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f31875g) {
            return;
        }
        this.f31875g = drawable;
        if (drawable != null) {
            this.f31879k = drawable.getIntrinsicHeight();
        } else {
            this.f31879k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f31876h) {
            return;
        }
        this.f31876h = drawable;
        if (drawable != null) {
            this.f31880l = drawable.getIntrinsicWidth();
        } else {
            this.f31880l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f31869a != i10) {
            this.f31869a = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.f31883o = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f31870b != i10) {
            this.f31870b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f31871c != i10) {
            this.f31871c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f31874f != i10) {
            this.f31874f = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f31877i) {
            this.f31877i = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f31878j) {
            this.f31878j = i10;
            requestLayout();
        }
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f31883o.size()) {
            if (a(i10)) {
                return q() ? (this.f31877i & 1) != 0 : (this.f31878j & 1) != 0;
            }
            if (q()) {
                return (this.f31877i & 2) != 0;
            }
            if ((this.f31878j & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean u(int i10) {
        if (i10 >= 0 && i10 < this.f31883o.size()) {
            for (int i11 = i10 + 1; i11 < this.f31883o.size(); i11++) {
                if (((b) this.f31883o.get(i11)).c() > 0) {
                    return false;
                }
            }
            if (q()) {
                return (this.f31877i & 4) != 0;
            }
            if ((this.f31878j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        b bVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i19 = i12 - i10;
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f31883o.size();
        for (int i20 = 0; i20 < size; i20++) {
            b bVar2 = (b) this.f31883o.get(i20);
            if (t(i20)) {
                int i21 = this.f31879k;
                paddingBottom -= i21;
                paddingTop += i21;
            }
            int i22 = paddingBottom;
            int i23 = this.f31871c;
            char c10 = 4;
            int i24 = 2;
            boolean z12 = true;
            if (i23 == 0) {
                f10 = paddingLeft;
                f11 = i19 - paddingRight;
            } else if (i23 == 1) {
                int i25 = bVar2.f31955e;
                f11 = i25 - paddingLeft;
                f10 = (i19 - i25) + paddingRight;
            } else if (i23 != 2) {
                if (i23 == 3) {
                    f10 = paddingLeft;
                    f12 = (i19 - bVar2.f31955e) / (bVar2.c() != 1 ? r7 - 1 : 1.0f);
                    f11 = i19 - paddingRight;
                } else if (i23 == 4) {
                    int c11 = bVar2.c();
                    float f13 = c11 != 0 ? (i19 - bVar2.f31955e) / c11 : 0.0f;
                    float f14 = f13 / 2.0f;
                    f10 = paddingLeft + f14;
                    float f15 = (i19 - paddingRight) - f14;
                    f12 = f13;
                    f11 = f15;
                } else {
                    if (i23 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f31871c);
                    }
                    f12 = bVar2.c() != 0 ? (i19 - bVar2.f31955e) / (r3 + 1) : 0.0f;
                    f10 = paddingLeft + f12;
                    f11 = (i19 - paddingRight) - f12;
                }
                float max = Math.max(f12, 0.0f);
                i14 = 0;
                while (i14 < bVar2.f31958h) {
                    int i26 = bVar2.f31965o + i14;
                    View r10 = r(i26);
                    char c12 = c10;
                    if (r10 != null) {
                        boolean z13 = z12;
                        if (r10.getVisibility() == 8) {
                            z11 = z13;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                            float f16 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f17 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (s(i26, i14)) {
                                int i27 = this.f31880l;
                                float f18 = i27;
                                f16 += f18;
                                f17 -= f18;
                                i18 = i27;
                            } else {
                                i18 = 0;
                            }
                            float f19 = f17;
                            int i28 = (i14 != bVar2.f31958h + (-1) || (this.f31878j & 4) <= 0) ? 0 : this.f31880l;
                            if (this.f31870b == i24) {
                                if (z10) {
                                    i16 = i24;
                                    i17 = i14;
                                    view = r10;
                                    z11 = z13;
                                    this.f31882n.Q(view, bVar2, Math.round(f19) - r10.getMeasuredWidth(), i22 - r10.getMeasuredHeight(), Math.round(f19), i22);
                                } else {
                                    i17 = i14;
                                    view = r10;
                                    z11 = z13;
                                    i16 = i24;
                                    this.f31882n.Q(view, bVar2, Math.round(f16), i22 - view.getMeasuredHeight(), Math.round(f16) + view.getMeasuredWidth(), i22);
                                }
                                i15 = i22;
                            } else {
                                i17 = i14;
                                view = r10;
                                z11 = z13;
                                i16 = i24;
                                i15 = i22;
                                if (z10) {
                                    this.f31882n.Q(view, bVar2, Math.round(f19) - view.getMeasuredWidth(), paddingTop, Math.round(f19), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i29 = paddingTop;
                                    this.f31882n.Q(view, bVar2, Math.round(f16), i29, view.getMeasuredWidth() + Math.round(f16), i29 + view.getMeasuredHeight());
                                    paddingTop = i29;
                                }
                            }
                            f10 = f16 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth = f19 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z10) {
                                bVar = bVar2;
                                bVar.d(view, i28, 0, i18, 0);
                            } else {
                                bVar = bVar2;
                                bVar.d(view, i18, 0, i28, 0);
                            }
                            bVar2 = bVar;
                            f11 = measuredWidth;
                            i14 = i17 + 1;
                            c10 = c12;
                            i24 = i16;
                            z12 = z11;
                            i22 = i15;
                        }
                    } else {
                        z11 = z12;
                    }
                    i16 = i24;
                    i17 = i14;
                    i15 = i22;
                    i14 = i17 + 1;
                    c10 = c12;
                    i24 = i16;
                    z12 = z11;
                    i22 = i15;
                }
                int i30 = bVar2.f31957g;
                paddingTop += i30;
                paddingBottom = i22 - i30;
            } else {
                int i31 = bVar2.f31955e;
                f10 = paddingLeft + ((i19 - i31) / 2.0f);
                f11 = (i19 - paddingRight) - ((i19 - i31) / 2.0f);
            }
            f12 = 0.0f;
            float max2 = Math.max(f12, 0.0f);
            i14 = 0;
            while (i14 < bVar2.f31958h) {
            }
            int i302 = bVar2.f31957g;
            paddingTop += i302;
            paddingBottom = i22 - i302;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        int i14;
        char c10;
        int i15;
        int i16;
        int i17;
        int i18;
        b bVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i19 = i13 - i11;
        int i20 = (i12 - i10) - paddingRight;
        int size = this.f31883o.size();
        for (int i21 = 0; i21 < size; i21++) {
            b bVar2 = (b) this.f31883o.get(i21);
            if (t(i21)) {
                int i22 = this.f31880l;
                paddingLeft += i22;
                i20 -= i22;
            }
            int i23 = i20;
            int i24 = this.f31871c;
            char c11 = 4;
            int i25 = 1;
            if (i24 == 0) {
                f10 = paddingTop;
                f11 = i19 - paddingBottom;
            } else if (i24 == 1) {
                int i26 = bVar2.f31955e;
                f11 = i26 - paddingTop;
                f10 = (i19 - i26) + paddingBottom;
            } else if (i24 != 2) {
                if (i24 == 3) {
                    f10 = paddingTop;
                    f12 = (i19 - bVar2.f31955e) / (bVar2.c() != 1 ? r13 - 1 : 1.0f);
                    f11 = i19 - paddingBottom;
                } else if (i24 == 4) {
                    int c12 = bVar2.c();
                    f12 = c12 != 0 ? (i19 - bVar2.f31955e) / c12 : 0.0f;
                    float f13 = f12 / 2.0f;
                    f10 = paddingTop + f13;
                    f11 = (i19 - paddingBottom) - f13;
                } else {
                    if (i24 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f31871c);
                    }
                    f12 = bVar2.c() != 0 ? (i19 - bVar2.f31955e) / (r5 + 1) : 0.0f;
                    f10 = paddingTop + f12;
                    f11 = (i19 - paddingBottom) - f12;
                }
                float max = Math.max(f12, 0.0f);
                i14 = 0;
                while (i14 < bVar2.f31958h) {
                    int i27 = bVar2.f31965o + i14;
                    int i28 = i25;
                    View r10 = r(i27);
                    if (r10 != null) {
                        c10 = c11;
                        if (r10.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                            float f14 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f15 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (s(i27, i14)) {
                                i18 = this.f31879k;
                                float f16 = i18;
                                f14 += f16;
                                f15 -= f16;
                            } else {
                                i18 = 0;
                            }
                            float f17 = f15;
                            int i29 = (i14 != bVar2.f31958h - i28 || (this.f31877i & 4) <= 0) ? 0 : this.f31879k;
                            if (z10) {
                                if (z11) {
                                    i17 = i28;
                                    i16 = i14;
                                    this.f31882n.R(r10, bVar2, true, i23 - r10.getMeasuredWidth(), Math.round(f17) - r10.getMeasuredHeight(), i23, Math.round(f17));
                                } else {
                                    i16 = i14;
                                    i17 = i28;
                                    this.f31882n.R(r10, bVar2, true, i23 - r10.getMeasuredWidth(), Math.round(f14), i23, Math.round(f14) + r10.getMeasuredHeight());
                                }
                                i15 = i23;
                            } else {
                                i16 = i14;
                                i17 = i28;
                                i15 = i23;
                                if (z11) {
                                    this.f31882n.R(r10, bVar2, false, paddingLeft, Math.round(f17) - r10.getMeasuredHeight(), paddingLeft + r10.getMeasuredWidth(), Math.round(f17));
                                } else {
                                    int i30 = paddingLeft;
                                    this.f31882n.R(r10, bVar2, false, i30, Math.round(f14), i30 + r10.getMeasuredWidth(), Math.round(f14) + r10.getMeasuredHeight());
                                    paddingLeft = i30;
                                }
                            }
                            f10 = f14 + r10.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight = f17 - ((r10.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z11) {
                                bVar = bVar2;
                                bVar.d(r10, 0, i29, 0, i18);
                            } else {
                                bVar = bVar2;
                                bVar.d(r10, 0, i18, 0, i29);
                            }
                            bVar2 = bVar;
                            f11 = measuredHeight;
                            i14 = i16 + 1;
                            c11 = c10;
                            i25 = i17;
                            i23 = i15;
                        }
                    } else {
                        c10 = c11;
                    }
                    i16 = i14;
                    i17 = i28;
                    i15 = i23;
                    i14 = i16 + 1;
                    c11 = c10;
                    i25 = i17;
                    i23 = i15;
                }
                int i31 = bVar2.f31957g;
                paddingLeft += i31;
                i20 = i23 - i31;
            } else {
                int i32 = bVar2.f31955e;
                f10 = paddingTop + ((i19 - i32) / 2.0f);
                f11 = (i19 - paddingBottom) - ((i19 - i32) / 2.0f);
            }
            f12 = 0.0f;
            float max2 = Math.max(f12, 0.0f);
            i14 = 0;
            while (i14 < bVar2.f31958h) {
            }
            int i312 = bVar2.f31957g;
            paddingLeft += i312;
            i20 = i23 - i312;
        }
    }

    public final void x(int i10, int i11) {
        this.f31883o.clear();
        this.f31884p.a();
        this.f31882n.c(this.f31884p, i10, i11);
        this.f31883o = this.f31884p.f31970a;
        this.f31882n.p(i10, i11);
        if (this.f31872d == 3) {
            for (b bVar : this.f31883o) {
                int i12 = Integer.MIN_VALUE;
                for (int i13 = 0; i13 < bVar.f31958h; i13++) {
                    View r10 = r(bVar.f31965o + i13);
                    if (r10 != null && r10.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                        i12 = this.f31870b != 2 ? Math.max(i12, r10.getMeasuredHeight() + Math.max(bVar.f31962l - r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i12, r10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((bVar.f31962l - r10.getMeasuredHeight()) + r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                bVar.f31957g = i12;
            }
        }
        this.f31882n.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f31882n.X();
        z(this.f31869a, i10, i11, this.f31884p.f31971b);
    }

    public final void y(int i10, int i11) {
        this.f31883o.clear();
        this.f31884p.a();
        this.f31882n.f(this.f31884p, i10, i11);
        this.f31883o = this.f31884p.f31970a;
        this.f31882n.p(i10, i11);
        this.f31882n.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f31882n.X();
        z(this.f31869a, i10, i11, this.f31884p.f31971b);
    }

    public final void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i10);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31874f = -1;
        this.f31882n = new c(this);
        this.f31883o = new ArrayList();
        this.f31884p = new c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.FlexboxLayout, i10, 0);
        this.f31869a = obtainStyledAttributes.getInt(d.f31979f, 0);
        this.f31870b = obtainStyledAttributes.getInt(d.f31980g, 0);
        this.f31871c = obtainStyledAttributes.getInt(d.f31981h, 0);
        this.f31872d = obtainStyledAttributes.getInt(d.f31975b, 0);
        this.f31873e = obtainStyledAttributes.getInt(d.f31974a, 0);
        this.f31874f = obtainStyledAttributes.getInt(d.f31982i, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(d.f31976c);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(d.f31977d);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(d.f31978e);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(d.f31983j, 0);
        if (i11 != 0) {
            this.f31878j = i11;
            this.f31877i = i11;
        }
        int i12 = obtainStyledAttributes.getInt(d.f31985l, 0);
        if (i12 != 0) {
            this.f31878j = i12;
        }
        int i13 = obtainStyledAttributes.getInt(d.f31984k, 0);
        if (i13 != 0) {
            this.f31877i = i13;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f31885a;

        /* renamed from: b, reason: collision with root package name */
        public float f31886b;

        /* renamed from: c, reason: collision with root package name */
        public float f31887c;

        /* renamed from: d, reason: collision with root package name */
        public int f31888d;

        /* renamed from: e, reason: collision with root package name */
        public float f31889e;

        /* renamed from: f, reason: collision with root package name */
        public int f31890f;

        /* renamed from: g, reason: collision with root package name */
        public int f31891g;

        /* renamed from: h, reason: collision with root package name */
        public int f31892h;

        /* renamed from: i, reason: collision with root package name */
        public int f31893i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f31894j;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31885a = 1;
            this.f31886b = 0.0f;
            this.f31887c = 1.0f;
            this.f31888d = -1;
            this.f31889e = -1.0f;
            this.f31890f = -1;
            this.f31891g = -1;
            this.f31892h = 16777215;
            this.f31893i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.FlexboxLayout_Layout);
            this.f31885a = obtainStyledAttributes.getInt(d.f31994u, 1);
            this.f31886b = obtainStyledAttributes.getFloat(d.f31988o, 0.0f);
            this.f31887c = obtainStyledAttributes.getFloat(d.f31989p, 1.0f);
            this.f31888d = obtainStyledAttributes.getInt(d.f31986m, -1);
            this.f31889e = obtainStyledAttributes.getFraction(d.f31987n, 1, 1, -1.0f);
            this.f31890f = obtainStyledAttributes.getDimensionPixelSize(d.f31993t, -1);
            this.f31891g = obtainStyledAttributes.getDimensionPixelSize(d.f31992s, -1);
            this.f31892h = obtainStyledAttributes.getDimensionPixelSize(d.f31991r, 16777215);
            this.f31893i = obtainStyledAttributes.getDimensionPixelSize(d.f31990q, 16777215);
            this.f31894j = obtainStyledAttributes.getBoolean(d.f31995v, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public float A() {
            return this.f31889e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean B() {
            return this.f31894j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E() {
            return this.f31892h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void I(int i10) {
            this.f31890f = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int K() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int L() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int V() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int X() {
            return this.f31891g;
        }

        public void a(float f10) {
            this.f31887c = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int b0() {
            return this.f31893i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f31885a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int o() {
            return this.f31888d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float p() {
            return this.f31887c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int r() {
            return this.f31890f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void w(int i10) {
            this.f31891g = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f31885a);
            parcel.writeFloat(this.f31886b);
            parcel.writeFloat(this.f31887c);
            parcel.writeInt(this.f31888d);
            parcel.writeFloat(this.f31889e);
            parcel.writeInt(this.f31890f);
            parcel.writeInt(this.f31891g);
            parcel.writeInt(this.f31892h);
            parcel.writeInt(this.f31893i);
            parcel.writeByte(this.f31894j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public float y() {
            return this.f31886b;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f31885a = 1;
            this.f31886b = 0.0f;
            this.f31887c = 1.0f;
            this.f31888d = -1;
            this.f31889e = -1.0f;
            this.f31890f = -1;
            this.f31891g = -1;
            this.f31892h = 16777215;
            this.f31893i = 16777215;
            this.f31885a = layoutParams.f31885a;
            this.f31886b = layoutParams.f31886b;
            this.f31887c = layoutParams.f31887c;
            this.f31888d = layoutParams.f31888d;
            this.f31889e = layoutParams.f31889e;
            this.f31890f = layoutParams.f31890f;
            this.f31891g = layoutParams.f31891g;
            this.f31892h = layoutParams.f31892h;
            this.f31893i = layoutParams.f31893i;
            this.f31894j = layoutParams.f31894j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31885a = 1;
            this.f31886b = 0.0f;
            this.f31887c = 1.0f;
            this.f31888d = -1;
            this.f31889e = -1.0f;
            this.f31890f = -1;
            this.f31891g = -1;
            this.f31892h = 16777215;
            this.f31893i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31885a = 1;
            this.f31886b = 0.0f;
            this.f31887c = 1.0f;
            this.f31888d = -1;
            this.f31889e = -1.0f;
            this.f31890f = -1;
            this.f31891g = -1;
            this.f31892h = 16777215;
            this.f31893i = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f31885a = 1;
            this.f31886b = 0.0f;
            this.f31887c = 1.0f;
            this.f31888d = -1;
            this.f31889e = -1.0f;
            this.f31890f = -1;
            this.f31891g = -1;
            this.f31892h = 16777215;
            this.f31893i = 16777215;
            this.f31885a = parcel.readInt();
            this.f31886b = parcel.readFloat();
            this.f31887c = parcel.readFloat();
            this.f31888d = parcel.readInt();
            this.f31889e = parcel.readFloat();
            this.f31890f = parcel.readInt();
            this.f31891g = parcel.readInt();
            this.f31892h = parcel.readInt();
            this.f31893i = parcel.readInt();
            this.f31894j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}

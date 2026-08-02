package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.j {

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f16891n;

    /* renamed from: o, reason: collision with root package name */
    public Context f16892o;

    /* renamed from: p, reason: collision with root package name */
    public int f16893p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16894q;

    /* renamed from: r, reason: collision with root package name */
    public ActionMenuPresenter f16895r;

    /* renamed from: s, reason: collision with root package name */
    public i.a f16896s;

    /* renamed from: t, reason: collision with root package name */
    public e.a f16897t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16898u;

    /* renamed from: v, reason: collision with root package name */
    public int f16899v;

    /* renamed from: w, reason: collision with root package name */
    public int f16900w;

    /* renamed from: x, reason: collision with root package name */
    public int f16901x;

    /* renamed from: y, reason: collision with root package name */
    public e f16902y;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16903a;

        /* renamed from: b, reason: collision with root package name */
        public int f16904b;

        /* renamed from: c, reason: collision with root package name */
        public int f16905c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16906d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16907e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16908f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f16903a = cVar.f16903a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f16903a = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f16902y;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f16897t;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int J(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.f();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z11 || i15 >= 2) {
                    i14 = i15;
                }
                if (!cVar.f16903a && z11) {
                    z10 = true;
                }
                cVar.f16906d = z10;
                cVar.f16904b = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        if (!cVar.f16903a) {
            z10 = true;
        }
        cVar.f16906d = z10;
        cVar.f16904b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f16903a = true;
        return generateDefaultLayoutParams;
    }

    public boolean E(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : ((a) childAt2).b() | z10;
    }

    public boolean F() {
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean G() {
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean I() {
        return this.f16894q;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void K(int i10, int i11) {
        long j10;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        ?? r32;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f16900w;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int i20 = 0;
        int i21 = 0;
        boolean z12 = false;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j11 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            int i25 = size2;
            if (childAt.getVisibility() == 8) {
                i14 = i19;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    int i26 = this.f16901x;
                    z11 = z13;
                    r32 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    z11 = z13;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f16908f = r32;
                cVar.f16905c = r32;
                cVar.f16904b = r32;
                cVar.f16906d = r32;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r32;
                cVar.f16907e = z11 && ((ActionMenuItemView) childAt).f();
                int J10 = J(childAt, i19, cVar.f16903a ? 1 : i17, childMeasureSpec, paddingTop);
                i23 = Math.max(i23, J10);
                i14 = i19;
                if (cVar.f16906d) {
                    i24++;
                }
                if (cVar.f16903a) {
                    z12 = true;
                }
                i17 -= J10;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
                if (J10 == 1) {
                    j11 |= 1 << i21;
                }
            }
            i21++;
            size2 = i25;
            i19 = i14;
        }
        int i27 = size2;
        int i28 = i19;
        char c10 = 2;
        boolean z14 = z12 && i22 == 2;
        boolean z15 = false;
        while (i24 > 0 && i17 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j12 = 0;
            char c11 = c10;
            int i30 = 0;
            int i31 = 0;
            j10 = 1;
            while (i31 < childCount) {
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                boolean z16 = z14;
                if (cVar2.f16906d) {
                    int i32 = cVar2.f16904b;
                    if (i32 < i29) {
                        j12 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j12 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z14 = z16;
            }
            boolean z17 = z14;
            j11 |= j12;
            if (i30 > i17) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j13 = 1 << i34;
                if ((j12 & j13) == 0) {
                    if (cVar3.f16904b == i33) {
                        j11 |= j13;
                    }
                    i13 = i34;
                } else {
                    if (!z17 || !cVar3.f16907e) {
                        i13 = i34;
                        z10 = true;
                    } else if (i17 == 1) {
                        int i35 = this.f16901x;
                        z10 = true;
                        i13 = i34;
                        childAt2.setPadding(i35 + i28, 0, i35, 0);
                    } else {
                        i13 = i34;
                        z10 = true;
                    }
                    cVar3.f16904b++;
                    cVar3.f16908f = z10;
                    i17--;
                }
                i34 = i13 + 1;
            }
            c10 = c11;
            z14 = z17;
            z15 = true;
        }
        j10 = 1;
        boolean z18 = !z12 && i22 == 1;
        if (i17 <= 0 || j11 == 0 || (i17 >= i22 - 1 && !z18 && i23 <= 1)) {
            i12 = 0;
        } else {
            float bitCount = Long.bitCount(j11);
            if (z18) {
                i12 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f16907e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i36 = childCount - 1;
                if ((j11 & (1 << i36)) != 0 && !((c) getChildAt(i36).getLayoutParams()).f16907e) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i17 * i28) / bitCount) : i12;
            boolean z19 = z15;
            for (int i38 = i12; i38 < childCount; i38++) {
                if ((j11 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f16905c = i37;
                        cVar4.f16908f = true;
                        if (i38 == 0 && !cVar4.f16907e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                        z19 = true;
                    } else {
                        if (cVar4.f16903a) {
                            cVar4.f16905c = i37;
                            cVar4.f16908f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i37) / 2;
                            z19 = true;
                        } else {
                            if (i38 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i37 / 2;
                            }
                            if (i38 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i37 / 2;
                            }
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i39 = i12; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f16908f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f16904b * i28) + cVar5.f16905c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i15, mode != 1073741824 ? i20 : i27);
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f16891n;
    }

    public void M(i.a aVar, e.a aVar2) {
        this.f16896s = aVar;
        this.f16897t = aVar2;
    }

    public boolean N() {
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        return actionMenuPresenter != null && actionMenuPresenter.M();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f16891n = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(androidx.appcompat.view.menu.g gVar) {
        return this.f16891n.O(gVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f16891n == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f16891n = eVar;
            eVar.W(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f16895r = actionMenuPresenter;
            actionMenuPresenter.L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f16895r;
            i.a aVar = this.f16896s;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.c(aVar);
            this.f16891n.c(this.f16895r, this.f16892o);
            this.f16895r.J(this);
        }
        return this.f16891n;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f16895r.C();
    }

    public int getPopupTheme() {
        return this.f16893p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.g(false);
            if (this.f16895r.G()) {
                this.f16895r.D();
                this.f16895r.M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f16898u) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = l0.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f16903a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f16903a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f16903a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = i28 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f16898u;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f16898u = z11;
        if (z10 != z11) {
            this.f16899v = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f16898u && (eVar = this.f16891n) != null && size != this.f16899v) {
            this.f16899v = size;
            eVar.N(true);
        }
        int childCount = getChildCount();
        if (this.f16898u && childCount > 0) {
            K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f16895r.I(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f16902y = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f16895r.K(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f16894q = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f16893p != i10) {
            this.f16893p = i10;
            if (i10 == 0) {
                this.f16892o = getContext();
            } else {
                this.f16892o = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f16895r = actionMenuPresenter;
        actionMenuPresenter.J(this);
    }

    public void z() {
        ActionMenuPresenter actionMenuPresenter = this.f16895r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16900w = (int) (56.0f * f10);
        this.f16901x = (int) (f10 * 4.0f);
        this.f16892o = context;
        this.f16893p = 0;
    }
}

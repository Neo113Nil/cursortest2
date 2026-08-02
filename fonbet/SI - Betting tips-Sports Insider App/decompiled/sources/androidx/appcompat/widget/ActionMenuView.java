package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActionMenuView extends l2 implements androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.n f614a;

    /* renamed from: b, reason: collision with root package name */
    public Context f615b;

    /* renamed from: c, reason: collision with root package name */
    public int f616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f617d;

    /* renamed from: e, reason: collision with root package name */
    public n f618e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.view.menu.y f619f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.view.menu.l f620g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f621h;

    /* renamed from: i, reason: collision with root package name */
    public int f622i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f623k;

    /* renamed from: l, reason: collision with root package name */
    public s f624l;

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.j = (int) (56.0f * f6);
        this.f623k = (int) (f6 * 4.0f);
        this.f615b = context;
        this.f616c = 0;
    }

    public static q b() {
        q qVar = new q(-2, -2);
        qVar.f883a = false;
        ((LinearLayout.LayoutParams) qVar).gravity = 16;
        return qVar;
    }

    public static q c(ViewGroup.LayoutParams layoutParams) {
        q qVar;
        if (layoutParams == null) {
            return b();
        }
        if (layoutParams instanceof q) {
            q qVar2 = (q) layoutParams;
            qVar = new q(qVar2);
            qVar.f883a = qVar2.f883a;
        } else {
            qVar = new q(layoutParams);
        }
        if (((LinearLayout.LayoutParams) qVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) qVar).gravity = 16;
        }
        return qVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean a(androidx.appcompat.view.menu.p pVar) {
        return this.f614a.performItemAction(pVar, 0);
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q;
    }

    public final boolean d(int i5) {
        boolean z5 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof o)) {
            z5 = ((o) childAt).a();
        }
        return (i5 <= 0 || !(childAt2 instanceof o)) ? z5 : ((o) childAt2).b() | z5;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public Menu getMenu() {
        if (this.f614a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.n nVar = new androidx.appcompat.view.menu.n(context);
            this.f614a = nVar;
            nVar.setCallback(new r(this));
            n nVar2 = new n(context);
            this.f618e = nVar2;
            nVar2.f846m = true;
            nVar2.f847n = true;
            androidx.appcompat.view.menu.y yVar = this.f619f;
            if (yVar == null) {
                yVar = new p();
            }
            nVar2.f839e = yVar;
            this.f614a.addMenuPresenter(nVar2, this.f615b);
            n nVar3 = this.f618e;
            nVar3.f842h = this;
            this.f614a = nVar3.f837c;
        }
        return this.f614a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        n nVar = this.f618e;
        l lVar = nVar.j;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (nVar.f845l) {
            return nVar.f844k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f616c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.b0
    public final void initialize(androidx.appcompat.view.menu.n nVar) {
        this.f614a = nVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n nVar = this.f618e;
        if (nVar != null) {
            nVar.updateMenuView(false);
            if (this.f618e.c()) {
                this.f618e.b();
                this.f618e.d();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f618e;
        if (nVar != null) {
            nVar.b();
            i iVar = nVar.f853u;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f560i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.f621h) {
            super.onLayout(z5, i5, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i5;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z7 = u4.f982a;
        boolean z10 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                q qVar = (q) childAt.getLayoutParams();
                if (qVar.f883a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) qVar).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) qVar).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) qVar).leftMargin) + ((LinearLayout.LayoutParams) qVar).rightMargin;
                    d(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                q qVar2 = (q) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !qVar2.f883a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) qVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) qVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            q qVar3 = (q) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !qVar3.f883a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) qVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) qVar3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.l2, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        androidx.appcompat.view.menu.n nVar;
        boolean z5 = this.f621h;
        boolean z7 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.f621h = z7;
        if (z5 != z7) {
            this.f622i = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.f621h && (nVar = this.f614a) != null && size != this.f622i) {
            this.f622i = size;
            nVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f621h || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                q qVar = (q) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) qVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) qVar).leftMargin = 0;
            }
            super.onMeasure(i5, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i5);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.j;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z10 = false;
        int i25 = 0;
        long j = 0;
        while (true) {
            i11 = this.f623k;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            int i27 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z11) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                q qVar2 = (q) childAt.getLayoutParams();
                qVar2.f888f = false;
                qVar2.f885c = 0;
                qVar2.f884b = 0;
                qVar2.f886d = false;
                ((LinearLayout.LayoutParams) qVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) qVar2).rightMargin = 0;
                qVar2.f887e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = qVar2.f883a ? 1 : i18;
                q qVar3 = (q) childAt.getLayoutParams();
                int i29 = i18;
                i13 = i20;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z13 = z12;
                if (i28 <= 0 || (z12 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z13 && i14 < 2) {
                        i14 = 2;
                    }
                }
                qVar3.f886d = !qVar3.f883a && z13;
                qVar3.f884b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (qVar2.f886d) {
                    i25++;
                }
                if (qVar2.f883a) {
                    z10 = true;
                }
                i18 = i29 - i14;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j |= 1 << i24;
                }
            }
            i24++;
            size3 = i26;
            paddingBottom = i27;
            i20 = i13;
        }
        int i30 = size3;
        int i31 = i18;
        int i32 = i20;
        boolean z14 = z10 && i22 == 2;
        int i33 = i31;
        boolean z15 = false;
        while (i25 > 0 && i33 > 0) {
            int i34 = Integer.MAX_VALUE;
            long j6 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < childCount2) {
                int i37 = i21;
                q qVar4 = (q) getChildAt(i36).getLayoutParams();
                boolean z16 = z14;
                if (qVar4.f886d) {
                    int i38 = qVar4.f884b;
                    if (i38 < i34) {
                        j6 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        j6 |= 1 << i36;
                        i35++;
                    }
                }
                i36++;
                z14 = z16;
                i21 = i37;
            }
            i12 = i21;
            boolean z17 = z14;
            j |= j6;
            if (i35 > i33) {
                break;
            }
            int i39 = i34 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                q qVar5 = (q) childAt2.getLayoutParams();
                boolean z18 = z10;
                long j10 = 1 << i40;
                if ((j6 & j10) != 0) {
                    if (z17 && qVar5.f887e) {
                        r11 = 1;
                        r11 = 1;
                        if (i33 == 1) {
                            childAt2.setPadding(i11 + i32, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    qVar5.f884b += r11;
                    qVar5.f888f = r11;
                    i33--;
                } else if (qVar5.f884b == i39) {
                    j |= j10;
                }
                i40++;
                z10 = z18;
            }
            z14 = z17;
            i21 = i12;
            z15 = true;
        }
        i12 = i21;
        boolean z19 = !z10 && i22 == 1;
        if (i33 > 0 && j != 0 && (i33 < i22 - 1 || z19 || i23 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z19) {
                if ((j & 1) != 0 && !((q) getChildAt(0).getLayoutParams()).f887e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j & (1 << i41)) != 0 && !((q) getChildAt(i41).getLayoutParams()).f887e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z20 = z15;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    q qVar6 = (q) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        qVar6.f885c = i42;
                        qVar6.f888f = true;
                        if (i43 == 0 && !qVar6.f887e) {
                            ((LinearLayout.LayoutParams) qVar6).leftMargin = (-i42) / 2;
                        }
                        z20 = true;
                    } else if (qVar6.f883a) {
                        qVar6.f885c = i42;
                        qVar6.f888f = true;
                        ((LinearLayout.LayoutParams) qVar6).rightMargin = (-i42) / 2;
                        z20 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) qVar6).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) qVar6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z15 = z20;
        }
        if (z15) {
            for (int i44 = 0; i44 < childCount2; i44++) {
                View childAt4 = getChildAt(i44);
                q qVar7 = (q) childAt4.getLayoutParams();
                if (qVar7.f888f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((qVar7.f884b * i32) + qVar7.f885c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f618e.f850r = z5;
    }

    public void setOnMenuItemClickListener(s sVar) {
        this.f624l = sVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        n nVar = this.f618e;
        l lVar = nVar.j;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            nVar.f845l = true;
            nVar.f844k = drawable;
        }
    }

    public void setOverflowReserved(boolean z5) {
        this.f617d = z5;
    }

    public void setPopupTheme(int i5) {
        if (this.f616c != i5) {
            this.f616c = i5;
            if (i5 == 0) {
                this.f615b = getContext();
            } else {
                this.f615b = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setPresenter(n nVar) {
        this.f618e = nVar;
        nVar.f842h = this;
        this.f614a = nVar.f837c;
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ k2 generateDefaultLayoutParams() {
        return b();
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ k2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new q(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup
    public final k2 generateLayoutParams(AttributeSet attributeSet) {
        return new q(getContext(), attributeSet);
    }
}

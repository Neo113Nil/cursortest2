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
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ac;
import defpackage.cc;
import defpackage.cgc;
import defpackage.dc;
import defpackage.ec;
import defpackage.efc;
import defpackage.fc;
import defpackage.fjg;
import defpackage.gc;
import defpackage.lvk;
import defpackage.sz8;
import defpackage.tec;
import defpackage.uec;
import defpackage.ug5;
import defpackage.vec;
import defpackage.wt3;
import defpackage.xfc;
import defpackage.z7b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements uec, cgc {
    public vec a;
    public Context b;
    public int c;
    public boolean d;
    public dc e;
    public fjg f;
    public tec g;
    public boolean h;
    public int i;
    public final int j;
    public final int k;
    public gc l;

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.j = (int) (56.0f * f);
        this.k = (int) (f * 4.0f);
        this.b = context;
        this.c = 0;
    }

    public static fc d() {
        fc fcVar = new fc(-2, -2);
        fcVar.a = false;
        ((LinearLayout.LayoutParams) fcVar).gravity = 16;
        return fcVar;
    }

    public static fc e(ViewGroup.LayoutParams layoutParams) {
        fc fcVar;
        if (layoutParams == null) {
            return d();
        }
        if (layoutParams instanceof fc) {
            fc fcVar2 = (fc) layoutParams;
            fcVar = new fc(fcVar2);
            fcVar.a = fcVar2.a;
        } else {
            fcVar = new fc(layoutParams);
        }
        if (((LinearLayout.LayoutParams) fcVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) fcVar).gravity = 16;
        }
        return fcVar;
    }

    @Override // defpackage.cgc
    public final void a(vec vecVar) {
        this.a = vecVar;
    }

    @Override // defpackage.uec
    public final boolean c(efc efcVar) {
        return this.a.q(efcVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fc;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ec)) {
            z = ((ec) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof ec)) ? z : ((ec) childAt2).c() | z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ z7b generateDefaultLayoutParams() {
        return d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final z7b generateLayoutParams(AttributeSet attributeSet) {
        return new fc(getContext(), attributeSet);
    }

    public Menu getMenu() {
        vec vecVar = this.a;
        if (vecVar != null) {
            return vecVar;
        }
        Context context = getContext();
        vec vecVar2 = new vec(context);
        this.a = vecVar2;
        vecVar2.e = new sz8(this, 4);
        dc dcVar = new dc(context);
        this.e = dcVar;
        dcVar.j = true;
        dcVar.k = true;
        xfc xfcVar = this.f;
        if (xfcVar == null) {
            xfcVar = new ug5();
        }
        dcVar.e = xfcVar;
        this.a.b(dcVar, this.b);
        dc dcVar2 = this.e;
        dcVar2.f = this;
        vec vecVar3 = dcVar2.c;
        this.a = vecVar3;
        return vecVar3;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        dc dcVar = this.e;
        cc ccVar = dcVar.g;
        if (ccVar != null) {
            return ccVar.getDrawable();
        }
        if (dcVar.i) {
            return dcVar.h;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dc dcVar = this.e;
        if (dcVar != null) {
            dcVar.f();
            if (this.e.k()) {
                this.e.j();
                this.e.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dc dcVar = this.e;
        if (dcVar != null) {
            dcVar.j();
            ac acVar = dcVar.r;
            if (acVar == null || !acVar.b()) {
                return;
            }
            acVar.j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.h) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = lvk.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                fc fcVar = (fc) childAt.getLayoutParams();
                if (fcVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) fcVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) fcVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) fcVar).leftMargin) + ((LinearLayout.LayoutParams) fcVar).rightMargin;
                    f(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                fc fcVar2 = (fc) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !fcVar2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) fcVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) fcVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            fc fcVar3 = (fc) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !fcVar3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) fcVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = wt3.B(measuredWidth4, ((LinearLayout.LayoutParams) fcVar3).rightMargin, max, i19);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        vec vecVar;
        boolean z = this.h;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.h = z2;
        if (z != z2) {
            this.i = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.h && (vecVar = this.a) != null && size != this.i) {
            this.i = size;
            vecVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.h || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                fc fcVar = (fc) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) fcVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) fcVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.j;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.k;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                fc fcVar2 = (fc) childAt.getLayoutParams();
                fcVar2.f = false;
                fcVar2.c = 0;
                fcVar2.b = 0;
                fcVar2.d = false;
                ((LinearLayout.LayoutParams) fcVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) fcVar2).rightMargin = 0;
                fcVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = fcVar2.a ? 1 : i10;
                fc fcVar3 = (fc) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                fcVar3.d = !fcVar3.a && z6;
                fcVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (fcVar2.d) {
                    i17++;
                }
                if (fcVar2.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                fc fcVar4 = (fc) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (fcVar4.d) {
                    int i30 = fcVar4.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                fc fcVar5 = (fc) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && fcVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    fcVar5.b += r11;
                    fcVar5.f = r11;
                    i25--;
                } else if (fcVar5.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((fc) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((fc) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    fc fcVar6 = (fc) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        fcVar6.c = i34;
                        fcVar6.f = true;
                        if (i35 == 0 && !fcVar6.e) {
                            ((LinearLayout.LayoutParams) fcVar6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (fcVar6.a) {
                        fcVar6.c = i34;
                        fcVar6.f = true;
                        ((LinearLayout.LayoutParams) fcVar6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) fcVar6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) fcVar6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                fc fcVar7 = (fc) childAt4.getLayoutParams();
                if (fcVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((fcVar7.b * i24) + fcVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.e.o = z;
    }

    public void setOnMenuItemClickListener(gc gcVar) {
        this.l = gcVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        dc dcVar = this.e;
        cc ccVar = dcVar.g;
        if (ccVar != null) {
            ccVar.setImageDrawable(drawable);
        } else {
            dcVar.i = true;
            dcVar.h = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.d = z;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.b = getContext();
            } else {
                this.b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(dc dcVar) {
        this.e = dcVar;
        dcVar.f = this;
        this.a = dcVar.c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ z7b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new fc(getContext(), attributeSet);
    }
}

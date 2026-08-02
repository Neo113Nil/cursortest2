package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.anf;
import defpackage.buk;
import defpackage.ca;
import defpackage.dkf;
import defpackage.e80;
import defpackage.eq3;
import defpackage.esi;
import defpackage.fsi;
import defpackage.gsi;
import defpackage.isi;
import defpackage.jsi;
import defpackage.ksi;
import defpackage.kta;
import defpackage.l4a;
import defpackage.lsi;
import defpackage.m6k;
import defpackage.mz1;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.q84;
import defpackage.qzb;
import defpackage.s0f;
import defpackage.suk;
import defpackage.t0f;
import defpackage.td4;
import defpackage.vha;
import defpackage.vi5;
import defpackage.w3a;
import defpackage.wz1;
import defpackage.x2a;
import defpackage.yfa;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@buk
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final t0f W = new t0f(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public anf I;
    public final TimeInterpolator J;
    public fsi K;
    public final ArrayList L;
    public kta M;
    public ValueAnimator N;
    public suk O;
    public PagerAdapter P;
    public q84 Q;
    public ksi R;
    public esi S;
    public boolean T;
    public int U;
    public final s0f V;
    public int a;
    public final ArrayList b;
    public jsi c;
    public final isi d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final float q;
    public final float r;
    public final float s;
    public final int t;
    public int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public int z;

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(oyn.U(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        int i2;
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.u = Integer.MAX_VALUE;
        this.F = -1;
        this.L = new ArrayList();
        this.V = new s0f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        isi isiVar = new isi(this, context2);
        this.d = isiVar;
        super.addView(isiVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.S, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList r = eq3.r(getBackground());
        if (r != null) {
            qzb qzbVar = new qzb();
            qzbVar.t(r);
            qzbVar.p(context2);
            qzbVar.s(getElevation());
            setBackground(qzbVar);
        }
        setSelectedTabIndicator(w3a.z(context2, Y, 5));
        setSelectedTabIndicatorColor(Y.getColor(8, 0));
        isiVar.b(Y.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(Y.getInt(10, 0));
        setTabIndicatorAnimationMode(Y.getInt(7, 0));
        setTabIndicatorFullWidth(Y.getBoolean(9, true));
        int dimensionPixelSize = Y.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = Y.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = Y.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = Y.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = Y.getDimensionPixelSize(17, dimensionPixelSize);
        if (x2a.L(context2.getTheme(), R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = Y.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = dkf.y;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.l = w3a.x(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (Y.hasValue(22)) {
                i2 = Y.getResourceId(22, resourceId);
                this.k = i2;
            } else {
                i2 = -1;
            }
            if (i2 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i2, iArr);
                try {
                    this.r = obtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList x = w3a.x(context2, obtainStyledAttributes, 3);
                    if (x != null) {
                        this.l = f(this.l.getDefaultColor(), x.getColorForState(new int[]{android.R.attr.state_selected}, x.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (Y.hasValue(25)) {
                this.l = w3a.x(context2, Y, 25);
            }
            if (Y.hasValue(23)) {
                this.l = f(this.l.getDefaultColor(), Y.getColor(23, 0));
            }
            this.m = w3a.x(context2, Y, 3);
            vha.F(Y.getInt(4, -1), null);
            this.n = w3a.x(context2, Y, 21);
            this.A = Y.getInt(6, 300);
            this.J = yfa.E(context2, R.attr.motionEasingEmphasizedInterpolator, e80.b);
            this.v = Y.getDimensionPixelSize(14, -1);
            this.w = Y.getDimensionPixelSize(13, -1);
            this.t = Y.getResourceId(0, 0);
            this.y = Y.getDimensionPixelSize(1, 0);
            this.C = Y.getInt(15, 1);
            this.z = Y.getInt(2, 0);
            this.D = Y.getBoolean(12, false);
            this.H = Y.getBoolean(26, false);
            Y.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = this.C;
        if (i2 == 0 || i2 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        isi isiVar = this.d;
        int childCount = isiVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = isiVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof lsi) {
                        ((lsi) childAt).e();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(fsi fsiVar) {
        ArrayList arrayList = this.L;
        if (arrayList.contains(fsiVar)) {
            return;
        }
        arrayList.add(fsiVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(jsi jsiVar, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (jsiVar.d != this) {
            a70.p("Tab belongs to a different TabLayout.");
            return;
        }
        jsiVar.b = size;
        arrayList.add(size, jsiVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((jsi) arrayList.get(i2)).b == this.a) {
                i = i2;
            }
            ((jsi) arrayList.get(i2)).b = i2;
        }
        this.a = i;
        lsi lsiVar = jsiVar.e;
        lsiVar.setSelected(false);
        lsiVar.setActivated(false);
        int i3 = jsiVar.b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.C == 1 && this.z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.d.addView(lsiVar, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = jsiVar.d;
            if (tabLayout != null) {
                tabLayout.l(jsiVar, true);
            } else {
                a70.p("Tab not attached to a TabLayout");
            }
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            isi isiVar = this.d;
            int childCount = isiVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (isiVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int e = e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
            if (scrollX != e) {
                g();
                this.N.setIntValues(scrollX, e);
                this.N.start();
            }
            ValueAnimator valueAnimator = isiVar.a;
            if (valueAnimator != null && valueAnimator.isRunning() && isiVar.b.a != i) {
                isiVar.a.cancel();
            }
            isiVar.d(i, this.A, true);
            return;
        }
        n(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r0 != 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i = this.C;
        int max = (i == 0 || i == 2) ? Math.max(0, this.y - this.e) : 0;
        isi isiVar = this.d;
        isiVar.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.C;
        if (i2 == 0) {
            int i3 = this.z;
            if (i3 != 0) {
                if (i3 == 1) {
                    isiVar.setGravity(1);
                }
            }
            isiVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            isiVar.setGravity(1);
        }
        p(true);
    }

    public final int e(float f, int i) {
        isi isiVar;
        View childAt;
        int i2 = this.C;
        if ((i2 != 0 && i2 != 2) || (childAt = (isiVar = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < isiVar.getChildCount() ? isiVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void g() {
        if (this.N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.N = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.N.setDuration(this.A);
            this.N.addUpdateListener(new wz1(this, 4));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        jsi jsiVar = this.c;
        if (jsiVar != null) {
            return jsiVar.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final jsi h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (jsi) this.b.get(i);
    }

    public final jsi i() {
        jsi jsiVar = (jsi) W.c();
        if (jsiVar == null) {
            jsiVar = new jsi();
            jsiVar.b = -1;
        }
        jsiVar.d = this;
        s0f s0fVar = this.V;
        lsi lsiVar = s0fVar != null ? (lsi) s0fVar.c() : null;
        if (lsiVar == null) {
            lsiVar = new lsi(this, getContext());
        }
        lsiVar.setTab(jsiVar);
        lsiVar.setFocusable(true);
        lsiVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            lsiVar.setContentDescription(jsiVar.a);
        } else {
            lsiVar.setContentDescription(null);
        }
        jsiVar.e = lsiVar;
        return jsiVar;
    }

    public final void j() {
        int currentItem;
        k();
        PagerAdapter pagerAdapter = this.P;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                }
                jsi i2 = i();
                CharSequence pageTitle = this.P.getPageTitle(i);
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(pageTitle)) {
                    i2.e.setContentDescription(pageTitle);
                }
                i2.a = pageTitle;
                lsi lsiVar = i2.e;
                if (lsiVar != null) {
                    lsiVar.e();
                    jsi jsiVar = lsiVar.a;
                    lsiVar.setSelected(jsiVar != null && jsiVar.a());
                }
                b(i2, false);
                i++;
            }
            suk sukVar = this.O;
            if (sukVar == null || count <= 0 || (currentItem = sukVar.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            l(h(currentItem), true);
        }
    }

    public final void k() {
        isi isiVar = this.d;
        int childCount = isiVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            lsi lsiVar = (lsi) isiVar.getChildAt(childCount);
            isiVar.removeViewAt(childCount);
            if (lsiVar != null) {
                lsiVar.setTab(null);
                lsiVar.setSelected(false);
                this.V.b(lsiVar);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jsi jsiVar = (jsi) it.next();
            it.remove();
            jsiVar.d = null;
            jsiVar.e = null;
            jsiVar.a = null;
            jsiVar.b = -1;
            jsiVar.c = null;
            W.b(jsiVar);
        }
        this.c = null;
    }

    public final void l(jsi jsiVar, boolean z) {
        TabLayout tabLayout;
        jsi jsiVar2 = this.c;
        ArrayList arrayList = this.L;
        if (jsiVar2 == jsiVar) {
            if (jsiVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((fsi) arrayList.get(size)).b(jsiVar);
                }
                c(jsiVar.b);
                return;
            }
            return;
        }
        int i = jsiVar != null ? jsiVar.b : -1;
        if (z) {
            if ((jsiVar2 == null || jsiVar2.b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.n(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.c(i);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = jsiVar;
        if (jsiVar2 != null && jsiVar2.d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((fsi) arrayList.get(size2)).a(jsiVar2);
            }
        }
        if (jsiVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((fsi) arrayList.get(size3)).c(jsiVar);
            }
        }
    }

    public final void m(PagerAdapter pagerAdapter, boolean z) {
        q84 q84Var;
        PagerAdapter pagerAdapter2 = this.P;
        if (pagerAdapter2 != null && (q84Var = this.Q) != null) {
            pagerAdapter2.unregisterDataSetObserver(q84Var);
        }
        this.P = pagerAdapter;
        if (z && pagerAdapter != null) {
            q84 q84Var2 = this.Q;
            if (q84Var2 == null) {
                q84Var2 = new q84(this, 2);
                this.Q = q84Var2;
            }
            pagerAdapter.registerDataSetObserver(q84Var2);
        }
        j();
    }

    public final void n(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            isi isiVar = this.d;
            if (round >= isiVar.getChildCount()) {
                return;
            }
            if (z2) {
                isiVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = isiVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    isiVar.a.cancel();
                }
                isiVar.c(isiVar.getChildAt(i), isiVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            int e = e(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.U == 1 || z3) {
                if (i < 0) {
                    e = 0;
                }
                scrollTo(e, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void o(suk sukVar, boolean z) {
        TabLayout tabLayout;
        suk sukVar2 = this.O;
        if (sukVar2 != null) {
            ksi ksiVar = this.R;
            if (ksiVar != null) {
                sukVar2.removeOnPageChangeListener(ksiVar);
            }
            esi esiVar = this.S;
            if (esiVar != null) {
                this.O.removeOnAdapterChangeListener(esiVar);
            }
        }
        kta ktaVar = this.M;
        if (ktaVar != null) {
            this.L.remove(ktaVar);
            this.M = null;
        }
        if (sukVar != null) {
            this.O = sukVar;
            ksi ksiVar2 = this.R;
            if (ksiVar2 == null) {
                ksiVar2 = new ksi(this);
                this.R = ksiVar2;
            }
            ksiVar2.c = 0;
            ksiVar2.b = 0;
            sukVar.addOnPageChangeListener(ksiVar2);
            kta ktaVar2 = new kta(sukVar, 1);
            this.M = ktaVar2;
            a(ktaVar2);
            PagerAdapter adapter = sukVar.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            esi esiVar2 = this.S;
            if (esiVar2 == null) {
                esiVar2 = new esi(this);
                this.S = esiVar2;
            }
            esiVar2.a = true;
            sukVar.addOnAdapterChangeListener(esiVar2);
            tabLayout = this;
            tabLayout.n(sukVar.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.O = null;
            tabLayout.m(null, false);
        }
        tabLayout.T = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof qzb) {
            l4a.I(this, (qzb) background);
        }
        if (this.O == null) {
            ViewParent parent = getParent();
            if (parent instanceof suk) {
                o((suk) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        while (true) {
            isi isiVar = this.d;
            if (i >= isiVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = isiVar.getChildAt(i);
            if (childAt instanceof lsi) {
                lsi lsiVar = (lsi) childAt;
                int i2 = lsi.l;
                Drawable drawable = lsiVar.i;
                if (drawable != null) {
                    drawable.setBounds(lsiVar.getLeft(), lsiVar.getTop(), lsiVar.getRight(), lsiVar.getBottom());
                    lsiVar.i.draw(canvas);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ca.b(1, getTabCount(), 1, false).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int round = Math.round(vha.p(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.w;
            if (i3 <= 0) {
                i3 = (int) (size - vha.p(56, getContext()));
            }
            this.u = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.C;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(boolean z) {
        int i = 0;
        while (true) {
            isi isiVar = this.d;
            if (i >= isiVar.getChildCount()) {
                return;
            }
            View childAt = isiVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.C == 1 && this.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof qzb) {
            ((qzb) background).s(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.D == z) {
            return;
        }
        this.D = z;
        int i = 0;
        while (true) {
            isi isiVar = this.d;
            if (i >= isiVar.getChildCount()) {
                d();
                return;
            }
            View childAt = isiVar.getChildAt(i);
            if (childAt instanceof lsi) {
                lsi lsiVar = (lsi) childAt;
                lsiVar.setOrientation(!lsiVar.k.D ? 1 : 0);
                TextView textView = lsiVar.g;
                if (textView == null && lsiVar.h == null) {
                    lsiVar.f(lsiVar.b, lsiVar.c, true);
                } else {
                    lsiVar.f(textView, lsiVar.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable fsi fsiVar) {
        fsi fsiVar2 = this.K;
        if (fsiVar2 != null) {
            this.L.remove(fsiVar2);
        }
        this.K = fsiVar;
        if (fsiVar != null) {
            a(fsiVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.o = mutate;
        int i = this.p;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.F;
        if (i2 == -1) {
            i2 = this.o.getIntrinsicHeight();
        }
        this.d.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.B != i) {
            this.B = i;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.F = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lsi lsiVar = ((jsi) arrayList.get(i)).e;
                if (lsiVar != null) {
                    lsiVar.e();
                    jsi jsiVar = lsiVar.a;
                    lsiVar.setSelected(jsiVar != null && jsiVar.a());
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(eq3.q(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.G = i;
        if (i == 0) {
            this.I = new anf(3);
            return;
        }
        if (i == 1) {
            this.I = new vi5(0);
        } else if (i == 2) {
            this.I = new vi5(1);
        } else {
            a70.p(mz1.i(i, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        int i = isi.c;
        isi isiVar = this.d;
        isiVar.a(isiVar.b.getSelectedTabPosition());
        isiVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.C) {
            this.C = i;
            d();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            isi isiVar = this.d;
            if (i >= isiVar.getChildCount()) {
                return;
            }
            View childAt = isiVar.getChildAt(i);
            if (childAt instanceof lsi) {
                Context context = getContext();
                int i2 = lsi.l;
                ((lsi) childAt).d(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(eq3.q(i, getContext()));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lsi lsiVar = ((jsi) arrayList.get(i)).e;
                if (lsiVar != null) {
                    lsiVar.e();
                    jsi jsiVar = lsiVar.a;
                    lsiVar.setSelected(jsiVar != null && jsiVar.a());
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        int i = 0;
        while (true) {
            isi isiVar = this.d;
            if (i >= isiVar.getChildCount()) {
                return;
            }
            View childAt = isiVar.getChildAt(i);
            if (childAt instanceof lsi) {
                Context context = getContext();
                int i2 = lsi.l;
                ((lsi) childAt).d(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable suk sukVar) {
        o(sukVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable gsi gsiVar) {
        setOnTabSelectedListener((fsi) gsiVar);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(td4.d0(i, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }
}

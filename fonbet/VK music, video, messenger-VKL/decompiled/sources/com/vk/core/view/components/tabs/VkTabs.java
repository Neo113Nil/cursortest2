package com.vk.core.view.components.tabs;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.R$string;
import com.vk.core.tool.view.VkTabsHorizontalScrollView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.am;
import xsna.asp;
import xsna.byn0;
import xsna.cxu0;
import xsna.e3m;
import xsna.e43;
import xsna.egg0;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.hbh0;
import xsna.hk;
import xsna.iut0;
import xsna.iuw;
import xsna.ozl;
import xsna.rl3;
import xsna.rq7;
import xsna.s3q0;
import xsna.smk0;
import xsna.too0;
import xsna.wmr;
import xsna.wzs;
import xsna.xmr;
import xsna.zrp;

/* compiled from: VkTabs.kt */
/* loaded from: classes17.dex */
public final class VkTabs extends LinearLayout implements too0 {
    public static final /* synthetic */ int t = 0;
    public TabLayoutMode b;
    public final VkTabsAndIndicatorFrameLayout c;
    public final VkTabsHorizontalScrollView d;
    public final ArrayList e;
    public final ArrayList f;
    public Tab$Mode g;
    public c h;
    public c i;
    public final com.vk.core.view.components.tabs.a j;
    public boolean k;
    public final iuw l;
    public wmr m;
    public final xmr n;
    public int o;
    public GradientDrawable p;
    public GradientDrawable q;
    public final FrameLayout r;
    public final FrameLayout s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTabs.kt */
    public static final class TabLayoutMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabLayoutMode[] $VALUES;
        public static final TabLayoutMode AUTO;
        public static final TabLayoutMode FILL_WIDTH;
        public static final TabLayoutMode FIXED;
        public static final TabLayoutMode SCROLLABLE;

        static {
            TabLayoutMode tabLayoutMode = new TabLayoutMode("AUTO", 0);
            AUTO = tabLayoutMode;
            TabLayoutMode tabLayoutMode2 = new TabLayoutMode("SCROLLABLE", 1);
            SCROLLABLE = tabLayoutMode2;
            TabLayoutMode tabLayoutMode3 = new TabLayoutMode("FIXED", 2);
            FIXED = tabLayoutMode3;
            TabLayoutMode tabLayoutMode4 = new TabLayoutMode("FILL_WIDTH", 3);
            FILL_WIDTH = tabLayoutMode4;
            TabLayoutMode[] tabLayoutModeArr = {tabLayoutMode, tabLayoutMode2, tabLayoutMode3, tabLayoutMode4};
            $VALUES = tabLayoutModeArr;
            $ENTRIES = new asp(tabLayoutModeArr);
        }

        public TabLayoutMode() {
            throw null;
        }

        public static TabLayoutMode valueOf(String str) {
            return (TabLayoutMode) Enum.valueOf(TabLayoutMode.class, str);
        }

        public static TabLayoutMode[] values() {
            return (TabLayoutMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkTabs.kt */
    public final class a implements gzs<s3q0> {
        public a() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            VkTabs vkTabs = VkTabs.this;
            VkTabsAndIndicatorFrameLayout vkTabsAndIndicatorFrameLayout = vkTabs.c;
            float f = vkTabs.l.c;
            float f2 = 1;
            float f3 = f % f2;
            if (f3 > 0.5f) {
                f3 -= f2;
            }
            int i = (int) (f - f3);
            float f4 = f % f2;
            if (f4 > 0.5f) {
                f4 -= f2;
            }
            vkTabsAndIndicatorFrameLayout.f = i;
            vkTabsAndIndicatorFrameLayout.g = f4;
            if (vkTabsAndIndicatorFrameLayout.h) {
                vkTabsAndIndicatorFrameLayout.a();
            } else {
                vkTabsAndIndicatorFrameLayout.requestLayout();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkTabs.kt */
    public interface b {
        void a(c cVar);

        void b();

        void c(c cVar);
    }

    /* compiled from: VkTabs.kt */
    public static final class c {
        public final com.vk.core.view.components.tabs.d a;
        public boolean c;
        public int b = -1;
        public boolean d = true;

        public c(com.vk.core.view.components.tabs.d dVar) {
            this.a = dVar;
        }

        public static void a(c cVar, CharSequence charSequence) {
            cVar.a.Y4(charSequence, null);
        }
    }

    /* compiled from: VkTabs.kt */
    public static final class d extends hk {
        public final c b;

        public d(c cVar) {
            this.b = cVar;
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            c cVar = this.b;
            amVar.q(am.h.a(0, 1, cVar.b, 1, cVar.c));
            if (cVar.c) {
                amVar.o(false);
                amVar.i(am.a.e);
            }
            amVar.w(view.getResources().getString(R$string.item_view_role_description));
        }
    }

    /* compiled from: View.kt */
    public static final class f implements View.OnLayoutChangeListener {
        public final /* synthetic */ c b;

        public f(c cVar) {
            this.b = cVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            com.vk.core.view.components.tabs.d dVar = this.b.a;
            dVar.m0(0, dVar.getWidth());
        }
    }

    public VkTabs(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void k(VkTabs vkTabs, c cVar) {
        int indexOf;
        ArrayList arrayList = vkTabs.f;
        if (cVar.d && (indexOf = arrayList.indexOf(cVar)) >= 0 && indexOf < arrayList.size()) {
            vkTabs.l(indexOf, true);
        }
    }

    private final void setFixedIconDividerAndFadeVisibility(c cVar) {
        if (cVar == null) {
            return;
        }
        int i = cVar.b;
        ArrayList arrayList = this.f;
        this.n.setDividerVisible((i == e43.h(arrayList) || this.m == null) ? false : true);
        this.s.setVisibility((cVar.b == e43.h(arrayList) || this.m == null) ? 8 : 0);
    }

    private final void setFixedTabDividerAndFadeVisibility(c cVar) {
        if (cVar == null) {
            return;
        }
        this.j.setDividerVisible((cVar.b == 0 || this.i == null) ? false : true);
        this.r.setVisibility((cVar.b == 0 || this.i == null) ? 8 : 0);
    }

    private final void setShowFixedTabIndicator(boolean z) {
        this.k = z;
        o();
    }

    @Override // xsna.too0
    public final void Ng() {
        cxu0 cxu0Var = cxu0.a;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        Context context = getContext();
        cxu0Var.getClass();
        this.p = cxu0.a(orientation, context);
        this.q = cxu0.a(GradientDrawable.Orientation.LEFT_RIGHT, getContext());
        this.r.setBackground(this.p);
        this.s.setBackground(this.q);
    }

    public final void a(b bVar) {
        this.e.add(bVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.vk.core.view.components.tabs.d) {
            b(new c((com.vk.core.view.components.tabs.d) view), true);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public final void b(c cVar, boolean z) {
        com.vk.core.view.components.tabs.d dVar = cVar.a;
        ArrayList arrayList = this.f;
        cVar.b = arrayList.size();
        cVar.a.setMode(this.g);
        arrayList.add(cVar);
        if (this.h == null && z) {
            k(this, cVar);
        }
        n(this.h);
        if (!dVar.hasOnClickListeners()) {
            dVar.setOnClickListener(new rq7(2, this, cVar));
        }
        iut0.q(dVar, new d(cVar));
        this.c.c.addView(dVar);
    }

    public final void d(TabLayoutMode tabLayoutMode) {
        getContext();
        this.d.setFillViewport((tabLayoutMode == TabLayoutMode.SCROLLABLE || tabLayoutMode == TabLayoutMode.FILL_WIDTH) ? false : true);
        this.c.setFixed(tabLayoutMode == TabLayoutMode.FIXED);
    }

    public final FrameLayout e(GradientDrawable gradientDrawable, int i) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = i;
        frameLayout.setLayoutParams(layoutParams);
        f4m.C(hbh0.b(20, frameLayout.getContext()), frameLayout);
        frameLayout.setVisibility(8);
        frameLayout.setBackground(gradientDrawable);
        return frameLayout;
    }

    public final c f(int i) {
        return (c) this.f.get(i);
    }

    public final c g() {
        return new c(d.a.a(getContext()));
    }

    public final wmr getFixedIcon() {
        return this.m;
    }

    public final c getFixedTab() {
        return this.i;
    }

    public final boolean getLeftScrollFadingEdgeEnabled() {
        return this.d.getLeftFadingEdgeEnabled();
    }

    public final boolean getRightScrollFadingEdgeEnabled() {
        return this.d.getRightFadingEdgeEnabled();
    }

    public final c getSelectedTab() {
        return this.h;
    }

    public final TabLayoutMode getTabLayoutMode() {
        return this.b;
    }

    public final List<c> getTabs() {
        return this.f;
    }

    public final int getTabsCount() {
        return this.f.size();
    }

    public final void h(boolean z) {
        int size = this.f.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            i(size, z);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void i(int i, boolean z) {
        ArrayList arrayList = this.f;
        if (i >= 0 && i < arrayList.size()) {
            arrayList.remove(i);
            this.c.c.removeViewAt(i);
            int i2 = 0;
            for (Object obj : arrayList.subList(i, arrayList.size())) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                ((c) obj).b = i2;
                i2 = i3;
            }
        }
        if (z) {
            if (arrayList.isEmpty()) {
                this.h = null;
                return;
            }
            c cVar = this.h;
            if (cVar != null) {
                int i4 = cVar.b;
                int i5 = e43.g(arrayList).c;
                if (i4 > i5) {
                    i4 = i5;
                }
                l(i4, true);
            }
        }
    }

    public final void j() {
        c cVar;
        c cVar2 = this.i;
        if (cVar2 == null) {
            return;
        }
        com.vk.core.view.components.tabs.d dVar = cVar2.a;
        dVar.setSelected(true);
        cVar2.c = true;
        if (dVar.getWidth() > 0) {
            dVar.m0(0, dVar.getWidth());
        } else {
            dVar.addOnLayoutChangeListener(new f(cVar2));
        }
        c cVar3 = this.h;
        ArrayList arrayList = this.e;
        if (cVar3 != null) {
            if (!cVar3.equals(cVar2)) {
                Iterator it = new egg0(arrayList).iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else {
                        ((b) listIterator.previous()).a(cVar3);
                    }
                }
            } else {
                Iterator it2 = new egg0(arrayList).iterator();
                while (true) {
                    ListIterator<T> listIterator2 = ((egg0.a) it2).b;
                    if (!listIterator2.hasPrevious()) {
                        break;
                    } else {
                        ((b) listIterator2.previous()).b();
                    }
                }
            }
        }
        this.h = cVar2;
        if (!cVar2.equals(cVar3) && (cVar = this.h) != null) {
            Iterator it3 = new egg0(arrayList).iterator();
            while (true) {
                ListIterator<T> listIterator3 = ((egg0.a) it3).b;
                if (!listIterator3.hasPrevious()) {
                    break;
                } else {
                    ((b) listIterator3.previous()).c(cVar);
                }
            }
        }
        Iterator it4 = this.f.iterator();
        while (it4.hasNext()) {
            c cVar4 = (c) it4.next();
            cVar4.a.setSelected(false);
            cVar4.c = false;
        }
        setShowFixedTabIndicator(true);
        this.c.setDisableIntersection(true);
        this.l.a(0);
        this.j.setDividerVisible(false);
    }

    public final void l(int i, boolean z) {
        c cVar = this.i;
        if (cVar != null) {
            com.vk.core.view.components.tabs.d dVar = cVar.a;
            if (epx.f(this.h, cVar)) {
                dVar.setSelected(false);
                cVar.c = false;
                this.c.setDisableIntersection(false);
                setShowFixedTabIndicator(false);
                dVar.m0(0, 0);
            }
        }
        c cVar2 = this.h;
        ArrayList arrayList = this.e;
        if (cVar2 != null && cVar2.b == i) {
            Iterator it = new egg0(arrayList).iterator();
            while (true) {
                ListIterator<T> listIterator = ((egg0.a) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                } else {
                    ((b) listIterator.previous()).b();
                }
            }
        } else {
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                c cVar3 = (c) it2.next();
                int i2 = cVar3.b;
                com.vk.core.view.components.tabs.d dVar2 = cVar3.a;
                if (i2 == i) {
                    this.h = cVar3;
                    dVar2.setSelected(true);
                    cVar3.c = true;
                } else {
                    dVar2.setSelected(false);
                    cVar3.c = false;
                }
            }
            if (cVar2 != null) {
                Iterator it3 = new egg0(arrayList).iterator();
                while (true) {
                    ListIterator<T> listIterator2 = ((egg0.a) it3).b;
                    if (!listIterator2.hasPrevious()) {
                        break;
                    } else {
                        ((b) listIterator2.previous()).a(cVar2);
                    }
                }
            }
            c cVar4 = this.h;
            if (cVar4 != null) {
                Iterator it4 = new egg0(arrayList).iterator();
                while (true) {
                    ListIterator<T> listIterator3 = ((egg0.a) it4).b;
                    if (!listIterator3.hasPrevious()) {
                        break;
                    } else {
                        ((b) listIterator3.previous()).c(cVar4);
                    }
                }
                if (z) {
                    this.l.a(cVar4.b);
                }
            }
        }
        o();
    }

    public final void n(c cVar) {
        setFixedTabDividerAndFadeVisibility(cVar);
        setFixedIconDividerAndFadeVisibility(cVar);
    }

    public final void o() {
        boolean z = this.k && epx.f(this.h, this.i);
        this.j.setIndicatorVisible(z);
        this.c.getIndicatorContainer().setVisibility(z ? 8 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        iuw iuwVar = this.l;
        if (iuwVar.e) {
            return;
        }
        iuwVar.e = true;
        iuwVar.a.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        iuw iuwVar = this.l;
        if (iuwVar.e) {
            iuwVar.e = false;
            smk0 smk0Var = iuwVar.d;
            if (smk0Var != null) {
                smk0Var.d();
                iuwVar.c = (float) smk0Var.u.i;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) am.g.a(1, getTabsCount(), 1, false).a);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b != TabLayoutMode.FIXED) {
            VkTabsAndIndicatorFrameLayout vkTabsAndIndicatorFrameLayout = this.c;
            View indicatorContainer = vkTabsAndIndicatorFrameLayout.getIndicatorContainer();
            int width = indicatorContainer.getWidth();
            int left = vkTabsAndIndicatorFrameLayout.getLeft() + indicatorContainer.getLeft();
            VkTabsHorizontalScrollView vkTabsHorizontalScrollView = this.d;
            vkTabsHorizontalScrollView.scrollTo(left - ((vkTabsHorizontalScrollView.getWidth() - width) / 2), vkTabsHorizontalScrollView.getScrollY());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TabLayoutMode tabLayoutMode = this.b;
        TabLayoutMode tabLayoutMode2 = TabLayoutMode.FILL_WIDTH;
        ArrayList arrayList = this.f;
        if (tabLayoutMode == tabLayoutMode2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a.setMinWidth(0);
            }
        }
        super.onMeasure(i, i2);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        if (this.b != TabLayoutMode.FILL_WIDTH || unmodifiableList.isEmpty()) {
            return;
        }
        VkTabsHorizontalScrollView vkTabsHorizontalScrollView = this.d;
        int measuredWidth = vkTabsHorizontalScrollView.getMeasuredWidth() - (vkTabsHorizontalScrollView.getPaddingEnd() + (vkTabsHorizontalScrollView.getPaddingStart() + ((unmodifiableList.size() - 1) * (byn0.$EnumSwitchMapping$0[this.g.ordinal()] == 1 ? 0 : e3m.a(R.dimen.vk_ui_spacing_size_s, getContext())))));
        List list = unmodifiableList;
        Iterator it2 = list.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            com.vk.core.view.components.tabs.d dVar = ((c) it2.next()).a;
            i3 += dVar.getMeasuredWidth();
            if (dVar.getMeasuredWidth() > i4) {
                i4 = dVar.getMeasuredWidth();
            }
        }
        if (i3 > measuredWidth || i4 > measuredWidth / unmodifiableList.size()) {
            int max = Math.max((measuredWidth - i3) / unmodifiableList.size(), 0);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.vk.core.view.components.tabs.d dVar2 = ((c) it3.next()).a;
                dVar2.setMinWidth(dVar2.getMeasuredWidth() + max);
            }
        } else {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).a.setMinWidth(measuredWidth / unmodifiableList.size());
            }
        }
        this.c.measure(0, 0);
    }

    public final void p() {
        Integer valueOf = Integer.valueOf(this.o);
        if (this.i == null) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Integer valueOf2 = Integer.valueOf(this.o);
        if (this.m == null) {
            valueOf2 = null;
        }
        setPaddingRelative(intValue, getPaddingTop(), valueOf2 != null ? valueOf2.intValue() : 0, getPaddingBottom());
        Integer valueOf3 = Integer.valueOf(this.o);
        if (this.i != null) {
            valueOf3 = null;
        }
        int intValue2 = valueOf3 != null ? valueOf3.intValue() : 0;
        Integer valueOf4 = this.m == null ? Integer.valueOf(this.o) : null;
        int intValue3 = valueOf4 != null ? valueOf4.intValue() : hbh0.b(2, getContext());
        VkTabsHorizontalScrollView vkTabsHorizontalScrollView = this.d;
        vkTabsHorizontalScrollView.setPaddingRelative(intValue2, vkTabsHorizontalScrollView.getPaddingTop(), intValue3, vkTabsHorizontalScrollView.getPaddingBottom());
    }

    @Override // android.view.View
    @ozl
    public void setFadingEdgeLength(int i) {
        super.setFadingEdgeLength(i);
    }

    public final void setFixedIcon(wmr wmrVar) {
        this.m = wmrVar;
        this.n.setIcon(wmrVar);
        setFixedIconDividerAndFadeVisibility(this.h);
        p();
    }

    public final void setFixedTab(c cVar) {
        this.i = cVar;
        if (cVar != null) {
            cVar.a.setMode(this.g);
        }
        if (cVar != null) {
            iut0.q(cVar.a, new d(cVar));
        }
        this.j.setTab(cVar);
        setFixedTabDividerAndFadeVisibility(this.h);
        p();
        o();
    }

    public final void setLeftScrollFadingEdgeEnabled(boolean z) {
        this.d.setLeftFadingEdgeEnabled(z);
    }

    public final void setMode(Tab$Mode tab$Mode) {
        int a2;
        this.g = tab$Mode;
        VkTabsAndIndicatorFrameLayout vkTabsAndIndicatorFrameLayout = this.c;
        vkTabsAndIndicatorFrameLayout.setMode(tab$Mode);
        this.j.setMode(tab$Mode);
        this.n.setMode(tab$Mode);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a.setMode(tab$Mode);
        }
        Context context = getContext();
        int[] iArr = byn0.$EnumSwitchMapping$0;
        int a3 = iArr[tab$Mode.ordinal()] == 1 ? 0 : e3m.a(R.dimen.vk_ui_spacing_size_m, context);
        VkTabsHorizontalScrollView vkTabsHorizontalScrollView = this.d;
        vkTabsHorizontalScrollView.setPadding(vkTabsHorizontalScrollView.getPaddingLeft(), a3, vkTabsHorizontalScrollView.getPaddingRight(), a3);
        vkTabsAndIndicatorFrameLayout.setGapBetweenTabs(iArr[tab$Mode.ordinal()] != 1 ? e3m.a(R.dimen.vk_ui_spacing_size_s, getContext()) : 0);
        Context context2 = getContext();
        if (iArr[tab$Mode.ordinal()] == 1) {
            Resources resources = context2.getResources();
            a2 = (int) (resources.getDimension(R.dimen.vk_ui_base_padding_horizontal) - resources.getDimension(R.dimen.vk_ui_spacing_size_xl));
        } else {
            a2 = e3m.a(R.dimen.vk_ui_spacing_size_m, context2);
        }
        this.o = a2;
        p();
        o();
    }

    public final void setRightScrollFadingEdgeEnabled(boolean z) {
        this.d.setRightFadingEdgeEnabled(z);
    }

    public final void setScrollChangeListener(final wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.d.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.mpv0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                int i5 = VkTabs.t;
                wzs.this.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        });
    }

    public final void setScrollFadingEdgeLength(int i) {
        this.d.setFadingEdgeLength(i);
    }

    public final void setTabLayoutMode(TabLayoutMode tabLayoutMode) {
        this.b = tabLayoutMode;
        d(tabLayoutMode);
    }

    public VkTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkTabs(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkTabs(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.ViewGroup, android.widget.LinearLayout, com.vk.core.view.components.tabs.VkTabs] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Enum] */
    public VkTabs(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = TabLayoutMode.AUTO;
        VkTabsAndIndicatorFrameLayout vkTabsAndIndicatorFrameLayout = new VkTabsAndIndicatorFrameLayout(context, null, 0, 14, 0);
        this.c = vkTabsAndIndicatorFrameLayout;
        VkTabsHorizontalScrollView vkTabsHorizontalScrollView = new VkTabsHorizontalScrollView(context, null, 0, 14, 0);
        vkTabsHorizontalScrollView.setClipChildren(false);
        vkTabsHorizontalScrollView.setClipToPadding(false);
        vkTabsHorizontalScrollView.setHorizontalScrollBarEnabled(false);
        vkTabsHorizontalScrollView.setVerticalScrollBarEnabled(false);
        this.d = vkTabsHorizontalScrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = e43.o(new e());
        this.f = new ArrayList();
        com.vk.core.view.components.tabs.a aVar = new com.vk.core.view.components.tabs.a(context);
        this.j = aVar;
        this.l = new iuw(new a());
        xmr xmrVar = new xmr(context);
        this.n = xmrVar;
        cxu0 cxu0Var = cxu0.a;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        cxu0Var.getClass();
        this.p = cxu0.a(orientation, context);
        this.q = cxu0.a(GradientDrawable.Orientation.LEFT_RIGHT, context);
        FrameLayout e2 = e(this.p, 8388611);
        this.r = e2;
        FrameLayout e3 = e(this.q, 8388613);
        this.s = e3;
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutTransition(new LayoutTransition());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        s3q0 s3q0Var = s3q0.a;
        super.addView(frameLayout, layoutParams);
        frameLayout.addView(vkTabsHorizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        vkTabsHorizontalScrollView.addView(vkTabsAndIndicatorFrameLayout, new ViewGroup.LayoutParams(-2, -2));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.G);
        Tab$Mode tab$Mode = Tab$Mode.Default;
        ?? r1 = (Enum) rl3.S(obtainStyledAttributes.getInt(1, tab$Mode.ordinal()), Tab$Mode.values());
        this.g = r1 != 0 ? r1 : tab$Mode;
        TabLayoutMode tabLayoutMode = this.b;
        ?? r12 = (Enum) rl3.S(obtainStyledAttributes.getInt(0, tabLayoutMode.ordinal()), TabLayoutMode.values());
        setTabLayoutMode(r12 != 0 ? r12 : tabLayoutMode);
        frameLayout.addView(e2);
        frameLayout.addView(e3);
        addView(aVar, 0);
        addView(xmrVar);
        setMode(this.g);
        obtainStyledAttributes.recycle();
        d(this.b);
    }

    /* compiled from: VkTabs.kt */
    public static final class e implements b {
        public e() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void c(c cVar) {
            int i = VkTabs.t;
            VkTabs.this.n(cVar);
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void b() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void a(c cVar) {
        }
    }
}

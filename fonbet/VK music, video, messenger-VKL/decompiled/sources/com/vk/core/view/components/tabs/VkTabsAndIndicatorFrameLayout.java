package com.vk.core.view.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.hfr;
import xsna.izs;
import xsna.jxt0;
import xsna.k9x;
import xsna.rli0;
import xsna.swe0;
import xsna.too0;

/* compiled from: VkTabsAndIndicatorFrameLayout.kt */
/* loaded from: classes17.dex */
public final class VkTabsAndIndicatorFrameLayout extends FrameLayout implements too0 {
    public boolean b;
    public final VkTabsLinearLayout c;
    public final FrameLayout d;
    public final VkTabsIndicator e;
    public int f;
    public float g;
    public boolean h;
    public Tab$Mode i;

    /* compiled from: _Sequences.kt */
    public static final class a implements izs<Object, Boolean> {
        public static final a b = new a();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d);
        }
    }

    public VkTabsAndIndicatorFrameLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final Pair<View, View> getSourceAndDestinationTabs() {
        VkTabsLinearLayout vkTabsLinearLayout = this.c;
        k9x q = swe0.q(0, vkTabsLinearLayout.getChildCount());
        int i = q.b;
        int i2 = q.c;
        int i3 = this.f;
        if (i > i3 || i3 > i2) {
            return null;
        }
        if (i3 == i2 && this.g > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (i3 == i && this.g < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        View childAt = vkTabsLinearLayout.getChildAt(i3);
        float f = this.g;
        return new Pair<>(childAt, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? childAt : f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? vkTabsLinearLayout.getChildAt(this.f - 1) : vkTabsLinearLayout.getChildAt(this.f + 1));
    }

    @Override // xsna.too0
    public final void Ng() {
        Tab$Mode tab$Mode = this.i;
        if (tab$Mode != null) {
            setMode(tab$Mode);
        }
    }

    public final void a() {
        Pair<View, View> sourceAndDestinationTabs = getSourceAndDestinationTabs();
        if (sourceAndDestinationTabs == null) {
            return;
        }
        View d = sourceAndDestinationTabs.d();
        View g = sourceAndDestinationTabs.g();
        float abs = Math.abs(this.g);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((g.getMeasuredWidth() * abs) + ((1 - abs) * d.getMeasuredWidth())), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.c.getMeasuredHeight(), 1073741824);
        getContext();
        measureChildWithMargins(this.d, makeMeasureSpec, 0, makeMeasureSpec2, 0);
    }

    public final boolean getDisableIntersection() {
        return this.b;
    }

    public final boolean getFixed() {
        return this.c.getFixed();
    }

    public final View getIndicatorContainer() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.h = false;
        VkTabsLinearLayout vkTabsLinearLayout = this.c;
        vkTabsLinearLayout.layout(0, 0, vkTabsLinearLayout.getMeasuredWidth(), vkTabsLinearLayout.getMeasuredHeight());
        Pair<View, View> sourceAndDestinationTabs = getSourceAndDestinationTabs();
        FrameLayout frameLayout = this.d;
        if (sourceAndDestinationTabs != null) {
            View d = sourceAndDestinationTabs.d();
            View g = sourceAndDestinationTabs.g();
            float abs = Math.abs(this.g);
            int left = (int) ((g.getLeft() * abs) + ((1 - abs) * d.getLeft()));
            frameLayout.layout(left, 0, frameLayout.getMeasuredWidth() + left, frameLayout.getMeasuredHeight());
        }
        hfr.a aVar = new hfr.a(rli0.j(new jxt0(vkTabsLinearLayout), a.b));
        while (aVar.hasNext()) {
            d dVar = (d) aVar.next();
            if (this.b) {
                dVar.m0(0, 0);
            } else {
                dVar.m0(swe0.h(frameLayout.getLeft() - dVar.getLeft(), new k9x(0, dVar.getWidth(), 1)), swe0.h(frameLayout.getRight() - dVar.getLeft(), new k9x(0, dVar.getWidth(), 1)));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildWithMargins(this.c, i, 0, i2, 0);
        a();
        VkTabsLinearLayout vkTabsLinearLayout = this.c;
        setMeasuredDimension(View.resolveSizeAndState(vkTabsLinearLayout.getMeasuredWidth(), i, vkTabsLinearLayout.getMeasuredState()), View.resolveSizeAndState(vkTabsLinearLayout.getMeasuredHeight(), i2, vkTabsLinearLayout.getMeasuredState() << 16));
        this.h = true;
    }

    public final void setDisableIntersection(boolean z) {
        this.b = z;
    }

    public final void setFixed(boolean z) {
        this.c.setFixed(z);
    }

    public final void setGapBetweenTabs(int i) {
        this.c.setGapWidth(i);
    }

    public final void setMode(Tab$Mode tab$Mode) {
        this.i = tab$Mode;
        this.e.setMode(tab$Mode);
    }

    public VkTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        VkTabsLinearLayout vkTabsLinearLayout = new VkTabsLinearLayout(context, null, 0, 14, 0);
        this.c = vkTabsLinearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        VkTabsIndicator vkTabsIndicator = new VkTabsIndicator(context, null, 0, 14, 0);
        this.e = vkTabsIndicator;
        frameLayout.addView(vkTabsIndicator, new ViewGroup.LayoutParams(-1, -1));
        addView(frameLayout);
        frameLayout.setClipChildren(false);
        addView(vkTabsLinearLayout, new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
    }
}

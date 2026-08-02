package com.vk.stories.design.view.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.d;
import kotlin.Pair;
import xsna.gdl0;
import xsna.hfr;
import xsna.izs;
import xsna.jxt0;
import xsna.k9x;
import xsna.rli0;
import xsna.swe0;

/* compiled from: StickersTabsAndIndicatorFrameLayout.kt */
/* loaded from: classes6.dex */
public final class StickersTabsAndIndicatorFrameLayout extends FrameLayout {
    public final StickersTabsLinearLayout b;
    public final FrameLayout c;
    public int d;
    public float e;

    /* compiled from: _Sequences.kt */
    public static final class a implements izs<Object, Boolean> {
        public static final a b = new a();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d);
        }
    }

    public StickersTabsAndIndicatorFrameLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final Pair<View, View> getSourceAndDestinationTabs() {
        StickersTabsLinearLayout stickersTabsLinearLayout = this.b;
        k9x q = swe0.q(0, stickersTabsLinearLayout.getChildCount());
        int i = q.b;
        int i2 = q.c;
        int i3 = this.d;
        if (i > i3 || i3 > i2) {
            return null;
        }
        if (i3 == i2 && this.e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (i3 == i && this.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        View childAt = stickersTabsLinearLayout.getChildAt(i3);
        float f = this.e;
        return new Pair<>(childAt, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? childAt : f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? stickersTabsLinearLayout.getChildAt(this.d - 1) : stickersTabsLinearLayout.getChildAt(this.d + 1));
    }

    public final View getIndicatorContainer() {
        return this.c;
    }

    public final int getTabsCount() {
        return this.b.getChildCount();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        StickersTabsLinearLayout stickersTabsLinearLayout = this.b;
        stickersTabsLinearLayout.layout(0, 0, stickersTabsLinearLayout.getMeasuredWidth(), stickersTabsLinearLayout.getMeasuredHeight());
        Pair<View, View> sourceAndDestinationTabs = getSourceAndDestinationTabs();
        FrameLayout frameLayout = this.c;
        if (sourceAndDestinationTabs != null) {
            View d = sourceAndDestinationTabs.d();
            View g = sourceAndDestinationTabs.g();
            float measuredWidth = (d.getMeasuredWidth() / 2.0f) + d.getLeft();
            float measuredWidth2 = ((((g.getMeasuredWidth() / 2.0f) + g.getLeft()) - measuredWidth) * Math.abs(this.e)) + measuredWidth;
            int measuredWidth3 = frameLayout.getMeasuredWidth();
            int i5 = (int) (measuredWidth2 - (measuredWidth3 / 2.0f));
            frameLayout.layout(i5, 0, measuredWidth3 + i5, frameLayout.getMeasuredHeight());
        }
        hfr.a aVar = new hfr.a(rli0.j(new jxt0(stickersTabsLinearLayout), a.b));
        while (aVar.hasNext()) {
            d dVar = (d) aVar.next();
            dVar.m0(swe0.h(frameLayout.getLeft() - dVar.getLeft(), new k9x(0, dVar.getWidth(), 1)), swe0.h(frameLayout.getRight() - dVar.getLeft(), new k9x(0, dVar.getWidth(), 1)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildWithMargins(this.b, i, 0, i2, 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gdl0.m, 1073741824);
        StickersTabsLinearLayout stickersTabsLinearLayout = this.b;
        measureChildWithMargins(this.c, makeMeasureSpec, 0, View.MeasureSpec.makeMeasureSpec(stickersTabsLinearLayout.getMeasuredHeight(), 1073741824), 0);
        setMeasuredDimension(View.resolveSizeAndState(stickersTabsLinearLayout.getMeasuredWidth(), i, stickersTabsLinearLayout.getMeasuredState()), View.resolveSizeAndState(stickersTabsLinearLayout.getMeasuredHeight(), i2, stickersTabsLinearLayout.getMeasuredState() << 16));
    }

    public final void setGapBetweenTabs(int i) {
        this.b.setGapWidth(i);
    }

    public StickersTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public StickersTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ StickersTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public StickersTabsAndIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        StickersTabsLinearLayout stickersTabsLinearLayout = new StickersTabsLinearLayout(context, null, 0, 14, 0);
        this.b = stickersTabsLinearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.addView(new StickersTabsIndicator(context, null, 0, 14, 0), new ViewGroup.LayoutParams(-1, -1));
        addView(frameLayout);
        addView(stickersTabsLinearLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
    }
}

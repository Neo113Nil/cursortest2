package com.vk.core.view.components.tabs;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import xsna.etn0;
import xsna.juw;
import xsna.ozl;
import xsna.too0;

/* compiled from: IndicatorTabLayout.kt */
@ozl
/* loaded from: classes17.dex */
public abstract class b extends VkTabLayout {
    public static final /* synthetic */ int w0 = 0;
    public final FrameLayout t0;
    public final FrameLayout u0;
    public boolean v0;

    /* compiled from: IndicatorTabLayout.kt */
    public final class a extends InsetDrawable {
        public a(Drawable drawable) {
            super(drawable, 0, 0, 0, 0);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            b bVar = b.this;
            if (bVar.v0) {
                int i5 = i3 - i;
                if (i5 < 0) {
                    i5 = 0;
                }
                if (bVar.getIndicator().getLayoutParams().width != i5) {
                    bVar.post(new juw(bVar, i5, 0));
                }
                bVar.getIndicator().setTranslationX(i);
            }
        }
    }

    /* compiled from: IndicatorTabLayout.kt */
    /* renamed from: com.vk.core.view.components.tabs.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0865b extends FrameLayout implements too0 {
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void A() {
        View childAt = getChildAt(0);
        LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        removeAllViews();
        AbstractC0865b indicator = getIndicator();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        FrameLayout frameLayout = this.u0;
        frameLayout.addView(indicator, layoutParams2);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = this.t0;
        frameLayout2.addView(frameLayout, layoutParams3);
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        addViewInLayout(frameLayout2, 0, layoutParams);
        requestLayout();
        setSelectedTabIndicator(new etn0(this, new ColorDrawable(0)));
        this.v0 = true;
    }

    public final FrameLayout getContainer() {
        return this.u0;
    }

    public final FrameLayout getFrameLayoutWrapper() {
        return this.t0;
    }

    public abstract AbstractC0865b getIndicator();

    @Override // com.vk.core.view.components.tabs.VkTabLayout
    public final void setDividerVisible(boolean z) {
        super.setDividerVisible(false);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void setSelectedTabIndicator(Drawable drawable) {
        super.setSelectedTabIndicator(new a(drawable));
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void setSelectedTabIndicatorColor(int i) {
        super.setSelectedTabIndicatorColor(0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.t0 = new FrameLayout(getContext());
        this.u0 = new FrameLayout(getContext());
    }
}

package com.vk.core.view.components.subnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.kxt0;

/* compiled from: VkSubnavigationBarLayout.kt */
/* loaded from: classes17.dex */
public final class VkSubnavigationBarLayout extends LinearLayout {
    public boolean b;

    public VkSubnavigationBarLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        } else if (!(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                view.setLayoutParams(new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
            } else {
                view.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (this.b) {
            layoutParams3.width = 0;
            layoutParams3.weight = 1.0f;
        } else {
            layoutParams3.width = -2;
            layoutParams3.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        view.setLayoutParams(layoutParams3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        a(view);
        super.addView(view);
    }

    public final boolean getFixed() {
        return this.b;
    }

    public final void setFixed(boolean z) {
        this.b = z;
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            a(kxt0Var.next());
        }
    }

    public VkSubnavigationBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkSubnavigationBarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkSubnavigationBarLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkSubnavigationBarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setClipChildren(false);
    }
}

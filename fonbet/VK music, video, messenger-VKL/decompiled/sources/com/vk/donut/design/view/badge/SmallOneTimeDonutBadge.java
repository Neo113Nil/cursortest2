package com.vk.donut.design.view.badge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.mqe0;
import xsna.msy;

/* compiled from: SmallOneTimeDonutBadge.kt */
/* loaded from: classes18.dex */
public final class SmallOneTimeDonutBadge extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final Object b;
    public String c;

    public SmallOneTimeDonutBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new mqe0(this, 9));
        this.c = "";
        View.inflate(context, R.layout.pds_donut_one_time_badge_small, this);
        setOrientation(0);
        setBackgroundResource(R.drawable.pds_bg_donut_gradient_small);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_m);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_s);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getTextView() {
        return (VkText) this.b.getValue();
    }

    public final String getAmount() {
        return this.c;
    }

    public final void setAmount(String str) {
        this.c = str;
        getTextView().setText(str);
    }
}

package com.vk.donut.design.view.badge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.iah0;
import xsna.k5h;
import xsna.msy;

/* compiled from: LargeOneTimeDonutBadge.kt */
/* loaded from: classes18.dex */
public final class LargeOneTimeDonutBadge extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final Object b;
    public String c;

    public LargeOneTimeDonutBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new k5h(this, 26));
        this.c = "";
        View.inflate(context, R.layout.pds_donut_one_time_badge_large, this);
        setOrientation(1);
        setBackgroundResource(R.drawable.pds_bg_donut_gradient_large);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_xl);
        setPaddingRelative(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_l), dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_xl));
        setMinimumWidth(iah0.a(116));
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

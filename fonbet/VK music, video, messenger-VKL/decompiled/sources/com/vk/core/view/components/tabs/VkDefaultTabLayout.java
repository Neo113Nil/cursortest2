package com.vk.core.view.components.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import xsna.etn0;
import xsna.ozl;

/* compiled from: VkDefaultTabLayout.kt */
@ozl
/* loaded from: classes17.dex */
public class VkDefaultTabLayout extends VkTabLayout {
    public VkDefaultTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setSelectedTabIndicatorColorAttr(R.attr.vk_ui_stroke_accent_themed);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void setSelectedTabIndicator(Drawable drawable) {
        super.setSelectedTabIndicator(new etn0(this, drawable));
    }
}

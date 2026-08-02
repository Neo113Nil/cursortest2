package com.vk.catalog.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.gpo0;
import xsna.hbh0;

/* compiled from: CatalogActionSortView.kt */
/* loaded from: classes16.dex */
public final class CatalogActionSortView extends LinearLayout {
    public final VkText b;

    public CatalogActionSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setText(context.getString(R.string.friends_catalog_sort));
        vkText.setTextAppearance(R.style.VkUiTypography_Paragraph);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
        vkText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        VkText vkText2 = new VkText(context, null, 6, 0);
        vkText2.setId(R.id.label);
        vkText2.setTextAppearance(R.style.VkUiTypography_Paragraph);
        vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(hbh0.b(4, context));
        layoutParams.setMarginEnd(hbh0.b(4, context));
        vkText2.setLayoutParams(layoutParams);
        this.b = vkText2;
        VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
        vkImageSimple.setId(R.id.image);
        gpo0.f(vkImageSimple, Integer.valueOf(R.attr.vk_ui_icon_secondary));
        vkImageSimple.setImageResource(R.drawable.vk_icon_sort_outline_24);
        vkImageSimple.setLayoutParams(new LinearLayout.LayoutParams(hbh0.b(24, context), hbh0.b(24, context)));
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        addView(vkText);
        addView(vkText2);
        addView(vkImageSimple);
    }

    public final CharSequence getLabel() {
        return this.b.getText();
    }

    public final void setLabel(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

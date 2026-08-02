package com.vk.newsfeed.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.too0;

/* compiled from: ProductBrandLogoView.kt */
/* loaded from: classes4.dex */
public final class ProductBrandLogoView extends View implements too0 {
    public final ColorStateList b;

    public ProductBrandLogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ColorStateList valueOf = ColorStateList.valueOf(context.getColor(R.color.vk_gray_100));
        this.b = valueOf;
        if (isInEditMode()) {
            return;
        }
        setBackgroundTintList(dhr0.L() ? null : valueOf);
    }

    @Override // xsna.too0
    public final void Ng() {
        if (isInEditMode()) {
            return;
        }
        setBackgroundTintList(!dhr0.L() ? this.b : null);
    }
}

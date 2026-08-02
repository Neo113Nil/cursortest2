package com.vk.clips.design.view.nps.internal.stars;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import xsna.zn6;

/* compiled from: CatalogStarsFeedbackView.kt */
/* loaded from: classes16.dex */
public final class CatalogStarsFeedbackView extends zn6 {
    public final int i;

    public CatalogStarsFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.layout.internal_nps_catalog_stars_feedback);
        this.i = R.color.vk_azure_300;
    }

    @Override // xsna.zn6
    public boolean getNeedToDropListenerAfterStarClick() {
        return false;
    }

    @Override // xsna.zn6
    public int getStarColor() {
        return this.i;
    }
}

package com.vk.clips.design.view.nps.internal.stars;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import xsna.zn6;

/* compiled from: ClipsStarsFeedbackView.kt */
/* loaded from: classes16.dex */
public final class ClipsStarsFeedbackView extends zn6 {
    public final boolean i;
    public final int j;

    public ClipsStarsFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.layout.internal_nps_stars_feedback);
        this.i = true;
        this.j = R.color.vk_white;
    }

    @Override // xsna.zn6
    public boolean getNeedToDropListenerAfterStarClick() {
        return this.i;
    }

    @Override // xsna.zn6
    public int getStarColor() {
        return this.j;
    }
}

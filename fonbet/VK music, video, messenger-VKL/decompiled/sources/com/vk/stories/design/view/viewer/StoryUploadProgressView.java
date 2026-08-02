package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.CircularProgressView;
import xsna.gkm0;

/* compiled from: StoryUploadProgressView.kt */
/* loaded from: classes6.dex */
public final class StoryUploadProgressView extends CircularProgressView implements gkm0 {
    public StoryUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = 0;
        a(attributeSet);
    }

    @Override // com.vk.core.ui.CircularProgressView, xsna.gkm0
    public void setProgress(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setIndeterminate(true);
        } else {
            setIndeterminate(false);
            super.setProgress(f);
        }
    }
}

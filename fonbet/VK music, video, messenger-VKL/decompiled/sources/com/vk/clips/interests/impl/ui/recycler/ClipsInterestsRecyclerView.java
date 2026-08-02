package com.vk.clips.interests.impl.ui.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsInterestsRecyclerView.kt */
/* loaded from: classes16.dex */
public final class ClipsInterestsRecyclerView extends RecyclerView {
    public ClipsInterestsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}

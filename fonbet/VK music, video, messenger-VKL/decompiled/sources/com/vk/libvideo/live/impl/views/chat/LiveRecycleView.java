package com.vk.libvideo.live.impl.views.chat;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.live.impl.views.chat.c;

/* loaded from: classes3.dex */
public class LiveRecycleView extends RecyclerView {
    public c b;
    public c c;
    public c d;
    public c e;

    public LiveRecycleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c.C1238c c1238c = c.C1238c.a;
        this.b = c1238c;
        this.c = c1238c;
        this.d = c1238c;
        this.e = c1238c;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return computeVerticalScrollExtent() + computeVerticalScrollOffset() < computeVerticalScrollRange() ? this.e.a(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.b.a(this);
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.c.a(this);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return computeVerticalScrollOffset() > 0 ? this.d.a(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void setBottomFadingEdgeMode(c cVar) {
        this.e = cVar;
    }

    public void setLeftFadingEdgeMode(c cVar) {
        this.b = cVar;
    }

    public void setRightFadingEdgeMode(c cVar) {
        this.c = cVar;
    }

    public void setTopFadingEdgeMode(c cVar) {
        this.d = cVar;
    }
}

package com.vk.newsfeed.impl.replybar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.writebar.WriteBar;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bwt0;

/* compiled from: ReplyBarGravityBehavior.kt */
/* loaded from: classes4.dex */
public final class ReplyBarGravityBehavior extends CoordinatorLayout.c<View> {
    public FunctionReferenceImpl b;
    public float c;
    public boolean d;

    public ReplyBarGravityBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1.0f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return (view2 instanceof WriteBar) || (view2 instanceof ReplyBarPlaceholderView);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        float measuredHeight = bwt0.K(view2) ? this.d ? view2.getMeasuredHeight() - view2.getTranslationY() : view2.getMeasuredHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z = this.c == measuredHeight;
        boolean z2 = !z;
        if (!z) {
            this.c = view.getTranslationY();
            ?? r5 = this.b;
            if (r5 != 0) {
                r5.invoke(Integer.valueOf((int) measuredHeight));
            }
            view.setTranslationY(-measuredHeight);
        }
        return z2;
    }
}

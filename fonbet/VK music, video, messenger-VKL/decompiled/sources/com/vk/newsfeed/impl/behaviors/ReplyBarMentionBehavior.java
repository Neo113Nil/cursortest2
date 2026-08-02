package com.vk.newsfeed.impl.behaviors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: ReplyBarMentionBehavior.kt */
/* loaded from: classes4.dex */
public final class ReplyBarMentionBehavior<V extends View> extends VkBottomSheetBehavior<V> {
    public int z;

    public ReplyBarMentionBehavior() {
        this.z = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return (view2 instanceof WriteBar) || (view2 instanceof ReplyBarPlaceholderView);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, V v, View view) {
        int measuredHeight = bwt0.K(view) ? view.getMeasuredHeight() : 0;
        boolean z = this.z != measuredHeight;
        if (z) {
            View findViewById = coordinatorLayout.findViewById(R.id.mention_select_recycler);
            if (findViewById == null) {
                return false;
            }
            this.z = measuredHeight;
            bwt0.f0(findViewById, 0, 0, 0, measuredHeight, 7);
        }
        return z;
    }

    public ReplyBarMentionBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = -1;
    }
}

package com.vk.feed.tool.view.newsfeed.text;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: VkFeedTextWrapper.kt */
/* loaded from: classes18.dex */
public final class VkFeedTextWrapper extends FrameLayout {
    public boolean b;

    public VkFeedTextWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() == 0 && (view instanceof TextView)) {
            super.addView(view);
        }
        throw new IllegalStateException("This view supports only one direct TextView child");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.b) {
            return;
        }
        super.requestChildFocus(view, view2);
    }

    public final void setIgnoreRequestPostTextFocus(boolean z) {
        this.b = z;
    }
}

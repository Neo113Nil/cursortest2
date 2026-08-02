package com.vk.feed.tool.view.newsfeed.empty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;

/* compiled from: FeedEmptyPlaceholder.kt */
/* loaded from: classes18.dex */
public final class FeedEmptyPlaceholder extends FrameLayout implements too0 {
    public final VkPlaceholder b;

    public FeedEmptyPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.feed_network_empty_list_error)), new VkPlaceholder.b.C0859b(14, null)));
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b = vkPlaceholder;
        addView(vkPlaceholder);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.Ng();
    }
}

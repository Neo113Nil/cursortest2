package com.vk.newsfeed.impl.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.iah0;

/* compiled from: UsableSearchRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public class UsableSearchRecyclerPaginatedView extends UsableRecyclerPaginatedView {
    public UsableSearchRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView, com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        TextView textView = new TextView(context);
        textView.setTextColor(-9341574);
        textView.setTextSize(14.0f);
        textView.setText(R.string.vk_discover_search_empty_list);
        float f = 16;
        textView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.vk_bottom_navigation_height);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final FrameLayout.LayoutParams e() {
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.vk_bottom_navigation_height);
        return layoutParams;
    }
}

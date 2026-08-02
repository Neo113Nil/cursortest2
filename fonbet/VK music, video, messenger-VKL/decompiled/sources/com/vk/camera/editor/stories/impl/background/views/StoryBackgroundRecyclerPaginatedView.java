package com.vk.camera.editor.stories.impl.background.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.paging.list.a;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.ee;
import xsna.iah0;
import xsna.x9l0;

/* compiled from: StoryBackgroundRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public final class StoryBackgroundRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public static final /* synthetic */ int O = 0;

    public StoryBackgroundRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return new Space(context);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        VkErrorView vkErrorView = new VkErrorView(context, null, 6, 0);
        vkErrorView.c(a.C0851a.a(context, new x9l0(vkErrorView, 2)));
        return vkErrorView;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final FrameLayout.LayoutParams g() {
        return new FrameLayout.LayoutParams(-1, (getContext().getResources().getDimensionPixelSize(R.dimen.story_background_editor_items_margin) * 2) + getContext().getResources().getDimensionPixelSize(R.dimen.story_background_editor_items_height), 80);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(-1));
        float f = 24;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 81));
        bwt0.f0(progressBar, 0, 0, 0, iah0.a(10), 7);
        return progressBar;
    }
}

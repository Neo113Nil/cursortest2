package com.vk.camera.editor.stories.impl.share.holders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.lists.AbstractPaginatedView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.j8j0;
import xsna.k8j0;
import xsna.m33;

/* compiled from: ShareStoryDataRecyclerView.kt */
/* loaded from: classes16.dex */
public final class ShareStoryDataRecyclerView extends VkRecyclerPaginatedView {
    public StoryShareContentType O;
    public int P;

    /* compiled from: ShareStoryDataRecyclerView.kt */
    public static final class a extends VkErrorView {
    }

    public ShareStoryDataRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.O = StoryShareContentType.BOTTOM_SHEET;
        this.P = 1;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, this);
        dVar.f = 0;
        dVar.a();
        setSwipeRefreshEnabled(false);
        setFooterLoadingViewProvider(new j8j0(this, attributeSet));
        setFooterErrorViewProvider(new k8j0(this, attributeSet));
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        VKCircleImageView vKCircleImageView = new VKCircleImageView(context);
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 6);
        int a2 = this.O == StoryShareContentType.LONG_TAP ? e3m.a(R.dimen.story_editor_avatar_size_small, context) : e3m.a(R.dimen.story_editor_avatar_size_big, context);
        vKCircleImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(a2, a2));
        f4m.t(iah0.a(4), vKCircleImageView);
        float f = 8;
        f4m.s(iah0.a(f), vKCircleImageView);
        f4m.r(iah0.a(f), vKCircleImageView);
        vKCircleImageView.setBackground(m33.a(R.drawable.story_skeleton, context));
        shimmerFrameLayout.addView(vKCircleImageView);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(true).g(0.08f).a());
        return shimmerFrameLayout;
    }

    public final void setLoadingHoldersCount(int i) {
        this.P = i;
    }

    public final void setType(StoryShareContentType storyShareContentType) {
        this.O = storyShareContentType;
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final VkErrorView d(Context context, AttributeSet attributeSet) {
        a aVar = new a(context, null, 6, 0);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        int i = this.P;
        for (int i2 = 0; i2 < i; i2++) {
            linearLayout.addView(h(context));
        }
        aVar.addView(linearLayout);
        return aVar;
    }
}

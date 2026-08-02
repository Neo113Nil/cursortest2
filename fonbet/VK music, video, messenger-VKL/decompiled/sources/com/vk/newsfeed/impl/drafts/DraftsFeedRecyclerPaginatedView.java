package com.vk.newsfeed.impl.drafts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.md;
import xsna.nj;
import xsna.ozf;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.uqu0;
import xsna.ve0;

/* compiled from: DraftsFeedRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class DraftsFeedRecyclerPaginatedView extends FeedRecyclerPaginatedView {
    public static final /* synthetic */ int a0 = 0;
    public gzs<s3q0> V;
    public final int W;

    public DraftsFeedRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.W = 48;
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return new Space(context);
        }
        uqu0 uqu0Var = new uqu0(context, attributeSet, 4);
        VkPlaceholder.b bVar = new VkPlaceholder.b(tq.h(tlo0.Companion, R.string.newsfeed_empty_drafts), b.a(null, new ve0(24), 3), new tlo0.f(R.string.newsfeed_empty_drafts_description), b.a(null, new nj(19), 3));
        tlo0.f fVar = new tlo0.f(R.string.newsfeed_drafts_create_post);
        VkButton.Mode mode = VkButton.Mode.Primary;
        uqu0Var.a(new a(null, bVar, new VkPlaceholder.a(new VkPlaceholder.a.C0854a(fVar, new ozf(this, 20), null, null, VkButton.Size.Small, mode, null, false, b.a(null, new md(27), 3), 828), (VkPlaceholder.a.C0854a) null, 6), 1));
        return x(context, uqu0Var, attributeSet);
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView
    public int getEmptyViewGravity() {
        return this.W;
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, xsna.vhp
    public void setEmptyViewButtonListener(gzs<s3q0> gzsVar) {
        this.V = gzsVar;
    }
}

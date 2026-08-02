package com.vk.friends.recommendations.impl.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.iah0;
import xsna.tlo0;
import xsna.tq;

/* compiled from: RecommendationsRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public final class RecommendationsRecyclerPaginatedView extends RecyclerPaginatedView {
    public RecommendationsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
        catalogFeatures.getClass();
        if (!com.vk.toggle.b.A.a(catalogFeatures)) {
            return super.c(context, attributeSet);
        }
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
        vkPlaceholder.setTop(new VkPlaceholder.c.d(new c.b(new gko(R.drawable.vk_icon_illustration_cat_closed_wall_78h)), iah0.a(78), 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.friends_recommendations_empty_placeholder_title)), null, 2));
        return vkPlaceholder;
    }
}

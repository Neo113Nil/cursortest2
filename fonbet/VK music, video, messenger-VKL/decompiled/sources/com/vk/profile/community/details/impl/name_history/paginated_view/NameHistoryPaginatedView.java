package com.vk.profile.community.details.impl.name_history.paginated_view;

import android.content.Context;
import android.util.AttributeSet;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.ee;
import xsna.ut50;

/* compiled from: NameHistoryPaginatedView.kt */
/* loaded from: classes5.dex */
public final class NameHistoryPaginatedView extends UsableRecyclerPaginatedView {
    public NameHistoryPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new ut50(context, attributeSet, 0);
    }
}

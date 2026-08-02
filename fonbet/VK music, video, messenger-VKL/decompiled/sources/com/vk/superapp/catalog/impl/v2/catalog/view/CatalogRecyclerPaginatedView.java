package com.vk.superapp.catalog.impl.v2.catalog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.lists.DefaultErrorView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.ee;

/* compiled from: CatalogRecyclerPaginatedView.kt */
/* loaded from: classes6.dex */
public final class CatalogRecyclerPaginatedView extends RecyclerPaginatedView {

    /* compiled from: CatalogRecyclerPaginatedView.kt */
    public static final class a extends DefaultErrorView {
        @Override // com.vk.lists.DefaultErrorView
        public int getLayoutId() {
            return R.layout.vk_apps_catalog_error_view;
        }

        @Override // com.vk.lists.DefaultErrorView
        public FrameLayout.LayoutParams getContainerLayoutParams() {
            return generateDefaultLayoutParams();
        }
    }

    public CatalogRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new a(context);
    }
}

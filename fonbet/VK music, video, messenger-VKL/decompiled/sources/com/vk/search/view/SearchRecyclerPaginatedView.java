package com.vk.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.krv0;

/* compiled from: SearchRecyclerPaginatedView.kt */
/* loaded from: classes5.dex */
public class SearchRecyclerPaginatedView extends RecyclerPaginatedView {
    public SearchRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        TypedValue typedValue = krv0.a;
        krv0.q(appCompatTextView, R.attr.vk_legacy_text_subhead);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setText(R.string.vk_discover_search_empty_list);
        float f = 16;
        appCompatTextView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        Context context2 = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = context2.getResources().getDimensionPixelOffset(R.dimen.vk_bottom_navigation_height);
        appCompatTextView.setLayoutParams(layoutParams);
        return appCompatTextView;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final FrameLayout.LayoutParams e() {
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.vk_bottom_navigation_height);
        return layoutParams;
    }
}

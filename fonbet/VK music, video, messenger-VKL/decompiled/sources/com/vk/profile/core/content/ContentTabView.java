package com.vk.profile.core.content;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.profile.core.content.ContentTab;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import xsna.ksn0;

/* compiled from: ContentTabView.kt */
/* loaded from: classes5.dex */
public final class ContentTabView extends TabView {
    public ContentTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setShadowColor(R.color.vk_black_alpha75);
    }

    @Override // com.vk.tab.presentation.TabView
    public final void a(ksn0 ksn0Var) {
        if (ksn0Var instanceof ContentTab.Options) {
            getIconView().setContentDescription(getContext().getString(R.string.accessibility_tab_pinning_options));
        }
    }

    public final void setShadowColor(int i) {
        getCardView().setOutlineSpotShadowColor(getContext().getColor(i));
    }
}

package ru.ozon.app.android.common.commonwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes11.dex */
public final class WidgetCommonTabsBinding implements a {

    @NonNull
    private final TabLayout rootView;

    @NonNull
    public final TabLayout tabsTl;

    private WidgetCommonTabsBinding(@NonNull TabLayout tabLayout, @NonNull TabLayout tabLayout2) {
        this.rootView = tabLayout;
        this.tabsTl = tabLayout2;
    }

    @NonNull
    public static WidgetCommonTabsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TabLayout tabLayout = (TabLayout) view;
        return new WidgetCommonTabsBinding(tabLayout, tabLayout);
    }

    @Override // X4.a
    @NonNull
    public TabLayout getRoot() {
        return this.rootView;
    }
}

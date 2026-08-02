package ru.ozon.app.android.cabinet.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes11.dex */
public final class WidgetTabsBinding implements a {

    @NonNull
    private final TabLayout rootView;

    @NonNull
    public final TabLayout tabsWidgetTabLayout;

    private WidgetTabsBinding(@NonNull TabLayout tabLayout, @NonNull TabLayout tabLayout2) {
        this.rootView = tabLayout;
        this.tabsWidgetTabLayout = tabLayout2;
    }

    @NonNull
    public static WidgetTabsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TabLayout tabLayout = (TabLayout) view;
        return new WidgetTabsBinding(tabLayout, tabLayout);
    }

    @Override // X4.a
    @NonNull
    public TabLayout getRoot() {
        return this.rootView;
    }
}

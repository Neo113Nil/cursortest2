package ru.ozon.app.android.common.ui.tabs.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.common.ui.tabs.R$id;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;

/* loaded from: classes11.dex */
public final class TabsV2Binding implements a {

    @NonNull
    public final TabsView dsTabs;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TabAtomView tabs;

    private TabsV2Binding(@NonNull FrameLayout frameLayout, @NonNull TabsView tabsView, @NonNull TabAtomView tabAtomView) {
        this.rootView = frameLayout;
        this.dsTabs = tabsView;
        this.tabs = tabAtomView;
    }

    @NonNull
    public static TabsV2Binding bind(@NonNull View view) {
        int i11 = R$id.dsTabs;
        TabsView tabsView = (TabsView) C2548q.d(i11, view);
        if (tabsView != null) {
            i11 = R$id.tabs;
            TabAtomView tabAtomView = (TabAtomView) C2548q.d(i11, view);
            if (tabAtomView != null) {
                return new TabsV2Binding((FrameLayout) view, tabsView, tabAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}

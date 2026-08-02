package ru.ozon.app.android.cml.feature.tabs.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.cml.feature.tabs.R$id;
import ru.ozon.app.android.cml.feature.tabs.R$layout;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes11.dex */
public final class FragmentCmlTabsNavigationBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenState;

    private FragmentCmlTabsNavigationBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ScreenStateViewWidget screenStateViewWidget) {
        this.rootView = coordinatorLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.rootContainer = fragmentContainerView;
        this.screenState = screenStateViewWidget;
    }

    @NonNull
    public static FragmentCmlTabsNavigationBinding bind(@NonNull View view) {
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            i11 = R$id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.screenState;
                ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                if (screenStateViewWidget != null) {
                    return new FragmentCmlTabsNavigationBinding((CoordinatorLayout) view, ozonBottomNavigationView, fragmentContainerView, screenStateViewWidget);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentCmlTabsNavigationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_cml_tabs_navigation, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CoordinatorLayout getConstraintLayout() {
        return this.rootView;
    }
}

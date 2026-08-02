package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.R$layout;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes3.dex */
public final class FragmentTravelTabBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenState;

    @NonNull
    public final View separatorForDarkTheme;

    private FragmentTravelTabBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull View view) {
        this.rootView = coordinatorLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.rootContainer = fragmentContainerView;
        this.screenState = screenStateViewWidget;
        this.separatorForDarkTheme = view;
    }

    @NonNull
    public static FragmentTravelTabBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            i11 = R$id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.screenState;
                ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                if (screenStateViewWidget != null && (d11 = C2548q.d((i11 = R$id.separatorForDarkTheme), view)) != null) {
                    return new FragmentTravelTabBinding((CoordinatorLayout) view, ozonBottomNavigationView, fragmentContainerView, screenStateViewWidget, d11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentTravelTabBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_travel_tab, viewGroup, false);
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

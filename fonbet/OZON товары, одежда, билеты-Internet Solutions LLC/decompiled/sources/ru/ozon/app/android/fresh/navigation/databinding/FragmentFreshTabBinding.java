package ru.ozon.app.android.fresh.navigation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.fresh.navigation.R$id;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes12.dex */
public final class FragmentFreshTabBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final CoordinatorLayout contentCl;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenState;

    @NonNull
    public final View separatorForDarkTheme;

    private FragmentFreshTabBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull FragmentContainerView fragmentContainerView, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull View view) {
        this.rootView = coordinatorLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.contentCl = coordinatorLayout2;
        this.rootContainer = fragmentContainerView;
        this.screenState = screenStateViewWidget;
        this.separatorForDarkTheme = view;
    }

    @NonNull
    public static FragmentFreshTabBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i11 = R$id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.screenState;
                ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                if (screenStateViewWidget != null && (d11 = C2548q.d((i11 = R$id.separatorForDarkTheme), view)) != null) {
                    return new FragmentFreshTabBinding(coordinatorLayout, ozonBottomNavigationView, coordinatorLayout, fragmentContainerView, screenStateViewWidget, d11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CoordinatorLayout getConstraintLayout() {
        return this.rootView;
    }
}

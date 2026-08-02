package ru.ozon.app.android.storefront.feature.miniapp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.storefront.feature.miniapp.R$id;
import ru.ozon.app.android.storefront.feature.miniapp.R$layout;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes2.dex */
public final class FragmentFakeozonTabNavigationBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final CoordinatorLayout contentCl;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    public final FrameLayout rootFl;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenState;

    private FragmentFakeozonTabNavigationBinding(@NonNull FrameLayout frameLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FrameLayout frameLayout2, @NonNull ScreenStateViewWidget screenStateViewWidget) {
        this.rootView = frameLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.contentCl = coordinatorLayout;
        this.rootContainer = fragmentContainerView;
        this.rootFl = frameLayout2;
        this.screenState = screenStateViewWidget;
    }

    @NonNull
    public static FragmentFakeozonTabNavigationBinding bind(@NonNull View view) {
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            i11 = R$id.contentCl;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C2548q.d(i11, view);
            if (coordinatorLayout != null) {
                i11 = R$id.rootContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
                if (fragmentContainerView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.screenState;
                    ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                    if (screenStateViewWidget != null) {
                        return new FragmentFakeozonTabNavigationBinding(frameLayout, ozonBottomNavigationView, coordinatorLayout, fragmentContainerView, frameLayout, screenStateViewWidget);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentFakeozonTabNavigationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_fakeozon_tab_navigation, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}

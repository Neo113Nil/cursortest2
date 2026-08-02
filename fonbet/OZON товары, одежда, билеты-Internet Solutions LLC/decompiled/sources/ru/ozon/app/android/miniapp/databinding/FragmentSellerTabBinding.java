package ru.ozon.app.android.miniapp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.miniapp.R$id;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes12.dex */
public final class FragmentSellerTabBinding implements a {

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

    @NonNull
    public final View separatorForDarkTheme;

    private FragmentSellerTabBinding(@NonNull FrameLayout frameLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FrameLayout frameLayout2, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull View view) {
        this.rootView = frameLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.contentCl = coordinatorLayout;
        this.rootContainer = fragmentContainerView;
        this.rootFl = frameLayout2;
        this.screenState = screenStateViewWidget;
        this.separatorForDarkTheme = view;
    }

    @NonNull
    public static FragmentSellerTabBinding bind(@NonNull View view) {
        View d11;
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
                    if (screenStateViewWidget != null && (d11 = C2548q.d((i11 = R$id.separatorForDarkTheme), view)) != null) {
                        return new FragmentSellerTabBinding(frameLayout, ozonBottomNavigationView, coordinatorLayout, fragmentContainerView, frameLayout, screenStateViewWidget, d11);
                    }
                }
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

package ru.ozon.app.android.travel.feature.entry.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.travel.feature.entry.R$id;
import ru.ozon.app.android.travel.feature.entry.R$layout;

/* loaded from: classes3.dex */
public final class FragmentOzonTravelBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final CoordinatorLayout coordinatorLayout;

    @NonNull
    public final FrameLayout fragmentRoot;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final FrameLayout rootView;

    private FragmentOzonTravelBinding(@NonNull FrameLayout frameLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout2, @NonNull FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.coordinatorLayout = coordinatorLayout;
        this.fragmentRoot = frameLayout2;
        this.rootContainer = fragmentContainerView;
    }

    @NonNull
    public static FragmentOzonTravelBinding bind(@NonNull View view) {
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            i11 = R$id.coordinatorLayout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C2548q.d(i11, view);
            if (coordinatorLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = R$id.rootContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
                if (fragmentContainerView != null) {
                    return new FragmentOzonTravelBinding(frameLayout, ozonBottomNavigationView, coordinatorLayout, frameLayout, fragmentContainerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentOzonTravelBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ozon_travel, viewGroup, false);
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

package ru.ozon.app.android.fresh.feature.entry.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.fresh.feature.entry.R$id;
import ru.ozon.app.android.fresh.feature.entry.R$layout;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;

/* loaded from: classes12.dex */
public final class FragmentOzonFreshBinding implements a {

    @NonNull
    public final OzonBottomNavigationView bottomNavigation;

    @NonNull
    public final CoordinatorLayout fragmentRoot;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    private FragmentOzonFreshBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull OzonBottomNavigationView ozonBottomNavigationView, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull FragmentContainerView fragmentContainerView) {
        this.rootView = coordinatorLayout;
        this.bottomNavigation = ozonBottomNavigationView;
        this.fragmentRoot = coordinatorLayout2;
        this.rootContainer = fragmentContainerView;
    }

    @NonNull
    public static FragmentOzonFreshBinding bind(@NonNull View view) {
        int i11 = R$id.bottomNavigation;
        OzonBottomNavigationView ozonBottomNavigationView = (OzonBottomNavigationView) C2548q.d(i11, view);
        if (ozonBottomNavigationView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            int i12 = R$id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i12, view);
            if (fragmentContainerView != null) {
                return new FragmentOzonFreshBinding(coordinatorLayout, ozonBottomNavigationView, coordinatorLayout, fragmentContainerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentOzonFreshBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ozon_fresh, viewGroup, false);
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

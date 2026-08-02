package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;

/* loaded from: classes13.dex */
public final class FragmentRegularDrawRootBinding implements a {

    @NonNull
    public final CoordinatorLayout contentCl;

    @NonNull
    public final FragmentContainerView rootContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    private FragmentRegularDrawRootBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull FragmentContainerView fragmentContainerView) {
        this.rootView = coordinatorLayout;
        this.contentCl = coordinatorLayout2;
        this.rootContainer = fragmentContainerView;
    }

    @NonNull
    public static FragmentRegularDrawRootBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i11 = R$id.rootContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
        if (fragmentContainerView != null) {
            return new FragmentRegularDrawRootBinding(coordinatorLayout, coordinatorLayout, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentRegularDrawRootBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_regular_draw_root, viewGroup, false);
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

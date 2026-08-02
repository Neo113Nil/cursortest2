package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;

/* loaded from: classes13.dex */
public final class FragmentDialogSearchCoordinatorBinding implements a {

    @NonNull
    public final AppBarLayout appBarLayout;

    @NonNull
    public final CollapsingToolbarLayout collapsingToolbar;

    @NonNull
    public final FragmentContainerView composerContainer;

    @NonNull
    public final View dialogCellSeparator;

    @NonNull
    public final FrameLayout dialogSearchBarContainer;

    @NonNull
    public final DialogSearchBarView dialogSearchBarView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final CoordinatorLayout searchCoordinatorLayout;

    @NonNull
    public final SearchShimmer shimmer;

    @NonNull
    public final RecyclerView tapTags;

    private FragmentDialogSearchCoordinatorBinding(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull DialogSearchBarView dialogSearchBarView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchShimmer searchShimmer, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.composerContainer = fragmentContainerView;
        this.dialogCellSeparator = view;
        this.dialogSearchBarContainer = frameLayout2;
        this.dialogSearchBarView = dialogSearchBarView;
        this.searchCoordinatorLayout = coordinatorLayout;
        this.shimmer = searchShimmer;
        this.tapTags = recyclerView;
    }

    @NonNull
    public static FragmentDialogSearchCoordinatorBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) C2548q.d(i11, view);
        if (appBarLayout != null) {
            i11 = R$id.collapsingToolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) C2548q.d(i11, view);
            if (collapsingToolbarLayout != null) {
                i11 = R$id.composerContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
                if (fragmentContainerView != null && (d11 = C2548q.d((i11 = R$id.dialogCellSeparator), view)) != null) {
                    i11 = R$id.dialogSearchBarContainer;
                    FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                    if (frameLayout != null) {
                        i11 = R$id.dialogSearchBarView;
                        DialogSearchBarView dialogSearchBarView = (DialogSearchBarView) C2548q.d(i11, view);
                        if (dialogSearchBarView != null) {
                            i11 = R$id.searchCoordinatorLayout;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C2548q.d(i11, view);
                            if (coordinatorLayout != null) {
                                i11 = R$id.shimmer;
                                SearchShimmer searchShimmer = (SearchShimmer) C2548q.d(i11, view);
                                if (searchShimmer != null) {
                                    i11 = R$id.tapTags;
                                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                    if (recyclerView != null) {
                                        return new FragmentDialogSearchCoordinatorBinding((FrameLayout) view, appBarLayout, collapsingToolbarLayout, fragmentContainerView, d11, frameLayout, dialogSearchBarView, coordinatorLayout, searchShimmer, recyclerView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentDialogSearchCoordinatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_dialog_search_coordinator, viewGroup, false);
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

package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3.AviaSearchV3ProgressView;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateView;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes8.dex */
public final class FragmentAviaSearchResultBinding implements a {

    @NonNull
    public final FragmentContainerView aviaSearchResultComposerFragmentContainer;

    @NonNull
    public final ErrorStateView aviaSearchResultErrorStateView;

    @NonNull
    public final SearchPreloaderView aviaSearchResultProgressBarView;

    @NonNull
    public final ViewProgressbarBgBinding aviaSearchResultProgressView;

    @NonNull
    public final LinearLayout aviaSearchResultQuickFiltersSkeleton;

    @NonNull
    public final RecyclerView aviaSearchResultRecyclerView;

    @NonNull
    public final ConstraintLayout aviaSearchResultRoot;

    @NonNull
    public final ScreenStateViewWidget aviaSearchResultScreenStateView;

    @NonNull
    public final AviaSearchV3ProgressView aviaSearchResultV3SkeletonView;

    @NonNull
    private final ConstraintLayout rootView;

    private FragmentAviaSearchResultBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull ErrorStateView errorStateView, @NonNull SearchPreloaderView searchPreloaderView, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull AviaSearchV3ProgressView aviaSearchV3ProgressView) {
        this.rootView = constraintLayout;
        this.aviaSearchResultComposerFragmentContainer = fragmentContainerView;
        this.aviaSearchResultErrorStateView = errorStateView;
        this.aviaSearchResultProgressBarView = searchPreloaderView;
        this.aviaSearchResultProgressView = viewProgressbarBgBinding;
        this.aviaSearchResultQuickFiltersSkeleton = linearLayout;
        this.aviaSearchResultRecyclerView = recyclerView;
        this.aviaSearchResultRoot = constraintLayout2;
        this.aviaSearchResultScreenStateView = screenStateViewWidget;
        this.aviaSearchResultV3SkeletonView = aviaSearchV3ProgressView;
    }

    @NonNull
    public static FragmentAviaSearchResultBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.aviaSearchResultComposerFragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
        if (fragmentContainerView != null) {
            i11 = R$id.aviaSearchResultErrorStateView;
            ErrorStateView errorStateView = (ErrorStateView) C2548q.d(i11, view);
            if (errorStateView != null) {
                i11 = R$id.aviaSearchResultProgressBarView;
                SearchPreloaderView searchPreloaderView = (SearchPreloaderView) C2548q.d(i11, view);
                if (searchPreloaderView != null && (d11 = C2548q.d((i11 = R$id.aviaSearchResultProgressView), view)) != null) {
                    ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
                    i11 = R$id.aviaSearchResultQuickFiltersSkeleton;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.aviaSearchResultRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.aviaSearchResultScreenStateView;
                            ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                            if (screenStateViewWidget != null) {
                                i11 = R$id.aviaSearchResultV3SkeletonView;
                                AviaSearchV3ProgressView aviaSearchV3ProgressView = (AviaSearchV3ProgressView) C2548q.d(i11, view);
                                if (aviaSearchV3ProgressView != null) {
                                    return new FragmentAviaSearchResultBinding(constraintLayout, fragmentContainerView, errorStateView, searchPreloaderView, bind, linearLayout, recyclerView, constraintLayout, screenStateViewWidget, aviaSearchV3ProgressView);
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
    public static FragmentAviaSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_avia_search_result, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

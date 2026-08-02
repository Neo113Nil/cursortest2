package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticSearchBarView;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;

/* loaded from: classes13.dex */
public final class FragmentSearchSuggestionsBinding implements a {

    @NonNull
    public final ImageButton backButton;

    @NonNull
    public final AppCompatTextView cancelButton;

    @NonNull
    public final FrameLayout cancelButtonContainer;

    @NonNull
    public final FragmentContainerView composerContainer;

    @NonNull
    public final ConstraintLayout host;

    @NonNull
    public final ConstraintLayout navBar;

    @NonNull
    public final ImageView navBarLeftActions;

    @NonNull
    public final ImageView navBarRightActions;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StaticSearchBarView searchBarView;

    @NonNull
    public final SearchShimmer shimmer;

    private FragmentSearchSuggestionsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull AppCompatTextView appCompatTextView, @NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull StaticSearchBarView staticSearchBarView, @NonNull SearchShimmer searchShimmer) {
        this.rootView = constraintLayout;
        this.backButton = imageButton;
        this.cancelButton = appCompatTextView;
        this.cancelButtonContainer = frameLayout;
        this.composerContainer = fragmentContainerView;
        this.host = constraintLayout2;
        this.navBar = constraintLayout3;
        this.navBarLeftActions = imageView;
        this.navBarRightActions = imageView2;
        this.searchBarView = staticSearchBarView;
        this.shimmer = searchShimmer;
    }

    @NonNull
    public static FragmentSearchSuggestionsBinding bind(@NonNull View view) {
        int i11 = R$id.backButton;
        ImageButton imageButton = (ImageButton) C2548q.d(i11, view);
        if (imageButton != null) {
            i11 = R$id.cancelButton;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.cancelButtonContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.composerContainer;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
                    if (fragmentContainerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.navBar;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout2 != null) {
                            i11 = R$id.navBarLeftActions;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.navBarRightActions;
                                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                if (imageView2 != null) {
                                    i11 = R$id.searchBarView;
                                    StaticSearchBarView staticSearchBarView = (StaticSearchBarView) C2548q.d(i11, view);
                                    if (staticSearchBarView != null) {
                                        i11 = R$id.shimmer;
                                        SearchShimmer searchShimmer = (SearchShimmer) C2548q.d(i11, view);
                                        if (searchShimmer != null) {
                                            return new FragmentSearchSuggestionsBinding(constraintLayout, imageButton, appCompatTextView, frameLayout, fragmentContainerView, constraintLayout, constraintLayout2, imageView, imageView2, staticSearchBarView, searchShimmer);
                                        }
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
    public static FragmentSearchSuggestionsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_search_suggestions, viewGroup, false);
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

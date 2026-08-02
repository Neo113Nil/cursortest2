package ru.ozon.app.android.search.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.search.R$layout;

/* loaded from: classes13.dex */
public final class FragmentSearchByImageOnboardingBinding implements a {

    @NonNull
    public final FragmentContainerView composerContainer;

    @NonNull
    private final FragmentContainerView rootView;

    private FragmentSearchByImageOnboardingBinding(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.composerContainer = fragmentContainerView2;
    }

    @NonNull
    public static FragmentSearchByImageOnboardingBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentSearchByImageOnboardingBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static FragmentSearchByImageOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_search_by_image_onboarding, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}

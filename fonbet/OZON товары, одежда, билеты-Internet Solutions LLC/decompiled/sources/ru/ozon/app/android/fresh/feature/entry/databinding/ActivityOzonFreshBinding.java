package ru.ozon.app.android.fresh.feature.entry.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.fresh.feature.entry.R$layout;

/* loaded from: classes12.dex */
public final class ActivityOzonFreshBinding implements a {

    @NonNull
    public final FragmentContainerView rootNavigationContainer;

    @NonNull
    private final FragmentContainerView rootView;

    private ActivityOzonFreshBinding(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.rootNavigationContainer = fragmentContainerView2;
    }

    @NonNull
    public static ActivityOzonFreshBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new ActivityOzonFreshBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static ActivityOzonFreshBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOzonFreshBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_ozon_fresh, viewGroup, false);
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

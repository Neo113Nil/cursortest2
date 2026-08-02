package ru.ozon.app.android.travel.feature.entry.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.travel.feature.entry.R$layout;

/* loaded from: classes3.dex */
public final class ActivityOzonTravelBinding implements a {

    @NonNull
    public final FragmentContainerView rootNavigationContainer;

    @NonNull
    private final FragmentContainerView rootView;

    private ActivityOzonTravelBinding(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.rootNavigationContainer = fragmentContainerView2;
    }

    @NonNull
    public static ActivityOzonTravelBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new ActivityOzonTravelBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static ActivityOzonTravelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOzonTravelBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_ozon_travel, viewGroup, false);
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

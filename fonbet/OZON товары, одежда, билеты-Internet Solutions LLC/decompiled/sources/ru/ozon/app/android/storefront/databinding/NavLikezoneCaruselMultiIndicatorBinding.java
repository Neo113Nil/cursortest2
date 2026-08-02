package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes2.dex */
public final class NavLikezoneCaruselMultiIndicatorBinding implements a {

    @NonNull
    public final ScrollingPagerIndicator indicator;

    @NonNull
    public final FrameLayout indicatorRoot;

    @NonNull
    private final FrameLayout rootView;

    private NavLikezoneCaruselMultiIndicatorBinding(@NonNull FrameLayout frameLayout, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.indicator = scrollingPagerIndicator;
        this.indicatorRoot = frameLayout2;
    }

    @NonNull
    public static NavLikezoneCaruselMultiIndicatorBinding bind(@NonNull View view) {
        int i11 = R$id.indicator;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
        if (scrollingPagerIndicator == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new NavLikezoneCaruselMultiIndicatorBinding(frameLayout, scrollingPagerIndicator, frameLayout);
    }

    @NonNull
    public static NavLikezoneCaruselMultiIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.nav_likezone_carusel_multi_indicator, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

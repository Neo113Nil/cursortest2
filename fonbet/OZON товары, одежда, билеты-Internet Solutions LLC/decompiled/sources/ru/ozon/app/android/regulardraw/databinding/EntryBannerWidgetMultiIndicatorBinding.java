package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes13.dex */
public final class EntryBannerWidgetMultiIndicatorBinding implements a {

    @NonNull
    public final ScrollingPagerIndicator entryBannerWidgetMultiIndicator;

    @NonNull
    public final FrameLayout entryBannerWidgetMultiIndicatorRoot;

    @NonNull
    private final FrameLayout rootView;

    private EntryBannerWidgetMultiIndicatorBinding(@NonNull FrameLayout frameLayout, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.entryBannerWidgetMultiIndicator = scrollingPagerIndicator;
        this.entryBannerWidgetMultiIndicatorRoot = frameLayout2;
    }

    @NonNull
    public static EntryBannerWidgetMultiIndicatorBinding bind(@NonNull View view) {
        int i11 = R$id.entryBannerWidget_Multi_Indicator;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
        if (scrollingPagerIndicator == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new EntryBannerWidgetMultiIndicatorBinding(frameLayout, scrollingPagerIndicator, frameLayout);
    }

    @NonNull
    public static EntryBannerWidgetMultiIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.entry_banner_widget_multi_indicator, viewGroup, false);
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

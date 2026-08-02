package ru.ozon.app.android.storefront.ui.navslider.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.ui.navslider.R$id;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes2.dex */
public final class WidgetNavigationSliderLayoutBinding implements a {

    @NonNull
    public final LinearLayout containerLl;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    public final ScrollingPagerIndicator pagerIndicator;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetNavigationSliderLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.containerLl = linearLayout2;
        this.itemsRv = recyclerView;
        this.pagerIndicator = scrollingPagerIndicator;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetNavigationSliderLayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.pagerIndicator;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
            if (scrollingPagerIndicator != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetNavigationSliderLayoutBinding(linearLayout, linearLayout, recyclerView, scrollingPagerIndicator, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

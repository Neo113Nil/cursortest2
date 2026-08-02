package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.checkout.R$id;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes11.dex */
public final class WidgetPremiumBannerDetailsBinding implements a {

    @NonNull
    public final ImageView backgroundIv;

    @NonNull
    public final ScrollingPagerIndicator dotsPiv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView tariffsRv;

    private WidgetPremiumBannerDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.backgroundIv = imageView;
        this.dotsPiv = scrollingPagerIndicator;
        this.tariffsRv = recyclerView;
    }

    @NonNull
    public static WidgetPremiumBannerDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.backgroundIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.dotsPiv;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
            if (scrollingPagerIndicator != null) {
                i11 = R$id.tariffsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new WidgetPremiumBannerDetailsBinding((ConstraintLayout) view, imageView, scrollingPagerIndicator, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

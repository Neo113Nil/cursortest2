package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;

/* loaded from: classes13.dex */
public final class ItemMainDrawMajorScreenTaskBinding implements a {

    @NonNull
    public final AppCompatImageView bottomImage;

    @NonNull
    public final MorkovskCurrencyBadge currencyBadge;

    @NonNull
    public final IndicatorView indicator;

    @NonNull
    public final AppCompatImageView mainImage;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemMainDrawMajorScreenTaskBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull MorkovskCurrencyBadge morkovskCurrencyBadge, @NonNull IndicatorView indicatorView, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.bottomImage = appCompatImageView;
        this.currencyBadge = morkovskCurrencyBadge;
        this.indicator = indicatorView;
        this.mainImage = appCompatImageView2;
    }

    @NonNull
    public static ItemMainDrawMajorScreenTaskBinding bind(@NonNull View view) {
        int i11 = R$id.bottomImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.currencyBadge;
            MorkovskCurrencyBadge morkovskCurrencyBadge = (MorkovskCurrencyBadge) C2548q.d(i11, view);
            if (morkovskCurrencyBadge != null) {
                i11 = R$id.indicator;
                IndicatorView indicatorView = (IndicatorView) C2548q.d(i11, view);
                if (indicatorView != null) {
                    i11 = R$id.mainImage;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView2 != null) {
                        return new ItemMainDrawMajorScreenTaskBinding((ConstraintLayout) view, appCompatImageView, morkovskCurrencyBadge, indicatorView, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

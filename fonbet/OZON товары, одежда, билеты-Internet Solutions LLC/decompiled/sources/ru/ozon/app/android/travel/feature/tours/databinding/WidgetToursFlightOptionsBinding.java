package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetToursFlightOptionsBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ShapeableImageView toursFlightAgencyLogoImageView;

    @NonNull
    public final LinearLayout toursFlightAirlineLogosLayout;

    @NonNull
    public final RecyclerView toursFlightBadgeRecyclerView;

    @NonNull
    public final TextAtomView toursFlightPriceDescriptionView;

    @NonNull
    public final TextAtomView toursFlightPriceMarketingView;

    @NonNull
    public final View toursFlightPriceSeparatorV;

    @NonNull
    public final PriceView toursFlightPriceView;

    @NonNull
    public final Barrier toursFlightTimeBarrier;

    @NonNull
    public final BadgeView toursFlightWarningBadgeView;

    @NonNull
    public final AppCompatTextView toursFlightWayBackCounterView;

    @NonNull
    public final TextAtomView toursFlightWayBackDurationView;

    @NonNull
    public final TextAtomView toursFlightWayBackRouteView;

    @NonNull
    public final TextAtomView toursFlightWayBackTimeView;

    @NonNull
    public final AppCompatTextView toursFlightWayThereCounterView;

    @NonNull
    public final TextAtomView toursFlightWayThereDurationView;

    @NonNull
    public final TextAtomView toursFlightWayThereRouteView;

    @NonNull
    public final TextAtomView toursFlightWayThereTimeView;

    private WidgetToursFlightOptionsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull View view, @NonNull PriceView priceView, @NonNull Barrier barrier, @NonNull BadgeView badgeView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextAtomView textAtomView6, @NonNull TextAtomView textAtomView7, @NonNull TextAtomView textAtomView8) {
        this.rootView = constraintLayout;
        this.toursFlightAgencyLogoImageView = shapeableImageView;
        this.toursFlightAirlineLogosLayout = linearLayout;
        this.toursFlightBadgeRecyclerView = recyclerView;
        this.toursFlightPriceDescriptionView = textAtomView;
        this.toursFlightPriceMarketingView = textAtomView2;
        this.toursFlightPriceSeparatorV = view;
        this.toursFlightPriceView = priceView;
        this.toursFlightTimeBarrier = barrier;
        this.toursFlightWarningBadgeView = badgeView;
        this.toursFlightWayBackCounterView = appCompatTextView;
        this.toursFlightWayBackDurationView = textAtomView3;
        this.toursFlightWayBackRouteView = textAtomView4;
        this.toursFlightWayBackTimeView = textAtomView5;
        this.toursFlightWayThereCounterView = appCompatTextView2;
        this.toursFlightWayThereDurationView = textAtomView6;
        this.toursFlightWayThereRouteView = textAtomView7;
        this.toursFlightWayThereTimeView = textAtomView8;
    }

    @NonNull
    public static WidgetToursFlightOptionsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.toursFlightAgencyLogoImageView;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.toursFlightAirlineLogosLayout;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.toursFlightBadgeRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.toursFlightPriceDescriptionView;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.toursFlightPriceMarketingView;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.toursFlightPriceSeparatorV), view)) != null) {
                            i11 = R$id.toursFlightPriceView;
                            PriceView priceView = (PriceView) C2548q.d(i11, view);
                            if (priceView != null) {
                                i11 = R$id.toursFlightTimeBarrier;
                                Barrier barrier = (Barrier) C2548q.d(i11, view);
                                if (barrier != null) {
                                    i11 = R$id.toursFlightWarningBadgeView;
                                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                    if (badgeView != null) {
                                        i11 = R$id.toursFlightWayBackCounterView;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                        if (appCompatTextView != null) {
                                            i11 = R$id.toursFlightWayBackDurationView;
                                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView3 != null) {
                                                i11 = R$id.toursFlightWayBackRouteView;
                                                TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView4 != null) {
                                                    i11 = R$id.toursFlightWayBackTimeView;
                                                    TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                                    if (textAtomView5 != null) {
                                                        i11 = R$id.toursFlightWayThereCounterView;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                                        if (appCompatTextView2 != null) {
                                                            i11 = R$id.toursFlightWayThereDurationView;
                                                            TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                                            if (textAtomView6 != null) {
                                                                i11 = R$id.toursFlightWayThereRouteView;
                                                                TextAtomView textAtomView7 = (TextAtomView) C2548q.d(i11, view);
                                                                if (textAtomView7 != null) {
                                                                    i11 = R$id.toursFlightWayThereTimeView;
                                                                    TextAtomView textAtomView8 = (TextAtomView) C2548q.d(i11, view);
                                                                    if (textAtomView8 != null) {
                                                                        return new WidgetToursFlightOptionsBinding((ConstraintLayout) view, shapeableImageView, linearLayout, recyclerView, textAtomView, textAtomView2, d11, priceView, barrier, badgeView, appCompatTextView, textAtomView3, textAtomView4, textAtomView5, appCompatTextView2, textAtomView6, textAtomView7, textAtomView8);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

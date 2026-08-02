package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewFlightCheckTariffBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final BadgeView tariffPremiumBadgeBV;

    @NonNull
    public final BadgeView tariffV2BadgeView;

    @NonNull
    public final AppCompatCheckBox tariffV2CheckBox;

    @NonNull
    public final RecyclerView tariffV2DirectionRecyclerView;

    @NonNull
    public final TextAtomView tariffV2DiscountTextView;

    @NonNull
    public final Barrier tariffV2PriceBarrier;

    @NonNull
    public final TextAtomView tariffV2PriceLabelTextView;

    @NonNull
    public final PriceView tariffV2PriceView;

    @NonNull
    public final View tariffV2Separator;

    @NonNull
    public final TextAtomView tariffV2TitleTextView;

    private ViewFlightCheckTariffBinding(@NonNull View view, @NonNull BadgeView badgeView, @NonNull BadgeView badgeView2, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2, @NonNull PriceView priceView, @NonNull View view2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.tariffPremiumBadgeBV = badgeView;
        this.tariffV2BadgeView = badgeView2;
        this.tariffV2CheckBox = appCompatCheckBox;
        this.tariffV2DirectionRecyclerView = recyclerView;
        this.tariffV2DiscountTextView = textAtomView;
        this.tariffV2PriceBarrier = barrier;
        this.tariffV2PriceLabelTextView = textAtomView2;
        this.tariffV2PriceView = priceView;
        this.tariffV2Separator = view2;
        this.tariffV2TitleTextView = textAtomView3;
    }

    @NonNull
    public static ViewFlightCheckTariffBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.tariffPremiumBadgeBV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.tariffV2BadgeView;
            BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
            if (badgeView2 != null) {
                i11 = R$id.tariffV2CheckBox;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C2548q.d(i11, view);
                if (appCompatCheckBox != null) {
                    i11 = R$id.tariffV2DirectionRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.tariffV2DiscountTextView;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.tariffV2PriceBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                i11 = R$id.tariffV2PriceLabelTextView;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    i11 = R$id.tariffV2PriceView;
                                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                                    if (priceView != null && (d11 = C2548q.d((i11 = R$id.tariffV2Separator), view)) != null) {
                                        i11 = R$id.tariffV2TitleTextView;
                                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView3 != null) {
                                            return new ViewFlightCheckTariffBinding(view, badgeView, badgeView2, appCompatCheckBox, recyclerView, textAtomView, barrier, textAtomView2, priceView, d11, textAtomView3);
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
    public static ViewFlightCheckTariffBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_flight_check_tariff, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

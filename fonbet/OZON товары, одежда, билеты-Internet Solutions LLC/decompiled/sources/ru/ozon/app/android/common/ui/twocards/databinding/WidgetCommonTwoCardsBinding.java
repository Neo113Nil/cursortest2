package ru.ozon.app.android.common.ui.twocards.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.common.ui.twocards.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithPointsView;

/* loaded from: classes11.dex */
public final class WidgetCommonTwoCardsBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final LinearLayoutCompat containerCard;

    @NonNull
    public final PriceWithPointsView priceWithPoints;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final TextView tvTitle;

    private WidgetCommonTwoCardsBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BadgeView badgeView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull PriceWithPointsView priceWithPointsView, @NonNull TextView textView) {
        this.rootView = linearLayoutCompat;
        this.badge = badgeView;
        this.containerCard = linearLayoutCompat2;
        this.priceWithPoints = priceWithPointsView;
        this.tvTitle = textView;
    }

    @NonNull
    public static WidgetCommonTwoCardsBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            i11 = R$id.priceWithPoints;
            PriceWithPointsView priceWithPointsView = (PriceWithPointsView) C2548q.d(i11, view);
            if (priceWithPointsView != null) {
                i11 = R$id.tvTitle;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetCommonTwoCardsBinding(linearLayoutCompat, badgeView, linearLayoutCompat, priceWithPointsView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayoutCompat getConstraintLayout() {
        return this.rootView;
    }
}

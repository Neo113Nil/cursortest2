package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.molecules.view.disclaimer.TravelDisclaimerView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetOrderHeaderBinding implements a {

    @NonNull
    public final TravelDisclaimerView orderHeaderDisclaimerTdv;

    @NonNull
    public final BadgeView orderHeaderStatusBv;

    @NonNull
    public final TextAtomView orderHeaderTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetOrderHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TravelDisclaimerView travelDisclaimerView, @NonNull BadgeView badgeView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.orderHeaderDisclaimerTdv = travelDisclaimerView;
        this.orderHeaderStatusBv = badgeView;
        this.orderHeaderTitleTav = textAtomView;
    }

    @NonNull
    public static WidgetOrderHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.orderHeaderDisclaimerTdv;
        TravelDisclaimerView travelDisclaimerView = (TravelDisclaimerView) C2548q.d(i11, view);
        if (travelDisclaimerView != null) {
            i11 = R$id.orderHeaderStatusBv;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.orderHeaderTitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetOrderHeaderBinding((ConstraintLayout) view, travelDisclaimerView, badgeView, textAtomView);
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

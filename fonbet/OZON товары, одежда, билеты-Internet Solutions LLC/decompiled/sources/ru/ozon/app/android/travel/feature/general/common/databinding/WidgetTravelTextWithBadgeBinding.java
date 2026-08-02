package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetTravelTextWithBadgeBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeView travelTextWithBadgeBv;

    @NonNull
    public final ConstraintLayout travelTextWithBadgeRootCl;

    @NonNull
    public final TextAtomView travelTextWithBadgeTAV;

    private WidgetTravelTextWithBadgeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.travelTextWithBadgeBv = badgeView;
        this.travelTextWithBadgeRootCl = constraintLayout2;
        this.travelTextWithBadgeTAV = textAtomView;
    }

    @NonNull
    public static WidgetTravelTextWithBadgeBinding bind(@NonNull View view) {
        int i11 = R$id.travelTextWithBadgeBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.travelTextWithBadgeTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i12, view);
            if (textAtomView != null) {
                return new WidgetTravelTextWithBadgeBinding(constraintLayout, badgeView, constraintLayout, textAtomView);
            }
            i11 = i12;
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

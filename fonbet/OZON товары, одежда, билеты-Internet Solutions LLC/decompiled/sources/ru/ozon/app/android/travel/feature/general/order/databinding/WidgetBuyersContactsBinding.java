package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetBuyersContactsBinding implements a {

    @NonNull
    public final InfoBadgeView buyersContactsBadgeIBV;

    @NonNull
    public final TextAtomView buyersContactsHeaderTV;

    @NonNull
    public final VerticalAtomsLayout buyersContactsTextAtomsVAL;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetBuyersContactsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull InfoBadgeView infoBadgeView, @NonNull TextAtomView textAtomView, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = constraintLayout;
        this.buyersContactsBadgeIBV = infoBadgeView;
        this.buyersContactsHeaderTV = textAtomView;
        this.buyersContactsTextAtomsVAL = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetBuyersContactsBinding bind(@NonNull View view) {
        int i11 = R$id.buyersContactsBadgeIBV;
        InfoBadgeView infoBadgeView = (InfoBadgeView) C2548q.d(i11, view);
        if (infoBadgeView != null) {
            i11 = R$id.buyersContactsHeaderTV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.buyersContactsTextAtomsVAL;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    return new WidgetBuyersContactsBinding((ConstraintLayout) view, infoBadgeView, textAtomView, verticalAtomsLayout);
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

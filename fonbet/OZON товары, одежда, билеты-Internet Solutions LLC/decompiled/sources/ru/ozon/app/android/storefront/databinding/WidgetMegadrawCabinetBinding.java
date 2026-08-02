package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.CountBlockView;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.PrizeBlockView;

/* loaded from: classes2.dex */
public final class WidgetMegadrawCabinetBinding implements a {

    @NonNull
    public final View clickV;

    @NonNull
    public final CountBlockView countBlock;

    @NonNull
    public final PrizeBlockView prizeBlock;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetMegadrawCabinetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull CountBlockView countBlockView, @NonNull PrizeBlockView prizeBlockView) {
        this.rootView = constraintLayout;
        this.clickV = view;
        this.countBlock = countBlockView;
        this.prizeBlock = prizeBlockView;
    }

    @NonNull
    public static WidgetMegadrawCabinetBinding bind(@NonNull View view) {
        int i11 = R$id.clickV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.countBlock;
            CountBlockView countBlockView = (CountBlockView) C2548q.d(i11, view);
            if (countBlockView != null) {
                i11 = R$id.prizeBlock;
                PrizeBlockView prizeBlockView = (PrizeBlockView) C2548q.d(i11, view);
                if (prizeBlockView != null) {
                    return new WidgetMegadrawCabinetBinding((ConstraintLayout) view, d11, countBlockView, prizeBlockView);
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

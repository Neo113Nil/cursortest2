package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetPriceCalendarFooterBinding implements a {

    @NonNull
    public final LargeButtonView priceCalendarFooterConfirmLBV;

    @NonNull
    public final TextAtomView priceCalendarFooterInformerTAV;

    @NonNull
    public final SmallIconButtonView priceCalendarFooterResetSIBV;

    @NonNull
    public final VerticalRecyclerContainer priceCalendarFooterTogglesVRC;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetPriceCalendarFooterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull VerticalRecyclerContainer verticalRecyclerContainer) {
        this.rootView = constraintLayout;
        this.priceCalendarFooterConfirmLBV = largeButtonView;
        this.priceCalendarFooterInformerTAV = textAtomView;
        this.priceCalendarFooterResetSIBV = smallIconButtonView;
        this.priceCalendarFooterTogglesVRC = verticalRecyclerContainer;
    }

    @NonNull
    public static WidgetPriceCalendarFooterBinding bind(@NonNull View view) {
        int i11 = R$id.priceCalendarFooterConfirmLBV;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.priceCalendarFooterInformerTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.priceCalendarFooterResetSIBV;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null) {
                    i11 = R$id.priceCalendarFooterTogglesVRC;
                    VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
                    if (verticalRecyclerContainer != null) {
                        return new WidgetPriceCalendarFooterBinding((ConstraintLayout) view, largeButtonView, textAtomView, smallIconButtonView, verticalRecyclerContainer);
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

package ru.ozon.app.android.orderdone.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes13.dex */
public final class WidgetOrderDoneTotalElementBinding implements a {

    @NonNull
    public final PriceAtomView atomPriceV2;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final Barrier barrierBottom;

    @NonNull
    public final ButtonView btn;

    @NonNull
    public final Guideline guidelineEnd;

    @NonNull
    public final Guideline guidelineStart;

    @NonNull
    public final Guideline guidelineTop;

    @NonNull
    public final IconView iconView;

    @NonNull
    public final ConstraintLayout orderDoneTotalCl;

    @NonNull
    public final TextAtomV2View priceTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    @NonNull
    public final Space spacerBottom;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    @NonNull
    public final View viewBg;

    private WidgetOrderDoneTotalElementBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PriceAtomView priceAtomView, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull ButtonView buttonView, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull Guideline guideline3, @NonNull IconView iconView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull Space space, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull View view2) {
        this.rootView = constraintLayout;
        this.atomPriceV2 = priceAtomView;
        this.barrier = barrier;
        this.barrierBottom = barrier2;
        this.btn = buttonView;
        this.guidelineEnd = guideline;
        this.guidelineStart = guideline2;
        this.guidelineTop = guideline3;
        this.iconView = iconView;
        this.orderDoneTotalCl = constraintLayout2;
        this.priceTav = textAtomV2View;
        this.separatorV = view;
        this.spacerBottom = space;
        this.subtitleTav = textAtomV2View2;
        this.titleTav = textAtomV2View3;
        this.viewBg = view2;
    }

    @NonNull
    public static WidgetOrderDoneTotalElementBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.atomPriceV2;
        PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
        if (priceAtomView != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.barrierBottom;
                Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                if (barrier2 != null) {
                    i11 = R$id.btn;
                    ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                    if (buttonView != null) {
                        i11 = R$id.guidelineEnd;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            i11 = R$id.guidelineStart;
                            Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                            if (guideline2 != null) {
                                i11 = R$id.guidelineTop;
                                Guideline guideline3 = (Guideline) C2548q.d(i11, view);
                                if (guideline3 != null) {
                                    i11 = R$id.iconView;
                                    IconView iconView = (IconView) C2548q.d(i11, view);
                                    if (iconView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i11 = R$id.priceTav;
                                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                                            i11 = R$id.spacerBottom;
                                            Space space = (Space) C2548q.d(i11, view);
                                            if (space != null) {
                                                i11 = R$id.subtitleTav;
                                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View2 != null) {
                                                    i11 = R$id.titleTav;
                                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                                    if (textAtomV2View3 != null && (d12 = C2548q.d((i11 = R$id.viewBg), view)) != null) {
                                                        return new WidgetOrderDoneTotalElementBinding(constraintLayout, priceAtomView, barrier, barrier2, buttonView, guideline, guideline2, guideline3, iconView, constraintLayout, textAtomV2View, d11, space, textAtomV2View2, textAtomV2View3, d12);
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

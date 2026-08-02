package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class ReturnItemViewBinding implements a {

    @NonNull
    public final BadgeView badgeBv;

    @NonNull
    public final IconView blurIconView;

    @NonNull
    public final View checkBoxClickArea;

    @NonNull
    public final CheckBoxView checkbox;

    @NonNull
    public final Barrier imageBarrier;

    @NonNull
    public final TextAtomV2View nameTv;

    @NonNull
    public final PriceAtomView priceView;

    @NonNull
    public final IconView privateIconView;

    @NonNull
    public final IconView productIconView;

    @NonNull
    public final IconButtonV3View quantityDecrease;

    @NonNull
    public final IconButtonV3View quantityIncrease;

    @NonNull
    public final TextAtomV2View quantityText;

    @NonNull
    public final ConstraintLayout returnCreationProductCl;

    @NonNull
    private final ConstraintLayout rootView;

    private ReturnItemViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull IconView iconView, @NonNull View view, @NonNull CheckBoxView checkBoxView, @NonNull Barrier barrier, @NonNull TextAtomV2View textAtomV2View, @NonNull PriceAtomView priceAtomView, @NonNull IconView iconView2, @NonNull IconView iconView3, @NonNull IconButtonV3View iconButtonV3View, @NonNull IconButtonV3View iconButtonV3View2, @NonNull TextAtomV2View textAtomV2View2, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.badgeBv = badgeView;
        this.blurIconView = iconView;
        this.checkBoxClickArea = view;
        this.checkbox = checkBoxView;
        this.imageBarrier = barrier;
        this.nameTv = textAtomV2View;
        this.priceView = priceAtomView;
        this.privateIconView = iconView2;
        this.productIconView = iconView3;
        this.quantityDecrease = iconButtonV3View;
        this.quantityIncrease = iconButtonV3View2;
        this.quantityText = textAtomV2View2;
        this.returnCreationProductCl = constraintLayout2;
    }

    @NonNull
    public static ReturnItemViewBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.blurIconView;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null && (d11 = C2548q.d((i11 = R$id.checkBoxClickArea), view)) != null) {
                i11 = R$id.checkbox;
                CheckBoxView checkBoxView = (CheckBoxView) C2548q.d(i11, view);
                if (checkBoxView != null) {
                    i11 = R$id.imageBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        i11 = R$id.nameTv;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.priceView;
                            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                            if (priceAtomView != null) {
                                i11 = R$id.privateIconView;
                                IconView iconView2 = (IconView) C2548q.d(i11, view);
                                if (iconView2 != null) {
                                    i11 = R$id.productIconView;
                                    IconView iconView3 = (IconView) C2548q.d(i11, view);
                                    if (iconView3 != null) {
                                        i11 = R$id.quantityDecrease;
                                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                        if (iconButtonV3View != null) {
                                            i11 = R$id.quantityIncrease;
                                            IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                                            if (iconButtonV3View2 != null) {
                                                i11 = R$id.quantityText;
                                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View2 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                    return new ReturnItemViewBinding(constraintLayout, badgeView, iconView, d11, checkBoxView, barrier, textAtomV2View, priceAtomView, iconView2, iconView3, iconButtonV3View, iconButtonV3View2, textAtomV2View2, constraintLayout);
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

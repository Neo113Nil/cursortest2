package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelectorView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes13.dex */
public final class ReturnCreationItemBinding implements a {

    @NonNull
    public final BadgeView badgeBv;

    @NonNull
    public final ButtonV3View buttonView;

    @NonNull
    public final CheckBoxView checkbox;

    @NonNull
    public final IconButtonView crossIconButton;

    @NonNull
    public final TextAtomV2View descriptionTv;

    @NonNull
    public final TextAtomV2View dueDateTv;

    @NonNull
    public final Barrier imageBarrier;

    @NonNull
    public final View imageDisablingOverlay;

    @NonNull
    public final ItemImageBinding itemImage;

    @NonNull
    public final TextAtomV2View nameTv;

    @NonNull
    public final Flow priceAndSealBadgeFlow;

    @NonNull
    public final PriceAtomView priceView;

    @NonNull
    public final RmsQuantitySelectorView quantitySelector;

    @NonNull
    public final ConstraintLayout returnCreationProductCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeView sealBadgeView;

    private ReturnCreationItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ButtonV3View buttonV3View, @NonNull CheckBoxView checkBoxView, @NonNull IconButtonView iconButtonView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull Barrier barrier, @NonNull View view, @NonNull ItemImageBinding itemImageBinding, @NonNull TextAtomV2View textAtomV2View3, @NonNull Flow flow, @NonNull PriceAtomView priceAtomView, @NonNull RmsQuantitySelectorView rmsQuantitySelectorView, @NonNull ConstraintLayout constraintLayout2, @NonNull BadgeView badgeView2) {
        this.rootView = constraintLayout;
        this.badgeBv = badgeView;
        this.buttonView = buttonV3View;
        this.checkbox = checkBoxView;
        this.crossIconButton = iconButtonView;
        this.descriptionTv = textAtomV2View;
        this.dueDateTv = textAtomV2View2;
        this.imageBarrier = barrier;
        this.imageDisablingOverlay = view;
        this.itemImage = itemImageBinding;
        this.nameTv = textAtomV2View3;
        this.priceAndSealBadgeFlow = flow;
        this.priceView = priceAtomView;
        this.quantitySelector = rmsQuantitySelectorView;
        this.returnCreationProductCl = constraintLayout2;
        this.sealBadgeView = badgeView2;
    }

    @NonNull
    public static ReturnCreationItemBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.badgeBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.buttonView;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.checkbox;
                CheckBoxView checkBoxView = (CheckBoxView) C2548q.d(i11, view);
                if (checkBoxView != null) {
                    i11 = R$id.crossIconButton;
                    IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
                    if (iconButtonView != null) {
                        i11 = R$id.descriptionTv;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.dueDateTv;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                i11 = R$id.imageBarrier;
                                Barrier barrier = (Barrier) C2548q.d(i11, view);
                                if (barrier != null && (d11 = C2548q.d((i11 = R$id.imageDisablingOverlay), view)) != null && (d12 = C2548q.d((i11 = R$id.itemImage), view)) != null) {
                                    ItemImageBinding bind = ItemImageBinding.bind(d12);
                                    i11 = R$id.nameTv;
                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View3 != null) {
                                        i11 = R$id.priceAndSealBadgeFlow;
                                        Flow flow = (Flow) C2548q.d(i11, view);
                                        if (flow != null) {
                                            i11 = R$id.priceView;
                                            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                                            if (priceAtomView != null) {
                                                i11 = R$id.quantitySelector;
                                                RmsQuantitySelectorView rmsQuantitySelectorView = (RmsQuantitySelectorView) C2548q.d(i11, view);
                                                if (rmsQuantitySelectorView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                    i11 = R$id.sealBadgeView;
                                                    BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
                                                    if (badgeView2 != null) {
                                                        return new ReturnCreationItemBinding(constraintLayout, badgeView, buttonV3View, checkBoxView, iconButtonView, textAtomV2View, textAtomV2View2, barrier, d11, bind, textAtomV2View3, flow, priceAtomView, rmsQuantitySelectorView, constraintLayout, badgeView2);
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

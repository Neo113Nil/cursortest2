package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelectorView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes13.dex */
public final class ReturnCreationReasonsItemBinding implements a {

    @NonNull
    public final ItemImageBinding csmaImage;

    @NonNull
    public final IconButtonV3View deleteButtonIb;

    @NonNull
    public final TextAtomV2View descriptionTav;

    @NonNull
    public final DisclaimerContainer disclaimerContainer;

    @NonNull
    public final Barrier imageBarrier;

    @NonNull
    public final IconView imageIv;

    @NonNull
    public final TextAtomV2View nameTav;

    @NonNull
    public final PriceAtomView pricePv;

    @NonNull
    public final RmsQuantitySelectorView quantitySelector;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View validationTav;

    private ReturnCreationReasonsItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ItemImageBinding itemImageBinding, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull DisclaimerContainer disclaimerContainer, @NonNull Barrier barrier, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View2, @NonNull PriceAtomView priceAtomView, @NonNull RmsQuantitySelectorView rmsQuantitySelectorView, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.csmaImage = itemImageBinding;
        this.deleteButtonIb = iconButtonV3View;
        this.descriptionTav = textAtomV2View;
        this.disclaimerContainer = disclaimerContainer;
        this.imageBarrier = barrier;
        this.imageIv = iconView;
        this.nameTav = textAtomV2View2;
        this.pricePv = priceAtomView;
        this.quantitySelector = rmsQuantitySelectorView;
        this.validationTav = textAtomV2View3;
    }

    @NonNull
    public static ReturnCreationReasonsItemBinding bind(@NonNull View view) {
        int i11 = R$id.csmaImage;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            ItemImageBinding bind = ItemImageBinding.bind(d11);
            i11 = R$id.deleteButtonIb;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.descriptionTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.disclaimerContainer;
                    DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
                    if (disclaimerContainer != null) {
                        i11 = R$id.imageBarrier;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.imageIv;
                            IconView iconView = (IconView) C2548q.d(i11, view);
                            if (iconView != null) {
                                i11 = R$id.nameTav;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R$id.pricePv;
                                    PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                                    if (priceAtomView != null) {
                                        i11 = R$id.quantitySelector;
                                        RmsQuantitySelectorView rmsQuantitySelectorView = (RmsQuantitySelectorView) C2548q.d(i11, view);
                                        if (rmsQuantitySelectorView != null) {
                                            i11 = R$id.validationTav;
                                            TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View3 != null) {
                                                return new ReturnCreationReasonsItemBinding((ConstraintLayout) view, bind, iconButtonV3View, textAtomV2View, disclaimerContainer, barrier, iconView, textAtomV2View2, priceAtomView, rmsQuantitySelectorView, textAtomV2View3);
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

    @NonNull
    public static ReturnCreationReasonsItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ReturnCreationReasonsItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.return_creation_reasons_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes12.dex */
public final class MBlockProductShelfBinding implements a {

    @NonNull
    public final Barrier buttonBarrier;

    @NonNull
    public final HorizontalFlexAtomsLayout productBottomBadgesContainer;

    @NonNull
    public final LinearLayout productButtonsContainer;

    @NonNull
    public final ProductMediaView productImage;

    @NonNull
    public final ConstraintLayout productMessageContainer;

    @NonNull
    public final TextAtomV2View productName;

    @NonNull
    public final PriceAtomView productPrice;

    @NonNull
    public final LinearLayout productPriceBadgesContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TimeStatusView timeStatusView;

    private MBlockProductShelfBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull LinearLayout linearLayout, @NonNull ProductMediaView productMediaView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull PriceAtomView priceAtomView, @NonNull LinearLayout linearLayout2, @NonNull TimeStatusView timeStatusView) {
        this.rootView = constraintLayout;
        this.buttonBarrier = barrier;
        this.productBottomBadgesContainer = horizontalFlexAtomsLayout;
        this.productButtonsContainer = linearLayout;
        this.productImage = productMediaView;
        this.productMessageContainer = constraintLayout2;
        this.productName = textAtomV2View;
        this.productPrice = priceAtomView;
        this.productPriceBadgesContainer = linearLayout2;
        this.timeStatusView = timeStatusView;
    }

    @NonNull
    public static MBlockProductShelfBinding bind(@NonNull View view) {
        int i11 = R$id.buttonBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.productBottomBadgesContainer;
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
            if (horizontalFlexAtomsLayout != null) {
                i11 = R$id.productButtonsContainer;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.productImage;
                    ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
                    if (productMediaView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.productName;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.productPrice;
                            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                            if (priceAtomView != null) {
                                i11 = R$id.productPriceBadgesContainer;
                                LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout2 != null) {
                                    i11 = R$id.timeStatusView;
                                    TimeStatusView timeStatusView = (TimeStatusView) C2548q.d(i11, view);
                                    if (timeStatusView != null) {
                                        return new MBlockProductShelfBinding(constraintLayout, barrier, horizontalFlexAtomsLayout, linearLayout, productMediaView, constraintLayout, textAtomV2View, priceAtomView, linearLayout2, timeStatusView);
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
    public static MBlockProductShelfBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_product_shelf, viewGroup, false);
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

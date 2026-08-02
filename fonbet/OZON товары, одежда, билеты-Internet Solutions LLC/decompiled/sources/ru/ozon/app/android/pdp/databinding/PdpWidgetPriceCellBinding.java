package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCounterBadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpWidgetPriceCellBinding implements a {

    @NonNull
    public final ImageView priceCellDisclosureIv;

    @NonNull
    public final ImageView priceCellIconIv;

    @NonNull
    public final TextAtomV2View priceCellSubtitleTav;

    @NonNull
    public final TextAtomV2View priceCellTitleTav;

    @NonNull
    public final PriceCounterBadgeView priceCounterBadge;

    @NonNull
    public final Barrier priceCounterBadgeLabelsBarrier;

    @NonNull
    public final ConstraintLayout rootContainerCl;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetPriceCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull PriceCounterBadgeView priceCounterBadgeView, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.priceCellDisclosureIv = imageView;
        this.priceCellIconIv = imageView2;
        this.priceCellSubtitleTav = textAtomV2View;
        this.priceCellTitleTav = textAtomV2View2;
        this.priceCounterBadge = priceCounterBadgeView;
        this.priceCounterBadgeLabelsBarrier = barrier;
        this.rootContainerCl = constraintLayout2;
    }

    @NonNull
    public static PdpWidgetPriceCellBinding bind(@NonNull View view) {
        int i11 = R$id.priceCellDisclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.priceCellIconIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.priceCellSubtitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.priceCellTitleTav;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.priceCounterBadge;
                        PriceCounterBadgeView priceCounterBadgeView = (PriceCounterBadgeView) C2548q.d(i11, view);
                        if (priceCounterBadgeView != null) {
                            i11 = R$id.priceCounterBadgeLabelsBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                return new PdpWidgetPriceCellBinding(constraintLayout, imageView, imageView2, textAtomV2View, textAtomV2View2, priceCounterBadgeView, barrier, constraintLayout);
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

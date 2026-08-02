package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.DiscountViewContainerLayout;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconView;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetWannaDiscountV2Binding implements a {

    @NonNull
    public final SmallIconButtonView infoButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View wannaDiscountPriceBg;

    @NonNull
    public final TextAtomView wannaDiscountPriceTv;

    @NonNull
    public final PriceView wannaDiscountPriceView;

    @NonNull
    public final CellWithSubtitle40IconView wannaDiscountSellerCell;

    @NonNull
    public final LargeButtonView wannaDiscountSendButton;

    @NonNull
    public final TextAtomView wannaDiscountSubtitle;

    @NonNull
    public final DiscountViewContainerLayout wannaDiscountTagsLayout;

    @NonNull
    public final TextAtomView wannaDiscountTitle;

    @NonNull
    public final TextFieldCellView wannaDiscountUserPriceInput;

    @NonNull
    public final TextFieldCellView wannaDiscountUserQuantityInput;

    private WidgetWannaDiscountV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull View view, @NonNull TextAtomView textAtomView, @NonNull PriceView priceView, @NonNull CellWithSubtitle40IconView cellWithSubtitle40IconView, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView2, @NonNull DiscountViewContainerLayout discountViewContainerLayout, @NonNull TextAtomView textAtomView3, @NonNull TextFieldCellView textFieldCellView, @NonNull TextFieldCellView textFieldCellView2) {
        this.rootView = constraintLayout;
        this.infoButton = smallIconButtonView;
        this.wannaDiscountPriceBg = view;
        this.wannaDiscountPriceTv = textAtomView;
        this.wannaDiscountPriceView = priceView;
        this.wannaDiscountSellerCell = cellWithSubtitle40IconView;
        this.wannaDiscountSendButton = largeButtonView;
        this.wannaDiscountSubtitle = textAtomView2;
        this.wannaDiscountTagsLayout = discountViewContainerLayout;
        this.wannaDiscountTitle = textAtomView3;
        this.wannaDiscountUserPriceInput = textFieldCellView;
        this.wannaDiscountUserQuantityInput = textFieldCellView2;
    }

    @NonNull
    public static WidgetWannaDiscountV2Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.infoButton;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null && (d11 = C2548q.d((i11 = R$id.wannaDiscountPriceBg), view)) != null) {
            i11 = R$id.wannaDiscountPriceTv;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.wannaDiscountPriceView;
                PriceView priceView = (PriceView) C2548q.d(i11, view);
                if (priceView != null) {
                    i11 = R$id.wannaDiscountSellerCell;
                    CellWithSubtitle40IconView cellWithSubtitle40IconView = (CellWithSubtitle40IconView) C2548q.d(i11, view);
                    if (cellWithSubtitle40IconView != null) {
                        i11 = R$id.wannaDiscountSendButton;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            i11 = R$id.wannaDiscountSubtitle;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                i11 = R$id.wannaDiscountTagsLayout;
                                DiscountViewContainerLayout discountViewContainerLayout = (DiscountViewContainerLayout) C2548q.d(i11, view);
                                if (discountViewContainerLayout != null) {
                                    i11 = R$id.wannaDiscountTitle;
                                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView3 != null) {
                                        i11 = R$id.wannaDiscountUserPriceInput;
                                        TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
                                        if (textFieldCellView != null) {
                                            i11 = R$id.wannaDiscountUserQuantityInput;
                                            TextFieldCellView textFieldCellView2 = (TextFieldCellView) C2548q.d(i11, view);
                                            if (textFieldCellView2 != null) {
                                                return new WidgetWannaDiscountV2Binding((ConstraintLayout) view, smallIconButtonView, d11, textAtomView, priceView, cellWithSubtitle40IconView, largeButtonView, textAtomView2, discountViewContainerLayout, textAtomView3, textFieldCellView, textFieldCellView2);
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

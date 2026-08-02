package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;

/* loaded from: classes13.dex */
public final class PdpWidgetOutOfStockBinding implements a {

    @NonNull
    public final CardView cardCv;

    @NonNull
    public final TextView cartBtn;

    @NonNull
    public final TextAtomV2View deliveryAtom;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final PriceView priceAtom;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextAtomV2View sellerAtom;

    @NonNull
    public final Guideline verticalGuideline;

    private PdpWidgetOutOfStockBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView textView, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull PriceView priceView, @NonNull TextAtomV2View textAtomV2View2, @NonNull Guideline guideline) {
        this.rootView = cardView;
        this.cardCv = cardView2;
        this.cartBtn = textView;
        this.deliveryAtom = textAtomV2View;
        this.imageIv = imageView;
        this.priceAtom = priceView;
        this.sellerAtom = textAtomV2View2;
        this.verticalGuideline = guideline;
    }

    @NonNull
    public static PdpWidgetOutOfStockBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i11 = R$id.cartBtn;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.deliveryAtom;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.imageIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.priceAtom;
                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                    if (priceView != null) {
                        i11 = R$id.sellerAtom;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.verticalGuideline;
                            Guideline guideline = (Guideline) C2548q.d(i11, view);
                            if (guideline != null) {
                                return new PdpWidgetOutOfStockBinding(cardView, cardView, textView, textAtomV2View, imageView, priceView, textAtomV2View2, guideline);
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
    public CardView getRoot() {
        return this.rootView;
    }
}

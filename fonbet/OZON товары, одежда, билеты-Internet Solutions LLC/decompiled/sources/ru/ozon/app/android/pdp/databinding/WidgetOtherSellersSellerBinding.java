package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOtherSellersSellerBinding implements a {

    @NonNull
    public final TextView addToCartTv;

    @NonNull
    public final VerticalAtomsLayout atomsVal;

    @NonNull
    public final ImageView favoriteIb;

    @NonNull
    public final ImageView legalInfoIv;

    @NonNull
    public final CardView otherSellerCv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout sellerCl;

    @NonNull
    public final BadgeView sellerLa;

    @NonNull
    public final TextAtomV2View sellerNameTa;

    @NonNull
    public final PriceView sellerPricePa;

    @NonNull
    public final TextView sellerRatingTv;

    @NonNull
    public final VectorRatingBar sellerRb;

    @NonNull
    public final View separator;

    private WidgetOtherSellersSellerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View, @NonNull PriceView priceView, @NonNull TextView textView2, @NonNull VectorRatingBar vectorRatingBar, @NonNull View view) {
        this.rootView = constraintLayout;
        this.addToCartTv = textView;
        this.atomsVal = verticalAtomsLayout;
        this.favoriteIb = imageView;
        this.legalInfoIv = imageView2;
        this.otherSellerCv = cardView;
        this.sellerCl = constraintLayout2;
        this.sellerLa = badgeView;
        this.sellerNameTa = textAtomV2View;
        this.sellerPricePa = priceView;
        this.sellerRatingTv = textView2;
        this.sellerRb = vectorRatingBar;
        this.separator = view;
    }

    @NonNull
    public static WidgetOtherSellersSellerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.addToCartTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.atomsVal;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.favoriteIb;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.legalInfoIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.otherSellerCv;
                        CardView cardView = (CardView) C2548q.d(i11, view);
                        if (cardView != null) {
                            i11 = R$id.sellerCl;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                            if (constraintLayout != null) {
                                i11 = R$id.sellerLa;
                                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                if (badgeView != null) {
                                    i11 = R$id.sellerNameTa;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        i11 = R$id.sellerPricePa;
                                        PriceView priceView = (PriceView) C2548q.d(i11, view);
                                        if (priceView != null) {
                                            i11 = R$id.sellerRatingTv;
                                            TextView textView2 = (TextView) C2548q.d(i11, view);
                                            if (textView2 != null) {
                                                i11 = R$id.sellerRb;
                                                VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
                                                if (vectorRatingBar != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                                                    return new WidgetOtherSellersSellerBinding((ConstraintLayout) view, textView, verticalAtomsLayout, imageView, imageView2, cardView, constraintLayout, badgeView, textAtomV2View, priceView, textView2, vectorRatingBar, d11);
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

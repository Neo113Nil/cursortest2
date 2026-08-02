package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.ui.atoms.cartPrice.PriceFlexboxView;

/* loaded from: classes12.dex */
public final class CartPriceExpressAtomBinding implements a {

    @NonNull
    public final TextView countLabelTv;

    @NonNull
    public final Group counterPriceGroup;

    @NonNull
    public final ImageView minusButtonIv;

    @NonNull
    public final ImageView plusButtonIv;

    @NonNull
    public final TextView pricePerUnitTv;

    @NonNull
    public final PriceFlexboxView pricesFlexbox;

    @NonNull
    private final View rootView;

    @NonNull
    public final Group toCartBtnAndPriceGroup;

    @NonNull
    public final ImageView toCartBtnView;

    private CartPriceExpressAtomBinding(@NonNull View view, @NonNull TextView textView, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull PriceFlexboxView priceFlexboxView, @NonNull Group group2, @NonNull ImageView imageView3) {
        this.rootView = view;
        this.countLabelTv = textView;
        this.counterPriceGroup = group;
        this.minusButtonIv = imageView;
        this.plusButtonIv = imageView2;
        this.pricePerUnitTv = textView2;
        this.pricesFlexbox = priceFlexboxView;
        this.toCartBtnAndPriceGroup = group2;
        this.toCartBtnView = imageView3;
    }

    @NonNull
    public static CartPriceExpressAtomBinding bind(@NonNull View view) {
        int i11 = R$id.countLabelTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.counterPriceGroup;
            Group group = (Group) C2548q.d(i11, view);
            if (group != null) {
                i11 = R$id.minusButtonIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.plusButtonIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.pricePerUnitTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.pricesFlexbox;
                            PriceFlexboxView priceFlexboxView = (PriceFlexboxView) C2548q.d(i11, view);
                            if (priceFlexboxView != null) {
                                i11 = R$id.toCartBtnAndPriceGroup;
                                Group group2 = (Group) C2548q.d(i11, view);
                                if (group2 != null) {
                                    i11 = R$id.toCartBtnView;
                                    ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                                    if (imageView3 != null) {
                                        return new CartPriceExpressAtomBinding(view, textView, group, imageView, imageView2, textView2, priceFlexboxView, group2, imageView3);
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
    public static CartPriceExpressAtomBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.cart_price_express_atom, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

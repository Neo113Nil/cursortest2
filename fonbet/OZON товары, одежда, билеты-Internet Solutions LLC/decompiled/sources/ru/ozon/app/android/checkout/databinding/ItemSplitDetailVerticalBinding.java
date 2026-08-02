package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class ItemSplitDetailVerticalBinding implements a {

    @NonNull
    public final SingleAtom annotationSA;

    @NonNull
    public final AppCompatImageView decreaseQuantityBtn;

    @NonNull
    public final SingleAtom descriptionSA;

    @NonNull
    public final AppCompatImageView increaseQuantityBtn;

    @NonNull
    public final SingleAtom premiumPriceSA;

    @NonNull
    public final SingleAtom pricePerItemSA;

    @NonNull
    public final SingleAtom priceSA;

    @NonNull
    public final ShapeableImageView productImageIV;

    @NonNull
    public final IconView promoIconView;

    @NonNull
    public final Barrier quantityBarrier;

    @NonNull
    public final QuantityInput quantityEt;

    @NonNull
    public final SingleAtom quantitySA;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemSplitDetailVerticalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SingleAtom singleAtom, @NonNull AppCompatImageView appCompatImageView, @NonNull SingleAtom singleAtom2, @NonNull AppCompatImageView appCompatImageView2, @NonNull SingleAtom singleAtom3, @NonNull SingleAtom singleAtom4, @NonNull SingleAtom singleAtom5, @NonNull ShapeableImageView shapeableImageView, @NonNull IconView iconView, @NonNull Barrier barrier, @NonNull QuantityInput quantityInput, @NonNull SingleAtom singleAtom6) {
        this.rootView = constraintLayout;
        this.annotationSA = singleAtom;
        this.decreaseQuantityBtn = appCompatImageView;
        this.descriptionSA = singleAtom2;
        this.increaseQuantityBtn = appCompatImageView2;
        this.premiumPriceSA = singleAtom3;
        this.pricePerItemSA = singleAtom4;
        this.priceSA = singleAtom5;
        this.productImageIV = shapeableImageView;
        this.promoIconView = iconView;
        this.quantityBarrier = barrier;
        this.quantityEt = quantityInput;
        this.quantitySA = singleAtom6;
    }

    @NonNull
    public static ItemSplitDetailVerticalBinding bind(@NonNull View view) {
        int i11 = R$id.annotationSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.decreaseQuantityBtn;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.descriptionSA;
                SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                if (singleAtom2 != null) {
                    i11 = R$id.increaseQuantityBtn;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.premiumPriceSA;
                        SingleAtom singleAtom3 = (SingleAtom) C2548q.d(i11, view);
                        if (singleAtom3 != null) {
                            i11 = R$id.pricePerItemSA;
                            SingleAtom singleAtom4 = (SingleAtom) C2548q.d(i11, view);
                            if (singleAtom4 != null) {
                                i11 = R$id.priceSA;
                                SingleAtom singleAtom5 = (SingleAtom) C2548q.d(i11, view);
                                if (singleAtom5 != null) {
                                    i11 = R$id.productImageIV;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                                    if (shapeableImageView != null) {
                                        i11 = R$id.promoIconView;
                                        IconView iconView = (IconView) C2548q.d(i11, view);
                                        if (iconView != null) {
                                            i11 = R$id.quantityBarrier;
                                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                                            if (barrier != null) {
                                                i11 = R$id.quantityEt;
                                                QuantityInput quantityInput = (QuantityInput) C2548q.d(i11, view);
                                                if (quantityInput != null) {
                                                    i11 = R$id.quantitySA;
                                                    SingleAtom singleAtom6 = (SingleAtom) C2548q.d(i11, view);
                                                    if (singleAtom6 != null) {
                                                        return new ItemSplitDetailVerticalBinding((ConstraintLayout) view, singleAtom, appCompatImageView, singleAtom2, appCompatImageView2, singleAtom3, singleAtom4, singleAtom5, shapeableImageView, iconView, barrier, quantityInput, singleAtom6);
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

    @NonNull
    public static ItemSplitDetailVerticalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_split_detail_vertical, viewGroup, false);
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

package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpItemPriceActionsCellBinding implements a {

    @NonNull
    public final ImageView priceActionDisclosureIv;

    @NonNull
    public final ImageView priceActionItemIconIv;

    @NonNull
    public final TextAtomV2View priceActionItemTextTav;

    @NonNull
    public final ConstraintLayout priceActionsItemRootCl;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpItemPriceActionsCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.priceActionDisclosureIv = imageView;
        this.priceActionItemIconIv = imageView2;
        this.priceActionItemTextTav = textAtomV2View;
        this.priceActionsItemRootCl = constraintLayout2;
    }

    @NonNull
    public static PdpItemPriceActionsCellBinding bind(@NonNull View view) {
        int i11 = R$id.priceActionDisclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.priceActionItemIconIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.priceActionItemTextTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new PdpItemPriceActionsCellBinding(constraintLayout, imageView, imageView2, textAtomV2View, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpItemPriceActionsCellBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_item_price_actions_cell, viewGroup, false);
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

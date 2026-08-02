package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetWannaDiscountDecisionBinding implements a {

    @NonNull
    public final SmallIconButtonView infoStatusButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView sellerMessageSubtitleTv;

    @NonNull
    public final TextAtomView sellerMessageTitleTv;

    @NonNull
    public final View sellerMessageView;

    @NonNull
    public final View wannaDiscountPriceBg;

    @NonNull
    public final TextAtomView wannaDiscountPriceTv;

    @NonNull
    public final PriceView wannaDiscountPriceView;

    @NonNull
    public final TextAtomView wannaDiscountStatusSubtitle;

    @NonNull
    public final TextAtomView wannaDiscountStatusTitle;

    @NonNull
    public final SingleAtom wannaDiscountTimerBadge;

    @NonNull
    public final TextAtomView wannaDiscountTimerTitle;

    private WidgetWannaDiscountDecisionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull View view, @NonNull View view2, @NonNull TextAtomView textAtomView3, @NonNull PriceView priceView, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull SingleAtom singleAtom, @NonNull TextAtomView textAtomView6) {
        this.rootView = constraintLayout;
        this.infoStatusButton = smallIconButtonView;
        this.sellerMessageSubtitleTv = textAtomView;
        this.sellerMessageTitleTv = textAtomView2;
        this.sellerMessageView = view;
        this.wannaDiscountPriceBg = view2;
        this.wannaDiscountPriceTv = textAtomView3;
        this.wannaDiscountPriceView = priceView;
        this.wannaDiscountStatusSubtitle = textAtomView4;
        this.wannaDiscountStatusTitle = textAtomView5;
        this.wannaDiscountTimerBadge = singleAtom;
        this.wannaDiscountTimerTitle = textAtomView6;
    }

    @NonNull
    public static WidgetWannaDiscountDecisionBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.infoStatusButton;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.sellerMessageSubtitleTv;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.sellerMessageTitleTv;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.sellerMessageView), view)) != null && (d12 = C2548q.d((i11 = R$id.wannaDiscountPriceBg), view)) != null) {
                    i11 = R$id.wannaDiscountPriceTv;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.wannaDiscountPriceView;
                        PriceView priceView = (PriceView) C2548q.d(i11, view);
                        if (priceView != null) {
                            i11 = R$id.wannaDiscountStatusSubtitle;
                            TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView4 != null) {
                                i11 = R$id.wannaDiscountStatusTitle;
                                TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView5 != null) {
                                    i11 = R$id.wannaDiscountTimerBadge;
                                    SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                                    if (singleAtom != null) {
                                        i11 = R$id.wannaDiscountTimerTitle;
                                        TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView6 != null) {
                                            return new WidgetWannaDiscountDecisionBinding((ConstraintLayout) view, smallIconButtonView, textAtomView, textAtomView2, d11, d12, textAtomView3, priceView, textAtomView4, textAtomView5, singleAtom, textAtomView6);
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

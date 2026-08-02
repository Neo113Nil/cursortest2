package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetTotalCommonFooterPriceBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView footerBtn;

    @NonNull
    public final SingleAtom priceTA;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subtitleTA;

    @NonNull
    public final SingleAtom titleTA;

    private WidgetTotalCommonFooterPriceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull SingleAtom singleAtom, @NonNull TextAtomView textAtomView, @NonNull SingleAtom singleAtom2) {
        this.rootView = constraintLayout;
        this.footerBtn = smallBorderlessButtonView;
        this.priceTA = singleAtom;
        this.subtitleTA = textAtomView;
        this.titleTA = singleAtom2;
    }

    @NonNull
    public static WidgetTotalCommonFooterPriceBinding bind(@NonNull View view) {
        int i11 = R$id.footerBtn;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
        if (smallBorderlessButtonView != null) {
            i11 = R$id.priceTA;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.subtitleTA;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.titleTA;
                    SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                    if (singleAtom2 != null) {
                        return new WidgetTotalCommonFooterPriceBinding((ConstraintLayout) view, smallBorderlessButtonView, singleAtom, textAtomView, singleAtom2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetTotalCommonFooterPriceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_total_common_footer_price, viewGroup, false);
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

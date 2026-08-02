package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class WidgetTotalCommonPriceBinding implements a {

    @NonNull
    public final ButtonAtom buttonBA;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final Group originalPriceGroup;

    @NonNull
    public final View originalPriceStrikeThroughV;

    @NonNull
    public final TextView originalPriceTv;

    @NonNull
    public final TextAtomV2View priceSubtitle;

    @NonNull
    public final TextView priceTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetTotalCommonPriceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonAtom buttonAtom, @NonNull ImageView imageView, @NonNull Group group, @NonNull View view, @NonNull TextView textView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.buttonBA = buttonAtom;
        this.iconIv = imageView;
        this.originalPriceGroup = group;
        this.originalPriceStrikeThroughV = view;
        this.originalPriceTv = textView;
        this.priceSubtitle = textAtomV2View;
        this.priceTv = textView2;
        this.subtitleTv = textView3;
        this.titleTv = textView4;
    }

    @NonNull
    public static WidgetTotalCommonPriceBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonBA;
        ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
        if (buttonAtom != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.originalPriceGroup;
                Group group = (Group) C2548q.d(i11, view);
                if (group != null && (d11 = C2548q.d((i11 = R$id.originalPriceStrikeThroughV), view)) != null) {
                    i11 = R$id.originalPriceTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.priceSubtitle;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.priceTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.subtitleTv;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    i11 = R$id.titleTv;
                                    TextView textView4 = (TextView) C2548q.d(i11, view);
                                    if (textView4 != null) {
                                        return new WidgetTotalCommonPriceBinding((ConstraintLayout) view, buttonAtom, imageView, group, d11, textView, textAtomV2View, textView2, textView3, textView4);
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
    public static WidgetTotalCommonPriceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_total_common_price, viewGroup, false);
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

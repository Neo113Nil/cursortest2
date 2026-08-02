package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ViewPdpGradientCouponBinding implements a {

    @NonNull
    public final TextAtomV2View gradientCouponApplyTV;

    @NonNull
    public final TextAtomV2View gradientCouponCodeTV;

    @NonNull
    public final TextAtomV2View gradientCouponSubtitleTV;

    @NonNull
    private final View rootView;

    @NonNull
    public final LinearLayout textLl;

    private ViewPdpGradientCouponBinding(@NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull LinearLayout linearLayout) {
        this.rootView = view;
        this.gradientCouponApplyTV = textAtomV2View;
        this.gradientCouponCodeTV = textAtomV2View2;
        this.gradientCouponSubtitleTV = textAtomV2View3;
        this.textLl = linearLayout;
    }

    @NonNull
    public static ViewPdpGradientCouponBinding bind(@NonNull View view) {
        int i11 = R$id.gradientCouponApplyTV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.gradientCouponCodeTV;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.gradientCouponSubtitleTV;
                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View3 != null) {
                    i11 = R$id.textLl;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        return new ViewPdpGradientCouponBinding(view, textAtomV2View, textAtomV2View2, textAtomV2View3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewPdpGradientCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_pdp_gradient_coupon, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

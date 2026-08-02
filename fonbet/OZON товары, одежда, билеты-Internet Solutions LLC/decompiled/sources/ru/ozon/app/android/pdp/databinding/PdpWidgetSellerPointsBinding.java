package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetSellerPointsBinding implements a {

    @NonNull
    public final PdpLayoutSellerPointsLabelsBlockBinding firstBlockInclude;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PdpLayoutSellerPointsLabelsBlockBinding secondBlockInclude;

    @NonNull
    public final LinearLayout sellerPointsRootCl;

    private PdpWidgetSellerPointsBinding(@NonNull LinearLayout linearLayout, @NonNull PdpLayoutSellerPointsLabelsBlockBinding pdpLayoutSellerPointsLabelsBlockBinding, @NonNull PdpLayoutSellerPointsLabelsBlockBinding pdpLayoutSellerPointsLabelsBlockBinding2, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.firstBlockInclude = pdpLayoutSellerPointsLabelsBlockBinding;
        this.secondBlockInclude = pdpLayoutSellerPointsLabelsBlockBinding2;
        this.sellerPointsRootCl = linearLayout2;
    }

    @NonNull
    public static PdpWidgetSellerPointsBinding bind(@NonNull View view) {
        int i11 = R$id.firstBlockInclude;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            PdpLayoutSellerPointsLabelsBlockBinding bind = PdpLayoutSellerPointsLabelsBlockBinding.bind(d11);
            int i12 = R$id.secondBlockInclude;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new PdpWidgetSellerPointsBinding(linearLayout, bind, PdpLayoutSellerPointsLabelsBlockBinding.bind(d12), linearLayout);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

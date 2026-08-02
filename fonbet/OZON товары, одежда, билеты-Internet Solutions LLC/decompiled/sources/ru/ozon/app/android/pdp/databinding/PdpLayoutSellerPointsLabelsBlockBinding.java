package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpLayoutSellerPointsLabelsBlockBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sellerPointsBlockRoot;

    @NonNull
    public final TextAtomV2View sellerPointsBlockSubtitleTav;

    @NonNull
    public final TextAtomV2View sellerPointsBlockTitleTav;

    private PdpLayoutSellerPointsLabelsBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.sellerPointsBlockRoot = linearLayout2;
        this.sellerPointsBlockSubtitleTav = textAtomV2View;
        this.sellerPointsBlockTitleTav = textAtomV2View2;
    }

    @NonNull
    public static PdpLayoutSellerPointsLabelsBlockBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.sellerPointsBlockSubtitleTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.sellerPointsBlockTitleTav;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new PdpLayoutSellerPointsLabelsBlockBinding(linearLayout, linearLayout, textAtomV2View, textAtomV2View2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

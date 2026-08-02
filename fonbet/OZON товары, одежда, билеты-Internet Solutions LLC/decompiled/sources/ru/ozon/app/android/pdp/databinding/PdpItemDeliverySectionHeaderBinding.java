package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpItemDeliverySectionHeaderBinding implements a {

    @NonNull
    public final ImageView deliveryVariantIconIv;

    @NonNull
    public final TextAtomV2View deliveryVariantTav;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpItemDeliverySectionHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.deliveryVariantIconIv = imageView;
        this.deliveryVariantTav = textAtomV2View;
    }

    @NonNull
    public static PdpItemDeliverySectionHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.deliveryVariantIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.deliveryVariantTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new PdpItemDeliverySectionHeaderBinding((ConstraintLayout) view, imageView, textAtomV2View);
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

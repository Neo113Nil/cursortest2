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
public final class PdpItemDeliveryCellDefaultBinding implements a {

    @NonNull
    public final TextAtomV2View deliverySubtitleTav;

    @NonNull
    public final TextAtomV2View deliveryTitleTav;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpItemDeliveryCellDefaultBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.deliverySubtitleTav = textAtomV2View;
        this.deliveryTitleTav = textAtomV2View2;
        this.disclosureIv = imageView;
    }

    @NonNull
    public static PdpItemDeliveryCellDefaultBinding bind(@NonNull View view) {
        int i11 = R$id.deliverySubtitleTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.deliveryTitleTav;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.disclosureIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    return new PdpItemDeliveryCellDefaultBinding((ConstraintLayout) view, textAtomV2View, textAtomV2View2, imageView);
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

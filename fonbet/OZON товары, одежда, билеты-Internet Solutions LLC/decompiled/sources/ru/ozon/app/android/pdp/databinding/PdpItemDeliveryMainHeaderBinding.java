package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes13.dex */
public final class PdpItemDeliveryMainHeaderBinding implements a {

    @NonNull
    public final DisclaimerContainer annotationAtom;

    @NonNull
    public final SmallBorderlessButtonView anotherSellerBtn;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTAV;

    private PdpItemDeliveryMainHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.annotationAtom = disclaimerContainer;
        this.anotherSellerBtn = smallBorderlessButtonView;
        this.rootCl = constraintLayout2;
        this.titleTAV = textAtomV2View;
    }

    @NonNull
    public static PdpItemDeliveryMainHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.annotationAtom;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            i11 = R$id.anotherSellerBtn;
            SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
            if (smallBorderlessButtonView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.titleTAV;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new PdpItemDeliveryMainHeaderBinding(constraintLayout, disclaimerContainer, smallBorderlessButtonView, constraintLayout, textAtomV2View);
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

package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes2.dex */
public final class WidgetReviewStatusBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView buttonView;

    @NonNull
    public final DisclaimerContainer promoStatusDC;

    @NonNull
    public final TextAtomV2View publicationStatusTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetReviewStatusBinding(@NonNull LinearLayout linearLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull DisclaimerContainer disclaimerContainer, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.buttonView = largeBorderlessButtonView;
        this.promoStatusDC = disclaimerContainer;
        this.publicationStatusTAV = textAtomV2View;
    }

    @NonNull
    public static WidgetReviewStatusBinding bind(@NonNull View view) {
        int i11 = R$id.buttonView;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.promoStatusDC;
            DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
            if (disclaimerContainer != null) {
                i11 = R$id.publicationStatusTAV;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetReviewStatusBinding((LinearLayout) view, largeBorderlessButtonView, disclaimerContainer, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

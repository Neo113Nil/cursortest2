package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantLinearLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetAspectsV2TextColorLayoutBinding implements a {

    @NonNull
    public final SquareAspectColorVariantView colorView;

    @NonNull
    private final VariantLinearLayout rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAspectsV2TextColorLayoutBinding(@NonNull VariantLinearLayout variantLinearLayout, @NonNull SquareAspectColorVariantView squareAspectColorVariantView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = variantLinearLayout;
        this.colorView = squareAspectColorVariantView;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetAspectsV2TextColorLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.colorView;
        SquareAspectColorVariantView squareAspectColorVariantView = (SquareAspectColorVariantView) C2548q.d(i11, view);
        if (squareAspectColorVariantView != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetAspectsV2TextColorLayoutBinding((VariantLinearLayout) view, squareAspectColorVariantView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VariantLinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

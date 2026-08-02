package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantFrameLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2TextLayoutBinding implements a {

    @NonNull
    private final VariantFrameLayout rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAspectsCompactV2TextLayoutBinding(@NonNull VariantFrameLayout variantFrameLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = variantFrameLayout;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetAspectsCompactV2TextLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.titleTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            return new WidgetAspectsCompactV2TextLayoutBinding((VariantFrameLayout) view, textAtomV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public VariantFrameLayout getRoot() {
        return this.rootView;
    }
}

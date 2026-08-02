package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2TextIconLayoutBinding implements a {

    @NonNull
    public final ImageView icon;

    @NonNull
    private final VariantConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAspectsCompactV2TextIconLayoutBinding(@NonNull VariantConstraintLayout variantConstraintLayout, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = variantConstraintLayout;
        this.icon = imageView;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetAspectsCompactV2TextIconLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.icon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetAspectsCompactV2TextIconLayoutBinding((VariantConstraintLayout) view, imageView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public VariantConstraintLayout getRoot() {
        return this.rootView;
    }
}

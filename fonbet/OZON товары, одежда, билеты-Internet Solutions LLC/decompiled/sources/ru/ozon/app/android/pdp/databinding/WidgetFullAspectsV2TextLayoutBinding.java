package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantFrameLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetFullAspectsV2TextLayoutBinding implements a {

    @NonNull
    public final VariantFrameLayout infoFl;

    @NonNull
    private final VariantFrameLayout rootView;

    @NonNull
    public final TextAtomV2View titleTV;

    private WidgetFullAspectsV2TextLayoutBinding(@NonNull VariantFrameLayout variantFrameLayout, @NonNull VariantFrameLayout variantFrameLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = variantFrameLayout;
        this.infoFl = variantFrameLayout2;
        this.titleTV = textAtomV2View;
    }

    @NonNull
    public static WidgetFullAspectsV2TextLayoutBinding bind(@NonNull View view) {
        VariantFrameLayout variantFrameLayout = (VariantFrameLayout) view;
        int i11 = R$id.titleTV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            return new WidgetFullAspectsV2TextLayoutBinding(variantFrameLayout, variantFrameLayout, textAtomV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetFullAspectsV2TextLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_full_aspects_v2_text_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public VariantFrameLayout getRoot() {
        return this.rootView;
    }
}

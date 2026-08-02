package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.nutritionInfov2.NutritionCustomSeparatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetNutritionInfoV2Binding implements a {

    @NonNull
    public final NutritionCustomSeparatorView customView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetNutritionInfoV2Binding(@NonNull LinearLayout linearLayout, @NonNull NutritionCustomSeparatorView nutritionCustomSeparatorView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.customView = nutritionCustomSeparatorView;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetNutritionInfoV2Binding bind(@NonNull View view) {
        int i11 = R$id.customView;
        NutritionCustomSeparatorView nutritionCustomSeparatorView = (NutritionCustomSeparatorView) C2548q.d(i11, view);
        if (nutritionCustomSeparatorView != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetNutritionInfoV2Binding((LinearLayout) view, nutritionCustomSeparatorView, textAtomV2View);
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

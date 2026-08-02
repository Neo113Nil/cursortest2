package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;

/* loaded from: classes13.dex */
public final class WidgetAspectsV2LayoutFlexBinding implements a {

    @NonNull
    public final SmallBorderlessButtonWithIconView additionalBtn;

    @NonNull
    public final ButtonV3View additionalBtnWithoutIcon;

    @NonNull
    public final Barrier buttonsBarrier;

    @NonNull
    private final VariantConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTv;

    @NonNull
    public final RecyclerView variantsFl;

    private WidgetAspectsV2LayoutFlexBinding(@NonNull VariantConstraintLayout variantConstraintLayout, @NonNull SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView, @NonNull ButtonV3View buttonV3View, @NonNull Barrier barrier, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView) {
        this.rootView = variantConstraintLayout;
        this.additionalBtn = smallBorderlessButtonWithIconView;
        this.additionalBtnWithoutIcon = buttonV3View;
        this.buttonsBarrier = barrier;
        this.titleTv = textAtomV2View;
        this.variantsFl = recyclerView;
    }

    @NonNull
    public static WidgetAspectsV2LayoutFlexBinding bind(@NonNull View view) {
        int i11 = R$id.additionalBtn;
        SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView = (SmallBorderlessButtonWithIconView) C2548q.d(i11, view);
        if (smallBorderlessButtonWithIconView != null) {
            i11 = R$id.additionalBtnWithoutIcon;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.buttonsBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.titleTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.variantsFl;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            return new WidgetAspectsV2LayoutFlexBinding((VariantConstraintLayout) view, smallBorderlessButtonWithIconView, buttonV3View, barrier, textAtomV2View, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VariantConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

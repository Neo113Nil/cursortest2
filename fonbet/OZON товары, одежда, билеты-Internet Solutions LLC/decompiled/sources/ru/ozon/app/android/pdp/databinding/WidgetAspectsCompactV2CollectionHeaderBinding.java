package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2CollectionHeaderBinding implements a {

    @NonNull
    public final SmallBorderlessButtonWithIconView additionalBtn;

    @NonNull
    public final ButtonV3View additionalBtnWithoutIcon;

    @NonNull
    public final ConstraintLayout aspectsCompactColorRootCl;

    @NonNull
    public final Barrier buttonsBarrier;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTv;

    private WidgetAspectsCompactV2CollectionHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView, @NonNull ButtonV3View buttonV3View, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.additionalBtn = smallBorderlessButtonWithIconView;
        this.additionalBtnWithoutIcon = buttonV3View;
        this.aspectsCompactColorRootCl = constraintLayout2;
        this.buttonsBarrier = barrier;
        this.titleTv = textAtomV2View;
    }

    @NonNull
    public static WidgetAspectsCompactV2CollectionHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.additionalBtn;
        SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView = (SmallBorderlessButtonWithIconView) C2548q.d(i11, view);
        if (smallBorderlessButtonWithIconView != null) {
            i11 = R$id.additionalBtnWithoutIcon;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.buttonsBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.titleTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new WidgetAspectsCompactV2CollectionHeaderBinding(constraintLayout, smallBorderlessButtonWithIconView, buttonV3View, constraintLayout, barrier, textAtomV2View);
                    }
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

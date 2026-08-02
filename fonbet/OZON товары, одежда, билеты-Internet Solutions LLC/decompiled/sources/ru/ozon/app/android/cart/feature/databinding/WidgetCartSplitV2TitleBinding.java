package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.thermometer.presentation.view.ThermometerMoleculeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetCartSplitV2TitleBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView additionalActionBtn;

    @NonNull
    public final HorizontalFlexAtomsLayout badgesHfal;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout splitV2TitleRootCl;

    @NonNull
    public final TextAtomView subtitleSA;

    @NonNull
    public final ThermometerMoleculeView thermometerMoleculeView;

    @NonNull
    public final Barrier titleBarrier;

    @NonNull
    public final TextAtomView titleSA;

    private WidgetCartSplitV2TitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull ThermometerMoleculeView thermometerMoleculeView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.additionalActionBtn = smallBorderlessButtonView;
        this.badgesHfal = horizontalFlexAtomsLayout;
        this.splitV2TitleRootCl = constraintLayout2;
        this.subtitleSA = textAtomView;
        this.thermometerMoleculeView = thermometerMoleculeView;
        this.titleBarrier = barrier;
        this.titleSA = textAtomView2;
    }

    @NonNull
    public static WidgetCartSplitV2TitleBinding bind(@NonNull View view) {
        int i11 = R$id.additionalActionBtn;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
        if (smallBorderlessButtonView != null) {
            i11 = R$id.badgesHfal;
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
            if (horizontalFlexAtomsLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.subtitleSA;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.thermometerMoleculeView;
                    ThermometerMoleculeView thermometerMoleculeView = (ThermometerMoleculeView) C2548q.d(i11, view);
                    if (thermometerMoleculeView != null) {
                        i11 = R$id.titleBarrier;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.titleSA;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                return new WidgetCartSplitV2TitleBinding(constraintLayout, smallBorderlessButtonView, horizontalFlexAtomsLayout, constraintLayout, textAtomView, thermometerMoleculeView, barrier, textAtomView2);
                            }
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

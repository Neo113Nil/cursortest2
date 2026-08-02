package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes12.dex */
public final class WidgetUserLegalEntitiesLayoutBinding implements a {

    @NonNull
    public final TextAtomV2View addressTav;

    @NonNull
    public final View clickableAreaSibv;

    @NonNull
    public final HorizontalAtomsLayout controlsAtom;

    @NonNull
    public final TextAtomV2View paypropsTav;

    @NonNull
    public final SmallIconButtonView removeSibv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetUserLegalEntitiesLayoutBinding(@NonNull CardView cardView, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull TextAtomV2View textAtomV2View2, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = cardView;
        this.addressTav = textAtomV2View;
        this.clickableAreaSibv = view;
        this.controlsAtom = horizontalAtomsLayout;
        this.paypropsTav = textAtomV2View2;
        this.removeSibv = smallIconButtonView;
        this.titleTav = textAtomV2View3;
    }

    @NonNull
    public static WidgetUserLegalEntitiesLayoutBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.addressTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.clickableAreaSibv), view)) != null) {
            i11 = R$id.controlsAtom;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.paypropsTav;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.removeSibv;
                    SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                    if (smallIconButtonView != null) {
                        i11 = R$id.titleTav;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            return new WidgetUserLegalEntitiesLayoutBinding((CardView) view, textAtomV2View, d11, horizontalAtomsLayout, textAtomV2View2, smallIconButtonView, textAtomV2View3);
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
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}

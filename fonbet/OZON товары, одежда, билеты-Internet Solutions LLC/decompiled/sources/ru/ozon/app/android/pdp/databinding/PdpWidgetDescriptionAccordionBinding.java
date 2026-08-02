package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.AccordionIconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpWidgetDescriptionAccordionBinding implements a {

    @NonNull
    public final Layer clickableAreaF;

    @NonNull
    public final AccordionIconView disclosureIconIv;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleDescriptionAccordionTAV;

    private PdpWidgetDescriptionAccordionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Layer layer, @NonNull AccordionIconView accordionIconView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.clickableAreaF = layer;
        this.disclosureIconIv = accordionIconView;
        this.rootCl = constraintLayout2;
        this.separatorV = view;
        this.subtitleTav = textAtomV2View;
        this.titleDescriptionAccordionTAV = textAtomV2View2;
    }

    @NonNull
    public static PdpWidgetDescriptionAccordionBinding bind(@NonNull View view) {
        int i11 = R$id.clickableAreaF;
        Layer layer = (Layer) C2548q.d(i11, view);
        if (layer != null) {
            i11 = R$id.disclosureIconIv;
            AccordionIconView accordionIconView = (AccordionIconView) C2548q.d(i11, view);
            if (accordionIconView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.separatorV;
                View d11 = C2548q.d(i11, view);
                if (d11 != null) {
                    i11 = R$id.subtitleTav;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.titleDescriptionAccordionTAV;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            return new PdpWidgetDescriptionAccordionBinding(constraintLayout, layer, accordionIconView, constraintLayout, d11, textAtomV2View, textAtomV2View2);
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

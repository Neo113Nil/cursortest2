package ru.ozon.app.android.faq.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.faq.R$id;
import ru.ozon.app.android.faq.accordion.presentation.AccordionIconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class FaqAccordionBinding implements a {

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
    public final VerticalAtomsLayout subtitleVal;

    @NonNull
    public final TextAtomView titleDescriptionAccordionTAV;

    private FaqAccordionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Layer layer, @NonNull AccordionIconView accordionIconView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.clickableAreaF = layer;
        this.disclosureIconIv = accordionIconView;
        this.rootCl = constraintLayout2;
        this.separatorV = view;
        this.subtitleVal = verticalAtomsLayout;
        this.titleDescriptionAccordionTAV = textAtomView;
    }

    @NonNull
    public static FaqAccordionBinding bind(@NonNull View view) {
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
                    i11 = R$id.subtitleVal;
                    VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                    if (verticalAtomsLayout != null) {
                        i11 = R$id.titleDescriptionAccordionTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            return new FaqAccordionBinding(constraintLayout, layer, accordionIconView, constraintLayout, d11, verticalAtomsLayout, textAtomView);
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

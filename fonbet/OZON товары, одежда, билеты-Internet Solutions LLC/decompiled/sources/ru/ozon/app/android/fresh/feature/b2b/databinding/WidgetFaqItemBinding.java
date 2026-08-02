package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.DisclosureIconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetFaqItemBinding implements a {

    @NonNull
    public final TextAtomV2View answer;

    @NonNull
    public final Layer clickableAreaF;

    @NonNull
    public final DisclosureIconView disclosureButton;

    @NonNull
    public final TextAtomV2View question;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetFaqItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull Layer layer, @NonNull DisclosureIconView disclosureIconView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.answer = textAtomV2View;
        this.clickableAreaF = layer;
        this.disclosureButton = disclosureIconView;
        this.question = textAtomV2View2;
    }

    @NonNull
    public static WidgetFaqItemBinding bind(@NonNull View view) {
        int i11 = R$id.answer;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.clickableAreaF;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.disclosureButton;
                DisclosureIconView disclosureIconView = (DisclosureIconView) C2548q.d(i11, view);
                if (disclosureIconView != null) {
                    i11 = R$id.question;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetFaqItemBinding((ConstraintLayout) view, textAtomV2View, layer, disclosureIconView, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetFaqItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_faq_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

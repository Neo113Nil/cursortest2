package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetStickyBlockProductPickerDetailsBinding implements a {

    @NonNull
    public final SingleAtom buttonSa;

    @NonNull
    public final HorizontalAtomsLayout restrictionAtomLayout;

    @NonNull
    public final CardView restrictionCv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetStickyBlockProductPickerDetailsBinding(@NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull CardView cardView) {
        this.rootView = linearLayout;
        this.buttonSa = singleAtom;
        this.restrictionAtomLayout = horizontalAtomsLayout;
        this.restrictionCv = cardView;
    }

    @NonNull
    public static WidgetStickyBlockProductPickerDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.buttonSa;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.restrictionAtomLayout;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.restrictionCv;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    return new WidgetStickyBlockProductPickerDetailsBinding((LinearLayout) view, singleAtom, horizontalAtomsLayout, cardView);
                }
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

package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetSplitDetailsV2Binding implements a {

    @NonNull
    public final SingleAtom headerSA;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView splitsRV;

    @NonNull
    public final VerticalAtomsLayout stickyButtonsVAL;

    private WidgetSplitDetailsV2Binding(@NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom, @NonNull RecyclerView recyclerView, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = linearLayout;
        this.headerSA = singleAtom;
        this.splitsRV = recyclerView;
        this.stickyButtonsVAL = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetSplitDetailsV2Binding bind(@NonNull View view) {
        int i11 = R$id.headerSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.splitsRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.stickyButtonsVAL;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    return new WidgetSplitDetailsV2Binding((LinearLayout) view, singleAtom, recyclerView, verticalAtomsLayout);
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

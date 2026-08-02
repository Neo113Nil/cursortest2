package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetInstallmentPaymentScheduleBinding implements a {

    @NonNull
    public final TextAtomV2View description;

    @NonNull
    public final RecyclerView paymentsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private WidgetInstallmentPaymentScheduleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.description = textAtomV2View;
        this.paymentsRv = recyclerView;
        this.subtitle = textAtomV2View2;
        this.title = textAtomV2View3;
    }

    @NonNull
    public static WidgetInstallmentPaymentScheduleBinding bind(@NonNull View view) {
        int i11 = R$id.description;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.paymentsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.subtitle;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        return new WidgetInstallmentPaymentScheduleBinding((ConstraintLayout) view, textAtomV2View, recyclerView, textAtomV2View2, textAtomV2View3);
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

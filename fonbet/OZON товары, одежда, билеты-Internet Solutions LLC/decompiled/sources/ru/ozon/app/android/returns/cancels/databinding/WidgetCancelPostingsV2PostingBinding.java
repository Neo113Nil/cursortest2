package ru.ozon.app.android.returns.cancels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.returns.cancels.R$id;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetCancelPostingsV2PostingBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final HorizontalFlexAtomsLayout titleRowFlexAL;

    @NonNull
    public final Barrier topBarrier;

    private WidgetCancelPostingsV2PostingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull Barrier barrier) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.itemsRv = recyclerView;
        this.titleRowFlexAL = horizontalFlexAtomsLayout;
        this.topBarrier = barrier;
    }

    @NonNull
    public static WidgetCancelPostingsV2PostingBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.itemsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.titleRowFlexAL;
                HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                if (horizontalFlexAtomsLayout != null) {
                    i11 = R$id.topBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        return new WidgetCancelPostingsV2PostingBinding((ConstraintLayout) view, d11, recyclerView, horizontalFlexAtomsLayout, barrier);
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

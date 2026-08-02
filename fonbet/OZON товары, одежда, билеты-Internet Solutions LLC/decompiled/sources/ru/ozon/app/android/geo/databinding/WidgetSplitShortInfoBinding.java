package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetSplitShortInfoBinding implements a {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout shortInfoContainer;

    @NonNull
    public final SingleAtom subtitleSAL;

    @NonNull
    public final SingleAtom titleSAL;

    private WidgetSplitShortInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.itemsRv = recyclerView;
        this.shortInfoContainer = constraintLayout2;
        this.subtitleSAL = singleAtom;
        this.titleSAL = singleAtom2;
    }

    @NonNull
    public static WidgetSplitShortInfoBinding bind(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.itemsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.subtitleSAL;
                SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                if (singleAtom != null) {
                    i11 = R$id.titleSAL;
                    SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                    if (singleAtom2 != null) {
                        return new WidgetSplitShortInfoBinding(constraintLayout, barrier, recyclerView, constraintLayout, singleAtom, singleAtom2);
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

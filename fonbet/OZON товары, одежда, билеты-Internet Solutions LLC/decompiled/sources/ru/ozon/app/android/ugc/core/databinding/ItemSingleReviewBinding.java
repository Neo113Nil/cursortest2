package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes2.dex */
public final class ItemSingleReviewBinding implements a {

    @NonNull
    public final Barrier badgesBarrier;

    @NonNull
    public final VerticalAtomsLayout bodyAtomsVAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout singleReviewCl;

    private ItemSingleReviewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.badgesBarrier = barrier;
        this.bodyAtomsVAL = verticalAtomsLayout;
        this.singleReviewCl = constraintLayout2;
    }

    @NonNull
    public static ItemSingleReviewBinding bind(@NonNull View view) {
        int i11 = R$id.badgesBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.bodyAtomsVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new ItemSingleReviewBinding(constraintLayout, barrier, verticalAtomsLayout, constraintLayout);
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

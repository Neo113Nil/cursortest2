package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class ItemSingleReviewButtonsBinding implements a {

    @NonNull
    public final ConstraintLayout buttonsContainer;

    @NonNull
    public final HorizontalAtomsLayout leftButtonsHAL;

    @NonNull
    public final HorizontalAtomsLayout rightButtonsHAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorBottom;

    @NonNull
    public final TextAtomV2View titleTAV;

    private ItemSingleReviewButtonsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout2, @NonNull View view, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.buttonsContainer = constraintLayout2;
        this.leftButtonsHAL = horizontalAtomsLayout;
        this.rightButtonsHAL = horizontalAtomsLayout2;
        this.separatorBottom = view;
        this.titleTAV = textAtomV2View;
    }

    @NonNull
    public static ItemSingleReviewButtonsBinding bind(@NonNull View view) {
        View d11;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.leftButtonsHAL;
        HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
        if (horizontalAtomsLayout != null) {
            i11 = R$id.rightButtonsHAL;
            HorizontalAtomsLayout horizontalAtomsLayout2 = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout2 != null && (d11 = C2548q.d((i11 = R$id.separatorBottom), view)) != null) {
                i11 = R$id.titleTAV;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new ItemSingleReviewButtonsBinding(constraintLayout, constraintLayout, horizontalAtomsLayout, horizontalAtomsLayout2, d11, textAtomV2View);
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

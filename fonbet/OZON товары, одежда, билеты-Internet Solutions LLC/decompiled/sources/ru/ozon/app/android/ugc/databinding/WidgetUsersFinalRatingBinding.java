package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.usersFinalRating.view.DashedLineView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes2.dex */
public final class WidgetUsersFinalRatingBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout userFinalRatingRoot;

    @NonNull
    public final SmallIconButtonView usersFinalRatingIconSibv;

    @NonNull
    public final VectorRatingBar usersFinalRatingRb;

    @NonNull
    public final TextAtomV2View usersFinalRatingTitleTav;

    @NonNull
    public final DashedLineView usersGradesDividerDlv;

    private WidgetUsersFinalRatingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SmallIconButtonView smallIconButtonView, @NonNull VectorRatingBar vectorRatingBar, @NonNull TextAtomV2View textAtomV2View, @NonNull DashedLineView dashedLineView) {
        this.rootView = constraintLayout;
        this.userFinalRatingRoot = constraintLayout2;
        this.usersFinalRatingIconSibv = smallIconButtonView;
        this.usersFinalRatingRb = vectorRatingBar;
        this.usersFinalRatingTitleTav = textAtomV2View;
        this.usersGradesDividerDlv = dashedLineView;
    }

    @NonNull
    public static WidgetUsersFinalRatingBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.usersFinalRatingIconSibv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.usersFinalRatingRb;
            VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
            if (vectorRatingBar != null) {
                i11 = R$id.usersFinalRatingTitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.usersGradesDividerDlv;
                    DashedLineView dashedLineView = (DashedLineView) C2548q.d(i11, view);
                    if (dashedLineView != null) {
                        return new WidgetUsersFinalRatingBinding(constraintLayout, constraintLayout, smallIconButtonView, vectorRatingBar, textAtomV2View, dashedLineView);
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

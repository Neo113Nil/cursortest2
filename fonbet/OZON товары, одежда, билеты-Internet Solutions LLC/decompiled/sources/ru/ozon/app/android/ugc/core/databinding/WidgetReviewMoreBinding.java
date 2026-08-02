package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.ugc.core.R$id;

/* loaded from: classes2.dex */
public final class WidgetReviewMoreBinding implements a {

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final View dividerV;

    @NonNull
    public final ConstraintLayout moreReviewsCl;

    @NonNull
    public final LabelAtom moreReviewsLa;

    @NonNull
    public final TextView moreReviewsTv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetReviewMoreBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull LabelAtom labelAtom, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.disclosureIv = imageView;
        this.dividerV = view;
        this.moreReviewsCl = constraintLayout2;
        this.moreReviewsLa = labelAtom;
        this.moreReviewsTv = textView;
    }

    @NonNull
    public static WidgetReviewMoreBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.disclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null && (d11 = C2548q.d((i11 = R$id.dividerV), view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.moreReviewsLa;
            LabelAtom labelAtom = (LabelAtom) C2548q.d(i11, view);
            if (labelAtom != null) {
                i11 = R$id.moreReviewsTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetReviewMoreBinding(constraintLayout, imageView, d11, constraintLayout, labelAtom, textView);
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

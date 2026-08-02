package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.ugc.R$id;

/* loaded from: classes2.dex */
public final class WidgetReviewsTitleBinding implements a {

    @NonNull
    public final ImageView chevronIv;

    @NonNull
    public final TextView countTv;

    @NonNull
    public final ConstraintLayout headerFl;

    @NonNull
    public final LabelAtom labelTv;

    @NonNull
    public final ButtonAtom linkBtn;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final ButtonAtom writeReviewBtn;

    private WidgetReviewsTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull LabelAtom labelAtom, @NonNull ButtonAtom buttonAtom, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ButtonAtom buttonAtom2) {
        this.rootView = constraintLayout;
        this.chevronIv = imageView;
        this.countTv = textView;
        this.headerFl = constraintLayout2;
        this.labelTv = labelAtom;
        this.linkBtn = buttonAtom;
        this.subtitleTv = textView2;
        this.titleTv = textView3;
        this.writeReviewBtn = buttonAtom2;
    }

    @NonNull
    public static WidgetReviewsTitleBinding bind(@NonNull View view) {
        int i11 = R$id.chevronIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.countTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.headerFl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.labelTv;
                    LabelAtom labelAtom = (LabelAtom) C2548q.d(i11, view);
                    if (labelAtom != null) {
                        i11 = R$id.linkBtn;
                        ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
                        if (buttonAtom != null) {
                            i11 = R$id.subtitleTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.titleTv;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    i11 = R$id.writeReviewBtn;
                                    ButtonAtom buttonAtom2 = (ButtonAtom) C2548q.d(i11, view);
                                    if (buttonAtom2 != null) {
                                        return new WidgetReviewsTitleBinding((ConstraintLayout) view, imageView, textView, constraintLayout, labelAtom, buttonAtom, textView2, textView3, buttonAtom2);
                                    }
                                }
                            }
                        }
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

package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.atoms.R$id;

/* loaded from: classes11.dex */
public final class AtomTextSubtextBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final Guideline textGuideline;

    @NonNull
    public final TextView titleTv;

    private AtomTextSubtextBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.iconIv = imageView;
        this.subTitleTv = textView;
        this.textGuideline = guideline;
        this.titleTv = textView2;
    }

    @NonNull
    public static AtomTextSubtextBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.subTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.textGuideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    i11 = R$id.titleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new AtomTextSubtextBinding((ConstraintLayout) view, imageView, textView, guideline, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

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
public final class AtomCheckboxBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    public final ImageView rightIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final Guideline textGuideline;

    @NonNull
    public final TextView titleTv;

    private AtomCheckboxBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.rightIconIv = imageView;
        this.subTitleTv = textView;
        this.textGuideline = guideline;
        this.titleTv = textView2;
    }

    @NonNull
    public static AtomCheckboxBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.rightIconIv;
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
                            return new AtomCheckboxBinding((ConstraintLayout) view, d11, imageView, textView, guideline, textView2);
                        }
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

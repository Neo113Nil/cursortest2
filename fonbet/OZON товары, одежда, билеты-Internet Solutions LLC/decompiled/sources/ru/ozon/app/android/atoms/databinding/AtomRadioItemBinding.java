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
public final class AtomRadioItemBinding implements a {

    @NonNull
    public final ImageView radioIV;

    @NonNull
    public final ImageView rightIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Guideline textGuideline;

    @NonNull
    public final TextView titleTv;

    private AtomRadioItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Guideline guideline, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.radioIV = imageView;
        this.rightIconIv = imageView2;
        this.textGuideline = guideline;
        this.titleTv = textView;
    }

    @NonNull
    public static AtomRadioItemBinding bind(@NonNull View view) {
        int i11 = R$id.radioIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.rightIconIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.textGuideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new AtomRadioItemBinding((ConstraintLayout) view, imageView, imageView2, guideline, textView);
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

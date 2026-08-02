package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.abtool.R$id;

/* loaded from: classes11.dex */
public final class AbToggleStringHolderBinding implements a {

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final ImageView resetIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final EditText toggleEt;

    private AbToggleStringHolderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull EditText editText) {
        this.rootView = constraintLayout;
        this.descriptionTv = textView;
        this.resetIv = imageView;
        this.subtitleTv = textView2;
        this.titleTv = textView3;
        this.toggleEt = editText;
    }

    @NonNull
    public static AbToggleStringHolderBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.resetIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.subtitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        i11 = R$id.toggleEt;
                        EditText editText = (EditText) C2548q.d(i11, view);
                        if (editText != null) {
                            return new AbToggleStringHolderBinding((ConstraintLayout) view, textView, imageView, textView2, textView3, editText);
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

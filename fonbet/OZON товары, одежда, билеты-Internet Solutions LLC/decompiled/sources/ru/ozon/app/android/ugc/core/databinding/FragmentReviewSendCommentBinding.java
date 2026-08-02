package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;

/* loaded from: classes2.dex */
public final class FragmentReviewSendCommentBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final EditText sendCommentEt;

    @NonNull
    public final ImageView sendCommentIv;

    @NonNull
    public final LinearLayout sendCommentLl;

    private FragmentReviewSendCommentBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.sendCommentEt = editText;
        this.sendCommentIv = imageView;
        this.sendCommentLl = linearLayout2;
    }

    @NonNull
    public static FragmentReviewSendCommentBinding bind(@NonNull View view) {
        int i11 = R$id.sendCommentEt;
        EditText editText = (EditText) C2548q.d(i11, view);
        if (editText != null) {
            i11 = R$id.sendCommentIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new FragmentReviewSendCommentBinding(linearLayout, editText, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

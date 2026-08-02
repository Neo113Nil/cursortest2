package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;

/* loaded from: classes2.dex */
public final class FragmentReviewReplyCommentBinding implements a {

    @NonNull
    public final ImageView replyCloseIv;

    @NonNull
    public final LinearLayout replyCommentLl;

    @NonNull
    public final TextView replyCommentTv;

    @NonNull
    private final LinearLayout rootView;

    private FragmentReviewReplyCommentBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.replyCloseIv = imageView;
        this.replyCommentLl = linearLayout2;
        this.replyCommentTv = textView;
    }

    @NonNull
    public static FragmentReviewReplyCommentBinding bind(@NonNull View view) {
        int i11 = R$id.replyCloseIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.replyCommentTv;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new FragmentReviewReplyCommentBinding(linearLayout, imageView, linearLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

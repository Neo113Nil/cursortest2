package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;

/* loaded from: classes2.dex */
public final class ItemReviewCommentInputBinding implements a {

    @NonNull
    public final FragmentReviewReplyCommentBinding replyCommentLl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FragmentReviewSendCommentBinding sendCommentLl;

    private ItemReviewCommentInputBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentReviewReplyCommentBinding fragmentReviewReplyCommentBinding, @NonNull FragmentReviewSendCommentBinding fragmentReviewSendCommentBinding) {
        this.rootView = linearLayout;
        this.replyCommentLl = fragmentReviewReplyCommentBinding;
        this.sendCommentLl = fragmentReviewSendCommentBinding;
    }

    @NonNull
    public static ItemReviewCommentInputBinding bind(@NonNull View view) {
        int i11 = R$id.replyCommentLl;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            FragmentReviewReplyCommentBinding bind = FragmentReviewReplyCommentBinding.bind(d11);
            int i12 = R$id.sendCommentLl;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new ItemReviewCommentInputBinding((LinearLayout) view, bind, FragmentReviewSendCommentBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemReviewCommentInputBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_review_comment_input, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

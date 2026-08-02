package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;

/* loaded from: classes2.dex */
public final class ItemSingleReviewCommentErrorBinding implements a {

    @NonNull
    public final TextView commentErrorRetry;

    @NonNull
    private final LinearLayout rootView;

    private ItemSingleReviewCommentErrorBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.commentErrorRetry = textView;
    }

    @NonNull
    public static ItemSingleReviewCommentErrorBinding bind(@NonNull View view) {
        int i11 = R$id.commentErrorRetry;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new ItemSingleReviewCommentErrorBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemSingleReviewCommentErrorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_single_review_comment_error, viewGroup, false);
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

package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MViewReplyMessageBlockBinding implements a {

    @NonNull
    public final View replyDividerV;

    @NonNull
    public final ProductMediaView replyMediaV;

    @NonNull
    public final TextAtomV2View replySubtitleTv;

    @NonNull
    public final TextAtomV2View replyTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private MViewReplyMessageBlockBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ProductMediaView productMediaView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.replyDividerV = view;
        this.replyMediaV = productMediaView;
        this.replySubtitleTv = textAtomV2View;
        this.replyTitleTv = textAtomV2View2;
    }

    @NonNull
    public static MViewReplyMessageBlockBinding bind(@NonNull View view) {
        int i11 = R$id.replyDividerV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.replyMediaV;
            ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
            if (productMediaView != null) {
                i11 = R$id.replySubtitleTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.replyTitleTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new MViewReplyMessageBlockBinding((ConstraintLayout) view, d11, productMediaView, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewReplyMessageBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_reply_message_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

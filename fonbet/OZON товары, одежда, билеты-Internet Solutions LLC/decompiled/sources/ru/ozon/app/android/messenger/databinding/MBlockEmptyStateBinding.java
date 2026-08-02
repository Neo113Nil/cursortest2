package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MBlockEmptyStateBinding implements a {

    @NonNull
    public final FrameLayout blockEmptyStateFl;

    @NonNull
    public final LinearLayout blockEmptyStateLl;

    @NonNull
    public final LargeButtonView emptyStateBtn;

    @NonNull
    public final TextAtomView emptyStateDescriptionTv;

    @NonNull
    public final ImageView emptyStateIv;

    @NonNull
    public final TextAtomView emptyStateTitleTv;

    @NonNull
    public final MChatListHeaderTextBinding headerView;

    @NonNull
    private final FrameLayout rootView;

    private MBlockEmptyStateBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView2, @NonNull MChatListHeaderTextBinding mChatListHeaderTextBinding) {
        this.rootView = frameLayout;
        this.blockEmptyStateFl = frameLayout2;
        this.blockEmptyStateLl = linearLayout;
        this.emptyStateBtn = largeButtonView;
        this.emptyStateDescriptionTv = textAtomView;
        this.emptyStateIv = imageView;
        this.emptyStateTitleTv = textAtomView2;
        this.headerView = mChatListHeaderTextBinding;
    }

    @NonNull
    public static MBlockEmptyStateBinding bind(@NonNull View view) {
        View d11;
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.blockEmptyStateLl;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.emptyStateBtn;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.emptyStateDescriptionTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.emptyStateIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.emptyStateTitleTv;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.headerView), view)) != null) {
                            return new MBlockEmptyStateBinding(frameLayout, frameLayout, linearLayout, largeButtonView, textAtomView, imageView, textAtomView2, MChatListHeaderTextBinding.bind(d11));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockEmptyStateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_empty_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

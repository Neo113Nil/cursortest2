package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import ru.ozon.android.messenger.blocks.common.SquircleConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MViewChatHeaderBinding implements a {

    @NonNull
    public final ImageView backIv;

    @NonNull
    public final ComposeView chatAvatarView;

    @NonNull
    public final SquircleConstraintLayout chatHeaderRootCl;

    @NonNull
    public final LinearLayout chatIconsLayout;

    @NonNull
    public final TextAtomV2View chatTitleTv;

    @NonNull
    public final View headerActionClickableView;

    @NonNull
    public final ImageView headerButtonIv;

    @NonNull
    public final LinearLayout headerSubtitleContainerLl;

    @NonNull
    private final SquircleConstraintLayout rootView;

    private MViewChatHeaderBinding(@NonNull SquircleConstraintLayout squircleConstraintLayout, @NonNull ImageView imageView, @NonNull ComposeView composeView, @NonNull SquircleConstraintLayout squircleConstraintLayout2, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2) {
        this.rootView = squircleConstraintLayout;
        this.backIv = imageView;
        this.chatAvatarView = composeView;
        this.chatHeaderRootCl = squircleConstraintLayout2;
        this.chatIconsLayout = linearLayout;
        this.chatTitleTv = textAtomV2View;
        this.headerActionClickableView = view;
        this.headerButtonIv = imageView2;
        this.headerSubtitleContainerLl = linearLayout2;
    }

    @NonNull
    public static MViewChatHeaderBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.backIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.chatAvatarView;
            ComposeView composeView = (ComposeView) C2548q.d(i11, view);
            if (composeView != null) {
                SquircleConstraintLayout squircleConstraintLayout = (SquircleConstraintLayout) view;
                i11 = R$id.chatIconsLayout;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.chatTitleTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.headerActionClickableView), view)) != null) {
                        i11 = R$id.headerButtonIv;
                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                        if (imageView2 != null) {
                            i11 = R$id.headerSubtitleContainerLl;
                            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout2 != null) {
                                return new MViewChatHeaderBinding(squircleConstraintLayout, imageView, composeView, squircleConstraintLayout, linearLayout, textAtomV2View, d11, imageView2, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewChatHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_chat_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public SquircleConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

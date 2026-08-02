package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockChatGroupComposableBinding implements a {

    @NonNull
    public final ComposeView chatGroupsCv;

    @NonNull
    private final View rootView;

    private MBlockChatGroupComposableBinding(@NonNull View view, @NonNull ComposeView composeView) {
        this.rootView = view;
        this.chatGroupsCv = composeView;
    }

    @NonNull
    public static MBlockChatGroupComposableBinding bind(@NonNull View view) {
        int i11 = R$id.chatGroupsCv;
        ComposeView composeView = (ComposeView) C2548q.d(i11, view);
        if (composeView != null) {
            return new MBlockChatGroupComposableBinding(view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockChatGroupComposableBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_block_chat_group_composable, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

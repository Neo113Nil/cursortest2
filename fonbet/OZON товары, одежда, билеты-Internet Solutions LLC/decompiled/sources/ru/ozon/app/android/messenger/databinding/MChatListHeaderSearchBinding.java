package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MChatListHeaderSearchBinding implements a {

    @NonNull
    public final ComposeView chatListHeaderRoot;

    @NonNull
    private final ComposeView rootView;

    private MChatListHeaderSearchBinding(@NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.rootView = composeView;
        this.chatListHeaderRoot = composeView2;
    }

    @NonNull
    public static MChatListHeaderSearchBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new MChatListHeaderSearchBinding(composeView, composeView);
    }

    @NonNull
    public static MChatListHeaderSearchBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_chat_list_header_search, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ComposeView getRoot() {
        return this.rootView;
    }
}

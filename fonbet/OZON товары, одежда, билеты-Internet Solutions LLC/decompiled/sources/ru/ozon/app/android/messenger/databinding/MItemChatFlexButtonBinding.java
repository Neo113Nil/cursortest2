package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.blocks.buttons.presentation.flex.ChatButtonFlexLayout;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MItemChatFlexButtonBinding implements a {

    @NonNull
    public final ChatButtonFlexLayout chatButtonTL;

    @NonNull
    private final ChatButtonFlexLayout rootView;

    private MItemChatFlexButtonBinding(@NonNull ChatButtonFlexLayout chatButtonFlexLayout, @NonNull ChatButtonFlexLayout chatButtonFlexLayout2) {
        this.rootView = chatButtonFlexLayout;
        this.chatButtonTL = chatButtonFlexLayout2;
    }

    @NonNull
    public static MItemChatFlexButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ChatButtonFlexLayout chatButtonFlexLayout = (ChatButtonFlexLayout) view;
        return new MItemChatFlexButtonBinding(chatButtonFlexLayout, chatButtonFlexLayout);
    }

    @NonNull
    public static MItemChatFlexButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_item_chat_flex_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ChatButtonFlexLayout getRoot() {
        return this.rootView;
    }
}

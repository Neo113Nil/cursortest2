package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.blocks.buttons.presentation.fixed.ChatButtonFixedLayout;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MItemChatFixedButtonBinding implements a {

    @NonNull
    public final ChatButtonFixedLayout chatButtonOL;

    @NonNull
    private final ChatButtonFixedLayout rootView;

    private MItemChatFixedButtonBinding(@NonNull ChatButtonFixedLayout chatButtonFixedLayout, @NonNull ChatButtonFixedLayout chatButtonFixedLayout2) {
        this.rootView = chatButtonFixedLayout;
        this.chatButtonOL = chatButtonFixedLayout2;
    }

    @NonNull
    public static MItemChatFixedButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ChatButtonFixedLayout chatButtonFixedLayout = (ChatButtonFixedLayout) view;
        return new MItemChatFixedButtonBinding(chatButtonFixedLayout, chatButtonFixedLayout);
    }

    @NonNull
    public static MItemChatFixedButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_item_chat_fixed_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ChatButtonFixedLayout getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentMessengerBinding implements a {

    @NonNull
    public final FrameLayout fragmentChatContainer;

    @NonNull
    private final FrameLayout rootView;

    private MFragmentMessengerBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.fragmentChatContainer = frameLayout2;
    }

    @NonNull
    public static MFragmentMessengerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new MFragmentMessengerBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static MFragmentMessengerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_messenger, viewGroup, false);
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

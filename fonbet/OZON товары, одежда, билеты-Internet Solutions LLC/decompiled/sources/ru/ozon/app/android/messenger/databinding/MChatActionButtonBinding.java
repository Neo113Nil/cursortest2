package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class MChatActionButtonBinding implements a {

    @NonNull
    public final IconButtonV3View actionButton;

    @NonNull
    private final IconButtonV3View rootView;

    private MChatActionButtonBinding(@NonNull IconButtonV3View iconButtonV3View, @NonNull IconButtonV3View iconButtonV3View2) {
        this.rootView = iconButtonV3View;
        this.actionButton = iconButtonV3View2;
    }

    @NonNull
    public static MChatActionButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IconButtonV3View iconButtonV3View = (IconButtonV3View) view;
        return new MChatActionButtonBinding(iconButtonV3View, iconButtonV3View);
    }

    @NonNull
    public static MChatActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_chat_action_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public IconButtonV3View getRoot() {
        return this.rootView;
    }
}

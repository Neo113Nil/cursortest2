package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFloatButtonBinding implements a {

    @NonNull
    public final ComposeView floatButtonRoot;

    @NonNull
    private final ComposeView rootView;

    private MFloatButtonBinding(@NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.rootView = composeView;
        this.floatButtonRoot = composeView2;
    }

    @NonNull
    public static MFloatButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new MFloatButtonBinding(composeView, composeView);
    }

    @NonNull
    public static MFloatButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_float_button, viewGroup, false);
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

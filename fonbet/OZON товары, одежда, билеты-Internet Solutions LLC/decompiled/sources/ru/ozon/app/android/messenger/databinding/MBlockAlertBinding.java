package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;

/* loaded from: classes12.dex */
public final class MBlockAlertBinding implements a {

    @NonNull
    public final DisclaimerView disclaimer;

    @NonNull
    private final DisclaimerView rootView;

    private MBlockAlertBinding(@NonNull DisclaimerView disclaimerView, @NonNull DisclaimerView disclaimerView2) {
        this.rootView = disclaimerView;
        this.disclaimer = disclaimerView2;
    }

    @NonNull
    public static MBlockAlertBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DisclaimerView disclaimerView = (DisclaimerView) view;
        return new MBlockAlertBinding(disclaimerView, disclaimerView);
    }

    @NonNull
    public static MBlockAlertBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_alert, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public DisclaimerView getRoot() {
        return this.rootView;
    }
}

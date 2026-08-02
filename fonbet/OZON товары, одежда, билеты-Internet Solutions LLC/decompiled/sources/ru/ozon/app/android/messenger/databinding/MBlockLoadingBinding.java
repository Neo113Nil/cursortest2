package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockLoadingBinding implements a {

    @NonNull
    private final ProgressBar rootView;

    private MBlockLoadingBinding(@NonNull ProgressBar progressBar) {
        this.rootView = progressBar;
    }

    @NonNull
    public static MBlockLoadingBinding bind(@NonNull View view) {
        if (view != null) {
            return new MBlockLoadingBinding((ProgressBar) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static MBlockLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_loading, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ProgressBar getRoot() {
        return this.rootView;
    }
}

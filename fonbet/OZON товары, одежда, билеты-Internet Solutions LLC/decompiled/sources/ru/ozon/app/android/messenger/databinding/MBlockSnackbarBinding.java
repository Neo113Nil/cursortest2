package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.blocks.snackbar.view.SnackbarContainer;
import ru.ozon.android.messenger.blocks.snackbar.view.SnackbarView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockSnackbarBinding implements a {

    @NonNull
    private final SnackbarContainer rootView;

    @NonNull
    public final SnackbarView snackbar;

    @NonNull
    public final SnackbarContainer snackbarContainer;

    private MBlockSnackbarBinding(@NonNull SnackbarContainer snackbarContainer, @NonNull SnackbarView snackbarView, @NonNull SnackbarContainer snackbarContainer2) {
        this.rootView = snackbarContainer;
        this.snackbar = snackbarView;
        this.snackbarContainer = snackbarContainer2;
    }

    @NonNull
    public static MBlockSnackbarBinding bind(@NonNull View view) {
        int i11 = R$id.snackbar;
        SnackbarView snackbarView = (SnackbarView) C2548q.d(i11, view);
        if (snackbarView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        SnackbarContainer snackbarContainer = (SnackbarContainer) view;
        return new MBlockSnackbarBinding(snackbarContainer, snackbarView, snackbarContainer);
    }

    @NonNull
    public static MBlockSnackbarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_snackbar, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public SnackbarContainer getConstraintLayout() {
        return this.rootView;
    }
}

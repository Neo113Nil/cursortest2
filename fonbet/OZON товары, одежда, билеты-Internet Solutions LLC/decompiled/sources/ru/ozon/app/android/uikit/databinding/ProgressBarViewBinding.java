package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.view.progress.OzProgressBar;

/* loaded from: classes2.dex */
public final class ProgressBarViewBinding implements a {

    @NonNull
    public final OzProgressBar progressBarView;

    @NonNull
    private final View rootView;

    private ProgressBarViewBinding(@NonNull View view, @NonNull OzProgressBar ozProgressBar) {
        this.rootView = view;
        this.progressBarView = ozProgressBar;
    }

    @NonNull
    public static ProgressBarViewBinding bind(@NonNull View view) {
        int i11 = R$id.progressBarView;
        OzProgressBar ozProgressBar = (OzProgressBar) C2548q.d(i11, view);
        if (ozProgressBar != null) {
            return new ProgressBarViewBinding(view, ozProgressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.session.R$id;

/* loaded from: classes2.dex */
public final class LogoMobileBinding implements a {

    @NonNull
    public final AppCompatImageView imageViewLogo;

    @NonNull
    private final FrameLayout rootView;

    private LogoMobileBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = frameLayout;
        this.imageViewLogo = appCompatImageView;
    }

    @NonNull
    public static LogoMobileBinding bind(@NonNull View view) {
        int i11 = R$id.imageViewLogo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            return new LogoMobileBinding((FrameLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

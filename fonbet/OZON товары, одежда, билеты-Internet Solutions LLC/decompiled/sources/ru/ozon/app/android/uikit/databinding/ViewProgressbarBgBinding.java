package ru.ozon.app.android.uikit.databinding;

import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ViewProgressbarBgBinding implements a {

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    private final FrameLayout rootView;

    private ViewProgressbarBgBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.layoutBackgroundProgressBar = frameLayout2;
    }

    @NonNull
    public static ViewProgressbarBgBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ViewProgressbarBgBinding(frameLayout, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

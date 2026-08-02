package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes12.dex */
public final class MViewProgressbarBgBinding implements a {

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    public final MaterialProgressBar progressBar;

    @NonNull
    private final FrameLayout rootView;

    private MViewProgressbarBgBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull MaterialProgressBar materialProgressBar) {
        this.rootView = frameLayout;
        this.layoutBackgroundProgressBar = frameLayout2;
        this.progressBar = materialProgressBar;
    }

    @NonNull
    public static MViewProgressbarBgBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.progressBar;
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) C2548q.d(i11, view);
        if (materialProgressBar != null) {
            return new MViewProgressbarBgBinding(frameLayout, frameLayout, materialProgressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

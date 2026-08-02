package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinDotsProgressViewBinding implements a {

    @NonNull
    public final LottieAnimationView lottie;

    @NonNull
    private final FrameLayout rootView;

    private FinDotsProgressViewBinding(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView) {
        this.rootView = frameLayout;
        this.lottie = lottieAnimationView;
    }

    @NonNull
    public static FinDotsProgressViewBinding bind(@NonNull View view) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(R.id.lottie, view);
        if (lottieAnimationView != null) {
            return new FinDotsProgressViewBinding((FrameLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.lottie)));
    }

    @NonNull
    public static FinDotsProgressViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinDotsProgressViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_dots_progress_view, viewGroup, false);
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

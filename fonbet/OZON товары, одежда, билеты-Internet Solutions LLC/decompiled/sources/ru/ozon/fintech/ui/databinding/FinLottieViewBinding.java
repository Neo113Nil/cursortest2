package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinLottieViewBinding implements a {

    @NonNull
    public final LottieAnimationView lottie;

    @NonNull
    private final View rootView;

    private FinLottieViewBinding(@NonNull View view, @NonNull LottieAnimationView lottieAnimationView) {
        this.rootView = view;
        this.lottie = lottieAnimationView;
    }

    @NonNull
    public static FinLottieViewBinding bind(@NonNull View view) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(R.id.lottie, view);
        if (lottieAnimationView != null) {
            return new FinLottieViewBinding(view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.lottie)));
    }

    @NonNull
    public static FinLottieViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_lottie_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

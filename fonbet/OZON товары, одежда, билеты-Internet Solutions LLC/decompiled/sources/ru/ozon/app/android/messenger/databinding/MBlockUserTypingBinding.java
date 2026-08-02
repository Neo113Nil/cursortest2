package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockUserTypingBinding implements a {

    @NonNull
    private final LottieAnimationView rootView;

    private MBlockUserTypingBinding(@NonNull LottieAnimationView lottieAnimationView) {
        this.rootView = lottieAnimationView;
    }

    @NonNull
    public static MBlockUserTypingBinding bind(@NonNull View view) {
        if (view != null) {
            return new MBlockUserTypingBinding((LottieAnimationView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static MBlockUserTypingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_user_typing, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LottieAnimationView getRoot() {
        return this.rootView;
    }
}

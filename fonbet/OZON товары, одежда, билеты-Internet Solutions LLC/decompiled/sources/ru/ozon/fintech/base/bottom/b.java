package ru.ozon.fintech.base.bottom;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import y7.C10856g;

/* loaded from: classes3.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseBottomSheetBehaviour f94991a;

    b(BaseBottomSheetBehaviour baseBottomSheetBehaviour) {
        this.f94991a = baseBottomSheetBehaviour;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        C10856g c10856g;
        C10856g c10856g2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseBottomSheetBehaviour baseBottomSheetBehaviour = this.f94991a;
        c10856g = baseBottomSheetBehaviour.f94960i;
        if (c10856g != null) {
            c10856g2 = baseBottomSheetBehaviour.f94960i;
            c10856g2.C(floatValue);
        }
    }
}

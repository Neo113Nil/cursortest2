package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.r;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes12.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ r.f b;

    public t(r.f fVar) {
        this.b = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.n = valueAnimator.getAnimatedFraction();
    }
}

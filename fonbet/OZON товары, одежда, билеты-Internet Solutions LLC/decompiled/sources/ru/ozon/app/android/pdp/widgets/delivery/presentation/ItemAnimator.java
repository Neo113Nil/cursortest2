package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/ItemAnimator;", "Landroidx/recyclerview/widget/h;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemAnimator extends h {
    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.C
    public boolean animateAdd(@NotNull final RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final View view = holder.itemView;
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.pdp.widgets.delivery.presentation.ItemAnimator$animateAdd$1$listener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.dispatchAddFinished(holder);
                animation.removeAllListeners();
            }
        };
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setStartDelay(200L).setListener(animatorListenerAdapter).start();
        return false;
    }
}

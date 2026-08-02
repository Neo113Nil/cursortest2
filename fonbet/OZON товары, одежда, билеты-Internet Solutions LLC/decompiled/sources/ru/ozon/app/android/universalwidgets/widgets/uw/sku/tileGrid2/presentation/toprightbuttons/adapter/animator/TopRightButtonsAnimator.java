package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\n\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/animator/TopRightButtonsAnimator;", "Landroidx/recyclerview/widget/h;", "<init>", "()V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "animateAdd", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$C;)V", "animateRemove", "clearAnimatedValues", "(Landroid/view/View;)V", "Landroid/view/ViewPropertyAnimator;", "cancelPreviousAnimation", "(Landroid/view/View;)Landroid/view/ViewPropertyAnimator;", "", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "", "favBtnHeight", "F", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsAnimator extends h {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float favBtnHeight = TileGrid2Constants.INSTANCE.getTopRightBtnsFavoriteHeight();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/animator/TopRightButtonsAnimator$Companion;", "", "<init>", "()V", "ANIM_DURATION", "", "ALPHA_INVISIBLE", "", "ALPHA_VISIBLE", "Y_DEFAULT", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ViewPropertyAnimator cancelPreviousAnimation(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        ViewPropertyAnimator listener = animate.setListener(null);
        Intrinsics.checkNotNullExpressionValue(listener, "with(...)");
        return listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAnimatedValues(View view) {
        view.animate().setListener(null);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.C
    public boolean animateAdd(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.f(view);
        cancelPreviousAnimation(view);
        animateAdd(view, holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.C
    public boolean animateRemove(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.f(view);
        cancelPreviousAnimation(view);
        animateRemove(view, holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.l
    public void endAnimation(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        clearAnimatedValues(itemView);
        super.endAnimation(holder);
    }

    private final void animateAdd(final View view, final RecyclerView.C c11) {
        view.setAlpha(0.0f);
        view.setTranslationY(-this.favBtnHeight);
        view.animate().setDuration(300L).translationY(0.0f).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.animator.TopRightButtonsAnimator$animateAdd$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.clearAnimatedValues(view);
                TopRightButtonsAnimator.this.dispatchAddFinished(c11);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.clearAnimatedValues(view);
                TopRightButtonsAnimator.this.dispatchAddFinished(c11);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.dispatchAddStarting(c11);
            }
        }).start();
    }

    private final void animateRemove(final View view, final RecyclerView.C c11) {
        view.animate().setDuration(300L).translationY(-this.favBtnHeight).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.animator.TopRightButtonsAnimator$animateRemove$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.clearAnimatedValues(view);
                TopRightButtonsAnimator.this.dispatchRemoveFinished(c11);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.clearAnimatedValues(view);
                TopRightButtonsAnimator.this.dispatchRemoveFinished(c11);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TopRightButtonsAnimator.this.dispatchRemoveStarting(c11);
            }
        }).start();
    }
}

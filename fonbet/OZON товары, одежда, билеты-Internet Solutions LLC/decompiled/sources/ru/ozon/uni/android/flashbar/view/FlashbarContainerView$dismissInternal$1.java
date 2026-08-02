package ru.ozon.uni.android.flashbar.view;

import B90.g0;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import ru.ozon.uni.android.flashbar.animation.FlashbarAnimator;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"ru/ozon/uni/android/flashbar/view/FlashbarContainerView$dismissInternal$1", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator$InternalAnimListener;", "onStart", "", "onUpdate", "progress", "", "onStop", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarContainerView$dismissInternal$1 implements FlashbarAnimator.InternalAnimListener {
    final /* synthetic */ DismissEvent $event;
    final /* synthetic */ FlashbarContainerView this$0;

    FlashbarContainerView$dismissInternal$1(FlashbarContainerView flashbarContainerView, DismissEvent dismissEvent) {
        this.this$0 = flashbarContainerView;
        this.$event = dismissEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$0(FlashbarContainerView flashbarContainerView) {
        ViewParent parent = flashbarContainerView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(flashbarContainerView);
        }
    }

    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
    public void onStart() {
        OnDismissListener onDismissListener;
        this.this$0.isBarDismissing = true;
        onDismissListener = this.this$0.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismissing(false);
        }
    }

    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
    public void onStop() {
        OnDismissListener onDismissListener;
        this.this$0.isBarDismissing = false;
        this.this$0.isBarShown = false;
        onDismissListener = this.this$0.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismissed(this.$event);
        }
        FlashbarContainerView flashbarContainerView = this.this$0;
        flashbarContainerView.post(new g0(flashbarContainerView, 1));
    }

    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
    public void onUpdate(float progress) {
        OnDismissListener onDismissListener;
        onDismissListener = this.this$0.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismissProgress(progress);
        }
    }
}

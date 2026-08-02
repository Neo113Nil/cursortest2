package ru.ozon.uni.android.flashbar.view;

import B90.f0;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.animation.FlashbarAnimationBuilder;
import ru.ozon.uni.android.flashbar.animation.FlashbarAnimator;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.callback.OnShowListener;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener;

@InterfaceC3999a
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010)\u001a\u00020\tH\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\tH\u0000¢\u0006\u0004\b*\u0010(J\u0017\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00105\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b3\u00104J\u0019\u00109\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\tH\u0000¢\u0006\u0004\b;\u0010\u000fJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010\b\u001a\u00020=H\u0000¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\u00020\r*\u00020 H\u0002¢\u0006\u0004\bA\u0010#J\u000f\u0010B\u001a\u00020\rH\u0002¢\u0006\u0004\bB\u0010\u0015R\"\u0010C\u001a\u00020\u001b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010RR\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010SR\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010S¨\u0006U"}, d2 = {"Lru/ozon/uni/android/flashbar/view/FlashbarContainerView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener$DismissCallbacks;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "isSwiping", "", "onSwipe", "(Z)V", "Landroid/view/View;", "view", "onDismiss", "(Landroid/view/View;)V", "onDetachedFromWindow", "()V", "Lru/ozon/uni/android/flashbar/view/FlashbarView;", "flashbarView", "attach$uni_release", "(Lru/ozon/uni/android/flashbar/view/FlashbarView;)V", "attach", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "flashbar", "addParent$uni_release", "(Lru/ozon/uni/android/flashbar/main/Flashbar;)V", "addParent", "Landroid/view/ViewGroup;", "viewGroup", "show$uni_release", "(Landroid/view/ViewGroup;)V", "show", "dismiss$uni_release", "dismiss", "isBarShowing$uni_release", "()Z", "isBarShowing", "isBarShown$uni_release", "isBarShown", "", "duration", "setDuration$uni_release", "(J)V", "setDuration", "Lru/ozon/uni/android/flashbar/callback/OnShowListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBarShowListener$uni_release", "(Lru/ozon/uni/android/flashbar/callback/OnShowListener;)V", "setBarShowListener", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "setBarDismissListener$uni_release", "(Lru/ozon/uni/android/flashbar/callback/OnDismissListener;)V", "setBarDismissListener", "enable", "enableSwipeToDismiss$uni_release", "enableSwipeToDismiss", "Lru/ozon/uni/android/flashbar/view/DismissEvent;", "dismissInternal$uni_release", "(Lru/ozon/uni/android/flashbar/view/DismissEvent;)V", "dismissInternal", "enterAnim", "handleDismiss", "parentFlashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "getParentFlashbar$uni_release", "()Lru/ozon/uni/android/flashbar/main/Flashbar;", "setParentFlashbar$uni_release", "Lru/ozon/uni/android/flashbar/view/FlashbarView;", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder;", "enterAnimBuilder", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder;", "exitAnimBuilder", "onDismissListener", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "Ljava/lang/Runnable;", "dismissRunnable", "Ljava/lang/Runnable;", "J", "Z", "isBarDismissing", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarContainerView extends FrameLayout implements SwipeToDismissTouchListener.DismissCallbacks {

    @NotNull
    private final Runnable dismissRunnable;
    private long duration;

    @NotNull
    private FlashbarAnimationBuilder enterAnimBuilder;

    @NotNull
    private FlashbarAnimationBuilder exitAnimBuilder;
    private FlashbarView flashbarView;
    private boolean isBarDismissing;
    private boolean isBarShowing;
    private boolean isBarShown;
    private OnDismissListener onDismissListener;
    public Flashbar parentFlashbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashbarContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FlashbarAnimator.Companion companion = FlashbarAnimator.INSTANCE;
        this.enterAnimBuilder = companion.with().enter$uni_release();
        this.exitAnimBuilder = companion.with().exit$uni_release();
        this.dismissRunnable = new f0(this, 1);
        this.duration = 10000L;
    }

    public static final /* synthetic */ OnShowListener access$getOnShowListener$p(FlashbarContainerView flashbarContainerView) {
        flashbarContainerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissRunnable$lambda$0(FlashbarContainerView flashbarContainerView) {
        flashbarContainerView.dismissInternal$uni_release(DismissEvent.TIMEOUT);
    }

    private final void enterAnim(final ViewGroup viewGroup) {
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.uni.android.flashbar.view.FlashbarContainerView$enterAnim$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FlashbarAnimationBuilder flashbarAnimationBuilder;
                FlashbarView flashbarView;
                if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                    return;
                }
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                flashbarAnimationBuilder = this.enterAnimBuilder;
                flashbarView = this.flashbarView;
                if (flashbarView == null) {
                    Intrinsics.n("flashbarView");
                    throw null;
                }
                FlashbarAnimator build$uni_release = flashbarAnimationBuilder.withView$uni_release(flashbarView).build$uni_release();
                final FlashbarContainerView flashbarContainerView = this;
                build$uni_release.start$uni_release(new FlashbarAnimator.InternalAnimListener() { // from class: ru.ozon.uni.android.flashbar.view.FlashbarContainerView$enterAnim$1$1
                    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
                    public void onStart() {
                        FlashbarContainerView.this.isBarShowing = true;
                        FlashbarContainerView.access$getOnShowListener$p(FlashbarContainerView.this);
                    }

                    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
                    public void onStop() {
                        FlashbarContainerView.this.isBarShowing = false;
                        FlashbarContainerView.this.isBarShown = true;
                        FlashbarContainerView.access$getOnShowListener$p(FlashbarContainerView.this);
                    }

                    @Override // ru.ozon.uni.android.flashbar.animation.FlashbarAnimator.InternalAnimListener
                    public void onUpdate(float progress) {
                        FlashbarContainerView.access$getOnShowListener$p(FlashbarContainerView.this);
                    }
                });
                this.handleDismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismiss() {
        if (this.duration != -1) {
            removeCallbacks(this.dismissRunnable);
            postDelayed(this.dismissRunnable, this.duration);
            this.duration = -1L;
        }
    }

    public final void addParent$uni_release(@NotNull Flashbar flashbar) {
        Intrinsics.checkNotNullParameter(flashbar, "flashbar");
        setParentFlashbar$uni_release(flashbar);
    }

    public final void attach$uni_release(@NotNull FlashbarView flashbarView) {
        Intrinsics.checkNotNullParameter(flashbarView, "flashbarView");
        this.flashbarView = flashbarView;
    }

    public final void dismiss$uni_release() {
        dismissInternal$uni_release(DismissEvent.MANUAL);
    }

    public final void dismissInternal$uni_release(@NotNull DismissEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isBarDismissing || this.isBarShowing || !this.isBarShown) {
            return;
        }
        if (this.duration > 0) {
            handleDismiss();
            return;
        }
        FlashbarAnimationBuilder flashbarAnimationBuilder = this.exitAnimBuilder;
        FlashbarView flashbarView = this.flashbarView;
        if (flashbarView != null) {
            flashbarAnimationBuilder.withView$uni_release(flashbarView).build$uni_release().start$uni_release(new FlashbarContainerView$dismissInternal$1(this, event));
        } else {
            Intrinsics.n("flashbarView");
            throw null;
        }
    }

    public final void enableSwipeToDismiss$uni_release(boolean enable) {
        FlashbarView flashbarView = this.flashbarView;
        if (flashbarView != null) {
            flashbarView.enableSwipeToDismiss$uni_release(enable, this);
        } else {
            Intrinsics.n("flashbarView");
            throw null;
        }
    }

    @NotNull
    public final Flashbar getParentFlashbar$uni_release() {
        Flashbar flashbar = this.parentFlashbar;
        if (flashbar != null) {
            return flashbar;
        }
        Intrinsics.n("parentFlashbar");
        throw null;
    }

    /* renamed from: isBarShowing$uni_release, reason: from getter */
    public final boolean getIsBarShowing() {
        return this.isBarShowing;
    }

    /* renamed from: isBarShown$uni_release, reason: from getter */
    public final boolean getIsBarShown() {
        return this.isBarShown;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.isBarShowing = false;
        this.isBarShown = false;
        this.isBarDismissing = false;
        super.onDetachedFromWindow();
    }

    @Override // ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener.DismissCallbacks
    public void onDismiss(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.isBarShown = false;
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismissed(DismissEvent.SWIPE);
        }
        removeCallbacks(this.dismissRunnable);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            Rect rect = new Rect();
            FlashbarView flashbarView = this.flashbarView;
            if (flashbarView == null) {
                Intrinsics.n("flashbarView");
                throw null;
            }
            flashbarView.getHitRect(rect);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener.DismissCallbacks
    public void onSwipe(boolean isSwiping) {
        OnDismissListener onDismissListener;
        this.isBarDismissing = isSwiping;
        if (!isSwiping || (onDismissListener = this.onDismissListener) == null) {
            return;
        }
        onDismissListener.onDismissing(true);
    }

    public final void setBarDismissListener$uni_release(OnDismissListener listener) {
        this.onDismissListener = listener;
    }

    public final void setBarShowListener$uni_release(OnShowListener listener) {
    }

    public final void setDuration$uni_release(long duration) {
        this.duration = duration;
        handleDismiss();
    }

    public final void setParentFlashbar$uni_release(@NotNull Flashbar flashbar) {
        Intrinsics.checkNotNullParameter(flashbar, "<set-?>");
        this.parentFlashbar = flashbar;
    }

    public final void show$uni_release(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (this.isBarShowing || this.isBarShown) {
            return;
        }
        if (getParent() == null) {
            viewGroup.addView(this);
        }
        enterAnim(viewGroup);
    }
}

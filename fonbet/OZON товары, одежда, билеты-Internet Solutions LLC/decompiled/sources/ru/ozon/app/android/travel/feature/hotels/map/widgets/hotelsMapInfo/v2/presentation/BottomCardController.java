package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Y;
import c3.C5739a;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.BottomCardController;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/BottomCardController;", "", "Landroid/view/ViewGroup;", "bottomContainer", "containerView", "Lkotlin/Function1;", "Landroid/view/View;", "", "animatorUpdateListener", "<init>", "(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onAnimationEnd", "performSlideUp", "(Lkotlin/jvm/functions/Function0;)V", "performSlideDown", "()V", "cancelAnimation", "(Landroid/view/View;)V", "", "targetY", "", "duration", "Landroid/animation/TimeInterpolator;", "interpolator", "animateChildTo", "(Landroid/view/View;FJLandroid/animation/TimeInterpolator;Lkotlin/jvm/functions/Function0;)V", "slideUp", "slideDown", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewPropertyAnimator;", "currentAnimator", "Landroid/view/ViewPropertyAnimator;", "Lc3/c;", "linearOutSlowInInterpolator", "Lc3/c;", "Lc3/a;", "fastOutLinearInInterpolator", "Lc3/a;", "", "getBottomContainerTop", "()I", "bottomContainerTop", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomCardController {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<View, Unit> animatorUpdateListener;

    @NotNull
    private final ViewGroup bottomContainer;

    @NotNull
    private final ViewGroup containerView;
    private ViewPropertyAnimator currentAnimator;

    @NotNull
    private final C5739a fastOutLinearInInterpolator;

    @NotNull
    private final C5741c linearOutSlowInInterpolator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/BottomCardController$Companion;", "", "<init>", "()V", "ENTER_ANIMATION_DURATION", "", "EXIT_ANIMATION_DURATION", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomCardController(@NotNull ViewGroup bottomContainer, @NotNull ViewGroup containerView, @NotNull Function1<? super View, Unit> animatorUpdateListener) {
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(animatorUpdateListener, "animatorUpdateListener");
        this.bottomContainer = bottomContainer;
        this.containerView = containerView;
        this.animatorUpdateListener = animatorUpdateListener;
        this.linearOutSlowInInterpolator = new C5741c();
        this.fastOutLinearInInterpolator = new C5739a();
    }

    private final void animateChildTo(final View view, float f7, long j11, TimeInterpolator timeInterpolator, final Function0<Unit> function0) {
        this.currentAnimator = view.animate().translationY(f7).setInterpolator(timeInterpolator).setDuration(j11).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: GR.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomCardController.animateChildTo$lambda$5(BottomCardController.this, view, valueAnimator);
            }
        }).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.BottomCardController$animateChildTo$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                BottomCardController.this.currentAnimator = null;
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
    }

    static /* synthetic */ void animateChildTo$default(BottomCardController bottomCardController, View view, float f7, long j11, TimeInterpolator timeInterpolator, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        bottomCardController.animateChildTo(view, f7, j11, timeInterpolator, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateChildTo$lambda$5(BottomCardController bottomCardController, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bottomCardController.animatorUpdateListener.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performSlideDown() {
        ViewGroup viewGroup = this.bottomContainer;
        float height = viewGroup.getHeight();
        cancelAnimation(viewGroup);
        animateChildTo$default(this, viewGroup, height, 175L, this.fastOutLinearInInterpolator, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performSlideUp(Function0<Unit> onAnimationEnd) {
        ViewGroup viewGroup = this.bottomContainer;
        cancelAnimation(viewGroup);
        animateChildTo(viewGroup, 0.0f, 225L, this.linearOutSlowInInterpolator, onAnimationEnd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void slideUp$default(BottomCardController bottomCardController, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        bottomCardController.slideUp(function0);
    }

    public final void cancelAnimation() {
        cancelAnimation(this.bottomContainer);
    }

    public final int getBottomContainerTop() {
        return this.bottomContainer.getTop();
    }

    public final void slideDown() {
        if (this.containerView.isLaidOut()) {
            performSlideDown();
            return;
        }
        ViewGroup viewGroup = this.containerView;
        int i11 = Y.f42258g;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.BottomCardController$slideDown$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    BottomCardController.this.performSlideDown();
                }
            });
        } else {
            performSlideDown();
        }
    }

    public final void slideUp(final Function0<Unit> onAnimationEnd) {
        if (this.containerView.isLaidOut()) {
            performSlideUp(onAnimationEnd);
        } else {
            this.containerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.BottomCardController$slideUp$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    BottomCardController.this.performSlideUp(onAnimationEnd);
                }
            });
        }
    }

    private final void cancelAnimation(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.currentAnimator = null;
    }
}

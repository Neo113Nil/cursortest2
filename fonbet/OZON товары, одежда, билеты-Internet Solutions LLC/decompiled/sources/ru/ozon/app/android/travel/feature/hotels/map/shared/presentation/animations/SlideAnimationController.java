package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations;

import Sc.o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import c3.C5739a;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000f\u001a\u00020\t*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0019\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController;", "", "Landroid/view/ViewGroup;", "container", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/ShowDirection;", "showDirection", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/ShowDirection;)V", "Lkotlin/Function0;", "", "onEndAnimation", "show", "(Lkotlin/jvm/functions/Function0;)V", "hide", "Landroid/view/View;", "cancelAnimation", "(Landroid/view/View;)V", "", "targetY", "", "duration", "Landroid/animation/TimeInterpolator;", "interpolator", "startAction", "endAction", "animateChildTo", "(Landroid/view/View;FJLandroid/animation/TimeInterpolator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isVisible", "toggleView", "(ZLkotlin/jvm/functions/Function0;)V", "()V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/ShowDirection;", "Landroid/view/ViewPropertyAnimator;", "currentAnimator", "Landroid/view/ViewPropertyAnimator;", "Lc3/c;", "linearOutSlowInInterpolator", "Lc3/c;", "Lc3/a;", "fastOutLinearInInterpolator", "Lc3/a;", "dpf8", "F", "getTargetShowY", "()F", "targetShowY", "getTargetHideY", "targetHideY", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SlideAnimationController {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewGroup container;
    private ViewPropertyAnimator currentAnimator;
    private final float dpf8;

    @NotNull
    private final C5739a fastOutLinearInInterpolator;

    @NotNull
    private final C5741c linearOutSlowInInterpolator;

    @NotNull
    private final ShowDirection showDirection;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController$Companion;", "", "<init>", "()V", "ENTER_ANIMATION_DURATION", "", "EXIT_ANIMATION_DURATION", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowDirection.values().length];
            try {
                iArr[ShowDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowDirection.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SlideAnimationController(@NotNull ViewGroup container, @NotNull ShowDirection showDirection) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(showDirection, "showDirection");
        this.container = container;
        this.showDirection = showDirection;
        this.linearOutSlowInInterpolator = new C5741c();
        this.fastOutLinearInInterpolator = new C5739a();
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dpf8 = ResourceExtKt.toPxF(8, context);
        container.setVisibility(8);
    }

    private final void animateChildTo(View view, float f7, long j11, TimeInterpolator timeInterpolator, final Function0<Unit> function0, final Function0<Unit> function02) {
        this.currentAnimator = view.animate().translationY(f7).setInterpolator(timeInterpolator).setDuration(j11).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations.SlideAnimationController$animateChildTo$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
                this.currentAnimator = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void animateChildTo$default(SlideAnimationController slideAnimationController, View view, float f7, long j11, TimeInterpolator timeInterpolator, Function0 function0, Function0 function02, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        if ((i11 & 16) != 0) {
            function02 = null;
        }
        slideAnimationController.animateChildTo(view, f7, j11, timeInterpolator, function0, function02);
    }

    private final float getTargetHideY() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.showDirection.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return (-this.container.getHeight()) - this.dpf8;
            }
            throw new o();
        }
        int height = this.container.getHeight();
        ViewGroup.LayoutParams layoutParams = this.container.getLayoutParams();
        return height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.bottomMargin : 0);
    }

    private final float getTargetShowY() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.showDirection.ordinal()];
        if (i11 == 1) {
            return 0.0f;
        }
        if (i11 == 2) {
            return this.dpf8;
        }
        throw new o();
    }

    private final void hide(Function0<Unit> onEndAnimation) {
        ViewGroup viewGroup = this.container;
        cancelAnimation(viewGroup);
        animateChildTo$default(this, viewGroup, getTargetHideY(), 175L, this.fastOutLinearInInterpolator, null, new SlideAnimationController$hide$1$1(viewGroup, onEndAnimation), 8, null);
    }

    private final void show(Function0<Unit> onEndAnimation) {
        ViewGroup viewGroup = this.container;
        cancelAnimation(viewGroup);
        animateChildTo(viewGroup, getTargetShowY(), 225L, this.linearOutSlowInInterpolator, new SlideAnimationController$show$1$1(viewGroup), new SlideAnimationController$show$1$2(onEndAnimation));
    }

    public final void cancelAnimation() {
        cancelAnimation(this.container);
    }

    public final void toggleView(boolean isVisible, Function0<Unit> onEndAnimation) {
        if (isVisible) {
            show(onEndAnimation);
        } else {
            hide(onEndAnimation);
        }
    }

    private final void cancelAnimation(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        view.clearAnimation();
        this.currentAnimator = null;
    }
}

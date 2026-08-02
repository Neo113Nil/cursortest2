package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Xc.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;
import xe.M;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ]2\u00020\u0001:\u0002]^B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010=R#\u0010D\u001a\n @*\u0004\u0018\u00010?0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010CR#\u0010G\u001a\n @*\u0004\u0018\u00010?0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\bF\u0010CR#\u0010L\u001a\n @*\u0004\u0018\u00010H0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010KR#\u0010O\u001a\n @*\u0004\u0018\u00010H0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010(\u001a\u0004\bN\u0010KR#\u0010R\u001a\n @*\u0004\u0018\u00010H0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010KR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010(\u001a\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lxe/M;", "coroutineScope", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lxe/M;)V", "", "prepare", "()V", "clear", "", "lifetimeSeconds", "Lkotlin/Function0;", "onVisible", "show", "(JLkotlin/jvm/functions/Function0;)V", "pause", "resume", "disappear", "durationAnim", "animateDisappear", "(J)V", "action", "doAfterAnimation", "(Lkotlin/jvm/functions/Function0;)V", "timeSeconds", "onAnimationStart", "animateAppear", "animateReset", "", "toRight", "animateSwipeDismiss", "(Z)V", "setupTouchListener", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lxe/M;", "", "swipeThreshold$delegate", "LSc/j;", "getSwipeThreshold", "()I", "swipeThreshold", "containerHeight$delegate", "getContainerHeight", "containerHeight", "", "initialX", "F", "initialTouchX", "isDragging", "Z", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "accInterpolator$delegate", "getAccInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "accInterpolator", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener$delegate", "getSlideListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "slideUp$delegate", "getSlideUp", "()Landroid/animation/ValueAnimator;", "slideUp", "slideDown$delegate", "getSlideDown", "slideDown", "Landroid/animation/ObjectAnimator;", "showUpAnimator$delegate", "getShowUpAnimator", "()Landroid/animation/ObjectAnimator;", "showUpAnimator", "showDownAnimator$delegate", "getShowDownAnimator", "showDownAnimator", "alphaMinAnimator$delegate", "getAlphaMinAnimator", "alphaMinAnimator", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/TimerHelper;", "timer$delegate", "getTimer", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/TimerHelper;", DynamicElementDTO.TIMER, "afterAnimation", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate$WidgetState;", "state", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate$WidgetState;", "Companion", "WidgetState", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2AnimationDelegate {

    /* renamed from: accInterpolator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j accInterpolator;
    private Function0<Unit> afterAnimation;

    /* renamed from: alphaMinAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j alphaMinAnimator;

    /* renamed from: containerHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerHeight;

    @NotNull
    private final M coroutineScope;
    private float initialTouchX;
    private float initialX;
    private boolean isDragging;

    @NotNull
    private final ConstraintLayout root;

    /* renamed from: showDownAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j showDownAnimator;

    /* renamed from: showUpAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j showUpAnimator;

    /* renamed from: slideDown$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideDown;

    /* renamed from: slideListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideListener;

    /* renamed from: slideUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideUp;

    @NotNull
    private WidgetState state;

    /* renamed from: swipeThreshold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j swipeThreshold;

    /* renamed from: timer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j timer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate$Companion;", "", "<init>", "()V", "DEFAULT_ANIMATION_DURATION", "", "HIDE_FAST_DURATION", "CLICK_MOVEMENT_THRESHOLD", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[WidgetState.values().length];
            try {
                iArr[WidgetState.ANIMATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetState.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetState.INTERACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetState.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate$WidgetState;", "", "<init>", "(Ljava/lang/String;I)V", "INVISIBLE", "VISIBLE", "ANIMATING", "INTERACTION", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WidgetState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ WidgetState[] $VALUES;
        public static final WidgetState INVISIBLE = new WidgetState("INVISIBLE", 0);
        public static final WidgetState VISIBLE = new WidgetState("VISIBLE", 1);
        public static final WidgetState ANIMATING = new WidgetState("ANIMATING", 2);
        public static final WidgetState INTERACTION = new WidgetState("INTERACTION", 3);

        private static final /* synthetic */ WidgetState[] $values() {
            return new WidgetState[]{INVISIBLE, VISIBLE, ANIMATING, INTERACTION};
        }

        static {
            WidgetState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private WidgetState(String str, int i11) {
        }

        public static WidgetState valueOf(String str) {
            return (WidgetState) Enum.valueOf(WidgetState.class, str);
        }

        public static WidgetState[] values() {
            return (WidgetState[]) $VALUES.clone();
        }
    }

    public DeliveryWidgetV2AnimationDelegate(@NotNull ConstraintLayout root, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.root = root;
        this.coroutineScope = coroutineScope;
        this.swipeThreshold = k.b(new DeliveryWidgetV2AnimationDelegate$swipeThreshold$2(this));
        this.containerHeight = k.b(DeliveryWidgetV2AnimationDelegate$containerHeight$2.INSTANCE);
        this.accInterpolator = k.b(DeliveryWidgetV2AnimationDelegate$accInterpolator$2.INSTANCE);
        this.slideListener = k.b(new DeliveryWidgetV2AnimationDelegate$slideListener$2(this));
        this.slideUp = k.b(new DeliveryWidgetV2AnimationDelegate$slideUp$2(this));
        this.slideDown = k.b(new DeliveryWidgetV2AnimationDelegate$slideDown$2(this));
        this.showUpAnimator = k.b(new DeliveryWidgetV2AnimationDelegate$showUpAnimator$2(this));
        this.showDownAnimator = k.b(new DeliveryWidgetV2AnimationDelegate$showDownAnimator$2(this));
        this.alphaMinAnimator = k.b(new DeliveryWidgetV2AnimationDelegate$alphaMinAnimator$2(this));
        this.timer = k.b(new DeliveryWidgetV2AnimationDelegate$timer$2(this));
        this.state = WidgetState.INVISIBLE;
        setupTouchListener();
    }

    private final void animateAppear(final long timeSeconds, final Function0<Unit> onAnimationStart) {
        this.state = WidgetState.ANIMATING;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(getAccInterpolator());
        animatorSet.playTogether(getSlideUp(), getShowUpAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$animateAppear$lambda$4$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                ConstraintLayout constraintLayout;
                constraintLayout = DeliveryWidgetV2AnimationDelegate.this.root;
                constraintLayout.setVisibility(0);
                Function0 function0 = onAnimationStart;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$animateAppear$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ConstraintLayout constraintLayout;
                TimerHelper timer;
                Function0 function0;
                constraintLayout = DeliveryWidgetV2AnimationDelegate.this.root;
                constraintLayout.clearAnimation();
                DeliveryWidgetV2AnimationDelegate.this.state = DeliveryWidgetV2AnimationDelegate.WidgetState.VISIBLE;
                timer = DeliveryWidgetV2AnimationDelegate.this.getTimer();
                timer.start(timeSeconds, new DeliveryWidgetV2AnimationDelegate$animateAppear$1$2$1(DeliveryWidgetV2AnimationDelegate.this));
                function0 = DeliveryWidgetV2AnimationDelegate.this.afterAnimation;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    public static /* synthetic */ void animateDisappear$default(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 400;
        }
        deliveryWidgetV2AnimationDelegate.animateDisappear(j11);
    }

    private final void animateReset() {
        this.state = WidgetState.ANIMATING;
        this.root.setOnTouchListener(null);
        AnimatorSet animatorSet = new AnimatorSet();
        ConstraintLayout constraintLayout = this.root;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.TRANSLATION_X, constraintLayout.getTranslationX(), this.initialX);
        ConstraintLayout constraintLayout2 = this.root;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(constraintLayout2, (Property<ConstraintLayout, Float>) View.ALPHA, constraintLayout2.getAlpha(), 1.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(getAccInterpolator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$animateReset$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                TimerHelper timer;
                Function0 function0;
                DeliveryWidgetV2AnimationDelegate.this.state = DeliveryWidgetV2AnimationDelegate.WidgetState.VISIBLE;
                DeliveryWidgetV2AnimationDelegate.this.setupTouchListener();
                timer = DeliveryWidgetV2AnimationDelegate.this.getTimer();
                timer.resume();
                function0 = DeliveryWidgetV2AnimationDelegate.this.afterAnimation;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void animateSwipeDismiss(boolean toRight) {
        getTimer().stop();
        this.state = WidgetState.ANIMATING;
        float width = this.root.getWidth();
        if (!toRight) {
            width = -width;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ConstraintLayout constraintLayout = this.root;
        animatorSet.playTogether(ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.TRANSLATION_X, constraintLayout.getTranslationX(), width), getAlphaMinAnimator());
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(getAccInterpolator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$animateSwipeDismiss$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                DeliveryWidgetV2AnimationDelegate.this.prepare();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void doAfterAnimation(Function0<Unit> action) {
        this.afterAnimation = action;
    }

    private final AccelerateDecelerateInterpolator getAccInterpolator() {
        return (AccelerateDecelerateInterpolator) this.accInterpolator.getValue();
    }

    private final ObjectAnimator getAlphaMinAnimator() {
        return (ObjectAnimator) this.alphaMinAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerHeight() {
        return ((Number) this.containerHeight.getValue()).intValue();
    }

    private final ObjectAnimator getShowDownAnimator() {
        return (ObjectAnimator) this.showDownAnimator.getValue();
    }

    private final ObjectAnimator getShowUpAnimator() {
        return (ObjectAnimator) this.showUpAnimator.getValue();
    }

    private final ValueAnimator getSlideDown() {
        return (ValueAnimator) this.slideDown.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getSlideListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.slideListener.getValue();
    }

    private final ValueAnimator getSlideUp() {
        return (ValueAnimator) this.slideUp.getValue();
    }

    private final int getSwipeThreshold() {
        return ((Number) this.swipeThreshold.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimerHelper getTimer() {
        return (TimerHelper) this.timer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupTouchListener() {
        this.root.setOnTouchListener(new cL.a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupTouchListener$lambda$9(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            deliveryWidgetV2AnimationDelegate.initialX = view.getTranslationX();
            deliveryWidgetV2AnimationDelegate.initialTouchX = motionEvent.getRawX();
            deliveryWidgetV2AnimationDelegate.isDragging = false;
            return true;
        }
        if (action == 1) {
            if (deliveryWidgetV2AnimationDelegate.isDragging) {
                deliveryWidgetV2AnimationDelegate.isDragging = false;
                if (Math.abs(view.getTranslationX() - deliveryWidgetV2AnimationDelegate.initialX) > deliveryWidgetV2AnimationDelegate.getSwipeThreshold()) {
                    deliveryWidgetV2AnimationDelegate.animateSwipeDismiss(view.getTranslationX() > 0.0f);
                } else {
                    deliveryWidgetV2AnimationDelegate.animateReset();
                }
            } else {
                view.performClick();
            }
            return deliveryWidgetV2AnimationDelegate.isDragging;
        }
        if (action != 2) {
            return false;
        }
        float rawX = motionEvent.getRawX() - deliveryWidgetV2AnimationDelegate.initialTouchX;
        if (!deliveryWidgetV2AnimationDelegate.isDragging && Math.abs(rawX) > 10.0f) {
            deliveryWidgetV2AnimationDelegate.getTimer().pause();
            deliveryWidgetV2AnimationDelegate.isDragging = true;
            deliveryWidgetV2AnimationDelegate.state = WidgetState.INTERACTION;
        }
        if (deliveryWidgetV2AnimationDelegate.isDragging) {
            view.setTranslationX(deliveryWidgetV2AnimationDelegate.initialX + rawX);
            view.setAlpha(1 - h.d(Math.abs(rawX) / (view.getWidth() / 2), 0.0f, 1.0f));
        }
        return true;
    }

    public final void animateDisappear(long durationAnim) {
        if (this.state == WidgetState.INVISIBLE) {
            return;
        }
        this.state = WidgetState.ANIMATING;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(durationAnim);
        animatorSet.setInterpolator(getAccInterpolator());
        animatorSet.playTogether(getSlideDown(), getShowDownAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$animateDisappear$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                DeliveryWidgetV2AnimationDelegate.this.disappear();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    public final void clear() {
        getTimer().stop();
        this.afterAnimation = null;
    }

    public final void disappear() {
        this.root.clearAnimation();
        this.root.setVisibility(8);
        this.state = WidgetState.INVISIBLE;
        Function0<Unit> function0 = this.afterAnimation;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void pause() {
        getTimer().pause();
    }

    public final void prepare() {
        this.state = WidgetState.INVISIBLE;
        this.root.setVisibility(8);
        this.root.setTranslationX(0.0f);
        this.root.setTranslationY(0.0f);
        this.root.setAlpha(1.0f);
        animateDisappear(0L);
    }

    public final void resume() {
        getTimer().resume();
    }

    public final void show(long lifetimeSeconds, @NotNull Function0<Unit> onVisible) {
        Intrinsics.checkNotNullParameter(onVisible, "onVisible");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i11 == 1) {
            doAfterAnimation(new DeliveryWidgetV2AnimationDelegate$show$1(onVisible));
            return;
        }
        if (i11 == 2) {
            onVisible.invoke();
            getTimer().start(lifetimeSeconds, new DeliveryWidgetV2AnimationDelegate$show$2(this));
        } else if (i11 == 3) {
            doAfterAnimation(new DeliveryWidgetV2AnimationDelegate$show$3(onVisible, this, lifetimeSeconds));
            animateReset();
        } else {
            if (i11 != 4) {
                throw new o();
            }
            animateAppear(lifetimeSeconds, new DeliveryWidgetV2AnimationDelegate$show$4(onVisible));
        }
    }
}

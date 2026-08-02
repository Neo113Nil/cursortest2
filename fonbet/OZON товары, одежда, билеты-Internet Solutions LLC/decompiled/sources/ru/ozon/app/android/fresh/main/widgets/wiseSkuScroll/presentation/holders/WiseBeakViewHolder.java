package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import Lw.C3599b;
import Lw.ViewOnClickListenerC3600c;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseSkuScrollBeakBinding;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder$animationStateListener$2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001A\b\u0000\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001UB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J!\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00060\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR#\u0010L\u001a\n )*\u0004\u0018\u00010F0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010KR2\u0010#\u001a \u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\f\u0012\n\u0018\u00010Nj\u0004\u0018\u0001`O\u0012\u0006\u0012\u0004\u0018\u00010\r0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010PR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$BeakVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseSkuScrollBeakBinding;", "binding", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemWiseSkuScrollBeakBinding;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "animateBeak", "(F)V", "resetBeak", "()V", "clearState", "onViewOutOfOverlapBounds", "onViewInOverlapBounds", "onViewInVisibleBounds", "item", "Ll20/d;", "widgetInfo", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$BeakVO;Ll20/d;)V", "displacementPx", "", "isMovingToStart", "onPull", "(FZ)V", "onRelease", "onFastScrolledToEnd", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseSkuScrollBeakBinding;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "recyclerViewReference", "Ljava/lang/ref/WeakReference;", "wasReleased", "Ljava/lang/Boolean;", "wasThresholdPassed", "Z", "isResetting", "additionalSizeModifier", "F", "", "originalWidth$delegate", "LSc/j;", "getOriginalWidth", "()I", "originalWidth", "originalHeight$delegate", "getOriginalHeight", "originalHeight", "Landroid/view/animation/DecelerateInterpolator;", "defaultInterpolator$delegate", "getDefaultInterpolator", "()Landroid/view/animation/DecelerateInterpolator;", "defaultInterpolator", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder$animationStateListener$2$1", "animationStateListener$delegate", "getAnimationStateListener", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder$animationStateListener$2$1;", "animationStateListener", "Landroid/animation/ValueAnimator;", "animationUpdateListener", "Lkotlin/jvm/functions/Function1;", "introductionAnimation$delegate", "getIntroductionAnimation", "()Landroid/animation/ValueAnimator;", "introductionAnimation", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "Lkotlin/jvm/functions/Function2;", "getRecyclerView", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "isMaxSize", "()Z", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseBeakViewHolder extends BindableViewHolder<WiseSkuScrollVO.BeakVO> implements PullableHorizontalRecyclerView.HorizontalRecyclerViewPullListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private float additionalSizeModifier;

    /* renamed from: animationStateListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationStateListener;

    @NotNull
    private final Function1<ValueAnimator, Unit> animationUpdateListener;

    @NotNull
    private final ItemWiseSkuScrollBeakBinding binding;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultInterpolator;

    /* renamed from: introductionAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j introductionAnimation;
    private boolean isResetting;

    @NotNull
    private final Function2<AtomAction, t, Unit> onPull;

    /* renamed from: originalHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j originalHeight;

    /* renamed from: originalWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j originalWidth;

    @NotNull
    private final WeakReference<PullableHorizontalRecyclerView> recyclerViewReference;
    private Boolean wasReleased;
    private boolean wasThresholdPassed;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder$Companion;", "", "<init>", "()V", "MAX_MANUAL_DISPLACEMENT_PX", "", "DISPLACEMENT_ADJUSTMENT_DELIMITER", "MAX_ADDITIONAL_SIZE_MODIFIER", "", "ADDITIONAL_SIZE_THRESHOLD", "LOCATOR", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WiseBeakViewHolder(@NotNull ItemWiseSkuScrollBeakBinding binding, @NotNull PullableHorizontalRecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0, tokenizedAnalytics, actionHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.recyclerViewReference = new WeakReference<>(recyclerView);
        this.originalWidth = LazyUtilsKt.unsafeLazy(new WiseBeakViewHolder$originalWidth$2(this));
        this.originalHeight = LazyUtilsKt.unsafeLazy(new WiseBeakViewHolder$originalHeight$2(this));
        this.defaultInterpolator = LazyUtilsKt.unsafeLazy(WiseBeakViewHolder$defaultInterpolator$2.INSTANCE);
        this.animationStateListener = LazyUtilsKt.unsafeLazy(new WiseBeakViewHolder$animationStateListener$2(this));
        this.animationUpdateListener = new WiseBeakViewHolder$animationUpdateListener$1(this);
        this.introductionAnimation = LazyUtilsKt.unsafeLazy(new WiseBeakViewHolder$introductionAnimation$2(this));
        this.onPull = new WiseBeakViewHolder$onPull$1(actionHandler, tokenizedAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateBeak(float value) {
        int originalWidth = (int) (getOriginalWidth() * value);
        ImageView beak = this.binding.beak;
        Intrinsics.checkNotNullExpressionValue(beak, "beak");
        ViewGroup.LayoutParams layoutParams = beak.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = getOriginalWidth() + originalWidth;
        layoutParams.height = (int) ((getOriginalHeight() * value) + getOriginalHeight());
        beak.setLayoutParams(layoutParams);
        PullableHorizontalRecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.scrollBy(originalWidth, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(FrameLayout frameLayout, WiseBeakViewHolder wiseBeakViewHolder, WiseSkuScrollVO.BeakVO beakVO, View view) {
        Intrinsics.f(frameLayout);
        VibrationExtKt.vibrateSingle(frameLayout);
        wiseBeakViewHolder.getOnClick().invoke(beakVO.getAtomAction(), beakVO.getTokenizedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearState() {
        this.additionalSizeModifier = 0.0f;
        this.wasReleased = null;
        this.wasThresholdPassed = false;
        this.isResetting = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WiseBeakViewHolder$animationStateListener$2.AnonymousClass1 getAnimationStateListener() {
        return (WiseBeakViewHolder$animationStateListener$2.AnonymousClass1) this.animationStateListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DecelerateInterpolator getDefaultInterpolator() {
        return (DecelerateInterpolator) this.defaultInterpolator.getValue();
    }

    private final ValueAnimator getIntroductionAnimation() {
        return (ValueAnimator) this.introductionAnimation.getValue();
    }

    private final int getOriginalHeight() {
        return ((Number) this.originalHeight.getValue()).intValue();
    }

    private final int getOriginalWidth() {
        return ((Number) this.originalWidth.getValue()).intValue();
    }

    private final PullableHorizontalRecyclerView getRecyclerView() {
        return this.recyclerViewReference.get();
    }

    private final boolean isMaxSize() {
        return this.additionalSizeModifier >= 0.66f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRelease$lambda$4$lambda$3(Function1 function1, ValueAnimator p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetBeak() {
        ImageView imageView = this.binding.beak;
        Intrinsics.f(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = getOriginalWidth();
        layoutParams.height = getOriginalHeight();
        imageView.setLayoutParams(layoutParams);
        imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder$resetBeak$lambda$8$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                WiseBeakViewHolder.this.clearState();
            }
        });
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView.HorizontalRecyclerViewPullListener
    public void onFastScrolledToEnd() {
        this.isResetting = true;
        getIntroductionAnimation().start();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView.HorizontalRecyclerViewPullListener
    public void onPull(float displacementPx, boolean isMovingToStart) {
        float d11 = h.d(displacementPx, 5.0f, 250.0f);
        if (this.isResetting) {
            return;
        }
        if (this.additionalSizeModifier != 0.0f || (!isMovingToStart && d11 <= 100.0f)) {
            if (isMaxSize()) {
                this.isResetting = true;
                Function2<AtomAction, t, Unit> function2 = this.onPull;
                WiseSkuScrollVO.BeakVO item = getItem();
                AtomAction atomAction = item != null ? item.getAtomAction() : null;
                WiseSkuScrollVO.BeakVO item2 = getItem();
                function2.invoke(atomAction, item2 != null ? item2.getPullEvent() : null);
                return;
            }
            float f7 = this.additionalSizeModifier;
            if (isMovingToStart) {
                d11 = -d11;
            }
            float d12 = h.d((d11 / CounterView.COUNTER_MAX_DEFAULT) + f7, 0.0f, 0.66f);
            this.additionalSizeModifier = d12;
            animateBeak(d12);
            if (this.additionalSizeModifier < 0.33f) {
                this.wasThresholdPassed = false;
            } else {
                if (this.wasThresholdPassed) {
                    return;
                }
                this.wasThresholdPassed = true;
                FrameLayout constraintLayout = this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                VibrationExtKt.vibrateSingle(constraintLayout);
            }
        }
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView.HorizontalRecyclerViewPullListener
    public void onRelease() {
        int i11 = 0;
        if (this.isResetting) {
            return;
        }
        if (isMaxSize()) {
            resetBeak();
            return;
        }
        if (this.wasThresholdPassed) {
            Function2<AtomAction, t, Unit> function2 = this.onPull;
            WiseSkuScrollVO.BeakVO item = getItem();
            AtomAction atomAction = item != null ? item.getAtomAction() : null;
            WiseSkuScrollVO.BeakVO item2 = getItem();
            function2.invoke(atomAction, item2 != null ? item2.getPullEvent() : null);
            return;
        }
        this.isResetting = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.additionalSizeModifier, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(getDefaultInterpolator());
        ofFloat.addUpdateListener(new C3599b(this.animationUpdateListener, i11));
        ofFloat.addListener(getAnimationStateListener());
        ofFloat.start();
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        PullableHorizontalRecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setListener(this);
        }
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        PullableHorizontalRecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setCanIntercept(true);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        PullableHorizontalRecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setListener(null);
            recyclerView.setCanIntercept(false);
            if (isMaxSize()) {
                clearState();
            } else {
                resetBeak();
            }
        }
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder
    public void bind(@NotNull WiseSkuScrollVO.BeakVO item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((WiseBeakViewHolder) item, widgetInfo);
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        constraintLayout.setOnClickListener(new ViewOnClickListenerC3600c(constraintLayout, this, item, 0));
        constraintLayout.setContentDescription("wiseSkuScrollBeak");
    }
}

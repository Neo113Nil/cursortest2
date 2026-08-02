package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import WZ.t;
import Wc.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.orderTracking.data.AnimationParamsDTO;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4OrderBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.SubtitleVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.TitleVO;
import ru.ozon.app.android.ordertracking.v4.presentation.util.OrderTrackingV4OutlineProvider;
import ru.ozon.app.android.ordertracking.v4.presentation.util.OrderTrackingViewManager;
import ru.ozon.app.android.ordertracking.v4.presentation.util.PercentageConstraintLayout;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeAnimationManager;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingMarqueeView;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u001aJ%\u0010/\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b/\u00100R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4OrderViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ordertracking/v4/presentation/rv/HolderWithMarqueeView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function0;", "afterTimerCallback", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "LAe/h;", "", "lastItemSizeFlow", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;LAe/h;)V", "Lorg/joda/time/DateTime;", "timeLeft", "bindTimer", "(Lorg/joda/time/DateTime;)V", "initializeAnimationManager", "()V", "cleanupAnimationManager", "startTimer", "stopTimer", "", "onTimerTick", "(J)V", "onTimerComplete", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "startMarqueeAnimationIfNeeded", "pauseMarqueeAnimation", "resumeMarqueeAnimation", "stopMarqueeWithFadeAnimation", "restartMarqueeAnimationAfterRefresh", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "item", "", "isBarcodeVisible", "isFullWidth", "bind", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;ZZ)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "LAe/h;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "Lru/ozon/app/android/utils/timer/TimerManager;", "timerManager", "Lru/ozon/app/android/utils/timer/TimerManager;", "Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager;", "viewManager", "Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager;", "isTimerRunning", "Z", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeAnimationManager;", "animationManager", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeAnimationManager;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4OrderViewHolder extends j implements HolderWithMarqueeView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function0<Unit> afterTimerCallback;
    private MarqueeAnimationManager animationManager;

    @NotNull
    private final ItemOrderTrackingV4OrderBinding binding;
    private boolean isTimerRunning;
    private OrderVO item;

    @NotNull
    private final InterfaceC2395h<Integer> lastItemSizeFlow;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final TimerManager timerManager;

    @NotNull
    private final OrderTrackingViewManager viewManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4OrderViewHolder$2", f = "OrderTrackingV4OrderViewHolder.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4OrderViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return OrderTrackingV4OrderViewHolder.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h interfaceC2395h = OrderTrackingV4OrderViewHolder.this.lastItemSizeFlow;
                final OrderTrackingV4OrderViewHolder orderTrackingV4OrderViewHolder = OrderTrackingV4OrderViewHolder.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4OrderViewHolder.2.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Number) obj2).intValue(), (d<? super Unit>) dVar);
                    }

                    public final Object emit(int i12, d<? super Unit> dVar) {
                        OrderTrackingV4OrderViewHolder.this.binding.orderCard.setRightButtonOffset(i12);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (interfaceC2395h.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTrackingV4OrderViewHolder(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> afterTimerCallback, @NotNull ItemOrderTrackingV4OrderBinding binding, @NotNull ComposerReferences references, @NotNull StartupArgsService startupArgsService, @NotNull InterfaceC2395h<Integer> lastItemSizeFlow) {
        super(r0);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(afterTimerCallback, "afterTimerCallback");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        Intrinsics.checkNotNullParameter(lastItemSizeFlow, "lastItemSizeFlow");
        PercentageConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.actionHandler = actionHandler;
        this.afterTimerCallback = afterTimerCallback;
        this.binding = binding;
        this.references = references;
        this.startupArgsService = startupArgsService;
        this.lastItemSizeFlow = lastItemSizeFlow;
        this.timerManager = new OneSecondTimer.Builder().onTick(new OrderTrackingV4OrderViewHolder$timerManager$1(this)).onComplete(new OrderTrackingV4OrderViewHolder$timerManager$2(this)).build();
        this.viewManager = new OrderTrackingViewManager(actionHandler, binding);
        PercentageConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOnClickListener(new CG.a(this, 3));
        constraintLayout2.setOutlineProvider(new OrderTrackingV4OutlineProvider());
        constraintLayout2.setClipToOutline(true);
        C10727i.c(K.a(this), null, null, new AnonymousClass2(null), 3);
    }

    private final void bindTimer(DateTime timeLeft) {
        if (timeLeft != null) {
            if (this.isTimerRunning) {
                return;
            }
            startTimer();
        } else {
            stopTimer();
            AppCompatTextView timerTv = this.binding.timerTv;
            Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
            ViewExtKt.gone(timerTv);
        }
    }

    private final void cleanupAnimationManager() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            marqueeAnimationManager.stopAnimation();
            this.animationManager = null;
        }
    }

    private final void initializeAnimationManager() {
        Long restartDelay;
        Long startDelay;
        if (this.animationManager == null) {
            OrderVO orderVO = this.item;
            SubtitleVO subtitle = orderVO != null ? orderVO.getSubtitle() : null;
            SubtitleVO.MarqueeAddressVO marqueeAddressVO = subtitle instanceof SubtitleVO.MarqueeAddressVO ? (SubtitleVO.MarqueeAddressVO) subtitle : null;
            AnimationParamsDTO animationParams = marqueeAddressVO != null ? marqueeAddressVO.getAnimationParams() : null;
            long longValue = (animationParams == null || (startDelay = animationParams.getStartDelay()) == null) ? 1500L : startDelay.longValue();
            long longValue2 = (animationParams == null || (restartDelay = animationParams.getRestartDelay()) == null) ? 20000L : restartDelay.longValue();
            D a11 = K.a(this);
            OrderTrackingMarqueeView marqueeAddressView = this.binding.marqueeAddressView;
            Intrinsics.checkNotNullExpressionValue(marqueeAddressView, "marqueeAddressView");
            this.animationManager = new MarqueeAnimationManager(a11, marqueeAddressView, longValue, longValue, longValue2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OrderTrackingV4OrderViewHolder orderTrackingV4OrderViewHolder, View view) {
        AtomAction action;
        OrderVO orderVO = orderTrackingV4OrderViewHolder.item;
        if (orderVO == null || (action = orderVO.getAction()) == null) {
            return;
        }
        orderTrackingV4OrderViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerComplete() {
        AppCompatTextView timerTv = this.binding.timerTv;
        Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
        ViewExtKt.hide(timerTv);
        this.afterTimerCallback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerTick(long timeLeft) {
        AppCompatTextView timerTv = this.binding.timerTv;
        Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
        TextViewExtKt.setTextOrGone(timerTv, TimerUtilsKt.formatTime(new TimerTick(timeLeft)));
        if (this.startupArgsService.getArgValue("STATIC_TIMERS")) {
            stopTimer();
        }
    }

    private final void startTimer() {
        TitleVO title;
        DateTime timeLeft;
        OrderVO orderVO = this.item;
        if (orderVO == null || (title = orderVO.getTitle()) == null || (timeLeft = title.getTimeLeft()) == null) {
            return;
        }
        long millis = timeLeft.getMillis();
        if (millis - new DateTime().getMillis() > 0) {
            this.timerManager.startTimer(millis);
            this.isTimerRunning = true;
        }
    }

    private final void stopTimer() {
        this.timerManager.stopTimer();
        this.isTimerRunning = false;
    }

    public final void bind(@NotNull OrderVO item, boolean isBarcodeVisible, boolean isFullWidth) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding = this.binding;
        itemOrderTrackingV4OrderBinding.orderCard.setFullWidth(item.getIsFullWidth() || isFullWidth);
        itemOrderTrackingV4OrderBinding.orderCard.setBarcodeVisible(isBarcodeVisible);
        this.viewManager.bindView(item);
        bindTimer(item.getTitle().getTimeLeft());
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        cleanupAnimationManager();
        stopTimer();
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        OrderVO orderVO = this.item;
        if (orderVO != null && (tokenizedEvent = orderVO.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        startTimer();
        initializeAnimationManager();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        stopTimer();
        cleanupAnimationManager();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView
    public void pauseMarqueeAnimation() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            marqueeAnimationManager.pauseAnimation();
        }
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView
    public void restartMarqueeAnimationAfterRefresh() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            marqueeAnimationManager.restartAnimationAfterRefresh();
        }
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView
    public void resumeMarqueeAnimation() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            marqueeAnimationManager.resumeAnimation();
        }
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView
    public void startMarqueeAnimationIfNeeded() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            marqueeAnimationManager.startAnimation();
        }
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView
    public void stopMarqueeWithFadeAnimation() {
        MarqueeAnimationManager marqueeAnimationManager = this.animationManager;
        if (marqueeAnimationManager != null) {
            OrderTrackingMarqueeView marqueeAddressView = this.binding.marqueeAddressView;
            Intrinsics.checkNotNullExpressionValue(marqueeAddressView, "marqueeAddressView");
            marqueeAnimationManager.stopAnimationWithFade(marqueeAddressView);
        }
    }
}

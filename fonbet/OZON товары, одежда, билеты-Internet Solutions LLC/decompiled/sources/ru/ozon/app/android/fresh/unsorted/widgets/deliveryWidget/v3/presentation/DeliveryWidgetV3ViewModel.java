package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.fresh.unsorted.utils.timer.TimerService;
import ru.ozon.app.android.fresh.unsorted.utils.timer.TimerState;
import ru.ozon.app.android.fresh.unsorted.utils.timer.TimerTick;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.domain.DeliveryWidgetV3Repository;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0019\u001a\u00020\u000e2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R(\u0010'\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00100R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000206018\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u001e\u0010:\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/domain/DeliveryWidgetV3Repository;", "repository", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "timerService", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/domain/DeliveryWidgetV3Repository;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;)V", "", "deadlineFromState", "", "setTimerDeadlineMode", "(J)V", "restoreDurationFromService", "()V", "cancelScheduledWidgetUpdate", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "isTimerUpdate", "requestStateChange", "(Ll20/d;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "state", "scheduleUpdate", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/domain/DeliveryWidgetV3Repository;", "getRepository", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/domain/DeliveryWidgetV3Repository;", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "getTimerService", "()Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentState", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "getCurrentState", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "Lxe/B0;", "updateTimerJob", "Lxe/B0;", "Lze/h;", "_widgetUpdates", "Lze/h;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerState;", "_timerState", "timerState", "getTimerState", "widgetInfoCache", "Ll20/d;", "LAe/x0;", "_timerFinished", "LAe/x0;", "LAe/M0;", "timerFinished", "LAe/M0;", "getTimerFinished", "()LAe/M0;", "activeDeadline", "Ljava/lang/Long;", "isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease", "()Z", "isTimerModeActive", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV3ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final x0<Boolean> _timerFinished;

    @NotNull
    private final h<TimerState> _timerState;

    @NotNull
    private final h<DeliveryWidgetV3VO> _widgetUpdates;
    private Long activeDeadline;
    private DeliveryWidgetV3VO currentState;

    @NotNull
    private final DeliveryWidgetV3Repository repository;

    @NotNull
    private final M0<Boolean> timerFinished;

    @NotNull
    private final TimerService timerService;

    @NotNull
    private final InterfaceC2395h<TimerState> timerState;
    private B0 updateTimerJob;
    private d widgetInfoCache;

    @NotNull
    private final InterfaceC2395h<DeliveryWidgetV3VO> widgetUpdates;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$1", f = "DeliveryWidgetV3ViewModel.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DeliveryWidgetV3ViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                d dVar = DeliveryWidgetV3ViewModel.this.widgetInfoCache;
                if (dVar != null) {
                    DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel = DeliveryWidgetV3ViewModel.this;
                    this.label = 1;
                    if (DeliveryWidgetV3ViewModel.requestStateChange$default(deliveryWidgetV3ViewModel, dVar, false, this, 2, null) == aVar) {
                        return aVar;
                    }
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
        public final Object invoke(CartState cartState, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "tick", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerTick;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$2", f = "DeliveryWidgetV3ViewModel.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<TimerTick, kotlin.coroutines.d<? super Unit>, Object> {
        long J$0;
        long J$1;
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = DeliveryWidgetV3ViewModel.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TimerState timerState;
            long j11;
            long j12;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                TimerTick timerTick = (TimerTick) this.L$0;
                Long l11 = DeliveryWidgetV3ViewModel.this.activeDeadline;
                if (l11 == null) {
                    return Unit.f71690a;
                }
                long longValue = l11.longValue();
                Long deadlineMs = timerTick.getDeadlineMs();
                if (deadlineMs == null || deadlineMs.longValue() != longValue) {
                    return Unit.f71690a;
                }
                Long timeLeftMs = timerTick.getTimeLeftMs();
                if (timeLeftMs == null) {
                    return Unit.f71690a;
                }
                long longValue2 = timeLeftMs.longValue();
                if (DeliveryWidgetV3ViewModel.this.getTimerService().getDurationFromStart() > 0) {
                    long g10 = kotlin.ranges.h.g(longValue2, 0L, DeliveryWidgetV3ViewModel.this.getTimerService().getDurationFromStart());
                    timerState = new TimerState(new Long(g10), (g10 * 100.0f) / DeliveryWidgetV3ViewModel.this.getTimerService().getDurationFromStart());
                } else {
                    timerState = new TimerState(null, 0.0f);
                }
                h hVar = DeliveryWidgetV3ViewModel.this._timerState;
                this.J$0 = longValue;
                this.J$1 = longValue2;
                this.label = 1;
                if (hVar.n(timerState, this) == aVar) {
                    return aVar;
                }
                j11 = longValue;
                j12 = longValue2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = this.J$1;
                j11 = this.J$0;
                s.b(obj);
            }
            if (j12 <= 0 && DeliveryWidgetV3ViewModel.this.getTimerService().markDeadlineAsCompleted(new Long(j11))) {
                DeliveryWidgetV3ViewModel.this._timerFinished.setValue(Boolean.TRUE);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TimerTick timerTick, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(timerTick, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public DeliveryWidgetV3ViewModel(@NotNull DeliveryWidgetV3Repository repository, @NotNull CartService cartService, @NotNull TimerService timerService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(timerService, "timerService");
        this.repository = repository;
        this.timerService = timerService;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdates = a11;
        this.widgetUpdates = C2399j.H(a11);
        C11115c a12 = k.a(-2, 6, null);
        this._timerState = a12;
        this.timerState = C2399j.H(a12);
        x0<Boolean> a13 = O0.a(Boolean.FALSE);
        this._timerFinished = a13;
        this.timerFinished = C2399j.b(a13);
        restoreDurationFromService();
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartStateChanged$default(cartService, null, 1, null)), new AnonymousClass1(null)), androidx.lifecycle.x0.a(this));
        C2399j.C(new C2408n0(timerService.getTick(), new AnonymousClass2(null)), androidx.lifecycle.x0.a(this));
    }

    private final void cancelScheduledWidgetUpdate() {
        B0 b02 = this.updateTimerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateTimerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r7.n(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestStateChange(d dVar, boolean z11, kotlin.coroutines.d<? super Unit> dVar2) {
        DeliveryWidgetV3ViewModel$requestStateChange$1 deliveryWidgetV3ViewModel$requestStateChange$1;
        int i11;
        DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel;
        DeliveryWidgetV3VO deliveryWidgetV3VO;
        DeliveryWidgetV3VO deliveryWidgetV3VO2;
        if (dVar2 instanceof DeliveryWidgetV3ViewModel$requestStateChange$1) {
            deliveryWidgetV3ViewModel$requestStateChange$1 = (DeliveryWidgetV3ViewModel$requestStateChange$1) dVar2;
            int i12 = deliveryWidgetV3ViewModel$requestStateChange$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deliveryWidgetV3ViewModel$requestStateChange$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = deliveryWidgetV3ViewModel$requestStateChange$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deliveryWidgetV3ViewModel$requestStateChange$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    DeliveryWidgetV3ViewModel$requestStateChange$newState$1 deliveryWidgetV3ViewModel$requestStateChange$newState$1 = new DeliveryWidgetV3ViewModel$requestStateChange$newState$1(this, dVar, z11, null);
                    deliveryWidgetV3ViewModel$requestStateChange$1.L$0 = this;
                    deliveryWidgetV3ViewModel$requestStateChange$1.Z$0 = z11;
                    deliveryWidgetV3ViewModel$requestStateChange$1.label = 1;
                    obj = C10727i.f(bVar, deliveryWidgetV3ViewModel$requestStateChange$newState$1, deliveryWidgetV3ViewModel$requestStateChange$1);
                    if (obj != aVar) {
                        deliveryWidgetV3ViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                z11 = deliveryWidgetV3ViewModel$requestStateChange$1.Z$0;
                deliveryWidgetV3ViewModel = (DeliveryWidgetV3ViewModel) deliveryWidgetV3ViewModel$requestStateChange$1.L$0;
                s.b(obj);
                deliveryWidgetV3VO = (DeliveryWidgetV3VO) obj;
                if (deliveryWidgetV3VO != null || deliveryWidgetV3VO.equals(deliveryWidgetV3ViewModel.currentState)) {
                    if (z11) {
                        E0.b(deliveryWidgetV3ViewModel$requestStateChange$1.getContext(), null);
                    }
                    deliveryWidgetV3VO2 = deliveryWidgetV3ViewModel.currentState;
                    if (deliveryWidgetV3VO2 != null) {
                        deliveryWidgetV3ViewModel.scheduleUpdate(deliveryWidgetV3VO2);
                    }
                    return Unit.f71690a;
                }
                if (deliveryWidgetV3ViewModel.isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease() && !Intrinsics.d(deliveryWidgetV3VO.getTimerDeadline(), deliveryWidgetV3ViewModel.activeDeadline)) {
                    return Unit.f71690a;
                }
                deliveryWidgetV3ViewModel.currentState = deliveryWidgetV3VO;
                h<DeliveryWidgetV3VO> hVar = deliveryWidgetV3ViewModel._widgetUpdates;
                deliveryWidgetV3ViewModel$requestStateChange$1.L$0 = null;
                deliveryWidgetV3ViewModel$requestStateChange$1.label = 2;
            }
        }
        deliveryWidgetV3ViewModel$requestStateChange$1 = new DeliveryWidgetV3ViewModel$requestStateChange$1(this, dVar2);
        Object obj2 = deliveryWidgetV3ViewModel$requestStateChange$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deliveryWidgetV3ViewModel$requestStateChange$1.label;
        if (i11 != 0) {
        }
        deliveryWidgetV3VO = (DeliveryWidgetV3VO) obj2;
        if (deliveryWidgetV3VO != null) {
        }
        if (z11) {
        }
        deliveryWidgetV3VO2 = deliveryWidgetV3ViewModel.currentState;
        if (deliveryWidgetV3VO2 != null) {
        }
        return Unit.f71690a;
    }

    static /* synthetic */ Object requestStateChange$default(DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel, d dVar, boolean z11, kotlin.coroutines.d dVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return deliveryWidgetV3ViewModel.requestStateChange(dVar, z11, dVar2);
    }

    private final void restoreDurationFromService() {
        Long timeLeftMs;
        Long l11 = this.activeDeadline;
        if (l11 != null) {
            long longValue = l11.longValue();
            TimerTick value = this.timerService.getTick().getValue();
            Long deadlineMs = value.getDeadlineMs();
            if (deadlineMs == null || deadlineMs.longValue() != longValue) {
                value = null;
            }
            TimerTick timerTick = value;
            if (timerTick == null || (timeLeftMs = timerTick.getTimeLeftMs()) == null) {
                return;
            }
            if (timeLeftMs.longValue() <= 0) {
                timeLeftMs = null;
            }
            if (timeLeftMs != null) {
                long longValue2 = timeLeftMs.longValue();
                long durationFromStart = this.timerService.getDurationFromStart();
                Long valueOf = Long.valueOf(durationFromStart);
                if (durationFromStart <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    long longValue3 = valueOf.longValue();
                    C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DeliveryWidgetV3ViewModel$restoreDurationFromService$1(kotlin.ranges.h.g(longValue2, 0L, longValue3), longValue3, this, null), 3);
                }
            }
        }
    }

    private final void setTimerDeadlineMode(long deadlineFromState) {
        Long l11 = this.activeDeadline;
        if (l11 != null && l11.longValue() == deadlineFromState && this.timerService.isRunning()) {
            return;
        }
        this.activeDeadline = Long.valueOf(deadlineFromState);
        this._timerFinished.setValue(Boolean.FALSE);
        cancelScheduledWidgetUpdate();
        this.timerService.startTimer(deadlineFromState);
        restoreDurationFromService();
    }

    public final DeliveryWidgetV3VO getCurrentState() {
        return this.currentState;
    }

    @NotNull
    public final DeliveryWidgetV3Repository getRepository() {
        return this.repository;
    }

    @NotNull
    public final M0<Boolean> getTimerFinished() {
        return this.timerFinished;
    }

    @NotNull
    public final TimerService getTimerService() {
        return this.timerService;
    }

    @NotNull
    public final InterfaceC2395h<TimerState> getTimerState() {
        return this.timerState;
    }

    @NotNull
    public final InterfaceC2395h<DeliveryWidgetV3VO> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    public final boolean isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease() {
        return this.activeDeadline != null && this.timerService.isRunning();
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        cancelScheduledWidgetUpdate();
    }

    public final void scheduleUpdate(@NotNull DeliveryWidgetV3VO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentState = state;
        this.widgetInfoCache = state.getWidgetInfo();
        if (state.getTimerDeadline() != null) {
            setTimerDeadlineMode(state.getTimerDeadline().longValue());
        }
        if (isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease()) {
            cancelScheduledWidgetUpdate();
            return;
        }
        B0 b02 = this.updateTimerJob;
        if (b02 == null || !b02.isActive()) {
            cancelScheduledWidgetUpdate();
            this.updateTimerJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DeliveryWidgetV3ViewModel$scheduleUpdate$1(this, null), 3);
        }
    }
}

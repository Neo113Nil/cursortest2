package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.s;
import WZ.l;
import Wc.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.utils.timer.TimerState;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.E0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R'\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3OverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3ViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3ViewModel;Ld20/e;)V", "", "setupPaddingsDependOnKeyboard", "()V", "Landroidx/core/view/y0;", "getCurrentWindowInsets", "()Landroidx/core/view/y0;", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "attachInsetsListener", "detachInsetsListener", "subscribeToWidgetUpdates", "", "timeLeftMs", "updateTimerDisplay", "(Ljava/lang/Long;)V", "unsubscribeToWidgetUpdates", "", "isKeyboardVisible", "()Z", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3View;", "getContainerView", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3View;", "containerView", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV3OverlayViewHolder extends AbstractC6064a<DeliveryWidgetV3VO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    @NotNull
    private final DeliveryWidgetV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetV3OverlayViewHolder(@NotNull i container, @NotNull DeliveryWidgetV3ViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new DeliveryWidgetV3OverlayViewHolder$actionHandler$2(this));
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jx.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                DeliveryWidgetV3OverlayViewHolder.this.setupPaddingsDependOnKeyboard();
            }
        };
    }

    private final void attachInsetsListener() {
        ViewTreeObserver viewTreeObserver;
        View rootView = getRootView();
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.globalLayoutListener);
    }

    private final void detachInsetsListener() {
        ViewTreeObserver viewTreeObserver;
        View rootView = getRootView();
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryWidgetV3View getContainerView() {
        View view = getView();
        if (view instanceof DeliveryWidgetV3View) {
            return (DeliveryWidgetV3View) view;
        }
        return null;
    }

    private final C5353y0 getCurrentWindowInsets() {
        View rootView = getRootView();
        if (rootView != null) {
            return Y.n(rootView);
        }
        return null;
    }

    private final View getRootView() {
        Window window;
        r a11 = this.container.Q().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getTokenizedAnalytics() {
        return this.container.X();
    }

    private final boolean isKeyboardVisible() {
        C5353y0 currentWindowInsets = getCurrentWindowInsets();
        if (currentWindowInsets != null) {
            return currentWindowInsets.p(8);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setupPaddingsDependOnKeyboard() {
        final DeliveryWidgetV3View containerView;
        final C5353y0 currentWindowInsets;
        if (getBoundData() == 0 || (containerView = getContainerView()) == null) {
            return;
        }
        if (isKeyboardVisible()) {
            DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) getBoundData();
            if ((deliveryWidgetV3VO != null ? deliveryWidgetV3VO.getTimerDeadline() : null) != null) {
                if (containerView.getPaddingBottom() == containerView.getDefaultBottomPadding() && (currentWindowInsets = getCurrentWindowInsets()) != null) {
                    G.a(containerView, new Runnable() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$setupPaddingsDependOnKeyboard$$inlined$doOnPreDraw$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int measuredHeight = (currentWindowInsets.f(8).f42129d - currentWindowInsets.f(2).f42129d) - containerView.getMeasuredHeight();
                            int defaultBottomPadding = containerView.getDefaultBottomPadding();
                            if (measuredHeight < defaultBottomPadding) {
                                measuredHeight = defaultBottomPadding;
                            }
                            containerView.setBottomPadding(measuredHeight);
                        }
                    });
                    return;
                }
                return;
            }
        }
        containerView.setDefaultBottomPadding();
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeToWidgetUpdates();
        InterfaceC2395h<DeliveryWidgetV3VO> widgetUpdates = this.viewModel.getWidgetUpdates();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(widgetUpdates, lifecycle, bVar), new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1(this, null)), K.a(this));
        final InterfaceC2395h a11 = C5427n.a(this.viewModel.getTimerState(), getLifecycle(), bVar);
        C2399j.C(new C2408n0(new InterfaceC2395h<TimerState>() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2", f = "DeliveryWidgetV3OverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((TimerState) obj).getTimeLeftMs() != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super TimerState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3(this, null)), K.a(this));
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getTimerFinished(), getLifecycle(), bVar), new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4(this, null)), K.a(this));
        final InterfaceC2395h a12 = C5427n.a(this.container.M().getEventsFlow(), getLifecycle(), bVar);
        C2399j.C(new C2408n0(new InterfaceC2395h<A00.a>() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$2$2", f = "DeliveryWidgetV3OverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((A00.a) obj) instanceof a.u) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super A00.a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$6(this, null)), K.a(this));
    }

    private final void unsubscribeToWidgetUpdates() {
        E0.d(K.a(this).getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateTimerDisplay(Long timeLeftMs) {
        DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) getBoundData();
        if (deliveryWidgetV3VO == null) {
            return;
        }
        if (timeLeftMs == null) {
            DeliveryWidgetV3View containerView = getContainerView();
            if (containerView != null) {
                containerView.bind(deliveryWidgetV3VO);
                return;
            }
            return;
        }
        if (timeLeftMs.longValue() > 0) {
            String formatCountdownTime = this.viewModel.getTimerService().formatCountdownTime(timeLeftMs.longValue());
            DeliveryWidgetV3View containerView2 = getContainerView();
            if (containerView2 != null) {
                containerView2.updateTimerTime(formatCountdownTime);
                return;
            }
            return;
        }
        if (timeLeftMs.longValue() == 0) {
            String formatCountdownTime2 = this.viewModel.getTimerService().formatCountdownTime(0L);
            DeliveryWidgetV3View containerView3 = getContainerView();
            if (containerView3 != null) {
                containerView3.updateTimerTime(formatCountdownTime2);
            }
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        subscribeToWidgetUpdates();
        DeliveryWidgetV3View containerView = getContainerView();
        if (containerView != null) {
            containerView.setActionHandlers(new DeliveryWidgetV3OverlayViewHolder$onWidgetCreated$1(getTokenizedAnalytics()), new DeliveryWidgetV3OverlayViewHolder$onWidgetCreated$2(this));
        }
        attachInsetsListener();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        unsubscribeToWidgetUpdates();
        detachInsetsListener();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DeliveryWidgetV3VO item) {
        DeliveryWidgetV3VO deliveryWidgetV3VO;
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.viewModel.isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease()) {
            Long timerDeadline = item.getTimerDeadline();
            DeliveryWidgetV3VO currentState = this.viewModel.getCurrentState();
            if (!Intrinsics.d(timerDeadline, currentState != null ? currentState.getTimerDeadline() : null)) {
                return;
            }
        }
        if (item.getResetState() || this.viewModel.getCurrentState() == null) {
            deliveryWidgetV3VO = item;
        } else {
            deliveryWidgetV3VO = this.viewModel.getCurrentState();
            if (deliveryWidgetV3VO == null) {
                return;
            }
        }
        DeliveryWidgetV3View containerView = getContainerView();
        if (containerView != null) {
            containerView.bind(deliveryWidgetV3VO);
        }
        this.viewModel.scheduleUpdate(deliveryWidgetV3VO);
        item.setResetState(false);
    }
}

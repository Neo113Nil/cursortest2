package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.s;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
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
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.E0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR'\u0010)\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4OverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;Ld20/e;)V", "state", "", "scheduleFirstBind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;)V", "subscribeToWidgetUpdates", "()V", "unsubscribeToWidgetUpdates", "onWidgetCreated", "item", "bind", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "currentTokenizedEvent", "LWZ/t;", "", "isFirstBind", "Z", "latestStateForInit", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "isFirstBindPosted", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View;", "getContainerView", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View;", "containerView", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4OverlayViewHolder extends AbstractC6064a<DeliveryWidgetV4VO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;
    private t currentTokenizedEvent;
    private boolean isFirstBind;
    private boolean isFirstBindPosted;
    private DeliveryWidgetV4VO latestStateForInit;

    @NotNull
    private final DeliveryWidgetV4ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetV4OverlayViewHolder(@NotNull i container, @NotNull DeliveryWidgetV4ViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.isFirstBind = true;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new DeliveryWidgetV4OverlayViewHolder$actionHandler$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryWidgetV4View getContainerView() {
        View view = getView();
        if (view instanceof DeliveryWidgetV4View) {
            return (DeliveryWidgetV4View) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getTokenizedAnalytics() {
        return this.container.X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleFirstBind(DeliveryWidgetV4VO state) {
        DeliveryWidgetV4VO deliveryWidgetV4VO;
        this.latestStateForInit = state;
        if (this.isFirstBindPosted) {
            return;
        }
        this.isFirstBindPosted = true;
        final View view = getView();
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$scheduleFirstBind$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                    DeliveryWidgetV4VO deliveryWidgetV4VO2;
                    view.removeOnAttachStateChangeListener(this);
                    this.isFirstBindPosted = false;
                    if (!this.getView().isAttachedToWindow() || (deliveryWidgetV4VO2 = this.latestStateForInit) == null) {
                        return;
                    }
                    this.latestStateForInit = null;
                    DeliveryWidgetV4View containerView = this.getContainerView();
                    if (containerView != null) {
                        containerView.bind(deliveryWidgetV4VO2, true);
                    }
                    this.viewModel.scheduleUpdate(deliveryWidgetV4VO2);
                    this.isFirstBind = false;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                }
            });
            return;
        }
        this.isFirstBindPosted = false;
        if (!getView().isAttachedToWindow() || (deliveryWidgetV4VO = this.latestStateForInit) == null) {
            return;
        }
        this.latestStateForInit = null;
        DeliveryWidgetV4View containerView = getContainerView();
        if (containerView != null) {
            containerView.bind(deliveryWidgetV4VO, true);
        }
        this.viewModel.scheduleUpdate(deliveryWidgetV4VO);
        this.isFirstBind = false;
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeToWidgetUpdates();
        InterfaceC2395h<DeliveryWidgetV4VO> widgetUpdates = this.viewModel.getWidgetUpdates();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(widgetUpdates, lifecycle, bVar), new DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1(this, null)), K.a(this));
        final InterfaceC2395h a11 = C5427n.a(this.container.M().getEventsFlow(), getLifecycle(), bVar);
        C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2", f = "DeliveryWidgetV4OverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$$inlined$filter$1$2$1, reason: invalid class name */
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
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((a) obj) instanceof a.u) {
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
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3(this, null)), K.a(this));
    }

    private final void unsubscribeToWidgetUpdates() {
        E0.d(K.a(this).getCoroutineContext());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        subscribeToWidgetUpdates();
        DeliveryWidgetV4View containerView = getContainerView();
        if (containerView != null) {
            containerView.setActionHandlers(new DeliveryWidgetV4OverlayViewHolder$onWidgetCreated$1(getTokenizedAnalytics()), new DeliveryWidgetV4OverlayViewHolder$onWidgetCreated$2(this));
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.viewModel.cancelScheduledWidgetUpdate();
        unsubscribeToWidgetUpdates();
        this.isFirstBind = true;
        this.latestStateForInit = null;
        this.isFirstBindPosted = false;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DeliveryWidgetV4VO item) {
        DeliveryWidgetV4VO deliveryWidgetV4VO;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getResetState() || this.viewModel.getCurrentState() == null) {
            deliveryWidgetV4VO = item;
        } else {
            deliveryWidgetV4VO = this.viewModel.getCurrentState();
            if (deliveryWidgetV4VO == null) {
                return;
            }
        }
        this.currentTokenizedEvent = deliveryWidgetV4VO.getTokenizedEvent();
        if (this.isFirstBind) {
            scheduleFirstBind(deliveryWidgetV4VO);
            item.setResetState(false);
            return;
        }
        DeliveryWidgetV4View containerView = getContainerView();
        if (containerView != null) {
            containerView.bind(deliveryWidgetV4VO, false);
        }
        this.viewModel.scheduleUpdate(deliveryWidgetV4VO);
        item.setResetState(false);
    }
}

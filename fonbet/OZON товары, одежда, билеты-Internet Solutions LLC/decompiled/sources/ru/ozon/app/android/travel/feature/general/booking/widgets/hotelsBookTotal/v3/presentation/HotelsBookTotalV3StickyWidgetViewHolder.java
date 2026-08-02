package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import An.C2439a;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Vg.d;
import Vg.f;
import Wc.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import d20.AbstractC6065b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.performActionsList.ActionWithDelay;
import ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListActionHandler;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookSuccessValidationActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3EventCollector;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3StickyVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerView;
import ru.ozon.app.android.travel.utils.keyboard.KeyboardUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;
import xe.Y;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u0015*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u0015*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\u0015*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b.\u0010,J\u0017\u0010/\u001a\u00020\u0015*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u001dJ\u0017\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u001b\u0010=\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00150>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\"\u0010T\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Q0P0O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3StickyWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "viewFactory", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "stickyViewModel", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "uiEventsCollector", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;Ll10/i;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;LVg/d;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;", "visibilityState", "", "handleVisibility", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "subscribeActionResult", "()V", "subscribeUiEvents", "subscribeVisibilityStateChanges", "subscribeKeyboardVisibility", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "result", "handleActionResult", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "event", "performActionsList", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "startPageLoading", "(Ll10/b;)V", "stopPageLoading", "startWidgetLoading", "stopWidgetLoading", "onWidgetCreated", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "view$delegate", "LSc/j;", "getView", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "controller", "Ll10/b;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator;", "animator", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator;", "Landroid/widget/LinearLayout;", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "Ljava/lang/Class;", "LVg/f;", "getSupportedActionHandlers", "()[Ljava/lang/Class;", "supportedActionHandlers", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyWidgetViewHolder extends AbstractC6065b<HotelsBookTotalV3StickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsBookTotalV3StickyContainerAnimator animator;

    @NotNull
    private final i container;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final View metricView;

    @NotNull
    private final LinearLayout parent;

    @NotNull
    private final HotelsBookTotalV3StickyViewModel stickyViewModel;

    @NotNull
    private final HotelsBookTotalV3EventCollector uiEventsCollector;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    @NotNull
    private final HotelsBookTotalV3ViewModel viewModel;

    public HotelsBookTotalV3StickyWidgetViewHolder(@NotNull Function0<HotelsBookTotalV3StickyContainerView> viewFactory, @NotNull HotelsBookTotalV3ViewModel viewModel, @NotNull HotelsBookTotalV3StickyViewModel stickyViewModel, @NotNull i container, @NotNull HotelsBookTotalV3EventCollector uiEventsCollector, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(stickyViewModel, "stickyViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(uiEventsCollector, "uiEventsCollector");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.viewModel = viewModel;
        this.stickyViewModel = stickyViewModel;
        this.container = container;
        this.uiEventsCollector = uiEventsCollector;
        this.view = LazyUtilsKt.unsafeLazy(viewFactory);
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsBookTotalV3StickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).onComposerAction(new HotelsBookTotalV3StickyWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.controller = container.M();
        this.animator = new HotelsBookTotalV3StickyContainerAnimator();
        this.parent = C10183a.c(container.Y());
        this.metricView = getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<? extends f>[] getSupportedActionHandlers() {
        return new Class[]{TravelForceRedirectActionHandler.class, HotelsBookSuccessValidationActionHandler.class, PerformActionsListActionHandler.class};
    }

    private final HotelsBookTotalV3StickyContainerView getView() {
        return (HotelsBookTotalV3StickyContainerView) this.view.getValue();
    }

    private final void handleActionResult(HotelsBookTotalV3ViewModel.ActionResult result) {
        if (result instanceof HotelsBookTotalV3ViewModel.ActionResult.Success) {
            stopPageLoading(this.controller);
            stopWidgetLoading(this.controller);
            this.actionHandler.invoke(((HotelsBookTotalV3ViewModel.ActionResult.Success) result).getAction());
        } else if (result instanceof HotelsBookTotalV3ViewModel.ActionResult.Error) {
            stopPageLoading(this.controller);
            stopWidgetLoading(this.controller);
            NotificationBarUtilsKt.showDefaultError(this.container.Q());
        } else {
            if (!(result instanceof HotelsBookTotalV3ViewModel.ActionResult.Loading)) {
                throw new o();
            }
            if (((HotelsBookTotalV3ViewModel.ActionResult.Loading) result).getIsButtonLoader()) {
                startWidgetLoading(this.controller);
            } else {
                startPageLoading(this.controller);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerAction(AtomAction.ComposerAction action) {
        ViewExtKt.hideKeyboard(getView());
        this.viewModel.performApiAction(action.getActionName(), action.getParams(), getTrackingData());
    }

    private final void handleVisibility(HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState visibilityState) {
        boolean z11 = (visibilityState.getIsImeVisible() || visibilityState.getIsNonStickyVisible()) ? false : true;
        if (visibilityState.getIsImeVisible()) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.invisible(getView());
        } else {
            this.animator.toggleVisibility(getView(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0067 -> B:11:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:10:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performActionsList(HotelsBookTotalV3UiEvent hotelsBookTotalV3UiEvent, kotlin.coroutines.d<? super Unit> dVar) {
        HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1 hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1;
        int i11;
        HotelsBookTotalV3StickyWidgetViewHolder hotelsBookTotalV3StickyWidgetViewHolder;
        Iterator it;
        if (dVar instanceof HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1) {
            hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1 = (HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1) dVar;
            int i12 = hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!(hotelsBookTotalV3UiEvent instanceof HotelsBookTotalV3UiEvent.PerformActionsList)) {
                        return Unit.f71690a;
                    }
                    hotelsBookTotalV3StickyWidgetViewHolder = this;
                    it = ((HotelsBookTotalV3UiEvent.PerformActionsList) hotelsBookTotalV3UiEvent).getActionsWithDelay().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AtomAction atomAction = (AtomAction) hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$2;
                    it = (Iterator) hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$1;
                    hotelsBookTotalV3StickyWidgetViewHolder = (HotelsBookTotalV3StickyWidgetViewHolder) hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$0;
                    s.b(obj);
                    AtomAction action = atomAction;
                    hotelsBookTotalV3StickyWidgetViewHolder.actionHandler.invoke(action);
                    if (it.hasNext()) {
                        ActionWithDelay actionWithDelay = (ActionWithDelay) it.next();
                        action = actionWithDelay.getAction();
                        Long delay = actionWithDelay.getDelay();
                        if (delay != null) {
                            long longValue = delay.longValue();
                            hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$0 = hotelsBookTotalV3StickyWidgetViewHolder;
                            hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$1 = it;
                            hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.L$2 = action;
                            hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.label = 1;
                            if (Y.b(longValue, hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1) == aVar) {
                                return aVar;
                            }
                            atomAction = action;
                            AtomAction action2 = atomAction;
                        }
                        hotelsBookTotalV3StickyWidgetViewHolder.actionHandler.invoke(action2);
                        if (it.hasNext()) {
                            return Unit.f71690a;
                        }
                    }
                }
            }
        }
        hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1 = new HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1(this, dVar);
        Object obj2 = hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = hotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1.label;
        if (i11 != 0) {
        }
    }

    private final void startPageLoading(InterfaceC7851b interfaceC7851b) {
        C2439a.b(0L, null, 3, interfaceC7851b);
    }

    private final void startWidgetLoading(InterfaceC7851b interfaceC7851b) {
        interfaceC7851b.update(new HotelsBookTotalIsLoadingUpdate(true));
    }

    private final void stopPageLoading(InterfaceC7851b interfaceC7851b) {
        interfaceC7851b.hideLoader();
    }

    private final void stopWidgetLoading(InterfaceC7851b interfaceC7851b) {
        interfaceC7851b.update(new HotelsBookTotalIsLoadingUpdate(false));
    }

    private final void subscribeActionResult() {
        C2399j.C(new C2408n0(this.viewModel.getResultFlow(), new HotelsBookTotalV3StickyWidgetViewHolder$subscribeActionResult$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeActionResult$handleActionResult(HotelsBookTotalV3StickyWidgetViewHolder hotelsBookTotalV3StickyWidgetViewHolder, HotelsBookTotalV3ViewModel.ActionResult actionResult, kotlin.coroutines.d dVar) {
        hotelsBookTotalV3StickyWidgetViewHolder.handleActionResult(actionResult);
        return Unit.f71690a;
    }

    private final void subscribeKeyboardVisibility() {
        InterfaceC2395h<Boolean> keyboardVisibilityFlow;
        r a11 = this.container.Q().a();
        if (a11 == null || (keyboardVisibilityFlow = KeyboardUtilsKt.keyboardVisibilityFlow(a11)) == null) {
            return;
        }
        C2399j.C(new C2408n0(keyboardVisibilityFlow, new HotelsBookTotalV3StickyWidgetViewHolder$subscribeKeyboardVisibility$1(this.stickyViewModel)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeKeyboardVisibility$onKeyboardVisibilityChanged(HotelsBookTotalV3StickyViewModel hotelsBookTotalV3StickyViewModel, boolean z11, kotlin.coroutines.d dVar) {
        hotelsBookTotalV3StickyViewModel.onKeyboardVisibilityChanged(z11);
        return Unit.f71690a;
    }

    private final void subscribeUiEvents() {
        C2399j.C(new C2408n0(C5427n.a(this.uiEventsCollector.getFlow(), getLifecycle(), AbstractC5434v.b.RESUMED), new HotelsBookTotalV3StickyWidgetViewHolder$subscribeUiEvents$1(this)), K.a(this));
    }

    private final void subscribeVisibilityStateChanges() {
        final B0<HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState> visibilityStateFlow = this.stickyViewModel.getVisibilityStateFlow();
        C2399j.C(new C2408n0(C2399j.o(new InterfaceC2395h<HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState>() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ HotelsBookTotalV3StickyWidgetViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$$inlined$filter$1$2", f = "HotelsBookTotalV3StickyWidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, HotelsBookTotalV3StickyWidgetViewHolder hotelsBookTotalV3StickyWidgetViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = hotelsBookTotalV3StickyWidgetViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                                if (this.this$0.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
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
            public Object collect(InterfaceC2397i<? super HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$2(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeVisibilityStateChanges$handleVisibility(HotelsBookTotalV3StickyWidgetViewHolder hotelsBookTotalV3StickyWidgetViewHolder, HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState stickyContainerVisibilityState, kotlin.coroutines.d dVar) {
        hotelsBookTotalV3StickyWidgetViewHolder.handleVisibility(stickyContainerVisibilityState);
        return Unit.f71690a;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        subscribeActionResult();
        subscribeUiEvents();
        subscribeVisibilityStateChanges();
        subscribeKeyboardVisibility();
        this.parent.addView(getView());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.parent.removeView(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsBookTotalV3StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().bind(item, this.actionHandler);
    }
}

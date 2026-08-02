package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import Sc.o;
import T00.m;
import Vg.d;
import Vg.f;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListActionHandler;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookSuccessValidationActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3EventCollector;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload.HotelsBookTotalV3Payload;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.update.HotelsBookTotalV3Update;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3AsyncWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3View;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 q2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001qBG\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J'\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b\"\u0010&J\u001d\u0010)\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J)\u00106\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0018H\u0002¢\u0006\u0004\b@\u0010\u001aJ\u000f\u0010A\u001a\u00020\u0018H\u0002¢\u0006\u0004\bA\u0010\u001aJ\u0017\u0010D\u001a\u00020\u00182\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00182\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010M\u001a\u00020\u0018*\u00060Jj\u0002`K2\u0006\u0010L\u001a\u00020\u0002H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00182\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u0018*\u00060Jj\u0002`KH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u0018*\u00060Jj\u0002`KH\u0002¢\u0006\u0004\bU\u0010TJ\u0017\u0010V\u001a\u00020\u0018*\u00060Jj\u0002`KH\u0002¢\u0006\u0004\bV\u0010TJ\u0017\u0010W\u001a\u00020\u0018*\u00060Jj\u0002`KH\u0002¢\u0006\u0004\bW\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010YR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ZR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\\R\u0014\u0010]\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u00060_j\u0002``8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00180c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010j\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\"\u0010p\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020m0l0k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3View;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "uiEventsCollector", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "stickyViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3View;LWZ/l;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "onAttach", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "subscribeActionResult", "subscribeUiEvents", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "result", "handleActionResult", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "event", "fetchWidget", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;)V", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "newState", "update", "(Ll10/b;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "startWidgetLoading", "(Ll10/b;)V", "startPageLoading", "stopWidgetLoading", "stopPageLoading", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3View;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "controller", "Ll10/b;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/f;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "getAsyncWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "asyncWidgetViewModel", "", "Ljava/lang/Class;", "LVg/f;", "getSupportedActionHandlers", "()[Ljava/lang/Class;", "supportedActionHandlers", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3WidgetViewHolder extends k<HotelsBookTotalV3VO> implements AsyncWidgetCallbacks<HotelsBookTotalV3VO>, AsyncWidgetTraceNameProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final C4911f container;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final HotelsBookTotalV3StickyViewModel stickyViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsBookTotalV3EventCollector uiEventsCollector;

    @NotNull
    private final HotelsBookTotalV3View view;

    @NotNull
    private final HotelsBookTotalV3ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3WidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            HotelsBookTotalV3VO.Price price;
            AtomAction onClickAction;
            Intrinsics.checkNotNullParameter(it, "it");
            HotelsBookTotalV3VO boundData = HotelsBookTotalV3WidgetViewHolder.this.getBoundData();
            if (boundData == null || (price = boundData.getPrice()) == null || (onClickAction = price.getOnClickAction()) == null) {
                return;
            }
            HotelsBookTotalV3WidgetViewHolder.this.actionHandler.invoke(onClickAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3WidgetViewHolder$Companion;", "", "<init>", "()V", "VISIBILITY_THRESHOLD", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3WidgetViewHolder(@NotNull HotelsBookTotalV3View view, @NotNull l tokenizedAnalytics, @NotNull HotelsBookTotalV3EventCollector uiEventsCollector, @NotNull HotelsBookTotalV3ViewModel viewModel, @NotNull HotelsBookTotalV3StickyViewModel stickyViewModel, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(uiEventsCollector, "uiEventsCollector");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(stickyViewModel, "stickyViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.uiEventsCollector = uiEventsCollector;
        this.viewModel = viewModel;
        this.stickyViewModel = stickyViewModel;
        this.controller = references.getController();
        this.container = references.getContainer();
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotelsBookTotalV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).onComposerAction(new HotelsBookTotalV3WidgetViewHolder$actionHandler$2(this)).buildHandler();
        view.setOnPriceClickListener(new AnonymousClass1());
    }

    private final void fetchWidget(HotelsBookTotalV3UiEvent event) {
        if (event instanceof HotelsBookTotalV3UiEvent.Refresh) {
            startWidgetLoading(this.controller);
            HotelsBookTotalV3AsyncWidgetViewModel asyncWidgetViewModel = getAsyncWidgetViewModel();
            if (asyncWidgetViewModel != null) {
                HotelsBookTotalV3UiEvent.Refresh refresh = (HotelsBookTotalV3UiEvent.Refresh) event;
                asyncWidgetViewModel.fetchWidgetWithParams(refresh.getAsyncData(), refresh.getParams());
            }
        }
    }

    private final HotelsBookTotalV3AsyncWidgetViewModel getAsyncWidgetViewModel() {
        return (HotelsBookTotalV3AsyncWidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<? extends f>[] getSupportedActionHandlers() {
        return new Class[]{TravelForceRedirectActionHandler.class, HotelsBookSuccessValidationActionHandler.class, PerformActionsListActionHandler.class};
    }

    private final void handleActionResult(HotelsBookTotalV3ViewModel.ActionResult result) {
        if (result instanceof HotelsBookTotalV3ViewModel.ActionResult.Success) {
            stopPageLoading(this.controller);
            stopWidgetLoading(this.controller);
            this.actionHandler.invoke(((HotelsBookTotalV3ViewModel.ActionResult.Success) result).getAction());
        } else if (result instanceof HotelsBookTotalV3ViewModel.ActionResult.Error) {
            stopPageLoading(this.controller);
            stopWidgetLoading(this.controller);
            NotificationBarUtilsKt.showDefaultError(this.container);
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
        ViewExtKt.hideKeyboard(this.view);
        this.viewModel.performApiAction(action.getActionName(), action.getParams(), getTrackingData());
    }

    private final void showNotification(NotificationDTO notification) {
        NotificationBarUtilsKt.showNotification(this.container, notification);
        HotelsBookTotalV3VO boundData = getBoundData();
        if (boundData != null) {
            this.controller.d(new HotelsBookTotalV3Update(HotelsBookTotalV3VO.copy$default(boundData, 0L, null, null, null, null, null, null, null, null, false, null, 1983, null)));
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
        C2399j.C(new C2408n0(this.viewModel.getResultFlow(), new HotelsBookTotalV3WidgetViewHolder$subscribeActionResult$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeActionResult$handleActionResult(HotelsBookTotalV3WidgetViewHolder hotelsBookTotalV3WidgetViewHolder, HotelsBookTotalV3ViewModel.ActionResult actionResult, kotlin.coroutines.d dVar) {
        hotelsBookTotalV3WidgetViewHolder.handleActionResult(actionResult);
        return Unit.f71690a;
    }

    private final void subscribeUiEvents() {
        C2399j.C(new C2408n0(this.uiEventsCollector.getFlow(), new HotelsBookTotalV3WidgetViewHolder$subscribeUiEvents$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeUiEvents$fetchWidget(HotelsBookTotalV3WidgetViewHolder hotelsBookTotalV3WidgetViewHolder, HotelsBookTotalV3UiEvent hotelsBookTotalV3UiEvent, kotlin.coroutines.d dVar) {
        hotelsBookTotalV3WidgetViewHolder.fetchWidget(hotelsBookTotalV3UiEvent);
        return Unit.f71690a;
    }

    private final void update(InterfaceC7851b interfaceC7851b, HotelsBookTotalV3VO hotelsBookTotalV3VO) {
        interfaceC7851b.update(new HotelsBookTotalV3Update(hotelsBookTotalV3VO));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsBookTotalV3VO> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        update(this.controller, fetchedModel.getFetchedState());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        stopWidgetLoading(this.controller);
        NotificationBarUtilsKt.showDefaultError(this.container);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeUiEvents();
        subscribeActionResult();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        HotelsBookTotalV3AsyncWidgetViewModel asyncWidgetViewModel = getAsyncWidgetViewModel();
        if (asyncWidgetViewModel != null) {
            asyncWidgetViewModel.observeEvents(lifecycle, this, this);
        }
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.stickyViewModel.onNonStickyVisibilityChanged(offscreenOffsetPercent == 0.0f);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsBookTotalV3VO item, @NotNull c trackingData, ru.ozon.composer.ui.widget.f viewedPond) {
        StarsBadgeVI starsBadge;
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsBookTotalV3WidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null) : null;
        if (mapToTokenizedEvent$default != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
        }
        HotelsBookTotalV3VO.StarsBonuses starsBonuses = item.getStarsBonuses();
        if (starsBonuses == null || (starsBadge = starsBonuses.getStarsBadge()) == null || (tokenizedEvent = starsBadge.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookTotalV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        NotificationDTO notification = item.getNotification();
        if (notification != null) {
            showNotification(notification);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookTotalV3VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof List)) {
            bind(item, info);
            return;
        }
        for (Object obj : (Iterable) payload) {
            if (obj == HotelsBookTotalV3Payload.FINAL_PRICE) {
                this.view.bindFinalPrice(item.getPrice().getFinal());
            } else if (obj == HotelsBookTotalV3Payload.BASE_PRICE) {
                this.view.bindOrGoneBasePrice(item.getPrice().getBase());
            } else if (obj == HotelsBookTotalV3Payload.BONUSES_AMOUNT) {
                this.view.bindOrGoneBonusesAmount(item.getBonuses());
            } else if (obj == HotelsBookTotalV3Payload.IS_LOADING) {
                this.view.setLoading(item.getIsLoading());
            } else if (obj == HotelsBookTotalV3Payload.NEXT_BUTTON) {
                this.view.bindNextButton(item.getNextButton(), item.getNextButtonAction(), this.actionHandler);
            } else if (obj == HotelsBookTotalV3Payload.AGREEMENT) {
                this.view.bindOrGoneAgreement(item.getAgreement(), this.actionHandler);
            } else if (obj == HotelsBookTotalV3Payload.NOTIFICATION) {
                NotificationDTO notification = item.getNotification();
                if (notification != null) {
                    showNotification(notification);
                }
            } else if (obj == HotelsBookTotalV3Payload.STARS_BONUSES) {
                this.view.bindOrGoneStarBonuses(item.getStarsBonuses(), this.actionHandler);
            }
        }
    }
}

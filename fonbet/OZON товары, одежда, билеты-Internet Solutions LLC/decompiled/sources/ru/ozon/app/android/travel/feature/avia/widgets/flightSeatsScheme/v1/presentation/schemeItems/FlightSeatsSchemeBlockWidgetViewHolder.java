package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import Vg.d;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.R$string;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeAsyncVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeAsyncViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemePayload;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.HidePassengerBlockShimmerUpdateKey;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeContainerView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.app.android.travel.utils.navBarButtonUpdate.NavBarButtonUpdate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B3\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u00132\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J#\u00103\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/H\u0014¢\u0006\u0004\b3\u00105J\u000f\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u0010\u0015J\u001d\u00109\u001a\u00020\u00132\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000507H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u00100\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00130E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncVO;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;LWZ/l;)V", "", "observeLiveData", "()V", "showSeatSelectionError", "", "message", "showError", "(Ljava/lang/String;)V", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "event", "payloads", "trackSeatClickEvent", "(Ljava/util/Map;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SchemeUpdate;", "item", "updateScheme", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SchemeUpdate;)V", "", "isVisible", "updateClearButton", "(Z)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView;", "schemeContainerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncViewModel;", "getAsyncViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncViewModel;", "asyncViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeBlockWidgetViewHolder extends k<FlightSeatsSchemeVO> implements AsyncWidgetCallbacks<FlightSeatsSchemeAsyncVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences references;
    private final FlightSchemeContainerView schemeContainerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FlightSeatsSchemeViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "seat", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Integer, AirplaneSeatVO, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, AirplaneSeatVO airplaneSeatVO) {
            invoke(num.intValue(), airplaneSeatVO);
            return Unit.f71690a;
        }

        public final void invoke(int i11, AirplaneSeatVO seat) {
            FlightSeatsSchemeBlockVO schemeBlock;
            Intrinsics.checkNotNullParameter(seat, "seat");
            FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = FlightSeatsSchemeBlockWidgetViewHolder.this.viewModel;
            FlightSeatsSchemeVO boundData = FlightSeatsSchemeBlockWidgetViewHolder.this.getBoundData();
            flightSeatsSchemeViewModel.onSeatClicked(i11, seat, (boundData == null || (schemeBlock = boundData.getSchemeBlock()) == null) ? null : schemeBlock.getSelectSeatAction());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isThresholdPassed", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            FlightSeatsSchemeBlockWidgetViewHolder.this.viewModel.changeOrderTotalVisibility(!z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeBlockWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull FlightSeatsSchemeViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new FlightSeatsSchemeBlockWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        FlightSchemeContainerView flightSchemeContainerView = containerView instanceof FlightSchemeContainerView ? (FlightSchemeContainerView) containerView : null;
        this.schemeContainerView = flightSchemeContainerView;
        if (flightSchemeContainerView != null) {
            flightSchemeContainerView.setUp(buildHandler, new AnonymousClass1(), new AnonymousClass2());
        }
    }

    private final FlightSeatsSchemeAsyncViewModel getAsyncViewModel() {
        return (FlightSeatsSchemeAsyncViewModel) getWidgetViewModel();
    }

    private final void observeLiveData() {
        FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = this.viewModel;
        flightSeatsSchemeViewModel.seatSelectionLiveData().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$1(this)));
        flightSeatsSchemeViewModel.scrollToSchemeRowLiveData().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$2(this)));
        flightSeatsSchemeViewModel.seatSelectionError().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$3(this)));
        flightSeatsSchemeViewModel.networkErrorLiveData().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$4(this)));
        flightSeatsSchemeViewModel.isClearButtonVisible().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$5(this)));
        flightSeatsSchemeViewModel.orderDetailsLiveData().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$6(this)));
        flightSeatsSchemeViewModel.schemeUpdateVoLiveData().observe(this, new FlightSeatsSchemeBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$7(this)));
    }

    private final void showError(String message) {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, null, container.g(), 58, null).show();
    }

    static /* synthetic */ void showError$default(FlightSeatsSchemeBlockWidgetViewHolder flightSeatsSchemeBlockWidgetViewHolder, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        flightSeatsSchemeBlockWidgetViewHolder.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSeatSelectionError() {
        showError(StringProvider.getString(R$string.seat_selection_error_android));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSeatClickEvent(Map<String, TokenizedTrackingInfo> event, Map<String, String> payloads) {
        t mapToTokenizedEvent$default;
        FlightSeatsSchemeVO boundData = getBoundData();
        Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
        if (payloads != null) {
            this.tokenizedAnalytics.e(payloads);
        }
        if (event == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(event, valueOf, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateClearButton(boolean isVisible) {
        this.references.getController().update(new NavBarButtonUpdate(isVisible));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScheme(FlightSeatsSchemeViewModel.SchemeUpdate item) {
        FlightSeatsSchemeVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.references.getController().d(FlightSeatsSchemeVO.copy$default(boundData, 0L, FlightSeatsSchemeBlockVO.copy$default(boundData.getSchemeBlock(), null, item.getFirstSelectedSeatIndex(), item.getSeatNumberToPassengerMap(), item.getPassengerToSeatNumberMap(), item.getPassengerToSeatPositionMap(), null, null, item.getSchemeItems(), 97, null), FlightSeatsSchemePassengersBlockVO.copy$default(boundData.getPassengersBlock(), null, item.getPassengerTabs(), 0, false, 13, null), false, null, null, false, 57, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<FlightSeatsSchemeAsyncVO> fetchedModel) {
        FlightSeatsSchemeVO copy$default;
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        FlightSeatsSchemeAsyncVO fetchedState = fetchedModel.getFetchedState();
        FlightSeatsSchemeVO boundData = getBoundData();
        if (boundData == null || (copy$default = FlightSeatsSchemeVO.copy$default(boundData, 0L, fetchedState.getSchemeBlock(), fetchedState.getPassengersBlock(), false, fetchedState.getEmptyState(), null, false, 97, null)) == null) {
            return;
        }
        this.references.getController().update(copy$default);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FlightSeatsSchemeVO boundData = getBoundData();
        EmptyStateVO emptyState = boundData != null ? boundData.getEmptyState() : null;
        if (emptyState == null) {
            InterfaceC7851b.a.a(this.references.getController(), null, null, null, null, 15);
            return;
        }
        FlightSchemeContainerView flightSchemeContainerView = this.schemeContainerView;
        if (flightSchemeContainerView != null) {
            flightSchemeContainerView.showEmptyState(emptyState);
        }
        this.references.getController().update(new HidePassengerBlockShimmerUpdateKey());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FlightSchemeContainerView flightSchemeContainerView = this.schemeContainerView;
        if (flightSchemeContainerView != null) {
            flightSchemeContainerView.registerContentScrollListener();
        }
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        FlightSeatsSchemeAsyncViewModel asyncViewModel = getAsyncViewModel();
        if (asyncViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(asyncViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        FlightSchemeContainerView flightSchemeContainerView = this.schemeContainerView;
        if (flightSchemeContainerView != null) {
            flightSchemeContainerView.unregisterContentScrollListener();
        }
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        FlightSchemeContainerView flightSchemeContainerView = this.schemeContainerView;
        if (flightSchemeContainerView != null) {
            ViewsExtensionsKt.updateHeightRegardingOverlapContainers(flightSchemeContainerView, info, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightSeatsSchemeVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof FlightSeatsSchemePayload) {
            return;
        }
        super.bind((FlightSeatsSchemeBlockWidgetViewHolder) item, info, payload);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightSeatsSchemeVO item, @NotNull l20.d info) {
        FlightSchemeContainerView flightSchemeContainerView;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setUp(item);
        List<FlightSeatsSchemeItem> schemeItems = item.getSchemeBlock().getSchemeItems();
        if (item.getShouldFetchState()) {
            FlightSchemeContainerView flightSchemeContainerView2 = this.schemeContainerView;
            if (flightSchemeContainerView2 != null) {
                flightSchemeContainerView2.showShimmer();
            }
            FlightSeatsSchemeAsyncViewModel asyncViewModel = getAsyncViewModel();
            if (asyncViewModel != null) {
                asyncViewModel.fetchWidget(item.getAsyncData());
                return;
            }
            return;
        }
        if (schemeItems != null) {
            FlightSchemeContainerView flightSchemeContainerView3 = this.schemeContainerView;
            if (flightSchemeContainerView3 != null) {
                flightSchemeContainerView3.showContent(K.a(this), schemeItems);
                return;
            }
            return;
        }
        if (item.getEmptyState() == null || (flightSchemeContainerView = this.schemeContainerView) == null) {
            return;
        }
        flightSchemeContainerView.showEmptyState(item.getEmptyState());
    }
}

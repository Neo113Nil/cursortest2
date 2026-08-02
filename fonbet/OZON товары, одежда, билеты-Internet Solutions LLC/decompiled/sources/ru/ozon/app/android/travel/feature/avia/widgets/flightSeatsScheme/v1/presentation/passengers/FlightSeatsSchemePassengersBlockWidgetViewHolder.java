package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers;

import WZ.l;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockPayload$SeatSelection;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockPayload$TabSelection;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.view.FlightSeatsSchemePassengersBlockView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Ll10/b;", "controller", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Ll10/i;Ld20/e;Ll10/b;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;LWZ/l;)V", "", "observeLiveData", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSelection;", "selection", "selectPassengerTab", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSelection;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;", "update", "updatePassengerTabSeat", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerBlockUpdate;", "item", "updateBoundItem", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerBlockUpdate;)V", "onWidgetCreated", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;)V", "Ll10/b;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockView;", "containerView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockWidgetViewHolder extends AbstractC6067d<FlightSeatsSchemeVO> {

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FlightSeatsSchemeViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemePassengersBlockWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull InterfaceC7851b controller, @NotNull FlightSeatsSchemeViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.controller = controller;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final FlightSeatsSchemePassengersBlockView getContainerView() {
        View view = getView();
        if (view instanceof FlightSeatsSchemePassengersBlockView) {
            return (FlightSeatsSchemePassengersBlockView) view;
        }
        return null;
    }

    private final void observeLiveData() {
        FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = this.viewModel;
        flightSeatsSchemeViewModel.passengerTabSelectionLiveData().observe(this, new FlightSeatsSchemePassengersBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemePassengersBlockWidgetViewHolder$observeLiveData$1$1(this)));
        flightSeatsSchemeViewModel.passengerTabSeatUpdateLiveData().observe(this, new FlightSeatsSchemePassengersBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemePassengersBlockWidgetViewHolder$observeLiveData$1$2(this)));
        flightSeatsSchemeViewModel.passengersBlockUpdateVoLiveData().observe(this, new FlightSeatsSchemePassengersBlockWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FlightSeatsSchemePassengersBlockWidgetViewHolder$observeLiveData$1$3(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectPassengerTab(FlightSeatsSchemeViewModel.PassengerTabSelection selection) {
        FlightSeatsSchemePassengersBlockView containerView;
        FlightSeatsSchemePassengersBlockView containerView2 = getContainerView();
        FlightSeatsSchemePassengersBlockPayload$TabSelection flightSeatsSchemePassengersBlockPayload$TabSelection = new FlightSeatsSchemePassengersBlockPayload$TabSelection(containerView2 != null ? containerView2.getItemOrNull(selection.getPosition()) : null, selection.getItem());
        FlightSeatsSchemePassengersBlockView containerView3 = getContainerView();
        if (containerView3 != null) {
            containerView3.updateItem(selection.getPosition(), selection.getItem(), flightSeatsSchemePassengersBlockPayload$TabSelection);
        }
        if (!selection.getShouldScrollToPosition() || (containerView = getContainerView()) == null) {
            return;
        }
        containerView.scrollToPassengerTab(selection.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateBoundItem(FlightSeatsSchemeViewModel.PassengerBlockUpdate item) {
        FlightSeatsSchemeVO flightSeatsSchemeVO = (FlightSeatsSchemeVO) getBoundData();
        if (flightSeatsSchemeVO == null) {
            return;
        }
        this.controller.update(FlightSeatsSchemeVO.copy$default(flightSeatsSchemeVO, 0L, null, FlightSeatsSchemePassengersBlockVO.copy$default(flightSeatsSchemeVO.getPassengersBlock(), null, item.getPassengers(), item.getSelectedPosition(), false, 9, null), false, null, null, false, 59, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePassengerTabSeat(FlightSeatsSchemeViewModel.PassengerTabSeatUpdate update) {
        FlightSeatsSchemePassengersBlockVO.Passenger itemOrNull;
        FlightSeatsSchemePassengersBlockView containerView = getContainerView();
        FlightSeatsSchemePassengersBlockPayload$SeatSelection flightSeatsSchemePassengersBlockPayload$SeatSelection = new FlightSeatsSchemePassengersBlockPayload$SeatSelection((containerView == null || (itemOrNull = containerView.getItemOrNull(update.getPosition())) == null) ? null : itemOrNull.getSelectedSeat(), update.getItem().getSelectedSeat());
        FlightSeatsSchemePassengersBlockView containerView2 = getContainerView();
        if (containerView2 != null) {
            containerView2.updateItem(update.getPosition(), update.getItem(), flightSeatsSchemePassengersBlockPayload$SeatSelection);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        FlightSeatsSchemePassengersBlockView containerView = getContainerView();
        if (containerView != null) {
            containerView.setUp(new FlightSeatsSchemePassengersBlockWidgetViewHolder$onWidgetCreated$1(this));
        }
        observeLiveData();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FlightSeatsSchemeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSeatsSchemePassengersBlockView containerView = getContainerView();
        if (containerView != null) {
            containerView.showContent(K.a(this), item.getPassengersBlock());
            if (item.getShouldFetchState()) {
                containerView.showShimmerView();
            }
        }
    }
}

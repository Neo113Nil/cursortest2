package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengersPayload;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2FooterBlockView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;LVg/d;Ld20/e;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSelection;", "selection", "", "selectPassengerTab", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSelection;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;", "update", "updatePassengerTabSeat", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;)V", "observeFlows", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerBlockUpdate;", "updateBoundItem", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerBlockUpdate;)V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockView;", "getFooterView", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockView;", "footerView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterWidgetViewHolder extends AbstractC6064a<FlightSeatsSchemeV2VI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final FlightSeatsSchemeV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2FooterWidgetViewHolder(@NotNull i container, @NotNull FlightSeatsSchemeV2ViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new FlightSeatsSchemeV2FooterWidgetViewHolder$actionHandler$1(this)).customActionHandlers(new FlightSeatsSchemeV2FooterWidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
    }

    private final FlightSeatsSchemeV2FooterBlockView getFooterView() {
        View view = getView();
        if (view instanceof FlightSeatsSchemeV2FooterBlockView) {
            return (FlightSeatsSchemeV2FooterBlockView) view;
        }
        return null;
    }

    private final void observeFlows() {
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel = this.viewModel;
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getPassengerTabSelectionFlow(), new FlightSeatsSchemeV2FooterWidgetViewHolder$observeFlows$1$1(this)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getPassengerTabSeatUpdateFlow(), new FlightSeatsSchemeV2FooterWidgetViewHolder$observeFlows$1$2(this)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getPassengersBlockUpdateVoFlow(), new FlightSeatsSchemeV2FooterWidgetViewHolder$observeFlows$1$3(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$0$selectPassengerTab(FlightSeatsSchemeV2FooterWidgetViewHolder flightSeatsSchemeV2FooterWidgetViewHolder, FlightSeatsSchemeV2ViewModel.PassengerTabSelection passengerTabSelection, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2FooterWidgetViewHolder.selectPassengerTab(passengerTabSelection);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$0$updateBoundItem(FlightSeatsSchemeV2FooterWidgetViewHolder flightSeatsSchemeV2FooterWidgetViewHolder, FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate passengerBlockUpdate, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2FooterWidgetViewHolder.updateBoundItem(passengerBlockUpdate);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$0$updatePassengerTabSeat(FlightSeatsSchemeV2FooterWidgetViewHolder flightSeatsSchemeV2FooterWidgetViewHolder, FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate passengerTabSeatUpdate, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2FooterWidgetViewHolder.updatePassengerTabSeat(passengerTabSeatUpdate);
        return Unit.f71690a;
    }

    private final void selectPassengerTab(FlightSeatsSchemeV2ViewModel.PassengerTabSelection selection) {
        FlightSeatsSchemeV2FooterBlockView footerView;
        FlightSeatsSchemeV2FooterBlockView footerView2 = getFooterView();
        FlightSeatsSchemeV2PassengersPayload.TabSelection tabSelection = new FlightSeatsSchemeV2PassengersPayload.TabSelection(footerView2 != null ? footerView2.getItemOrNull(selection.getPosition()) : null, selection.getItem());
        FlightSeatsSchemeV2FooterBlockView footerView3 = getFooterView();
        if (footerView3 != null) {
            footerView3.updateItem(selection.getPosition(), selection.getItem(), tabSelection);
        }
        if (!selection.getShouldScrollToPosition() || (footerView = getFooterView()) == null) {
            return;
        }
        footerView.scrollToPassengerTab(selection.getPosition());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBoundItem(FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate update) {
        FlightSeatsSchemeV2HeaderBlockVI headerBlock;
        FlightSeatsSchemeV2VI flightSeatsSchemeV2VI = (FlightSeatsSchemeV2VI) getBoundData();
        if (flightSeatsSchemeV2VI != null && (flightSeatsSchemeV2VI.getState() instanceof FlightSeatsSchemeV2VI.State.Content)) {
            FlightSeatsSchemeV2FooterBlockVI copy$default = FlightSeatsSchemeV2FooterBlockVI.copy$default(((FlightSeatsSchemeV2VI.State.Content) flightSeatsSchemeV2VI.getState()).getFooterBlock(), update.getPassengers(), update.getSelectedPosition(), null, null, null, null, null, false, false, null, 892, null);
            if (update.getSubtitleName() != null) {
                FlightSeatsSchemeV2HeaderBlockVI headerBlock2 = ((FlightSeatsSchemeV2VI.State.Content) flightSeatsSchemeV2VI.getState()).getHeaderBlock();
                headerBlock = headerBlock2 != null ? FlightSeatsSchemeV2HeaderBlockVI.copy$default(headerBlock2, null, null, update.getSubtitleName(), null, 11, null) : null;
            } else {
                headerBlock = ((FlightSeatsSchemeV2VI.State.Content) flightSeatsSchemeV2VI.getState()).getHeaderBlock();
            }
            this.container.M().d(FlightSeatsSchemeV2VI.copy$default(flightSeatsSchemeV2VI, 0L, null, null, false, FlightSeatsSchemeV2VI.State.Content.copy$default((FlightSeatsSchemeV2VI.State.Content) flightSeatsSchemeV2VI.getState(), null, headerBlock, copy$default, null, false, 9, null), 15, null));
        }
    }

    private final void updatePassengerTabSeat(FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate update) {
        FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI itemOrNull;
        FlightSeatsSchemeV2FooterBlockView footerView = getFooterView();
        FlightSeatsSchemeV2PassengersPayload.SeatSelection seatSelection = new FlightSeatsSchemeV2PassengersPayload.SeatSelection((footerView == null || (itemOrNull = footerView.getItemOrNull(update.getPosition())) == null) ? null : itemOrNull.getSelectedSeat(), update.getItem().getSelectedSeat());
        FlightSeatsSchemeV2FooterBlockView footerView2 = getFooterView();
        if (footerView2 != null) {
            footerView2.updateItem(update.getPosition(), update.getItem(), seatSelection);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        FlightSeatsSchemeV2FooterBlockView footerView = getFooterView();
        if (footerView != null) {
            footerView.setUp(new FlightSeatsSchemeV2FooterWidgetViewHolder$onWidgetCreated$1(this));
        }
        observeFlows();
        ComposerExtKt.sendResultToTargetFragment(this.container.Q(), 9001, FlightSeatsSchemeV2FooterWidgetViewHolder$onWidgetCreated$2.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FlightSeatsSchemeV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSeatsSchemeV2VI.State state = item.getState();
        if (!(state instanceof FlightSeatsSchemeV2VI.State.Loading)) {
            if (!(state instanceof FlightSeatsSchemeV2VI.State.Content)) {
                throw new o();
            }
            FlightSeatsSchemeV2VI.State.Content content = (FlightSeatsSchemeV2VI.State.Content) state;
            if (content.getFooterBlock().getIsUpdatedFromRemote()) {
                this.viewModel.setUpFooter(content.getFooterBlock());
            }
            FlightSeatsSchemeV2FooterBlockView footerView = getFooterView();
            if (footerView != null) {
                footerView.bind(K.a(this), content.getFooterBlock(), this.actionHandler);
            }
            FlightSeatsSchemeV2FooterBlockView footerView2 = getFooterView();
            if (footerView2 != null) {
                footerView2.showPassengers(!content.getFooterBlock().getPassengers().isEmpty());
                return;
            }
            return;
        }
        if (item.getIsEmptyState()) {
            FlightSeatsSchemeV2FooterBlockView footerView3 = getFooterView();
            if (footerView3 != null) {
                footerView3.showEmptyState();
                return;
            }
            return;
        }
        FlightSeatsSchemeV2FooterBlockView footerView4 = getFooterView();
        if (footerView4 != null) {
            footerView4.bind(K.a(this), ((FlightSeatsSchemeV2VI.State.Loading) state).getFooterBlock(), this.actionHandler);
        }
        FlightSeatsSchemeV2FooterBlockView footerView5 = getFooterView();
        if (footerView5 != null) {
            footerView5.showShimmer();
        }
    }
}

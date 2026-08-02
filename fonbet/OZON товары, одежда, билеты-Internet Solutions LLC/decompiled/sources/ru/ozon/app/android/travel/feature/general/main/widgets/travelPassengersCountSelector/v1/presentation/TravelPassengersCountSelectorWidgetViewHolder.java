package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import Vg.d;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersSelectorViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelPassengersCountSelectorView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 12\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00011B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J#\u0010#\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b#\u0010$J+\u0010#\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b#\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelPassengersCountSelectorView;", "containerView", "Landroid/view/ViewGroup;", "flashBarRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;", "viewModel", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "modalParentRefreshSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelPassengersCountSelectorView;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;LVg/d;)V", "", "observeTravelClassUpdates", "()V", "observeTravelQuantityCellsUpdates", "observeRestrictions", "observeAction", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$DismissAndRefresh;", "action", "handleDismissAndRefreshAction", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$DismissAndRefresh;)V", "onAttach", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelPassengersCountSelectorView;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersCountSelectorWidgetViewHolder extends k<TravelPassengersCountSelectorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelPassengersCountSelectorView containerView;
    private final ViewGroup flashBarRootView;

    @NotNull
    private final ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelPassengersSelectorViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorWidgetViewHolder$Companion;", "", "<init>", "()V", "ACTION_TYPE_SELECT", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPassengersCountSelectorWidgetViewHolder(@NotNull TravelPassengersCountSelectorView containerView, ViewGroup viewGroup, @NotNull ComposerReferences references, @NotNull TravelPassengersSelectorViewModel viewModel, @NotNull ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(modalParentRefreshSharedViewModel, "modalParentRefreshSharedViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.flashBarRootView = viewGroup;
        this.references = references;
        this.viewModel = viewModel;
        this.modalParentRefreshSharedViewModel = modalParentRefreshSharedViewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPassengersCountSelectorWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new TravelPassengersCountSelectorWidgetViewHolder$actionHandler$2(this)).onClick(new TravelPassengersCountSelectorWidgetViewHolder$actionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismissAndRefreshAction(TravelPassengersSelectorViewModel.Action.DismissAndRefresh action) {
        if (action.getAction().getId() != null) {
            this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action.getAction(), null));
            return;
        }
        this.references.getNavigator().popBackStack();
        if (!this.modalParentRefreshSharedViewModel.refreshUrlLiveData().hasActiveObservers()) {
            ComposerExtKt.sendRefreshToTargetFragment$default(this.references.getContainer(), null, null, null, null, 15, null);
            return;
        }
        ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel = this.modalParentRefreshSharedViewModel;
        TravelPassengersCountSelectorVO boundData = getBoundData();
        ModalParentRefreshSharedViewModel.sendRefresh$default(modalParentRefreshSharedViewModel, null, boundData != null ? boundData.getPageUrl() : null, 1, null);
    }

    private final void observeAction() {
        this.viewModel.getActionLiveData().observe(this, new TravelPassengersCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPassengersCountSelectorWidgetViewHolder$observeAction$1(this)));
    }

    private final void observeRestrictions() {
        this.viewModel.getRestrictionLiveData().observe(this, new TravelPassengersCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPassengersCountSelectorWidgetViewHolder$observeRestrictions$1(this)));
    }

    private final void observeTravelClassUpdates() {
        this.viewModel.getTravelClassUpdateLiveData().observe(this, new TravelPassengersCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPassengersCountSelectorWidgetViewHolder$observeTravelClassUpdates$1(this)));
    }

    private final void observeTravelQuantityCellsUpdates() {
        this.viewModel.getCellsUpdateLiveData().observe(this, new TravelPassengersCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPassengersCountSelectorWidgetViewHolder$observeTravelQuantityCellsUpdates$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.containerView.onAttach(this.actionHandler);
        observeTravelClassUpdates();
        observeTravelQuantityCellsUpdates();
        observeRestrictions();
        observeAction();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.containerView.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPassengersCountSelectorVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPassengersCountSelectorVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.onBindNewItem(item);
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            this.containerView.bind(item, this.actionHandler, new TravelPassengersCountSelectorWidgetViewHolder$bind$1(this.viewModel), new TravelPassengersCountSelectorWidgetViewHolder$bind$2(this.viewModel));
        } else {
            this.containerView.update(item, (List) payload);
        }
    }
}

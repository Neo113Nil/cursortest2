package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import Vg.c;
import WZ.l;
import WZ.t;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.AviaComplexSearchFormView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0016J)\u00100\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00106\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0014088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel;", "viewModel", "<init>", "(Landroid/view/View;LVg/c;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel;)V", "", "observeLiveData", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel$UpdateRouteData;", "data", "updateRoutes", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel$UpdateRouteData;)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "flights", "Lkotlin/Pair;", "", "", "updateFlight", "(Ljava/util/List;Lkotlin/Pair;)V", "item", "Ll20/d;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;Ll20/d;)V", "onAttach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/AviaComplexSearchFormView;", "aviaComplexSearchFormView", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/AviaComplexSearchFormView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaComplexSearchFormWidgetViewHolder extends k<AviaComplexSearchFormVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final AviaComplexSearchFormView aviaComplexSearchFormView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AviaComplexSearchFormViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaComplexSearchFormWidgetViewHolder(@NotNull View containerView, @NotNull c customActionHandlersStore, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull AviaComplexSearchFormViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.aviaComplexSearchFormView = containerView instanceof AviaComplexSearchFormView ? (AviaComplexSearchFormView) containerView : null;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new AviaComplexSearchFormWidgetViewHolder$actionHandler$1(customActionHandlersStore)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    private final void observeLiveData() {
        this.viewModel.updateRoutesLiveData().observe(this, new AviaComplexSearchFormWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AviaComplexSearchFormWidgetViewHolder$observeLiveData$1(this)));
    }

    private final void updateFlight(List<AviaComplexSearchFormVO.Flight> flights, Pair<Integer, Boolean> data) {
        if (data == null) {
            return;
        }
        int intValue = data.a().intValue();
        boolean booleanValue = data.b().booleanValue();
        if (intValue < 0 || intValue >= flights.size()) {
            return;
        }
        flights.set(intValue, AviaComplexSearchFormVO.Flight.copy$default(flights.get(intValue), 0, null, null, null, booleanValue, false, 47, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRoutes(AviaComplexSearchFormViewModel.UpdateRouteData data) {
        AviaComplexSearchFormView aviaComplexSearchFormView;
        AviaComplexSearchFormVO boundData = getBoundData();
        if (boundData != null) {
            ArrayList arrayList = new ArrayList(boundData.getFlights());
            updateFlight(arrayList, data.getCurrentPosition());
            updateFlight(arrayList, data.getPreviousPosition());
            this.references.getController().update(new AviaComplexSearchFormUpdate(arrayList));
            if (data.getPreviousPosition() == null || (aviaComplexSearchFormView = this.aviaComplexSearchFormView) == null) {
                return;
            }
            aviaComplexSearchFormView.hideDeleteButton(data.getPreviousPosition().e().intValue());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AviaComplexSearchFormVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AviaComplexSearchFormWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaComplexSearchFormVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof AviaComplexSearchFormPayload)) {
            super.bind((AviaComplexSearchFormWidgetViewHolder) item, info, payload);
            return;
        }
        if (item.getIsUpdatedFromRemote()) {
            this.viewModel.resetSwipedPosition();
        }
        AviaComplexSearchFormView aviaComplexSearchFormView = this.aviaComplexSearchFormView;
        if (aviaComplexSearchFormView != null) {
            AviaComplexSearchFormPayload aviaComplexSearchFormPayload = (AviaComplexSearchFormPayload) payload;
            if (aviaComplexSearchFormPayload.isRouteListChanged() && item.getIsUpdatedFromRemote()) {
                aviaComplexSearchFormView.bindRouteList(item.getFlights());
            }
            if (aviaComplexSearchFormPayload.isAddFlightButtonChanged()) {
                aviaComplexSearchFormView.bindAddRouteButton(item.getAddFlight(), this.actionHandler);
            }
            if (aviaComplexSearchFormPayload.isPassengerButtonChanged()) {
                aviaComplexSearchFormView.bindPassengerButton(item.getPassenger(), this.actionHandler);
            }
            if (aviaComplexSearchFormPayload.isSubmitButtonChanged()) {
                aviaComplexSearchFormView.bindSubmitButton(item.getSubmitButton(), this.actionHandler);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaComplexSearchFormVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.resetSwipedPosition();
        AviaComplexSearchFormView aviaComplexSearchFormView = this.aviaComplexSearchFormView;
        if (aviaComplexSearchFormView != null) {
            aviaComplexSearchFormView.bind(item, this.actionHandler, new AviaComplexSearchFormWidgetViewHolder$bind$2(this.viewModel), new AviaComplexSearchFormWidgetViewHolder$bind$3(this.viewModel), new AviaComplexSearchFormWidgetViewHolder$bind$4(this.viewModel));
        }
    }
}

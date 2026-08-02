package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation;

import Sc.o;
import Vg.d;
import W10.c;
import WZ.t;
import WZ.x;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view.AdditionalReturnServiceCellV2View;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00100/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View;", "view", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View;Ll10/i;LVg/d;)V", "item", "", "trackViewEvent", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "()V", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2ViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2ViewModel;", "widgetViewModel", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellV2WidgetViewHolder extends k<AdditionalReturnServiceCellV2VI> implements AsyncWidgetCallbacks<AdditionalReturnServiceCellV2VI.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final AdditionalReturnServiceCellV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceCellV2WidgetViewHolder(@NotNull AdditionalReturnServiceCellV2View view, @NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new AdditionalReturnServiceCellV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final AdditionalReturnServiceCellV2ViewModel getWidgetViewModel() {
        return (AdditionalReturnServiceCellV2ViewModel) getWidgetViewModel();
    }

    private final void trackViewEvent(AdditionalReturnServiceCellV2VI.State item) {
        Map<String, TokenizedTrackingInfo> viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            AdditionalReturnServiceCellV2VI boundData = getBoundData();
            t b11 = x.b(viewEvent, boundData != null ? Long.valueOf(boundData.getId()) : null, null);
            if (b11 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), b11, null, 2, null);
            }
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AdditionalReturnServiceCellV2VI.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.container.X().e(trackingPayloads);
        }
        InterfaceC7851b M11 = this.container.M();
        AdditionalReturnServiceCellV2VI boundData = getBoundData();
        if (boundData != null) {
            M11.update(new AdditionalReturnServiceCellV2Update(boundData.getId(), fetchedModel.getFetchedState()));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AdditionalReturnServiceCellV2VI boundData = getBoundData();
        if (boundData != null) {
            this.container.M().m(boundData.getId());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AdditionalReturnServiceCellV2VI boundData = getBoundData();
        if (boundData != null) {
            this.container.M().m(boundData.getId());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdditionalReturnServiceCellV2ViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalReturnServiceCellV2VI item, @NotNull l20.d info) {
        AdditionalReturnServiceCellV2ViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (isInVisibleBounds()) {
            trackViewEvent(item.getState());
        }
        AdditionalReturnServiceCellV2VI.State state = item.getState();
        if (state instanceof AdditionalReturnServiceCellV2VI.State.Loading) {
            if (((AdditionalReturnServiceCellV2VI.State.Loading) item.getState()).getShowBookingSkeleton()) {
                this.view.showBookingSkeletons(((AdditionalReturnServiceCellV2VI.State.Loading) item.getState()).getCells(), ((AdditionalReturnServiceCellV2VI.State.Loading) item.getState()).getBackgroundColor(), ((AdditionalReturnServiceCellV2VI.State.Loading) item.getState()).getBorderColor(), this.actionHandler);
            } else {
                this.view.showShimmer();
            }
            if (item.getAsyncData() == null || (widgetViewModel = getWidgetViewModel()) == null) {
                return;
            }
            widgetViewModel.fetchWidgetWithParams(item.getAsyncData(), ((AdditionalReturnServiceCellV2VI.State.Loading) item.getState()).getAsyncParams());
            return;
        }
        if (state instanceof AdditionalReturnServiceCellV2VI.State.BookingSkeletons) {
            this.view.showBookingSkeletons(((AdditionalReturnServiceCellV2VI.State.BookingSkeletons) item.getState()).getCells(), ((AdditionalReturnServiceCellV2VI.State.BookingSkeletons) item.getState()).getBackgroundColor(), ((AdditionalReturnServiceCellV2VI.State.BookingSkeletons) item.getState()).getBorderColor(), this.actionHandler);
        } else if (state instanceof AdditionalReturnServiceCellV2VI.State.Skeletons) {
            this.view.showShimmer();
        } else {
            if (!(state instanceof AdditionalReturnServiceCellV2VI.State.Content)) {
                throw new o();
            }
            this.view.bind((AdditionalReturnServiceCellV2VI.State.Content) item.getState(), this.actionHandler);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdditionalReturnServiceCellV2VI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AdditionalReturnServiceCellV2WidgetViewHolder) item, trackingData, viewedPond);
        trackViewEvent(item.getState());
    }
}

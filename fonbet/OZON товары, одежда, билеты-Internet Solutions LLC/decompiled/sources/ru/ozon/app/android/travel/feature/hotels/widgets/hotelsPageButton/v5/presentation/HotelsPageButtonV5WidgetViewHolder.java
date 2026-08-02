package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Lm0.a;
import Sc.InterfaceC4008j;
import Vg.d;
import WZ.l;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.view.HotelsPageButtonView;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollUpdate;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010(J\u001d\u0010/\u001a\u00020\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00170G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;", "viewModel", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "hotelMapInfoViewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetAsyncViewModel;", "widgetAsyncViewModel", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetAsyncViewModel;Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;Ll10/i;LVg/d;Ld20/e;)V", "", "removeWidget", "()V", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;", "update", "handleScrollUpdate", "(Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;)V", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "startAnchorPosition", "endAnchorPosition", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "scrollAnchorIds", "", "isVisible", "(Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;)Z", "item", "updateWidgetVisibility", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;)V", "updateCellVisibility", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;)Z", "onWidgetCreated", "bind", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "onWidgetDestroyed", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetAsyncViewModel;", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "", "scrollOffset$delegate", "LSc/j;", "getScrollOffset", "()I", "scrollOffset", "Ll10/b;", "composerController", "Ll10/b;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonView;", "getHotelsPageButtonView", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonView;", "hotelsPageButtonView", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5WidgetViewHolder extends AbstractC6064a<HotelsPageButtonV5VO> implements AsyncWidgetCallbacks<HotelsPageButtonV5VO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final HotelMapInfoViewModel hotelMapInfoViewModel;

    @NotNull
    private final ScrollAnchorViewModel scrollAnchorViewModel;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollOffset;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsPageButtonV5ViewModel viewModel;

    @NotNull
    private final HotelsPageButtonV5WidgetAsyncViewModel widgetAsyncViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageButtonV5WidgetViewHolder(@NotNull HotelsPageButtonV5ViewModel viewModel, @NotNull HotelMapInfoViewModel hotelMapInfoViewModel, @NotNull HotelsPageButtonV5WidgetAsyncViewModel widgetAsyncViewModel, @NotNull ScrollAnchorViewModel scrollAnchorViewModel, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(hotelMapInfoViewModel, "hotelMapInfoViewModel");
        Intrinsics.checkNotNullParameter(widgetAsyncViewModel, "widgetAsyncViewModel");
        Intrinsics.checkNotNullParameter(scrollAnchorViewModel, "scrollAnchorViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
        this.hotelMapInfoViewModel = hotelMapInfoViewModel;
        this.widgetAsyncViewModel = widgetAsyncViewModel;
        this.scrollAnchorViewModel = scrollAnchorViewModel;
        this.scrollOffset = LazyUtilsKt.unsafeLazy(new HotelsPageButtonV5WidgetViewHolder$scrollOffset$2(container));
        this.composerController = container.M();
        this.tokenizedAnalytics = container.X();
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new HotelsPageButtonV5WidgetViewHolder$actionHandler$1(container, this)).customActionHandlers(new HotelsPageButtonV5WidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
    }

    private final HotelsPageButtonView getHotelsPageButtonView() {
        View view = getView();
        if (view instanceof HotelsPageButtonView) {
            return (HotelsPageButtonView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleScrollUpdate(ScrollUpdate update) {
        this.viewModel.getAnchorsPositionCache().put(update.getScrollAnchorId(), update.getAnchorPosition());
        HotelsPageButtonV5VO hotelsPageButtonV5VO = (HotelsPageButtonV5VO) getBoundData();
        if (hotelsPageButtonV5VO != null) {
            String scrollAnchorId = update.getScrollAnchorId();
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors = hotelsPageButtonV5VO.getState().getWidgetScrollAnchors();
            if (Intrinsics.d(scrollAnchorId, widgetScrollAnchors != null ? widgetScrollAnchors.getStartId() : null)) {
                this.viewModel.setStartWidgetScrollAnchorPosition(update.getAnchorPosition());
                updateWidgetVisibility(hotelsPageButtonV5VO);
                return;
            }
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors2 = hotelsPageButtonV5VO.getState().getWidgetScrollAnchors();
            if (Intrinsics.d(scrollAnchorId, widgetScrollAnchors2 != null ? widgetScrollAnchors2.getEndId() : null)) {
                this.viewModel.setEndWidgetScrollAnchorPosition(update.getAnchorPosition());
                updateWidgetVisibility(hotelsPageButtonV5VO);
                return;
            }
            HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors = hotelsPageButtonV5VO.getState().getCellScrollAnchors();
            if (Intrinsics.d(scrollAnchorId, cellScrollAnchors != null ? cellScrollAnchors.getStartId() : null)) {
                this.viewModel.setStartCellScrollAnchorPosition(update.getAnchorPosition());
                updateCellVisibility(hotelsPageButtonV5VO);
                return;
            }
            HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors2 = hotelsPageButtonV5VO.getState().getCellScrollAnchors();
            if (Intrinsics.d(scrollAnchorId, cellScrollAnchors2 != null ? cellScrollAnchors2.getEndId() : null)) {
                this.viewModel.setEndCellScrollAnchorPosition(update.getAnchorPosition());
                updateCellVisibility(hotelsPageButtonV5VO);
            }
        }
    }

    private final boolean isVisible(ScrollUpdate.AnchorPosition startAnchorPosition, ScrollUpdate.AnchorPosition endAnchorPosition, HotelsPageButtonV5DTO.WidgetsBlockAnchors scrollAnchorIds) {
        if (scrollAnchorIds == null) {
            return true;
        }
        ScrollUpdate.AnchorPosition anchorPosition = ScrollUpdate.AnchorPosition.IN_VISIBLE_AREA;
        if (startAnchorPosition == anchorPosition || endAnchorPosition == anchorPosition) {
            return false;
        }
        ScrollUpdate.AnchorPosition anchorPosition2 = ScrollUpdate.AnchorPosition.ABOVE_VISIBLE_AREA;
        if (startAnchorPosition == anchorPosition2 && endAnchorPosition != anchorPosition2) {
            return false;
        }
        ScrollUpdate.AnchorPosition anchorPosition3 = ScrollUpdate.AnchorPosition.BELOW_VISIBLE_AREA;
        return endAnchorPosition != anchorPosition3 || startAnchorPosition == anchorPosition3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeWidget() {
        HotelsPageButtonV5VO hotelsPageButtonV5VO = (HotelsPageButtonV5VO) getBoundData();
        if (hotelsPageButtonV5VO != null) {
            this.composerController.m(hotelsPageButtonV5VO.getId());
        }
    }

    private final boolean updateCellVisibility(HotelsPageButtonV5VO item) {
        ScrollUpdate.AnchorPosition anchorPosition;
        if (item.getState().getDsCell() == null) {
            return false;
        }
        ScrollUpdate.AnchorPosition startCellScrollAnchorPosition = this.viewModel.getStartCellScrollAnchorPosition();
        ScrollUpdate.AnchorPosition anchorPosition2 = ScrollUpdate.AnchorPosition.UNSPECIFIED;
        if (startCellScrollAnchorPosition == anchorPosition2 || item.getState().getCellScrollAnchors() != null) {
            Map<String, ScrollUpdate.AnchorPosition> anchorsPositionCache = this.viewModel.getAnchorsPositionCache();
            HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors = item.getState().getCellScrollAnchors();
            anchorPosition = anchorsPositionCache.get(cellScrollAnchors != null ? cellScrollAnchors.getStartId() : null);
            if (anchorPosition == null) {
                anchorPosition = anchorPosition2;
            }
        } else {
            anchorPosition = this.viewModel.getStartCellScrollAnchorPosition();
        }
        if (this.viewModel.getEndCellScrollAnchorPosition() == anchorPosition2 || item.getState().getCellScrollAnchors() != null) {
            Map<String, ScrollUpdate.AnchorPosition> anchorsPositionCache2 = this.viewModel.getAnchorsPositionCache();
            HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors2 = item.getState().getCellScrollAnchors();
            ScrollUpdate.AnchorPosition anchorPosition3 = anchorsPositionCache2.get(cellScrollAnchors2 != null ? cellScrollAnchors2.getEndId() : null);
            if (anchorPosition3 != null) {
                anchorPosition2 = anchorPosition3;
            }
        } else {
            anchorPosition2 = this.viewModel.getEndCellScrollAnchorPosition();
        }
        boolean z11 = isVisible(anchorPosition, anchorPosition2, item.getState().getCellScrollAnchors()) || item.getState().getCellScrollAnchors() == null;
        HotelsPageButtonView hotelsPageButtonView = getHotelsPageButtonView();
        if (hotelsPageButtonView != null) {
            hotelsPageButtonView.updateCellVisibility(z11);
        }
        return z11;
    }

    private final void updateWidgetVisibility(HotelsPageButtonV5VO item) {
        ScrollUpdate.AnchorPosition anchorPosition;
        ScrollUpdate.AnchorPosition startWidgetScrollAnchorPosition = this.viewModel.getStartWidgetScrollAnchorPosition();
        ScrollUpdate.AnchorPosition anchorPosition2 = ScrollUpdate.AnchorPosition.UNSPECIFIED;
        if (startWidgetScrollAnchorPosition == anchorPosition2 || item.getState().getWidgetScrollAnchors() != null) {
            Map<String, ScrollUpdate.AnchorPosition> anchorsPositionCache = this.viewModel.getAnchorsPositionCache();
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors = item.getState().getWidgetScrollAnchors();
            anchorPosition = anchorsPositionCache.get(widgetScrollAnchors != null ? widgetScrollAnchors.getStartId() : null);
            if (anchorPosition == null) {
                anchorPosition = anchorPosition2;
            }
        } else {
            anchorPosition = this.viewModel.getStartWidgetScrollAnchorPosition();
        }
        if (this.viewModel.getEndWidgetScrollAnchorPosition() == anchorPosition2 || item.getState().getWidgetScrollAnchors() != null) {
            Map<String, ScrollUpdate.AnchorPosition> anchorsPositionCache2 = this.viewModel.getAnchorsPositionCache();
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors2 = item.getState().getWidgetScrollAnchors();
            ScrollUpdate.AnchorPosition anchorPosition3 = anchorsPositionCache2.get(widgetScrollAnchors2 != null ? widgetScrollAnchors2.getEndId() : null);
            if (anchorPosition3 != null) {
                anchorPosition2 = anchorPosition3;
            }
        } else {
            anchorPosition2 = this.viewModel.getEndWidgetScrollAnchorPosition();
        }
        boolean z11 = isVisible(anchorPosition, anchorPosition2, item.getState().getWidgetScrollAnchors()) || item.getState().getWidgetScrollAnchors() == null;
        HotelsPageButtonView hotelsPageButtonView = getHotelsPageButtonView();
        if (hotelsPageButtonView != null) {
            hotelsPageButtonView.updateVisibility(z11);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsPageButtonV5VO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.composerController.update(new HotelsPageButtonV5Update(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        removeWidget();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        AbstractAsyncWidgetViewModel.observeEvents$default(this.widgetAsyncViewModel, this, this, null, 4, null);
        C2399j.C(new C(new C2408n0(C5427n.a(this.scrollAnchorViewModel.scrollUpdate(), getLifecycle(), AbstractC5434v.b.STARTED), new HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1(this, null)), new HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$2(null)), K.a(this));
        this.hotelMapInfoViewModel.onBottomWidgetCreated();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetAsyncViewModel.onCleared();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsPageButtonV5VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getState().getIsUpdateRequired() && item.getAsyncData() != null) {
            this.widgetAsyncViewModel.fetchWidgetWithParams(item.getAsyncData(), item.getState().getAsyncParameters());
        }
        updateWidgetVisibility(item);
        boolean updateCellVisibility = updateCellVisibility(item);
        HotelsPageButtonView hotelsPageButtonView = getHotelsPageButtonView();
        if (hotelsPageButtonView != null) {
            hotelsPageButtonView.bind(item.getState(), updateCellVisibility, this.actionHandler);
        }
        this.hotelMapInfoViewModel.onBottomWidgetBound(true);
    }
}

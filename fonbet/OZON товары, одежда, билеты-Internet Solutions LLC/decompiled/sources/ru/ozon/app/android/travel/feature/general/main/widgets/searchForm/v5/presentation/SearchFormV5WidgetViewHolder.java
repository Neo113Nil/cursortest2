package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Lm0.a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5Payload;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5View;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B7\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010&\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J#\u0010&\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b&\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010\u0016J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00142\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00022\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5View;", "containerView", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5ViewModel;", "viewModel", "Ll10/i;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LVg/d;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5View;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5ViewModel;Ll10/i;LWZ/l;)V", "", "observeRefreshEvent", "()V", "handleRefreshEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "asyncSwapParams", "", "processSwapAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;Ll20/d;)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5View;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5ViewModel;", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5WidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5WidgetViewModel;", "widgetViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5WidgetViewHolder extends k<SearchFormV5VO> implements AsyncWidgetCallbacks<SearchFormV5VO.Content> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final SearchFormV5View containerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SearchFormV5ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormV5WidgetViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull SearchFormV5View containerView, @NotNull SearchFormV5ViewModel viewModel, @NotNull i container, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new SearchFormV5WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new SearchFormV5WidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    private final SearchFormV5WidgetViewModel getWidgetViewModel() {
        return (SearchFormV5WidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRefreshEvent() {
        String asyncData;
        SearchFormV5VO boundData = getBoundData();
        if (boundData == null || (asyncData = boundData.getAsyncData()) == null) {
            return;
        }
        SearchFormV5WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.fetchWidget(asyncData);
        }
        this.containerView.showLoader();
    }

    private final void observeRefreshEvent() {
        C2399j.C(new C2408n0(this.viewModel.getRefreshEventFlow(), new SearchFormV5WidgetViewHolder$observeRefreshEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processSwapAction(AtomAction action, Map<String, String> asyncSwapParams) {
        String asyncData;
        if (action instanceof AtomAction.ComposerAction) {
            String lowerCase = ((AtomAction.ComposerAction) action).getActionName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (h.t(lowerCase, "swap", false)) {
                boolean z11 = asyncSwapParams == null || asyncSwapParams.isEmpty();
                SearchFormV5VO boundData = getBoundData();
                if (boundData != null) {
                    this.container.M().update(SearchFormV5Update.m1282boximpl(SearchFormV5Update.m1283constructorimpl(SearchFormV5VO.Content.copy$default(boundData.getContent(), null, null, null, null, null, null, 0.0f, null, null, null, null, true, null, 6143, null))));
                }
                if (!z11) {
                    SearchFormV5VO boundData2 = getBoundData();
                    if (boundData2 != null && (asyncData = boundData2.getAsyncData()) != null) {
                        SearchFormV5WidgetViewModel widgetViewModel = getWidgetViewModel();
                        if (widgetViewModel != null) {
                            widgetViewModel.fetchWidgetWithParams(asyncData, asyncSwapParams);
                        }
                        this.containerView.showLoader();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<SearchFormV5VO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.container.M().update(SearchFormV5Update.m1282boximpl(SearchFormV5Update.m1283constructorimpl(fetchedModel.getFetchedState())));
        this.containerView.hideLoader();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        NotificationBarUtilsKt.showDefaultError(this.container.Q());
        this.containerView.hideLoader();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeRefreshEvent();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        SearchFormV5WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchFormV5VO item, @NotNull c trackingData, f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchFormV5WidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getContent().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchFormV5VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.updateVoData(item.getContent());
        if (!(payload instanceof SearchFormV5Payload)) {
            super.bind((SearchFormV5WidgetViewHolder) item, info, payload);
            return;
        }
        SearchFormV5VO.Content content = item.getContent();
        SearchFormV5Payload searchFormV5Payload = (SearchFormV5Payload) payload;
        if (searchFormV5Payload.areLocationsChanged()) {
            this.containerView.bindLocations(content.getLocations(), searchFormV5Payload.isDepartureAnimated(), searchFormV5Payload.isDestinationAnimated(), this.actionHandler);
        }
        if (searchFormV5Payload.areLocationsSwapped() && content.getLocations() != null) {
            this.containerView.swapLocations(content.getLocations());
        }
        if (searchFormV5Payload.isDateChanged()) {
            this.containerView.bindDateField(content.getDateField(), true, this.actionHandler);
        }
        if (searchFormV5Payload.isDateActionChanged()) {
            this.containerView.updateDateFieldModel(content.getDateField());
        }
        if (searchFormV5Payload.isRightFieldChanged()) {
            this.containerView.bindRightField(content.getRightField(), true, this.actionHandler);
        }
        if (searchFormV5Payload.isRightFieldActionChanged()) {
            this.containerView.updateRightFieldModel(content.getRightField());
        }
        if (searchFormV5Payload.isTouristFieldChanged()) {
            this.containerView.bindTouristField(content.getTouristField(), true, this.actionHandler);
        }
        if (searchFormV5Payload.isTouristFieldActionChanged()) {
            this.containerView.updateTouristFieldModel(content.getTouristField());
        }
        if (searchFormV5Payload.isSearchButtonChanged()) {
            this.containerView.bindSearchButton(content.getSearchButton(), this.actionHandler);
        }
        if (searchFormV5Payload.isBackgroundChanged()) {
            this.containerView.bindBackgroundColor(content.getBackgroundColor());
        }
        if (searchFormV5Payload.isCornerRadiusChanged()) {
            this.containerView.bindCornerRadius(content.getCornerRadius());
        }
        if (searchFormV5Payload.isLeftPatchChanged()) {
            this.containerView.bindLeftPatchColor(content.getLeftPatchColor());
        }
        if (searchFormV5Payload.isRightPathcChanged()) {
            this.containerView.bindRightPatchColor(content.getRightPatchColor());
        }
        if (searchFormV5Payload.isToggleCellChanged()) {
            this.containerView.bindToggleCell(content.getToggleCell(), this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchFormV5VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.updateVoData(item.getContent());
        this.containerView.bind(item.getContent(), this.actionHandler);
    }
}

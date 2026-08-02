package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import Ae.B0;
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
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4Payload;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4View;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.HomeScreenStatePublisher;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnFromAnotherPageOrBackgroundObserver;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004BC\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010!\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J#\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%H\u0014¢\u0006\u0004\b)\u0010+J\u000f\u0010,\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010\u0018J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000501H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J)\u0010=\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4View;", "containerView", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "viewModel", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;", "lifecycleObserver", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LVg/d;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4View;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "observeLifecycleFragmentObserver", "()V", "observeRefreshEvent", "handleRefreshEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "asyncSwapParams", "", "processSwapAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;Ll20/d;)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4View;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "searchFormView", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewModel;", "widgetViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4WidgetViewHolder extends k<SearchFormV4VO> implements AsyncWidgetCallbacks<SearchFormV4VO.Content> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SearchFormV4View containerView;
    private final ReturnFromAnotherPageOrBackgroundObserver lifecycleObserver;

    @NotNull
    private final ComposerReferences references;
    private final SearchFormV4View searchFormView;

    @NotNull
    private final l tokenizedAnalytics;
    private final SearchFormV4ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormV4WidgetViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull SearchFormV4View containerView, SearchFormV4ViewModel searchFormV4ViewModel, ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.viewModel = searchFormV4ViewModel;
        this.lifecycleObserver = returnFromAnotherPageOrBackgroundObserver;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new SearchFormV4WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new SearchFormV4WidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.searchFormView = containerView == null ? null : containerView;
    }

    private final SearchFormV4WidgetViewModel getWidgetViewModel() {
        return (SearchFormV4WidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRefreshEvent() {
        String asyncData;
        SearchFormV4VO boundData = getBoundData();
        if (boundData == null || (asyncData = boundData.getAsyncData()) == null) {
            return;
        }
        SearchFormV4WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.fetchWidget(asyncData);
        }
        this.containerView.showLoader();
    }

    private final void observeLifecycleFragmentObserver() {
        HomeScreenStatePublisher homeScreenStatePublisher;
        ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver = this.lifecycleObserver;
        if (returnFromAnotherPageOrBackgroundObserver == null || (homeScreenStatePublisher = returnFromAnotherPageOrBackgroundObserver.getHomeScreenStatePublisher()) == null) {
            return;
        }
        this.references.getContainer().g().getLifecycle().a(homeScreenStatePublisher);
    }

    private final void observeRefreshEvent() {
        B0<Unit> refreshEventFlow;
        SearchFormV4ViewModel searchFormV4ViewModel = this.viewModel;
        if (searchFormV4ViewModel == null || (refreshEventFlow = searchFormV4ViewModel.getRefreshEventFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(refreshEventFlow, new SearchFormV4WidgetViewHolder$observeRefreshEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processSwapAction(AtomAction action, Map<String, String> asyncSwapParams) {
        String asyncData;
        SearchFormV4VO.Content content;
        if (action instanceof AtomAction.ComposerAction) {
            String lowerCase = ((AtomAction.ComposerAction) action).getActionName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (h.t(lowerCase, "swap", false)) {
                boolean z11 = asyncSwapParams == null || asyncSwapParams.isEmpty();
                SearchFormV4VO boundData = getBoundData();
                if (boundData != null && (content = boundData.getContent()) != null) {
                    content.setAreLocationsSwapped(true);
                }
                if (!z11) {
                    SearchFormV4VO boundData2 = getBoundData();
                    if (boundData2 != null && (asyncData = boundData2.getAsyncData()) != null) {
                        SearchFormV4WidgetViewModel widgetViewModel = getWidgetViewModel();
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
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<SearchFormV4VO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(SearchFormV4Update.m1275boximpl(SearchFormV4Update.m1276constructorimpl(fetchedModel.getFetchedState())));
        this.containerView.hideLoader();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        NotificationBarUtilsKt.showDefaultError(this.references.getContainer());
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
        observeLifecycleFragmentObserver();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        SearchFormV4WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchFormV4VO item, @NotNull c trackingData, f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchFormV4WidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getContent().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchFormV4VO item, @NotNull l20.d info, @NotNull Object payload) {
        SearchFormV4View searchFormV4View;
        SearchFormV4View searchFormV4View2;
        SearchFormV4View searchFormV4View3;
        SearchFormV4View searchFormV4View4;
        SearchFormV4View searchFormV4View5;
        SearchFormV4View searchFormV4View6;
        SearchFormV4View searchFormV4View7;
        SearchFormV4View searchFormV4View8;
        SearchFormV4View searchFormV4View9;
        SearchFormV4View searchFormV4View10;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        SearchFormV4ViewModel searchFormV4ViewModel = this.viewModel;
        if (searchFormV4ViewModel != null) {
            searchFormV4ViewModel.updateVoData(item.getContent());
        }
        if (!(payload instanceof SearchFormV4Payload)) {
            super.bind((SearchFormV4WidgetViewHolder) item, info, payload);
            return;
        }
        SearchFormV4VO.Content content = item.getContent();
        SearchFormV4Payload searchFormV4Payload = (SearchFormV4Payload) payload;
        if (searchFormV4Payload.areLocationsChanged() && (searchFormV4View10 = this.searchFormView) != null) {
            searchFormV4View10.bindLocations(content.getLocations(), searchFormV4Payload.isDepartureAnimated(), searchFormV4Payload.isDestinationAnimated(), this.actionHandler);
        }
        if (searchFormV4Payload.areLocationsSwapped() && (searchFormV4View9 = this.searchFormView) != null) {
            searchFormV4View9.swapLocations(content.getLocations());
        }
        if (searchFormV4Payload.isDateChanged() && (searchFormV4View8 = this.searchFormView) != null) {
            searchFormV4View8.bindDateField(content.getDateField(), true, this.actionHandler);
        }
        if (searchFormV4Payload.isDateActionChanged() && (searchFormV4View7 = this.searchFormView) != null) {
            searchFormV4View7.updateDateFieldModel(content.getDateField());
        }
        if (searchFormV4Payload.isRightFieldChanged() && (searchFormV4View6 = this.searchFormView) != null) {
            searchFormV4View6.bindRightField(content.getRightField(), true, this.actionHandler);
        }
        if (searchFormV4Payload.isRightFieldActionChanged() && (searchFormV4View5 = this.searchFormView) != null) {
            searchFormV4View5.updateRightFieldModel(content.getRightField());
        }
        if (searchFormV4Payload.isTouristFieldChanged() && (searchFormV4View4 = this.searchFormView) != null) {
            searchFormV4View4.bindTouristField(content.getTouristField(), true, this.actionHandler);
        }
        if (searchFormV4Payload.isTouristFieldActionChanged() && (searchFormV4View3 = this.searchFormView) != null) {
            searchFormV4View3.updateTouristFieldModel(content.getTouristField());
        }
        if (searchFormV4Payload.isSearchButtonChanged() && (searchFormV4View2 = this.searchFormView) != null) {
            searchFormV4View2.bindSearchButton(content.getSearchButton(), this.actionHandler);
        }
        if (searchFormV4Payload.isToggleCellChanged() && (searchFormV4View = this.searchFormView) != null) {
            searchFormV4View.bindToggleCell(content.getToggleCell(), this.actionHandler);
        }
        SearchFormV4View searchFormV4View11 = this.searchFormView;
        if (searchFormV4View11 != null) {
            searchFormV4View11.batchingUpdates = true;
            try {
                if (((SearchFormV4Payload) payload).isBackgroundChanged()) {
                    this.searchFormView.bindBackgroundColor(content.getBackgroundColor());
                }
                if (((SearchFormV4Payload) payload).isCornerRadiusChanged()) {
                    this.searchFormView.bindCornerRadius(content.getCornerRadius());
                }
                if (((SearchFormV4Payload) payload).isLeftPatchChanged()) {
                    this.searchFormView.bindLeftPatchColor(content.getLeftPatchColor());
                }
                if (((SearchFormV4Payload) payload).isRightPathcChanged()) {
                    this.searchFormView.bindRightPatchColor(content.getRightPatchColor());
                }
                searchFormV4View11.batchingUpdates = false;
                if (searchFormV4View11.invalidateRequested) {
                    searchFormV4View11.invalidateRequested = false;
                    searchFormV4View11.invalidate();
                }
            } catch (Throwable th2) {
                searchFormV4View11.batchingUpdates = false;
                if (searchFormV4View11.invalidateRequested) {
                    searchFormV4View11.invalidateRequested = false;
                    searchFormV4View11.invalidate();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchFormV4VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SearchFormV4ViewModel searchFormV4ViewModel = this.viewModel;
        if (searchFormV4ViewModel != null) {
            searchFormV4ViewModel.updateVoData(item.getContent());
        }
        SearchFormV4View searchFormV4View = this.searchFormView;
        if (searchFormV4View != null) {
            searchFormV4View.bind(item.getContent(), this.actionHandler);
        }
    }
}

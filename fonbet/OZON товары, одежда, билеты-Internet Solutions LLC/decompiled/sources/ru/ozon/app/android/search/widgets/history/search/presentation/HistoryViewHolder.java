package ru.ozon.app.android.search.widgets.history.search.presentation;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.o;
import U7.d;
import Ve.C4598rp;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.suggest.SuggestCacheGroup;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.search.widgets.commonTapTags.SuggestedTapTagClickKey;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryVO;
import ru.ozon.app.android.search.widgets.history.search.presentation.adapter.HistoryItemAdapter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipShowService;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 G2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001GB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010,\u001a\u00060*j\u0002`+H\u0014¢\u0006\u0004\b-\u0010.J+\u0010-\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010,\u001a\u00060*j\u0002`+2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b-\u00101J\u0017\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;", "view", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "searchBarViewModel", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;", "historyViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;LWZ/l;)V", "item", "", "bindList", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;)V", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "prefetch", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "applyTapTag", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "handleViewEvent", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "observeActionFlow", "()V", "historyVO", "", "filterTagItemId", "showHistoryFiltersOnboarding", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;J)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;Ll20/d;Ljava/lang/Object;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;", "LWZ/l;", "Lkotlin/Function1;", "titleActionHandler", "Lkotlin/jvm/functions/Function1;", "itemActionHandler", "clearButtonActionHandler", "Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryItemAdapter;", "historyItemsAdapter", "Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryItemAdapter;", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipShowService;", "tooltipShowService", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipShowService;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryViewHolder extends k<HistoryVO> {

    @NotNull
    private final Function1<AtomAction, Unit> clearButtonActionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final HistoryItemAdapter historyItemsAdapter;

    @NotNull
    private final HistoryViewModel historyViewModel;

    @NotNull
    private final Function1<AtomAction, Unit> itemActionHandler;

    @NotNull
    private final ActiveSearchBarViewModel searchBarViewModel;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final Function1<AtomAction, Unit> titleActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TooltipShowService tooltipShowService;

    @NotNull
    private final HistoryView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewHolder$Companion;", "", "<init>", "()V", "REFRESH_WIDGET_ASYNC_ACTION_KEY", "", "DELETE_TAG_BUTTON_ACTION", "DELETE_CATEGORY_TAG_BUTTON_ACTION", "APPLY_TEXT_SEARCH_TAP_TAG_KEY", "DIALOG_SEARCH_APPlY_HISTORY_TAG", "TAP_TAG_TEXT_KEY", "TAP_TAG_OVERRIDE_TEXT_KEY", "DEFAULT_TOOLTIP_DISMISS_TIMEOUT", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryViewHolder(@NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull ComposerReferences composerReferences, @NotNull HistoryView view, @NotNull ActiveSearchBarViewModel searchBarViewModel, @NotNull HistoryViewModel historyViewModel, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(searchBarViewModel, "searchBarViewModel");
        Intrinsics.checkNotNullParameter(historyViewModel, "historyViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.composerReferences = composerReferences;
        this.view = view;
        this.searchBarViewModel = searchBarViewModel;
        this.historyViewModel = historyViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.titleActionHandler = new ActionHandler.Builder(composerReferences, this).customAnalyticHandler(new HistoryViewHolder$titleActionHandler$1(this)).buildHandler();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new HistoryViewHolder$itemActionHandler$1(this)).onClick(new HistoryViewHolder$itemActionHandler$2(this)).customAnalyticHandler(new HistoryViewHolder$itemActionHandler$3(this)).buildHandler();
        this.itemActionHandler = buildHandler;
        this.clearButtonActionHandler = new ActionHandler.Builder(composerReferences, this).onComposerAction(new HistoryViewHolder$clearButtonActionHandler$1(this)).customAnalyticHandler(new HistoryViewHolder$clearButtonActionHandler$2(this)).buildHandler();
        HistoryItemAdapter historyItemAdapter = new HistoryItemAdapter(searchUrlPrefetchService, buildHandler);
        this.historyItemsAdapter = historyItemAdapter;
        this.tooltipShowService = new TooltipShowService(composerReferences, true, false, true, 4, null);
        historyItemAdapter.setHasStableIds(true);
        view.getItemsRecyclerView().setAdapter(historyItemAdapter);
        observeActionFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTapTag(AtomAction.Click action) {
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("text") : null;
        if (str == null) {
            str = "";
        }
        Map<String, String> params2 = action.getParams();
        this.composerReferences.getController().update(new SuggestedTapTagClickKey(str, Boolean.parseBoolean(params2 != null ? params2.get("overrideText") : null)));
    }

    private final void bindList(HistoryVO item) {
        if (item.getPresentationSettings() == null) {
            this.historyItemsAdapter.submitList(item.getHistoryItems());
            return;
        }
        this.view.placeViews(item.getPresentationSettings().getHistoryPaddings());
        HistoryFlexLayout historyTagLayout = this.view.getHistoryTagLayout();
        historyTagLayout.setPresentationSettings(item.getPresentationSettings());
        historyTagLayout.setTags(item.getHistoryItems());
        historyTagLayout.setMode(item.getIsAllList());
        historyTagLayout.setItemActionHandlers(this.itemActionHandler, new HistoryViewHolder$bindList$1$1(this));
        historyTagLayout.invalidateAllTags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleViewEvent(AtomAction atomAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        HistoryVO boundedData = getBoundedData();
        if (boundedData == null) {
            return false;
        }
        AtomAction.ViewAction viewAction = atomAction instanceof AtomAction.ViewAction ? (AtomAction.ViewAction) atomAction : null;
        t mapToTokenizedEvent$default = (viewAction == null || (trackingInfo = viewAction.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null);
        if (mapToTokenizedEvent$default == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, mapToTokenizedEvent$default, new HistoryViewHolderKt$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(this.searchBarViewModel, null, 1, null)));
        return true;
    }

    private final void observeActionFlow() {
        C4598rp.f(this.composerReferences, new C2408n0(C5427n.a(this.searchBarViewModel.getActionFlow(), d.c(this.composerReferences), AbstractC5434v.b.STARTED), new HistoryViewHolder$observeActionFlow$1(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetch(HistoryItem item) {
        Pair pair;
        AtomActionDTO action;
        AtomActionDTO action2;
        String str = null;
        if (item instanceof HistoryItem.TagButtonVO) {
            HistoryItem.TagButtonVO tagButtonVO = (HistoryItem.TagButtonVO) item;
            CommonControlSettings common = tagButtonVO.getTagButton().getCommon();
            if (common != null && (action2 = common.getAction()) != null) {
                str = action2.getLink();
            }
            pair = new Pair(str, Boolean.valueOf(tagButtonVO.getShouldPrefetch()));
        } else {
            if (!(item instanceof HistoryItem.ButtonVO)) {
                throw new o();
            }
            HistoryItem.ButtonVO buttonVO = (HistoryItem.ButtonVO) item;
            CommonControlSettings common2 = buttonVO.getButton().getCommon();
            if (common2 != null && (action = common2.getAction()) != null) {
                str = action.getLink();
            }
            pair = new Pair(str, Boolean.valueOf(buttonVO.getShouldPrefetch()));
        }
        String str2 = (String) pair.a();
        if (!((Boolean) pair.b()).booleanValue() || str2 == null) {
            return;
        }
        SearchUrlPrefetchService.DefaultImpls.prefetch$default(this.searchUrlPrefetchService, str2, SuggestCacheGroup.INSTANCE, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHistoryFiltersOnboarding(HistoryVO historyVO, long filterTagItemId) {
        View view;
        View view2;
        TooltipVO tooltip;
        Integer onboardingDelay;
        HistoryVO.Onboarding onboarding = historyVO.getOnboarding();
        int intValue = (onboarding == null || (onboardingDelay = onboarding.getOnboardingDelay()) == null) ? 5000 : onboardingDelay.intValue();
        HistoryVO.Onboarding onboarding2 = historyVO.getOnboarding();
        if (onboarding2 != null && (tooltip = onboarding2.getTooltip()) != null) {
            tooltip.setHideByTouchOutside(true);
        }
        if (historyVO.getPresentationSettings() != null) {
            view2 = this.view.getHistoryTagLayout().findVisibleViewForItemID(filterTagItemId);
        } else {
            RecyclerView.C findViewHolderForItemId = this.view.getItemsRecyclerView().findViewHolderForItemId(filterTagItemId);
            if (findViewHolderForItemId == null) {
                view = null;
                if (view != null || this.tooltipShowService.isShowing()) {
                }
                TooltipShowService tooltipShowService = this.tooltipShowService;
                HistoryVO.Onboarding onboarding3 = historyVO.getOnboarding();
                TooltipShowService.showTooltipIfNeed$default(tooltipShowService, onboarding3 != null ? onboarding3.getTooltip() : null, view, 0, true, Long.valueOf(intValue), new HistoryViewHolder$showHistoryFiltersOnboarding$1(this), 4, null);
                this.historyViewModel.onShowHistoryFiltersOnboarding();
                return;
            }
            view2 = findViewHolderForItemId.itemView;
        }
        view = view2;
        if (view != null) {
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        InterfaceC2395h<ComposerAsyncWidgetResponse<HistoryDTO>> events = this.historyViewModel.getEvents();
        AbstractC5434v c11 = d.c(this.composerReferences);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C4598rp.f(this.composerReferences, new C2408n0(C5427n.a(events, c11, bVar), new HistoryViewHolder$onAttachViewModel$1(this, null)));
        this.historyViewModel.refreshActionLiveData().observe(this, new HistoryViewHolderKt$sam$androidx_lifecycle_Observer$0(new HistoryViewHolder$onAttachViewModel$2(this)));
        C4598rp.f(this.composerReferences, new C2408n0(C5427n.a(this.historyViewModel.getEffects(), this.composerReferences.getContainer().g().getLifecycle(), bVar), new HistoryViewHolder$onAttachViewModel$3(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HistoryVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindList(item);
        ViewExtKt.updatePadding(this.view.getTitleTextAtomView(), 0, 0, 0, 0);
        TextHolderKt.bindOrGone(this.view.getTitleTextAtomView(), item.getTitle(), this.titleActionHandler);
        ButtonV3HolderKt.bindOrGone(this.view.getClearButtonAtomView(), item.getDeleteButton(), this.clearButtonActionHandler);
        if (item.getOnboarding() == null) {
            this.historyViewModel.getSearchHistoryFiltersOnboarding(Long.valueOf(item.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HistoryVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Intrinsics.d(payload, "HistoryTagsPayloads")) {
            bindList(item);
            if (item.getOnboarding() == null) {
                this.historyViewModel.getSearchHistoryFiltersOnboarding(Long.valueOf(item.getId()));
                return;
            } else {
                this.historyViewModel.checkNeedShowHistoryFiltersOnboarding(item);
                return;
            }
        }
        if (Intrinsics.d(payload, "HistoryFiltersOnboardingPayloads")) {
            this.historyViewModel.checkNeedShowHistoryFiltersOnboarding(item);
        } else {
            bind(item, info);
        }
    }
}

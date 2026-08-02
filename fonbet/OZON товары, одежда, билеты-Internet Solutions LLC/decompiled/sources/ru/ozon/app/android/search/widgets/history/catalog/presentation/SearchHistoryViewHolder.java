package ru.ozon.app.android.search.widgets.history.catalog.presentation;

import AI.a;
import AI.b;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.suggest.SuggestCacheGroup;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\"\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryView;", "searchHistoryView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;)V", "", "setRemoveSearchItemClickListener", "()V", "setSearchItemClickListener", "item", "handleItemClick", "(Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryItemVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryItemVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchHistoryViewHolder extends k<SearchHistoryItemVO> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final SearchHistoryView searchHistoryView;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final ActiveSearchBarViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryViewHolder(@NotNull SearchHistoryView searchHistoryView, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor inhibitor, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull ActiveSearchBarViewModel viewModel) {
        super(searchHistoryView);
        Intrinsics.checkNotNullParameter(searchHistoryView, "searchHistoryView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.searchHistoryView = searchHistoryView;
        this.composerReferences = composerReferences;
        this.inhibitor = inhibitor;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.viewModel = viewModel;
        setSearchItemClickListener();
        setRemoveSearchItemClickListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleItemClick(SearchHistoryItemVO item) {
        HandlersInhibitor.run$default(this.inhibitor, 0L, new SearchHistoryViewHolder$handleItemClick$1(this, item), 1, null);
    }

    private final void setRemoveSearchItemClickListener() {
        this.searchHistoryView.getCloseIconImageView().setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRemoveSearchItemClickListener$lambda$4(SearchHistoryViewHolder searchHistoryViewHolder, View view) {
        SearchHistoryItemVO boundedData = searchHistoryViewHolder.getBoundedData();
        if (boundedData != null) {
            t removeTokenizedEvent = boundedData.getRemoveTokenizedEvent();
            if (removeTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(searchHistoryViewHolder.composerReferences.getTokenizedAnalytics(), removeTokenizedEvent, new SearchHistoryViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(searchHistoryViewHolder.viewModel, null, 1, null)));
            }
            searchHistoryViewHolder.viewModel.onRemoveHistory(boundedData.getTitle(), boundedData.getRemoveQueryActionName());
        }
    }

    private final void setSearchItemClickListener() {
        this.searchHistoryView.setOnClickListener(new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSearchItemClickListener$lambda$8(SearchHistoryViewHolder searchHistoryViewHolder, View view) {
        SearchHistoryItemVO boundedData = searchHistoryViewHolder.getBoundedData();
        if (boundedData != null) {
            t tokenizedEvent = boundedData.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(searchHistoryViewHolder.composerReferences.getTokenizedAnalytics(), tokenizedEvent, new SearchHistoryViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(searchHistoryViewHolder.viewModel, null, 1, null)));
            }
            t searchTokenizedEvent = boundedData.getSearchTokenizedEvent();
            if (searchTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(searchHistoryViewHolder.composerReferences.getTokenizedAnalytics(), searchTokenizedEvent, new SearchHistoryViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(searchHistoryViewHolder.viewModel, null, 1, null)));
            }
            if (!boundedData.getShouldPrefetch()) {
                searchHistoryViewHolder.handleItemClick(boundedData);
                return;
            }
            searchHistoryViewHolder.searchUrlPrefetchService.navigateWhenRequestPrefetched(boundedData.getDeepLink(), searchHistoryViewHolder.composerReferences.getContainer().g(), new SearchHistoryViewHolder$setSearchItemClickListener$1$1$4(searchHistoryViewHolder, boundedData), new SearchHistoryViewHolder$setSearchItemClickListener$1$1$3(searchHistoryViewHolder.composerReferences.getController()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchHistoryItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getShouldPrefetch()) {
            SearchUrlPrefetchService.DefaultImpls.prefetch$default(this.searchUrlPrefetchService, item.getDeepLink(), SuggestCacheGroup.INSTANCE, false, 4, null);
        }
        AppCompatTextView titleTextView = this.searchHistoryView.getTitleTextView();
        titleTextView.setText(item.getTitle());
        String token = item.getIsHighlighted() ? UniColors.TEXT_ACTION.getToken() : UniColors.TEXT_PRIMARY.getToken();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = titleTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        titleTextView.setTextColor(styleParser.parseColor(context, token, UniColors.TEXT_PRIMARY.getResId()));
        this.searchHistoryView.getDivider().setVisibility(item.getIsDividerVisible() ? 0 : 8);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchHistoryItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, new SearchHistoryViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(this.viewModel, null, 1, null)));
        }
    }
}

package ru.ozon.app.android.search.widgets.title.presentation;

import Nx.ViewOnClickListenerC3676a;
import WZ.t;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;", "searchTitleView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleVO;Ll20/d;)V", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchTitleViewHolder extends k<SearchTitleVO> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final SearchTitleView searchTitleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleViewHolder$Companion;", "", "<init>", "()V", "DELETE_ALL_HISTORY_MARKER", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTitleViewHolder(@NotNull SearchTitleView searchTitleView, @NotNull ComposerReferences composerReferences, @NotNull ActiveSearchBarViewModel viewModel) {
        super(searchTitleView);
        Intrinsics.checkNotNullParameter(searchTitleView, "searchTitleView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.searchTitleView = searchTitleView;
        this.composerReferences = composerReferences;
        searchTitleView.getClearTextView().setOnClickListener(new ViewOnClickListenerC3676a(3, this, viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(SearchTitleViewHolder searchTitleViewHolder, ActiveSearchBarViewModel activeSearchBarViewModel, View view) {
        SearchTitleVO boundedData = searchTitleViewHolder.getBoundedData();
        if (boundedData != null) {
            t clearHistoryTokenizedEvent = boundedData.getClearHistoryTokenizedEvent();
            if (clearHistoryTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(searchTitleViewHolder.composerReferences.getTokenizedAnalytics(), clearHistoryTokenizedEvent, new SearchTitleViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(activeSearchBarViewModel, null, 1, null)));
            }
            String actionName = boundedData.getActionName();
            if (actionName != null) {
                activeSearchBarViewModel.onRemoveHistory("", actionName);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ViewExtKt.showOrGone(this.searchTitleView.getClearTextView(), Boolean.valueOf(item.getActionName() != null));
        AppCompatTextView titleTextView = this.searchTitleView.getTitleTextView();
        titleTextView.setText(item.getTitle());
        titleTextView.setSelected(true);
    }
}

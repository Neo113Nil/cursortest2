package ru.ozon.app.android.search.widgets.suggestions.di;

import Pc.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionWithFilterMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterSharedViewModel;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0001\u001fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchViewModel;", "getSuggestionsPrefetchViewModelProvider", "()LPc/a;", "suggestionsPrefetchViewModelProvider", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;", "getSuggestionWithFilterSharedViewModelProvider", "suggestionWithFilterSharedViewModelProvider", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "getActiveSearchBarViewModelProvider", "activeSearchBarViewModelProvider", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SuggestionsWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SuggestionsWidgetComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new SuggestionsWidgetComponent$Companion$create$1(storage);
        }
    }

    @NotNull
    a<ActiveSearchBarViewModel> getActiveSearchBarViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    SuggestionWithFilterMapper getMapper();

    @NotNull
    a<SuggestionWithFilterSharedViewModel> getSuggestionWithFilterSharedViewModelProvider();

    @NotNull
    a<SuggestionsPrefetchViewModel> getSuggestionsPrefetchViewModelProvider();

    @NotNull
    l getTokenizedAnalytics();
}

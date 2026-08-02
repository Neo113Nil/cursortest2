package ru.ozon.app.android.search.widgets.tapTags.v3.di;

import Av.C2447a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3Mapper;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/di/TapTagsV3WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3Mapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3Mapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "getTapTagsV3ViewModel", "()Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "tapTagsV3ViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "getActiveSearchBarViewModel", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TapTagsV3WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/di/TapTagsV3WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/tapTags/v3/di/TapTagsV3WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TapTagsV3WidgetComponent create$lambda$0(final C7475g c7475g) {
            return new TapTagsV3WidgetComponent(c7475g) { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;
                private final CustomActionHandlersComponentApi actionHandlersApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TapTagsV3WidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;

                {
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.actionHandlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                private final SearchHistoryRepository getSearchHistoryRepository() {
                    return this.searchHistoryRepositoryComponentApi.getSearchHistoryRepository();
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public ActiveSearchBarViewModel getActiveSearchBarViewModel() {
                    return new ActiveSearchBarViewModel(this.networkComponentApi.getFeatureChecker(), getSearchHistoryRepository());
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public TapTagsV3Mapper getMapper() {
                    return (TapTagsV3Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public TapTagsV3ViewModel getTapTagsV3ViewModel() {
                    return new TapTagsV3ViewModel(getFeatureChecker(), this.actionComponentApi.getActionRepository());
                }

                @Override // ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<TapTagsV3WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TapTagsV3WidgetComponent.class), new C2447a(storage, 7));
        }
    }

    @NotNull
    ActiveSearchBarViewModel getActiveSearchBarViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    TapTagsV3Mapper getMapper();

    @NotNull
    TapTagsV3ViewModel getTapTagsV3ViewModel();

    @NotNull
    l getTokenizedAnalytics();
}

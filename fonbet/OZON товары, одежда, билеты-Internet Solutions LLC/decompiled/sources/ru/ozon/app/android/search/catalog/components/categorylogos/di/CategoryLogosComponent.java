package ru.ozon.app.android.search.catalog.components.categorylogos.di;

import AR.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.catalog.components.categorylogos.core.CategoryLogosMapper;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/di/CategoryLogosComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/catalog/components/categorylogos/core/CategoryLogosMapper;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/categorylogos/core/CategoryLogosMapper;", "mapper", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewModel;", "viewModel", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CategoryLogosComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/di/CategoryLogosComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/catalog/components/categorylogos/di/CategoryLogosComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CategoryLogosComponent create$lambda$0(final C7475g c7475g) {
            return new CategoryLogosComponent(c7475g) { // from class: ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent$Companion$create$1$1
                private final AccountComponentApi accountComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(CategoryLogosComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: viewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModel = k.b(CategoryLogosComponent$Companion$create$1$1$viewModel$2.INSTANCE);

                {
                    this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                }

                @Override // ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent
                public AdultHandler getAdultHandler() {
                    return this.accountComponentApi.getAdultHandler();
                }

                @Override // ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent
                public CategoryLogosMapper getMapper() {
                    return (CategoryLogosMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent
                public CategoryLogosWidgetViewModel getViewModel() {
                    return (CategoryLogosWidgetViewModel) this.viewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<CategoryLogosComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CategoryLogosComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    CategoryLogosMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CategoryLogosWidgetViewModel getViewModel();
}

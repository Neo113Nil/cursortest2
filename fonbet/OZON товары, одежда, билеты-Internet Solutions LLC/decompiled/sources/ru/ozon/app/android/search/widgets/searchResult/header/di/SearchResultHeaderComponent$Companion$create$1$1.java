package ru.ozon.app.android.search.widgets.searchResult.header.di;

import GZ.g;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\u00060\u0014j\u0002`\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"ru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/minifyLink/di/MinifyLinkComponentApi;", "minifyLinkComponentApi", "Lru/ozon/app/android/minifyLink/di/MinifyLinkComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "favoritesDataComponentApi", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "LSc/j;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor$delegate", "getFavoriteEntityInteractor", "()Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "getFavoriteEntityComposeDelegateFactory", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "favoriteEntityComposeDelegateFactory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultHeaderComponent$Companion$create$1$1 implements SearchResultHeaderComponent {
    private final FavoriteComponentApi favoriteComponentApi;
    private final FavoritesDataComponentApi favoritesDataComponentApi;
    private final MinifyLinkComponentApi minifyLinkComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new SearchResultHeaderComponent$Companion$create$1$1$tokenizedAnalytics$2(this));
    private final a<MinifyLinkViewModel> viewModelProvider = new NI.a(this, 0);

    /* renamed from: favoriteEntityInteractor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteEntityInteractor = k.b(new SearchResultHeaderComponent$Companion$create$1$1$favoriteEntityInteractor$2(this));

    SearchResultHeaderComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        this.minifyLinkComponentApi = (MinifyLinkComponentApi) c7475g.getComponent(MinifyLinkComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.favoritesDataComponentApi = (FavoritesDataComponentApi) c7475g.getComponent(FavoritesDataComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MinifyLinkViewModel viewModelProvider$lambda$0(SearchResultHeaderComponent$Companion$create$1$1 searchResultHeaderComponent$Companion$create$1$1) {
        return new MinifyLinkViewModel(searchResultHeaderComponent$Companion$create$1$1.minifyLinkComponentApi.getMinifyLinkRepository());
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public FavoriteEntityComposeDelegateFactory getFavoriteEntityComposeDelegateFactory() {
        return this.favoriteComponentApi.getFavoriteEntityComposeDelegateFactory();
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public FavoriteEntityInteractor getFavoriteEntityInteractor() {
        return (FavoriteEntityInteractor) this.favoriteEntityInteractor.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public g getRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent
    public a<MinifyLinkViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}

package ru.ozon.app.android.search.widgets.searchResult.header.di;

import Ev.C2973a;
import GZ.g;
import Pc.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "LPc/a;", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "getFavoriteEntityInteractor", "()Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "getFavoriteEntityComposeDelegateFactory", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "favoriteEntityComposeDelegateFactory", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchResultHeaderComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchResultHeaderComponent create$lambda$0(C7475g c7475g) {
            return new SearchResultHeaderComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<SearchResultHeaderComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SearchResultHeaderComponent.class), new C2973a(storage, 3));
        }
    }

    @NotNull
    FavoriteEntityComposeDelegateFactory getFavoriteEntityComposeDelegateFactory();

    @NotNull
    FavoriteEntityInteractor getFavoriteEntityInteractor();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    g getRouter();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    a<MinifyLinkViewModel> getViewModelProvider();
}

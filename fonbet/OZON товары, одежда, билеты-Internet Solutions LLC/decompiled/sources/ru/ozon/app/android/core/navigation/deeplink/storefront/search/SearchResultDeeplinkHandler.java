package ru.ozon.app.android.core.navigation.deeplink.storefront.search;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.b;
import JZ.a;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import com.google.android.gms.common.Scopes;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutui.configurators.CheckoutRefreshConfigurator;
import ru.ozon.app.android.common.productselectormobile.util.AutopickerResultConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler;
import ru.ozon.app.android.composer.navigator.redirect.RedirectStrategy;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.core.navigation.deeplink.storefront.search.precreate.CategoryMainPageFreshPreCreationConfigurator;
import ru.ozon.app.android.core.navigation.deeplink.storefront.search.precreate.CategoryPreCreationConfigurator;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.domain.flags.HideTabBarCompletelyOnSearchAndCategory;
import ru.ozon.app.android.domain.flags.HideTabBarCompletelyOnSeller;
import ru.ozon.app.android.domain.flags.SellerMiniappDisabled;
import ru.ozon.app.android.favorites.ui.configurators.CatalogFavoritesConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.fresh.navigation.FreshNavigationAdditions;
import ru.ozon.app.android.fresh.navigation.configurators.CategoryMainPageFreshConfigurator;
import ru.ozon.app.android.navigation.handlers.page.CategoryPageInfo;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.precreation.configurators.SearchPreCreationConfigurator;
import ru.ozon.app.android.search.SearchHideKeyboardOnOpenConfigurator;
import ru.ozon.app.android.search.deeplink.FeedbackTilePreCreationConfigurator;
import ru.ozon.app.android.search.flags.RetainSearchScreenOnRedirect;
import ru.ozon.app.android.storefront.configurators.SharedViewPoolSizeSetterConfigurator;
import ru.ozon.app.android.storefront.deeplinkhandlers.CategoryReviewDeeplinkProcessor;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u001b\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J%\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 0\u001f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\rJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\rJ\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\rJ\u0013\u0010(\u001a\u00020\u000b*\u00020\tH\u0002¢\u0006\u0004\b(\u0010\rJ\u0013\u0010)\u001a\u00020\u000b*\u00020\tH\u0002¢\u0006\u0004\b)\u0010\rJ\u0013\u0010*\u001a\u00020\u000b*\u00020\tH\u0002¢\u0006\u0004\b*\u0010\rJ\u001b\u0010+\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b+\u0010\u0018J#\u0010-\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/search/SearchResultDeeplinkHandler;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectDeeplinkHandler;", "LIZ/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroid/net/Uri;", "deeplink", "", "shouldOpenInModal", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Landroid/content/Context;Ljava/lang/String;LGZ/j;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "checkExcludedDeeplink", "(LGZ/j;)Z", "isNavigationUpEnabled", "uri", "isNeedToHideTabbar", "isFullScreenOnSearchAndCategory", "isFullScreenOnSeller", "isCurrentDeeplinkHandler", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Landroid/net/Uri;)Ljava/util/Set;", "isFreshMainPage", "shouldUseCategoryMainPageFreshPreCreationConfigurator", "shouldUseCategoryPreCreationConfigurator", "shouldUseSearchPreCreationConfigurator", "isSearchByImageOnboarding", "isSearchOrCategory", "isFresh", "canHandle", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "origin", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "handleRedirect", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "LJZ/a;", "getPageInfo", "()LJZ/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchResultDeeplinkHandler implements RedirectDeeplinkHandler, b {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final List<String> authorities = C7714v.b0("search", "highlight", "ozonify", "brand", "bookname", "person", "series", "publisher", "distributor", "filmstudio", "seller", "search-by-image");

    @NotNull
    private static final List<String> excludePathSegments = C7714v.b0("ozon-global", "populyarnye-tovary-1551703", "tovary-narashvat-1789580", "ozon-fashion-1322701", "fashion-selection", "sp");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/search/SearchResultDeeplinkHandler$Companion;", "", "<init>", "()V", "", "SP_PATH", "Ljava/lang/String;", "SEARCH_TEXT_QUERY_PARAM", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchResultDeeplinkHandler(@NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureChecker = featureChecker;
        this.featureService = featureService;
    }

    private final boolean checkExcludedDeeplink(j route) {
        if (!CategoryReviewDeeplinkProcessor.INSTANCE.canHandle(route)) {
            String authority = route.b().getAuthority();
            List<String> pathSegments = route.b().getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            String str = (String) C7714v.M(pathSegments);
            if (!C7714v.A(excludePathSegments, str) && (!Intrinsics.d(authority, "highlight") || str == null || !h.e0(str, "kabinet-blogera", false))) {
                return false;
            }
        }
        return true;
    }

    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators(Uri deeplink) {
        Tc.j builder = new Tc.j();
        Class[] elements = {SearchHideKeyboardOnOpenConfigurator.class, SharedViewPoolSizeSetterConfigurator.class, CatalogFavoritesConfigurator.class, CreateShoppingListConfigurator.class, AutopickerResultConfigurator.class, CreateAndPayConfigurator.class, FeedbackTilePreCreationConfigurator.class, CheckoutRefreshConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        builder.addAll(C7705l.j0(elements));
        if (shouldUseCategoryMainPageFreshPreCreationConfigurator(deeplink)) {
            builder.add(CategoryMainPageFreshPreCreationConfigurator.class);
        } else if (isFreshMainPage(deeplink)) {
            builder.add(CategoryMainPageFreshConfigurator.class);
        } else if (shouldUseCategoryPreCreationConfigurator(deeplink)) {
            builder.add(CategoryPreCreationConfigurator.class);
        } else if (shouldUseSearchPreCreationConfigurator(deeplink)) {
            builder.add(SearchPreCreationConfigurator.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    private final ComposerScreenConfig getScreenConfig(Context context, String deeplink, j route) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        boolean isNavigationUpEnabled = isNavigationUpEnabled(route.b());
        Integer valueOf = Integer.valueOf(R$color.bg_dark_key);
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, isNavigationUpEnabled, null, null, appTypeResolver.isSelect(context) ? valueOf : null, null, 41, null), 0, 2, null);
        Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators = getConfigurators(route.b());
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        return new ComposerScreenConfig(aVar, toolbarConfig, false, null, true, false, false, true, null, false, false, isNeedToHideTabbar(route.b()), configurators, null, null, !appTypeResolver.isSelect(context) ? m682boximpl : null, false, null, null, 48, false, false, null, null, 16213836, null);
    }

    private final boolean isCurrentDeeplinkHandler(j route) {
        return canHandle(route) && isNeedToHideTabbar(route.b()) == isNeedToHideTabbar(route.d()) && isFreshMainPage(route.b()) == isFreshMainPage(route.d()) && Intrinsics.d(route.b().getQueryParameter("miniapp"), route.d().getQueryParameter("miniapp"));
    }

    private final boolean isFresh(Uri uri) {
        if (Intrinsics.d(uri.getAuthority(), "category")) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C5766e.c(uri, "getPathSegments(...)", 0, "25000") && uri.getQueryParameterNames().contains("miniapp")) {
                String queryParameter = uri.getQueryParameter("miniapp");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (queryParameter.equals("supermarket")) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isFreshMainPage(Uri deeplink) {
        boolean z11;
        String uri = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (!kotlin.text.h.t(uri, "25000", false)) {
            String uri2 = deeplink.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            if (!kotlin.text.h.t(uri2, "25001", false)) {
                z11 = false;
                return (z11 || deeplink.getQueryParameterNames().contains("text")) ? false : true;
            }
        }
        z11 = true;
        if (z11) {
        }
    }

    private final boolean isFullScreenOnSearchAndCategory(Uri uri) {
        return this.featureChecker.isEnabled(HideTabBarCompletelyOnSearchAndCategory.INSTANCE) && !MiniAppExtKt.isMiniApp(uri) && isSearchOrCategory(uri);
    }

    private final boolean isFullScreenOnSeller(Uri uri) {
        return !this.featureChecker.isEnabled(SellerMiniappDisabled.INSTANCE) && this.featureChecker.isEnabled(HideTabBarCompletelyOnSeller.INSTANCE) && MiniAppExtKt.isMiniApp(uri) && Intrinsics.d(uri.getAuthority(), "seller");
    }

    private final boolean isNavigationUpEnabled(Uri deeplink) {
        boolean isMiniApp = MiniAppExtKt.isMiniApp(deeplink);
        boolean z11 = isMiniApp && Intrinsics.d(deeplink.getAuthority(), "seller") && !this.featureChecker.isEnabled(SellerMiniappDisabled.INSTANCE);
        boolean contains = deeplink.getQueryParameterNames().contains("text");
        boolean c11 = C5766e.c(deeplink, "getPathSegments(...)", 1, Scopes.PROFILE);
        if (!z11 || contains || c11) {
            return (isMiniApp && isFresh(deeplink)) ? false : true;
        }
        return false;
    }

    private final boolean isNeedToHideTabbar(Uri uri) {
        return isFullScreenOnSearchAndCategory(uri) || isFullScreenOnSeller(uri);
    }

    private final boolean isSearchByImageOnboarding(Uri uri) {
        if (Intrinsics.d(uri.getAuthority(), "search-by-image")) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C5766e.c(uri, "getPathSegments(...)", 0, "onboarding")) {
                return true;
            }
        }
        return false;
    }

    private final boolean isSearchOrCategory(Uri uri) {
        return Intrinsics.d(uri.getAuthority(), "search") || Intrinsics.d(uri.getAuthority(), "category");
    }

    private final boolean shouldOpenInModal(Uri deeplink) {
        return FreshNavigationAdditions.INSTANCE.isFreshPdpSource(deeplink);
    }

    private final boolean shouldUseCategoryMainPageFreshPreCreationConfigurator(Uri deeplink) {
        if (!kotlin.text.h.K(this.featureService.getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE)) && Intrinsics.d(deeplink.getAuthority(), "category")) {
            List<String> pathSegments = deeplink.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C5766e.c(deeplink, "getPathSegments(...)", 0, "25000") && deeplink.getQueryParameterNames().contains("miniapp")) {
                String queryParameter = deeplink.getQueryParameter("miniapp");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (queryParameter.equals("supermarket")) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean shouldUseCategoryPreCreationConfigurator(Uri deeplink) {
        if (!"category".equals(deeplink.getAuthority())) {
            return false;
        }
        List<String> pathSegments = deeplink.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return !pathSegments.isEmpty();
    }

    private final boolean shouldUseSearchPreCreationConfigurator(Uri deeplink) {
        return "search".equals(deeplink.getAuthority());
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (checkExcludedDeeplink(route) || isSearchByImageOnboarding(route.b())) {
            return false;
        }
        if (C7714v.A(authorities, route.b().getAuthority())) {
            return true;
        }
        return "category".equals(route.b().getAuthority()) && !C2860c.c(route, "getPathSegments(...)").isEmpty();
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        if (shouldOpenInModal(route.b())) {
            return new BottomSheetComposerFragmentDestination(a11, getScreenConfig(context, a11, route), C9992d.b.c.f100438a, null, null, null, 56, null);
        }
        return new ComposerTabRequiredFragmentDestination(getScreenConfig(context, a11, route), a11, null, false, null, false, 60, null);
    }

    @Override // IZ.b
    @NotNull
    public a getPageInfo() {
        return new CategoryPageInfo();
    }

    @Override // ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler
    @NotNull
    public RedirectStrategy handleRedirect(@NotNull String origin, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.featureChecker.isEnabled(RetainSearchScreenOnRedirect.INSTANCE)) {
            return RedirectStrategy.Navigate.INSTANCE;
        }
        Uri parse = Uri.parse(deeplink);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        Uri parse2 = Uri.parse(origin);
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
        return isCurrentDeeplinkHandler(new j(parse, parse2)) ? RedirectStrategy.Refresh.INSTANCE : RedirectStrategy.Navigate.INSTANCE;
    }
}

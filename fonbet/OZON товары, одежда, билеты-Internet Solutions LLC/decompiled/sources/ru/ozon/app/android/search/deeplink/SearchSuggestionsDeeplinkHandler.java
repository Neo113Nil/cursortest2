package ru.ozon.app.android.search.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.KeepSuggestionsEnabledFlag;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchLinkGenerator;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModelKt;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;
import sZ.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\b*\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n*\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\n*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n*\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u001b\u0010\u001c\u001a\u00020\n2\n\u0010\u001b\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010\u001b\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001b\u0010'\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u00100¨\u00066"}, d2 = {"Lru/ozon/app/android/search/deeplink/SearchSuggestionsDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/utils/AppType;)V", "", "deeplink", "", "isDialogSearch", "(Ljava/lang/String;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "key", "getDeeplinkParam", "(LGZ/j;Ljava/lang/String;)Ljava/lang/String;", "isFreshMiniapp", "(LGZ/j;)Z", "Landroid/net/Uri;", "default", "addFragmentToBackStack", "(Landroid/net/Uri;Z)Z", "isFavoriteFlow", "(Landroid/net/Uri;)Z", "isFreshSuborders", "route", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "catalogInSearchSuggestionsEnabled$delegate", "LSc/j;", "getCatalogInSearchSuggestionsEnabled", "()Z", "catalogInSearchSuggestionsEnabled", "backButtonInsteadOfCancelButton$delegate", "getBackButtonInsteadOfCancelButton", "backButtonInsteadOfCancelButton", "isSelect", "Z", "LsZ/c$b;", "transitionAnimation$delegate", "getTransitionAnimation", "()LsZ/c$b;", "transitionAnimation", "transitionAnimationForBackButton$delegate", "getTransitionAnimationForBackButton", "transitionAnimationForBackButton", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchSuggestionsDeeplinkHandler implements a {

    /* renamed from: backButtonInsteadOfCancelButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backButtonInsteadOfCancelButton;

    /* renamed from: catalogInSearchSuggestionsEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j catalogInSearchSuggestionsEnabled;

    @NotNull
    private final FeatureChecker featureChecker;
    private final boolean isSelect;

    /* renamed from: transitionAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionAnimation;

    /* renamed from: transitionAnimationForBackButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionAnimationForBackButton;
    public static final int $stable = 8;

    public SearchSuggestionsDeeplinkHandler(@NotNull FeatureChecker featureChecker, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.featureChecker = featureChecker;
        this.catalogInSearchSuggestionsEnabled = LazyUtilsKt.unsafeLazy(new SearchSuggestionsDeeplinkHandler$catalogInSearchSuggestionsEnabled$2(this));
        this.backButtonInsteadOfCancelButton = LazyUtilsKt.unsafeLazy(new SearchSuggestionsDeeplinkHandler$backButtonInsteadOfCancelButton$2(this));
        this.isSelect = appType == AppType.SELECT;
        this.transitionAnimation = LazyUtilsKt.unsafeLazy(SearchSuggestionsDeeplinkHandler$transitionAnimation$2.INSTANCE);
        this.transitionAnimationForBackButton = LazyUtilsKt.unsafeLazy(SearchSuggestionsDeeplinkHandler$transitionAnimationForBackButton$2.INSTANCE);
    }

    private final boolean addFragmentToBackStack(Uri uri, boolean z11) {
        if (isFavoriteFlow(uri)) {
            return true;
        }
        return z11;
    }

    private final boolean getBackButtonInsteadOfCancelButton() {
        return ((Boolean) this.backButtonInsteadOfCancelButton.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCatalogInSearchSuggestionsEnabled() {
        return ((Boolean) this.catalogInSearchSuggestionsEnabled.getValue()).booleanValue();
    }

    private final String getDeeplinkParam(j jVar, String str) {
        return jVar.b().getQueryParameter(str);
    }

    private final c.b getTransitionAnimation() {
        return (c.b) this.transitionAnimation.getValue();
    }

    private final c.b getTransitionAnimationForBackButton() {
        return (c.b) this.transitionAnimationForBackButton.getValue();
    }

    private final boolean isDialogSearch(String deeplink) {
        return ActiveSearchBarViewModelKt.isFreshPage(deeplink) && getCatalogInSearchSuggestionsEnabled();
    }

    private final boolean isFavoriteFlow(Uri uri) {
        return uri.getPathSegments().contains("favorites");
    }

    private final boolean isFreshMiniapp(j jVar) {
        return Intrinsics.d(getDeeplinkParam(jVar, "miniapp"), "supermarket");
    }

    private final boolean isFreshSuborders(j jVar) {
        return Lh.a.f(jVar, "fresh_suborders");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "searchSuggestions") || Lh.a.f(route, "fresh_suborders");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String deeplinkParam = getDeeplinkParam(route, "search_screen_deeplink");
        if (deeplinkParam == null && (deeplinkParam = getDeeplinkParam(route, "deepLink")) == null) {
            deeplinkParam = Kk.c.c(route, "toString(...)");
        }
        String str = deeplinkParam;
        String deeplinkParam2 = getDeeplinkParam(route, "search_text");
        if (deeplinkParam2 == null) {
            deeplinkParam2 = getDeeplinkParam(route, "text");
        }
        String pageLink = SearchLinkGenerator.INSTANCE.getPageLink(str, deeplinkParam2 == null ? "" : deeplinkParam2);
        boolean z11 = getBackButtonInsteadOfCancelButton() && isFreshMiniapp(route);
        Object obj = route.e().get("navBarModel");
        StaticNavBarModel staticNavBarModel = obj instanceof StaticNavBarModel ? (StaticNavBarModel) obj : null;
        if (staticNavBarModel == null) {
            StaticNavBarModel.Companion companion = StaticNavBarModel.INSTANCE;
            if (deeplinkParam2 == null) {
                deeplinkParam2 = "";
            }
            staticNavBarModel = companion.createEmpty(context, str, deeplinkParam2, SearchBarUtilsKt.getSearchBarDefaultRadius(this.isSelect, this.featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE)));
        }
        StaticNavBarModel copy$default = StaticNavBarModel.copy$default(staticNavBarModel, null, false, false, false, null, null, StaticNavBarModel.NavBarInfo.copy$default(staticNavBarModel.getNavBarInfo(), z11, null, null, 6, null), 63, null);
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        boolean addFragmentToBackStack = addFragmentToBackStack(parse, this.featureChecker.isEnabled(KeepSuggestionsEnabledFlag.INSTANCE));
        boolean isDialogSearch = isDialogSearch(str);
        boolean t2 = h.t(str, "parent_order_number", false);
        boolean isFreshSuborders = isFreshSuborders(route);
        SearchSuggestionsFragment.Companion companion2 = SearchSuggestionsFragment.INSTANCE;
        h.c.a aVar = new h.c.a(pageLink, (String) null, (String) null, 14);
        boolean z12 = !isDialogSearch || t2 || isFreshSuborders;
        int resId = this.isSelect ? UniColorsSelect.LAYER_FLOOR_0_SELECT.getResId() : UniColors.LAYER_FLOOR_1.getResId();
        boolean z13 = !this.isSelect;
        Class[] elements = {SuggestionsPrefetchConfigurator.class, RemoveRVItemAnimationConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new c(str, companion2.newInstance(new ComposerScreenConfig(aVar, null, false, null, isDialogSearch, false, false, false, null, false, false, z12, C7705l.j0(elements), null, Integer.valueOf(resId), BackgroundColorResource.m682boximpl(this.isSelect ? BackgroundColorResource.m683constructorimpl(R$color.layer_floor_0_select) : BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1)), z13, null, null, null, true, false, null, null, 15607724, null), copy$default), null, false, addFragmentToBackStack, z11 ? getTransitionAnimationForBackButton() : getTransitionAnimation(), false, false, false, 460, null);
    }
}

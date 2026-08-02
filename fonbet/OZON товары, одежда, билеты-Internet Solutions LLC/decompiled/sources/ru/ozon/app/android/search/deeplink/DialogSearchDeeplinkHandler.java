package ru.ozon.app.android.search.deeplink;

import D40.d;
import GZ.j;
import IZ.a;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.search.R$anim;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchLinkGenerator;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import sZ.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f*\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f*\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f*\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0014\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/deeplink/DialogSearchDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "routeUrl", "searchBarHint", "Landroidx/fragment/app/m;", "createDialogSearchFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "createSearchDialogScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "", "canHandleFavoritesOrPurchases", "(LGZ/j;)Z", "isFirstPathFavoritesOrPurchases", "isLastPathDialogSearch", "route", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DialogSearchDeeplinkHandler implements a {
    private final boolean canHandleFavoritesOrPurchases(j jVar) {
        return Lh.a.f(jVar, "my") && d.a(jVar) == 2 && isFirstPathFavoritesOrPurchases(jVar) && isLastPathDialogSearch(jVar);
    }

    private final ComponentCallbacksC5392m createDialogSearchFragment(String routeUrl, String searchBarHint) {
        return DialogSearchTopFiltersFragment.INSTANCE.newInstance(createSearchDialogScreenConfig(routeUrl), searchBarHint);
    }

    private final ComposerScreenConfig createSearchDialogScreenConfig(String routeUrl) {
        return new ComposerScreenConfig(new h.c.a(routeUrl, (String) null, (String) null, 14), null, false, null, true, false, true, false, null, false, false, false, e0.h(SuggestionsPrefetchConfigurator.class), null, null, null, false, null, null, null, true, false, null, null, 15722412, null);
    }

    private final boolean isFirstPathFavoritesOrPurchases(j jVar) {
        return Co.a.e(jVar, 0, "favorites") || Co.a.e(jVar, 0, "purchases");
    }

    private final boolean isLastPathDialogSearch(j jVar) {
        return Co.a.e(jVar, 1, "dialogSearch");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return J.d.d(route, "route", "dialogSearch") || canHandleFavoritesOrPurchases(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String str;
        ActiveSearchBarVO searchBarVo;
        ActiveSearchBarVO searchBarVo2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter("CURRENT_PAGE");
        int i11 = queryParameter != null ? kotlin.text.h.t(queryParameter, "home", false) ? R$anim.home_to_dialog_search_transition : R$anim.pdp_to_dialog_search_transition : R$anim.pdp_to_dialog_search_transition;
        String uri = UriExtKt.removeQueryParameter(route.b(), "CURRENT_PAGE").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Object obj = route.e().get("navBarModel");
        String str2 = null;
        StaticNavBarModel staticNavBarModel = obj instanceof StaticNavBarModel ? (StaticNavBarModel) obj : null;
        if (staticNavBarModel == null || (searchBarVo2 = staticNavBarModel.getSearchBarVo()) == null || (str = searchBarVo2.getHint()) == null) {
            Object obj2 = route.e().get("hint");
            str = obj2 instanceof String ? (String) obj2 : null;
        }
        if (str == null) {
            str = "";
        }
        SearchLinkGenerator searchLinkGenerator = SearchLinkGenerator.INSTANCE;
        if (staticNavBarModel != null && (searchBarVo = staticNavBarModel.getSearchBarVo()) != null) {
            str2 = searchBarVo.getSearchText();
        }
        return new c(uri, createDialogSearchFragment(searchLinkGenerator.getPageLink(uri, str2 != null ? str2 : ""), str), null, false, true, new c.b(i11, R$anim.fade_in_suggestions_anim, R$anim.fade_out_suggestions_anim, 2, 0), false, false, false, 460, null);
    }
}

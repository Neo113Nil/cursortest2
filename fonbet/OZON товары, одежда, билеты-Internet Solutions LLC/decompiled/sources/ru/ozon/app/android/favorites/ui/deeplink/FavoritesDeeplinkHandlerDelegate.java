package ru.ozon.app.android.favorites.ui.deeplink;

import GZ.j;
import OZ.e;
import PZ.a;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ;\u0010\u0016\u001a\u00020\u00152\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u00152\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "tabConfigCache", "<init>", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCache;)V", "", "deeplink", "", "checkFavoritesTabPresence", "(Ljava/lang/String;)Z", "checkQueryParams", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "Lkotlin/Function1;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "Lkotlin/Function0;", "LqZ/b;", "buildFlowConfig", "LpZ/f;", "getComposerFlowDestination", "(LGZ/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)LpZ/f;", "Lkotlin/Function2;", "getComposerTabFragmentDestination", "(LGZ/j;Lkotlin/jvm/functions/Function2;)LpZ/f;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "favoritesTabUrl", "Ljava/lang/String;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesDeeplinkHandlerDelegate {

    @NotNull
    private final String favoritesTabUrl;

    @NotNull
    private final TabConfigCache tabConfigCache;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate$Companion;", "", "<init>", "()V", "QUERY_SWITCH_TAB", "", "needSwitchTab", "", "deeplink", "Landroid/net/Uri;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean needSwitchTab(@NotNull Uri deeplink) {
            Boolean t02;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            String queryParameter = deeplink.getQueryParameter("switchTab");
            if (queryParameter == null || (t02 = h.t0(queryParameter)) == null) {
                return true;
            }
            return t02.booleanValue();
        }

        private Companion() {
        }
    }

    public FavoritesDeeplinkHandlerDelegate(@NotNull TabConfigCache tabConfigCache) {
        Intrinsics.checkNotNullParameter(tabConfigCache, "tabConfigCache");
        this.tabConfigCache = tabConfigCache;
        String uri = LinkGenerator.INSTANCE.favorites().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.favoritesTabUrl = uri;
    }

    private final boolean checkFavoritesTabPresence(String deeplink) {
        List<TabConfigDTO> tabs;
        if (checkQueryParams(deeplink)) {
            return true;
        }
        TabConfigResponse config = this.tabConfigCache.getConfig("main");
        Object obj = null;
        if (config != null && (tabs = config.getTabs()) != null) {
            Iterator<T> it = tabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((TabConfigDTO) next).getUrl(), this.favoritesTabUrl)) {
                    obj = next;
                    break;
                }
            }
            obj = (TabConfigDTO) obj;
        }
        return obj != null;
    }

    private final boolean checkQueryParams(String deeplink) {
        return h.t(deeplink, "miniapp", false) && !Intrinsics.d(Uri.parse(deeplink).getQueryParameter("miniapp"), "fakeMain");
    }

    @NotNull
    public final f getComposerFlowDestination(@NotNull j route, @NotNull Function1<? super String, ComposerScreenConfig> buildComposerScreenConfig, @NotNull Function0<C9010b> buildFlowConfig) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(buildComposerScreenConfig, "buildComposerScreenConfig");
        Intrinsics.checkNotNullParameter(buildFlowConfig, "buildFlowConfig");
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        boolean needSwitchTab = INSTANCE.needSwitchTab(route.b());
        boolean checkFavoritesTabPresence = checkFavoritesTabPresence(uri);
        ComposerFlowDestination composerFlowDestination = new ComposerFlowDestination(buildComposerScreenConfig.invoke(uri), uri, null, buildFlowConfig.invoke(), false, 20, null);
        return (checkFavoritesTabPresence && needSwitchTab) ? new e(R$id.menu_favorites, composerFlowDestination) : composerFlowDestination;
    }

    @NotNull
    public final f getComposerTabFragmentDestination(@NotNull j route, @NotNull Function2<? super String, ? super Boolean, ComposerScreenConfig> buildComposerScreenConfig) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(buildComposerScreenConfig, "buildComposerScreenConfig");
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        boolean needSwitchTab = INSTANCE.needSwitchTab(route.b());
        boolean checkFavoritesTabPresence = checkFavoritesTabPresence(uri);
        ComposerScreenConfig invoke = buildComposerScreenConfig.invoke(uri, Boolean.valueOf(checkFavoritesTabPresence));
        if (checkFavoritesTabPresence && needSwitchTab) {
            return new ComposerTabFragmentDestination(invoke, uri, R$id.menu_favorites, null, false, Intrinsics.d(a.b(uri, true), this.favoritesTabUrl), null, 88, null);
        }
        return new ComposerFragmentDestination(invoke, uri, null, false, false, null, false, false, null, 508, null);
    }
}

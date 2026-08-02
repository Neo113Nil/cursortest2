package ru.ozon.app.android.search.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/deeplink/CatalogDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Landroid/content/Context;Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "", "isApparelMiniapp", "(Ljava/lang/String;)Ljava/lang/Boolean;", "isExpressMiniapp", "(Ljava/lang/String;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogDeeplinkHandler implements a {

    @NotNull
    private static final Set<String> authorities;

    static {
        String[] elements = {"catalog", "category"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        authorities = C7705l.j0(elements);
    }

    private final ComposerScreenConfig getScreenConfig(Context context, String deeplink) {
        return new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, (Intrinsics.d(isApparelMiniapp(deeplink), Boolean.TRUE) || isExpressMiniapp(deeplink)) ? false : true, null, null, AppTypeResolver.INSTANCE.isSelect(context) ? Integer.valueOf(R$color.bg_dark_key) : null, null, 45, null), 0, 2, null), false, null, true, false, false, false, null, false, false, false, e0.h(CategoryPageConfigurator.class), null, Integer.valueOf(UniColors.LAYER_FLOOR_1.getResId()), null, false, null, null, null, false, false, null, null, 16756684, null);
    }

    private final Boolean isApparelMiniapp(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("miniapp");
        if (queryParameter != null) {
            return Boolean.valueOf(kotlin.text.h.e0(queryParameter, "apparel", false));
        }
        return null;
    }

    private final boolean isExpressMiniapp(String str) {
        return Intrinsics.d(Uri.parse(str).getQueryParameter("miniapp"), "supermarket");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return C7714v.A(authorities, route.b().getAuthority()) && route.b().getPathSegments().isEmpty();
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String queryParameter = route.b().getQueryParameter("switchTab");
        Boolean t02 = queryParameter != null ? kotlin.text.h.t0(queryParameter) : null;
        ComposerScreenConfig screenConfig = getScreenConfig(context, a11);
        if (Intrinsics.d(t02, Boolean.FALSE)) {
            return new ComposerFragmentDestination(screenConfig, a11, null, false, false, null, false, false, null, 508, null);
        }
        return new ComposerTabFragmentDestination(screenConfig, a11, R$id.menu_catalog, null, false, true, null, 88, null);
    }
}

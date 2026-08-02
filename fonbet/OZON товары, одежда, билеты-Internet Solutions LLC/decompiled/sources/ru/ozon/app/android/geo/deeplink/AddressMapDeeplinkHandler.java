package ru.ozon.app.android.geo.deeplink;

import GZ.j;
import J.d;
import Kk.C3531a;
import Kk.c;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler;
import ru.ozon.app.android.composer.navigator.redirect.RedirectStrategy;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.geo.common.configurators.FirstRequestMapConfigurator;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapConfigurator;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/deeplink/AddressMapDeeplinkHandler;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectDeeplinkHandler;", "<init>", "()V", "", "origin", "deeplink", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "handleRedirect", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressMapDeeplinkHandler implements RedirectDeeplinkHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/deeplink/AddressMapDeeplinkHandler$Companion;", "", "<init>", "()V", "QUERY_IS_TAB_BAR_VISIBLE", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "address_map") && C3531a.c(route, "getPathSegments(...)", "map");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        boolean booleanQueryParameter = route.b().getBooleanQueryParameter("isTabBarVisible", false);
        String c11 = c.c(route, "toString(...)");
        String str = null;
        h.c.a aVar = new h.c.a(c11, str, str, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        ComposerScreenConfig composerScreenConfig = new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, !booleanQueryParameter, e0.g(FormBuilderHelper.INSTANCE.getConfigurators(), AddressEditMapConfigurator.class), e0.h(FirstRequestMapConfigurator.class), null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3)), e0.h("checkoutFacade.addressEditMap"), 32, true, false, null, null, 14764028, null);
        if (!booleanQueryParameter) {
            return new ComposerFlowDestination(composerScreenConfig, c11, null, new C9010b(FlowTag.ADDRESS_MAP, 14), false, 20, null);
        }
        return new ComposerTabFragmentDestination(composerScreenConfig, c11, R$id.menu_delivery_map, null, false, false, null, 88, null);
    }

    @Override // ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler
    @NotNull
    public RedirectStrategy.Refresh handleRedirect(@NotNull String origin, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return RedirectStrategy.Refresh.INSTANCE;
    }
}

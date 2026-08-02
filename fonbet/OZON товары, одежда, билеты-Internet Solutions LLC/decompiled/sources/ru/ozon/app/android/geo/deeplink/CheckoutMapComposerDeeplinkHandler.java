package ru.ozon.app.android.geo.deeplink;

import C.J;
import GZ.j;
import J.d;
import Kk.C3531a;
import android.content.Context;
import i10.h;
import i10.l;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler;
import ru.ozon.app.android.composer.navigator.redirect.RedirectStrategy;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.geo.common.configurators.FirstRequestMapConfigurator;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapConfigurator;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/deeplink/CheckoutMapComposerDeeplinkHandler;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectDeeplinkHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "origin", "deeplink", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "handleRedirect", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutMapComposerDeeplinkHandler implements RedirectDeeplinkHandler {

    @NotNull
    private final FeatureChecker featureChecker;

    public CheckoutMapComposerDeeplinkHandler(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "gocheckout") && C3531a.c(route, "getPathSegments(...)", "delivery") && Kk.d.c(route, "getPathSegments(...)", 1, "map");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        h.c.a aVar = new h.c.a(a11, str, str, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        LinkedHashSet g10 = e0.g(FormBuilderHelper.INSTANCE.getConfigurators(), AddressEditMapConfigurator.class);
        Set h11 = e0.h(FirstRequestMapConfigurator.class);
        Set h12 = e0.h("checkoutFacade.addressEditMap");
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, g10, h11, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3)), h12, 32, true, false, null, null, 14766076, null), a11, null, new C9010b(FlowTag.CHECKOUT, 14), false, 20, null);
    }

    @Override // ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler
    @NotNull
    public RedirectStrategy.Refresh handleRedirect(@NotNull String origin, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return RedirectStrategy.Refresh.INSTANCE;
    }
}

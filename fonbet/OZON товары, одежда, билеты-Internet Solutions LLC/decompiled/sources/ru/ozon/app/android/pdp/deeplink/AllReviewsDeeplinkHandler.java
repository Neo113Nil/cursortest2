package ru.ozon.app.android.pdp.deeplink;

import C.J;
import D40.d;
import GZ.j;
import HY.b;
import IZ.a;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.configurator.RefreshByResultConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewContentParam;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.HideToolbarConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.configurator.ListReviewConfigurator;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/deeplink/AllReviewsDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "bottomSheetConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getComposerScreenConfig", "(Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkPdpReviewsPage", "(LGZ/j;)Z", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AllReviewsDeeplinkHandler implements a {
    private final boolean checkPdpReviewsPage(j route) {
        return Lh.a.f(route, "products") && d.a(route) == 3 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && Co.a.e(route, 2, "list");
    }

    private final ComposerScreenConfig getComposerScreenConfig(String deeplink, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        String str = null;
        h.c.a aVar = new h.c.a(deeplink, str, str, 14);
        int i11 = R$color.layer_floor_0;
        Tc.j builder = new Tc.j();
        builder.add(ReviewConfigurator.class);
        builder.add(RefreshByResultConfigurator.class);
        builder.add(ListReviewConfigurator.class);
        builder.add(RefreshByOrderChangeConfigurator.class);
        builder.add(HideToolbarConfigurator.class);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new ComposerScreenConfig(aVar, null, false, bottomSheetConfig, false, false, false, false, null, false, false, false, builder.b(), null, Integer.valueOf(i11), null, false, null, null, null, false, false, null, null, 16756692, null);
    }

    static /* synthetic */ ComposerScreenConfig getComposerScreenConfig$default(AllReviewsDeeplinkHandler allReviewsDeeplinkHandler, String str, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bottomSheetConfig = null;
        }
        return allReviewsDeeplinkHandler.getComposerScreenConfig(str, bottomSheetConfig);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        ReviewContentParam reviewContentParam = ReviewContentParam.INSTANCE;
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return !reviewContentParam.isReviewContentDeeplink(uri) && checkPdpReviewsPage(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        if (!MiniAppExtKt.isExpress(route.b())) {
            return new ComposerFragmentDestination(getComposerScreenConfig$default(this, a11, null, 2, null), a11, null, false, false, null, false, false, null, 508, null);
        }
        return new BottomSheetComposerFragmentDestination(a11, getComposerScreenConfig(a11, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, true, false, false, false, 1918, null)), C9992d.b.c.f100438a, null, null, null, 56, null);
    }
}

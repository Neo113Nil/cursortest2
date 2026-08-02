package ru.ozon.app.android.ugc.core.deeplink;

import C.J;
import D40.d;
import GZ.j;
import HY.b;
import IZ.a;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery.ReviewGalleryV2Configurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoMoleculeConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\r\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/ReviewGalleryV2DeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkPdpPage", "(LGZ/j;)Z", "checkTravelPage", "checkSocialPage", "checkSocialAuthorsPage", "checkTopAuthorsLandingFeedPage", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryV2DeeplinkHandler implements a {
    private final boolean checkPdpPage(j route) {
        return d.a(route) == 3 && Lh.a.f(route, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && Co.a.e(route, 2, "photos");
    }

    private final boolean checkSocialAuthorsPage(j route) {
        return d.a(route) == 1 && Lh.a.f(route, "social") && Co.a.e(route, 0, "authors-feed");
    }

    private final boolean checkSocialPage(j route) {
        return d.a(route) == 2 && Lh.a.f(route, "social") && Co.a.e(route, 0, "gallery");
    }

    private final boolean checkTopAuthorsLandingFeedPage(j route) {
        return d.a(route) == 1 && Lh.a.f(route, "social") && Co.a.e(route, 0, "top-authors-landing-feed");
    }

    private final boolean checkTravelPage(j route) {
        return d.a(route) == 5 && Lh.a.f(route, "travel") && Co.a.e(route, 0, "hotels") && Co.a.e(route, 1, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 2, "get(...)")) && Kk.d.c(route, "getPathSegments(...)", 3, "review") && Kk.d.c(route, "getPathSegments(...)", 4, "photos");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkPdpPage(route) || checkTravelPage(route) || checkSocialPage(route) || checkSocialAuthorsPage(route) || checkTopAuthorsLandingFeedPage(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        h.c.a aVar = new h.c.a(a11, str, str, 14);
        int i11 = R$color.black;
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(context.getColor(R$color.black)), 1));
        Class[] elements = {VideoPreloadCleanerConfigurator.class, VideoMoleculeConfigurator.class, ReviewGalleryV2Configurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ComposerScreenConfig composerScreenConfig = new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, Integer.valueOf(i11), null, false, appearanceConfig, null, null, false, false, null, null, 14526396, null);
        if (MiniAppExtKt.isExpress(route.b())) {
            return new ComposerFlowDestination(composerScreenConfig, a11, null, null, false, 28, null);
        }
        return new ComposerFragmentDestination(composerScreenConfig, a11, null, false, false, null, false, false, null, 508, null);
    }
}

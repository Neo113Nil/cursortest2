package ru.ozon.app.android.ugc.core.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.C3531a;
import OZ.e;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery.ReviewGalleryV2Configurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoMoleculeConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.core.R$color;
import tZ.C9788c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/ApparelSocialDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "createScreenConfig", "(Ljava/lang/String;Landroid/content/Context;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "isSocialFeed", "(LGZ/j;)Z", "isMedia", "inApparel", "canHandle", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApparelSocialDeeplinkHandler implements a {
    private final ComposerScreenConfig createScreenConfig(String deeplink, Context context) {
        String str = null;
        h.c.a aVar = new h.c.a(deeplink, str, str, 14);
        int i11 = R$color.black;
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(context.getColor(R$color.black)), 1));
        Class[] elements = {VideoPreloadCleanerConfigurator.class, VideoMoleculeConfigurator.class, ReviewGalleryV2Configurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, Integer.valueOf(i11), null, false, appearanceConfig, null, null, false, false, null, null, 14460860, null);
    }

    private final boolean inApparel(j route) {
        return Intrinsics.d(route.b().getQueryParameter("miniapp"), "apparel");
    }

    private final boolean isMedia(j route) {
        return route.b().getQueryParameterNames().contains("media_uuid");
    }

    private final boolean isSocialFeed(j route) {
        return Lh.a.f(route, "social") && C3531a.c(route, "getPathSegments(...)", "feed");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isSocialFeed(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        ComposerScreenConfig createScreenConfig = createScreenConfig(a11, context);
        if (inApparel(route) && isMedia(route)) {
            int i11 = R$id.menu_social;
            int i12 = C9788c.f99312e;
            return new e(i11, C9788c.a.a(LinkGenerator.INSTANCE.socialFullView().toString(), new ComposerFragmentDestination(createScreenConfig, a11, null, false, false, null, false, false, null, 508, null)));
        }
        if (inApparel(route)) {
            return new ComposerTabFragmentDestination(createScreenConfig, a11, R$id.menu_social, null, false, true, null, 88, null);
        }
        return new ComposerFragmentDestination(createScreenConfig, a11, null, false, false, null, false, false, null, 508, null);
    }
}

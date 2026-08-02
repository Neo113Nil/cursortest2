package ru.ozon.app.android.travel.feature.general.common.deeplink;

import Ak.b;
import GZ.j;
import IZ.a;
import Kk.C3531a;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery.ReviewGalleryV2Configurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoMoleculeConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelFeedDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "createScreenConfig", "(Ljava/lang/String;Landroid/content/Context;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "isTravelFeed", "(LGZ/j;)Z", "canHandle", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelFeedDeeplinkHandler implements a {
    private final ComposerScreenConfig createScreenConfig(String deeplink, Context context) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.graphicDarkKey);
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicDarkKey)), 1));
        Class[] elements = {VideoPreloadCleanerConfigurator.class, VideoMoleculeConfigurator.class, ReviewGalleryV2Configurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, appearanceConfig, null, null, false, false, null, null, 14510012, null);
    }

    private final boolean isTravelFeed(j route) {
        return Lh.a.f(route, "travel") && C3531a.c(route, "getPathSegments(...)", "feed");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isTravelFeed(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String d11 = b.d(context, "context", route, "route");
        return new ComposerTabRequiredFragmentDestination(createScreenConfig(d11, context), d11, null, false, null, false, 60, null);
    }
}

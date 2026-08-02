package ru.ozon.app.android.travel.feature.hotels.deeplink;

import Ak.b;
import B0.C2454a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.shared.presentation.HotelsGalleryFullConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u00020\f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/deeplink/HotelsGalleryDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Landroid/net/Uri;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "isTravelPage", "(Landroid/net/Uri;)Z", "isGalleyFeedPage", "isGalleryFullPage", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryDeeplinkHandler implements a {
    private final ComposerScreenConfig getScreenConfig(Uri deeplink) {
        if (isGalleyFeedPage(deeplink)) {
            String uri = deeplink.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return new ComposerScreenConfig(new h.c.a(uri, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, true, null, null, null, null, 61, null), 0, 2, null), false, null, false, false, false, false, null, false, false, true, null, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16742300, null);
        }
        String uri2 = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return new ComposerScreenConfig(new h.c.a(uri2, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, true, e0.h(HotelsGalleryFullConfigurator.class), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.bgDarkKey)), false, null, null, null, false, false, null, null, 16738236, null);
    }

    private final boolean isGalleryFullPage(Uri uri) {
        return uri.getPathSegments().size() == 2 && C2454a.h(uri, "hotels", 0) && C2454a.h(uri, "galleryFull", 1);
    }

    private final boolean isGalleyFeedPage(Uri uri) {
        return uri.getPathSegments().size() == 2 && C2454a.h(uri, "hotels", 0) && C2454a.h(uri, "galleryFeed", 1);
    }

    private final boolean isTravelPage(Uri uri) {
        return Intrinsics.d(uri.getAuthority(), "travel");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (isTravelPage(b11)) {
            return isGalleyFeedPage(b11) || isGalleryFullPage(b11);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        return new ComposerFragmentDestination(getScreenConfig(route.b()), b.d(context, "context", route, "route"), null, false, false, null, false, false, null, 508, null);
    }
}

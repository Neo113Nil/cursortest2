package ru.ozon.app.android.pdp.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.view.pdp.PdpGalleryFullViewConfigurator;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/deeplink/GalleryFullViewDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "", "includeBottomSheetConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Ljava/lang/String;Z)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GalleryFullViewDeeplinkHandler implements a {
    private final ComposerScreenConfig getScreenConfig(String deeplink, boolean includeBottomSheetConfig) {
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
        String str = null;
        h.c.a aVar = new h.c.a(deeplink, str, str, 14);
        int i11 = R$color.black;
        Set h11 = e0.h(PdpGalleryFullViewConfigurator.class);
        if (includeBottomSheetConfig) {
            bottomSheetConfig = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, false, false, false, false, 1790, null);
        } else {
            bottomSheetConfig = null;
        }
        return new ComposerScreenConfig(aVar, null, false, bottomSheetConfig, false, false, false, false, null, false, false, true, h11, null, Integer.valueOf(i11), null, false, null, null, null, false, false, null, null, 16689076, null);
    }

    static /* synthetic */ ComposerScreenConfig getScreenConfig$default(GalleryFullViewDeeplinkHandler galleryFullViewDeeplinkHandler, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return galleryFullViewDeeplinkHandler.getScreenConfig(str, z11);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", "productGalleryFullview")) {
            return true;
        }
        if (Lh.a.f(route, "selections") && Kk.d.c(route, "getPathSegments(...)", 0, "galleryFullView")) {
            return true;
        }
        return Lh.a.f(route, "social") && Kk.d.c(route, "getPathSegments(...)", 0, "avatarFullView");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        if (MiniAppExtKt.isExpress(context)) {
            return new BottomSheetComposerFragmentDestination(a11, getScreenConfig(a11, true), C9992d.b.c.f100438a, null, null, null, 56, null);
        }
        return new ComposerFragmentDestination(getScreenConfig$default(this, a11, false, 2, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}

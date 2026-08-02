package ru.ozon.app.android.ugc.payout.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.PromoReviewRefreshConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/payout/deeplink/ReviewPromoDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewPromoDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String lastPathSegment;
        return d.d(route, "route", "reviews") && (lastPathSegment = route.b().getLastPathSegment()) != null && lastPathSegment.length() != 0 && Co.a.e(route, 0, "promo");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(PromoReviewRefreshConfigurator.class), null, null, null, false, null, null, null, false, false, null, null, 16773086, null), a11, R$id.menu_profile, null, false, false, null, 120, null);
    }
}

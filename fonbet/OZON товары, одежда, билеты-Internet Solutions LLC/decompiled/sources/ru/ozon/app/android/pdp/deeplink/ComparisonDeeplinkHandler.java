package ru.ozon.app.android.pdp.deeplink;

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
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/deeplink/ComparisonDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComparisonDeeplinkHandler implements a {
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[ADDED_TO_REGION] */
    @Override // IZ.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canHandle(@NotNull j route) {
        boolean z11;
        boolean z12;
        String queryParameter;
        String queryParameter2;
        if (d.d(route, "route", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && D40.d.a(route) == 1 && Co.a.e(route, 0, "compare") && (queryParameter2 = route.b().getQueryParameter("fromSku")) != null && queryParameter2.length() != 0) {
            String queryParameter3 = route.b().getQueryParameter("fromSku");
            if (queryParameter3 != null ? StringExtKt.isDigital(queryParameter3) : false) {
                z11 = true;
                if (Lh.a.f(route, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && D40.d.a(route) == 1 && Co.a.e(route, 0, "compare")) {
                    queryParameter = route.b().getQueryParameter("category");
                    if (!(queryParameter != null || queryParameter.length() == 0)) {
                        z12 = true;
                        return !z11 || z12;
                    }
                }
                z12 = false;
                if (z11) {
                }
            }
        }
        z11 = false;
        if (Lh.a.f(route, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
            queryParameter = route.b().getQueryParameter("category");
            if (!(queryParameter != null || queryParameter.length() == 0)) {
            }
        }
        z12 = false;
        if (z11) {
        }
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(ComparisonConfigurator.class), null, Integer.valueOf(R$color.layer_floor_0), null, false, null, null, null, false, false, null, null, 16756670, null), a11, 9019, false, false, null, false, false, null, 504, null);
    }
}

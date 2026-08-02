package ru.ozon.app.android.travel.feature.hotels.deeplink;

import B0.C2454a;
import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewContentParam;
import ru.ozon.app.android.travel.feature.hotels.interceptor.EnsureMiniappTravelDeeplinkInterceptor;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\t*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0015\u001a\u00020\t*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/deeplink/TravelPdpDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/travel/feature/hotels/interceptor/EnsureMiniappTravelDeeplinkInterceptor;", "ensureMiniappTravelDeeplinkInterceptor", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/interceptor/EnsureMiniappTravelDeeplinkInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Landroid/net/Uri;", "isTravelPage", "(Landroid/net/Uri;)Z", "isPdpPage", "isPdpPageWithTextSku", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPdpDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPdpDeeplinkHandler(@NotNull EnsureMiniappTravelDeeplinkInterceptor ensureMiniappTravelDeeplinkInterceptor) {
        super(null, ensureMiniappTravelDeeplinkInterceptor, 1, null);
        Intrinsics.checkNotNullParameter(ensureMiniappTravelDeeplinkInterceptor, "ensureMiniappTravelDeeplinkInterceptor");
    }

    private final boolean isPdpPage(Uri uri) {
        if (uri.getPathSegments().size() == 3 && C2454a.h(uri, "hotels", 0) && C2454a.h(uri, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, 1)) {
            String str = uri.getPathSegments().get(2);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            if (StringExtKt.isDigital(str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isPdpPageWithTextSku(Uri uri) {
        if (uri.getPathSegments().size() == 3 && C2454a.h(uri, "hotels", 0) && C2454a.h(uri, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, 1)) {
            String str = uri.getPathSegments().get(2);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            if (new Regex("\\d").a(str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isTravelPage(Uri uri) {
        return Intrinsics.d(uri.getAuthority(), "travel");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        ReviewContentParam reviewContentParam = ReviewContentParam.INSTANCE;
        String uri = b11.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (reviewContentParam.isReviewContentDeeplink(uri) || !isTravelPage(b11)) {
            return false;
        }
        return isPdpPage(b11) || isPdpPageWithTextSku(b11);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, true, false, false, false, null, false, false, false, e0.h(ReviewConfigurator.class), e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, true, false, null, null, 15683532, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}

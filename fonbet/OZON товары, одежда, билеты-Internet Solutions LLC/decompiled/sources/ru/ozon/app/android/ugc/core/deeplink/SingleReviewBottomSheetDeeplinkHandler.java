package ru.ozon.app.android.ugc.core.deeplink;

import C.J;
import D40.d;
import GZ.j;
import HY.b;
import IZ.a;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.singleReviewBottom.SingleReviewBottomSheetFragment;
import ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList.CommentsListConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/SingleReviewBottomSheetDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkPdpPage", "(LGZ/j;)Z", "checkTravelPage", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewBottomSheetDeeplinkHandler implements a {
    private final boolean checkPdpPage(j route) {
        return Lh.a.f(route, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && d.a(route) >= 3 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && route.b().getPathSegments().contains("curtain") && !route.b().getPathSegments().contains("photos") && !route.b().getPathSegments().contains("comments");
    }

    private final boolean checkTravelPage(j route) {
        return Lh.a.f(route, "travel") && d.a(route) >= 4 && Co.a.e(route, 0, "hotels") && Co.a.e(route, 1, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 2, "get(...)")) && Kk.d.c(route, "getPathSegments(...)", 3, "review") && route.b().getQueryParameterNames().contains("media_uuid") && !route.b().getPathSegments().contains("comments");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkPdpPage(route) || checkTravelPage(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        Object obj = route.e().get("activateCommentField");
        String str = null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        h.c.a aVar = new h.c.a(a11, str, str, 14);
        Class[] elements = {CommentsListConfigurator.class, ReviewConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new C9992d(new c(a11, SingleReviewBottomSheetFragment.INSTANCE.newInstance(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, null, 16707548, null), booleanValue), 9001, false, false, null, false, false, false, 504, null), MiniAppExtKt.isExpress(context) ? C9992d.b.c.f100438a : C9992d.b.a.f100436a);
    }
}

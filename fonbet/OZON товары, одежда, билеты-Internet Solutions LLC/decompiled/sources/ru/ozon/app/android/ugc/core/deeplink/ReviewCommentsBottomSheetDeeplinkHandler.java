package ru.ozon.app.android.ugc.core.deeplink;

import C.J;
import D40.d;
import De.C2860c;
import GZ.j;
import HY.b;
import IZ.a;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.comments.ReviewCommentsBottomSheetFragment;
import ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList.CommentsListConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\tJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/ReviewCommentsBottomSheetDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkPdpPage", "(LGZ/j;)Z", "checkTravelPage", "checkCommentsModal", "checkSelectionComments", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewCommentsBottomSheetDeeplinkHandler implements a {
    private final boolean checkCommentsModal(j route) {
        return Lh.a.f(route, "modal") && !C2860c.c(route, "getPathSegments(...)").isEmpty() && Co.a.e(route, 0, "commentsList");
    }

    private final boolean checkPdpPage(j route) {
        return (Lh.a.f(route, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) || Lh.a.f(route, "products")) && d.a(route) == 4 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && Co.a.e(route, 3, "comments");
    }

    private final boolean checkSelectionComments(j route) {
        return Lh.a.f(route, "selections") && d.a(route) > 1 && Co.a.e(route, 0, "comments") && !h.K((CharSequence) b.a(route, 1, "get(...)"));
    }

    private final boolean checkTravelPage(j route) {
        return Lh.a.f(route, "travel") && d.a(route) == 6 && Co.a.e(route, 0, "hotels") && Co.a.e(route, 1, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 2, "get(...)")) && Kk.d.c(route, "getPathSegments(...)", 3, "review") && Kk.d.c(route, "getPathSegments(...)", 5, "comments");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkPdpPage(route) || checkTravelPage(route) || checkCommentsModal(route) || checkSelectionComments(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        return new C9992d(new c(a11, ReviewCommentsBottomSheetFragment.INSTANCE.newInstance(new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, SheetSoftInputMode.ADJUST_RESIZE, 0, false, false, false, false, false, false, 2038, null), false, false, false, false, null, false, false, false, e0.h(CommentsListConfigurator.class), null, null, BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1)), false, null, null, null, false, false, null, null, 16674804, null)), 9001, false, false, null, false, false, false, 504, null), MiniAppExtKt.isExpress(context) ? C9992d.b.c.f100438a : C9992d.b.a.f100436a);
    }
}

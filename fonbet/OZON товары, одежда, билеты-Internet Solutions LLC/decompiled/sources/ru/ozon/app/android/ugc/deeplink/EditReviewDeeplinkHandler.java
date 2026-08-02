package ru.ozon.app.android.ugc.deeplink;

import C.J;
import D40.d;
import GZ.j;
import HY.b;
import IZ.c;
import Lh.a;
import android.content.Context;
import i10.h;
import i10.l;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.StaticTeenModeConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerConfigurator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.ReviewFormConfigurator;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/EditReviewDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkPdpPage", "(LGZ/j;)Z", "checkTravelPage", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditReviewDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditReviewDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    private final boolean checkPdpPage(j route) {
        return a.f(route, "products") && d.a(route) >= 4 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && Co.a.e(route, 3, "edit");
    }

    private final boolean checkTravelPage(j route) {
        return a.f(route, "travel") && d.a(route) >= 5 && Co.a.e(route, 0, "hotels") && Co.a.e(route, 1, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 2, "get(...)")) && Kk.d.c(route, "getPathSegments(...)", 3, "review") && Kk.d.c(route, "getPathSegments(...)", 5, "edit");
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
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        Class[] elements = {MediaPickerConfigurator.class, ReviewFormConfigurator.class, StaticTeenModeConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        int m683constructorimpl = BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1);
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, true, false, false, false, null, false, false, true, j02, null, null, BackgroundColorResource.m682boximpl(m683constructorimpl), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, 0, 1)), null, null, false, false, null, null, 14509964, null), a11, null, false, false, null, false, false, null, 492, null);
    }
}

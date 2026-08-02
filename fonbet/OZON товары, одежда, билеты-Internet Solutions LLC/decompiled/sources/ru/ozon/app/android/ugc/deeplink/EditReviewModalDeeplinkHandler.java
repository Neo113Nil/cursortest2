package ru.ozon.app.android.ugc.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import Kk.d;
import Lh.a;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.StaticTeenModeConfigurator;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerConfigurator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.ReviewFormConfigurator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/EditReviewModalDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkReviewFormModalPage", "(LGZ/j;)Z", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditReviewModalDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditReviewModalDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    private final boolean checkReviewFormModalPage(j route) {
        return a.f(route, "modal") && d.c(route, "getPathSegments(...)", 0, "review-edit-form") && route.b().getQueryParameterNames().containsAll(C7714v.b0("item_id", "review_uuid"));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkReviewFormModalPage(route);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        Class[] elements = {MediaPickerConfigurator.class, ReviewFormConfigurator.class, StaticTeenModeConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new C9992d(new sZ.c(a11, ReviewFormBottomSheetFragment.INSTANCE.newInstance(new ComposerScreenConfig(aVar, null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null), true, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1)), false, null, null, null, false, false, null, null, 14641028, null)), 9001, false, false, null, false, false, false, 504, null), null, 2, null == true ? 1 : 0);
    }
}

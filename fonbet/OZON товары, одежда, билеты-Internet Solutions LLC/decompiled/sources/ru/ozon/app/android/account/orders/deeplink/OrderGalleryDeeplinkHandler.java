package ru.ozon.app.android.account.orders.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.C3531a;
import Kk.d;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.R;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.account.orders.barcodePopover.v1.configurator.BrightnessChangerConfigurator;
import ru.ozon.app.android.account.orders.core.OrientationLockConfigurator;
import ru.ozon.app.android.account.orders.ordergallery.OrderGalleryConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cs_orders.R$anim;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.cscore.core.configurators.OrderCacheStateInterceptor;
import ru.ozon.app.android.product.tiles.utils.CollectionExtKt;
import sZ.c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/deeplink/OrderGalleryDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "", "paths", "Ljava/util/List;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configurators", "Ljava/util/Set;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderGalleryDeeplinkHandler implements a {

    @NotNull
    private final List<String> paths = C7714v.b0("atTheDoor", "barcode", "downloadCertificate");

    @NotNull
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators = e0.e(OrientationLockConfigurator.class, OrderGalleryConfigurator.class);

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.f(pathSegments);
        boolean z11 = pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "orderlist") && this.paths.contains(pathSegments.get(1));
        boolean d11 = Intrinsics.d(C7714v.M(pathSegments), "deliveryBarcode");
        if (Intrinsics.d(CollectionExtKt.secondOrNull(pathSegments), "barcode")) {
            this.configurators.add(BrightnessChangerConfigurator.class);
        }
        return Intrinsics.d(b11.getAuthority(), "my") && (z11 || d11);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean z11 = true;
        boolean c11 = d.c(route, "getPathSegments(...)", 1, "barcode");
        boolean c12 = C3531a.c(route, "getPathSegments(...)", "deliveryBarcode");
        if (!c11 && !c12) {
            z11 = false;
        }
        Set h11 = z11 ? e0.h(OrderCacheStateInterceptor.class) : M.f71699a;
        if (z11) {
            return new c("BarcodeFragment", BarcodeFragment.INSTANCE.newInstance(a11, c12 ? R$string.delivery_barcode_toolbar_title : R$string.orders_barcode_toolbar_title), null, false, false, new c.b(R$anim.slide_in_left_right, R$anim.slide_out_left_right, R$anim.slide_in_right_left, R$anim.slide_out_right_left), false, true, false, 348, null);
        }
        return new ComposerTabRequiredFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, this.configurators, h11, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R.attr.layerFloor0)), false, null, null, null, false, false, null, null, 16732126, null), a11, null, false, null, false, 60, null);
    }
}

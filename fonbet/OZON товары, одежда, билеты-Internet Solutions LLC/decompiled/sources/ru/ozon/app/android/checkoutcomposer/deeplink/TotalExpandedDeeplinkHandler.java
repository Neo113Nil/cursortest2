package ru.ozon.app.android.checkoutcomposer.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import Kk.c;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutcomposer.common.cardbinding.data.CardBindingConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.AddressPartsInputPageConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CConfigurator;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deeplink/TotalExpandedDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/navigation/handlers/DeeplinkHandler;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalExpandedDeeplinkHandler implements a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deeplink/TotalExpandedDeeplinkHandler$Companion;", "", "<init>", "()V", "TOTAL_EXPANDED", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "modal") && C3531a.c(route, "getPathSegments(...)", "totalExpanded");
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String c11 = c.c(route, "toString(...)");
        h.c.a aVar = new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14);
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null);
        Class[] elements = {CreateAndPayConfigurator.class, UpdateOrderC2CConfigurator.class, CardBindingConfigurator.class, AddressPartsInputPageConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new BottomSheetComposerFragmentDestination(c11, new ComposerScreenConfig(aVar, null, false, bottomSheetConfig, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, null, 16773110, null), null, null, null, null, 60, null);
    }
}

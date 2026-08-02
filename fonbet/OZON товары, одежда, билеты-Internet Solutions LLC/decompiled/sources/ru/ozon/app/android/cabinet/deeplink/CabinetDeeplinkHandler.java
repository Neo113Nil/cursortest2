package ru.ozon.app.android.cabinet.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.barcodecache.wearable.pageConfigurator.CabinetBarcodeOnWearableDeviceConfigurator;
import ru.ozon.app.android.cabinet.chatinfo.presentation.UpdateChatInfoConfigurator;
import ru.ozon.app.android.cabinet.profile.RefreshOnActualizeEmailConfigurator;
import ru.ozon.app.android.cabinet.profile.RefreshOnUserDataChangedConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.actionButton.configurators.OrderChangeActionButtonsConfigurator;
import ru.ozon.app.android.cscore.buttonv2.configurators.SingleActionButtonConfigurator;
import ru.ozon.app.android.cscore.core.configurators.OrderCacheStateInterceptor;
import ru.ozon.app.android.cscore.orderTracking.configurators.updater.LKOrderTrackingV4UpdaterConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshAfterTimeChangeConfigurator;
import ru.ozon.app.android.fresh.common.configurators.addlegal.AddLegalMobileConfigurator;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.ui.session.profile.ProfileInfoConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/CabinetDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CabinetDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (!d.d(route, "route", "my")) {
            return false;
        }
        String lastPathSegment = route.b().getLastPathSegment();
        return lastPathSegment == null || lastPathSegment.length() == 0;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_profile;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        Class[] elements = {ProfileInfoConfigurator.class, SingleActionButtonConfigurator.class, OrderChangeActionButtonsConfigurator.class, CreateAndPayConfigurator.class, OrderPayConfigurator.class, RefreshAfterTimeChangeConfigurator.class, LKOrderTrackingV4UpdaterConfigurator.class, UpdateChatInfoConfigurator.class, AddLegalMobileConfigurator.class, RefreshOnUserDataChangedConfigurator.class, RefreshOnActualizeEmailConfigurator.class, CabinetBarcodeOnWearableDeviceConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        LinkedHashSet X02 = C7714v.X0(CabinetDeeplinkHandlerKt.getAuthStateConfigurators());
        X02.add(OrderCacheStateInterceptor.class);
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(null, 0, 2, null), false, null, false, false, false, false, null, false, false, false, j02, X02, null, null, false, null, null, null, false, false, null, null, 16764892, null), a11, i11, null, false, true, null, 88, null);
    }
}

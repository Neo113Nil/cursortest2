package ru.ozon.app.android.orderdetails.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.couriertips.configurators.RefreshAnchorScreenConfigurator;
import ru.ozon.app.android.cscore.payment.configurators.AddUserCardConfigurator;
import ru.ozon.app.android.payment.ui.changepayment.configurator.ChangePaymentConfigurator;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/deeplink/DetailsCourierTipsDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DetailsCourierTipsDeeplinkHandler implements a {
    private final ComposerScreenConfig buildScreenConfig(String deeplink) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        Class[] elements = {OrderPayConfigurator.class, CreateAndPayConfigurator.class, RefreshAnchorScreenConfigurator.class, ChangePaymentConfigurator.class, AddUserCardConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, null, null, 16, false, false, null, null, 16214014, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (!d.d(route, "route", "my") || C2860c.c(route, "getPathSegments(...)").isEmpty()) {
            return false;
        }
        List<String> pathSegments = route.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return kotlin.text.h.D((String) C7714v.K(pathSegments), "tipsForCourier", true);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(buildScreenConfig(a11), a11, null, false, false, null, true, false, null, 444, null);
    }
}

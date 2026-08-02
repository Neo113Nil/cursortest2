package ru.ozon.app.android.checkoutorderdone.deeplink;

import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneRefreshCartConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.RefreshOnStartPageConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00062\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/deeplink/OrderDoneDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "checkFirstCondition", "(Landroid/net/Uri;)Z", "checkSecondCondition", "checkThirdCondition", "clearBackStack", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Z)Ljava/util/Set;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneDeeplinkHandler implements a {
    private final boolean checkFirstCondition(Uri deeplink) {
        String queryParameter;
        String authority = deeplink.getAuthority();
        return (authority == null || authority.length() == 0) && (queryParameter = deeplink.getQueryParameter("orderNumber")) != null && queryParameter.length() != 0 && deeplink.getBooleanQueryParameter("payment", false);
    }

    private final boolean checkSecondCondition(Uri deeplink) {
        String lastPathSegment;
        return (!Intrinsics.d(deeplink.getAuthority(), "thank_you") || (lastPathSegment = deeplink.getLastPathSegment()) == null || lastPathSegment.length() == 0) ? false : true;
    }

    private final boolean checkThirdCondition(Uri deeplink) {
        String queryParameter;
        return Intrinsics.d(deeplink.getAuthority(), "order_done") && (queryParameter = deeplink.getQueryParameter("number")) != null && queryParameter.length() > 0;
    }

    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators(boolean clearBackStack) {
        return e0.i(OrderDoneRefreshCartConfigurator.class, RefreshOnStartPageConfigurator.class, clearBackStack ? OrderDoneConfigurator.class : null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkFirstCondition(route.b()) || checkSecondCondition(route.b()) || checkThirdCondition(route.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        boolean booleanQueryParameter = b11.getBooleanQueryParameter("clearBackStack", true);
        String uri = b11.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        int i11 = 0;
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(uri, (String) null, (String) (0 == true ? 1 : 0), 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(R$drawable.ic_m_cross, false, null, null, null, null, 62, null), i11, 2, 0 == true ? 1 : 0), false, null, false, false, true, false, null, false, false, false, getConfigurators(booleanQueryParameter), null, null, null, false, null, null, null, false, false, null, null, 16773052, null), uri, null, null, false, 28, null);
    }
}
